// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVBitStreamFilterContext.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avcodec:
//            AVBitStreamFilter, AVCodecParserContext

public class AVBitStreamFilterContext extends Structure
{
    public static class ByReference extends AVBitStreamFilterContext
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVBitStreamFilterContext
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public Pointer priv_data;
    public AVBitStreamFilter.ByReference filter;
    public AVCodecParserContext.ByReference parser;
    public ByReference next;

    public AVBitStreamFilterContext()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "priv_data", "filter", "parser", "next"
        });
    }

    public AVBitStreamFilterContext(Pointer pointer, AVBitStreamFilter.ByReference byreference, AVCodecParserContext.ByReference byreference1, ByReference byreference2)
    {
        priv_data = pointer;
        filter = byreference;
        parser = byreference1;
        next = byreference2;
    }
}
