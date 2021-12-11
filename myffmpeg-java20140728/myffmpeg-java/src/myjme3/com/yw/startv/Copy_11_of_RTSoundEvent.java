package com.yw.startv;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.jme3.app.Application;
import com.jme3.audio.AudioKey;
import com.jme3.audio.AudioNode;
import com.jme3.audio.AudioStream;
import com.jme3.cinematic.Cinematic;
import com.jme3.cinematic.events.SoundEvent;
import com.yw.ffmpegj.AudioConnector;
import com.yw.ffmpegj.AudioToolAndReccyclebin;
import com.yw.ffmpegj.Connector;
import com.yw.ffmpegj.FFAudioData;
import com.yw.ffmpegj.ToolAndRecyclebin;



/**
 * 普通的媒体文件实现音视频的完美同步
 * @author wang
 *
 */
public class Copy_11_of_RTSoundEvent extends SoundEvent {
    long prectsmple=0;
    int nosyncthreshold=10;//10秒
    long syncthresholdmin;
    long syncthresholdmax;
    float aulunchtime=0.05f;//0.05s
    float autouchtime=0;
    long prereadendsample=0;
    long aulunchtimesample;
  //  volatile boolean audioread;
    Lock bufferlock =new ReentrantLock();
    Condition buffercondition = bufferlock.newCondition();
    RingBuffer ringbuf=new RingBuffer(10*2048*2*2);
    RTAudioStream rtas;
    
	@Override
	public void initEvent(Application app, Cinematic cinematic) {
		
	}
	public final long convertTimeToSample(float time,int samplerate){
		return Math.round(time*samplerate);
	}
	
	public Copy_11_of_RTSoundEvent(){
		this.audioNode=new AudioNode();
		this.stream=true;
		rtas=new RTAudioStream();
		this.audioNode.setChannel(2);
		this.audioNode.setLooping(false);
		this.audioNode.setAudioData(rtas, new AudioKey());
		this.audioNode.setPositional(false);
		this.initialDuration=360*24*60*60;
		
	}
	
	@Override
	public void setTime(float time) {
		// TODO Auto-generated method stub
		this.time=time;
	}
	public ArrayList<AudioConnector> getAudioConnector(int count){
	    return  rtas.creatAudioConnector(count);
	}
	
	public class RTAudioStream extends AudioStream{
		/**
		 * 这个值不得超过35280 也就是立体声双声道可持续0.2秒 8820可持续0.05秒，8192*2 此值一般可以维持两帧时间  一帧为0.046秒
		 */
		float hw_buffer_size=1.0f;
		
		double audiopts=0;
		double audioptsdrift=0;
		
		int alfilltotal;
		
		
		/**
		 * al 在当前电影时间到来之前 就应该提前准备好的音频缓冲时间，这样可以确保一直保持提前亮 就不会发生音频断裂并且可以达到当前电影时间
		 * 到来时我们填充b缓冲区 a缓冲区就正在播放当前电影时间应该发生的声音 是以秒为单位的
		 */
		double autbeforect=0.1*2;
		
		
		int bytepersample;
		public ByteBuffer lunch = ByteBuffer.allocate(4*2048*2*2);
		public byte[] sampledatapool=new byte[6*2048*2*2];
		//public int samplesperframe=0;
		volatile long writensamples;
		double frameendtime;
		long preframeendtimetosample;
		int firstenter=1;
		boolean preventSecondEat=false;
		long  ntervaltime=0;
		long pktpts;
		int lasttimeresidue=0;//上一次数据还未写入到al的遗留数据
		int sampledatapooloffset=0;
		AudioToolAndReccyclebin aurecycleandtool=null;
	
		public class AudioDataBox implements AudioConnector{
          
            int connectorsrcsamplerate=0;
            
            
            int connectortargetsamplerate;
        	int connectorchannels;
        	int connectortargetbytepersample;
        	ByteBuffer connectoraudiodatabuffer;
        	int connectorsrcsamplesperframe;
        	long connectorpts_blurwritensample;//不是很准确的一个值 这个值就是pts代表了一帧音频位于整个音频文件中的第几个采样
        	double connectorframeendtime;// 这个变量代表了 播放完一帧音频 总共需要的时间 是以秒为单位的
        	long connectorpktpts;
        	
