package com.yw.test;







import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;




import java.awt.image.BufferedImage;






import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import javax.imageio.ImageIO;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.yw.ffmpegj.libavcodec.*;
import com.yw.ffmpegj.libavformat.AVFormatContext;
import com.yw.ffmpegj.libavformat.AVFormatLibrary;
import com.yw.ffmpegj.libavformat.AVInputFormat;
import com.yw.ffmpegj.libavformat.AVStream;
import com.yw.ffmpegj.libavutil.*;
import com.yw.ffmpegj.libfilter.AVFilterLibrary;
import com.yw.ffmpegj.libsws.SwsLibrary;

/** 这个测试类是基于avformatcontext类中streams变量是一个pointerbyrefrence类型的的时候
 * 首先得到这个二维这个指针的指针（pointer对象）然后调用pointer.gerpointerarray(int offset,int arraysize)
 * 得到指针数组 然后分别用指针数组中下标是0和1的pointer来分别构造出avstream
 * @author wang
 *
 */
public class TestPointer {
	
	//public ByteBuffer framedata0;
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("jna.debug_load", "true");
		
		
        final String filename = "E:\\02.flv";
		//final String filename = "rtsp://officetv.bupt.edu.cn/HNWS";
		//final String filename = "E:\\03.rm";
		final AVFormatLibrary AVFORMAT = AVFormatLibrary.INSTANCE;
		final AVCodecLibrary AVCODEC = AVCodecLibrary.INSTANCE;
		final AVUtilLibrary AVUTIL = AVUtilLibrary.INSTANCE;
		final SwsLibrary SWSSCALE= SwsLibrary.INSTANCE;
		
		
		    	
	 final Pointer pointer = AVUTIL.av_malloc(10);
	 
	// PointerByReference  pbrframe=new PointerByReference(nativeframe);
	 
	ByteBuffer buffer=pointer.getByteBuffer(0, 10);
	System.out.println("缓存的位置"+buffer.position());
	System.out.println("缓存的限制"+buffer.limit());
	System.out.println("缓存的容量"+buffer.capacity());
	byte [] test=new byte[]{1,2,3,4,5,6};
	pointer.write(0, test, 0, 6);
	System.out.println("缓存的位置"+buffer.position());
	System.out.println("缓存的限制"+buffer.limit());
	System.out.println("缓存的容量"+buffer.capacity());
	Pointer sp=pointer.share(3);
	System.out.println(sp.getByte(0));
	AVPacket.ByValue avpac=new AVPacket.ByValue();
	avpac.data=pointer;
	avpac.writeField("data", pointer);
	avpac.read();
	System.out.println("avpacket.data 的地址是"+avpac.data.hashCode());
	Pointer avpacshare =avpac.data.share(3);
	avpac.data=avpacshare;
	System.out.println("替换后avpacket.data 的地址是"+avpac.data.hashCode());
	avpac.write();
	avpac.read();
	System.out.println("替换并写并读后的avpacket.data 的地址是"+avpac.data.hashCode());
	//pointer.setPointer(3, pointer);
	//System.out.println("便宜以后的peer对应的值"+pointer.getByte(0));
	/*for(int i=0;i<buffer.capacity();i++){
		System.out.println(buffer.get());
	}*/
	int [] val=new int[]{1,-1};
	System.out.println(Integer.toHexString(29));
	int num=1;
	int den=44100;
	System.out.println(num+"/"+den);
	
	//AVUTIL.av_opt_set_int_list(pointer, pointer, pointer, pointer, pointer);
	}
	
	
}
