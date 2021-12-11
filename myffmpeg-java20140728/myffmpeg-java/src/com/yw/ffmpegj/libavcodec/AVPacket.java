// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVPacket.java

package com.yw.ffmpegj.libavcodec;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.yw.ffmpegj.libavutil.*;

import java.util.Arrays;
import java.util.List;

// Referenced classes of package avcodec:
//            AVCodecLibrary

public class AVPacket extends Structure
{
    public static class ByReference extends AVPacket
        implements com.sun.jna.Structure.ByReference
    {

        public ByReference()
        {
        	super();
        }
    }

    public static class ByValue extends AVPacket
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        	super();
        }
    }

    public static class side_data_struct extends Structure
    {
        public static class ByValue extends side_data_struct
            implements com.sun.jna.Structure.ByValue
        {

            public ByValue()
            {
            	super();
            }
        }
        
       

        public Pointer data;
        public int size;
        public int type;

        protected List getFieldOrder()
        {
            return Arrays.asList(new String[] {
                "data", "size", "type"
            });
        }

        public side_data_struct()
        {
        	super();
        }

       /* public side_data_struct(Pointer pointer, int i, int j)
        {
            data = pointer;
            size = i;
            type = j;
        }*/
    }
    


    public Pointer buf;//AVBufferRef buf;//AVCodecLibrary.AVBufferRef buf;
    public long pts;
    public long dts;
    public Pointer data;
    public int size;
    public int stream_index;
    public int flags;
    public Pointer side_data;//side_data_struct.ByReference side_data;
    public int side_data_elems;
    public int duration;
    public Destruct destruct;
    public Pointer priv;
    public long pos;
    public long convergence_duration;
    
    public interface Destruct extends Callback {
    	void apply(AVPacket AVPacketPtr1);
    };
    public AVPacket()
    {
    	super();
    }
    public AVPacket(Pointer p)
    {
    	useMemory(p);
    	read();
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "buf", "pts", "dts", "data", "size", "stream_index", "flags", "side_data", "side_data_elems", "duration",
            "destruct", "priv","pos", "convergence_duration"
        });
    }
	
}
