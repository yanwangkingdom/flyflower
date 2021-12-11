package com.yw.ffmpegj;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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
import com.yw.ffmpegj.libavutil.AVRational;
import com.yw.ffmpegj.libavutil.AVUtilLibrary;
import com.yw.ffmpegj.libfilter.AVFilterLibrary;
import com.yw.ffmpegj.libsws.SwsLibrary;
import com.yw.test.FrameDataToImage;
import com.yw.test.ImageFrame;
public class Copy_2_of_FFEngine implements FFController{
	 static final boolean videodebug = Boolean.getBoolean("ffmpegj.videodebug");
	 
	 long AVDuration;//要播放的音频文件的总时长 是以微妙为单位的
	
	final AVFormatLibrary AVFORMAT = AVFormatLibrary.INSTANCE;
	final AVCodecLibrary AVCODEC = AVCodecLibrary.INSTANCE;
	final AVUtilLibrary AVUTIL = AVUtilLibrary.INSTANCE;
	final SwsLibrary SWSSCALE= SwsLibrary.INSTANCE;
	final AVFilterLibrary AVFILTER=AVFilterLibrary.INSTANCE;
	
	ConcurrentLinkedQueue<AVPacket.ByReference> videoqueue;
	ConcurrentLinkedQueue <AVPacket.ByReference> audioqueue;
	ConcurrentLinkedQueue <AVPacket.ByReference> subtitlequeue;
	ConcurrentLinkedQueue <AVPacket.ByReference> freequeue;
	volatile int avpackettotal=0;
	
	ConcurrentLinkedQueue<VideoConnector> unrecyclevpq;
	ConcurrentLinkedQueue<VideoConnector> freevpq;
	
	
	ConcurrentLinkedQueue<AudioConnector> unrecycleauq;
	ConcurrentLinkedQueue<AudioConnector> freeauq;
	
	//AtomicInteger recyclemonitor=new AtomicInteger(0);
	final VideoPicture databox=new VideoPicture();
	final RecycleVP vprecycle =new RecycleVP();
	int vpconnectortotal;
	String filename;
	
	Pointer pavformatctxt;
	AVFormatContext.ByReference formatCtx;
	AVStream.ByReference videostream,audiostream,subtitlestream;
	int videoindex=-1 ,audioindex =-1,subtitleindex=-1; 
    AVCodecContext.ByReference videocodecCtx;
    AVCodec.ByReference videocodec ;
    
	
    AVCodec.ByReference audiocodec ;
	AVCodecContext.ByReference audiocodecCtx;
	final FFAudioData audiobox = new FFAudioData();
	
	public BufferedImage bi;
	ByteBuffer framepointerbuffer;
	
	ByteBuffer framedatabuffer0;
	
