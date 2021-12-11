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
public class Copy_2_of_TestPicturePlay {
	
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
		
		AVFORMAT.av_register_all();
		final PointerByReference ppFormatctx = new PointerByReference();
		
		//AVInputFormat inputformat=new AVInputFormat();
		
		
		if(AVFORMAT.avformat_open_input(ppFormatctx, filename, null, null)!=0){
			System.out.println("can not open file");
		}
		
		System.out.println(ppFormatctx.getValue());
		//final AVFormatContext.ByValue formatCtx = new AVFormatContext.ByValue(ppFormatctx.getValue());
		final AVFormatContext.ByReference formatCtx = new AVFormatContext.ByReference(ppFormatctx.getValue());
		
		
		System.out.println("���Ѿ������ļ�");
		System.out.println(formatCtx.nb_streams);
		System.out.println("file name"+new String(formatCtx.filename));
		
		
		//AVFORMAT.avformat_find_stream_info(formatCtx, null);
		
		if (AVFORMAT.avformat_find_stream_info(ppFormatctx.getValue(),null) < 0)
		    throw new RuntimeException("Couldn't find stream information"); // Couldn't find stream information
	     
		 AVFORMAT.av_dump_format(ppFormatctx.getValue(), 0, filename, 0);
		 System.out.println("wo dump");
		 
		 formatCtx.read();
		 
		int videoStream=-1; 
		 AVStream.ByReference videostream=null;
		for(int i=0;i<formatCtx.nb_streams;i++){
			Pointer []streampointers=formatCtx.streams.getPointer().getPointerArray(0, formatCtx.nb_streams);
			AVStream.ByReference stream=new AVStream.ByReference(streampointers[i]);
	    	System.out.println(stream.codec+"  "+stream.size()+"peer  "+streampointers[i].hashCode());
	    	final AVCodecContext.ByReference codecCtx = new AVCodecContext.ByReference(stream.codec);
	    	System.out.println("codecCtx " + i + ": " + codecCtx.codec_type);
	    	if (codecCtx.codec_type == AVUtilLibrary.AVMediaType.AVMEDIA_TYPE_VIDEO)
	        {
	            videoStream=i;
	            //videostream=new AVStream(streampointers[i]);
	            videostream=stream;
	            break;
	        }
	    }
	    if (videoStream==-1){
	        throw new RuntimeException("Didn't find a video stream"); // Didn't find a video stream
		}

		    	
	    	
	    final AVCodecContext.ByReference codecCtx = new AVCodecContext.ByReference(videostream.codec);
	    
	   
	    
        System.out.println("��������id�ţ�"+codecCtx.codec_id+"    "+codecCtx.width+"   "+codecCtx.height);
	    if (codecCtx.codec_id == 0)
	    	throw new RuntimeException("Codec id is zero (no codec)");   	
		    	
	   // final AVCodec.ByReference codec = AVCODEC.avcodec_find_decoder(codecCtx.codec_id);
	    
	    Pointer pcodec= AVCODEC.avcodec_find_decoder(codecCtx.codec_id);
	  
	    if(pcodec==null){
	    	System.out.println("ָ��Ϊ��");
	    }
	    
	    AVCodec.ByReference codec=new AVCodec.ByReference(pcodec);
	    System.out.println(codec.id);
	    
	    
	    //System.out.println(codec.name.getString(0));
	    //System.out.println(codec.capabilities);
	    int opencodec=AVCODEC.avcodec_open2(videostream.codec, pcodec,null);
	    codecCtx.read();
	    if(codecCtx.codec==null){
	    	System.out.println("�����������е�codecָ��Ϊ�� ���ܴ򿪽�����");
	    }
	    
	    
	    codec.read();
	  // int opencodec=AVCODEC.avcodec_open2(codecCtx, codec,null);
	    System.out.println("�� ����codec"+opencodec);
	    if(opencodec < 0)
	    	throw new RuntimeException("Could not open codec"); // Could not open codec
	    
	   
	    
	    
	  int count=8;
		    	
	 final Pointer nativeframe = AVCODEC.avcodec_alloc_frame();
	 
	// PointerByReference  pbrframe=new PointerByReference(nativeframe);
	 
	 AVFrame.ByReference frame=new AVFrame.ByReference(nativeframe);
	// long testpts=123456;
	 //frame.pts=testpts;
	// frame.writeField("pts");
	    if (frame == null)
	    	throw new RuntimeException("Could not allocate frame");
	    
	  Pointer pavframe[]=nativeframe.getPointerArray(0, count);
	   
	     
	    // Allocate an AVFrame structure
	    final Pointer frameRGB = AVCODEC.avcodec_alloc_frame();
	    if (frameRGB == null)
	    	throw new RuntimeException("Could not allocate frame");
	    
	    
	  
	    
	    
	    final int numBytes= AVCODEC.avpicture_get_size(AVPixelFormat.AV_PIX_FMT_RGB24, codecCtx.width, codecCtx.height);
	    
	    final Pointer buffer = AVUTIL.av_malloc(numBytes);
	    AVCODEC.avpicture_fill(frameRGB, buffer, AVPixelFormat.AV_PIX_FMT_RGB24, codecCtx.width, codecCtx.height);
	    
	    AVFrame.ByReference distframe=new  AVFrame.ByReference(frameRGB);
	   
	   // Pointer blendframe[]=frameRGB.getPointerArray(0, 8);
	    open_video(codecCtx.width, codecCtx.height);
	    
	    final AVPacket.ByReference packet = new AVPacket.ByReference();
	    
