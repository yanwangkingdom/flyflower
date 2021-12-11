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

import com.sun.jna.Memory;
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
import com.yw.ffmpegj.libavformat.AVInputFormat;
import com.yw.ffmpegj.libavformat.AVStream;
import com.yw.ffmpegj.libavutil.AVClass;
import com.yw.ffmpegj.libavutil.AVFrame;
import com.yw.ffmpegj.libavutil.AVOption;
import com.yw.ffmpegj.libavutil.AVPixelFormat;
import com.yw.ffmpegj.libavutil.AVRational;
import com.yw.ffmpegj.libavutil.AVUtilLibrary;
import com.yw.ffmpegj.libfilter.AVFilter;
import com.yw.ffmpegj.libfilter.AVFilterContext;
import com.yw.ffmpegj.libfilter.AVFilterGraph;
import com.yw.ffmpegj.libfilter.AVFilterInOut;
import com.yw.ffmpegj.libfilter.AVFilterLibrary;
import com.yw.ffmpegj.libswr.AVSwresampleLibrary;
import com.yw.ffmpegj.libsws.SwsLibrary;
import com.yw.test.AudioMixer_java;
import com.yw.test.FrameDataToImage;
import com.yw.test.ImageFrame;
public class FFEngine implements FFController{
	
	static int seek_by_bytes=-1; //seek by bytes 0=off 1=on -1=auto
	
	int firstfillsize=0;
	int firstaufillsize=0;
	
	static AVInputFormat.ByReference inputformat;
	
	 static final boolean videodebug = Boolean.getBoolean("ffmpegj.videodebug");
	 static final boolean audiodebug = Boolean.getBoolean("ffmpegj.audiodebug");
	 
	 volatile boolean audioready=false;
	 
	 volatile boolean videoready=false;
	 
	 
	    int firstallocbuffersize=0;
		IntByReference prvsize=new IntByReference();
		PointerByReference out=new PointerByReference();
		Pointer outbuffer=null;
	 
	 int IWANTFREQ=44100;
	 
	 int  minconnector=5;
	 
	 int AUDIO_DIFF_AVG_NB=20;
	 int audio_diff_avg_count = 0;
	 int ffengine_audio_hw_buf_size=0;
	


	 double audio_diff_avg_coef;
	 double audio_diff_threshold;//35280这么大的内存 可以容纳采样44100 双声道 16位的采样 持续多少秒 最后*2 就是 35280的内存可以持续4秒钟的数据
	 double audio_diff_cum=0;
	 
	 
	 
	 long AVDuration;//要播放的音频文件的总时长 是以微妙为单位的
	
	



	final AVFormatLibrary AVFORMAT = AVFormatLibrary.INSTANCE;
	final AVCodecLibrary AVCODEC = AVCodecLibrary.INSTANCE;
	final AVUtilLibrary AVUTIL = AVUtilLibrary.INSTANCE;
	final SwsLibrary SWSSCALE= SwsLibrary.INSTANCE;
	final AVFilterLibrary AVFILTER=AVFilterLibrary.INSTANCE;
	final AVSwresampleLibrary SWRESAMPLE=AVSwresampleLibrary.INSTANCE;
	
	 PointerByReference ppFormatctx;
	
	ConcurrentLinkedQueue<AVPacket.ByReference> videoqueue;
	ConcurrentLinkedQueue <AVPacket.ByReference> audioqueue;
	ConcurrentLinkedQueue <AVPacket.ByReference> subtitlequeue;
	ConcurrentLinkedQueue <AVPacket.ByReference> freevdpacketqueue;
	ConcurrentLinkedQueue <AVPacket.ByReference> freeaupacketqueue;
	
	volatile int avpackettotal=0;
	
	ConcurrentLinkedQueue<VideoConnector> unrecyclevpq;
	ConcurrentLinkedQueue<VideoConnector> freevpq;
	boolean firstvframe=true;
	double vrtbeginpts;//视频的播放时间 是以毫秒 为单位的
	
	volatile double vdiff=0;//这两个值 不能为负值 此值的作用仅是能放慢视频的播放
	volatile double vbasediff=0;
	//volatile double vbasediff=1.1-0.05;
	
	ConcurrentLinkedQueue<AudioConnector> unrecycleauq;
	ConcurrentLinkedQueue<AudioConnector> freeauq;
	
	
	boolean firstaframe=true;
	volatile long artbeginpts;//对于音频来说 这个是采样个数
	volatile double artbegintime=0;
	//AtomicInteger recyclemonitor=new AtomicInteger(0);
	
	final RecycleVP vprecycle =new RecycleVP();
	
	final RecycleAU aurecycle=new RecycleAU();
	int vpconnectortotal;
	int auconnectortotal;
	String uri;
	//String uri;
	
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
	volatile boolean stoped=true;
	
	



	Lock readpacketlock =new ReentrantLock();
	Condition readcondition = readpacketlock.newCondition();
	
	Lock videolock =new ReentrantLock();
	Condition videocondition = videolock.newCondition();
	
	
	Lock audiolock =new ReentrantLock();
	Condition audiocondition = audiolock.newCondition();
	/*public void FFengine(String filename){
		//super();
		this.filename=filename;
		initVariable();
	}*/
	
	
	//PointerByReference filterctx_src = new PointerByReference();
	//PointerByReference filterctx_sink = new PointerByReference();
	 String filter_descr = "aresample=8000,aformat=sample_fmts=s16:channel_layouts=mono";
	
	Pointer pfilgraph = null;
	
	
	boolean isrealtime;
	
	volatile boolean isseek=false;
	double auafterseekbeginpts=0;
	
	volatile boolean eof=false;
	volatile boolean videofinished=false;
	



	volatile boolean audiofinished=false;
	


	volatile boolean videodestroy=false;
	volatile boolean audiodestroy=false;
	volatile boolean isexit=false;
	
	
	volatile boolean isaudionopacket=false;
	volatile boolean isvideonopacket=false;
	
	volatile boolean videonofreeconnector=false;
	
	volatile boolean audionofreeconnector=false;
	
	volatile boolean audiofulldata_nofreepacket=false;
	volatile boolean videofulldata_nofreepacket=false;
	
	
	public void initAndStart(){
		
		 
		 reinit();
		
		System.out.println("我进入了initAndStart方法");
		
		if(ffengine_audio_hw_buf_size==0){
			 throw new RuntimeException("ffengine_audio_hw_buf_size不能为0 必须设置为你的硬件缓存大小以字节为单位的");
		}
		
		
		
		
		
	    videoqueue=new 	ConcurrentLinkedQueue<AVPacket.ByReference>();
	    audioqueue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
	    subtitlequeue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
	    unrecyclevpq = new ConcurrentLinkedQueue<VideoConnector>();
	    unrecycleauq = new ConcurrentLinkedQueue<AudioConnector>();
	    
	    
	    if(videostream!=null){
	    	vprecycle.forceRecycle();
	    }
	    if(audiostream!=null){
	    	aurecycle.forceRecycle();	
	    }
        
	
	    cleanpacket();
	 
	    
	    
	    
	    AVFORMAT.av_register_all();
	    AVFORMAT. avformat_network_init();
	    AVFILTER.avfilter_register_all();
	 
	    ppFormatctx  = new PointerByReference();
		
       final PointerByReference ppavdic = new PointerByReference(); 
	   //AVUTIL.av_dict_set(ppavdic, "rtsp_transport", "tcp", 32);
		
		if(AVFORMAT.avformat_open_input(ppFormatctx, uri, null, ppavdic)!=0){
			System.out.println("can not open file");
		}
		
		
		pavformatctxt=ppFormatctx.getValue();
		System.out.println(ppFormatctx.getValue());
		
	    formatCtx = new AVFormatContext.ByReference(ppFormatctx.getValue());
	   // System.out.println(formatCtx.toString());
		
	
		
		if (AVFORMAT.avformat_find_stream_info(pavformatctxt,null) < 0)
		    throw new RuntimeException("Couldn't find stream information"); // Couldn't find stream information
	     
		 AVFORMAT.av_dump_format(pavformatctxt, 0, uri, 0);
		
		 formatCtx.read();
		 
		 isrealtime= is_realtime(formatCtx);
	System.out.println("是否是网络视频"+isrealtime);	 
		 
		 AVDuration=formatCtx.duration;//持续时间是以微妙为单位的
		System.out.println("av的持续时间是："+AVDuration);
		
	/*	int videoindex =AVFORMAT.av_find_best_stream(pavformatctxt,  AVUtilLibrary.AVMediaType.AVMEDIA_TYPE_VIDEO, -1, -1, null, 0);
	            
		int audioindex=AVFORMAT.av_find_best_stream(pavformatctxt, AVUtilLibrary.AVMediaType.AVMEDIA_TYPE_AUDIO, 1, -1, null, 0);
		
		int subtitleindex=AVFORMAT.av_find_best_stream(pavformatctxt, AVUtilLibrary.AVMediaType.AVMEDIA_TYPE_SUBTITLE, 1, -1, null, 0);
		
		for(int i=0;i<formatCtx.nb_streams;i++){
			
			Pointer []streampointers=formatCtx.streams.getPointer().getPointerArray(0, formatCtx.nb_streams);
			audiostream=new AVStream.ByReference(streampointers[audioindex]);
			videostream=new AVStream.ByReference(streampointers[videoindex]);
			
		}
		
		*/
		
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
	            System.out.println("音频的下标是："+audioindex);	       
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
	    
	    if(videoindex!=-1){
	    	 videocodecCtx = new AVCodecContext.ByReference(videostream.codec);
	         if (videocodecCtx.codec_id == 0)
	 	    	throw new RuntimeException("video Codec id is zero (no codec)");
	         Pointer pvideocodec= AVCODEC.avcodec_find_decoder(videocodecCtx.codec_id);
	         if(pvideocodec==null){
	 	    	System.out.println("指针为空");
	         
	 	    	 }
	         videocodec = new AVCodec.ByReference(pvideocodec);
	 	    System.out.println("video解码器的id号是："+videocodec.id);
	 	    
	 	   int openvidiocodec=AVCODEC.avcodec_open2(videostream.codec, pvideocodec,null);
		    videocodecCtx.read();
		    videocodec.read();
		     if(videocodecCtx.codec==null){
			    	System.out.println("解码上下文中的codec指针为空 不能打开解码器");
			    }
		     if(openvidiocodec < 0)
			    	throw new RuntimeException("Could not open video codec"); // Could not open codec
	 	    
	         
	    }
	    
	    
        if(audioindex!=-1){
        	 audiocodecCtx=new AVCodecContext.ByReference(audiostream.codec);
             if (audiocodecCtx.codec_id == 0)
     	    	throw new RuntimeException("audio Codec id is zero (no codec)");
             Pointer paudiocodec= AVCODEC.avcodec_find_decoder(audiocodecCtx.codec_id);
             audiocodec = new AVCodec.ByReference(paudiocodec);
     	    System.out.println("audio 音频的解码器id号"+audiocodec.id);
     	    
     	 AVUTIL.av_opt_set_int(audiostream.codec, "refcounted_frames", 1, 0);
     	 
   	     audiocodecCtx.read();
   	     
   	     int openaudiocodec=AVCODEC.avcodec_open2(audiostream.codec, paudiocodec,null);
   	     audiocodecCtx.read();
   	     audiocodec.read();
        }
       
        
 
	    
	    audio_diff_avg_coef= Math.exp((Math.log(0.01)/AUDIO_DIFF_AVG_NB));
	    paused=false;
	    stoped=false;
	    
	    Thread readt=new Thread(new ReadThread());
	    
	   
	    readt.start();
	    
        if(audioindex!=-1){
        	 Thread audiot=new Thread(new AudioThread());
	         audiot.start();
        }
        if(videoindex!=-1){
        	Thread videot=new Thread(new VideoThread());
        	 videot.start();
        }
	   
	   
	    System.out.println("三个线程启动结束 initandStart结束");
	    
	}
	
	
	
