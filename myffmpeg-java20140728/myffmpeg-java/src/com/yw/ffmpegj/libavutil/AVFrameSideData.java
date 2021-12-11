// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVFrameSideData.java

package com.yw.ffmpegj.libavutil;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avutil:
//            AVUtilLibrary

public class AVFrameSideData extends Structure
{
    public static class ByReference extends AVFrameSideData
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVFrameSideData
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public int type;
    public Pointer data;
    public int size;
    public AVUtilLibrary.AVDictionary metadata;

    public AVFrameSideData()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "type", "data", "size", "metadata"
        });
    }

    public AVFrameSideData(int i, Pointer pointer, int j, AVUtilLibrary.AVDictionary avdictionary)
    {
        type = i;
        data = pointer;
        size = j;
        metadata = avdictionary;
    }
}
