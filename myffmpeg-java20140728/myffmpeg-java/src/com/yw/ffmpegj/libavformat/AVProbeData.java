// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVProbeData.java

package com.yw.ffmpegj.libavformat;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class AVProbeData extends Structure
{
    public static class ByReference extends AVProbeData
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        	super();
        }
    }

    public static class ByValue extends AVProbeData
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        	super();
        }
    }


    public Pointer filename;
    public Pointer buf;
    public int buf_size;

    public AVProbeData()
    {
    	super();
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "filename", "buf", "buf_size"
        });
    }

    public AVProbeData(Pointer pointer, Pointer pointer1, int i)
    {
        filename = pointer;
        buf = pointer1;
        buf_size = i;
    }
}
