// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVOutputFormat.java

package com.yw.ffmpegj.libavformat;

import com.sun.jna.*;
import com.sun.jna.ptr.LongByReference;
import com.sun.jna.ptr.PointerByReference;

import java.util.Arrays;
import java.util.List;

import com.yw.ffmpegj.libavcodec.*;

// Referenced classes of package avformat:
//            AVFormatLibrary, AVFormatContext

public class AVOutputFormat extends Structure
{
    public static class ByReference extends AVOutputFormat
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVOutputFormat
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }

    public static interface get_output_timestamp_callback
        extends Callback
    {

        public abstract void apply(AVFormatContext avformatcontext, int i, LongByReference longbyreference, LongByReference longbyreference1);
    }

    public static interface interleave_packet_callback
        extends Callback
    {

        public abstract int apply(AVFormatContext avformatcontext, AVPacket avpacket, AVPacket avpacket1, int i);
    }

    public static interface query_codec_callback
        extends Callback
    {

        public abstract int apply(int i, int j);
    }

    public static interface write_header_callback
        extends Callback
    {

        public abstract int apply(AVFormatContext avformatcontext);
    }

    public static interface write_packet_callback
        extends Callback
    {

        public abstract int apply(AVFormatContext avformatcontext, AVPacket avpacket);
    }

    public static interface write_trailer_callback
        extends Callback
    {

        public abstract int apply(AVFormatContext avformatcontext);
    }


    public Pointer name;
    public Pointer long_name;
    public Pointer mime_type;
    public Pointer extensions;
    public int audio_codec;
    public int video_codec;
    public int subtitle_codec;
    public int flags;
    public PointerByReference codec_tag;
    public AVFormatLibrary.AVClass priv_class;
    public ByReference next;
    public int priv_data_size;
    public write_header_callback write_header;
    public write_packet_callback write_packet;
    public write_trailer_callback write_trailer;
    public interleave_packet_callback interleave_packet;
    public query_codec_callback query_codec;
    public get_output_timestamp_callback get_output_timestamp;

    public AVOutputFormat()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "name", "long_name", "mime_type", "extensions", "audio_codec", "video_codec", "subtitle_codec", "flags", "codec_tag", "priv_class", 
            "next", "priv_data_size", "write_header", "write_packet", "write_trailer", "interleave_packet", "query_codec", "get_output_timestamp"
        });
    }
}
