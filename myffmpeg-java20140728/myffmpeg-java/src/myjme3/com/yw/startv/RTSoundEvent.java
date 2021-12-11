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
import com.jme3.cinematic.PlayState;
import com.jme3.cinematic.events.SoundEvent;
import com.yw.ffmpegj.AudioConnector;
import com.yw.ffmpegj.AudioToolAndReccyclebin;
import com.yw.ffmpegj.Connector;
import com.yw.ffmpegj.FFAudioData;
import com.yw.ffmpegj.ToolAndRecyclebin;



public class RTSoundEvent extends SoundEvent {
	
	 static final boolean audiodebug = Boolean.getBoolean("ffmpegj.audiodebug");
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
    double eqer=0;//0.135;//-0.05;
    
	public void setEqer(double eqer) {
		this.eqer = eqer;
	}
	@Override
	public void initEvent(Application app, Cinematic cinematic) {
		
	}
	public final long convertTimeToSample(float time,int samplerate){
		return Math.round(time*samplerate);
	}
	
	public RTSoundEvent(){
		this.audioNode=new AudioNode();
		this.audioNode.setVolume(2.0f);
		this.stream=true;
		rtas=new RTAudioStream();
		this.audioNode.setChannel(-1);//这个管道不是立体声的管道 自己不能随便调用 在lwjglaudiorender play方法中分配一个与底层关联的通道号
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
	
	
	
	
	@Override
	public void onPlay() {
		// TODO Auto-generated method stub
		super.onPlay();
System.out.println("音频开始播放了 当前时间是："+this.time);		
	}
	/* (non-Javadoc)
	 * @see com.jme3.cinematic.events.SoundEvent#onStop()
	 * audionode.stop->lwjglaudiorender-stopsource 在stopsource方法里 首先把audionode的状态设置成stoped
	 * 清除掉和al的绑定 如果流是open的 调用audiostream的close方法  然后清除数据
	 * 
	 */
	@Override
	public void onStop() {
		// TODO Auto-generated method stub
	    
		  this.audioNode.stop();
		System.out.println("音频停止了");
	}
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
System.out.println("音频onpause 当前电影时间"+this.time);		
	}




	/**
	 * 在lwjglaudiorender中fillbuf中 从audioStream得到采样率 每个采样多少位
	 * @author wang
	 * 
	 * 采样率 每个采样位数 通道数 这三个成员变量 在readsample方法中 被赋值 在引擎启动之前 电影无论如何不能开始
	 * 起码声音必须做到这一点
	 *
	 */
	public class RTAudioStream extends AudioStream{
		/**
		 * 这个值不得超过35280 也就是立体声双声道可持续0.2秒 8820可持续0.05秒，8192*2 此值一般可以维持两帧时间  一帧为0.046秒
		 */
		boolean  isrealtime=false;
		//float hw_buffer_size=1.0f;以前设置的
		float hw_buffer_size=0.5f;
		
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
		public byte[] sampledatapool=new byte[35280*7];
		byte [] muteaudiodata=new byte[35280];
		//public int samplesperframe=0;
		volatile long writensamples;
		double frameendtime;
		long preframeendtimetosample;
		int firstenter=0;
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
						isrealtime=RTAudioStream.this.aurecycleandtool.isrealtime();
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

