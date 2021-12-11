// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVCodec.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.*;
import com.sun.jna.ptr.*;

import java.util.Arrays;
import java.util.List;

import com.yw.ffmpegj.libavutil.*;

// Referenced classes of package avcodec:
//            AVBitStreamFilter, AVCodecLibrary, AVProfile, AVCodecContext, 
//            AVPacket, AVSubtitle

public class AVCodec extends Structure
{
    public static class ByReference extends AVCodec
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

    public static class ByValue extends AVCodec
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        	super();
        }
    }

    public static interface close_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext);
    }

    public static interface decode_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext, Pointer pointer, IntByReference intbyreference, AVPacket avpacket);
    }

    public static interface encode2_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext, AVPacket avpacket, AVFrame avframe, IntByReference intbyreference);
    }

    public static interface encode_sub_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext, Pointer pointer, int i, AVSubtitle avsubtitle);
    }

    public static interface flush_callback
        extends Callback
    {

        public abstract void apply(AVCodecContext avcodeccontext);
    }

    public static interface init_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext);
    }

    public static interface init_static_data_callback
        extends Callback
    {

        public abstract void apply(AVCodec avcodec);
    }

    public static interface init_thread_copy_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext);
    }

    public static interface update_thread_context_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext, AVCodecContext avcodeccontext1);
    }


    /*public Pointer name;
    public Pointer long_name;
    public int type;
    public int id;
    public int capabilities;
    public AVRational supported_framerates;
    public IntByReference pix_fmts;
    public IntByReference supported_samplerates;
    public IntByReference sample_fmts;
    public LongByReference channel_layouts;
    public AVCodecLibrary.AVClass priv_class;
    public AVProfile.ByReference profiles;
    public int priv_data_size;
    public ByReference next;
    public init_thread_copy_callback init_thread_copy;
    public update_thread_context_callback update_thread_context;
    public PointerByReference defaults;
    public init_static_data_callback init_static_data;
    public init_callback init;
    public encode_sub_callback encode_sub;
    public encode2_callback encode2;
    public decode_callback decode;
    public AVBitStreamFilter.close_callback close;
    public flush_callback flush;*/
    
    public Pointer name;
    public Pointer long_name;
    public int type;
    public int id;
    public int capabilities;
    public Pointer supported_framerates;
    public IntByReference pix_fmts;
    public IntByReference supported_samplerates;
    public IntByReference sample_fmts;
    public LongByReference channel_layouts;
    
    public byte max_lowres;
    
    public Pointer priv_class;
    public Pointer profiles;
    public int priv_data_size;
    public Pointer next;//AVCodec * next
    public init_thread_copy_callback init_thread_copy;
    public update_thread_context_callback update_thread_context;
    public PointerByReference defaults;
    public init_static_data_callback init_static_data;
    public init_callback init;
    public encode_sub_callback encode_sub;
    public encode2_callback encode2;
    public decode_callback decode;
    public AVBitStreamFilter.close_callback close;
    public flush_callback flush;

    public AVCodec()
    {
    }
    public AVCodec(Pointer p)
    {
    	useMemory(p);
    	read();
    }


    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "name", "long_name", "type", "id", "capabilities", "supported_framerates", "pix_fmts", "supported_samplerates", "sample_fmts", "channel_layouts", 
            "max_lowres", "priv_class", "profiles", "priv_data_size", "next", "init_thread_copy", "update_thread_context", "defaults", "init_static_data", "init", "encode_sub", 
            "encode2", "decode", "close", "flush"
        });
    }
}
