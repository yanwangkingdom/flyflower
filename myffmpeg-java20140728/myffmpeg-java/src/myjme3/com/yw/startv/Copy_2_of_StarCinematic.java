package com.yw.startv;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import com.jme3.animation.LoopMode;
import com.jme3.app.Application;
import com.jme3.cinematic.Cinematic;
import com.jme3.cinematic.KeyFrame;
import com.jme3.cinematic.PlayState;
import com.jme3.cinematic.events.AbstractCinematicEvent;
import com.jme3.cinematic.events.CinematicEvent;
import com.jme3.export.JmeExporter;
import com.jme3.export.JmeImporter;
import com.jme3.scene.Node;
import com.jme3.texture.Image;
import com.jme3.texture.Image.Format;
import com.jme3.texture.Texture2D;
import com.jme3.util.BufferUtils;
import com.yw.ffmpegj.AudioConnector;
import com.yw.ffmpegj.VideoConnector;
import com.yw.ffmpegj.FFEngine;
import com.yw.ffmpegj.ToolAndRecyclebin;
import com.yw.ffmpegj.VideoPicture;

/**
 * ���ڱ���ĳ�Ա����initialized��Ա���� Ĭ��ֵ����false ��AppStateManager������update�ķ����� �����
 * appsdata��initializ���� �ͻ���õ�����ĸ���Cinematic��initialize���� �������ó�Ա����initialized=true
 * @author wang
 *
 */
public class Copy_2_of_StarCinematic extends Cinematic{
	boolean allowupdate=false;
	 static final boolean videodebug = Boolean.getBoolean("ffmpegj.videodebug");
	ReentrantLock cinematiclock = new ReentrantLock();
	Texture2D tex2d;
	ByteBuffer defaultimagedata;
	Image defaultimage;
	List <FFFrameEvent> frameevents=new ArrayList<FFFrameEvent>();
    static final int finaltime=1*60*60*24;//һ���������
    final FFEngine ffengine;
    RTSoundEvent soundevent;
    KeyFrame soundeventkeyframe;
    
    boolean videoexist=false;
    boolean audioexist=false;
    //String filname="rtsp://officetv.bupt.edu.cn/HNWS";
  //  String filname="E://liyugang/lihuasong.flv";
    
  //  String filname="E:/space/FF13.flv";
 // String filname="E:/space/zhengbu.flv";
 // String filname="E:/space/zhuniyilushunfeng.flv";
 //  String filname="E:/space/lovespliter.flv";
 //String filname="E:/space/love.flv";
    String filname="E:/space/iammy.flv";
   // String filname="E://02.flv";
// String filname="rtsp://officetv.bupt.edu.cn/HNWS";
  //  String filname="rtsp://officetv.bupt.edu.cn/CCTV-3";
   //String filname="rtsp://officetv.bupt.edu.cn/CCTV-4";
    //  String filname="rtsp://officetv.bupt.edu.cn/LNWS";
    //  String filname="rtsp://officetv.bupt.edu.cn/ZJWS";
     // String filname="rtsp://officetv.bupt.edu.cn/JSWS";
     // String filname="rtsp://officetv.bupt.edu.cn/HBWS";
    //  String filname="rtsp://officetv.bupt.edu.cn/CQWS";
     // String filname="rtsp://officetv.bupt.edu.cn/SHWS";
   // String filname="E:/space/spaceplane.flv";	
   // String filname="E:/space/starwar.flv";
  // String filname="F:/115music/����/����Z�������ּ�.-.[Dragon.Ball.Z][BGM.Collection].ר��.(MP3)/Insert Song/#120. Battle Power Unlimited.mp3";
  //String filname="E:/space/sunwukong.mp3";
 // String filname= "F:/115music/dragonBallz/51-Cake-Factory.m4a";
  //String filname= "F:/115music/dragonBallz/Dragon Ball Z Trunks Compendium/16-Home-Sweet-Home.m4a";
  // String filname= "E:/space/NewYorkNewYork.ape";
   //String filname= "E:/14.wav";
 //String filname= "E:/space/13 - Rory Block - You Didn't Mind.flac";
  // String filname= "E:/space/wav/03-Track03.wav";
  // String filname= "E:/space/�ƻ���ɺ.mp3";
    ///String filname= "E:/space/tta/gudong.tta";
	public Copy_2_of_StarCinematic() {
		super();
		
	this.setTime(-0.4f);
		// TODO Auto-generated constructor stub
		
		
		soundevent=new RTSoundEvent();
		 ArrayList<AudioConnector> ausoundevents=soundevent.getAudioConnector(200);
	//	soundevent.setTime(-0.1f);
		soundeventkeyframe=this.addCinematicEvent(-0.2f, soundevent);
		// this.addCinematicEvent(0, soundevent);
		defaultimagedata=createImageData(1920, 1080);
		this.initialDuration=finaltime;
		
		tex2d = new Texture2D();
		defaultimage=new Image(Format.RGB8,1920,1080,defaultimagedata);
		tex2d.setImage(defaultimage);
		defaultimage.setUpdateNeeded();
		for(int i=0;i<200;i++){
			FFFrameEvent frameevent=new FFFrameEvent(defaultimage);
			frameevents.add(frameevent);
			frameevent.eventlocation=addCinematicEvent(finaltime+i,frameevent);
			frameevent.keyframetime=finaltime+i;
			//frameevent.eventlocation = timeLine.getKeyFrameAtTime(finaltime+i);
			if(frameevent.eventlocation==null){
				if(videodebug)
				System.out.println("û������Ϲؼ�֡");
			}
			
		}
	    
		//ffengine=new FFEngine(filname,frameevents,soundevent.getAudioConnector(100));
		ffengine=new FFEngine(filname,frameevents,ausoundevents);
		ffengine.setFfengine_audio_hw_buf_size(35280);//����ط���������� ���밴�����˳����� �������û����С �ڳ�ʼ�����ҿ�ʼ��
		ffengine.initAndStart();
		if(ffengine.isVideoExist()){
			videoexist=true;
		}
		if(ffengine.isAudioExist()){
			audioexist=true;
		}
		this.initialDuration=ffengine.getAVDuration();
		System.out.println("�� �Ѿ�������starcinematic");
	}
	
	
	
	
	
	
	public Texture2D getTex2d() {
		return tex2d;
	}

	
	