        	FFAudioData audiodata=null;
			@Override
			public void cleanData() {
				// TODO Auto-generated method stub
				
			}
			long prewrite=0;

			/*
			 * 
			 *  (non-Javadoc)
			 * @see com.yw.ffmpegj.AudioConnector#setData(com.yw.ffmpegj.FFAudioData)
			 */
			@Override
			public boolean setData(FFAudioData audiodatabox) {
				    this.audiodata=audiodatabox;
					connectoraudiodatabuffer=audiodatabox.getAdptobuffer();
				
					connectortargetbytepersample=audiodatabox.getTargetbytepersample();
			
					connectorsrcsamplerate=audiodatabox.getSrcSamplerate();
					
					connectortargetsamplerate=audiodatabox.getTargetsamplerate();
		            
					connectorchannels=audiodatabox.getChannel();
					
					connectorsrcsamplesperframe=audiodatabox.getSrcnbsamples();
					connectorframeendtime=audiodatabox.getFrameendtime();
					connectorpts_blurwritensample=audiodatabox.get_pts_Blurwritensample();
					connectorpktpts=audiodatabox.getAupktpts();
					
					
					if(RTAudioStream.this.aurecycleandtool==null){
						RTAudioStream.this.aurecycleandtool=audiodatabox.getAurecycleandtool();
					}
					
					
					
					// TODO Auto-generated constructor stub
					syncthresholdmin=convertTimeToSample(0.01f,sampleRate);
					syncthresholdmax=convertTimeToSample(0.1f,sampleRate);
					aulunchtimesample=convertTimeToSample(0.05f,sampleRate);
					return true;
				
			}

			@Override
			public ByteBuffer reusedbuffer() {
				// TODO Auto-generated method stub
				return connectoraudiodatabuffer;
			}

			@Override
			public FFAudioData getData() {
				// TODO Auto-generated method stub
				return audiodata;
			}
			
		}
		
        
		public RTAudioStream() {
			super();
			this.open=true;
			this.duration=360*24*60*60;
//	System.out.println("audiostream是否是打开的"+this.isOpen());		
			lunch=ringbuf.buffer;
		}
		
		
		public ArrayList<AudioConnector> creatAudioConnector(int count){
			ArrayList <AudioConnector>auconnectors=new ArrayList<AudioConnector>();
			for(int i=0;i<count;i++){
				AudioDataBox aubox=new AudioDataBox();
				auconnectors.add(aubox);
				
			}
			return auconnectors;
		}
		int test=0;

