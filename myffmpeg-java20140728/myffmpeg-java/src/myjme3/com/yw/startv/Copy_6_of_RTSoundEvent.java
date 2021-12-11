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



public class Copy_6_of_RTSoundEvent extends SoundEvent {
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
	
	public Copy_6_of_RTSoundEvent(){
		this.audioNode=new AudioNode();
		this.stream=true;
		rtas=new RTAudioStream();
		this.audioNode.setChannel(2);
		this.audioNode.setLooping(false);
		this.audioNode.setAudioData(rtas, new AudioKey());
		this.audioNode.setPositional(false);
		this.initialDuration=360*24*60*60;
	}
	
	public ArrayList<AudioConnector> getAudioConnector(int count){
	    return  rtas.creatAudioConnector(count);
	}
	
	public class RTAudioStream extends AudioStream{
		int bytepersample;
		public ByteBuffer lunch = ByteBuffer.allocate(4*2048*2*2);
		public byte[] sampledatapool=new byte[4*2048*2*2];
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
					
					connectorsrcsamplesperframe=audiodatabox.getTargetSamplesperframe();
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
			long starttime=System.currentTimeMillis();
			AudioDataBox audatabox;
			int alreadedsize=0;
			int albeginoffset=0;
			int allowsleeptime=5;
			/*if(firstenter<4){//一开始要五个缓冲区都填满 为了跳过一开始的四个 直接在最后一次填充上的我的数据
				firstenter++;
				return 0;
			}*/
			
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
			
			float currentctime= Copy_6_of_RTSoundEvent.this.time;
			System.out.println("当前电影时间是："+currentctime);
			
			if(lasttimeresidue!=0){
				this.copyArrayToALArray(sampledatapool, sampledatapooloffset, buf, albeginoffset, lasttimeresidue);
				albeginoffset+=lasttimeresidue;
				alreadedsize+=lasttimeresidue;
				lasttimeresidue=0;
				sampledatapooloffset=0;
				
			}
			
			do{
				
				Connector c=this.aurecycleandtool.getfilledConnector();
				if(c==null){
					System.out.println("al 等待对接体");
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					allowsleeptime--;
				}
				else{
				
					audatabox=(AudioDataBox)c;
					this.sampleRate=audatabox.connectortargetsamplerate;
					this.bitsPerSample=audatabox.connectortargetbytepersample*8;
					this.channels=audatabox.connectorchannels;
				//	this.samplesperframe=audatabox.connectorsrcsamplesperframe;
				    this.bytepersample=audatabox.connectortargetbytepersample;
				    this.pktpts=audatabox.connectorpktpts;
				//System.out.println("当前音频帧的pts是"+pktpts);
				
				
				  int audiosize=  this.aurecycleandtool.getSyncedAudioByGivenArray(audatabox, (audatabox.connectorpts_blurwritensample*1.0/audatabox.connectorsrcsamplerate)-currentctime, sampledatapool);
				  if(alreadedsize+audiosize<=buf.length){
				  this.copyArrayToALArray(sampledatapool, sampledatapooloffset, buf, albeginoffset, audiosize);
				  albeginoffset+=audiosize;
				  alreadedsize+=audiosize;
				  sampledatapooloffset=0;
				  lasttimeresidue=0;
				  }	else if(alreadedsize+audiosize>buf.length){
					  int need=buf.length-alreadedsize;
					  this.copyArrayToALArray(sampledatapool, sampledatapooloffset, buf, albeginoffset, need);
					  albeginoffset=0;
					  alreadedsize=buf.length;
					  sampledatapooloffset+=need;
					  lasttimeresidue=audiosize-need;
					  
					  
				  }
				  
					this.aurecycleandtool.recycle(audatabox);
					
					
				}
			
			}while(allowsleeptime>0 && (alreadedsize< buf.length));
			
			if(alreadedsize==buf.length){
				
				preventSecondEat=false;
			}else{
				preventSecondEat=true;
			}
			
			long endtime=System.currentTimeMillis();
			long timediff=endtime-starttime;
			System.out.println("读采样方法消耗的时间是：  "+timediff);
			
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
		
		public void copyArrayToALArray(byte[] src,int srcoffset,byte[]dest,int destoffset,int length){
			System.arraycopy(src, srcoffset, dest, destoffset, length);
		}
		
		/*public long realSamples(long framepts){
			return (framepts+syncthresholdmin)/samplesperframe*samplesperframe;
		}*/
		

		@Override
		public void close() {
			
		}
		
	}
	
	//因为过期没吃到东西和没有吃饱 都说明buffer内的数据应该被全部读取出来了 这个时候frameend应该是上一次
	//读结束位置 

}
