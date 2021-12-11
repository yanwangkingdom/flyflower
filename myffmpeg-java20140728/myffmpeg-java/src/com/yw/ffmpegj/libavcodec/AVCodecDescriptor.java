// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVCodecDescriptor.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class AVCodecDescriptor extends Structure
{
    public static class ByReference extends AVCodecDescriptor
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVCodecDescriptor
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public int id;
    public int type;
    public Pointer name;
    public Pointer long_name;
    public int props;

    public AVCodecDescriptor()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "id", "type", "name", "long_name", "props"
        });
    }

    public AVCodecDescriptor(int i, int j, Pointer pointer, Pointer pointer1, int k)
    {
        id = i;
        type = j;
        name = pointer;
        long_name = pointer1;
        props = k;
    }
}
