// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVFilterLink.java

package com.yw.ffmpegj.libfilter;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import com.yw.ffmpegj.libavutil.AVRational;

import java.util.Arrays;
import java.util.List;

// Referenced classes of package avfilter:
//            AVFilterContext, AVFilterGraph, AvfilterLibrary

public class AVFilterLink extends Structure
{
    public static class ByReference extends AVFilterLink
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVFilterLink
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }

    public static interface init_state_enum
    {

        public static final int AVLINK_UNINIT = 0;
        public static final int AVLINK_STARTINIT = 1;
        public static final int AVLINK_INIT = 2;
    }


    public AVFilterContext.ByReference src;
    public PointerByReference srcpad;
    public AVFilterContext.ByReference dst;
    public PointerByReference dstpad;
    public int type;
    public int w;
    public int h;
    public AVRational sample_aspect_ratio;
    public long channel_layout;
    public int sample_rate;
    public int format;
    public AVRational time_base;
    public PointerByReference in_formats;
    public PointerByReference out_formats;
    public PointerByReference in_samplerates;
    public PointerByReference out_samplerates;
    public AVFilterLibrary.AVFilterChannelLayouts in_channel_layouts;
    public AVFilterLibrary.AVFilterChannelLayouts out_channel_layouts;
    public int request_samples;
    public int init_state;
    public AVFilterLibrary.AVFilterPool pool;
    public AVFilterGraph.ByReference graph;
    public long current_pts;
    public int age_index;
    public AVRational frame_rate;
    public Pointer partial_buf;
    public int partial_buf_size;
    public int min_samples;
    public int max_samples;
    public AVFilterLibrary.AVFilterBufferRef cur_buf_copy;
    public int closed;
    public int channels;
    public int frame_requested;
    public int flags;
    public long frame_count;

    public AVFilterLink()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "src", "srcpad", "dst", "dstpad", "type", "w", "h", "sample_aspect_ratio", "channel_layout", "sample_rate", 
            "format", "time_base", "in_formats", "out_formats", "in_samplerates", "out_samplerates", "in_channel_layouts", "out_channel_layouts", "request_samples", "init_state", 
            "pool", "graph", "current_pts", "age_index", "frame_rate", "partial_buf", "partial_buf_size", "min_samples", "max_samples", "cur_buf_copy", 
            "closed", "channels", "frame_requested", "flags", "frame_count"
        });
    }
}
