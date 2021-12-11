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
 * ��ͨ��ý���ļ�ʵ������Ƶ������ͬ��
 * @author wang
 *
 */
public class Copy_11_of_RTSoundEvent extends SoundEvent {
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
		 * ���ֵ���ó���35280 Ҳ����������˫�����ɳ���0.2�� 8820�ɳ���0.05�룬8192*2 ��ֵһ�����ά����֡ʱ��  һ֡Ϊ0.046��
		 */
		float hw_buffer_size=1.0f;
		
		double audiopts=0;
		double audioptsdrift=0;
		
		int alfilltotal;
		
		
		/**
		 * al �ڵ�ǰ��Ӱʱ�䵽��֮ǰ ��Ӧ����ǰ׼���õ���Ƶ����ʱ�䣬��������ȷ��һֱ������ǰ�� �Ͳ��ᷢ����Ƶ���Ѳ��ҿ��Դﵽ��ǰ��Ӱʱ��
		 * ����ʱ�������b������ a�����������ڲ��ŵ�ǰ��Ӱʱ��Ӧ�÷��������� ������Ϊ��λ��
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
		int lasttimeresidue=0;//��һ�����ݻ�δд�뵽al����������
		int sampledatapooloffset=0;
		AudioToolAndReccyclebin aurecycleandtool=null;
	
		public class AudioDataBox implements AudioConnector{
          
            int connectorsrcsamplerate=0;
            
            
            int connectortargetsamplerate;
        	int connectorchannels;
        	int connectortargetbytepersample;
        	ByteBuffer connectoraudiodatabuffer;
        	int connectorsrcsamplesperframe;
        	long connectorpts_blurwritensample;//���Ǻ�׼ȷ��һ��ֵ ���ֵ����pts������һ֡��Ƶλ��������Ƶ�ļ��еĵڼ�������
        	double connectorframeendtime;// ������������� ������һ֡��Ƶ �ܹ���Ҫ��ʱ�� ������Ϊ��λ��
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
			int everygotbyte=0;//ÿ�λ�ȡ����Ƶ���ݵ��ֽ���
			
			 double  al_sub_ct=0;//����al�����ܼ�ʱ���뵱ǰ��Ӱʱ��֮��
			 double residuediff=0;
			 
			 double currentctime=0;
			
			if(firstenter<6){//һ��ʼҪ��������������� Ϊ������һ��ʼ���ĸ� ֱ�������һ������ϵ��ҵ�����
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
			
System.out.println("�����ϵ�ǰ�ĵ�Ӱʱ�� "+startctime);

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
			    //	System.out.println("ͨ������ʱ��Ĳ�ֵ�ĵ�ǰ��Ӱʱ��"+currentctime);
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
	//System.out.println("ͨ����ǰ��Ӱʱ����������Ҫ����ʱ��"+al_sub_ct);				 
					 if( al_sub_ct < autbeforect){
						needfillbyte=timeToByte(autbeforect-al_sub_ct);//�����ֵ��������ǰ�� �͵�����ǰ��
	//System.out.println("---------������Ҫ������ʱ��"+(autbeforect-al_sub_ct));					
	//System.out.println("���������Ҫ�����ֽ���"+needfillbyte);					
					}else{
						
	System.out.println("���������������ҷ�����");					
				    	return 0;
				    }
				
				if(needfillbyte > (buf.length-alreadedsize)){//��ֹ��Ҫ���ֽ�����Խ��al������������ ��ʣ����ֽڳ���
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
					
	System.out.println("��Ƶ��pts"+audiopts);	 			
				   
	residuediff=audiopts-newctime; 
				     
				     
	System.out.println("ʣ���ֵ"+residuediff);     
				     firstcome=false;
		        	
		        }	
					
				if(firstenter<6){
					residuediff=0;
				}
					  
				
				int audiosize=  this.aurecycleandtool.getSyncedAudioByGivenArray(databox, residuediff, sampledatapool);
				
				
				 
				double counteractdiff=byteToTime(sampleToByte(databox.connectorsrcsamplesperframe)-audiosize);//������diff
				
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
				  System.out.println("al �ȴ��Խ���");
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
	
	//��Ϊ����û�Ե�������û�гԱ� ��˵��buffer�ڵ�����Ӧ�ñ�ȫ����ȡ������ ���ʱ��frameendӦ������һ��
	//������λ�� 
	

}
