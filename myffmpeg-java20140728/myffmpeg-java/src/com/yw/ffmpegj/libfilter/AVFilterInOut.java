// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVFilterInOut.java

package com.yw.ffmpegj.libfilter;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avfilter:
//            AVFilterContext

public class AVFilterInOut extends Structure
{
    public static class ByReference extends AVFilterInOut
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        	super();
        }
        
        public ByReference(Pointer p)
        {
        	super(p);
        }
    }

    public static class ByValue extends AVFilterInOut
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
        public ByValue(Pointer p)
        {
        	super(p);
        }
    }


    public Pointer name;//String name;
    public Pointer filter_ctx;
    public int pad_idx;
    public Pointer next;

    public AVFilterInOut()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "name", "filter_ctx", "pad_idx", "next"
        });
    }

    public AVFilterInOut(Pointer pointer)
    {
    	useMemory(pointer);
    	read();
    }
}
