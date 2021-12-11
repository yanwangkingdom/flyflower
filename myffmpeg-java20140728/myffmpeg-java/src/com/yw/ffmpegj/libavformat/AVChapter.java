// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVChapter.java

package com.yw.ffmpegj.libavformat;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

import com.yw.ffmpegj.libavutil.*;

public class AVChapter extends Structure
{
    public static class ByReference extends AVChapter
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVChapter
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public int id;
    public AVRational time_base;
    public long start;
    public long end;
    public AVFormatLibrary.AVDictionary metadata;

    public AVChapter()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "id", "time_base", "start", "end", "metadata"
        });
    }

    public AVChapter(int i, AVRational avrational, long l, long l1, AVFormatLibrary.AVDictionary avdictionary)
    {
        id = i;
        time_base = avrational;
        start = l;
        end = l1;
        metadata = avdictionary;
    }
}
