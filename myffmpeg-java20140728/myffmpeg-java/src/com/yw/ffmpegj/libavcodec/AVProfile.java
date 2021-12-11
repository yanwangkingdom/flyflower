// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVProfile.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class AVProfile extends Structure
{
    public static class ByReference extends AVProfile
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVProfile
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public int profile;
    public Pointer name;

    public AVProfile()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "profile", "name"
        });
    }

    public AVProfile(int i, Pointer pointer)
    {
        profile = i;
        name = pointer;
    }
}
