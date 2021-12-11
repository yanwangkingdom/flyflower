// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVBitStreamFilter.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.*;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avcodec:
//            AVBitStreamFilterContext, AVCodecContext

public class AVBitStreamFilter extends Structure
{
    public static class ByReference extends AVBitStreamFilter
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVBitStreamFilter
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }

    public static interface close_callback
        extends Callback
    {

        public abstract void apply(AVBitStreamFilterContext avbitstreamfiltercontext);
    }

    public static interface filter_callback
        extends Callback
    {

        public abstract int apply(AVBitStreamFilterContext avbitstreamfiltercontext, AVCodecContext avcodeccontext, Pointer pointer, PointerByReference pointerbyreference, IntByReference intbyreference, Pointer pointer1, int i, 
                int j);
    }


    public Pointer name;
    public int priv_data_size;
    public filter_callback filter;
    public close_callback close;
    public Pointer next;

    public AVBitStreamFilter()
    {
    	super();
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "name", "priv_data_size", "filter", "close", "next"
        });
    }

    public AVBitStreamFilter(Pointer pointer, int i, filter_callback filter_callback1, close_callback close_callback1, ByReference byreference)
    {
       /* name = pointer;
        priv_data_size = i;
        filter = filter_callback1;
        close = close_callback1;
        next = byreference;*/
    }
}