		/* 
		 * 每次读的采样数绝对不能小于一帧所包涵的采样数量，
		 * (non-Javadoc)
		 * @see com.jme3.audio.AudioStream#readSamples(byte[], int, int)
		 */
		@Override
		public int readSamples(byte[] buf, int offset, int length) {
			
			/*if(audioptsdrift==0){
				audioptsdrift=0-starttime;
			}
			*/
			double nextaudiopts;
			
			AudioDataBox audatabox;
			int alreadedsize=0;
			int albeginoffset=0;
			int allowsleeptime=5;
			
			int needfillbyte=0;
			int everygotbyte=0;//每次获取的音频数据的字节数
			
			 double  al_sub_ct=0;//就是al数据总计时间与当前电影时间之差
			 double residuediff=0;
			 
			 double currentctime=0;
			
			if(firstenter<6){//一开始要五个缓冲区都填满 为了跳过一开始的四个 直接在最后一次填充上的我的数据
				firstenter++;
				//return 0;
			}
			
			if(this.aurecycleandtool==null){
				while(aurecycleandtool==null){
					try {
						Thread.sleep((long)0.1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			
			
			if(preventSecondEat){
				preventSecondEat=false;
				return 0;
			}
			
			double starttime=System.nanoTime()/1000000000.0;
			if(audioptsdrift==0){
				audioptsdrift=0-starttime;
			}
			
			if(lasttimeresidue!=0){
				if(lasttimeresidue<buf.length){
				this.copyArrayToALArray(sampledatapool, sampledatapooloffset, buf, albeginoffset, lasttimeresidue);
				albeginoffset+=lasttimeresidue;
				alreadedsize+=lasttimeresidue;
				alfilltotal+=lasttimeresidue;
				lasttimeresidue=0;
				sampledatapooloffset=0;
				}else{
					this.copyArrayToALArray(sampledatapool, sampledatapooloffset, buf, albeginoffset, buf.length);
					lasttimeresidue-=buf.length;
					alfilltotal+=buf.length;
					sampledatapooloffset+=buf.length;
					return buf.length;
					
				}
				
			}
			
			double startctime= Copy_11_of_RTSoundEvent.this.time;
			
System.out.println("理论上当前的电影时间 "+startctime);

            boolean firstcome=true;
			do{
				
				  AudioDataBox databox=null;
				
				        if(alfilltotal==0){
				        	
				        	databox=getConnector();
				        	
				        	this.sampleRate=databox.connectortargetsamplerate;
							this.bitsPerSample=databox.connectortargetbytepersample*8;
							this.channels=databox.connectorchannels;
						//	this.samplesperframe=audatabox.connectorsrcsamplesperframe;
						    this.bytepersample=databox.connectortargetbytepersample;
						    this.pktpts=databox.connectorpktpts;
						    alfilltotal= -timeToByte(2.0);
						    
						   
				       }
				        
				       
				
					 
					    currentctime= Copy_11_of_RTSoundEvent.this.time;
					    
					    
						
					   double cdiff =	currentctime-startctime;
					
					
					    double internaltime=System.nanoTime()/1000000000.0;
					    
					    double sdiff=internaltime-starttime;	
					    
					    if(cdiff-sdiff<0){
					    	currentctime=startctime+sdiff;
			    //	System.out.println("通过计算时间的差值的当前电影时间"+currentctime);
					    }
					/*    
					if(currentctime<0){
						 currentctime=0;
					 }
					
				*/
					    
					    double  newctime=Copy_11_of_RTSoundEvent.this.time;
					    
						
						if(firstenter<6){
							if(newctime<0){
						    	newctime=0;
						    }
						}  
					    
					    
					 
					 //al_sub_ct=  ((alfilltotal*1.0)/(sampleRate*channels*bytepersample))-currentctime;
	al_sub_ct=  ((alfilltotal*1.0)/(sampleRate*channels*bytepersample))-newctime;
	//System.out.println("通过当前电影时间计算出的需要填充的时间"+al_sub_ct);				 
					 if( al_sub_ct < autbeforect){
						needfillbyte=timeToByte(autbeforect-al_sub_ct);//如果差值超过了提前亮 就等于提前亮
	//System.out.println("---------最终需要的填充的时间"+(autbeforect-al_sub_ct));					
	//System.out.println("计算出的需要填充的字节数"+needfillbyte);					
					}else{
						
	System.out.println("！！！！！！！我返回了");					
				    	return 0;
				    }
				
				if(needfillbyte > (buf.length-alreadedsize)){//防止需要的字节数超越了al数组所能容纳 的剩余的字节长度
					needfillbyte=buf.length-alreadedsize;
				}
				
				if(databox==null){
					databox=getConnector();
					
					this.sampleRate=databox.connectortargetsamplerate;
					this.bitsPerSample=databox.connectortargetbytepersample*8;
					this.channels=databox.connectorchannels;
				//	this.samplesperframe=audatabox.connectorsrcsamplesperframe;
				    this.bytepersample=databox.connectortargetbytepersample;
				    this.pktpts=databox.connectorpktpts;
				   
				}
				
				 if(firstcome){
			        	
		        	 audiopts=((databox.connectorpts_blurwritensample+databox.connectorsrcsamplesperframe)*1.0/databox.connectorsrcsamplerate)-(2.0*hw_buffer_size)+0.16; 
					
	System.out.println("音频的pts"+audiopts);	 			
				   
	residuediff=audiopts-newctime; 
				     
				     
	System.out.println("剩余差值"+residuediff);     
				     firstcome=false;
		        	
		        }	
					
				if(firstenter<6){
					residuediff=0;
				}
					  
				
				int audiosize=  this.aurecycleandtool.getSyncedAudioByGivenArray(databox, residuediff, sampledatapool);
				
				
				 
				double counteractdiff=byteToTime(sampleToByte(databox.connectorsrcsamplesperframe)-audiosize);//抵消的diff
				
				residuediff+=counteractdiff;
				
				
				 everygotbyte=audiosize;
				 if(audiosize<=needfillbyte){
					 // audiopts=((audatabox.connectorpts_blurwritensample+audatabox.connectorsrcsamplesperframe)*1.0/audatabox.connectorsrcsamplerate)-autbeforect;  
				      this.copyArrayToALArray(sampledatapool, sampledatapooloffset, buf, albeginoffset, audiosize);
				      albeginoffset+=audiosize;
				      alreadedsize+=audiosize;
				  	  alfilltotal+=audiosize;
				      sampledatapooloffset=0;
				      lasttimeresidue=0;
				  }	else if(audiosize>needfillbyte){
					  
					//  audiopts=((audatabox.connectorpts_blurwritensample+audatabox.connectorsrcsamplesperframe)*1.0/audatabox.connectorsrcsamplerate)-2*hw_buffer_size/(channels*audatabox.connectorsrcsamplerate*4);
					
					 
					  // audiopts=(audatabox.connectorpts_blurwritensample+audatabox.connectorsrcsamplesperframe)*1.0/audatabox.connectorsrcsamplerate;
					  
					
					 
					  int need=needfillbyte;
					  this.copyArrayToALArray(sampledatapool, sampledatapooloffset, buf, albeginoffset, need);
					  //albeginoffset=0;
					  alreadedsize+=need;
					  alfilltotal+=need;
					  sampledatapooloffset+=need;
					  lasttimeresidue=audiosize-need;
					  
					  
				  }
				  
				
		   
				// audioptsdrift = audiopts-internaltime;
				  
					this.aurecycleandtool.recycle(databox);
					
					
				
				
				
			
			}while(allowsleeptime>0 && everygotbyte<needfillbyte);
			
			
			if(alreadedsize==buf.length){
				
				preventSecondEat=false;
			}else{
				preventSecondEat=true;
			}
			
			
	System.out.println("-----------------alreadedsize="+alreadedsize);	
			
			return alreadedsize;
			
			
	
		}
		
		public final int sampleToByte(long samples){
			return (int)samples*bytepersample*channels;
		}
		
		public final int sampleToByte(int samples){
			return samples*bytepersample*channels;
		}
		public final int byteToSample(int bytes){
			return bytes/bytepersample/channels;
		}
		public double byteToTime(int bytes){
			return bytes*1.0/(channels*sampleRate);
		}
		
		public final int timeToByte(double time){
			int size=Math.round((float)time * sampleRate* bytepersample*channels);
			return size+=size%2;
		}
		
		public void copyArrayToALArray(byte[] src,int srcoffset,byte[]dest,int destoffset,int length){
			System.arraycopy(src, srcoffset, dest, destoffset, length);
		}
		
		/*public long realSamples(long framepts){
			return (framepts+syncthresholdmin)/samplesperframe*samplesperframe;
		}*/
		
        public AudioDataBox getConnector(){
        	while(true){
        		Connector c=this.aurecycleandtool.getfilledConnector();
        		if(c!=null){
        			return (AudioDataBox)c;
        		}
        		else{
				  System.out.println("al 等待对接体");
				  try {
					Thread.sleep(1);
					
				  } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//allowsleeptime--;
			}
			
        	}
        	 
				
        	
        }
		@Override
		public void close() {
			
		}
		
	}
	
	//因为过期没吃到东西和没有吃饱 都说明buffer内的数据应该被全部读取出来了 这个时候frameend应该是上一次
	//读结束位置 
	

}