	public void setTex2d(Texture2D tex2d) {
		this.tex2d = tex2d;
	}

	protected ByteBuffer createImageData(int width,int hight){
		 ByteBuffer bb = BufferUtils.createByteBuffer(width * hight  * 3);
		 for (int i = 0; i < width; ++i) {
	            for (int j = 0; j < hight; ++j) {
	                bb.put((byte) (255f*i/hight));
	                bb.put((byte) (255f*i/hight));
	                bb.put((byte) (255f));
	            }
	        }
		 bb.rewind();
		 return bb;
	}
	
	
	
	
	


@Override
public void onPlay() {
	// TODO Auto-generated method stub
	
	if(ffengine!=null){
		//System.out.println("���濪ʼ���� ��ǰ��Ӱ��ʱ��"+this.time);
		if(ffengine.isStoped()){
			this.setTime(0);
			ffengine.setFfengine_audio_hw_buf_size(35280);//����ط���������� ���밴�����˳����� �������û����С �ڳ�ʼ�����ҿ�ʼ��
			ffengine.initAndStart();
			if(ffengine.isVideoExist()){
				videoexist=true;
			}
			if(ffengine.isAudioExist()){
				audioexist=true;
			}
			this.initialDuration=ffengine.getAVDuration();
		}
	    ffengine.play();
 
	}else{
	   System.out.println("ffengine==null");
	}
	System.out.println("��ʼ���ź� ��ǰ��Ӱ��ʱ��"+this.time);
	super.onPlay();
	
}






@Override
public void onStop() {
	// TODO Auto-generated method stub
	//ffengine.stop();
	super.onStop();
	
	
}






@Override
public void onPause() {
	// TODO Auto-generated method stub
	if(ffengine!=null){
		//
		ffengine.pause();
		System.out.println("������ͣ"+this.time);	
	
	}
	
	super.onPause();
	System.out.println("��Ӱ��ͣ"+this.time);
	
}









@Override
public void setTime(float time) {
	// TODO Auto-generated method stub
	if(soundevent!=null){
		
		this.removeCinematicEvent(soundeventkeyframe, soundevent);//��֤�������������¼������ﻹ�ǹؼ�֡������ �����������Ƴ��ɾ� ��֤���治�ᱻ �����������������Լ����������¼��ڹؼ�֡�е�λ�ü���ʱ������ ���ǵ�Ӱ�ȿ�ʼȻ���ٴ�����Ƶ
		soundevent.forceStop();
	}
	super.setTime(time-0.25f);
	
	if(soundevent!=null){
		
		soundeventkeyframe=	this.addCinematicEvent(time-0.2f, soundevent);
		soundevent.setTime(time);
		//soundevent.setEqer(0.061);
//System.out.println("����Ƶ�¼�����������seek���ʱ��"+soundevent.getTime());		
	
		
	}
	
	
}




public synchronized void setTime(float targettime, float rel) {
	// TODO Auto-generated method stub
System.out.println("��Ҫ��ת����ʱ���ǣ�"+targettime+"��ǰ��Ӱ��״̬��"+this.getPlayState()+" ý���ļ��ĳ���ʱ�� "+this.initialDuration);
      
      
	  this.pause();
  
      double seekafteraupts = ffengine.seek(targettime, rel);
  System.out.println("��ת�����Ƶpts"+seekafteraupts);	    
      setTime((float)seekafteraupts);
      this.play();
	
}








public class FFFrameEvent extends AbstractCinematicEvent implements VideoConnector{
		double videopts;
		VideoPicture vdatabox;
		public Image image;
		
