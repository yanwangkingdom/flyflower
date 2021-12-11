package com.yw.test;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.yw.ffmpegj.libavcodec.AVCodecContext;
import com.yw.ffmpegj.libavcodec.AVCodecLibrary;
import com.yw.ffmpegj.libavcodec.AVPacket;
import com.yw.ffmpegj.libavcodec.AVPacket.ByReference;
import com.yw.ffmpegj.libavformat.AVFormatContext;
import com.yw.ffmpegj.libavformat.AVFormatLibrary;
import com.yw.ffmpegj.libavformat.AVStream;
import com.yw.ffmpegj.libavutil.AVUtilLibrary;
import com.yw.ffmpegj.libsws.SwsLibrary;
public class startv {
	final AVFormatLibrary AVFORMAT = AVFormatLibrary.INSTANCE;
	final AVCodecLibrary AVCODEC = AVCodecLibrary.INSTANCE;
	final AVUtilLibrary AVUTIL = AVUtilLibrary.INSTANCE;
	final SwsLibrary SWSSCALE= SwsLibrary.INSTANCE;
	ConcurrentLinkedQueue<AVPacket.ByReference> videoqueue;
	ConcurrentLinkedQueue <AVPacket.ByReference> audioqueue;
	ConcurrentLinkedQueue <AVPacket.ByReference> subtitlequeue;
	ConcurrentLinkedQueue <AVPacket.ByReference> freequeue;
	String filename;
	
	public void initVariable(){
		filename="E:\\02.flv";
		AVFORMAT.av_register_all();
		freequeue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
		int freepacketsize=15;
		for(int i=0;i<freepacketsize;i++){
			AVPacket.ByReference freepacket=new AVPacket.ByReference();
			freequeue.add(freepacket);
		}
		
	    videoqueue=new 	ConcurrentLinkedQueue<AVPacket.ByReference>();
	    audioqueue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
	    subtitlequeue=new ConcurrentLinkedQueue<AVPacket.ByReference>();
		
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
			
			final AVFormatContext.ByReference formatCtx = new AVFormatContext.ByReference(pavformatctxt);
			if (AVFORMAT.avformat_find_stream_info(pavformatctxt,null) < 0)
			    throw new RuntimeException("Couldn't find stream information"); // Couldn't find stream information
		     
			 AVFORMAT.av_dump_format(pavformatctxt, 0, filename, 0);
			
			 formatCtx.read();
			 
			 int videoindex=-1 ,audioindex =-1,subtitleindex=-1; 
			 AVStream.ByReference videostream,audiostream,subtitlestream=null;
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
		    
		   AVPacket.ByReference packet = freequeue.poll();
		    if(packet==null){
		    	packet=new AVPacket.ByReference();
		    }
		    AVFORMAT.av_read_frame(pavformatctxt, packet);
		    if(packet.stream_index==videoindex){
		    	videoqueue.add(packet);
		    }
		    if(packet.stream_index==audioindex){
		    	audioqueue.add(packet);
		    }
		    if(packet.stream_index==subtitleindex){
		    	subtitlequeue.add(packet);
		    }
			
		}
	}

		
	

}
