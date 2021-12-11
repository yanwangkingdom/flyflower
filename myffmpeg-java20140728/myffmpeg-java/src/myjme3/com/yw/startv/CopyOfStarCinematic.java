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
public class CopyOfStarCinematic extends Cinematic{
	boolean allowupdate=false;
	 static final boolean videodebug = Boolean.getBoolean("ffmpegj.videodebug");
	ReentrantLock cinematiclock = new ReentrantLock();
	Texture2D tex2d;
	ByteBuffer defaultimagedata;
	Image defaultimage;
	List <FFFrameEvent> frameevents=new ArrayList<FFFrameEvent>(20);
    static final int finaltime=1*60*60*24;//һ���������
    final FFEngine ffengine;
    RTSoundEvent soundevent;
    String realstreamname="rtsp://officetv.bupt.edu.cn/HNWS";
  //  String filname="E://liyugang/lihuasong.flv";
    
  //  String filname="E:/space/FF13.flv";
  // String filname="E:/space/zhengbu.flv";
 //  String filname="E:/space/zhuniyilushunfeng.flv";
 //  String filname="E:/space/lovespliter.flv";
  // String filname="E:/space/love.flv";
  //  String filname="E:/space/iammy.flv";
   // String filname="E://02.flv";
  String filname="rtsp://officetv.bupt.edu.cn/HNWS";
    
   // String filname="E:/space/spaceplane.flv";	
   // String filname="E:/space/starwar.flv";	
	public CopyOfStarCinematic() {
		super();
		
		this.setTime(-2);
		// TODO Auto-generated constructor stub
		
		
		soundevent=new RTSoundEvent();
		 ArrayList<AudioConnector> ausoundevents=soundevent.getAudioConnector(200);
		soundevent.setTime(-1.0f);
		this.addCinematicEvent(-1.5f, soundevent);
		
		defaultimagedata=createImageData(448, 332);
		this.initialDuration=finaltime;
		
		tex2d = new Texture2D();
		defaultimage=new Image(Format.RGB8,448,332,defaultimagedata);
		tex2d.setImage(defaultimage);
		defaultimage.setUpdateNeeded();
		for(int i=0;i<200;i++){
			FFFrameEvent frameevent=new FFFrameEvent(defaultimage);
			frameevents.add(frameevent);
			addCinematicEvent(finaltime+i,frameevent);
			frameevent.keyframetime=finaltime+i;
			frameevent.eventlocation = timeLine.getKeyFrameAtTime(finaltime+i);
			if(frameevent.eventlocation==null){
				if(videodebug)
				System.out.println("û������Ϲؼ�֡");
			}
			
		}
	    
		//ffengine=new FFEngine(filname,frameevents,soundevent.getAudioConnector(100));
		ffengine=new FFEngine(filname,frameevents,ausoundevents);
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
	
	
	
	
	
public class FFFrameEvent extends AbstractCinematicEvent implements VideoConnector{
		double videopts;
		
		public Image image;
		
		ToolAndRecyclebin vprecycle;
		public KeyFrame eventlocation;
		public  float keyframetime;
		ByteBuffer vpdata;
		public FFFrameEvent(Image defaultimage) {
			super();
		
			this.image=defaultimage;
			
			// TODO Auto-generated constructor stub
			if(videodebug)
			System.out.println(" ���Ѿ�������fframeevent");
		}

		@Override
		protected void onPlay() {
			// TODO Auto-generated method stub
			image.setUpdateNeeded();
	System.out.println("��ǰ��Ƶ��Ӱʱ���ǣ�"+CopyOfStarCinematic.this.time);		
			
	System.out.println("��ǰ��Ƶ֡�Ĳ���ʱ��"+videopts);		
			if(videodebug)
			System.out.println(keyframetime+"��ʼ����"+"��ǰ��Ӱʱ��Ϊ��"+CopyOfStarCinematic.this.getTime());
		}

		@Override
		protected void onUpdate(float tpf) {
			// TODO Auto-generated method stub
			
		}

		@Override
		protected void onStop() {
			if(videodebug)
			System.out.println(keyframetime+"��ʼ����");
			// TODO Auto-generated method stub
			cleanData();
			vprecycle.recyclePreAll(this);
		
		}

		@Override
		public void onPause() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean setData(VideoPicture databox) {
			// TODO Auto-generated method stub
			double newvppts=databox.getPts();
			videopts=newvppts;
			if(newvppts  > CopyOfStarCinematic.this.time){
				
				image.setHeight(databox.getHeight());
				image.setWidth(databox.getWidth());
				image.setFormat(Format.RGB8);
				vpdata=databox.getData();
				
				image.setData(0,vpdata);
				
				vprecycle=databox.getVprecycle();
				initialDuration=(float)databox.getDuration();
				
				addEventToKeyframe((float)newvppts);
				if(videodebug)
				System.out.println(newvppts+"���óɹ�");
				return true; 
			    
			}
			BufferUtils.destroyDirectBuffer(databox.getData());
			
			databox.getVprecycle().recycleUnused(this);
			if(videodebug)
			System.out.println(keyframetime+"û�����óɹ�"+"��Ӱ��״̬"+ CopyOfStarCinematic.this.getPlayState()+"��Ӱ��ʱ����"+CopyOfStarCinematic.this.getTime());
			return false;
		}

		public void addEventToKeyframe(float newvppts){
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
			     addCinematicEvent(keyframetime, this);
				 eventlocation= timeLine.getKeyFrameAtTime(keyframetime);
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
			if(vpdata!=null){
				BufferUtils.destroyDirectBuffer(vpdata);//���image��bytebuffer
			}
			
			removeEventFromKeyframe();//����ؼ�֡�ϵ��¼�
			this.playState= PlayState.Stopped;
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






/*@Override
public void onUpdate(float tpf) {
	// TODO Auto-generated method stub
	
	super.onUpdate(tpf);
}*/

    


}
