// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVProgram.java

package com.yw.ffmpegj.libavformat;

import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avformat:
//            AVFormatLibrary

public class AVProgram extends Structure
{
    public static class ByReference extends AVProgram
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVProgram
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public int id;
    public int flags;
    public int discard;
    public IntByReference stream_index;
    public int nb_stream_indexes;
    public AVFormatLibrary.AVDictionary metadata;
    public int program_num;
    public int pmt_pid;
    public int pcr_pid;
    public long start_time;
    public long end_time;
    public long pts_wrap_reference;
    public int pts_wrap_behavior;

    public AVProgram()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "id", "flags", "discard", "stream_index", "nb_stream_indexes", "metadata", "program_num", "pmt_pid", "pcr_pid", "start_time", 
            "end_time", "pts_wrap_reference", "pts_wrap_behavior"
        });
    }
}
