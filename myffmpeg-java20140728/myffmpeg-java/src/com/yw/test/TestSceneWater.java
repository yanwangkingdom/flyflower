/*
 * Copyright (c) 2009-2012 jMonkeyEngine
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'jMonkeyEngine' nor the names of its contributors
 *   may be used to endorse or promote products derived from this software
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.yw.test;

import com.jme3.app.SimpleApplication;
import com.jme3.asset.plugins.HttpZipLocator;
import com.jme3.asset.plugins.ZipLocator;
import com.jme3.cinematic.PlayState;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.*;
import com.jme3.renderer.queue.RenderQueue.ShadowMode;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Quad;
import com.jme3.scene.shape.Sphere;
import com.jme3.texture.Texture2D;
import com.jme3.util.SkyFactory;
import com.jme3.water.SimpleWaterProcessor;
import com.yw.startv.StarCinematic;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import jme3test.water.WaterUI;

public class TestSceneWater extends SimpleApplication {

    // set default for applets
    private static boolean useHttp = false;
    StarCinematic scinematic;
    float time;

    public static void main(String[] args) {
    	System.setProperty("ffmpegj.audiodebug", "true");
        TestSceneWater app = new TestSceneWater();
        app.start();
    System.out.println("怎么回事呢！！！！！！！！！！！！！！！！");    
    }

    public void simpleInitApp() {
        this.flyCam.setMoveSpeed(10);
        Node mainScene=new Node();
        cam.setLocation(new Vector3f(-27.0f, 1.0f, 75.0f));
        cam.setRotation(new Quaternion(0.03f, 0.9f, 0f, 0.4f));

        // load sky
        mainScene.attachChild(SkyFactory.createSky(assetManager, "Textures/Sky/Bright/BrightSky.dds", false));

        
        File file = new File("E:/eclipse-standardworkspaces/myffmpeg-java/wildhouse.zip");
        if (file.exists()) {
            useHttp = false;
        }
        // create the geometry and attach it
        // load the level from zip or http zip
        if (useHttp) {
            assetManager.registerLocator("http://jmonkeyengine.googlecode.com/files/wildhouse.zip", HttpZipLocator.class);
        } else {
            assetManager.registerLocator("wildhouse.zip", ZipLocator.class);
        }
        Spatial scene = assetManager.loadModel("main.scene");

        DirectionalLight sun = new DirectionalLight();
        Vector3f lightDir=new Vector3f(-0.37352666f, -0.50444174f, -0.7784704f);
        sun.setDirection(lightDir);
        sun.setColor(ColorRGBA.White.clone().multLocal(2));
        scene.addLight(sun);

        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setTexture("ColorMap", assetManager.loadTexture("Interface/Logo/Monkey.jpg"));
           //add lightPos Geometry
        Sphere lite=new Sphere(8, 8, 3.0f);
        Geometry lightSphere=new Geometry("lightsphere", lite);
        lightSphere.setMaterial(mat);
        Vector3f lightPos=lightDir.multLocal(-400);
        lightSphere.setLocalTranslation(lightPos);
        rootNode.attachChild(lightSphere);


        SimpleWaterProcessor waterProcessor = new SimpleWaterProcessor(assetManager);
        waterProcessor.setReflectionScene(mainScene);
        waterProcessor.setDebug(false);
        waterProcessor.setLightPosition(lightPos);
        waterProcessor.setRefractionClippingOffset(1.0f);


        //setting the water plane
        Vector3f waterLocation=new Vector3f(0,-20,0);
        waterProcessor.setPlane(new Plane(Vector3f.UNIT_Y, waterLocation.dot(Vector3f.UNIT_Y)));
        WaterUI waterUi=new WaterUI(inputManager, waterProcessor);
        waterProcessor.setWaterColor(ColorRGBA.Brown);
        waterProcessor.setDebug(true);
        //lower render size for higher performance
//        waterProcessor.setRenderSize(128,128);
        //raise depth to see through water
//        waterProcessor.setWaterDepth(20);
        //lower the distortion scale if the waves appear too strong
//        waterProcessor.setDistortionScale(0.1f);
        //lower the speed of the waves if they are too fast
//        waterProcessor.setWaveSpeed(0.01f);

        Quad quad = new Quad(400,400);
      System.out.println("宽："+quad.getWidth()+"高："+quad.getHeight());  

        //the texture coordinates define the general size of the waves
        quad.scaleTextureCoordinates(new Vector2f(6f,6f));

        Geometry water=new Geometry("water", quad);
        water.setShadowMode(ShadowMode.Receive);
        water.setLocalRotation(new Quaternion().fromAngleAxis(-FastMath.HALF_PI, Vector3f.UNIT_X));
        water.setMaterial(waterProcessor.getMaterial());
        water.setLocalTranslation(-200, -20, 250);

        rootNode.attachChild(water);

        viewPort.addProcessor(waterProcessor);

        mainScene.attachChild(scene);
        
      //  seekchild(mainScene);
      
        
     //以下是星际电影的代码   
        
        scinematic =new StarCinematic();
        initInputs();
		
		 stateManager.attach(scinematic);
		 rootNode.attachChild(mainScene);   
		
		 Material mymat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
		
		Texture2D sctexture = scinematic.getTex2d();
		
		
		mymat.setTexture("ColorMap", sctexture);
		 Quad q = new Quad(320,180,true);
		
	     Geometry g = new Geometry("quad", q);
	     g.setLocalTranslation(-195, -20, -250);
	     g.setMaterial(mymat);
	     
	     rootNode.attachChild(g);
         
	    
		 
	     scinematic.play();
    }
    
    public void seekchild(Node node){
    	System.out.println("node  "+node.getName()+"位置 ："+node.getLocalTranslation());
    	List <Spatial >childrens = node.getChildren();
    	for(Spatial s :childrens){
    		if(s instanceof Node){
    			seekchild((Node)s);
    		}
    		System.out.println(s.getName()+"位置 ：   "+s.getLocalTranslation());
    		
    	}
    	
    }
    
    
    private void initInputs() {
        inputManager.addMapping("togglePause", new KeyTrigger(keyInput.KEY_RETURN));
        inputManager.addMapping("navFwd", new KeyTrigger(keyInput.KEY_RBRACKET));
        inputManager.addMapping("navBack", new KeyTrigger(keyInput.KEY_LBRACKET));
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
                        //scinematic.play();
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

               // }
            }
        };
        inputManager.addListener(acl, "togglePause", "navFwd", "navBack");
    }

}
