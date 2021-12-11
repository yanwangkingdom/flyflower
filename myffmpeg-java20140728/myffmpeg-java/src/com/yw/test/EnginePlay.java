package com.yw.test;







import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;




import java.awt.image.BufferedImage;






import java.io.File;

import javax.imageio.ImageIO;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.yw.ffmpegj.FFEngine;
import com.yw.ffmpegj.FFEngine.ReadThread;
import com.yw.ffmpegj.libavcodec.*;
import com.yw.ffmpegj.libavformat.AVFormatContext;
import com.yw.ffmpegj.libavformat.AVFormatLibrary;
import com.yw.ffmpegj.libavformat.AVInputFormat;
import com.yw.ffmpegj.libavformat.AVStream;
import com.yw.ffmpegj.libavutil.*;
import com.yw.ffmpegj.libsws.SwsLibrary;

/** 这个测试类是基于avformatcontext类中streams变量是一个pointerbyrefrence类型的的时候
 * 首先得到这个二维这个指针的指针（pointer对象）然后调用pointer.gerpointerarray(int offset,int arraysize)
 * 得到指针数组 然后分别用指针数组中下标是0和1的pointer来分别构造出avstream
 * @author wang
 *
 */
public class EnginePlay {
	public static void main(String[] args) throws Exception
	{
	FFEngine ffengine=new FFEngine();
	ffengine.initAndStart();
	
		
		
		//open_video(448,332);
		//imageFrame.setImage(engine.bi);
		
	}
	
	
	static ImageFrame imageFrame;
	static void open_video(int width, int height)
	{

		imageFrame = new ImageFrame("FFMPEG Video");

		imageFrame.setImageSize(width, height);
		imageFrame.setLocation(200, 200);
		imageFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0); // TODO: shutdown properly
			}
		});
		imageFrame.setVisible(true);

	}
	
	

}
