package com.yw.test;


import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import com.yw.ffmpegj.libavcodec.AVCodecContext;
import com.yw.ffmpegj.libavcodec.AVCodecLibrary;
import com.yw.ffmpegj.libavformat.AVFormatContext;
import com.yw.ffmpegj.libavformat.AVFormatLibrary;
import com.yw.ffmpegj.libavformat.AVInputFormat;
import com.yw.ffmpegj.libavformat.AVStream;
import com.yw.ffmpegj.libavutil.AVUtilLibrary;

/**
 * @author wang
 *
 */
public class newTestPicturePlay {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("jna.debug_load", "true");
		final String filename = "E:\\02.flv";
		 
		final AVFormatLibrary AVFORMAT = AVFormatLibrary.INSTANCE;
		final AVCodecLibrary AVCODEC = AVCodecLibrary.INSTANCE;
		final AVUtilLibrary AVUTIL = AVUtilLibrary.INSTANCE;
		
		
		AVFORMAT.av_register_all();
		final PointerByReference ppFormatctx = new PointerByReference();
		final PointerByReference avd = new PointerByReference();
		
		AVInputFormat inputformat=new AVInputFormat();
		
		
		if(AVFORMAT.avformat_open_input(ppFormatctx, filename, null, null)!=0){
			System.out.println("can not open file");
		}
		
		System.out.println(ppFormatctx.getValue());
		//final AVFormatContext.ByValue formatCtx = new AVFormatContext.ByValue(ppFormatctx.getValue());
		
		
		System.out.println("我已经读完文件");
		//
		
		Pointer pformatctx=ppFormatctx.getValue();
		//AVFORMAT.avformat_find_stream_info(formatCtx, null);
		
		/*if (AVFORMAT.avformat_find_stream_info(formatCtx,null) < 0)
		    throw new RuntimeException("Couldn't find stream information"); // Couldn't find stream information
*/		
		if(AVFORMAT.avformat_find_stream_info(pformatctx, null)<0){
			 throw new RuntimeException("Couldn't find stream information");
		}
		final AVFormatContext.ByReference formatCtx = new AVFormatContext.ByReference(pformatctx);
		AVFORMAT.av_dump_format(formatCtx, 0, filename, 0);
		 
		
		System.out.println(formatCtx.nb_streams);
		System.out.println("file name"+new String(formatCtx.filename));
		
		
		Pointer pstream=formatCtx.streams.getValue();
		
		
		//AVStream s1=new AVStream(formatCtxBR.streams);
		
		//AVStream s2=new AVStream(formatCtxBR.stream1);
		//System.out.println(ps.length);
		
		// int videoStream=-1;
		   // for (int i=0; i<formatCtx.nb_streams; i++)
		   // {  
		
		    	//Pointer streampointer=formatCtxBR.streams.getValue();
		    	//Pointer nextp=streampointer.getPointer(1);
		        //Pointer ps=formatCtx.streams.getValue();
		//AVStream.ByValue stream=formatCtx.streams[0];
		    	//final AVStream.ByReference stream = new  AVStream.ByReference(streampointer);
		    	//Structure avstreams[]=stream.toArray(2);
		    	AVStream s1=(AVStream)avstreams[0];
		    	AVStream s2=(AVStream)avstreams[1];
		    	
		    	//目前只能得到二维指针上的第一个 这个地方无法得到二位指针指向的第二个 还得需要找到解决的办法
		    	
		    	//Pointer nextps=ps.getPointer(stream.size());
		    	//final AVStream.ByReference stream2 = new  AVStream.ByReference(nextps);
		    	//System.out.println(stream.id+"   video or audio"+stream.duration+"    "+stream.nb_decoded_frames);
		    	System.out.println(s1.index+"   video or audio"+s1.duration+"    "+s1.start_time);
		    	System.out.println(s2.id+"   video or audio"+s2.duration+"    "+s2.nb_frames);
		    	//final AVCodecContext codecCtx = stream.codec;
		    	//System.out.println("codecCtx " + i + ": " + codecCtx);
		    	/*if (codecCtx.codec_type == AVUtilLibrary.AVMediaType.AVMEDIA_TYPE_AUDIO)
		        {
		           System.out.println("我已经找到视频流了");
		    		videoStream=i;
		            break;
		        }
		  //  }
		*/

	}
	

}
