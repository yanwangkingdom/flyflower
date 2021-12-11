// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVCodecParser.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.*;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avcodec:
//            AVCodecParserContext, AVCodecContext

public class AVCodecParser extends Structure
{
    public static class ByReference extends AVCodecParser
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVCodecParser
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }

    public static interface parser_close_callback
        extends Callback
    {

        public abstract void apply(AVCodecParserContext avcodecparsercontext);
    }

    public static interface parser_init_callback
        extends Callback
    {

        public abstract int apply(AVCodecParserContext avcodecparsercontext);
    }

    public static interface parser_parse_callback
        extends Callback
    {

        public abstract int apply(AVCodecParserContext avcodecparsercontext, AVCodecContext avcodeccontext, PointerByReference pointerbyreference, IntByReference intbyreference, Pointer pointer, int i);
    }

    public static interface split_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext, Pointer pointer, int i);
    }


    public int codec_ids[];
    public int priv_data_size;
    public parser_init_callback parser_init;
    public parser_parse_callback parser_parse;
    public parser_close_callback parser_close;
    public split_callback split;
    public ByReference next;

    public AVCodecParser()
    {
        codec_ids = new int[5];
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "codec_ids", "priv_data_size", "parser_init", "parser_parse", "parser_close", "split", "next"
        });
    }

    public AVCodecParser(int ai[], int i, parser_init_callback parser_init_callback1, parser_parse_callback parser_parse_callback1, parser_close_callback parser_close_callback1, split_callback split_callback1, ByReference byreference)
    {
        codec_ids = new int[5];
        if(ai.length != codec_ids.length)
        {
            throw new IllegalArgumentException("Wrong array size !");
        } else
        {
            codec_ids = ai;
            priv_data_size = i;
            parser_init = parser_init_callback1;
            parser_parse = parser_parse_callback1;
            parser_close = parser_close_callback1;
            split = split_callback1;
            next = byreference;
            return;
        }
    }
}
