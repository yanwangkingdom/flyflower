// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AvfilterLibrary.java

package com.yw.ffmpegj.libfilter;

import com.sun.jna.*;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.yw.ffmpegj.libavutil.AVClass;
import com.yw.ffmpegj.libavutil.AVFrame;
import com.yw.ffmpegj.libavutil.AVRational;
import com.yw.ffmpegj.libavutil.AVUtilLibrary;
import com.yw.ffmpegj.libavutil.AVUtilLibrary.AVDictionary;

import java.nio.ByteBuffer;


// Referenced classes of package avfilter:
//            AVFilterContext, AVFilterGraph, AVFilterInOut, AVFilterLink, 
//            AVFilter

public class CopyOfAVFilterLibrary
    implements Library
{
   
    /*public static class AVDictionary extends PointerType
    {

        public AVDictionary(Pointer pointer)
        {
            super(pointer);
        }

        public AVDictionary()
        {
        }
    }*/

    public static class AVFilterBufferRef extends PointerType
    {

        public AVFilterBufferRef(Pointer pointer)
        {
            super(pointer);
        }

        public AVFilterBufferRef()
        {
        }
    }

    public static class AVFilterChannelLayouts extends PointerType
    {

        public AVFilterChannelLayouts(Pointer pointer)
        {
            super(pointer);
        }

        public AVFilterChannelLayouts()
        {
        }
    }

    public static class AVFilterCommand extends PointerType
    {

        public AVFilterCommand(Pointer pointer)
        {
            super(pointer);
        }

        public AVFilterCommand()
        {
        }
    }

    public static class AVFilterFormats extends PointerType
    {

        public AVFilterFormats(Pointer pointer)
        {
            super(pointer);
        }

        public AVFilterFormats()
        {
        }
    }

    public static class AVFilterGraphInternal extends PointerType
    {

        public AVFilterGraphInternal(Pointer pointer)
        {
            super(pointer);
        }

        public AVFilterGraphInternal()
        {
        }
    }

    public static class AVFilterInternal extends PointerType
    {

        public AVFilterInternal(Pointer pointer)
        {
            super(pointer);
        }

        public AVFilterInternal()
        {
        }
    }

    public static class AVFilterPad extends PointerType
    {

        public AVFilterPad(Pointer pointer)
        {
            super(pointer);
        }

        public AVFilterPad()
        {
        }
    }

    public static class AVFilterPool extends PointerType
    {

        public AVFilterPool(Pointer pointer)
        {
            super(pointer);
        }

        public AVFilterPool()
        {
        }
    }

    
   
    public static interface avfilter_action_func
        extends Callback
    {

        public abstract int apply(AVFilterContext avfiltercontext, Pointer pointer, int i, int j);
    }

    public static interface avfilter_execute_func
        extends Callback
    {

        public abstract int apply(AVFilterContext avfiltercontext, avfilter_action_func avfilter_action_func1, Pointer pointer, IntByReference intbyreference, int i);
    }


    public static final String JNA_LIBRARY_NAME = "avfilter-4";
    public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance("avfilter-4");
    static {
		Native.register(CopyOfAVFilterLibrary.JNA_LIBRARY_NAME);
	}
    public static final int AVFILTER_AUTO_CONVERT_ALL = 0;
    public static final int AVFILTER_AUTO_CONVERT_NONE = -1;
    public static final int AVFILTER_FLAG_SUPPORT_TIMELINE = 0x30000;
    public static final int AVFILTER_FLAG_DYNAMIC_INPUTS = 1;
    public static final int AVFILTER_FLAG_SUPPORT_TIMELINE_GENERIC = 0x10000;
    public static final int AVFILTER_CMD_FLAG_FAST = 2;
    public static final int AVFILTER_FLAG_DYNAMIC_OUTPUTS = 2;
    public static final int AVFILTER_FLAG_SLICE_THREADS = 4;
    public static final int AVFILTER_THREAD_SLICE = 1;
    public static final int AVFILTER_FLAG_SUPPORT_TIMELINE_INTERNAL = 0x20000;
    public static final int AVFILTER_CMD_FLAG_ONE = 1;

    public CopyOfAVFilterLibrary()
    {
    }

    public static native int avfilter_version();

    public static native Pointer avfilter_configuration();

    public static native Pointer avfilter_license();

    public static native int avfilter_ref_get_channels(AVFilterBufferRef avfilterbufferref);

    /**
     * @deprecated Method avfilter_pad_count is deprecated
     */

    public static native int avfilter_pad_count(Pointer pointer);

    public static native int avfilter_pad_count(PointerByReference pointerbyreference);

    /**
     * @deprecated Method avfilter_pad_get_name is deprecated
     */

    public static native Pointer avfilter_pad_get_name(Pointer pointer, int i);

    public static native Pointer avfilter_pad_get_name(PointerByReference pointerbyreference, int i);

    /**
     * @deprecated Method avfilter_pad_get_type is deprecated
     */

    public static native int avfilter_pad_get_type(Pointer pointer, int i);

    public static native int avfilter_pad_get_type(PointerByReference pointerbyreference, int i);

    //public static native int avfilter_link(AVFilterContext avfiltercontext, int i, AVFilterContext avfiltercontext1, int j);
    public static native int avfilter_link(Pointer avfiltercontext, int i, Pointer avfiltercontext1, int j);

    /**
     * @deprecated Method avfilter_link_free is deprecated
     */

    public static native void avfilter_link_free(PointerByReference pointerbyreference);

    public static native void avfilter_link_free(AVFilterLink.ByReference abyreference[]);

    public static native int avfilter_link_get_channels(AVFilterLink avfilterlink);

    public static native void avfilter_link_set_closed(AVFilterLink avfilterlink, int i);

    public static native int avfilter_config_links(AVFilterContext avfiltercontext);

    /**
     * @deprecated Method avfilter_process_command is deprecated
     */

    public static native int avfilter_process_command(AVFilterContext avfiltercontext, Pointer pointer, Pointer pointer1, Pointer pointer2, int i, int j);

    public static native int avfilter_process_command(AVFilterContext avfiltercontext, String s, String s1, ByteBuffer bytebuffer, int i, int j);

    public static native void avfilter_register_all();

    public static native int avfilter_register(AVFilter avfilter);

    /**
     * @deprecated Method avfilter_get_by_name is deprecated
     */

    public static native AVFilter avfilter_get_by_name(Pointer pointer);

    //public static native AVFilter avfilter_get_by_name(String s);
    public static native Pointer avfilter_get_by_name(String s);

    public static native AVFilter avfilter_next(AVFilter avfilter);

    /**
     * @deprecated Method avfilter_init_str is deprecated
     */

    public static native int avfilter_init_str(AVFilterContext avfiltercontext, Pointer pointer);

    public static native int avfilter_init_str(AVFilterContext avfiltercontext, String s);

    public static native int avfilter_init_dict(AVFilterContext avfiltercontext, PointerByReference pointerbyreference);

    public static native int avfilter_init_dict(AVFilterContext avfiltercontext, AVDictionary aavdictionary[]);

    public static native void avfilter_free(AVFilterContext avfiltercontext);

    public static native int avfilter_insert_filter(AVFilterLink avfilterlink, AVFilterContext avfiltercontext, int i, int j);

    public static native AVClass avfilter_get_class();

   // public static native AVFilterGraph avfilter_graph_alloc();
    public static native Pointer avfilter_graph_alloc();

    /**
     * @deprecated Method avfilter_graph_alloc_filter is deprecated
     */

    public static native AVFilterContext avfilter_graph_alloc_filter(AVFilterGraph avfiltergraph, AVFilter avfilter, Pointer pointer);

    public static native AVFilterContext avfilter_graph_alloc_filter(AVFilterGraph avfiltergraph, AVFilter avfilter, String s);

    /**
     * @deprecated Method avfilter_graph_get_filter is deprecated
     */

    public static native AVFilterContext avfilter_graph_get_filter(AVFilterGraph avfiltergraph, Pointer pointer);

    public static native AVFilterContext avfilter_graph_get_filter(AVFilterGraph avfiltergraph, ByteBuffer bytebuffer);

   

  //  public static native int avfilter_graph_create_filter(PointerByReference pointerbyreference, AVFilter avfilter, Pointer pointer, Pointer pointer1, Pointer pointer2, AVFilterGraph avfiltergraph);
    public static native int avfilter_graph_create_filter(PointerByReference avfiltercontext, Pointer avfilter, String pointer, String args, Pointer pointer2, Pointer avfiltergraph);

   // public static native int avfilter_graph_create_filter(AVFilterContext.ByReference abyreference[], AVFilter avfilter, String s, String s1, Pointer pointer, AVFilterGraph avfiltergraph);

   // public static native int avfilter_graph_create_filter(AVFilterContext.ByReference abyreference[], AVFilter avfilter, Pointer pointer, Pointer pointer1, Pointer pointer2, AVFilterGraph avfiltergraph);

    public static native void avfilter_graph_set_auto_convert(AVFilterGraph avfiltergraph, int i);

  //  public static native int avfilter_graph_config(AVFilterGraph avfiltergraph, Pointer pointer);
    public static native int avfilter_graph_config(Pointer avfiltergraph, Pointer pointer);

    

    public static native void avfilter_graph_free(PointerByReference pointerbyreference);

    

    //public static native AVFilterInOut avfilter_inout_alloc();
    public static native Pointer avfilter_inout_alloc();

    /**
     * @deprecated Method avfilter_inout_free is deprecated
     */

    public static native void avfilter_inout_free(PointerByReference pointerbyreference);

    public static native void avfilter_inout_free(AVFilterInOut.ByReference abyreference[]);

    /**
     * @deprecated Method avfilter_graph_parse is deprecated
     */

    public static native int avfilter_graph_parse(AVFilterGraph avfiltergraph, Pointer pointer, AVFilterInOut avfilterinout, AVFilterInOut avfilterinout1, Pointer pointer1);

    public static native int avfilter_graph_parse(AVFilterGraph avfiltergraph, String s, AVFilterInOut avfilterinout, AVFilterInOut avfilterinout1, Pointer pointer);

    /**
     * @deprecated Method avfilter_graph_parse_ptr is deprecated
     */

    public static native int avfilter_graph_parse_ptr(AVFilterGraph avfiltergraph, Pointer pointer, PointerByReference pointerbyreference, PointerByReference pointerbyreference1, Pointer pointer1);

    public static native int avfilter_graph_parse_ptr(AVFilterGraph avfiltergraph, String s, AVFilterInOut.ByReference abyreference[], AVFilterInOut.ByReference abyreference1[], Pointer pointer);

    public static native int avfilter_graph_parse_ptr(AVFilterGraph avfiltergraph, Pointer pointer, AVFilterInOut.ByReference abyreference[], AVFilterInOut.ByReference abyreference1[], Pointer pointer1);

    /**
     * @deprecated Method avfilter_graph_parse2 is deprecated
     */

    public static native int avfilter_graph_parse2(AVFilterGraph avfiltergraph, Pointer pointer, PointerByReference pointerbyreference, PointerByReference pointerbyreference1);

    public static native int avfilter_graph_parse2(AVFilterGraph avfiltergraph, String s, AVFilterInOut.ByReference abyreference[], AVFilterInOut.ByReference abyreference1[]);

    public static native int avfilter_graph_parse2(AVFilterGraph avfiltergraph, Pointer pointer, AVFilterInOut.ByReference abyreference[], AVFilterInOut.ByReference abyreference1[]);

    /**
     * @deprecated Method avfilter_graph_send_command is deprecated
     */

    public static native int avfilter_graph_send_command(AVFilterGraph avfiltergraph, Pointer pointer, Pointer pointer1, Pointer pointer2, Pointer pointer3, int i, int j);

    public static native int avfilter_graph_send_command(AVFilterGraph avfiltergraph, String s, String s1, String s2, ByteBuffer bytebuffer, int i, int j);

    /**
     * @deprecated Method avfilter_graph_queue_command is deprecated
     */

    public static native int avfilter_graph_queue_command(AVFilterGraph avfiltergraph, Pointer pointer, Pointer pointer1, Pointer pointer2, int i, double d);

    public static native int avfilter_graph_queue_command(AVFilterGraph avfiltergraph, String s, String s1, String s2, int i, double d);

    /**
     * @deprecated Method avfilter_graph_dump is deprecated
     */

    public static native Pointer avfilter_graph_dump(AVFilterGraph avfiltergraph, Pointer pointer);

    public static native Pointer avfilter_graph_dump(AVFilterGraph avfiltergraph, String s);

    public static native int avfilter_graph_request_oldest(AVFilterGraph avfiltergraph);

    static 
    {
        Native.register("avfilter");
    }
    
    
    //以下这写代码来自buffersink.h
    
    public static final int AV_BUFFERSINK_FLAG_PEEK = (int)1;
	public static final int AV_BUFFERSINK_FLAG_NO_REQUEST = (int)2;
	/**
	 * Get a frame with filtered data from sink and put it in frame.<br>
	 * * @param ctx    pointer to a buffersink or abuffersink filter context.<br>
	 * @param frame  pointer to an allocated frame that will be filled with data.<br>
	 *               The data must be freed using av_frame_unref() / av_frame_free()<br>
	 * @param flags  a combination of AV_BUFFERSINK_FLAG_* flags<br>
	 * * @return  >= 0 in for success, a negative AVERROR code for failure.<br>
	 * Original signature : <code>int av_buffersink_get_frame_flags(AVFilterContext*, AVFrame*, int)</code><br>
	 * <i>native declaration : line 96</i>
	 */
	public static native int av_buffersink_get_frame_flags(AVFilterContext ctx, AVFrame frame, int flags);
	/**
	 * Create an AVBufferSinkParams structure.<br>
	 * * Must be freed with av_free().<br>
	 * Original signature : <code>AVBufferSinkParams* av_buffersink_params_alloc()</code><br>
	 * <i>native declaration : line 124</i>
	 */
	//public static native AVBufferSinkParams av_buffersink_params_alloc();
	/**
	 * Create an AVABufferSinkParams structure.<br>
	 * * Must be freed with av_free().<br>
	 * Original signature : <code>AVABufferSinkParams* av_abuffersink_params_alloc()</code><br>
	 * <i>native declaration : line 142</i>
	 */
	//public static native AVABufferSinkParams av_abuffersink_params_alloc();
	/**
	 * Set the frame size for an audio buffer sink.<br>
	 * * All calls to av_buffersink_get_buffer_ref will return a buffer with<br>
	 * exactly the specified number of samples, or AVERROR(EAGAIN) if there is<br>
	 * not enough. The last buffer at EOF will be padded with 0.<br>
	 * Original signature : <code>void av_buffersink_set_frame_size(AVFilterContext*, unsigned)</code><br>
	 * <i>native declaration : line 151</i>
	 */
	public static native void av_buffersink_set_frame_size(AVFilterContext ctx, int frame_size);
	/**
	 * Get the frame rate of the input.<br>
	 * Original signature : <code>AVRational av_buffersink_get_frame_rate(AVFilterContext*)</code><br>
	 * <i>native declaration : line 156</i>
	 */
	public static native AVRational av_buffersink_get_frame_rate(AVFilterContext ctx);
	/**
	 * Get a frame with filtered data from sink and put it in frame.<br>
	 * * @param ctx pointer to a context of a buffersink or abuffersink AVFilter.<br>
	 * @param frame pointer to an allocated frame that will be filled with data.<br>
	 *              The data must be freed using av_frame_unref() / av_frame_free()<br>
	 * * @return >= 0 in case of success, a negative AVERROR code in case of<br>
	 *         failure.<br>
	 * Original signature : <code>int av_buffersink_get_frame(AVFilterContext*, AVFrame*)</code><br>
	 * <i>native declaration : line 168</i>
	 */
	public static native int av_buffersink_get_frame(AVFilterContext ctx, AVFrame frame);
	/**
	 * Same as av_buffersink_get_frame(), but with the ability to specify the number<br>
	 * of samples read. This function is less efficient than<br>
	 * av_buffersink_get_frame(), because it copies the data around.<br>
	 * * @param ctx pointer to a context of the abuffersink AVFilter.<br>
	 * @param frame pointer to an allocated frame that will be filled with data.<br>
	 *              The data must be freed using av_frame_unref() / av_frame_free()<br>
	 *              frame will contain exactly nb_samples audio samples, except at<br>
	 *              the end of stream, when it can contain less than nb_samples.<br>
	 * * @warning do not mix this function with av_buffersink_get_frame(). Use only one or<br>
	 * the other with a single sink, not both.<br>
	 * Original signature : <code>int av_buffersink_get_samples(AVFilterContext*, AVFrame*, int)</code><br>
	 * <i>native declaration : line 184</i>
	 */
	public static native int av_buffersink_get_samples(AVFilterContext ctx, AVFrame frame, int nb_samples);
	
	
	
	
	
	
	
	
	//以下这些代码来自buffersrc.h文件
	
	
	
	
	public static final int AV_BUFFERSRC_FLAG_NO_CHECK_FORMAT = 1;
	/** Immediately push the frame to the output. */
	public static final int AV_BUFFERSRC_FLAG_PUSH = 4;
	/**
	 * Keep a reference to the frame.<br>
	 * If the frame if reference-counted, create a new reference; otherwise<br>
	 * copy the frame data.
	 */
	public static final int AV_BUFFERSRC_FLAG_KEEP_REF = 8;
	/**
	 * Add buffer data in picref to buffer_src.<br>
	 * * @param buffer_src  pointer to a buffer source context<br>
	 * @param picref      a buffer reference, or NULL to mark EOF<br>
	 * @param flags       a combination of AV_BUFFERSRC_FLAG_*<br>
	 * @return            >= 0 in case of success, a negative AVERROR code<br>
	 *                    in case of failure<br>
	 * Original signature : <code>int av_buffersrc_add_ref(AVFilterContext*, AVFilterBufferRef*, int)</code><br>
	 * <i>native declaration : line 67</i>
	 */
	public static native int av_buffersrc_add_ref(AVFilterContext buffer_src, AVFilterBufferRef picref, int flags);
	/**
	 * Get the number of failed requests.<br>
	 * * A failed request is when the request_frame method is called while no<br>
	 * frame is present in the buffer.<br>
	 * The number is reset when a frame is added.<br>
	 * Original signature : <code>int av_buffersrc_get_nb_failed_requests(AVFilterContext*)</code><br>
	 * <i>native declaration : line 77</i>
	 */
	public static native int av_buffersrc_get_nb_failed_requests(AVFilterContext buffer_src);
	/**
	 * Add a frame to the buffer source.<br>
	 * * @param s an instance of the buffersrc filter.<br>
	 * @param frame frame to be added. If the frame is reference counted, this<br>
	 * function will make a new reference to it. Otherwise the frame data will be<br>
	 * copied.<br>
	 * * @return 0 on success, a negative AVERROR on error<br>
	 * * This function is equivalent to av_buffersrc_add_frame_flags() with the<br>
	 * AV_BUFFERSRC_FLAG_KEEP_REF flag.<br>
	 * Original signature : <code>int av_buffersrc_write_frame(AVFilterContext*, const AVFrame*)</code><br>
	 * <i>native declaration : line 106</i><br>
	 * @deprecated use the safer methods {@link #av_buffersrc_write_frame(avfilter.AvfilterLibrary.AVFilterContext, avfilter.AvfilterLibrary.AVFrame[])} and {@link #av_buffersrc_write_frame(avfilter.AvfilterLibrary.AVFilterContext, avfilter.AvfilterLibrary.AVFrame)} instead
	 */
	@Deprecated 
	public static native int av_buffersrc_write_frame(AVFilterContext s, AVFrame frame);
	/**
	 * Add a frame to the buffer source.<br>
	 * * @param s an instance of the buffersrc filter.<br>
	 * @param frame frame to be added. If the frame is reference counted, this<br>
	 * function will make a new reference to it. Otherwise the frame data will be<br>
	 * copied.<br>
	 * * @return 0 on success, a negative AVERROR on error<br>
	 * * This function is equivalent to av_buffersrc_add_frame_flags() with the<br>
	 * AV_BUFFERSRC_FLAG_KEEP_REF flag.<br>
	 * Original signature : <code>int av_buffersrc_write_frame(AVFilterContext*, const AVFrame*)</code><br>
	 * <i>native declaration : line 106</i>
	 */
	public static native int av_buffersrc_write_frame(AVFilterContext s, AVFrame frame[]);
	/**
	 * Add a frame to the buffer source.<br>
	 * * @param s an instance of the buffersrc filter.<br>
	 * @param frame frame to be added. If the frame is reference counted, this<br>
	 * function will take ownership of the reference(s) and reset the frame.<br>
	 * Otherwise the frame data will be copied. If this function returns an error,<br>
	 * the input frame is not touched.<br>
	 * * @return 0 on success, a negative AVERROR on error.<br>
	 * * @note the difference between this function and av_buffersrc_write_frame() is<br>
	 * that av_buffersrc_write_frame() creates a new reference to the input frame,<br>
	 * while this function takes ownership of the reference passed to it.<br>
	 * * This function is equivalent to av_buffersrc_add_frame_flags() without the<br>
	 * AV_BUFFERSRC_FLAG_KEEP_REF flag.<br>
	 * Original signature : <code>int av_buffersrc_add_frame(AVFilterContext*, AVFrame*)</code><br>
	 * <i>native declaration : line 126</i>
	 */
	public static native int av_buffersrc_add_frame(AVFilterContext ctx, AVFrame frame);
	/**
	 * Add a frame to the buffer source.<br>
	 * * By default, if the frame is reference-counted, this function will take<br>
	 * ownership of the reference(s) and reset the frame. This can be controled<br>
	 * using the flags.<br>
	 * * If this function returns an error, the input frame is not touched.<br>
	 * * @param buffer_src  pointer to a buffer source context<br>
	 * @param frame       a frame, or NULL to mark EOF<br>
	 * @param flags       a combination of AV_BUFFERSRC_FLAG_*<br>
	 * @return            >= 0 in case of success, a negative AVERROR code<br>
	 *                    in case of failure<br>
	 * Original signature : <code>int av_buffersrc_add_frame_flags(AVFilterContext*, AVFrame*, int)</code><br>
	 * <i>native declaration : line 143</i>
	 */
	public static native int av_buffersrc_add_frame_flags(AVFilterContext buffer_src, AVFrame frame, int flags);
	
	
	/**
	 * 这个方法来自buffersrc.h文件
	 * @param ctx
	 * @param frame
	 * @return
	 */
	public static native int av_buffersrc_add_frame(Pointer srcctx, Pointer frame);
	
	/**
	 * 这个方法来自buffersink.h文件
	 * @param ctx
	 * @param frame
	 * @param flags
	 * @return
	 */
	public static native int av_buffersink_get_frame_flags(Pointer sinkctx, Pointer frame, int flags);
	
	
	
    
}
