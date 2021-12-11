// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVFilter.java

package com.yw.ffmpegj.libfilter;

import com.sun.jna.*;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package avfilter:
//            AvfilterLibrary, AVFilterContext

public class AVFilter extends Structure
{
    public static class ByReference extends AVFilter
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

    public static class ByValue extends AVFilter
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

    public static interface init_callback
        extends Callback
    {

        public abstract int apply(AVFilterContext avfiltercontext);
    }

    public static interface init_dict_callback
        extends Callback
    {

        public abstract int apply(AVFilterContext avfiltercontext, PointerByReference pointerbyreference);
    }

    public static interface init_opaque_callback
        extends Callback
    {

        public abstract int apply(AVFilterContext avfiltercontext, Pointer pointer);
    }

    public static interface process_command_callback
        extends Callback
    {

        public abstract int apply(AVFilterContext avfiltercontext, Pointer pointer, Pointer pointer1, Pointer pointer2, int i, int j);
    }

    public static interface query_formats_callback
        extends Callback
    {

        public abstract int apply(AVFilterContext avfiltercontext);
    }

    public static interface uninit_callback
        extends Callback
    {

        public abstract void apply(AVFilterContext avfiltercontext);
    }


    public String name;
    public Pointer description;
    public Pointer inputs;
    public Pointer outputs;
    public Pointer priv_class;
    public int flags;
    public init_callback init;
    public init_dict_callback init_dict;
    public uninit_callback uninit;
    public query_formats_callback query_formats;
    public int priv_size;
    public Pointer next;
    public process_command_callback process_command;
    public init_opaque_callback init_opaque;

    public AVFilter()
    {
    	super();
    }
    public AVFilter(Pointer p)
    {
    	useMemory(p);
    	read();
    }

    protected List getFieldOrder()
    {
        return Arrays.asList(new String[] {
            "name", "description", "inputs", "outputs", "priv_class", "flags", "init", "init_dict", "uninit", "query_formats", 
            "priv_size", "next", "process_command", "init_opaque"
        });
    }
}
