package com.yw.startv;

import java.nio.ByteBuffer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.jme3.app.Application;
import com.jme3.audio.AudioStream;
import com.jme3.cinematic.Cinematic;
import com.jme3.cinematic.events.SoundEvent;
import com.yw.ffmpegj.AudioConnector;
import com.yw.ffmpegj.FFAudioData;


public class CopyOfRTSoundEvent extends SoundEvent {
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
    RingBuffer ringbuf=new RingBuffer();
    
    
	@Override
	public void initEvent(Application app, Cinematic cinematic) {
		
	}
	public final long convertTimeToSample(float time,int samplerate){
		return Math.round(time*samplerate);
	}
	
	public class RTAudioStream extends AudioStream{
		int bytepersample;
		public ByteBuffer lunch = ByteBuffer.allocate(3*2048*2*2);
		public byte[] srcsample=new byte[3*2048*2*2];
		public int samplesperframe;
		volatile long writensamples;
		double frameendtime;
		long preframeendtimetosample;
	
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
				RTAudioStream.this.bytepersample=audiodatabox.getSrcBytepersample();
				RTAudioStream.this.sampleRate=audiodatabox.getSrcSamplerate();
				RTAudioStream.this.channels=audiodatabox.getChannel();
				RTAudioStream.this.bitsPerSample=audiodatabox.getSrcBytepersample()*8;
				RTAudioStream.this.samplesperframe=audiodatabox.getTargetSamplesperframe();
				frameendtime=audiodatabox.getFrameendtime();
				preframeendtimetosample=audiodatabox.get_pts_Blurwritensample()+audiodatabox.getTargetSamplesperframe();//一帧音频总的采样数pts+nb_sample
				byte[] b=audiodatabox.getAdptobuffer().array();
				audiodatabuffer=audiodatabox.getAdptobuffer();
				
				
				bufferlock.lock();
				
				try{
					
					if(audiodatabox.get_pts_Blurwritensample()-preframeendtimetosample < convertTimeToSample(syncthresholdmin,sampleRate)){
						
					
					
					
					if(ringbuf.writeAvailable()>= sampleToByte(RTAudioStream.this.samplesperframe)){
						int auwritepos=ringbuf.writeBuffer.position();
						
						ringbuf.write(b, 0, b.length, false);
						
					}else{
						try {
							buffercondition.await();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					}	
					
				}finally{
					bufferlock.unlock();
				}
				return false;
			}

			@Override
			public ByteBuffer reusedbuffer() {
				// TODO Auto-generated method stub
				return audiodatabuffer;
			}
			
		}
		
        
		public RTAudioStream() {
			super();
			// TODO Auto-generated constructor stub
			syncthresholdmin=convertTimeToSample(0.01f,this.sampleRate);
			syncthresholdmax=convertTimeToSample(0.1f,this.sampleRate);
			aulunchtimesample=convertTimeToSample(0.05f,this.sampleRate);
			lunch=ringbuf.buffer;
		}

		/* 
		 * 每次读的采样数绝对不能小于一帧所包涵的采样数量，
		 * (non-Javadoc)
		 * @see com.jme3.audio.AudioStream#readSamples(byte[], int, int)
		 */
		@Override
		public int readSamples(byte[] buf, int offset, int length) {
			float ctime= CopyOfRTSoundEvent.this.time;
			long ctsamples=convertTimeToSample(ctime,this.sampleRate);
			bufferlock.lock();
			try{
				if(ctime==0 || ctsamples<aulunchtimesample){
					return 0;
				}
				long newreadend=ctsamples+aulunchtimesample;
				long currentneededsamples=ctsamples + aulunchtimesample-prereadendsample;
				
				ringbuf.read(srcsample, 0, sampleToByte(currentneededsamples), false);
				System.arraycopy(srcsample, sampleToByte(ctsamples-prereadendsample), buf, 0, sampleToByte(aulunchtimesample));
				prereadendsample=newreadend;
				buffercondition.signal();
				
			}finally{
				bufferlock.unlock();
			}
			return 0;
		}
		
		public final int sampleToByte(long samples){
			return (int)samples*2*bytepersample;
		}
		
		public final int sampleToByte(int samples){
			return samples*2*bytepersample;
		}

		@Override
		public void close() {
			
		}
		
	}
	
	

}
