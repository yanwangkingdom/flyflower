// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVCodecParserContext.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avcodec:
//            AVCodecParser

public class AVCodecParserContext extends Structure
{
    public static class ByReference extends AVCodecParserContext
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVCodecParserContext
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public Pointer priv_data;
    public AVCodecParser.ByReference parser;
    public long frame_offset;
    public long cur_offset;
    public long next_frame_offset;
    public int pict_type;
    public int repeat_pict;
    public long pts;
    public long dts;
    public long last_pts;
    public long last_dts;
    public int fetch_timestamp;
    public int cur_frame_start_index;
    public long cur_frame_offset[];
    public long cur_frame_pts[];
    public long cur_frame_dts[];
    public int flags;
    public long offset;
    public long cur_frame_end[];
    public int key_frame;
    public long convergence_duration;
    public int dts_sync_point;
    public int dts_ref_dts_delta;
    public int pts_dts_delta;
    public long cur_frame_pos[];
    public long pos;
    public long last_pos;
    public int duration;
    public int field_order;
    public int picture_structure;
    public int output_picture_number;

    public AVCodecParserContext()
    {
        cur_frame_offset = new long[4];
        cur_frame_pts = new long[4];
        cur_frame_dts = new long[4];
        cur_frame_end = new long[4];
        cur_frame_pos = new long[4];
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "priv_data", "parser", "frame_offset", "cur_offset", "next_frame_offset", "pict_type", "repeat_pict", "pts", "dts", "last_pts", 
            "last_dts", "fetch_timestamp", "cur_frame_start_index", "cur_frame_offset", "cur_frame_pts", "cur_frame_dts", "flags", "offset", "cur_frame_end", "key_frame", 
            "convergence_duration", "dts_sync_point", "dts_ref_dts_delta", "pts_dts_delta", "cur_frame_pos", "pos", "last_pos", "duration", "field_order", "picture_structure", 
            "output_picture_number"
        });
    }
}
