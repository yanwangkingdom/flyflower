// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVSubtitleRect.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avcodec:
//            AVPicture

public class AVSubtitleRect extends Structure
{
    public static class ByReference extends AVSubtitleRect
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVSubtitleRect
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public int x;
    public int y;
    public int w;
    public int h;
    public int nb_colors;
    public AVPicture pict;
    public int type;
    public Pointer text;
    public Pointer ass;
    public int flags;

    public AVSubtitleRect()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "x", "y", "w", "h", "nb_colors", "pict", "type", "text", "ass", "flags"
        });
    }
}
