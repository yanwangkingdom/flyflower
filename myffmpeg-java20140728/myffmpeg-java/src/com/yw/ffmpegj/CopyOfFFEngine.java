package com.yw.ffmpegj;
import java.awt.image.BufferedImage;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.yw.ffmpegj.libavcodec.AVCodec;
import com.yw.ffmpegj.libavcodec.AVCodecContext;
import com.yw.ffmpegj.libavcodec.AVCodecLibrary;
import com.yw.ffmpegj.libavcodec.AVPacket;
import com.yw.ffmpegj.libavcodec.AVPacket.ByReference;
import com.yw.ffmpegj.libavformat.AVFormatContext;
import com.yw.ffmpegj.libavformat.AVFormatLibrary;
import com.yw.ffmpegj.libavformat.AVStream;
import com.yw.ffmpegj.libavutil.AVFrame;
import com.yw.ffmpegj.libavutil.AVPixelFormat;
import com.yw.ffmpegj.libavutil.AVUtilLibrary;
import com.yw.ffmpegj.libsws.SwsLibrary;
import com.yw.test.FrameDataToImage;
public class CopyOfFFEngine implements FFController{
	final AVFormatLibrary AVFORMAT = AVFormatLibrary.INSTANCE;
	final AVCodecLibrary AVCODEC = AVCodecLibrary.INSTANCE;
	final AVUtilLibrary AVUTIL = AVUtilLibrary.INSTANCE;
	final SwsLibrary SWSSCALE= SwsLibrary.INSTANCE;
	ConcurrentLinkedQueue<AVPacket.ByReference> videoqueue;
	ConcurrentLinkedQueue <AVPacket.ByReference> audioqueue;
	ConcurrentLinkedQueue <AVPacket.ByReference> subtitlequeue;
	ConcurrentLinkedQueue <AVPacket.ByReference> freequeue;
	ConcurrentLinkedQueue<VideoPicture> pictq;
	ConcurrentLinkedQueue<VideoPicture> freepictq;
	
	AVStream.ByReference videostream,audiostream,subtitlestream=null;
    AVFormatContext.ByReference formatCtx;
	
	String filename;
	volatile boolean paused=false;
	volatile int avpackettotal=0;
	
	public BufferedImage bi;
	
	
	public void initVariable(){
		filename="E:\\02.flv";
		
		freequeue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
		int freepacketsize=15;
		for(int i=0;i<freepacketsize;i++){
			AVPacket.ByReference freepacket=new AVPacket.ByReference();
			freequeue.add(freepacket);
		}
		avpackettotal+=freepacketsize;
		
	    videoqueue=new 	ConcurrentLinkedQueue<AVPacket.ByReference>();
	    audioqueue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
	    subtitlequeue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
	    pictq = new ConcurrentLinkedQueue<VideoPicture>();
	    freepictq = new ConcurrentLinkedQueue<VideoPicture>();
	    
	    AVFORMAT.av_register_all();
	    
	    
	    Thread readt=new Thread(new ReadThread());
	    Thread videot=new Thread(new VideoThread());
	    readt.start();
	    videot.start();
	    
	}
	
	public class ReadThread implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Pointer pavformatctxt = AVFORMAT.avformat_alloc_context();
			PointerByReference ppFormatctx=new PointerByReference(pavformatctxt);
			if(AVFORMAT.avformat_open_input(ppFormatctx, filename, null, null)!=0){
				System.out.println("can not open file");
			}
			
			formatCtx = new AVFormatContext.ByReference(pavformatctxt);
			if (AVFORMAT.avformat_find_stream_info(pavformatctxt,null) < 0)
			    throw new RuntimeException("Couldn't find stream information"); // Couldn't find stream information
		     
			 AVFORMAT.av_dump_format(pavformatctxt, 0, filename, 0);
			
			 formatCtx.read();
			 
			 int videoindex=-1 ,audioindex =-1,subtitleindex=-1; 
			
