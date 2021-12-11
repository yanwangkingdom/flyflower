// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVPacketList.java

package com.yw.ffmpegj.libavformat;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

import com.yw.ffmpegj.libavcodec.*;

// Referenced classes of package avformat:
//            AVFormatLibrary

public class AVPacketList extends Structure
{
    public static class ByReference extends AVPacketList
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        }
    }

    public static class ByValue extends AVPacketList
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        }
    }


    public AVPacket pkt;
    public ByReference next;

    public AVPacketList()
    {
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "pkt", "next"
        });
    }

    public AVPacketList(AVPacket avpacket, ByReference byreference)
    {
        pkt = avpacket;
        next = byreference;
    }
}