	    /*final AVPacket.ByReference testpacket = new AVPacket.ByReference();
	    testpacket.pts=testpts;
	    testpacket.writeField("pts");
	    int mysize=5678;
	    testpacket.size=mysize;
	    testpacket.writeField("size");
	    AVCODEC.av_free_packet(testpacket.getPointer());
	    testpacket.read();*/
	   
	    
	  //  Image image=ImageIO.read(new File("D:\\jinjin.jpg"));
	   // AVRational.ByValue framerate=new AVRational.ByValue();
	    AVRational.ByValue framerate = AVFORMAT.av_guess_frame_rate(ppFormatctx.getValue(), videostream.getPointer(), null);
	 // AVRational framerate = new AVRational(pfrt);
	    double duration=0;
	 if(framerate.num!=0&&framerate.den!=0){
		duration=(double)(framerate.den)/(double)(framerate.num);
	 }
	
	  System.out.println("����ʱ����һ֡��"+duration);
	   int ret=0;
	   int i=0;
	   long systime=System.nanoTime();
	  while (true)
	   {
		    AVCODEC.av_free_packet(packet.getPointer());
		    packet.read();
		    ret= AVFORMAT.av_read_frame(ppFormatctx.getValue(), packet);
		    
		   // packet.read();
		    
		    //ret= AVFORMAT.av_read_frame(ppFormatctx.getValue(), packet);
		    
		    if(ret<0){
		    	System.out.println("û�пɶ��İ������������");
		    	//break;
		    }
	    	if (packet.stream_index == videoStream){
		   
		        
	    		System.out.println("avpacket��ptsʱ���ǣ�"+"   "+packet.pts+"   "+i++);
	    		final IntByReference got_picture = new IntByReference();
	    		int result=AVCODEC.avcodec_decode_video2(codecCtx, nativeframe, got_picture, packet);
	    		//System.out.println("�õ�avframe����"+got_picture.getValue());
	    		packet.read();
	    	   if(got_picture.getValue() != 0){
	    		   
	    		   long framepts=AVUTIL.av_frame_get_best_effort_timestamp(nativeframe);//��Ҫ����������ط��������frame��pts �����ʱ����û��*����ʱ��ģ��Ժ����ֵ��Ҫ�ֶ�д�뵽avframe�ĳ�Ա����pts��
	    		  //double picturepts=framepts*(AVUTIL.av_q2d(codec.supported_framerates));
	    		  // System.out.println(frame.sample_aspect_ratio.den);
	    		   if(videostream.time_base.den>0){
	    			   System.out.println(videostream.time_base.num+"   "+videostream.time_base.den+"   "+framepts);
	    		  double picturepts=framepts*((double)(videostream.time_base.num)/(double)(videostream.time_base.den));
	    		  
	    		  System.out.println("avframe��ptsʱ���ǣ�"+picturepts+"avframeһ֡�ĳ���ʱ��");
	    		   }
	    		   frame.read();
	    		   
	    		  
	    		//System.out.println("����ɹ���result="+result);
	    		  
	    		   long decodetime=System.nanoTime();
	    		//System.out.println("����һ֡��Ҫ��ʱ���ǣ�"+(decodetime-systime));
	    		systime=decodetime;
	    		
	    		
	    		
	    		int[] srclinesizes=frame.linesize;
	    		Pointer[] srcdata=frame.data;
	    		System.out.println("���鳤��"+srcdata.length);
	    		for(int p=0;p<srcdata.length;p++){
	    			if(srcdata!=null){
	    				if(srcdata[p]!=null)
	    				//System.out.println(ps[p].getByte(p*8));
	    					System.out.println(p);
	    			}
	    		}
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		
	    			Pointer pswscontext=null;
	    			pswscontext= SWSSCALE.sws_getCachedContext(pswscontext, codecCtx.width, codecCtx.height, AVPixelFormat.AV_PIX_FMT_YUV420P, codecCtx.width, codecCtx.height, AVPixelFormat.AV_PIX_FMT_RGB24, 0, null, null, null);
	    			if(pswscontext==null){
	    				throw new RuntimeException("no swscalecontext");
	    			}
	    			 
	    			SWSSCALE.sws_scale(pswscontext, srcdata, srclinesizes, 0, codecCtx.height, distframe.data, distframe.linesize);
	    			AVUTIL.av_frame_unref(frame);
	    		}
	    		
	    	   
	    		
	    		 
	    		 
	    		 
	    	     
	    	final byte[] data = distframe.data[0].getByteArray(0, codecCtx.height * distframe.linesize[0]);
	    		
	    		 
	    		
                final BufferedImage bi = FrameDataToImage.createImage(data, codecCtx.width, codecCtx.height);
        		imageFrame.setImage(bi);
        		
        		
	    		
	    	}
	    		
	    		
	    	//imageFrame.setImage(image);    
	
	    	
	   }
	  
	  
	 // AVUTIL.get_frame_defaults(frame);//����������������� ��Ҫ�о�����ŵ�ʲôλ��
	  
	 //  System.out.println("Ҫ��ʼ�������ڴ��С"+numBytes);
	 //  System.out.println("secsecss");
	   
	   
	   //AVUTIL.av_frame_free(frameRGB);

	    // Free the YUV frame
	   // AVUTIL.av_frame_free(nativeframe);

	    // Close the codec
	  //  AVCODEC.avcodec_close(codecCtx);

	    // Close the video file
	    //AVFORMAT.avformat_close_input(formatCtx);
	    
		//System.out.println("Done");
	   
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
