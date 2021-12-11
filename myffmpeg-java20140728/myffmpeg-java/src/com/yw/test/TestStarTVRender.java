package com.yw.test;

import com.jme3.animation.LoopMode;
import com.jme3.app.SimpleApplication;
import com.jme3.cinematic.PlayState;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.material.Material;
import com.jme3.math.FastMath;
import com.jme3.renderer.queue.RenderQueue.Bucket;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Quad;
import com.jme3.texture.Texture;
import com.jme3.texture.Texture2D;
import com.yw.startv.StarCinematic;

public class TestStarTVRender  extends SimpleApplication {
	
	StarCinematic scinematic;
	float time;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("ffmpegj.videodebug", "true");
		System.setProperty("ffmpegj.audiodebug", "false");
		TestStarTVRender startv= new TestStarTVRender();
		startv.start();
	}

	@Override
	public void simpleInitApp() {
		// TODO Auto-generated method stub
		
		scinematic=new StarCinematic();
		scinematic.setLoopMode(LoopMode.DontLoop);
		
		initInputs();
		
		 stateManager.attach(scinematic);
		
		 
		//Material mat = new Material(assetManager, "Common/MatDefs/Misc/ColoredTextured.j3md");
		 Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
		//Texture texture3=assetManager.loadTexture("Textures/ColoredTex/Monkey.png");
		Texture2D sctexture = scinematic.getTex2d();
		//scinematic.setTex2d((Texture2D)texture3);
		//sctexture.setImage(texture3.getImage());
		
		 mat.setTexture("ColorMap", sctexture);
		 Quad q = new Quad(16, 9,true);
		
	     Geometry g = new Geometry("quad", q);
	     g.setLocalTranslation(-7, -4, 0);
	     g.setMaterial(mat);
	     rootNode.attachChild(g);
	     
	   
		
		
	}
	
	 private void initInputs() {
	        inputManager.addMapping("togglePause", new KeyTrigger(keyInput.KEY_RETURN));
	        inputManager.addMapping("navFwd", new KeyTrigger(keyInput.KEY_RBRACKET));
	        inputManager.addMapping("navBack", new KeyTrigger(keyInput.KEY_LBRACKET));
	        inputManager.addMapping("firstmtv", new KeyTrigger(keyInput.KEY_1));
	        inputManager.addMapping("secondmtv", new KeyTrigger(keyInput.KEY_2));
	        inputManager.addMapping("song", new KeyTrigger(keyInput.KEY_3));
	        inputManager.addMapping("realtimetv", new KeyTrigger(keyInput.KEY_4));
	        inputManager.addMapping("denghuolanshan", new KeyTrigger(keyInput.KEY_5));
	        
	        ActionListener acl = new ActionListener() {

	            public void onAction(String name, boolean keyPressed, float tpf) {
	                if (name.equals("togglePause") && keyPressed) {
	                    if (scinematic.getPlayState() == PlayState.Playing) {
	                   	
	                    	scinematic.pause();
	      System.out.println("电影暂停了");                  	
	  // System.out.println("暂停后 星级电影的状态"+scinematic.getPlayState());                 	
	                        time = scinematic.getTime();
	                    } else {
	      System.out.println("电影又继续播放了");     	    
	                    	scinematic.play();
	                	
	                    }
	                }

	       //      if (scinematic.getPlayState() != PlayState.Playing) {
	                    if (name.equals("navFwd") && keyPressed) {
	    System.out.println("我快进了@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 当前电影时间是"+scinematic.getTime());
	                       if(scinematic.getPlayState()== PlayState.Stopped || scinematic.getTime()>=scinematic.getInitialDuration()-0.4){
	    	                   System.out.println("我按了快进键 但是已经暂停或者到达了文件末尾 不需要快进了");   
	                    	   return;
	                        }
	                        time = scinematic.getTime();
	                        time += 10;
	                        time=FastMath.clamp(time, 0, scinematic.getInitialDuration());
	                        scinematic.setTime(time,10);
	    System.out.println("按键快进结束了@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");                    
	                       
	                    }
	                    if (name.equals("navBack") && keyPressed) {
	                    	if(scinematic.getPlayState()== PlayState.Stopped || scinematic.getTime()>=scinematic.getInitialDuration()-0.4){
		    	                   System.out.println("我按了快退键 但是已经暂停或者到达了文件末尾 不需要快退了");   
		                    	   return;
		                        }
	    System.out.println("我快退了"); 
	                        time = scinematic.getTime();
	                        time += -10;
	                        FastMath.clamp(time, 0, scinematic.getInitialDuration());
	                        scinematic.setTime(time,-10);
	                      //  scinematic.play();
	                    }
	                    
	                    if(name.equals("firstmtv") && keyPressed){
	                    	System.out.println("我 按了1 要播放了");
	                    	scinematic.watch("E:/space/love.flv");
	                    	
	                    }
	                    
	                    if(name.equals("secondmtv")&& keyPressed){
	                    	System.out.println("我 按了2 要播放了");
	                    	scinematic.watch("E:/space/zhuniyilushunfeng.flv");
	                    	
	                    }
	                    
	                    if(name.equals("song")&& keyPressed){
	                    	System.out.println("我 按了3 要播放了");
	                    	scinematic.watch("E:/space/sunwukong.mp3");
	                    	
	                    }
	                    
	                    
	                   if(name.equals("realtimetv")&& keyPressed){
	                    	System.out.println("我 按了4 要播放了");
	                    	//scinematic.watch("rtsp://officetv.bupt.edu.cn/HNWS");
	                    	scinematic.watch("rtsp://58.200.131.2/cctv-4");
	                    	//scinematic.watch("rtsp://58.200.131.2/HNWS/audio");
	                    }
	                    
	                    if(name.equals("denghuolanshan")&& keyPressed){
	                    	System.out.println("我 按了5 要播放了");
	                    	scinematic.watch("E:/space/灯火阑珊.mp3");
	                    	
	                    }
	                    

	               // }
	            }
	        };
	        inputManager.addListener(acl, "togglePause", "navFwd", "navBack","firstmtv","secondmtv","song","realtimetv","denghuolanshan");
	    }

}
