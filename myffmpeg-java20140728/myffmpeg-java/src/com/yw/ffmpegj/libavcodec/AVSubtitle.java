// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVSubtitle.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avcodec:
//            AVSubtitleRect

public class AVSubtitle extends Structure
{
    public static class ByReference extends AVSubtitle
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVSubtitle
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public short format;
    public int start_display_time;
    public int end_display_time;
    public int num_rects;
    public AVSubtitleRect.ByReference rects[];
    public long pts;

    public AVSubtitle()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "format", "start_display_time", "end_display_time", "num_rects", "rects", "pts"
        });
    }

    public AVSubtitle(short word0, int i, int j, int k, AVSubtitleRect.ByReference abyreference[], long l)
    {
        format = word0;
        start_display_time = i;
        end_display_time = j;
        num_rects = k;
        if(abyreference.length != rects.length)
        {
            throw new IllegalArgumentException("Wrong array size !");
        } else
        {
            rects = abyreference;
            pts = l;
            return;
        }
    }
}
