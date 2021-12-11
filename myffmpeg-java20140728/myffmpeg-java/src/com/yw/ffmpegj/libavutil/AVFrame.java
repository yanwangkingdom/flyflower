// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVFrame.java

package com.yw.ffmpegj.libavutil;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avutil:
//            AVFrameSideData, AVUtilLibrary

public class AVFrame extends Structure
{
    public static class ByReference extends AVFrame
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

    public static class ByValue extends AVFrame
        implements com.sun.jna.Structure.ByValue
    {

        public ByValue()
        {
        	super();
        }
        
        public ByValue(Pointer p)
        {
        	super(p);
        }
    }

/*
    public Pointer data[];// uint8_t *data[AV_NUM_DATA_POINTERS];8
    public int linesize[];
    public PointerByReference extended_data;
    public int width;
    public int height;
    public int nb_samples;
    public int format;
    public int key_frame;
    public int pict_type;
    public AVRational sample_aspect_ratio;
    public long pts;
    public long pkt_pts;
    public long pkt_dts;
    public int coded_picture_number;
    public int display_picture_number;
    public int quality;
    public Pointer opaque;
    public long error[];
    public int repeat_pict;
    public int interlaced_frame;
    public int top_field_first;
    public int palette_has_changed;
    *//**
     * 
     *//*
    public long reordered_opaque;
    public int sample_rate;
    public long channel_layout;
    public AVUtilLibrary.AVBufferRef buf[];
    public AVUtilLibrary.AVBufferRef extended_buf[];
    public int nb_extended_buf;
    public AVFrameSideData.ByReference side_data[];
    public int nb_side_data;
    public int flags;
    public long best_effort_timestamp;
    public long pkt_pos;
    public long pkt_duration;
    public Pointer metadata;
    public int decode_error_flags;
    public int channels;
    public int pkt_size;
    public int colorspace;
    public int color_range;
    public AVUtilLibrary.AVBufferRef qp_table_buf;
    
*/
    

    public Pointer [] data;// uint8_t *data[AV_NUM_DATA_POINTERS];8
    public int [] linesize;
    public PointerByReference extended_data;
    public int width;
    public int height;
    public int nb_samples;
    public int format;
    public int key_frame;
    public int pict_type;
    public Pointer[] base;
    public AVRational sample_aspect_ratio;
    public long pts;
    public long pkt_pts;
    public long pkt_dts;
    public int coded_picture_number;
    public int display_picture_number;
    public int quality;
    
    
    public int reference;
    public  Pointer qscale_table;
    public int qstride;
    public int qscale_type;
    public  Pointer mbskip_table;
    public Pointer[]  motion_val;//类型 int16_t (*motion_val[2])[2];
    public Pointer mb_type;
    public Pointer dct_coeff;
    public  Pointer[] ref_index;
    
    public Pointer opaque;
    public long [] error;
    
    public int type;
    
    public int repeat_pict;
    public int interlaced_frame;
    public int top_field_first;
    public int palette_has_changed;
   
    
    public int buffer_hints;
    public Pointer pan_scan;
    
    public long reordered_opaque;
    
    public Pointer hwaccel_picture_private;
    public  Pointer owner;
    public Pointer thread_opaque;
    public  byte  motion_subsample_log2;//这个不确定类型uint8_t
    
    public int sample_rate;
    public long channel_layout;
    public Pointer [] buf;//AVUtilLibrary.AVBufferRef buf[];
    public PointerByReference extended_buf;//AVUtilLibrary.AVBufferRef extended_buf[];
    public int nb_extended_buf;
    public PointerByReference side_data;//AVFrameSideData.ByReference side_data[];
    public int nb_side_data;
    public int flags;
    public long best_effort_timestamp;
    public long pkt_pos;
    public long pkt_duration;
    public Pointer metadata;
    public int decode_error_flags;
    public int channels;
    public int pkt_size;
    public int colorspace;
    public int color_range;
    public Pointer qp_table_buf;//AVUtilLibrary.AVBufferRef qp_table_buf;

    public AVFrame()
    {
    	
    	super();
    	data=new Pointer[8];
    	linesize=new int[8];
    	base=new Pointer[8];
    	motion_val=new Pointer[2];
    	ref_index=new Pointer[2];
    	error=new long[8];
    	buf=new Pointer[8];
    }
    
    public AVFrame(Pointer p)
    {
    	
    	
    	data=new Pointer[8];
    	linesize=new int[8];
    	base=new Pointer[8];
    	motion_val=new Pointer[2];
    	ref_index=new Pointer[2];
    	error=new long[8];
    	buf=new Pointer[8];
    	useMemory(p);
    	read();
      
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "data", "linesize", "extended_data", "width", "height", "nb_samples", "format", "key_frame", "pict_type","base", "sample_aspect_ratio", 
            "pts", "pkt_pts", "pkt_dts", "coded_picture_number", "display_picture_number", "quality","reference" ,"qscale_table","qstride","qscale_type","mbskip_table","motion_val",
            "mb_type","dct_coeff","ref_index","opaque", "error", "type","repeat_pict", "interlaced_frame", 
            "top_field_first", "palette_has_changed", "buffer_hints","pan_scan","reordered_opaque", "hwaccel_picture_private",
            "owner","thread_opaque","motion_subsample_log2","sample_rate", "channel_layout", "buf", "extended_buf", "nb_extended_buf", "side_data", "nb_side_data", 
            "flags", "best_effort_timestamp", "pkt_pos", "pkt_duration", "metadata", "decode_error_flags", "channels", "pkt_size", "colorspace", "color_range", 
            "qp_table_buf"
        });
    }
}
