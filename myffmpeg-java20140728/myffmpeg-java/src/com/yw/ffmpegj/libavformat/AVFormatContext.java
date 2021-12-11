// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVFormatContext.java

package com.yw.ffmpegj.libavformat;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;

import java.util.Arrays;
import java.util.List;

import com.yw.ffmpegj.libavcodec.*;
import com.yw.ffmpegj.libavutil.*;

// Referenced classes of package avformat:
//            AVChapter, AVFormatLibrary, AVInputFormat, AVOutputFormat, 
//            AVPacketList, AVProgram, AVStream

public class AVFormatContext extends Structure
{
    public static class ByReference extends AVFormatContext
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference(Pointer p)
        {
        	super(p);
        	//useMemory(p);
    		//read();
        	
        }
    }

    public static class ByValue extends AVFormatContext
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue(Pointer p)
        {
        	super(p);
        	//useMemory(p);
    		//read();
        }
    }


    /*public AVClass.ByReference av_class;
    public AVInputFormat.ByReference iformat;
    public AVOutputFormat.ByReference oformat;
    public Pointer priv_data;
    public AVFormatLibrary.AVIOContext pb;
    public int ctx_flags;
    public int nb_streams;
    public AVStream.ByReference streams[]=new AVStream.ByReference[20];
    public byte filename[]= new byte[1024];
    public long start_time;
    public long duration;
    public int bit_rate;
    public int packet_size;
    public int max_delay;
    public int flags;
    public int probesize;
    public int max_analyze_duration;
    public Pointer key;
    public int keylen;
    public int nb_programs;
    public AVProgram.ByReference programs[]=new AVProgram.ByReference[20];
    public int video_codec_id;
    public int audio_codec_id;
    public int subtitle_codec_id;
    public int max_index_size;
    public int max_picture_buffer;
    public int nb_chapters;
    public AVChapter.ByReference chapters[]=new AVChapter.ByReference[20];
    public AVFormatLibrary.AVDictionary metadata;
    public long start_time_realtime;
    public int fps_probe_size;
    public int error_recognition;
    public AVFormatLibrary.AVIOInterruptCB interrupt_callback;
    public int debug;
    public int ts_id;
    public int audio_preload;
    public int max_chunk_duration;
    public int max_chunk_size;
    public int use_wallclock_as_timestamps;
    public int avoid_negative_ts;
    public int avio_flags;
    public int duration_estimation_method;
    public int skip_initial_bytes;
    public int correct_ts_overflow;
    public int seek2any;
    public int flush_packets;
    public int probe_score;
    public AVPacketList.ByReference packet_buffer;
    public AVPacketList.ByReference packet_buffer_end;
    public long data_offset;
    public AVPacketList.ByReference raw_packet_buffer;
    public AVPacketList.ByReference raw_packet_buffer_end;
    public AVPacketList.ByReference parse_queue;
    public AVPacketList.ByReference parse_queue_end;
    public int raw_packet_buffer_remaining_size;
    public long offset;
    public AVRational offset_timebase;
    public int io_repositioned;
    public AVCodec video_codec;
    public AVCodec audio_codec;
    public AVCodec subtitle_codec;
*/
    public Pointer av_class;
    public Pointer iformat;
    public Pointer oformat;
    public Pointer priv_data;
    public Pointer pb;
    public int ctx_flags;
    public int nb_streams;
    public PointerByReference streams;
   // public AVStream.ByValue [] streams;
    //public AVStream.ByReference [] streams=new AVStream.ByReference[]{new AVStream.ByReference(),new AVStream.ByReference(),new AVStream.ByReference()} ;
  // public Pointer streams;
  // public Pointer stream1;
   // public Pointer []streams;
    public byte filename[]= new byte[1024];
    public long start_time;
    public long duration;
    public int bit_rate;
    public int packet_size;
    public int max_delay;
    public int flags;
    public int probesize;
    public int max_analyze_duration;
    public Pointer key;
    public int keylen;
    public int nb_programs;
    public PointerByReference programs;
    public int video_codec_id;
    public int audio_codec_id;
    public int subtitle_codec_id;
    public int max_index_size;
    public int max_picture_buffer;
    public int nb_chapters;
    public PointerByReference chapters;
    public Pointer metadata;
    public long start_time_realtime;
    public int fps_probe_size;
    public int error_recognition;
    public AVIOInterruptCB.ByValue interrupt_callback;
    public int debug;
    public int ts_id;
    public int audio_preload;
    public int max_chunk_duration;
    public int max_chunk_size;
    public int use_wallclock_as_timestamps;
    public int avoid_negative_ts;
    public int avio_flags;
    public int duration_estimation_method;
    public int skip_initial_bytes;
    public int correct_ts_overflow;
    public int seek2any;
    public int flush_packets;
    public int probe_score;
    public Pointer packet_buffer;
    public Pointer packet_buffer_end;
    public long data_offset;
    public Pointer raw_packet_buffer;
    public Pointer raw_packet_buffer_end;
    public Pointer parse_queue;
    public Pointer parse_queue_end;
    public int raw_packet_buffer_remaining_size;
    public long offset;
    public AVRational offset_timebase;
    public int io_repositioned;
    public Pointer video_codec;
    public Pointer audio_codec;
    public Pointer subtitle_codec;

    public AVFormatContext()
    {   super();
        //filename = new byte[1024];
    }
    public AVFormatContext(Pointer p)
	{	
    	//super(p);
        //filename = new byte[1024];
		useMemory(p);
		read();
	}

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "av_class", "iformat", "oformat", "priv_data", "pb", "ctx_flags", "nb_streams", "streams", "filename", "start_time", 
            "duration", "bit_rate", "packet_size", "max_delay", "flags", "probesize", "max_analyze_duration", "key", "keylen", "nb_programs", 
            "programs", "video_codec_id", "audio_codec_id", "subtitle_codec_id", "max_index_size", "max_picture_buffer", "nb_chapters", "chapters", "metadata", "start_time_realtime", 
            "fps_probe_size", "error_recognition", "interrupt_callback", "debug", "ts_id", "audio_preload", "max_chunk_duration", "max_chunk_size", "use_wallclock_as_timestamps", "avoid_negative_ts", 
            "avio_flags", "duration_estimation_method", "skip_initial_bytes", "correct_ts_overflow", "seek2any", "flush_packets", "probe_score", "packet_buffer", "packet_buffer_end", "data_offset", 
            "raw_packet_buffer", "raw_packet_buffer_end", "parse_queue", "parse_queue_end", "raw_packet_buffer_remaining_size", "offset", "offset_timebase", "io_repositioned", "video_codec", "audio_codec", 
            "subtitle_codec"
        });
    }
}
