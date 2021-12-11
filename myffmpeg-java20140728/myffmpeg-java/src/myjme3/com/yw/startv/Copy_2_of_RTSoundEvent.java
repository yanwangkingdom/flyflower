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
import com.yw.ffmpegj.FFAudioData;



public class Copy_2_of_RTSoundEvent extends SoundEvent {
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
    RingBuffer ringbuf=new RingBuffer(4*2048*2*2);
    RTAudioStream rtas;
    
	@Override
	public void initEvent(Application app, Cinematic cinematic) {
		
	}
	public final long convertTimeToSample(float time,int samplerate){
		return Math.round(time*samplerate);
	}
	
	public Copy_2_of_RTSoundEvent(){
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
		public byte[] srcsample=new byte[4*2048*2*2];
		public int samplesperframe;
		volatile long writensamples;
		double frameendtime;
		long preframeendtimetosample;
		int firstenter=1;
		boolean preventSecondEat=false;
	
		public class AudioDataBox implements AudioConnector{
            ByteBuffer audiodatabuffer=null;
			@Override
			public void cleanData() {
				// TODO Auto-generated method stub
				
			}

			/*
			 * 
			 *  (non-Javadoc)
			 * @see com.yw.ffmpegj.AudioConnector#setData(com.yw.ffmpegj.FFAudioData)
			 */
			@Override
			public boolean setData(FFAudioData audiodatabox) {
				// TODO Auto-generated method stub
				
				
				
				
				
				bufferlock.lock();
				
				try{
					
					audiodatabuffer=audiodatabox.getAdptobuffer();
					System.out.println("audiobuffer.limit"+audiodatabuffer.limit());
					audiodatabuffer.get(srcsample,0,audiodatabuffer.capacity());
					
					
					
					
					
					RTAudioStream.this.bytepersample=audiodatabox.getSrcBytepersample();
					RTAudioStream.this.sampleRate=audiodatabox.getSrcSamplerate();
					RTAudioStream.this.channels=audiodatabox.getChannel();
					RTAudioStream.this.bitsPerSample=audiodatabox.getSrcBytepersample()*8;
					RTAudioStream.this.samplesperframe=audiodatabox.getTargetSamplesperframe();
					frameendtime=audiodatabox.getFrameendtime();
					
					// TODO Auto-generated constructor stub
					syncthresholdmin=convertTimeToSample(0.01f,sampleRate);
					syncthresholdmax=convertTimeToSample(0.1f,sampleRate);
					aulunchtimesample=convertTimeToSample(0.05f,sampleRate);
					
					
					float currentctime= Copy_2_of_RTSoundEvent.this.time;
					long currentctsamples=convertTimeToSample(currentctime,sampleRate);
					
					
					long currentframeendsample=audiodatabox.get_pts_Blurwritensample()+audiodatabox.getTargetSamplesperframe();
					
					if(currentctsamples-(currentframeendsample)>syncthresholdmin){//判断当前帧是否已经被电影时间超越 这个时刻的电影时间是否已经超越了设置进来的这一阵
			System.out.println(audiodatabox.get_pts_Blurwritensample()+"当前帧超越了电影时间此帧作废 ");			
						
						if(audiodatabox.get_pts_Blurwritensample()-preframeendtimetosample >convertTimeToSample(syncthresholdmin,sampleRate)){
							 System.out.println("超时并且丢帧了");
						 }
						
						ringbuf.rewind();
						ringbuf.write(srcsample, 0, audiodatabuffer.capacity(), false);
						ringbuf.readBuffer.position(ringbuf.writeBuffer.position());
						ringbuf.writeAhead = false;
						if(currentframeendsample>prereadendsample){
							prereadendsample=currentframeendsample;
						}
						
						
						
						
					}
					
					else if(audiodatabox.get_pts_Blurwritensample()-preframeendtimetosample < convertTimeToSample(syncthresholdmin,sampleRate)){//判断是否丢帧 如果两者之差小于441 证明没有丢帧 两者是连续的
						
					
					
					
					if(ringbuf.writeAvailable()>= sampleToByte(RTAudioStream.this.samplesperframe)){
						
				System.out.println(audiodatabox.get_pts_Blurwritensample()+"当前帧成功被写入");		
						int auwritepos=ringbuf.writeBuffer.position();
						
						ringbuf.write(srcsample, 0, audiodatabuffer.capacity(), false);
						
					}else{
						try {
		System.out.println(audiodatabox.get_pts_Blurwritensample()+"当前帧没有丢帧但是写有效少对接体开始等待");
							buffercondition.await();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
					
					
					}
					else if(audiodatabox.get_pts_Blurwritensample()-preframeendtimetosample >convertTimeToSample(syncthresholdmin,sampleRate)){//这是丢帧的情况
			System.out.println("丢帧了");
						if(ringbuf.writeAvailable()>= sampleToByte(RTAudioStream.this.samplesperframe)){
							int auwritepos=ringbuf.writeBuffer.position();
							
							ringbuf.write(srcsample, 0, audiodatabuffer.capacity(), false);
							
						}else{
							try {
			System.out.println(audiodatabox.get_pts_Blurwritensample()+"丢帧中的对接体开始等待");
								buffercondition.await();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					
					
					preframeendtimetosample=audiodatabox.get_pts_Blurwritensample()+audiodatabox.getTargetSamplesperframe();//一帧音频总的采样数pts+nb_sample就是上一阵的结束采样
					
				}finally{
					bufferlock.unlock();
				}
				return true;
			}

			@Override
			public ByteBuffer reusedbuffer() {
				// TODO Auto-generated method stub
				return audiodatabuffer;
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
//	System.out.println(RTSoundEvent.this.time+"我来读数据了");		
			if(firstenter<5){//一开始要五个缓冲区都填满 为了跳过一开始的四个 直接在最后一次填充上的我的数据
				firstenter++;
				return 0;
			}
			if(preventSecondEat){
				preventSecondEat=false;
				return 0;
			}
			
			float currentctime= Copy_2_of_RTSoundEvent.this.time;
			if(preframeendtimetosample==0||currentctime==0.0){
			       
				return 0;
			}
			
			long currentctsamples=convertTimeToSample(currentctime,this.sampleRate);
	System.out.println("当前的电影时间采样"+currentctsamples);		
			bufferlock.lock();
			try{
				if(ringbuf.readAvailable()==0){
					return 0;
				}
			
				int readAvailable=ringbuf.readAvailable();
System.out.println("读有效的字节数数"+readAvailable);

				long newreadend=currentctsamples+aulunchtimesample;
				
				if(currentctsamples<=prereadendsample){
					System.out.println(prereadendsample);
		System.out.println("当前电影时间小于等于了上一阵的读结束采样"+test++);			
				}
				
				long currentneededsamples=currentctsamples + aulunchtimesample-prereadendsample;
				
				
	System.out.println("上次读的结束采样"+prereadendsample);			
				if(currentctsamples>preframeendtimetosample){//eatnothing 这时因为当前时间超越了已写入的帧，就是已写入的帧已经过期了 所以就不吃
	//	System.out.println(currentctsamples+"根本就没有吃");	
					
					//prereadendsample=currentctsamples;
					prereadendsample=preframeendtimetosample;
		//System.out.println(currentctsamples+"没拿对接体被唤醒");			
					buffercondition.signal();
					return 0;
				}
				if(byteToSample(readAvailable)<currentneededsamples){//eatunfull 需要的多，有效的少的情况
	//	System.out.println(currentctsamples+"没有吃饱");				
					
					ringbuf.read(srcsample, 0, readAvailable, false);
					long diff=currentctsamples-prereadendsample;//这个是当前时间以前的 需要跳过的不需要的部分
					long srcoffset=diff-1<0?0:diff-1;
		
				//	System.out.println("当前电影时间采样"+currentctsamples+"上一阵读的结束采样"+prereadendsample+"这次需要读的采样"+diff+"读有效个数"+ringbuf.readAvailable()+"src数组的容量"+srcsample.length+"上一阵的结束采样"+preframeendtimetosample);			
				
					copyArrayToALArray(srcsample,sampleToByte(srcoffset),buf,0, readAvailable-sampleToByte(diff));
				
					prereadendsample=preframeendtimetosample;
					
					preventSecondEat=true;
				
					buffercondition.signal();
					
					return  readAvailable-sampleToByte(diff);
					
				}else{//eatfull一次性可以拿到我们需要的数据有效的大于等于我们需要的采样
		System.out.println(currentctsamples+"完全吃饱");	
		System.out.println("当前需要的帧数"+currentneededsamples+"数组中的容量"+srcsample.length);
					ringbuf.read(srcsample, 0, sampleToByte(currentneededsamples), false);
					long diff=currentctsamples-prereadendsample;
					long srcoffset=diff-1<0?0:diff-1;
					copyArrayToALArray(srcsample,sampleToByte(srcoffset),buf,0,  sampleToByte(currentneededsamples)-sampleToByte(diff));
					if(newreadend>preframeendtimetosample){//保证
						prereadendsample=preframeendtimetosample;
					}else{
						prereadendsample=newreadend;
					}
					
					buffercondition.signal();
					preventSecondEat=true;
				    return sampleToByte(currentneededsamples)-sampleToByte(diff);
				}
				
	
			}finally{
				
				bufferlock.unlock();
			}
		
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
		
		public long realSamples(long framepts){
			return (framepts+syncthresholdmin)/samplesperframe*samplesperframe;
		}
		

		@Override
		public void close() {
			
		}
		
	}
	
	

}