	public FFEngine(Collection<? extends VideoConnector> videoconnectors,Collection<? extends AudioConnector> audioconnectors) {
		   
		    if(videoconnectors.size() < minconnector||audioconnectors.size() < minconnector){
		    	throw new RuntimeException("audio and video connector too low");
		    }
		   
		
		    vpconnectortotal=videoconnectors.size();
		    auconnectortotal=audioconnectors.size();
		    freeauq=new ConcurrentLinkedQueue<AudioConnector>(audioconnectors);
		
		 
		    freevpq = new ConcurrentLinkedQueue<VideoConnector>(videoconnectors);
		    
		    freevdpacketqueue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
			freeaupacketqueue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
			//freeaudioqueue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
			int freepacketsize=1000;
			for(int i=0;i<freepacketsize;i++){
				AVPacket.ByReference videofreepacket=new AVPacket.ByReference();
				AVPacket.ByReference audiofreepacket=new AVPacket.ByReference();
				
				 freevdpacketqueue.add(videofreepacket);
				 freeaupacketqueue.add(audiofreepacket);
			}
			avpackettotal+=freepacketsize;
		  // initAndStart();
		
		
		
	}
	
	

	public FFEngine() {
		super();
		// TODO Auto-generated constructor stub
		 initAndStart();
	}



	public class ReadThread implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
	System.out.println("读线程开始了");	
	      
			boolean gainswitch=true;
			if(inputformat!=null){
				
			    if(seek_by_bytes<0){
			    	
				
				   boolean val=!!((inputformat.flags & 0x0200)!=0?true:false) && (inputformat.name.equals("ogg"));
				
				
				    if(val){
				    seek_by_bytes=1;
				 }else{
					seek_by_bytes=0;
				 }
				
			   }
			}
			
