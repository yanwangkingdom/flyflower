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
    int nosyncthreshold=10;//10��
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
					
					if(currentctsamples-(currentframeendsample)>syncthresholdmin){//�жϵ�ǰ֡�Ƿ��Ѿ�����Ӱʱ�䳬Խ ���ʱ�̵ĵ�Ӱʱ���Ƿ��Ѿ���Խ�����ý�������һ��
			System.out.println(audiodatabox.get_pts_Blurwritensample()+"��ǰ֡��Խ�˵�Ӱʱ���֡���� ");			
						
						if(audiodatabox.get_pts_Blurwritensample()-preframeendtimetosample >convertTimeToSample(syncthresholdmin,sampleRate)){
							 System.out.println("��ʱ���Ҷ�֡��");
						 }
						
						ringbuf.rewind();
						ringbuf.write(srcsample, 0, audiodatabuffer.capacity(), false);
						ringbuf.readBuffer.position(ringbuf.writeBuffer.position());
						ringbuf.writeAhead = false;
						if(currentframeendsample>prereadendsample){
							prereadendsample=currentframeendsample;
						}
						
						
						
						
					}
					
					else if(audiodatabox.get_pts_Blurwritensample()-preframeendtimetosample < convertTimeToSample(syncthresholdmin,sampleRate)){//�ж��Ƿ�֡ �������֮��С��441 ֤��û�ж�֡ ������������
						
					
					
					
					if(ringbuf.writeAvailable()>= sampleToByte(RTAudioStream.this.samplesperframe)){
						
				System.out.println(audiodatabox.get_pts_Blurwritensample()+"��ǰ֡�ɹ���д��");		
						int auwritepos=ringbuf.writeBuffer.position();
						
						ringbuf.write(srcsample, 0, audiodatabuffer.capacity(), false);
						
					}else{
						try {
		System.out.println(audiodatabox.get_pts_Blurwritensample()+"��ǰ֡û�ж�֡����д��Ч�ٶԽ��忪ʼ�ȴ�");
							buffercondition.await();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
					
					
					}
					else if(audiodatabox.get_pts_Blurwritensample()-preframeendtimetosample >convertTimeToSample(syncthresholdmin,sampleRate)){//���Ƕ�֡�����
			System.out.println("��֡��");
						if(ringbuf.writeAvailable()>= sampleToByte(RTAudioStream.this.samplesperframe)){
							int auwritepos=ringbuf.writeBuffer.position();
							
							ringbuf.write(srcsample, 0, audiodatabuffer.capacity(), false);
							
						}else{
							try {
			System.out.println(audiodatabox.get_pts_Blurwritensample()+"��֡�еĶԽ��忪ʼ�ȴ�");
								buffercondition.await();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					
					
					preframeendtimetosample=audiodatabox.get_pts_Blurwritensample()+audiodatabox.getTargetSamplesperframe();//һ֡��Ƶ�ܵĲ�����pts+nb_sample������һ��Ľ�������
					
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
//	System.out.println("audiostream�Ƿ��Ǵ򿪵�"+this.isOpen());		
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
		 * ÿ�ζ��Ĳ��������Բ���С��һ֡�������Ĳ���������
		 * (non-Javadoc)
		 * @see com.jme3.audio.AudioStream#readSamples(byte[], int, int)
		 */
		@Override
		public int readSamples(byte[] buf, int offset, int length) {
//	System.out.println(RTSoundEvent.this.time+"������������");		
			if(firstenter<5){//һ��ʼҪ��������������� Ϊ������һ��ʼ���ĸ� ֱ�������һ������ϵ��ҵ�����
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
	System.out.println("��ǰ�ĵ�Ӱʱ�����"+currentctsamples);		
			bufferlock.lock();
			try{
				if(ringbuf.readAvailable()==0){
					return 0;
				}
			
				int readAvailable=ringbuf.readAvailable();
System.out.println("����Ч���ֽ�����"+readAvailable);

				long newreadend=currentctsamples+aulunchtimesample;
				
				if(currentctsamples<=prereadendsample){
					System.out.println(prereadendsample);
		System.out.println("��ǰ��Ӱʱ��С�ڵ�������һ��Ķ���������"+test++);			
				}
				
				long currentneededsamples=currentctsamples + aulunchtimesample-prereadendsample;
				
				
	System.out.println("�ϴζ��Ľ�������"+prereadendsample);			
				if(currentctsamples>preframeendtimetosample){//eatnothing ��ʱ��Ϊ��ǰʱ�䳬Խ����д���֡��������д���֡�Ѿ������� ���ԾͲ���
	//	System.out.println(currentctsamples+"������û�г�");	
					
					//prereadendsample=currentctsamples;
					prereadendsample=preframeendtimetosample;
		//System.out.println(currentctsamples+"û�öԽ��屻����");			
					buffercondition.signal();
					return 0;
				}
				if(byteToSample(readAvailable)<currentneededsamples){//eatunfull ��Ҫ�Ķ࣬��Ч���ٵ����
	//	System.out.println(currentctsamples+"û�гԱ�");				
					
					ringbuf.read(srcsample, 0, readAvailable, false);
					long diff=currentctsamples-prereadendsample;//����ǵ�ǰʱ����ǰ�� ��Ҫ�����Ĳ���Ҫ�Ĳ���
					long srcoffset=diff-1<0?0:diff-1;
		
				//	System.out.println("��ǰ��Ӱʱ�����"+currentctsamples+"��һ����Ľ�������"+prereadendsample+"�����Ҫ���Ĳ���"+diff+"����Ч����"+ringbuf.readAvailable()+"src���������"+srcsample.length+"��һ��Ľ�������"+preframeendtimetosample);			
				
					copyArrayToALArray(srcsample,sampleToByte(srcoffset),buf,0, readAvailable-sampleToByte(diff));
				
					prereadendsample=preframeendtimetosample;
					
					preventSecondEat=true;
				
					buffercondition.signal();
					
					return  readAvailable-sampleToByte(diff);
					
				}else{//eatfullһ���Կ����õ�������Ҫ��������Ч�Ĵ��ڵ���������Ҫ�Ĳ���
		System.out.println(currentctsamples+"��ȫ�Ա�");	
		System.out.println("��ǰ��Ҫ��֡��"+currentneededsamples+"�����е�����"+srcsample.length);
					ringbuf.read(srcsample, 0, sampleToByte(currentneededsamples), false);
					long diff=currentctsamples-prereadendsample;
					long srcoffset=diff-1<0?0:diff-1;
					copyArrayToALArray(srcsample,sampleToByte(srcoffset),buf,0,  sampleToByte(currentneededsamples)-sampleToByte(diff));
					if(newreadend>preframeendtimetosample){//��֤
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
