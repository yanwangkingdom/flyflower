// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVPicture.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class AVPicture extends Structure
{
    public static class ByReference extends AVPicture
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVPicture
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public Pointer data[];
    public int linesize[];

    public AVPicture()
    {
        data = new Pointer[8];
        linesize = new int[8];
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "data", "linesize"
        });
    }

    public AVPicture(Pointer apointer[], int ai[])
    {
        data = new Pointer[8];
        linesize = new int[8];
        if(apointer.length != data.length)
            throw new IllegalArgumentException("Wrong array size !");
        data = apointer;
        if(ai.length != linesize.length)
        {
            throw new IllegalArgumentException("Wrong array size !");
        } else
        {
            linesize = ai;
            return;
        }
    }
}