			for(int i=0;i<formatCtx.nb_streams;i++){
				Pointer []streampointers=formatCtx.streams.getPointer().getPointerArray(0, formatCtx.nb_streams);
				AVStream.ByReference stream=new AVStream.ByReference(streampointers[i]);
		    	System.out.println(stream.codec+"  "+stream.size()+"peer  "+streampointers[i].hashCode());
		    	final AVCodecContext.ByReference codecCtx = new AVCodecContext.ByReference(stream.codec);
		    	System.out.println("codecCtx " + i + ": " + codecCtx.codec_type);
		    	if (codecCtx.codec_type == AVUtilLibrary.AVMediaType.AVMEDIA_TYPE_VIDEO)
		        {
		            videoindex=i;
		           
		            videostream=stream;
		            continue;
		        }
		    	if (codecCtx.codec_type == AVUtilLibrary.AVMediaType.AVMEDIA_TYPE_AUDIO)
		        {
		            audioindex=i;
		            
		            audiostream=stream;
		            continue;
		        }
		    	if (codecCtx.codec_type == AVUtilLibrary.AVMediaType.AVMEDIA_TYPE_SUBTITLE)
		        {
		            subtitleindex=i;
		            
		            subtitlestream=stream;
		            continue;
		        }
		    }
		    if (videoindex==-1 && audioindex ==-1 && subtitleindex ==-1){
		        throw new RuntimeException("Didn't find a  stream"); // Didn't find a video stream
			}
		   while(true){
			   
		   
		        AVPacket.ByReference packet = freequeue.poll();
		        if(packet==null){
		     	   packet=new AVPacket.ByReference();
		     	   avpackettotal++;
		        }
		       AVFORMAT.av_read_frame(pavformatctxt, packet);
		       boolean added;
		       if(packet.stream_index==videoindex){
		    	   do{
		    		   added =videoqueue.add(packet);
		    	   }while(!added);
		    	
		       }
		     /*  else if(packet.stream_index==audioindex){
		    	   do{
		    		   added = audioqueue.add(packet);
		    	   }while(!added);
		    	
		       }
		       else if(packet.stream_index==subtitleindex){
		    	  do{
		    		  added=subtitlequeue.add(packet);
		    	  }while(!added);
		    	
		       }*/
		   }
		}
	}
	
	public class VideoThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
            final AVCodecContext.ByReference codecCtx = new AVCodecContext.ByReference(videostream.codec);
            if (codecCtx.codec_id == 0)
    	    	throw new RuntimeException("Codec id is zero (no codec)");
            
            
    	    Pointer pcodec= AVCODEC.avcodec_find_decoder(codecCtx.codec_id);
    	  
    	    if(pcodec==null){
    	    	System.out.println("指针为空");
    	    }
    	    
    	    AVCodec.ByReference codec=new AVCodec.ByReference(pcodec);
    	    System.out.println(codec.id);
    	    
    	    
    	    //System.out.println(codec.name.getString(0));
    	    //System.out.println(codec.capabilities);
    	    int opencodec=AVCODEC.avcodec_open2(videostream.codec, pcodec,null);
    	    codecCtx.read();
    	    if(codecCtx.codec==null){
    	    	System.out.println("解码上下文中的codec指针为空 不能打开解码器");
    	    }
    	    
    	    
    	    codec.read();
    	  // int opencodec=AVCODEC.avcodec_open2(codecCtx, codec,null);
    	    System.out.println("我 打开了codec"+opencodec);
    	    if(opencodec < 0)
    	    	throw new RuntimeException("Could not open codec"); // Could not open codec
    	    
    	     int count=8;
	    	
    		 final Pointer nativeframe = AVCODEC.avcodec_alloc_frame();
    		 AVFrame.ByReference frame=new AVFrame.ByReference(nativeframe);
    		 final Pointer frameRGB = AVCODEC.avcodec_alloc_frame();
    		    if (frameRGB == null)
    		    	throw new RuntimeException("Could not allocate frame");
    		    
    		    
    		  
    		    
    		    
    		    final int numBytes= AVCODEC.avpicture_get_size(AVPixelFormat.AV_PIX_FMT_RGB24, codecCtx.width, codecCtx.height);
    		    
    		    final Pointer buffer = AVUTIL.av_malloc(numBytes);
    		    AVCODEC.avpicture_fill(frameRGB, buffer, AVPixelFormat.AV_PIX_FMT_RGB24, codecCtx.width, codecCtx.height);
    		    AVFrame.ByReference distframe=new  AVFrame.ByReference(frameRGB);
    		    
    		    AVPacket.ByReference packet ;
    		    while(true){
    		         do{
    		    	  packet=videoqueue.poll();
    		          }while(packet==null);
    		    
    		  
    		    	
    		    	
    		    	final IntByReference got_picture = new IntByReference();
    	    		int result=AVCODEC.avcodec_decode_video2(codecCtx, nativeframe, got_picture, packet);
    	    		 AVCODEC.av_free_packet(packet.getPointer());
    	    		 boolean added;
    	    		 do{
    	    			 added= freequeue.add(packet);
    	    		 }while(!added);
    	    		 
    	    		 if(got_picture.getValue() != 0){
    	    			 long framepts=AVUTIL.av_frame_get_best_effort_timestamp(nativeframe);//需要调用这个本地方法计算出frame的pts （这个时间是没有*基础时间的）以后这个值需要手动写入到avframe的成员变量pts上
    		    		   frame.read();
    		    		   
    		    		   int[] srclinesizes=frame.linesize;
    			    		Pointer[] srcdata=frame.data;
    			    		Pointer pswscontext=null;
    		    			pswscontext= SWSSCALE.sws_getCachedContext(pswscontext, codecCtx.width, codecCtx.height, AVPixelFormat.AV_PIX_FMT_YUV420P, codecCtx.width, codecCtx.height, AVPixelFormat.AV_PIX_FMT_RGB24, 0, null, null, null);
    		    			if(pswscontext==null){
    		    				throw new RuntimeException("no swscalecontext");
    		    			}
    		    			 
    		    			SWSSCALE.sws_scale(pswscontext, srcdata, srclinesizes, 0, codecCtx.height, distframe.data, distframe.linesize);
    		    			
    		    			AVUTIL.av_frame_unref(frame);
    	    		 }
    	    		 
    	    		   final byte[] data = distframe.data[0].getByteArray(0, codecCtx.height * distframe.linesize[0]);
    		    		
    	    		 
    		    		
    	               bi = FrameDataToImage.createImage(data, codecCtx.width, codecCtx.height);
    	    		 
    	    		 
    		    	
    		    }
    		    
    		 
			    
		}
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTime(float time) {
		// TODO Auto-generated method stub
		
	}

		
	

}