		ToolAndRecyclebin vprecycle;
		public KeyFrame eventlocation;
		public  float keyframetime;
		ByteBuffer vpdata;
		public FFFrameEvent(Image defaultimage) {
			super();
		
			this.image=defaultimage;
			
			// TODO Auto-generated constructor stub
			//if(videodebug)
			//System.out.println(" ���Ѿ�������fframeevent");
		}

		/* (non-Javadoc)
		 * @see com.jme3.cinematic.events.AbstractCinematicEvent#onPlay()
		 * ��������������û��������Ҫ����Ϊture ����Ϊsetdata�����а�����������Ҫ����Ϊture
		 */
		@Override
		protected void onPlay() {
			// TODO Auto-generated method stub
			
			if(videodebug)
				System.out.println(keyframetime+"��ʼ����"+"��ǰ��Ӱʱ��Ϊ��"+Copy_2_of_StarCinematic.this.getTime());
			
			image.setData(0,vpdata);
			
			/*if(!image.isUpdateNeeded()){
			image.setUpdateNeeded();
			}*/
	//System.out.println("��ǰ��Ƶ��Ӱʱ���ǣ�"+StarCinematic.this.time);		
			
	//System.out.println("��ǰ��Ƶ֡�Ĳ���ʱ��"+videopts);		
			
		}

		@Override
		protected void onUpdate(float tpf) {
			// TODO Auto-generated method stub
			
		}

		@Override
		protected void onStop() {
		  if(videoexist && vprecycle!=null){ 
				
			if(videodebug)
			System.out.println(keyframetime+"��ʼ����");
			// TODO Auto-generated method stub
		if(Copy_2_of_StarCinematic.this.playState!=PlayState.Paused){//���һ����Ƶ֡������������ ֮ǰ����״̬Ӧ����play״̬ �������paused״̬ ���������ͣ�� ������Ѿ���ͣ��
			cleanData();
			
	
			vprecycle.recyclePreAll(this);
		    }
		 }
		}

		@Override
		public void onPause() {
			// TODO Auto-generated method stub
		
			
		}

		@Override
		public boolean setData(VideoPicture databox) {
			
			
			// TODO Auto-generated method stub
			
			if(vprecycle==null){
				vprecycle=databox.getVprecycle();
			}
			
			vdatabox=databox;
			
			double newvppts=databox.getPts();
			videopts=newvppts;
			if(newvppts  > Copy_2_of_StarCinematic.this.time){
				
				if(image.getHeight()!=databox.getHeight()||image.getWidth()!=databox.getWidth()||image.getFormat()!=Format.RGB8){
				
				image.setHeight(databox.getHeight());
				image.setWidth(databox.getWidth());
				image.setFormat(Format.RGB8);
				
			}
				vpdata=databox.getData();
				
					
			
				initialDuration=(float)databox.getDuration();
				
				addEventToKeyframe((float)newvppts);
				if(videodebug)
				System.out.println(newvppts+"���óɹ�");
				return true; 
			    
			}
			
			
			vprecycle.recycleUnused(this);
			if(videodebug)
			System.out.println(keyframetime+"û�����óɹ�"+"��Ӱ��״̬"+ Copy_2_of_StarCinematic.this.getPlayState()+"��Ӱ��ʱ����"+Copy_2_of_StarCinematic.this.getTime());
			return false;
		}

