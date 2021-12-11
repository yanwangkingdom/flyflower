// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVFilterGraph.java

package com.yw.ffmpegj.libfilter;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

import java.util.Arrays;
import java.util.List;

// Referenced classes of package avfilter:
//            AVFilterContext, AVFilterLink, AvfilterLibrary

public class AVFilterGraph extends Structure
{
    public static class ByReference extends AVFilterGraph
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

    public static class ByValue extends AVFilterGraph
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
    
    public interface avfilter_execute_func extends Callback {
		int apply(AVFilterContext ctx, AVFilterLibrary.avfilter_action_func func, Pointer arg, IntByReference ret, int nb_jobs);
	};


    public Pointer av_class;
    public int filter_count_unused;
    public PointerByReference filters;
    
    public Pointer scale_sws_opts;
    public Pointer resample_lavr_opts;
    public int nb_filters;
    public int thread_type;
    public int nb_threads;
    public Pointer internal;
    public Pointer opaque;
    public Pointer execute;//avfilter_execute_func execute;
    public Pointer aresample_swr_opts;
    public PointerByReference sink_links;
    public int sink_links_count;
    public int disable_auto_convert;// unsigned disable_auto_convert;

    public AVFilterGraph()
    {
    	super();
    }
    public AVFilterGraph(Pointer p)
    {
    	useMemory(p);
    	read();
    	
    }

  /*  protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "av_class", "filters", "nb_filters", "scale_sws_opts", "resample_lavr_opts", "thread_type", "nb_threads", "internal", "opaque", "execute", 
            "aresample_swr_opts", "sink_links", "sink_links_count", "disable_auto_convert"
        });
    }*/
    
    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "av_class","filter_count_unused", "filters",  "scale_sws_opts", "resample_lavr_opts","nb_filters", "thread_type", "nb_threads", "internal", "opaque", "execute", 
            "aresample_swr_opts", "sink_links", "sink_links_count", "disable_auto_convert"
        });
    }
}