	volatile boolean paused=false;
	Lock readpacketlock =new ReentrantLock();
	Lock videolock =new ReentrantLock();
	Lock audiolock =new ReentrantLock();
	Condition readcondition = readpacketlock.newCondition();
	Condition videocondition = readpacketlock.newCondition();
	Condition audiocondition = readpacketlock.newCondition();
	/*public void FFengine(String filename){
		//super();
		this.filename=filename;
		initVariable();
	}*/
	
	
	public void initVariable(){
		
		
		freequeue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
		int freepacketsize=500;
		for(int i=0;i<freepacketsize;i++){
			AVPacket.ByReference freepacket=new AVPacket.ByReference();
			 AVCODEC.av_free_packet(freepacket.getPointer());
			 freepacket.read();
			freequeue.add(freepacket);
		}
		avpackettotal+=freepacketsize;
		
	    videoqueue=new 	ConcurrentLinkedQueue<AVPacket.ByReference>();
	    audioqueue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
	    subtitlequeue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
	    unrecyclevpq = new ConcurrentLinkedQueue<VideoConnector>();
	   
	 
	    
	    
	    
	    AVFORMAT.av_register_all();
	    AVFILTER.avfilter_register_all();
	 
       final PointerByReference ppFormatctx = new PointerByReference();
		
	
		
		
		if(AVFORMAT.avformat_open_input(ppFormatctx, filename, null, null)!=0){
			System.out.println("can not open file");
		}
		
		pavformatctxt=ppFormatctx.getValue();
		System.out.println(ppFormatctx.getValue());
		
	    formatCtx = new AVFormatContext.ByReference(ppFormatctx.getValue());
	   // System.out.println(formatCtx.toString());
		
		
		
		if (AVFORMAT.avformat_find_stream_info(pavformatctxt,null) < 0)
		    throw new RuntimeException("Couldn't find stream information"); // Couldn't find stream information
	     
		 AVFORMAT.av_dump_format(pavformatctxt, 0, filename, 0);
		
		 formatCtx.read();
		 
		 AVDuration=formatCtx.duration;//持续时间是以微妙为单位的
		System.out.println("av的持续时间是："+AVDuration);
		
		for(int i=0;i<formatCtx.nb_streams;i++){
			Pointer []streampointers=formatCtx.streams.getPointer().getPointerArray(0, formatCtx.nb_streams);
			AVStream.ByReference stream=new AVStream.ByReference(streampointers[i]);
	    	System.out.println(stream.codec+"  "+stream.size()+"peer  "+streampointers[i].hashCode());
	    	final AVCodecContext.ByReference codecCtx = new AVCodecContext.ByReference(stream.codec);
	    	System.out.println("codecCtx " + i + ": " + codecCtx.codec_type);
	    	if (codecCtx.codec_type == AVUtilLibrary.AVMediaType.AVMEDIA_TYPE_VIDEO)
	        {
	            videoindex=i;
	          System.out.println("视频的下标是："+videoindex); 
	            videostream=stream;
	            continue;
	        }
	    	if (codecCtx.codec_type == AVUtilLibrary.AVMediaType.AVMEDIA_TYPE_AUDIO)
	        {
	            audioindex=i;
	            
	            audiostream=stream;
//System.out.println(audiostream.toString());	            
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
	    
	    

        videocodecCtx = new AVCodecContext.ByReference(videostream.codec);
        if (videocodecCtx.codec_id == 0)
	    	throw new RuntimeException("video Codec id is zero (no codec)");
        
        audiocodecCtx=new AVCodecContext.ByReference(audiostream.codec);
        if (videocodecCtx.codec_id == 0)
	    	throw new RuntimeException("audio Codec id is zero (no codec)");
        
	    Pointer pvideocodec= AVCODEC.avcodec_find_decoder(videocodecCtx.codec_id);
	    Pointer paudiocodec= AVCODEC.avcodec_find_decoder(audiocodecCtx.codec_id);
//System.out.println(videocodecCtx.toString());
	    if(pvideocodec==null){
	    	System.out.println("指针为空");
	    }
	    
	    videocodec = new AVCodec.ByReference(pvideocodec);
	    System.out.println("video解码器的id号是："+videocodec.id);
	    
	    audiocodec = new AVCodec.ByReference(paudiocodec);
	    System.out.println("audio 音频的解码器id号"+audiocodec.id);
//System.out.println(audiocodec.toString());
	    //System.out.println(codec.name.getString(0));
	    //System.out.println(codec.capabilities);
	    int openvidiocodec=AVCODEC.avcodec_open2(videostream.codec, pvideocodec,null);
	    videocodecCtx.read();
	    videocodec.read();
	     if(videocodecCtx.codec==null){
		    	System.out.println("解码上下文中的codec指针为空 不能打开解码器");
		    }
	    
	    
	     int openaudiocodec=AVCODEC.avcodec_open2(audiostream.codec, paudiocodec,null);
	     audiocodecCtx.read();
	     audiocodec.read();
	 
	  
	    if(openvidiocodec < 0)
	    	throw new RuntimeException("Could not open video codec"); // Could not open codec
	    
	    
	    
	    Thread readt=new Thread(new ReadThread());
	    Thread videot=new Thread(new VideoThread());
	    Thread audiot=new Thread(new AudioThread());
	    readt.start();
	    videot.start();
	    audiot.start();
	    
	    
	}
	
	public Copy_2_of_FFEngine(String filename,Collection<? extends VideoConnector> connectors) {
		
		
		
		   super();
		   this.filename=filename;
		   freevpq = new ConcurrentLinkedQueue<VideoConnector>(connectors);
		   vpconnectortotal=connectors.size();
		   initVariable();
	}
	
	public Copy_2_of_FFEngine(String filename,Collection<? extends VideoConnector> videoconnectors,Collection<? extends AudioConnector> audioconnectors) {
		
		this(filename,videoconnectors);
		freeauq=new ConcurrentLinkedQueue<AudioConnector>(audioconnectors);
		
		
	}
	
	

	public Copy_2_of_FFEngine() {
		super();
		// TODO Auto-generated constructor stub
		 initVariable();
	}



	public class ReadThread implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		   while(true){
			   
			   AVPacket.ByReference packet;
			   readpacketlock.lock();
			   try{
				   if(paused==true)
					try {
						readcondition.await();
						
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    packet  = freequeue.poll();
			        if(packet==null){
			     	   //packet=new AVPacket.ByReference();
			     	   //avpackettotal++;
			        	//System.out.println("没有包可以用了");
			        	continue;
			        } 
			        
			        
			        AVFORMAT.av_read_frame(pavformatctxt, packet);
			        formatCtx.read();
				       if(packet.stream_index==videoindex){
				    	  
				    		 videoqueue.add(packet);
				    		// System.out.println("我添加到视频队列的个数:"+videoqueue.size());
				    	  
				    	
				       }
				      else if(packet.stream_index==audioindex){
				    	  
				    		    audioqueue.add(packet);
				    	 
				    	
				       }else{
				    	   AVCODEC.av_free_packet(packet.getPointer());
	        	    		
	        	    	    freequeue.add(packet);
				    	   
				       }
				      /* else if(packet.stream_index==subtitleindex){
				    	
				    		  subtitlequeue.add(packet);
				    	  
				    	
				       }*/
			   }finally{
				   readpacketlock.unlock();
			   }
			   
		   
		       
		       
		   }
		}
	}
	
	public class VideoThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
    		 final Pointer nativeframe = AVCODEC.avcodec_alloc_frame();
    		 AVFrame.ByReference frame=new AVFrame.ByReference(nativeframe);
    		 final Pointer frameRGB = AVCODEC.avcodec_alloc_frame();
    		    if (frameRGB == null)
    		    	throw new RuntimeException("Could not allocate frame");
    		
    		  
    		    
    		    
    		    final int numBytes= AVCODEC.avpicture_get_size(AVPixelFormat.AV_PIX_FMT_RGB24, videocodecCtx.width, videocodecCtx.height);
    		    
    		    final Pointer buffer = AVUTIL.av_malloc(numBytes);
    		    AVCODEC.avpicture_fill(frameRGB, buffer, AVPixelFormat.AV_PIX_FMT_RGB24, videocodecCtx.width, videocodecCtx.height);
    		    AVFrame.ByReference distframe=new  AVFrame.ByReference(frameRGB);
    		    
    		    
    		    
    		    framedatabuffer0 = distframe.data[0].getByteBuffer(0, videocodecCtx.height * distframe.linesize[0]);   //焉 write
      		    
    		  
    		    AVPacket.ByReference packet ;
    		    VideoPicture vp;
    		    double picturepts=0;
    		    boolean isgotframe=false;
    		    double duration=0;
    		    AVRational.ByValue framerate = AVFORMAT.av_guess_frame_rate(pavformatctxt, videostream.getPointer(), null);
    		    if(framerate.num!=0&&framerate.den!=0){
    		    	duration=myav_q2d((double)framerate.den,(double)framerate.num);
    		    }
    		    while(true){
    		    	videolock.lock();
    		    	try{
    		    		if(paused==true)
							try {
								videocondition.await();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
    		    		  
    		    		  if(!isgotframe){
    		    		  packet=videoqueue.poll();
    	    		    	 
        		    	  if(packet==null){
        		    		 // System.out.println("视频队列中的packet是空的");
        		    		  continue;
        		    	  }
    		    		final IntByReference got_picture = new IntByReference();
        	    		int result=AVCODEC.avcodec_decode_video2(videocodecCtx, nativeframe, got_picture, packet);
        	    		frame.read();
        	    		if(videodebug)
        	    		System.out.println("get got_picture:"+got_picture.getValue());
        	    		AVCODEC.av_free_packet(packet.getPointer());
        	    		packet.read();
        	    	    freequeue.add(packet);
    		    		  
        	    		 if(got_picture.getValue() != 0){
        	    			isgotframe=true;
        	    			long framepts =AVUTIL.av_frame_get_best_effort_timestamp(nativeframe);//需要调用这个本地方法计算出frame的pts （这个时间是没有*基础时间的）以后这个值需要手动写入到avframe的成员变量pts上
        	    		    picturepts=framepts*((double)(videostream.time_base.num)/(double)(videostream.time_base.den));
        	    		    frame.read();
        	    		    if(videodebug){
        	    		    	 System.out.println("真正的picture的pts是："+picturepts);
        	    		    }
        	    		   
        	    			 
        	    			}else{
        	    				continue;
        	    			}
    		    		  }
        	    		 
        	    		 VideoConnector connector=freevpq.poll();
     	    			 if(connector==null){
     	    				continue;
     	    				 
     	    			 }
        	    			
        	    			 
        		    		   
        		    		   int[] srclinesizes=frame.linesize;
        			    		Pointer[] srcdata=frame.data;
        			    		Pointer pswscontext=null;
        		    			pswscontext= SWSSCALE.sws_getCachedContext(pswscontext, videocodecCtx.width, videocodecCtx.height, AVPixelFormat.AV_PIX_FMT_YUV420P, videocodecCtx.width, videocodecCtx.height, AVPixelFormat.AV_PIX_FMT_RGB24, 0, null, null, null);
        		    			if(pswscontext==null){
        		    				throw new RuntimeException("no swscalecontext");
        		    			}
        		    			 
        		    			SWSSCALE.sws_scale(pswscontext, srcdata, srclinesizes, 0, videocodecCtx.height, distframe.data, distframe.linesize);
        		    			
        		    		ByteBuffer convertdata=	distframe.data[0].getByteBuffer(0, videocodecCtx.height * distframe.linesize[0]);
        		    			
        		    			AVUTIL.av_frame_unref(frame);
        	    		 
        	    		        distframe.read();
        	    		        
        	    		        
        	    		        
        	    		        
        	    		     
        	    		       
        	    		        ByteBuffer copyedframedata0=cloneDirectBuffer(convertdata);
        	    		    
        	    		        
        	    		    databox.setWidth(videocodecCtx.width);
        	    		    databox.setHeight(videocodecCtx.height);
        	    		    databox.setPts(picturepts);
        	    		    databox.setDuration(duration);
        	    		    databox.setData(copyedframedata0);
        	    		   
        	    		    databox.setVprecycle(vprecycle);
        	    		   boolean added= connector.setData(databox);
        	    		   if(added){
        	    			   unrecyclevpq.add(connector);
        	    		   }
        	    		    
        	    		   // recyclemonitor.getAndDecrement();
        	    		    databox.clean();
        	    		    isgotframe=false;
    		    		 	
    		    		  } 
    		    		
    		    	finally{
    		    		videolock.unlock();
    		    	}
    		         
    		    	
    		    	  
    		    
    		  
    		    	
    		    	
    		    
    	    		 
    	    		// final byte[] data = distframe.data[0].getByteArray(0, videocodecCtx.height * distframe.linesize[0]);
    		    		
    	    		 
    		    		
    	           // bi = FrameDataToImage.createImage(data, videocodecCtx.width, videocodecCtx.height);
    	    		 
    	    		 
    		    	
    		    }
    		    
    		 
			    
		}
		
	}
	
	
	/*public class AudioThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
		int packetperframe=0;	
		final Pointer nativeaudioframe = AVCODEC.avcodec_alloc_frame();
   	    AVFrame.ByReference audioframe=new AVFrame.ByReference(nativeaudioframe);
   	    System.out.println("audioframe to string"+audioframe.toString());
   		 final IntByReference got_audioframe= new IntByReference();
   		 boolean isgotframe=false;
   		 AVPacket.ByReference audiopacket;
   		 long starttime;
   		 starttime=System.nanoTime();
   		 AVRational.ByValue timebase = new AVRational.ByValue();
   		 timebase.num=audiostream.time_base.num;
   		 timebase.den=audiostream.time_base.den;
   		 timebase.write();
   		AVRational.ByValue audiosprate=new AVRational.ByValue();
   		int srcpersamplesize=0;
   		int srcsamplerate=0;
   		int srcchannel=0;
   		int srcformat=0;
   		AVCodecContext.ByReference audiocodeccxt = new AVCodecContext.ByReference(audiostream.codec);
   		 while(true){
		    	audiolock.lock();
		    	try{
		    		if(paused==true)
						try {
							audiocondition.await();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		    		  
		    		  if(!isgotframe){
		    			  packetperframe++;
		    			
		    			  audiopacket=audioqueue.poll();
		    			  
 		    	  if(audiopacket==null){
 		    		 // System.out.println("音频队列中的packet是空的");
 		    		  continue;
 		    	  }
 	       
		      //	AVCODEC.avcodec_decode_audio4(audiocodecCtx,audioframe,got_audioframe,audiopacket);
 		    	//audiocodecCtx.read(); 
 //audiopacket.size-=10;
 audiopacket.data=audiopacket.data.share(audiopacket.size);
 audiopacket.writeField("data");
 		    	
		      	int audiosize=AVCODEC.avcodec_decode_audio4(audiostream.codec,nativeaudioframe,got_audioframe,audiopacket);
		      	audiocodeccxt.read();
		      	System.out.println("解码出的音频的长度为："+audiosize);

		      	
		      	audiopacket.read();

		      	//audiocodecCtx.read();
		      	audioframe.read();
		      	AVCODEC.av_free_packet(audiopacket.getPointer());
 	    		audiopacket.read();
 	    	    freequeue.add(audiopacket);
 	    	    
 	    	    
 	    	   if(srcsamplerate!=audioframe.sample_rate || srcchannel!=audioframe.channels||srcformat!=audioframe.format){
	    			
	    			srcsamplerate=audioframe.sample_rate;
	 	    		srcchannel=audioframe.channels;
	 	    		System.out.println("通道数是"+srcchannel);
	 	    		srcformat=audioframe.format;
	 	    		
	 	    		srcpersamplesize=AVUTIL.av_get_bytes_per_sample(audioframe.format);
	 	    		System.out.println("格式占用的字节是"+srcpersamplesize);
	    		}
	    		
		    		  
		      	
		      	//AVRational timebase=audiostream.time_base;
 	    	    
 	    	    
 	    	   if(got_audioframe.getValue() != 0){
	    			
	    			isgotframe=true;
	    			System.out.println("检测每解一帧的需要的包数量"+packetperframe);
	    			packetperframe=0;
	    	        long endtime=System.nanoTime();
	   			    System.out.println("解码完一音频帧需要的时间是："+(endtime-starttime));
	   			    starttime=System.nanoTime();
	    			 
	    			}else{
	    				continue;
	    			}
 	    	   
 	    	   
 	    	   
 	    	  
	    		 AudioConnector auconnector=freeauq.poll();
	    		if(auconnector==null){
	    				continue;
	    				 
	    			 }
	    		
 	    	    
		      	
		      	audiosprate.num=1;
		      	audiosprate.writeField("num", 1);
		      	audiosprate.den=audioframe.sample_rate;
		        audiosprate.writeField("den", audioframe.sample_rate);
		      	long pktpts=audioframe.pkt_pts;
		      	System.out.println("avaudio的pkt——pts"+pktpts);
		      	long audioframepts=AVUTIL.av_rescale_q(pktpts, timebase, audiosprate);
		      	
		      	double frameendtime=audioframepts*(1/audioframe.sample_rate)+audioframe.nb_samples/audioframe.sample_rate;//播放完这一帧的音频总共需要的时间 是一秒为单位的
		      	
		      	System.out.println("音频的pts"+audioframepts);
		      	
 	    	    System.out.println("解码出音频针了吗"+got_audioframe.getValue());
 	    		
 	    		
 	    		
 	    		
 	    		//audiobox.setAudiodata(copyadp);
 	    		
 	    		
 	    		
 	    		ByteBuffer audatabuffer;
 	    		if(auconnector.reusedbuffer()==null){
 	    			Pointer copyadp=AVUTIL.av_memdup(audioframe.data[0], audioframe.nb_samples*srcpersamplesize); 
 	    			audatabuffer=audioframe.data[0].getByteBuffer(0, audioframe.nb_samples*srcpersamplesize);
 	    			System.out.println("缓存的位置 及剩余"+audatabuffer.position()+"   "+audatabuffer.limit());
 	    		}else{
 	    			audatabuffer=auconnector.reusedbuffer();
 	    			audatabuffer.rewind();
 	    			audatabuffer.put(audioframe.data[0].getByteBuffer(0, audioframe.nb_samples*srcpersamplesize));
 	    			audatabuffer.rewind();
 	    		}
		    		  
 	    		audiobox.setAdptobuffer(audatabuffer);
 	    		audiobox.setSamplerate(srcsamplerate);
 	    		audiobox.setChannel(srcchannel);
 	    	    audiobox.setBytepersample(srcpersamplesize);
 	    		audiobox.setSamplesperframe(audioframe.nb_samples);
 	    		audiobox.setBlurwritensample(audioframepts);
 	    		
 	    		audiobox.setFrameendtime(frameendtime);
 	    		
 	    		
 	    		boolean added= auconnector.setData(audiobox);
 	    		if(added==true){
 	    			freeauq.add(auconnector);
 	    		}
   		 
		    		  }
		    		  audiobox.clean();
		    		  AVUTIL.av_frame_unref(nativeaudioframe);
		    		  AVCODEC.avcodec_get_frame_defaults(nativeaudioframe);
		    		  audioframe.read();
		    		  isgotframe=false;
		    		// AVUTIL.av_frame_unref(audioframe);	  
		    		  
		    	}finally{
	    		    		audiolock.unlock();
	    		    	}
   		 
		    	
   		 
		    	}	
   		
		
		
	}
	}
	*/
	
	
	public class AudioThread implements Runnable{
		@Override
		public void run() {
			int codecaulength;
			int packetperframe=0;	
			
			PointerByReference filterctx_src=new PointerByReference();
			PointerByReference filterctx_sink=new PointerByReference();
			
			Pointer pfilgraph = null;
			
			
			
			Pointer nativeaudioframe= AVCODEC.avcodec_alloc_frame() ;
			
	   	    AVFrame.ByReference audioframe=new AVFrame.ByReference(nativeaudioframe);;
	   	    System.out.println("audioframe to string"+audioframe.toString());
	   		 final IntByReference got_audioframe= new IntByReference();
	   		 boolean isgotframe=false;
	   		 AVPacket.ByReference audiopacket=null;
	   		 long starttime;
	   		 starttime=System.nanoTime();
	   		 AVRational.ByValue timebase = new AVRational.ByValue();
	   		 timebase.num=audiostream.time_base.num;
	   		 timebase.den=audiostream.time_base.den;
	   		 timebase.write();
	   		AVRational.ByValue audiosprate=new AVRational.ByValue();
	   		int srcpersamplesize=0;
	   		int srcsamplerate=0;
	   		int srcchannel=0;
	   		int srcformat=0;
	   		AVCodecContext.ByReference audiocodeccxt = new AVCodecContext.ByReference(audiostream.codec);
			for(;;){
				audiolock.lock();
				try{
					if(paused==true)
						try {
							audiocondition.await();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					 audiopacket=audioqueue.poll();
	    			  
	 		    	   if(audiopacket==null){
	 		    		 // System.out.println("音频队列中的packet是空的");
	 		    		  continue;
	 		    	  }
					
					
			
					while(audiopacket.stream_index!=-1){
						
						
					   AVUTIL.av_frame_unref(nativeaudioframe);
				       AVCODEC.avcodec_get_frame_defaults(nativeaudioframe);
				       audioframe.read();
						
						
						codecaulength=AVCODEC.avcodec_decode_audio4(audiostream.codec,nativeaudioframe,got_audioframe,audiopacket);
						
				      	audiocodeccxt.read();
				      	System.out.println("解码出的音频的长度为："+codecaulength);
                        audiopacket.read();
				      	audioframe.read();
				      	if(codecaulength < 0){
				      		break;
				      	}
						audiopacket.data=audiopacket.data.share(codecaulength);
						audiopacket.writeField("data");
						audiopacket.size-=codecaulength;
						audiopacket.writeField("size");
						
						 if (audiopacket.data!=null && audiopacket.size <= 0 || audiopacket.data==null && got_audioframe.getValue()==0){
							 
							 audiopacket.stream_index=-1;//为了表明这一个包的音频数据解码完成
							 audiopacket.writeField("stream_index");
						 }
			                   
						 
						
						 if(got_audioframe.getValue() != 0){
				    			
				    			isgotframe=true;
				    			
				    			}else{
				    				continue;
				    			}
			 	    	   
						 
			 	    	   if(srcsamplerate!=audioframe.sample_rate || srcchannel!=audioframe.channels||srcformat!=audioframe.format){
				    		   
			 	    		   srcsamplerate=audioframe.sample_rate;
				 	    		srcchannel=audioframe.channels;
				 	    		System.out.println("通道数是"+srcchannel);
				 	    		srcformat=audioframe.format;
				 	    		
				 	    		srcpersamplesize=AVUTIL.av_get_bytes_per_sample(audioframe.format);
				 	    		System.out.println("格式占用的字节是"+srcpersamplesize);
				 	    		
				 	    		
				 	    		String filtersrcargs="sample_rate="+srcsamplerate+":sample_fmt="+AVUTIL.av_get_sample_fmt_name(audioframe.format)+":channels="+srcchannel+":time_base="+audiostream.time_base.num+"/"+audiostream.time_base.den+":channel_layout=0x"+Long.toHexString(audiocodecCtx.channel_layout);
				 	    		configure_audio_filters(srcsamplerate,filterctx_src,filterctx_sink, filtersrcargs, pfilgraph);//配置音频过滤器
				    		}
				    		  
			 	    	  int ret= AVFILTER.av_buffersrc_add_frame(filterctx_src.getValue(),nativeaudioframe);//把解码出的音频帧进行过滤处理
			 	    	  if(ret<0){
			 	    		  System.out.println("过滤器没有过滤成功");
			 	    	  }
			 	    	   AVUTIL.av_frame_unref(nativeaudioframe);
			 	    	   audioframe.read();
			 	    	   
			 	    	   
			 	    	   int result=AVFILTER.av_buffersink_get_frame_flags(filterctx_sink.getValue(), nativeaudioframe, 0);//把已经过滤好的音频帧取出
			 	    	   
			 	    	   audioframe.read();
			 	    	  
				          AudioConnector auconnector=freeauq.poll();
				    	  if(auconnector==null){
				    				continue;
				    				 
				    			 }
				    	  
				    	  audiosprate.num=1;
					      	audiosprate.writeField("num", 1);
					      	audiosprate.den=audioframe.sample_rate;
					        audiosprate.writeField("den", audioframe.sample_rate);
					      	long pktpts=audioframe.pkt_pts;
					      	System.out.println("avaudio的pkt——pts"+pktpts);
					      	long audioframepts=AVUTIL.av_rescale_q(pktpts, timebase, audiosprate);
					      	
					      	double frameendtime=audioframepts*(1/audioframe.sample_rate)+audioframe.nb_samples/audioframe.sample_rate;//播放完这一帧的音频总共需要的时间 是一秒为单位的
					      	
					      	System.out.println("音频的pts"+audioframepts);
					      	
			 	    	    System.out.println("解码出音频针了吗"+got_audioframe.getValue());
			 	    		
			 	    		
			 	    		
			 	    		ByteBuffer audatabuffer;
			 	    		//if(auconnector.reusedbuffer()==null){
			 	    			Pointer copyadp=AVUTIL.av_memdup(audioframe.data[0], audioframe.nb_samples*srcpersamplesize); 
			 	    			audatabuffer=audioframe.data[0].getByteBuffer(0, audioframe.nb_samples*srcpersamplesize);
			 	    			System.out.println("缓存的位置 及剩余"+audatabuffer.position()+"   "+audatabuffer.limit());
			 	    		/*}else{
			 	    			audatabuffer=auconnector.reusedbuffer();
			 	    			audatabuffer.rewind();
			 	    			audatabuffer.put(audioframe.data[0].getByteBuffer(0, audioframe.nb_samples*srcpersamplesize));
			 	    			audatabuffer.rewind();
			 	    		}*/
					    		  
			 	    		audiobox.setAdptobuffer(audatabuffer);
			 	    		audiobox.setSrcSamplerate(srcsamplerate);
			 	    		audiobox.setChannel(srcchannel);
			 	    	    audiobox.setSrcBytepersample(srcpersamplesize);
			 	    		audiobox.setTargetSamplesperframe(audioframe.nb_samples);
			 	    		audiobox.set_pts_Blurwritensample(audioframepts);
			 	    		
			 	    		audiobox.setFrameendtime(frameendtime);
			 	    		
			 	    		
			 	    		boolean added= auconnector.setData(audiobox);
			 	    		if(added==true){
			 	    			freeauq.add(auconnector);
			 	    		}
						
					  }
					  
					 
				   AVCODEC.av_free_packet(audiopacket.getPointer());
			 	   audiopacket.read();
			 	   freequeue.add(audiopacket);
			 	   audiopacket=null;
					  
					  
			      
					 
				}finally{
					audiolock.unlock();
				}
				
					
				
			}
			
			
			
		}
	}

		
	
	
	
	
	
	
	
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		paused=false;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		paused=true;
	}