			@Override
			public void reNew() {
				// TODO Auto-generated method stub
				

	            connectorsrcsamplerate=0;
	            
	            
	            connectortargetsamplerate=0;
	        	connectorchannels=0;
	        	connectortargetbytepersample=0;
	        	
	            connectorsrcsamplesperframe=0;
	            connectorpts_blurwritensample=0;//不是很准确的一个值 这个值就是pts代表了一帧音频位于整个音频文件中的第几个采样
	        	connectorframeendtime=0;// 这个变量代表了 播放完一帧音频 总共需要的时间 是以秒为单位的
	        	connectorpktpts=0;
	        	
				if(audiodata!=null){
					audiodata.getPointersWithbuffers().clean();
					audiodata=null;
				}
				
				aurecycleandtool=null;
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
		//System.out.println("al 来数据了readsamples 来了");	
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
			 
			 double filllasttimeresidueneedtime=0;
			
			if(firstenter<6){//一开始要五个缓冲区都填满 为了跳过一开始的四个 直接在最后一次填充上的我的数据
				firstenter++;
				
			}
			
			if(this.aurecycleandtool==null){
			
				while(aurecycleandtool==null){
	System.out.println("在readsample方法中的音频回收工具为null导致线程sleep"+RTSoundEvent.this.time);				
					try {
						Thread.sleep((long)0.1);
								
						return 0;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				throw new RuntimeException("readsample中 音频回收工具为null");			
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
				filllasttimeresidueneedtime=byteToTime(lasttimeresidue);
				}else{
					this.copyArrayToALArray(sampledatapool, sampledatapooloffset, buf, albeginoffset, buf.length);
					lasttimeresidue-=buf.length;
					alfilltotal+=buf.length;
					sampledatapooloffset+=buf.length;
				
					return buf.length;
					
				}
				
			}
			
			double startctime= RTSoundEvent.this.time;
			
			/*if(audiodebug)
			
            System.out.println("理论上当前的电影时间 "+startctime);*/

            boolean firstcome=true;
			do{
				
				  AudioDataBox databox=null;
				
				        if(alfilltotal==0){
				        	
				        	if(!aurecycleandtool.isAudiofinished()){
				        		databox=getConnector();
				        	}else{
			System.out.println("音频已经结束了 我要结束readsamples方法当前时间是"+RTSoundEvent.this.time);       		
				        		break;
				        	}
				        	
				        	
				        	
				        	this.sampleRate=databox.connectortargetsamplerate;
							this.bitsPerSample=databox.connectortargetbytepersample*8;
							this.channels=databox.connectorchannels;
						//	this.samplesperframe=audatabox.connectorsrcsamplesperframe;
						    this.bytepersample=databox.connectortargetbytepersample;
						  //  this.pktpts=databox.connectorpktpts;
						    alfilltotal= -timeToByte(2.0);
						    
						   
				       }
				        
				       
				
					 
					    currentctime= RTSoundEvent.this.time;
					    
					    
						
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
					    
					    double  newctime=RTSoundEvent.this.time;
					//  System.out.println("当前音频事件中的时间是"+newctime);	
						
						if(firstenter<6){
							if(newctime<0){
						    	newctime=0;
						    }
							
						
						}  
					    
					    
					 
					
	al_sub_ct=  ((alfilltotal*1.0)/(sampleRate*channels*bytepersample))-newctime;
	//System.out.println("通过当前电影时间计算出的需要填充的时间"+al_sub_ct);				 
					 if( al_sub_ct < autbeforect){
						needfillbyte=timeToByte(autbeforect-al_sub_ct);//如果差值超过了提前亮 就等于提前亮
	//System.out.println("---------最终需要的填充的时间"+(autbeforect-al_sub_ct));					
	//System.out.println("计算出的需要填充的字节数"+needfillbyte);					
					}else{
						/*if(audiodebug)
						
	                    System.out.println("！！！！！！！我返回了");					
				    	return 0;*/
						needfillbyte=timeToByte(autbeforect);
						
				    }
				
				if(needfillbyte > (buf.length-alreadedsize)){//防止需要的字节数超越了al数组所能容纳 的剩余的字节长度
					needfillbyte=buf.length-alreadedsize;
				}
				
				if(databox==null){
					if(!aurecycleandtool.isAudiofinished()){
		        		databox=getConnector();
		        	}else{
		  //  System.out.println("音频已经结束了 我要结束readsamples方法当前时间是"+RTSoundEvent.this.time);    		
		        		break;
		        	}
					
					this.sampleRate=databox.connectortargetsamplerate;
					this.bitsPerSample=databox.connectortargetbytepersample*8;
					this.channels=databox.connectorchannels;
				//	this.samplesperframe=audatabox.connectorsrcsamplesperframe;
				    this.bytepersample=databox.connectortargetbytepersample;
				    this.pktpts=databox.connectorpktpts;
				   
				}
				
				 if(firstcome){
			        	
		        	audiopts=((databox.connectorpts_blurwritensample+databox.connectorsrcsamplesperframe)*1.0/databox.connectorsrcsamplerate)-(2.0*hw_buffer_size)+eqer; 
					// audiopts=((databox.connectorpts_blurwritensample)*1.0/databox.connectorsrcsamplerate)-(2.0*hw_buffer_size)+0.2; 	
	if(audiodebug)
	//System.out.println("音频的pts"+audiopts);	 			
		            
	                 residuediff=audiopts-filllasttimeresidueneedtime-newctime; 
				     
	if(audiodebug)
	System.out.println("剩余差值"+residuediff);     
				     firstcome=false;
		        	
		        }	
					
				if(firstenter<6){
					 eqer=-(audiopts-newctime)/2;
					residuediff=0.0;
				}
					  
				/*if(firstenter==6){
					eqer=-(audiopts-newctime)/2;
					//residuediff=0.0;
					firstenter++;
				}*/
				
				double diff=residuediff;
				
				 int audiosize =  this.aurecycleandtool.getSyncedAudioByGivenArray(databox, diff, sampledatapool);
				
			//	System.out.println("dlt 的值是：--------------"+aurecycleandtool.getDltdiff());
				 
				//double counteractdiff=byteToTime(sampleToByte(databox.connectorsrcsamplesperframe)-audiosize);//抵消的diff
				//double counteractdiff=(databox.connectorsrcsamplesperframe*0.1/databox.connectorsrcsamplerate)-(byteToTime(audiosize));//这个地方是以元采样率的基础上转换的时间减去目标采样率的采样时间 计算出的diff
				//System.out.println("加之前residuediff的值："+  residuediff+"  + "+aurecycleandtool.getDltdiff());
				residuediff+=aurecycleandtool.getDltdiff();
		//System.out.println("加之后residuediff===================="+residuediff);		
				
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
					  
					
					  int need=needfillbyte;
					  this.copyArrayToALArray(sampledatapool, sampledatapooloffset, buf, albeginoffset, need);
					
					  alreadedsize+=need;
					  alfilltotal+=need;
					  sampledatapooloffset+=need;
					  lasttimeresidue=audiosize-need;
					  
					  
				  }
				  
				
		   
				// audioptsdrift = audiopts-internaltime;
				  
					this.aurecycleandtool.recycle(databox);
					
					
				
				
				
			
			}while(allowsleeptime>0 && everygotbyte<needfillbyte);
			if(lasttimeresidue==0 && aurecycleandtool.isAudiofinished()){
				
				copyArrayToALArray(muteaudiodata,0,buf,0,muteaudiodata.length);
				alreadedsize=muteaudiodata.length;
			}
			
			if(alreadedsize==buf.length){
				
				preventSecondEat=false;
			}else{
				preventSecondEat=true;
			}
			
			if(audiodebug)
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
        			//if(audiodebug)
			 //System.out.println("al 等待对接体 对接体为null 导致线程sleep");
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
		/* (non-Javadoc)
		 * @see com.jme3.audio.AudioStream#close()
		 * soundevent的onstop-》audinode的stop-》audiostream的close
		 */
		@Override
		public void close() {
	System.out.println("调用了音频事件的close方法"+RTSoundEvent.this.time+"状态"+RTSoundEvent.this.playState);
			firstenter=0;
			preventSecondEat=false;
			lasttimeresidue=0;
			sampledatapooloffset=0;
			alfilltotal=0;
			//aurecycleandtool=null;
			//在readsample方法中 给rtaudiostream的三个成员变量 采样率 采样位 通道 在这里没有归0 以后如果出现错误 在写相应的代码
		}
		
	}
	
}