		public void addEventToKeyframe(float newvppts){
			if(eventlocation==null){
				eventlocation=new KeyFrame();
				eventlocation.getCinematicEvents().add(this);
			}
			if(eventlocation.getCinematicEvents().size()==1){
				 keyframetime=newvppts;
				  KeyFrame registeredframe =timeLine.getKeyFrameAtTime(keyframetime);
				  if(registeredframe==null){
					  timeLine.addKeyFrameAtTime(keyframetime, eventlocation);
				  }else{
					  eventlocation.getCinematicEvents().remove(this);
					  eventlocation=registeredframe;
					  eventlocation.getCinematicEvents().add(this);
				  }
				  
			}else if(eventlocation.getCinematicEvents().size()>1){
				
				keyframetime=newvppts;
				KeyFrame kf=timeLine.getKeyFrameAtTime(newvppts);
				if(kf==null){
					eventlocation.getCinematicEvents().remove(this);
					eventlocation=addCinematicEvent(keyframetime,this);
				}else if(eventlocation.equals(kf)){
					
				}else if(!eventlocation.equals(kf)){
					eventlocation.getCinematicEvents().remove(this);
					kf.getCinematicEvents().add(this);
					eventlocation=kf;
				}
				
			    
			    
			     eventlocation = addCinematicEvent(keyframetime, this);
				 //eventlocation= timeLine.getKeyFrameAtTime(keyframetime);
		     }
		}
		
		public void removeEventFromKeyframe(){
			if(eventlocation.getCinematicEvents().size()==1){
				timeLine.removeKeyFrame(keyframetime);
			}
			else if(eventlocation.getCinematicEvents().size()>1){
		     eventlocation.getCinematicEvents().remove(this);
		     eventlocation=null;
		     keyframetime=0;
			}
		}

		@Override
		public void cleanData() {
			// TODO Auto-generated method stub
			/*if(vpdata!=null){
				BufferUtils.destroyDirectBuffer(vpdata);//���image��bytebuffer
			}
			*/
			removeEventFromKeyframe();//����ؼ�֡�ϵ��¼�
			this.playState= PlayState.Stopped;
		}

		@Override
		public VideoPicture getData() {
			// TODO Auto-generated method stub
			return vdatabox;
		}

		@Override
		public void forceStop() {
			// TODO Auto-generated method stub
			super.forceStop();
		}

		@Override
		public void reNew() {
			// TODO Auto-generated method stub
			if(vpdata!=null){
				vpdata.clear();
				vpdata=null;
			}
			if(vdatabox!=null){
				vdatabox=null;
			}
		}
		
		
		

	}





@Override
public void update(float tpf) {
	
	//System.out.println("starcinematic ��ʼ����");
	// TODO Auto-generated method stub
	    if(! allowupdate){
	        allowupdate=ffengine.isReady();
	    	return ;
	    }
		super.update(tpf);
	

}






@Override
public void internalUpdate(float tpf) {
	// TODO Auto-generated method stub
	 if (playState == PlayState.Playing) {
         time = time + (tpf * speed);         
         onUpdate(tpf);
         if (time >= initialDuration && loopMode == LoopMode.DontLoop) {
        	 ffengine.forceStop();
             stop();
         } else if(time >= initialDuration && loopMode == LoopMode.Loop){
       System.out.println("internalUpdate����Ҫ��ת����ʼ���¿�ʼ����"); 	 
             setTime(0,0);// ��ˢ�µ��ļ���ĩβ��ʱ�� �������ѭ��ģʽ ���ô��ļ��Ŀ�ͷ��ʼ����
           //  this.play();
         }
     }
}






@Override
public void setLoopMode(LoopMode loopMode) {
	// TODO Auto-generated method stub
	super.setLoopMode(loopMode);
	if(loopMode==LoopMode.Loop){
		ffengine.setIsexit(false);
	}else{
		ffengine.setIsexit(true);
	}
	
	
}






@Override
public void play() {
	// TODO Auto-generated method stub
	super.play();
}






@Override
public void stop() {
	// TODO Auto-generated method stub
	super.stop();
}






@Override
public void pause() {
	// TODO Auto-generated method stub
	super.pause();
}








}
