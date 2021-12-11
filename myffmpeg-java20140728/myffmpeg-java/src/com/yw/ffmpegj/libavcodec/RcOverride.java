// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   RcOverride.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class RcOverride extends Structure
{
    public static class ByReference extends RcOverride
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends RcOverride
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public int start_frame;
    public int end_frame;
    public int qscale;
    public float quality_factor;

    public RcOverride()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "start_frame", "end_frame", "qscale", "quality_factor"
        });
    }

    public RcOverride(int i, int j, int k, float f)
    {
        start_frame = i;
        end_frame = j;
        qscale = k;
        quality_factor = f;
    }
}
