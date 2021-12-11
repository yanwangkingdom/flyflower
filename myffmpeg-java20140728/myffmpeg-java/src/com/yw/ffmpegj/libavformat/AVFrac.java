// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVFrac.java

package com.yw.ffmpegj.libavformat;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class AVFrac extends Structure
{
    public static class ByReference extends AVFrac
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        	super();
        }
    }

    public static class ByValue extends AVFrac
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        	super();
        }
    }


    public long val;
    public long num;
    public long den;

    public AVFrac()
    {
    	super();
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "val", "num", "den"
        });
    }

    public AVFrac(long l, long l1, long l2)
    {
        val = l;
        num = l1;
        den = l2;
    }
}
