// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVStream.java

package com.yw.ffmpegj.libavformat;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

import com.yw.ffmpegj.libavcodec.*;
import com.yw.ffmpegj.libavutil.*;

// Referenced classes of package avformat:
//            AVFormatLibrary, AVIndexEntry, AVPacketList, AVFrac, 
//            AVProbeData

public class AVStream extends Structure
{
    public static class ByReference extends AVStream
        implements com.sun.jna.Structure.ByReference
    {
    	public ByReference()
        {
        	
        }
       
    	public ByReference(Pointer p)
        {
        	super(p);
        }
    }

    public static class ByValue extends AVStream
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }

    public static class info_struct extends Structure
    {
        public static class ByValue extends info_struct
            implements com.sun.jna.Structure.ByValue
        {

            public ByValue()
            {
            }
        }


        public long last_dts;
        public long duration_gcd;
        public int duration_count;
        public Pointer duration_error;
        public long codec_info_duration;
        public long codec_info_duration_fields;
        public int found_decoder;
        public long last_duration;
        public long fps_first_dts;
        public int fps_first_dts_idx;
        public long fps_last_dts;
        public int fps_last_dts_idx;

        protected List getFieldOrder()
        {
            return Arrays.asList(new String[] {
                "last_dts", "duration_gcd", "duration_count", "duration_error", "codec_info_duration", "codec_info_duration_fields", "found_decoder", "last_duration", "fps_first_dts", "fps_first_dts_idx", 
                "fps_last_dts", "fps_last_dts_idx"
            });
        }

        public info_struct()
        {
        }
    }


   /* public int index;
    public int id;
    public AVCodecContext codec;
    public Pointer priv_data;
    public AVFrac pts;
    public AVRational time_base;
    public long start_time;
    public long duration;
    public long nb_frames;
    public int disposition;
    public int discard;
    public AVRational sample_aspect_ratio;
    public AVFormatLibrary.AVDictionary metadata;
    public AVRational avg_frame_rate;
    public AVPacket attached_pic;
    public info_struct.ByReference info;
    public int pts_wrap_bits;
    public long first_dts;
    public long cur_dts;
    public long last_IP_pts;
    public int last_IP_duration;
    public int probe_packets;
    public int codec_info_nb_frames;
    public int need_parsing;
    public AVCodecParserContext parser;
    public AVPacketList.ByReference last_in_packet_buffer;
    public AVProbeData probe_data;
    public long pts_buffer[]= new long[17];
    public AVIndexEntry.ByReference index_entries;
    public int nb_index_entries;
    public int index_entries_allocated_size;
    public AVRational r_frame_rate;
    public int stream_identifier;
    public long interleaver_chunk_size;
    public long interleaver_chunk_duration;
    public int request_probe;
    public int skip_to_keyframe;
    public int skip_samples;
    public int nb_decoded_frames;
    public long mux_ts_offset;
    public long pts_wrap_reference;
    public int pts_wrap_behavior;
*/
    public int index;
    public int id;
    public Pointer codec;
    public Pointer priv_data;
    public AVFrac pts;
   // public Pointer pts;
    //public Pointer time_base;
    public AVRational time_base;
    public long start_time;
    public long duration;
    public long nb_frames;
    public int disposition;
    public int discard;
    public AVRational sample_aspect_ratio;
    public Pointer metadata;
    public AVRational avg_frame_rate;
    public AVPacket attached_pic;
    public Pointer info;
    public int pts_wrap_bits;
    public long do_not_use;
    public long first_dts;
    public long cur_dts;
    public long last_IP_pts;
    public int last_IP_duration;
    public int probe_packets;
    public int codec_info_nb_frames;
    public int need_parsing;
    public Pointer parser;
    public Pointer last_in_packet_buffer;
    public AVProbeData probe_data;
    public long pts_buffer[]= new long[17];
    public Pointer index_entries;
    public int nb_index_entries;
    public int index_entries_allocated_size;
    public AVRational r_frame_rate;
    public int stream_identifier;
    public long interleaver_chunk_size;
    public long interleaver_chunk_duration;
    public int request_probe;
    public int skip_to_keyframe;
    public int skip_samples;
    public int nb_decoded_frames;
    public long mux_ts_offset;
    public long pts_wrap_reference;
    public int pts_wrap_behavior;

    public AVStream()
    {   //super();
        //pts_buffer = new long[17];
    }
    public AVStream(Pointer p)
    {   
    	useMemory(p);
    	read();
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "index", "id", "codec", "priv_data", "pts", "time_base", "start_time", "duration", "nb_frames", "disposition", 
            "discard", "sample_aspect_ratio", "metadata", "avg_frame_rate", "attached_pic", "info", "pts_wrap_bits","do_not_use", "first_dts", "cur_dts", "last_IP_pts", 
            "last_IP_duration", "probe_packets", "codec_info_nb_frames", "need_parsing", "parser", "last_in_packet_buffer", "probe_data", "pts_buffer", "index_entries", "nb_index_entries", 
            "index_entries_allocated_size", "r_frame_rate", "stream_identifier", "interleaver_chunk_size", "interleaver_chunk_duration", "request_probe", "skip_to_keyframe", "skip_samples", "nb_decoded_frames", "mux_ts_offset", 
            "pts_wrap_reference", "pts_wrap_behavior"
        });
    }
}