	@Override
	public void setTime(float time) {
		// TODO Auto-generated method stub
		
	}

	public Copy_2_of_FFEngine(String filename) {
		super();
		this.filename = filename;
	}
	
	
	public ByteBuffer cloneDirectBuffer(ByteBuffer bytebuffer){
		ByteBuffer copy = ByteBuffer.allocateDirect(bytebuffer.limit()).order(ByteOrder.nativeOrder());
        copy.clear();
        copy.put(bytebuffer);
        return copy;
        
	}
	public final void copyBytebuffer(ByteBuffer srcbuffer,ByteBuffer  destbuffer){
		destbuffer.put(srcbuffer);
	}
	
	public class RecycleVP implements ToolAndRecyclebin{
         
		@Override
		public void recycle(Connector connector) {
			// TODO Auto-generated method stub
			unrecyclevpq.remove(connector);
			freevpq.add((VideoConnector)connector);
			
		}
		
		public void recyclePreAll(Connector connector){
			
				while(true){
					VideoConnector c=unrecyclevpq.poll();
					if(!c.equals(connector)){
						c.cleanData();
						freevpq.add(c);
					}else{
						freevpq.add(c);
						break;
					}
					
				}
			
		}
		
		public void recycleUnused(Connector connector){
			freevpq.add((VideoConnector)connector);
		}
		
	}
	
