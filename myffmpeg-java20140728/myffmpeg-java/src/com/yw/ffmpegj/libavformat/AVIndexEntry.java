// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVIndexEntry.java

package com.yw.ffmpegj.libavformat;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public abstract class AVIndexEntry extends Structure
{
    public static abstract class ByReference extends AVIndexEntry
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static abstract class ByValue extends AVIndexEntry
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public long pos;
    public long timestamp;
    public int min_distance;

    public AVIndexEntry()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "pos", "timestamp", "min_distance"
        });
    }

    public AVIndexEntry(long l, long l1, int i)
    {
        pos = l;
        timestamp = l1;
        min_distance = i;
    }
}
