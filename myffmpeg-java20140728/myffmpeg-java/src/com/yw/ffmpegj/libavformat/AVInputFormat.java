// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVInputFormat.java

package com.yw.ffmpegj.libavformat;

import com.sun.jna.*;
import com.sun.jna.ptr.LongByReference;

import java.util.Arrays;
import java.util.List;

import com.yw.ffmpegj.libavcodec.*;

// Referenced classes of package avformat:
//            AVFormatLibrary, AVFormatContext, AVProbeData

public class AVInputFormat extends Structure
{
    public static class ByReference extends AVInputFormat
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        	super();
        }
        
        public ByReference(Pointer p)
        {
        	super(p);
        }
    }

    public static class ByValue extends AVInputFormat
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        	super();
        }
        
        public ByValue(Pointer p)
        {
        	super(p);
        }
    }

    public static interface read_close_callback
        extends Callback
    {

        public abstract int apply(AVFormatContext avformatcontext);
    }

    public static interface read_header_callback
        extends Callback
    {

        public abstract int apply(AVFormatContext avformatcontext);
    }

    public static interface read_packet_callback
        extends Callback
    {

        public abstract int apply(AVFormatContext avformatcontext, AVPacket avpacket);
    }

    public static interface read_pause_callback
        extends Callback
    {

        public abstract int apply(AVFormatContext avformatcontext);
    }

    public static interface read_play_callback
        extends Callback
    {

        public abstract int apply(AVFormatContext avformatcontext);
    }

    public static interface read_probe_callback
        extends Callback
    {

        public abstract int apply(AVProbeData avprobedata);
    }

    public static interface read_seek2_callback
        extends Callback
    {

        public abstract int apply(AVFormatContext avformatcontext, int i, long l, long l1, long l2, int j);
    }

    public static interface read_seek_callback
        extends Callback
    {

        public abstract int apply(AVFormatContext avformatcontext, int i, long l, int j);
    }

    public static interface read_timestamp_callback
        extends Callback
    {

        public abstract long apply(AVFormatContext avformatcontext, int i, LongByReference longbyreference, long l);
    }


    public String name;
    public String long_name;
    public int flags;
    public Pointer extensions;
    public Pointer codec_tag;//AVFormatLibrary.AVCodecTag codec_tag[];
    public Pointer priv_class;
    public Pointer next;
    public int raw_codec_id;
    public int priv_data_size;
    public read_probe_callback read_probe;
    public read_header_callback read_header;
    public read_packet_callback read_packet;
    public read_close_callback read_close;
    public read_seek_callback read_seek;
    public read_timestamp_callback read_timestamp;
    public read_play_callback read_play;
    public read_pause_callback read_pause;
    public read_seek2_callback read_seek2;

    public AVInputFormat()
    {
    	super();
    }
    
    public AVInputFormat(Pointer p)
    {
    	useMemory(p);
		read();
    	
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "name", "long_name", "flags", "extensions", "codec_tag", "priv_class", "next", "raw_codec_id", "priv_data_size", "read_probe", 
            "read_header", "read_packet", "read_close", "read_seek", "read_timestamp", "read_play", "read_pause", "read_seek2"
        });
    }
}