		   while(true){
			   
			   AVPacket.ByReference packet;
			   readpacketlock.lock();
//System.out.println("读线程内的获得读锁");			   
			   try{
				  
				   if(paused==true){
					try {
			System.out.println("读线程的条件要等待");			
						readcondition.await();
						
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				   }
				   
				   if((audiofinished||audioindex==-1) && (videoindex==-1 || videofinished) && eof ){
					  if(isexit){
						  break;
					  }
	//System.out.println("因为eof所以continue");				  
					  continue;
				   }
				   
				   
				   
				   
				
					   if(gainswitch){
						   packet= freevdpacketqueue.poll();
						   if(packet!=null){
							   videofulldata_nofreepacket=false;
							   gainswitch=false;
							 
						   }else{
							 //  System.out.println("视频队列中都没有包了");	
							   videofulldata_nofreepacket=true;
							   gainswitch=false;
							   continue;
							   
						   }
					   }else{
							
						   
						   packet  = freeaupacketqueue.poll();
						   if(packet!=null){
							   audiofulldata_nofreepacket=false;
							   gainswitch=true;
							 
						   }else{
							 //  System.out.println("音频队列中都没有包了");	
							   audiofulldata_nofreepacket=true;
							   gainswitch=true;
							   continue;
						   }
					   }
					   
		//System.out.println("音视频队列中都没有包了");			   
	
				   
			      
			        
			       int ret =AVFORMAT.av_read_frame(pavformatctxt, packet);
	//System.out.println("读线程中读包的返回值"+ret);		       
			        formatCtx.read();
			        if(ret<0){
			        	if(ret==AVUTIL.AVERROR_EOF || (AVFORMAT.url_feof(formatCtx.pb)==1)){
			        		 eof=true;
			        		 AVCODEC.av_free_packet(packet.getPointer());
		        	    		
			        		 freevdpacketqueue.add(packet);
			     // System.out.println("发生eof标记所以continue");  		 
			        		continue;
			        	}
			        }
				       if(packet.stream_index==videoindex){
				    	  
				    		 videoqueue.add(packet);
				    		//System.out.println("我添加到视频队列的个数:"+videoqueue.size());
				    	  
				    	
				       }
				      else if(packet.stream_index==audioindex){
				    	  
				    		    audioqueue.add(packet);
				    	// System.out.println("我添加到音频队列包的个数"+audioqueue.size());
				    	
				       }else{
				    	   AVCODEC.av_free_packet(packet.getPointer());
	        	    		
	        	    	    freeaupacketqueue.add(packet);
				    	   
				       }
				      /* else if(packet.stream_index==subtitleindex){
				    	
				    		  subtitlequeue.add(packet);
				    	  
				    	
				       }*/
			   }finally{
				   readpacketlock.unlock();
	//System.out.println("读线程内释放读锁");			   
			   }
			   
		   
		       
		       
		   }
	System.out.println("读线程中准备等待引擎退出");	   
		   
		   while((audiodestroy||audioindex==-1) && (videoindex==-1 || videodestroy)){
			  
			   AVFORMAT.avformat_close_input(ppFormatctx);
			   break;
		   }
		   
		   stoped=true;
		   System.out.println("读线程中引擎彻底结束");
		}
	}
	
	public class VideoThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			
			
			boolean artbeginisexist=false;//这个boolean的值是为了确保音频线程已经初始化 并且已经计算出了音频第一次的pts时间
			
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
    	System.out.println("视频线启动@@@@@@@@@@@@@@@@@@@@@@");	    
    		    while(true){
    		    	videolock.lock();
    		    	try{
    		    		if(paused==true){
							try {
								System.out.println("视频线程的条件要等待");			
								videocondition.await();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
    		    		}
    		    		if(videofinished && isexit){//文件播放完毕 并且要彻底的退出 结束video线程
    		    			break;
    		    		}
    		    		
    		    		if(eof && unrecyclevpq.isEmpty()){//此处的代码是为了 seek到文件末尾的时候
    						videofinished=true;
    						
    						continue;
    					}
    		    		
    		    		
    		    		  if(!isgotframe){
    		    		  packet=videoqueue.poll();
    	    		    	 
        		    	  if(packet==null){
        		    		//  System.out.println("视频线程中视频队列中的packet是空的");
        		    		  if(isrealtime){//没有正常的拿到包 并且是实时流媒体
        		    			  isvideonopacket=true;
        		    		  }
        		    		  continue;
        		    	  }
        		    	//这种情况是可以正常的拿到包 但是播放的媒体文件时实时流媒体  
        		    	  if(isrealtime){
        		    		  isvideonopacket=false;
        		    	  }
    		    		final IntByReference got_picture = new IntByReference();
        	    		int result=AVCODEC.avcodec_decode_video2(videocodecCtx, nativeframe, got_picture, packet);
        	    		frame.read();
        	    		if(videodebug)
        	    	//System.out.println("get got_picture:"+got_picture.getValue());
        	    		AVCODEC.av_free_packet(packet.getPointer());
        	    		packet.read();
        	    	    freevdpacketqueue.add(packet);
    		    		  
        	    		 if(got_picture.getValue() != 0){
        	    			isgotframe=true;
        	    			long framepts =AVUTIL.av_frame_get_best_effort_timestamp(nativeframe);//需要调用这个本地方法计算出frame的pts （这个时间是没有*基础时间的）以后这个值需要手动写入到avframe的成员变量pts上
        	    		    picturepts=framepts*((double)(videostream.time_base.num)/(double)(videostream.time_base.den));
        	    		    frame.read();
        	    		    
        	    		    if(isrealtime){
        	    		    	if(firstvframe){
        	    		    		vrtbeginpts=picturepts;
        	    		    	
        	    //System.out.println("视频的第一次的pts="+vrtbeginpts);		    		
        	    		    		firstvframe=false;
        	    		    	}
        	    		    	if(!artbeginisexist && artbegintime!=0){
        	    		    //因为网络流媒体的第一帧的pts不是从0开始的  有些流媒体总是音视频不同步 所以计算视频的第一帧的时间 是基于音频第一帧的时间计算的
        	    		    		vbasediff=vrtbeginpts-artbegintime;//
        	    		    		artbeginisexist=true;
        	    		    	}
        	    		    	
        	    		    	picturepts=picturepts-vrtbeginpts+vdiff+vbasediff+(-0.2);//-0.2 是因为电影里面 soundevent在-0.2时被添加的 它先天就提前与视频 
        	    		    	vdiff=0;
        	    		    }
        	    		   
        	    		    if(videodebug){
        	    		    	// System.out.println("真正的picture的pts是："+picturepts);
        	    		    }
        	    		   
        	    			 
        	    			}else{
        	    				continue;
        	    			}
    		    		  }
        	    		 
        	    		 VideoConnector connector=freevpq.poll();
     	    			 if(connector==null){
     	    				videonofreeconnector=true; 
     	    				continue;
     	    				 
     	    			 }
        	    			
        	    			  videonofreeconnector=false; 
        		    		   
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
        	    		        
        	    		        
        	    		        
        	    		        
        	    		     
        	    		      //每解码出一个视频帧都对应的一个对接体，对接体中有videopicture 一开始的时候videopicture是null 里面的
        	    		        //bytebuffer也是null 第一次的时候 videopicture 缓存都会被初始化 以后这些会被重复利用。        		       
        	    		       
        	    		        
        	    		        
        	    		        VideoPicture databox=connector.getData();
        	    		        if(databox==null){
        	    		        	databox=new VideoPicture();
        	    		        }
        	    		        
        	    		       ByteBuffer vdatabuffer= databox.getData();
        	    		       if(vdatabuffer==null){
        	    		    	   vdatabuffer=cloneDirectBuffer(convertdata);
        	    		    	   
        	    		       }else{
        	    		    	   vdatabuffer.rewind();
        	    		    	   vdatabuffer.put(convertdata);
        	    		    	   vdatabuffer.rewind();
        	    		       }
        	    		      
        	    		    databox.setWidth(videocodecCtx.width);
        	    		    databox.setHeight(videocodecCtx.height);
        	    		    databox.setPts(picturepts);
        	    		    databox.setDuration(duration);
        	    		    databox.setData(vdatabuffer);
        	    		    databox.setIsforcecleaned(false);
        	    		    databox.setVprecycle(vprecycle);
        	    		   boolean added= connector.setData(databox);
        	    		   if(added){
        	    			   unrecyclevpq.add(connector);
        	    		   }
        	    		   
        	    		   if(!videoready){
        	    			   firstfillsize++;
        	    			   if(!isrealtime){
        	    				   if(firstfillsize==50){
        	    				   videoready=true;
        	    				   firstfillsize=0;
        	    				   }
        	    			   }else{
        	    				   if(firstfillsize==(vpconnectortotal/2)){
            	    				   videoready=true;
            	    				   firstfillsize=0;
            	   System.out.println("视频线程isready"); 				   
            	    			   }
        	    			   }
        	    			  
        	    		   }
        	    		    
        	    		
        	    		   
        	    		    isgotframe=false;
    		    		 	
    		    		  } 
    		    		
    		    	finally{
    		    		videolock.unlock();
    		    	}
    		         
    		    	
    		    	  
    		    
    		  
    		    	
    		    	
    		    
    	    		 
    	    		// final byte[] data = distframe.data[0].getByteArray(0, videocodecCtx.height * distframe.linesize[0]);
    		    		
    	    		 
    		    		
    	           // bi = FrameDataToImage.createImage(data, videocodecCtx.width, videocodecCtx.height);
    	    		 
    	    		 
    		    	
    		    }
    		    
    		    AVCODEC.avcodec_flush_buffers(videostream.codec);
    		    AVUTIL.av_frame_unref(frameRGB);
    		    AVUTIL.av_freep(frameRGB);
    		    AVUTIL.av_frame_unref(nativeframe);
    		    AVUTIL.av_freep(nativeframe);
			    videodestroy=true;
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
	Pointer swrcontext=null;
	
	public class AudioThread implements Runnable{
		@Override
		public void run() {
			
		
			int codecaulength;
			int packetperframe=0;	
			
			int testframeconunt=0;
			
//AudioMixer_java audiomixer=new AudioMixer_java();
			
			Pointer nativeaudioframe= AVCODEC.avcodec_alloc_frame() ;
			
	   	    AVFrame.ByReference audioframe=new AVFrame.ByReference(nativeaudioframe);;
// System.out.println("audioframe to string"+audioframe.toString());
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
	   		int srcnbsamples=0;
	   		AVCodecContext.ByReference audiocodeccxt = new AVCodecContext.ByReference(audiostream.codec);
	   		long dec_channel_layout=0;
	   		int ret=0;
	   		
	   		boolean allinone=false;
	   		
	   		//int targetnbsamples=0;
	   		
	   		//int targetbuffersize=0;
	   		
	   		
	   		PointerByReference in=new PointerByReference();
	   		PointerByReference ppswrcontext=new PointerByReference();
	   		
	   		int targetpersamplesize=0;
	   		ByteBuffer testbuffer=ByteBuffer.allocate(2048*4);
	  System.out.println("音频线程启动￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥"); 		
			for(;;){
				
				
				audiolock.lock();
//System.out.println("音频线程内得到音频锁");				
				try{
					
					
					
					if(paused==true){
						try {
							System.out.println("音频线程的条件要等待");			
							audiocondition.await();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					if(audiofinished && isexit){//已经播放到了文件末尾并且没有循环要彻底的结束 结束音频线程
						break;
					}
					
					if( eof && unrecycleauq.isEmpty()){//此处代码是为了seek到了音频文件的末尾要进行的处理
						audiofinished=true;
						continue;
					}
					
					if(freeauq.isEmpty()){
						//System.out.println("音频线程开始位置 对接体队列没东西了");
						
											
						continue;
					}
					 audiopacket=audioqueue.poll();
	    			  
	 		    	   if(audiopacket==null){
	 		    		//  System.out.println("音频线程中音频队列中的packet是空的");
	 		    		   if(isrealtime){
	 		    			   isaudionopacket=true;
	 		    		   }
	 		    		  continue;
	 		    	  }
					 if(isrealtime){
						 isaudionopacket=false;
					 }
					
			
					while(audiopacket.stream_index!=-1){
						
						
					   AVUTIL.av_frame_unref(nativeaudioframe);
				       AVCODEC.avcodec_get_frame_defaults(nativeaudioframe);
				       audioframe.read();
						
						
						codecaulength=AVCODEC.avcodec_decode_audio4(audiostream.codec,nativeaudioframe,got_audioframe,audiopacket);
						
				      	audiocodeccxt.read();
	 	//System.out.println("解码出的音频的长度为："+codecaulength);
                        audiopacket.read();
				      	audioframe.read();
				      	if(codecaulength < 0){
				      		break;
				      	}
				    	
				      	if(audiopacket.data==null){
				      		break;
				      	}
						audiopacket.data=audiopacket.data.share(codecaulength);
				      	
						//audiopacket.data=audiopacket.data.getPointer(codecaulength);
						audiopacket.writeField("data");
						audiopacket.size-=codecaulength;
						audiopacket.writeField("size");
						
						 if (audiopacket.data!=null && audiopacket.size <= 0 || audiopacket.data==null && got_audioframe.getValue()==0){
							 
							 audiopacket.stream_index=-1;//为了表明这一个包的音频数据解码完成
							 audiopacket.writeField("stream_index");
						 }
			                   
						 
						
						 if(got_audioframe.getValue() != 0){
				    			
				    			//isgotframe=true;
							 testframeconunt++;
	//	System.out.println("音频帧的数量"+testframeconunt);					 
				    			}else{
	   System.out.println("没有得到音频帧");			    				
				    				continue;
				    			}
			 	    	   
						   srcnbsamples=audioframe.nb_samples;
		 //System.out.println("音频中一帧的采样个数是"+srcnbsamples);				   
			 	    	   if(srcsamplerate!=audioframe.sample_rate || srcchannel!=audioframe.channels||srcformat!=audioframe.format){
				    		   
			 	    		   srcsamplerate=audioframe.sample_rate;
				 	    		srcchannel=audioframe.channels;
		System.out.println("音频的源采样率是"+srcsamplerate);
				 	    		srcformat=audioframe.format;
				 	    		
				 	    		srcpersamplesize=AVUTIL.av_get_bytes_per_sample(audioframe.format);
				 	    		
				 	    		targetpersamplesize=AVUTIL.av_get_bytes_per_sample(AVUtilLibrary.AVSampleFormat.AV_SAMPLE_FMT_S16);
		//System.out.println("格式占用的字节是"+srcpersamplesize);
				 	    		dec_channel_layout =
				 	                   ((audioframe.channel_layout==0?false:true) && AVUTIL.av_frame_get_channels(nativeaudioframe) == AVUTIL.av_get_channel_layout_nb_channels(audioframe.channel_layout)) ?
				 	                   audioframe.channel_layout :AVUTIL.av_get_default_channel_layout(AVUTIL.av_frame_get_channels(nativeaudioframe));
				 	    		
				 	    		//String filtersrcargsrc="sample_rate="+srcsamplerate+":sample_fmt="+AVUTIL.av_get_sample_fmt_name(audioframe.format)+":channels="+srcchannel+":time_base=1"+"/"+srcsamplerate+":channel_layout=0x"+Long.toHexString(audiocodecCtx.channel_layout);
				 	    		if(swrcontext!=null){
				 	    			ppswrcontext.setValue(swrcontext);
				 	    			SWRESAMPLE.swr_free(ppswrcontext);
				 	    			
				 	    		}
				 	    		swrcontext=SWRESAMPLE.swr_alloc_set_opts(null, (long)AVUtilLibrary.AV_CH_LAYOUT_STEREO, AVUtilLibrary.AVSampleFormat.AV_SAMPLE_FMT_S16, IWANTFREQ,dec_channel_layout ,srcformat, srcsamplerate, 0, null);//设置swr上下文
				 	    		ret=SWRESAMPLE.swr_init(swrcontext);//初始化swr上下文
				 	    		
				 	    		audio_diff_threshold=2.0*ffengine_audio_hw_buf_size / AVUTIL.av_samples_get_buffer_size(null, 2, IWANTFREQ, AVUtilLibrary.AVSampleFormat.AV_SAMPLE_FMT_S16, 1);
				 	    		
				 	    		if(ret<0){
			//	System.out.println("swrcontext 初始化失败");
				 	    		}
				 	    		
				 	    		
				 	    		
				 	    
			 	    		
				 	    	
				 	    	
				    	  }
			 	    	   
			 	    	
				          AudioConnector auconnector=freeauq.poll();
				    	  if(auconnector==null){
				    		  audionofreeconnector=true;
				    		 // if(audiodebug)
				    		  System.out.println("音频线程中我没有音频对接体了"); 		  
				    				while(auconnector==null){
				    						
				    					auconnector=freeauq.poll();
				    				}
				    			 }
				    	 audionofreeconnector=false;
				    	  audiosprate.num=1;
					      	audiosprate.writeField("num", 1);
					      	audiosprate.den=audioframe.sample_rate;
					        audiosprate.writeField("den", audioframe.sample_rate);
					      	long pktpts=audioframe.pkt_pts;
		//System.out.println("avaudio的pkt——pts"+pktpts);
					      	long audioframepts=AVUTIL.av_rescale_q(pktpts, timebase, audiosprate);
					      	
					      	 if(isrealtime){
	        	    		    	if(firstaframe){
	        	    		    		artbeginpts=audioframepts;
	                                    artbegintime=artbeginpts*1.0/srcsamplerate; 	    		    		
	        	    		    		firstaframe=false;
	        	    		    	}
	        	    		    	audioframepts=audioframepts-artbeginpts;
	        	    		    }
					      	 
					      	 if(isseek){
					      		auafterseekbeginpts=audioframepts*1.0/srcsamplerate;
					      		isseek=false;
					      	 }
					      	
					      	double frameendtime=audioframepts*(1/audioframe.sample_rate)+audioframe.nb_samples/audioframe.sample_rate;//播放完这一帧的音频总共需要的时间 是一秒为单位的
					      	
		//	System.out.println("音频的pts"+audioframepts);
					      	
			//System.out.println("解码出音频针了吗"+got_audioframe.getValue());
			 	    	  //  in.setValue(audioframe.extended_data);
			 	    	    
			 	    	
			 	    	
			 	    	
			 	    	
			 	    		
			 	    	  /*  ByteBuffer audatabuffer=out.getValue().getByteBuffer(0, targetbuffersize);
			 	    		ByteBuffer connectbuffer=auconnector.reusedbuffer();
			 	    		
			 	    		if(connectbuffer==null){
			 	    			
			 	    			connectbuffer=cloneHeapBuffer(audatabuffer);
			 	 //System.out.println("缓存的位置 及剩余"+audatabuffer.position()+"   "+audatabuffer.limit());
			 	    		}else{
			 	    			copyBytebuffer(audatabuffer,connectbuffer);
			 	    		}*/
			 	    		
			 	    		
			 	          //copyBytebuffer(audatabuffer,testbuffer);
			 	    		 
				
				 	    	//	audiomixer.playAudio(testbuffer.array());
				 	    	//	audiomixer.playAudio(audiodata);
	//System.out.println("java我已经写入音频数据"); 
			 	    	    FFAudioData audiobox  =	auconnector.getData();
			 	    		if(audiobox==null){
			 	    			audiobox=new FFAudioData();
			 	    		}
			 	    		
			 	    		PointersWithBuffers pwb=audiobox.getPointersWithbuffers();
			 	    		if(pwb==null){
			 	    			pwb=new PointersWithBuffers();
			 	    			audiobox.setPointersWithbuffers(pwb);
			 	    		}
			 	    		
			 	    		Pointer[] pextdatas =audioframe.extended_data.getPointer().getPointerArray(0, srcchannel);
			 	    		
			 	    		for(int i=0;i<pextdatas.length;i++){
			 	    			if(i==0){
			 	    				if(pextdatas[i]==null){
				 	    				 throw new RuntimeException("扩展数据中的第一个指针的null");
				 	    			}
			 	    			}
			 	    			if(i==1){
			 	    				if(pextdatas[i]==null){
			 	    					allinone=true;
			 	    				}
			 	    			}
			 	    			
			 	    		}
			 	    		
			 	    		PointerByReference myppin = pwb.ppin;
			 	    		
			 	    		for(int i=0;i<srcchannel;i++){
			 	    			if(allinone){
			 	    				
			 	    				if(0>pwb.buffers.size()-1){
				 	    				
				 	    				Pointer p=AVUTIL.av_malloc(35280*6);
				 	    				
				 	    			
				 	    				
				 	    				pwb.addPointer(p,35280*6);
				 	    				
				 	    				myppin.getPointer().setPointer(i*Pointer.SIZE, p);
				 	    			
				 	    			}
				 	    				pwb.buffers.get(0).rewind();
				 	    			
				 	    				pwb.buffers.get(0).put(pextdatas[0].getByteBuffer(0, srcnbsamples*srcpersamplesize*srcchannel));
				 	    				//pwb.pointers.get(i).getByteBuffer(0, srcnbsamples*srcpersamplesize).put(pextdatas[i].getByteBuffer(0, srcnbsamples*srcpersamplesize));
				 	    			
			 	    				    break;
			 	    			}else{
			 	    				
			 	    			
			 	    			      if(i>pwb.buffers.size()-1){
			 	    				
			 	    				         Pointer p=AVUTIL.av_malloc(35280*2);
			 	    				
			 	    			
			 	    				
			 	    				         pwb.addPointer(p,35280*2);
			 	    				
			 	    				         myppin.getPointer().setPointer(i*Pointer.SIZE, p);
			 	    			
			 	    			      }
			 	    				pwb.buffers.get(i).rewind();
			 	    			    //System.out.println("音频的扩展数据2="+pextdatas[i]);	
			 	    				pwb.buffers.get(i).put(pextdatas[i].getByteBuffer(0, srcnbsamples*srcpersamplesize));
			 	    				//pwb.pointers.get(i).getByteBuffer(0, srcnbsamples*srcpersamplesize).put(pextdatas[i].getByteBuffer(0, srcnbsamples*srcpersamplesize));
			 	    			
			 	    			
			 	    			}
			 	    			
			 	    		}
			 	    		
			 	    									    		  
			 	    		//audiobox.setAdptobuffer(connectbuffer);
			 	    		audiobox.setSrcSamplerate(srcsamplerate);
			 	    		audiobox.setTargetsamplerate(IWANTFREQ);
			 	    		audiobox.setChannel(srcchannel);
			 	    		audiobox.setTargetbytepersample(targetpersamplesize);
			 	    	   
			 	    		audiobox.setSrcnbsamples(srcnbsamples);
			 	    		audiobox.set_pts_Blurwritensample(audioframepts);
			 	    		audiobox.setFrameendtime(frameendtime);
			 	    		audiobox.setAurecycleandtool(aurecycle);
			 	    		audiobox.setAupktpts(pktpts);
			 	    		boolean added= auconnector.setData(audiobox);
			 	    		if(added==true){
			 	    		   unrecycleauq.add(auconnector);
			 	    		}
			 	    		
			 	    		 if(!audioready){
			 	    			firstaufillsize++;
			 //	System.out.println("音频线程已经准备了对接体"+firstaufillsize);
			 	    			
			 	    			if(!isrealtime){
			 	    				 if(firstaufillsize==50){
		        	    				   audioready=true;
		        	    				   firstaufillsize=0;
		        	    				   System.out.println("音频线程50isready"); 
			 	    				 }
			 	    			}else{
	        	    			   if(firstaufillsize==(auconnectortotal/2)){
	        	    				   audioready=true;
	        	    				   firstaufillsize=0;
	        	    				   System.out.println("音频线程100isready");   				   
	        	    			   }
	        	    		   }
	        	    		    
			 	    		 }
					  }
					  
					 
				   AVCODEC.av_free_packet(audiopacket.getPointer());
			 	   audiopacket.read();
			 	   freeaupacketqueue.add(audiopacket);
			 	   audiopacket=null;
					  
					  
			      
					 
				}finally{
					audiolock.unlock();
	//System.out.println("音频线程内解锁成功");				
				}
				
					
				
			}
			AVCODEC.avcodec_flush_buffers(audiostream.codec);
			AVUTIL.av_frame_unref(nativeaudioframe);
 		    AVUTIL.av_freep(nativeaudioframe);
 		    if(swrcontext!=null){
 		    	SWRESAMPLE.swr_free(ppswrcontext);
 		    	swrcontext=null;
 		    }
 		    
 		  
			
			audiodestroy=true;
			
		}
	}

		
	
	
	
	
	
	
	
	
	@Override
	/*public void play() {
		// TODO Auto-generated method stub
		
		
		if(paused){ 
		
		 readpacketlock.lock();
		 try{
			 paused=false;	
			 AVFORMAT.av_read_play(pavformatctxt);
			 readcondition.signal();
			// System.out.println("读条件通知"); 
		 }finally{
			   readpacketlock.unlock();
		   }
		 videolock.lock();
		 try{
			
			 videocondition.signal();
			// System.out.println("视频条件通知"); 		 
		 }finally{
			 videolock.unlock();
	//System.out.println("视频通知后解锁");		 
		   }
		// System.out.println("线程外将要获得音频锁");		 
		 audiolock.lock();
		// System.out.println("线程外获得音频锁成功");	
		try{
			//System.out.println("音频条件通知"); 
			audiocondition.signal();
		}finally{
			audiolock.unlock();
		   }
		
		}	
		
	System.out.println("引擎play");	
		
	}*/
	
	public void play() {
		// TODO Auto-generated method stub
		if(paused){
			
		 readpacketlock.lock();
		 try{
			 videolock.lock();
			
			 try{
				
				 audiolock.lock();
				
				try{
					paused=false;
					AVFORMAT.av_read_play(pavformatctxt);
					audiocondition.signal();    
				}finally{
					audiolock.unlock();
				   }
				
			 }finally{
				 videocondition.signal();
				 videolock.unlock();
	 
			   }
			 
		 }finally{
			   readcondition.signal();
			   readpacketlock.unlock();
		   }
		}
	System.out.println("引擎play");	
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		pause();
		this.forceStop();
		
		System.out.println("引擎stop");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
		if(!paused){
		
		
		
		
		 readpacketlock.lock();
		 try{
			 videolock.lock();
			 try{
				
				 audiolock.lock();
				
				try{
					 paused=true;
					AVFORMAT.av_read_pause(pavformatctxt);
				        
				}finally{
					audiolock.unlock();
				   }
				
			 }finally{
				 videolock.unlock();
	 
			   }
			 
		 }finally{
			   readpacketlock.unlock();
		   }
		}
	System.out.println("引擎暂停");	
		
	}

	@Override
	public void setTime(float time) {
		// TODO Auto-generated method stub
		
	}

	public FFEngine(String filename) {
		super();
		this.uri = filename;
	}
	
	
	public ByteBuffer cloneDirectBuffer(ByteBuffer bytebuffer){
		ByteBuffer copy = ByteBuffer.allocateDirect(bytebuffer.limit()).order(ByteOrder.nativeOrder());
        copy.clear();
        copy.put(bytebuffer);
        copy.rewind();
        return copy;
        
	}
	
	public ByteBuffer cloneHeapBuffer(ByteBuffer srcbytebuffer){
		ByteBuffer copy = ByteBuffer.allocate(srcbytebuffer.capacity());
        copy.clear();
        copy.put(srcbytebuffer);
        copy.rewind();
        return copy;
        
	}
	
	public final void copyBytebuffer(ByteBuffer srcbuffer,ByteBuffer  destbuffer){
		destbuffer.rewind();
		destbuffer.put(srcbuffer);
		destbuffer.rewind();
	}
	
	public class RecycleVP implements VideoToolAndRecyclebin{
         
		/* 此方法存在问题 使用时需重新设置！！！！！
		 * (non-Javadoc)
		 * @see com.yw.ffmpegj.ToolAndRecyclebin#recycle(com.yw.ffmpegj.Connector)
		 */
		@Override
		public void recycle(Connector connector) {
			// TODO Auto-generated method stub
			unrecyclevpq.remove(connector);
			freevpq.add((VideoConnector)connector);
			
		}
		
		/* 
		 * 在音频forcestop之后，切记不能调用reinit方法 否则音视频的finish变量会被重置 导致本身应该停止的
		 * 音视频不能正常结束而崩溃。 
		 * (non-Javadoc)
		 * @see com.yw.ffmpegj.ToolAndRecyclebin#recyclePreAll(com.yw.ffmpegj.Connector)
		 */
		public void recyclePreAll(Connector connector){
			   if(isVideofinished()){
				   return;
			   }
				while(true){
					VideoConnector c=unrecyclevpq.poll();
					if(c==null){
						System.out.println("未回收队列中没有对接体了");
					}
					if(!c.equals(connector)){
						c.cleanData();
						freevpq.add(c);
					}else{
						freevpq.add(c);
						break;
					}
					
				}
				
				if(eof && unrecyclevpq.isEmpty()){
					videofinished=true;
				}
				
				
			
		}
		
		public void recycleUnused(Connector connector){
			freevpq.add((VideoConnector)connector);
		}

		@Override
		public Connector getfilledConnector() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isrealtime() {
			// TODO Auto-generated method stub
			return isrealtime;
		}
		
		public void forceRecycle(){
			if(videoindex!=-1){
				AVCODEC.avcodec_flush_buffers(videostream.codec);////对seek后的处理 需要清理掉codec buffer
			}
			
			synchronized(unrecyclevpq){
			
			while(true){
				VideoConnector vc=unrecyclevpq.poll();
				if(vc==null){
					break;
				}
				vc.cleanData();
				vc.getData().setIsforcecleaned(true);
				freevpq.add(vc);
			}
			
		  }
			
		}
		
		public boolean isVideofinished() {
			return videofinished;
		}
		
	}
	
	public class RecycleAU implements AudioToolAndReccyclebin{
		
		double dltdiff;

		public double getDltdiff() {
			return dltdiff;
		}

		@Override
		public void recycle(Connector connector) {
			// TODO Auto-generated method stub
			freeauq.add((AudioConnector)connector);
			if(eof && unrecycleauq.isEmpty()){
				audiofinished=true;
			}
		}

		@Override
		public void recyclePreAll(Connector connector) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void recycleUnused(Connector connector) {
			// TODO Auto-generated method stub
			
		}
		
		public Connector getfilledConnector(){
			if(audioready){
				return unrecycleauq.poll();
			}
			return null;
		}
		
		public void forceRecycle(){
			AVCODEC.avcodec_flush_buffers(audiostream.codec);//对seek后的处理 需要清理掉codec buffer
			synchronized(unrecycleauq){
			while(true){
				AudioConnector ac=unrecycleauq.poll();
				if(ac==null){
					break;
				}
				
				freeauq.add(ac);
			}
		  }
			dltdiff=0;
		}
		
		public boolean isAudiofinished() {
			return audiofinished;
		}


		@Override
		public int  getSyncedAudio(AudioConnector ac, double diff) {
			// TODO Auto-generated method stub
			
			
			
			int resample_data_size;
			FFAudioData audiodata=ac.getData();
             int src_nb_samples=audiodata.srcnbsamples;
			 int wanted_nb_samples = src_nb_samples;
			 
			 int min_nb_samples, max_nb_samples;
			
			double avg_diff;
			
			//if(diff<0){
				
			
			
			if((!isrealtime) && diff!=0.0 && Math.abs(diff)<10 ){
				audio_diff_cum = diff +audio_diff_avg_coef * audio_diff_cum;
				
				/*if (audio_diff_avg_count < AUDIO_DIFF_AVG_NB) {
		              
		                audio_diff_avg_count++;
		            } else {*/
		            	avg_diff = audio_diff_cum * (1.0 - audio_diff_avg_coef);
		            	if (Math.abs(avg_diff) >= audio_diff_threshold) {
		            		wanted_nb_samples=src_nb_samples+ (int)(diff * audiodata.srcsamplerate);//我想要的采样个数是在原始采样率的基础上计算出来的
		            		min_nb_samples=src_nb_samples*(100-10)/100;
		            		max_nb_samples=src_nb_samples*(100+10)/100;
		            		wanted_nb_samples=Math.min((Math.max(wanted_nb_samples, min_nb_samples)),max_nb_samples);
		            	}
		           // }
			}else {
	           
	          audio_diff_avg_count = 0;
	          audio_diff_cum       = 0;
	       }
			
		 // }
			
			
			
			PointersWithBuffers pwb=audiodata.getPointersWithbuffers();
			 int out_count=	wanted_nb_samples*IWANTFREQ/audiodata.srcsamplerate+256;
		     int out_size=AVUTIL.av_samples_get_buffer_size(null, audiodata.getChannel(), out_count, AVUtilLibrary.AVSampleFormat.AV_SAMPLE_FMT_S16, 0);
		     dltdiff=(wanted_nb_samples-src_nb_samples)*0.1/(ac.getData().getSrcSamplerate());
 	    	
		     if(wanted_nb_samples!=src_nb_samples){
					int ret=SWRESAMPLE.swr_set_compensation(swrcontext, (wanted_nb_samples-src_nb_samples)*IWANTFREQ/(ac.getData().getSrcSamplerate()), wanted_nb_samples*IWANTFREQ/(ac.getData().getSrcSamplerate()));//第二个参数分解就是你在原始的采样率中计算出的采样偏差个数在目标采样中应该是几个采样dlt*1/srcfreq 也就是变化所经历的时间
					//再乘上目标采样率就是此时间换算到目标采样率中的采样个数最终就是 在原采样率的基础上 想要的采样率减去原采样率的差在目标采样率上的采样个数
					if(ret<0){
	System.out.println("音频压缩失败");					
						
					}
				}
				
		     
		     
		     if(outbuffer==null){
 	    		outbuffer=AVUTIL.av_malloc(35280*6);
 	    		firstallocbuffersize=out_size;
 	    	}
 	    	/*else{
 	    		  prvsize.setValue(firstallocbuffersize);
 	    		  AVUTIL.av_fast_malloc(outbuffer,prvsize ,out_size );
 	    		  firstallocbuffersize=out_size;
 	    	}
 	    	*/
 	    	out.setValue(outbuffer);
 	    	
 	    	int ret= SWRESAMPLE.swr_convert(swrcontext, out, out_count, pwb.ppin, audiodata.srcnbsamples);
	 	    	if(ret==out_count){
	 	    		SWRESAMPLE.swr_init(swrcontext);
	 	    	}
	 	    	
	 	    
	 	    	resample_data_size=ret*audiodata.channel*audiodata.targetbytepersample;
 	    	//System.out.println("$$$$$$$$$$$$$$$out_count"+out_count+"转换后真正的输出个数"+resample_data_size);
			return resample_data_size;
		}
		
		
		
		/**
		 * 当diff为负数的时候 说明音频已经落后于电影时间 ，音频需要加速，视频需要放慢所以
		 * 把这个负值变成正数 加到视频的pts上 使其延后播放反之。。。。。。 
		 * @param ac
		 * @param diff
		 * @return
		 */
		public byte[]  getSyncedAudioByArray(AudioConnector ac, double diff) {
			
		    vdiff=-diff;
			
			
			int audiodatasize=getSyncedAudio(ac,diff);
			byte[] audiodata=outbuffer.getByteArray(0, audiodatasize);
			return audiodata;
		}
		
		
		/**
		 * @param ac
		 * @param diff
		 * @param datapool
		 * @return 返回值表明给你传入的字节数组中填充了多少个数量的字节
		 */
		public int  getSyncedAudioByGivenArray(AudioConnector ac, double diff,byte[] datapool) {
		//System.out.println("~~~~~~~~~~~~~~差值是：   "+diff);	
			int audiodatasize=getSyncedAudio(ac,diff);
			
            if(datapool.length<audiodatasize){
            	 throw new RuntimeException("数据池容量不够");
			}
			outbuffer.read(0, datapool, 0, audiodatasize);
			
			return audiodatasize;
		}

		@Override
		public boolean isrealtime() {
			// TODO Auto-generated method stub
			return isrealtime;
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
	
	/*public void configure_audio_filters(int samplerate,PointerByReference filterctx_src,PointerByReference filterctx_sink,String srcargs,Pointer filterGraph){
		if(filterGraph!=null){
		PointerByReference ppfilgraph=new PointerByReference();
		ppfilgraph.setPointer(filterGraph);
		AVFILTER.avfilter_graph_free(ppfilgraph);
		}
		filterGraph= AVFILTER.avfilter_graph_alloc();
		
		Pointer psrcargs=stringToMem(srcargs);
		
		

		PointerByReference ppinputs=new PointerByReference();
		PointerByReference ppoutputs=new PointerByReference();
		Pointer inputs=ppinputs.getValue();
		Pointer outputs=ppoutputs.getValue();
		inputs =AVFILTER. avfilter_inout_alloc();
	    outputs  =AVFILTER. avfilter_inout_alloc();
	    AVFilterInOut.ByValue avi=new AVFilterInOut.ByValue(inputs);
	    AVFilterInOut.ByValue avo=new AVFilterInOut.ByValue(outputs);
	    
		  
	AVFilterGraph.ByReference avfg=new AVFilterGraph.ByReference(filterGraph);
    avfg.read();
    System.out.println(avfg.toString());
	 System.out.println(avfg.nb_filters+"   "+avfg.nb_threads);
			
		
		int ret;
		
		final int outsamplefmts []= {AVUtilLibrary.AVSampleFormat.AV_SAMPLE_FMT_S16,-1};
		final int outchanellaylout[] ={ AVUtilLibrary.AV_CH_LAYOUT_STEREO,-1};
		final int outsamplerat []= {8000,-1};
		final int outchannels[]={2,-1};
		
	
	    Pointer avfiltersrc =	AVFILTER.avfilter_get_by_name("abuffer");
	   
	    if(avfiltersrc!=null){
	    	System.out.println("abuffr不是null");
	    }
	    
	    
	    
	    Pointer avfiltersink =	AVFILTER.avfilter_get_by_name("abuffersink");
	   
	    if(avfiltersink!=null){
	    	System.out.println("  abuffrsink不是null   ");
	    }
	  
	 
	   ret=  AVFILTER.avfilter_graph_create_filter(filterctx_src, avfiltersrc, "in", psrcargs, null, filterGraph);
	       avfg.read();
		   System.out.println("Cannot create audio buffer source\n"+avfg.nb_filters+"   "+avfg.nb_threads);
		   
		 
	 
	   
	   AVFilterContext.ByReference af=new AVFilterContext.ByReference(filterctx_src.getValue());
	   
	   AVClass.ByReference avc=new AVClass.ByReference(af.av_class);
	  
	  AVOption.ByReference avp=new AVOption.ByReference(avc.option.getPointer(0));
	  System.out.println(avp.name);
	   
	   
	   
	   
	   ret=AVFILTER.avfilter_graph_create_filter(filterctx_sink, avfiltersink, "out", null, null, filterGraph);
	   if(ret<0){
		   System.out.println("Cannot create audio buffer sink\n");
	   }
	   
	   avfg.read();
	   
	   
	   ret=AVUTIL.av_opt_set_int(filterctx_sink.getValue(), "all_channel_counts", 1, AVUtilLibrary.AV_OPT_SEARCH_CHILDREN);
	   if(ret<0){
		   System.out.println("all_channel_counts设置不成功");
	   }
	   
	   ret=AVUTIL.av_opt_set_bin(filterctx_sink.getValue(), "sample_fmts", outsamplefmts, 4, AVUtilLibrary.AV_OPT_SEARCH_CHILDREN);
	   if(ret<0){
		   System.out.println("sample_fmts设置不成功");
	   }
	   
	   ret=AVUTIL.av_opt_set_bin(filterctx_sink.getValue(), "channel_layouts", outchanellaylout, 4, AVUtilLibrary.AV_OPT_SEARCH_CHILDREN);
	   if(ret<0){
		   System.out.println("channel_layouts设置不成功");
	   }
	   
	   ret=AVUTIL.av_opt_set_bin(filterctx_sink.getValue(), "sample_rates", outsamplerat, 4, AVUtilLibrary.AV_OPT_SEARCH_CHILDREN);
	   if(ret<0){
		   System.out.println("sample_rates设置不成功");
	   }
	   
	   ret=AVUTIL.av_opt_set_bin(filterctx_sink.getValue(), "channel_counts", outchannels, 4, AVUtilLibrary.AV_OPT_SEARCH_CHILDREN);
	   if(ret<0){
		   System.out.println("channel_counts设置不成功");
	   }
	   
	        
	     avo.name="in";
		 avo.filter_ctx=filterctx_src.getValue();
		 avo.pad_idx=0;
		 avo.next=null;
		 avo.write(); 
	   
	    avi.name="out";
	    avi.filter_ctx= filterctx_sink.getValue();
	    avi.pad_idx=0;
	    avi.next=null;
	    avi.write();
	 
	
	 
	 
	// ret=  AVFILTER.avfilter_link(filterctx_src.getValue(),0,filterctx_sink.getValue(),0);
	 
	 Pointer pfilter_descr=stringToMem(filter_descr);
	 
	ret=AVFILTER.avfilter_graph_parse_ptr(filterGraph, pfilter_descr,
             ppinputs, ppoutputs, null);
	avi.read();
	avo.read();
    System.out.println("解析ptr方法"+ret);
    
 
	 ret= AVFILTER.avfilter_graph_config(filterGraph,null);
	  avfg.read();
	  
System.out.println("配置graph配置format后"+ret);	  
	   
		
	}
	
	public Pointer stringToMem(String s){
		Memory m=new Memory(s.length());
		m.write(0, s.getBytes(), 0, s.length());
		return m;
		
	}
	*/
	/*public int initfilter(String s){
		//char args[512];
	    int ret = 0;
	    Pointer abuffersrc  = AVFILTER.avfilter_get_by_name("abuffer");
	    Pointer abuffersink =AVFILTER. avfilter_get_by_name("abuffersink");
	    
	    AVFilter.ByReference filtersrc=new AVFilter.ByReference(abuffersrc);
	    AVFilter.ByReference filtersink=new AVFilter.ByReference(abuffersink);
	    
	    
	    
	    PointerByReference ppoutputs=new PointerByReference();
	    
	    PointerByReference ppinputs=new PointerByReference();
	    
	    Pointer poutputs =AVFILTER. avfilter_inout_alloc();
	    ppoutputs.setValue(poutputs); 
	  
	    Pointer pinputs  =AVFILTER. avfilter_inout_alloc();
	    ppinputs.setValue(pinputs);
	    
	 
	    
	     int out_sample_fmts[] = { AVUtilLibrary.AVSampleFormat.AV_SAMPLE_FMT_S16 };
	     int out_channel_layouts[] = { AVUtilLibrary.AV_CH_LAYOUT_MONO};
	     int out_sample_rates[] = { 8000 };
	    Pointer outlink;
	    

	    pfilgraph = AVFILTER.avfilter_graph_alloc();
	    AVFilterGraph.ByReference avfiltergraph =new AVFilterGraph.ByReference(pfilgraph);
	     
	    ret = AVFILTER.avfilter_graph_create_filter(filterctx_src, abuffersrc, "in",
	                                       AVUTIL.av_strdup(s), null, pfilgraph);
	    if (ret < 0) {
	    	System.out.println("avfilter_graph_create_filter 失败");
	       
	    }
	    

	   
	    ret =AVFILTER. avfilter_graph_create_filter(filterctx_sink, abuffersink, "out",
	                                       null, null, pfilgraph);
	    if (ret < 0) {
	     
	    }
	   
	    ret = AVUTIL.av_opt_set_bin(filterctx_sink.getValue(), "sample_fmts", creatInpointer(out_sample_fmts), 4,
	    		AVUtilLibrary.AV_OPT_SEARCH_CHILDREN);
	    if (ret < 0) {
	    	System.out.println("sample_fmts failed");
	    }

	    ret = AVUTIL.av_opt_set_bin(filterctx_sink.getValue(), "channel_layouts", creatInpointer(out_channel_layouts), 4,
	    		AVUtilLibrary.AV_OPT_SEARCH_CHILDREN);
	    if (ret < 0) {
	    	System.out.println("channel_layouts failed");
	    }
	    

	    ret = AVUTIL.av_opt_set_bin(filterctx_sink.getValue(), "sample_rates", creatInpointer(out_sample_rates), 4,
	    		AVUtilLibrary.AV_OPT_SEARCH_CHILDREN);
	    if (ret < 0) {
	    	System.out.println("sample_rates failed");
	    }

	  
	    AVFilterInOut.ByReference outputs = new AVFilterInOut.ByReference(poutputs);
System.out.println(outputs.toString());	
	    outputs.name       = AVUTIL.av_strdup("in");
	    outputs.writeField("name");
	    outputs.filter_ctx = filterctx_src.getValue();
	    outputs.writeField("filter_ctx");
	    outputs.pad_idx    = 0;
	    outputs.writeField("pad_idx");
	    outputs.next       = null;
	    outputs.read();
      
        
       
        
        AVFilterInOut.ByReference inputs = new AVFilterInOut.ByReference(pinputs);
	    inputs.name       = AVUTIL.av_strdup("out");
	   inputs.writeField("name");
	    inputs.filter_ctx = filterctx_sink.getValue();
	    inputs.writeField("filter_ctx");
	    inputs.pad_idx    = 0;
	    inputs.writeField("pad_idx");
	    inputs.next       = null;
	    inputs.read();
	 
	    
	    if(pfilgraph!=null){
	    	System.out.println("pfilgraph!=null");
	    }
	    
	   ret =AVFILTER.avfilter_graph_parse_ptr(pfilgraph, AVUTIL.av_strdup(filter_descr), ppinputs, ppoutputs, null);
	   //ret=  AVFILTER.avfilter_link(filterctx_src.getValue(),0,filterctx_sink.getValue(),0);
	    if(ret>0){
	    	System.out.println("解析成功"+ret);
	    }
	   
	       
	  filtersrc.read();
	  filtersink.read();
	  avfiltergraph.read();
	  AVFilterContext.ByReference fc= new AVFilterContext.ByReference(avfiltergraph.filters.getValue());
	System.out.println(fc.nb_outputs);
	AVClass.ByReference avclass=new AVClass.ByReference(fc.av_class);
	
		AVOption.ByReference option =new AVOption.ByReference(avclass.option);
		
		System.out.println(option.name);
		
	
	
	
	

	    if ((ret = AVFILTER.avfilter_graph_config(pfilgraph, null)) < 0);
	    //throw new RuntimeException("avfilter_graph_config failed");
	     System.out.println("config 失败"+ret);
	      

	    return ret;
	}*/
	public Pointer creatInpointer(int[] intarray){
		Pointer nativep=AVUTIL.av_malloc(intarray.length*4);
		nativep.write(0, intarray, 0, intarray.length);
		return nativep;
	}
	
	public int convertSrcnbSample2tnbs(int srcnbsample ,int destsamplerate,int srcsamplerate){
		int nbsamples=srcnbsample*destsamplerate/srcsamplerate;
		nbsamples+=nbsamples%2;//为了转换成偶数
		return nbsamples;
	}
	
	public boolean isReady(){
		if(eof){
			return true;
		}
		if(videoindex==-1){
			return audioready;
		}
		if(audioready && (firstfillsize>0||videoready)){//这个地方判断firstfillsize>0的意思是有些音频文件只有一帧视频帧 只要这个大于0 就认为视频准备好了
			return true;
		}
		//return audioready&&videoready;
		return false;
	}
	
	
	
	public void convertAudio(){
		
	}
	
	
	public static boolean is_realtime(AVFormatContext.ByReference avformatcontext){
		Pointer piformat=avformatcontext.iformat;
		inputformat=new AVInputFormat.ByReference(piformat);
		String formatname=inputformat.name;
		if(formatname.equals("rtsp")||formatname.equals("rtp")||formatname.equals("sdp")){
			return true;
		}
		
		formatname=avformatcontext.filename.toString().split(":")[0];
		if(avformatcontext.pb!=null && (formatname.equals("rtp")||formatname.equals("udp"))){
			return true;
		}
		
System.out.println("iformat.name="+inputformat.name);	
	return false;
	}
	
	
	long seek_target;
	long seek_rel;
	long seek_min=0;
	long seek_max=0;
	int seek_flags=0;
	
	
	/**
	 * @param time 参数是以秒为单位的
	 * @param rel 每次快进或者快退的时间量快进的话是正值 后退的话是负值 是以秒为单位的
	 */
	
	public synchronized double seek(double time,double rel){
		boolean endandfbskip=false;
		if(stoped){
			return 0;
		}
		
	System.out.println("seek要跳转到的目标时间"+time+"持续时间"+this.getAVDuration());	
		//此if判断，因为读线程运行的速度快 有可能提前就读到了文件的末尾，但是视频线程和音频线程还有没播放 完的  就得判断如果读到了文件的末尾 但是要跳转的时间超过了文件的持续时间  这种 情况就不跳转了 直接到达到文件持续时间处
		if(eof && time>=this.getAVDuration()){
			
			return this.getAVDuration();
		}else if(eof && time<this.getAVDuration()){//已经读到了文件的末尾 但是要跳转的时间没有到达文件的持续时间 这种情况可以正常的跳转
			
			endandfbskip=true;
			
		}else if(eof && rel<0){//这种情况是 读到了文件的末尾 但是这个时候你的动作是往后快进 这个时候也是允许seek的
			endandfbskip=true;
		}
		
		seek_target=(long)time*1000000;
System.out.println("seek_target="+seek_target);		
		seek_rel=(long)rel*1000000;
		seek_flags &= ~2;
		if(seek_by_bytes>0){
			seek_flags|=2;
		}
		seek_min=seek_rel>0?seek_target-seek_rel+2:Long.MIN_VALUE;
	System.out.println("seek_min"+seek_min);	
		
		seek_max=seek_rel<0?seek_target-seek_rel-2:Long.MAX_VALUE;
	System.out.println("seek_max"+seek_max);			
		 while(!isReady()){
				try {
					Thread.sleep((long)0.1);
		System.out.println("1我等待视频音频线程准备数据");			
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		 System.out.println("1视频音频线程准备好了数据");	
		pause();
		
		 readpacketlock.lock();
		 try{
			 videolock.lock();
			 try{
				
				 audiolock.lock();
				
				try{
	System.out.println("我要跳转了");
	            if(endandfbskip){
	            	cancelEnd();
	            }
	            vprecycle.forceRecycle();
	            aurecycle.forceRecycle();	
				int ret=	AVFORMAT.avformat_seek_file(pavformatctxt, -1, seek_min, seek_target, seek_max, seek_flags);
				isseek=true;
				//cancelEnd();
			System.out.println("已经seek完了"+ret);	
				if(ret<0){
		            System.out.println("seek 失败");			
				}
				cleanpacket();
				
				this.cleanReadyFlag();
				 
				 
				}finally{
					audiolock.unlock();
				   }
				
			 }finally{
				 videolock.unlock();
	 
			   }
			 
		 }finally{
			   readpacketlock.unlock();
		   }
		 
		// paused=false;
		 
	
		 play();
		 
		 while(!isReady()){
				try {
					Thread.sleep((long)0.1);
		//System.out.println("2我等待视频音频线程准备好");			
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		 System.out.println("2视频音频线程准备好了数据");	
		 
		 reInintSyncArgs();
		
		return auafterseekbeginpts;
		
	}
	
	public void cleanpacket(){
		while(true){
			AVPacket.ByReference vp=videoqueue.poll();
			if(vp==null){
				break;
			}
			
			AVCODEC.av_free_packet(vp.getPointer());
    		vp.read();
    	    freevdpacketqueue.add(vp);
    	   
			
		}
		
		while(true){
			AVPacket.ByReference ap=audioqueue.poll();
			if(ap==null){
				break;
			}
			AVCODEC.av_free_packet(ap.getPointer());
    		ap.read();
    		freeaupacketqueue.add(ap);
			
		}
		
	}
	
	
	public void cleanConnector(){
		
	}
	
	public void reInintSyncArgs(){
		audio_diff_avg_count = 0;
        audio_diff_cum       = 0;
	}
	
	
	 public void setFfengine_audio_hw_buf_size(int ffengine_audio_hw_buf_size) {
			this.ffengine_audio_hw_buf_size = ffengine_audio_hw_buf_size;
		}
	 
	 
	 
	 /**
	  * 必须在initandstart方法后调用
	 * @return
	 */
	public float getAVDuration() {
		   if(isrealtime){
			   return 365*24*60*60;
		   }
			return AVDuration/1000000.0f;
		}
	
	

	public boolean isIsexit() {
		return isexit;
	}



	public void setIsexit(boolean isexit) {
		this.isexit = isexit;
	}
	
	
	/**
	 * 引擎是否已经读到音视频流的文件末尾了
	 * @return
	 */
	public boolean isEof(){
		return eof;
	}
	
	public boolean isStoped() {
		return stoped;
	}


    /**
     * reinitme 没有给isrealtime赋值 是在initandstart方法总赋值 就是你每重新播放一个视频的时候 都会
     * 重新检查当前要播放的文件是否是一个实时流媒体 并且给isrealtime赋值
     */
    public void reinit(){
    	   formatCtx=null;
		   videostream=null;
		   audiostream=null;
		   subtitlestream=null;
		   videoindex=-1;
		   audioindex=-1;
		   subtitleindex=-1;
		   videocodecCtx=null;
		   videocodec=null;
		   audiocodecCtx=null;
		   audiocodec=null;
		   eof=false;
		   videofinished=false;
		   audiofinished=false;
		   videodestroy=false;
		   audiodestroy=false;
		   isexit=false;
		   this.cleanReadyFlag();
		   this.cleanNoPacketFlag();
		   this.cleanNoFreeConnector();
		   this.cleanFullData_NoFreePacket();
    }
    
    public void cancelEnd(){
    	
    	   eof=false;
		   videofinished=false;
		   audiofinished=false;
		  
    	
    }
    
    
    public synchronized void forceStop(){
    	if(!stoped){
    		
    		readpacketlock.lock();
   		   try{
   			 videolock.lock();
   			 try{
   				
   				 audiolock.lock();
   				
   				try{
   					
   					eof=true;
   		    		audiofinished=true;
   		    		videofinished=true;
   		    		
   		    		isexit=true;
   		    				
   	
   	                vprecycle.forceRecycle();
   	                aurecycle.forceRecycle();	
   			
   				    cleanpacket();
   				 
   				 this.cleanReadyFlag();
   				
   				}finally{
   					audiolock.unlock();
   				   }
   				
   			 }finally{
   				 videolock.unlock();
   	 
   			   }
   			 
   		 }finally{
   			   readpacketlock.unlock();
   		   }
   		   
   		//允许在任意的情况下 进行强制停止 因为在paused状态下 三个线程是等待的 ，尽管以上的三个变量（audiofinished videofinished isexit=true）   
   		//也不会停止的 所以只有在播放的时候 也就是三个线程在运行的情况下 才最终能强制停止  
   		   if(paused=true){
   			   this.play();
   		   }
    		
    		while(!stoped){
    			try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			
    		}
    		
    	}
    	
    	System.out.println("强制等待3个线程结束");
    }
    
    
public boolean isVideoExist(){
	if(!stoped){
		if(videoindex==-1){
			return false;
		}
			return true;
		
	}
	throw new RuntimeException("调用此方法之前必须调用了intitandstart方法");	
	}

public boolean isAudioExist(){
	if(!stoped){
		if(audioindex==-1){
			return false;
		}
			return true;
		
	}
	throw new RuntimeException("调用此方法之前必须调用了intitandstart方法");	
	}

	public void reNewConnector(){
		Iterator ai=freeauq.iterator();
		Iterator vi=freevpq.iterator();
		while(ai.hasNext()){
			AudioConnector ac=(AudioConnector)ai.next();
			ac.reNew();
		}
		
		while(vi.hasNext()){
			VideoConnector vc=(VideoConnector)vi.next();
			vc.reNew();
		}
	}



	public void setUri(String uri) {
		//System.out.println("空闲的视频包队列的个数是："+freevdpacketqueue.size());
		//System.out.println("空闲的音频包队列的个数是："+freeaupacketqueue.size());
		this.uri = uri;
		reNewConnector();
	}
	
	public void cleanReadyFlag(){
		
		videoready=false;
	    firstfillsize=0;
		  
		audioready=false;
		firstaufillsize=0;
		
	}
	
	public void cleanNoPacketFlag(){
		isaudionopacket=false;
		isvideonopacket=false;
	}
	
	public void cleanNoFreeConnector(){
		audionofreeconnector=false;
		videonofreeconnector=false;
		
	}
	
	public void cleanFullData_NoFreePacket(){
	     audiofulldata_nofreepacket=false;
		 videofulldata_nofreepacket=false;
	}
	
	/**
	 * 为了防止网络视频缓冲不到数据 而导致崩溃的情况。
	 * @return
	 */
	public boolean isAandVNoPacket(){
		return isaudionopacket && isvideonopacket;
	}
	
	public boolean isAorVNoPacket(){
		return isaudionopacket || isvideonopacket;
	}



	public boolean isRealtime() {
		return isrealtime;
	}
	
	
	public boolean isNoFreeConnector(){
		return audionofreeconnector;
	}
	
	public boolean isAandVFullData_NoFreePacket(){
		return audiofulldata_nofreepacket && videofulldata_nofreepacket;
	}
	
	public boolean isAorVFullData_NoFreePacket(){
		return audiofulldata_nofreepacket || videofulldata_nofreepacket;
	}

}
