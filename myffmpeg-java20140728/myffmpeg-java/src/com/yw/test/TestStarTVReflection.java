package com.yw.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

public class TestStarTVReflection  extends SimpleApplication {
	
	StarCinematic scinematic;
	float time;
	Class sc;
	
	Method watch;
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("ffmpegj.videodebug", "true");
		System.setProperty("ffmpegj.audiodebug", "false");
		TestStarTVReflection startv= new TestStarTVReflection();
		startv.start();
	}

	@Override
	public void simpleInitApp() {
		// TODO Auto-generated method stub
		try {
			sc=Class.forName("com.yw.startv.StarCinematic");
			scinematic =(StarCinematic) sc.newInstance();
			
		   watch= sc.getDeclaredMethod("watch", new Class[]{String.class});
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		   } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		   } catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  } catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		
		
	
			
		
		
		
		
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
	      System.out.println("??????????");                  	
	  // System.out.println("?????? ??????????????"+scinematic.getPlayState());                 	
	                        time = scinematic.getTime();
	                    } else {
	      System.out.println("????????????????");     	    
	                    	scinematic.play();
	                	
	                    }
	                }

	       //      if (scinematic.getPlayState() != PlayState.Playing) {
	                    if (name.equals("navFwd") && keyPressed) {
	    System.out.println("????????@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ??????????????"+scinematic.getTime());
	                       if(scinematic.getPlayState()== PlayState.Stopped || scinematic.getTime()>=scinematic.getInitialDuration()-0.4){
	    	                   System.out.println("???????????? ?????????????????????????????? ????????????");   
	                    	   return;
	                        }
	                        time = scinematic.getTime();
	                        time += 10;
	                        time=FastMath.clamp(time, 0, scinematic.getInitialDuration());
	                        scinematic.setTime(time,10);
	    System.out.println("??????????????@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");                    
	                       
	                    }
	                    if (name.equals("navBack") && keyPressed) {
	                    	if(scinematic.getPlayState()== PlayState.Stopped || scinematic.getTime()>=scinematic.getInitialDuration()-0.4){
		    	                   System.out.println("???????????? ?????????????????????????????? ????????????");   
		                    	   return;
		                        }
	    System.out.println("????????"); 
	                        time = scinematic.getTime();
	                        time += -10;
	                        FastMath.clamp(time, 0, scinematic.getInitialDuration());
	                        scinematic.setTime(time,-10);
	                      //  scinematic.play();
	                    }
	                    
	                    if(name.equals("firstmtv") && keyPressed){
	                    	System.out.println("?? ????1 ????????");
	                    	//scinematic.watch("E:/space/love.flv");
	                    	try {
								watch.invoke(scinematic, "E:/space/love.flv");
							} catch (IllegalAccessException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IllegalArgumentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (InvocationTargetException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	                    	
	                    }
	                    
	                    if(name.equals("secondmtv")&& keyPressed){
	                    	System.out.println("?? ????2 ????????");
	                    	scinematic.watch("E:/space/zhuniyilushunfeng.flv");
	                    	
	                    }
	                    
	                    if(name.equals("song")&& keyPressed){
	                    	System.out.println("?? ????3 ????????");
	                    	scinematic.watch("E:/space/sunwukong.mp3");
	                    	
	                    }
	                    
	                    
	                   if(name.equals("realtimetv")&& keyPressed){
	                    	System.out.println("?? ????4 ????????");
	                    	//scinematic.watch("rtsp://officetv.bupt.edu.cn/HNWS");
	                    	scinematic.watch("rtsp://58.200.131.2/cctv-4");
	                    	//scinematic.watch("rtsp://58.200.131.2/HNWS/audio");
	                    }
	                    
	                    if(name.equals("denghuolanshan")&& keyPressed){
	                    	System.out.println("?? ????5 ????????");
	                    	scinematic.watch("E:/space/????????.mp3");
	                    	
	                    }
	                    

	               // }
	            }
	        };
	        inputManager.addListener(acl, "togglePause", "navFwd", "navBack","firstmtv","secondmtv","song","realtimetv","denghuolanshan");
	    }

}