	public class RecycleAU implements ToolAndRecyclebin{

		@Override
		public void recycle(Connector connector) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void recyclePreAll(Connector connector) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void recycleUnused(Connector connector) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public double myav_q2d(double num,double den){
		return num/den;
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
	
	public void configure_audio_filters(int samplerate,PointerByReference filterctx_src,PointerByReference filterctx_sink,String args,Pointer filterGraph){
		if(filterGraph!=null){
		PointerByReference ppfilgraph=new PointerByReference();
		ppfilgraph.setPointer(filterGraph);
		AVFILTER.avfilter_graph_free(ppfilgraph);
		}
		filterGraph= AVFILTER.avfilter_graph_alloc();
			
		
		int ret;
		
		final int outsamplefmts=AVUtilLibrary.AVSampleFormat.AV_SAMPLE_FMT_S16;
		final int outchanellaylout = AVUtilLibrary.AV_CH_LAYOUT_STEREO;
		final int outsamplerat = samplerate;
		
	    Pointer avfiltersrc=	AVFILTER.avfilter_get_by_name("abuffer");
	    Pointer avfiltersink =	AVFILTER.avfilter_get_by_name("abuffersink");
	  //  Pointer pinputs= AVFILTER.avfilter_inout_alloc();
	  //  Pointer poutputs= AVFILTER.avfilter_inout_alloc();
	    
	    
	   
	    
	   ret=  AVFILTER.avfilter_graph_create_filter(filterctx_src, avfiltersrc, "in", args, null, filterGraph);
	   if(ret<0){
		   System.out.println("Cannot create audio buffer source\n");
	   }
	   
	   ret=AVFILTER.avfilter_graph_create_filter(filterctx_sink, avfiltersink, "out", null, null, filterGraph);
	   if(ret<0){
		   System.out.println("Cannot create audio buffer sink\n");
	   }
	   
	   AVUTIL.av_opt_set_int(filterctx_sink.getValue(), "sample_fmts", outsamplefmts, AVUtilLibrary.AV_OPT_SEARCH_CHILDREN);
	   AVUTIL.av_opt_set_int(filterctx_sink.getValue(), "channel_layouts", outchanellaylout, AVUtilLibrary.AV_OPT_SEARCH_CHILDREN);
	   AVUTIL.av_opt_set_int(filterctx_sink.getValue(), "sample_rates", outsamplerat, AVUtilLibrary.AV_OPT_SEARCH_CHILDREN);
	   
	   AVFILTER.avfilter_link(filterctx_src.getValue(),0,filterctx_sink.getValue(),0);
	   AVFILTER.avfilter_graph_config(filterGraph,null);
	  
	   
		
	}
	

}
