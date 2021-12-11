// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVFilterContext.java

package com.yw.ffmpegj.libfilter;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.DoubleByReference;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avfilter:
//            AVFilter, AVFilterGraph, AVFilterLink, AvfilterLibrary

public class AVFilterContext extends Structure
{
    public static class ByReference extends AVFilterContext
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

    public static class ByValue extends AVFilterContext
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


    public Pointer av_class;
    public Pointer filter;
    public String name  ;//char * name;
    public Pointer input_pads;
    public PointerByReference inputs;
    public int nb_inputs;
    public PointerByReference output_pads;
    public PointerByReference outputs;
    public int nb_outputs;
    public Pointer priv;
    public Pointer graph;
    public int thread_type;
    public Pointer internal;
    public Pointer command_queue;
    public Pointer enable_str;
    public Pointer enable;
    public DoubleByReference var_values;
    public int is_disabled;

    public AVFilterContext()
    {
    	super();
    }
    public AVFilterContext(Pointer p)
    {
    	useMemory(p);
    	read();
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "av_class", "filter", "name", "input_pads", "inputs", "nb_inputs", "output_pads", "outputs", "nb_outputs", "priv", 
            "graph", "thread_type", "internal", "command_queue", "enable_str", "enable", "var_values", "is_disabled"
        });
    }
}
