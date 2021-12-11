// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVHWAccel.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.*;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avcodec:
//            AVCodecContext

public class AVHWAccel extends Structure
{
    public static class ByReference extends AVHWAccel
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVHWAccel
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }

    public static interface decode_slice_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext, Pointer pointer, int i);
    }

    public static interface end_frame_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext);
    }

    public static interface start_frame_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext, Pointer pointer, int i);
    }


    public Pointer name;
    public int type;
    public int id;
    public int pix_fmt;
    public int capabilities;
    public ByReference next;
    public start_frame_callback start_frame;
    public decode_slice_callback decode_slice;
    public end_frame_callback end_frame;
    public int priv_data_size;

    public AVHWAccel()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "name", "type", "id", "pix_fmt", "capabilities", "next", "start_frame", "decode_slice", "end_frame", "priv_data_size"
        });
    }
}
