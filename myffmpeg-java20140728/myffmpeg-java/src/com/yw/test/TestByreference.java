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
import com.yw.ffmpegj.libsws.SwsLibrary;

/** ����������ǻ���avformatcontext����streams������һ��pointerbyrefrence���͵ĵ�ʱ��
 * ���ȵõ������ά���ָ���ָ�루pointer����Ȼ�����pointer.gerpointerarray(int offset,int arraysize)
 * �õ�ָ������ Ȼ��ֱ���ָ���������±���0��1��pointer���ֱ����avstream
 * @author wang
 *
 */
public class TestByreference {
	
	static final AVFormatLibrary AVFORMAT = AVFormatLibrary.INSTANCE;
	static final AVCodecLibrary AVCODEC = AVCodecLibrary.INSTANCE;
	static final AVUtilLibrary AVUTIL = AVUtilLibrary.INSTANCE;
	static final SwsLibrary SWSSCALE= SwsLibrary.INSTANCE;
	
	//public ByteBuffer framedata0;
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("jna.debug_load", "true");
		
		
        final String filename = "E:\\02.flv";
		//final String filename = "rtsp://officetv.bupt.edu.cn/HNWS";
		//final String filename = "E:\\03.rm";
		
		
		
		    	
	 final Pointer pointer = AVUTIL.av_malloc(10);
	 
	// PointerByReference  pbrframe=new PointerByReference(nativeframe);
	 
	ByteBuffer buffer=pointer.getByteBuffer(0, 10);
	System.out.println("�����λ��"+buffer.position());
	System.out.println("���������"+buffer.limit());
	System.out.println("���������"+buffer.capacity());
	byte [] test=new byte[]{1,2,3,4,5,6};
	pointer.write(0, test, 0, 6);
	System.out.println("�����λ��"+buffer.position());
	System.out.println("���������"+buffer.limit());
	System.out.println("���������"+buffer.capacity());
	Pointer sp=pointer.share(3);
	System.out.println(sp.getByte(0));
	AVPacket.ByReference avpac=new AVPacket.ByReference();
	avpac.data=pointer;
	avpac.writeField("data", pointer);
	avpac.read();
	System.out.println("avpacket.data �ĵ�ַ��"+avpac.data.hashCode());
	
	Pointer avpacshare =avpac.data.share(3);
	avpac.data=avpacshare;
	avpac.read();
	System.out.println("�滻��avpacket.data �ĵ�ַ��"+avpac.data.hashCode());
	avpac.write();
	avpac.read();
	System.out.println("�滻��д�������avpacket.data �ĵ�ַ��"+avpac.data.hashCode());
	//pointer.setPointer(3, pointer);
	//System.out.println("�����Ժ��peer��Ӧ��ֵ"+pointer.getByte(0));
	/*for(int i=0;i<buffer.capacity();i++){
		System.out.println(buffer.get());
	}*/
	
	testByvalue();
	
	}
	
	public static void testByvalue(){
		// AVRational.ByReference timebase = new AVRational.ByReference();
		 AVRational.ByValue timebase = new AVRational.ByValue();
   		 timebase.num=1;
   		 timebase.den=1000;
   		 timebase.write();
   		 timebase.read();
   		AVRational.ByValue audiosprate=new AVRational.ByValue();
   		
   		audiosprate.num=1;
      	audiosprate.writeField("num", 1);
      	audiosprate.den=44100;
        audiosprate.writeField("den", 44100);
        audiosprate.read();
      	long pktpts=23;
      	System.out.println("avaudio��pkt����pts"+pktpts);
      	long audioframepts=AVUTIL.av_rescale_q(pktpts, timebase, audiosprate);
      	System.out.println("ת�����pts"+audioframepts);
	}

}
