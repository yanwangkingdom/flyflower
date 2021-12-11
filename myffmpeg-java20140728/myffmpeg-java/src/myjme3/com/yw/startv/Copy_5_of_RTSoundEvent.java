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
import com.yw.ffmpegj.Connector;
import com.yw.ffmpegj.FFAudioData;
import com.yw.ffmpegj.ToolAndRecyclebin;



public class Copy_5_of_RTSoundEvent extends SoundEvent {
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
    RingBuffer ringbuf=new RingBuffer(10*2048*2*2);
    RTAudioStream rtas;
    
	@Override
	public void initEvent(Application app, Cinematic cinematic) {
		
	}
	public final long convertTimeToSample(float time,int samplerate){
		return Math.round(time*samplerate);
	}
	
	public Copy_5_of_RTSoundEvent(){
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
		public int samplesperframe=0;
		volatile long writensamples;
		double frameendtime;
		long preframeendtimetosample;
		int firstenter=1;
		boolean preventSecondEat=false;
		long  ntervaltime=0;
		long pktpts;
		
		ToolAndRecyclebin aurecycleandtool=null;
	
		public class AudioDataBox implements AudioConnector{
          
            int connectorsamplerate=0;
        	int connectorchannels;
        	int connectorbytepersample;
        	ByteBuffer connectoraudiodatabuffer;
        	int connectorsamplesperframe;
        	long connectorpts_blurwritensample;//���Ǻ�׼ȷ��һ��ֵ ���ֵ����pts������һ֡��Ƶλ��������Ƶ�ļ��еĵڼ�������
        	double connectorframeendtime;// ������������� ������һ֡��Ƶ �ܹ���Ҫ��ʱ�� ������Ϊ��λ��
        	long connectorpktpts;
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
				
					connectoraudiodatabuffer=audiodatabox.getAdptobuffer();
				
					connectorbytepersample=audiodatabox.getSrcBytepersample();
			
					connectorsamplerate=audiodatabox.getSrcSamplerate();
		
					connectorchannels=audiodatabox.getChannel();
					
					connectorsamplesperframe=audiodatabox.getTargetSamplesperframe();
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
			AudioDataBox audatabox;
			int readedsize=0;
			int beginoffset=0;
			int allowsleeptime=5;
			/*if(firstenter<3){//һ��ʼҪ��������������� Ϊ������һ��ʼ���ĸ� ֱ�������һ������ϵ��ҵ�����
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
			
			float currentctime= Copy_5_of_RTSoundEvent.this.time;
			System.out.println("��ǰ��Ӱʱ���ǣ�"+currentctime);
			
			do{
				
				Connector c=this.aurecycleandtool.getfilledConnector();
				if(c==null){
					/*try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
					//allowsleeptime--;
				}
				else{
				
					audatabox=(AudioDataBox)c;
					this.sampleRate=audatabox.connectorsamplerate;
					this.bitsPerSample=audatabox.connectorbytepersample*8;
					this.channels=audatabox.connectorchannels;
					this.samplesperframe=audatabox.connectorsamplesperframe;
				    this.bytepersample=audatabox.connectorbytepersample;
				    this.pktpts=audatabox.connectorpktpts;
				System.out.println("��ǰ��Ƶ֡��pts��"+pktpts);    
				  
				    audatabox.connectoraudiodatabuffer.get(buf, beginoffset, audatabox.connectoraudiodatabuffer.capacity());
				   
						
				    
				
					beginoffset+=audatabox.connectoraudiodatabuffer.capacity();
					readedsize+=audatabox.connectoraudiodatabuffer.capacity();
					
					this.aurecycleandtool.recycle(audatabox);
					
					
				}
			
			}while(allowsleeptime>0 && (readedsize+sampleToByte(this.samplesperframe)<= buf.length));
			
			if(readedsize==buf.length){
				
				preventSecondEat=false;
			}else{
				preventSecondEat=true;
			}
			
			return readedsize;
			
			
	
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
	
	//��Ϊ����û�Ե�������û�гԱ� ��˵��buffer�ڵ�����Ӧ�ñ�ȫ����ȡ������ ���ʱ��frameendӦ������һ��
	//������λ�� 

}
