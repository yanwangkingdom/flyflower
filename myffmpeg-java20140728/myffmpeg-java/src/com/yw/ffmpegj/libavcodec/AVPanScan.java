// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVPanScan.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class AVPanScan extends Structure
{
    public static class ByReference extends AVPanScan
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVPanScan
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public int id;
    public int width;
    public int height;
    public short position[];

    public AVPanScan()
    {
        position = new short[6];
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "id", "width", "height", "position"
        });
    }

    public AVPanScan(int i, int j, int k, short aword0[])
    {
        position = new short[6];
        id = i;
        width = j;
        height = k;
        if(aword0.length != position.length)
        {
            throw new IllegalArgumentException("Wrong array size !");
        } else
        {
            position = aword0;
            return;
        }
    }
}
