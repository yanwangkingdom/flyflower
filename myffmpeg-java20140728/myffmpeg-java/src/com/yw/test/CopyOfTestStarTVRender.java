package com.yw.test;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.renderer.queue.RenderQueue.Bucket;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Quad;
import com.jme3.texture.Texture;
import com.jme3.texture.Texture2D;
import com.yw.startv.StarCinematic;

public class CopyOfTestStarTVRender  extends SimpleApplication {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("ffmpegj.videodebug", "true");
		System.setProperty("ffmpegj.audiodebug", "true");
		CopyOfTestStarTVRender startv= new CopyOfTestStarTVRender();
		startv.start();
	}

	@Override
	public void simpleInitApp() {
		// TODO Auto-generated method stub
		
		StarCinematic scinematic=new StarCinematic();
		
		
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
	     g.setMaterial(mat);
	     rootNode.attachChild(g);
	     scinematic.play();
		
		
	}

}
