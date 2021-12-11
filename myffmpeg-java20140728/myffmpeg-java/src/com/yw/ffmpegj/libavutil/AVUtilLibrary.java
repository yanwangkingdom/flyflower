// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVUtilLibrary.java

package com.yw.ffmpegj.libavutil;

import com.sun.jna.*;
import com.sun.jna.Structure.ByValue;
import com.sun.jna.ptr.DoubleByReference;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;
import com.sun.jna.ptr.PointerByReference;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

// Referenced classes of package avutil:
//            AVFrame, AVFrameSideData

public interface AVUtilLibrary
    extends Library
{
	/**
	 * 这个变量来自error.h文件中
	 */
	public static int AVERROR_EOF=-541478725;//(('E') | (('O') << 8) | (('F') << 16) | ((unsigned)(' ') << 24));
	
    public static class AVBufferRef extends PointerType
    {

        public AVBufferRef(Pointer pointer)
        {
            super(pointer);
        }

        public AVBufferRef()
        {
        }
    }

    public static interface AVColorRange
    {

        public static final int AVCOL_RANGE_UNSPECIFIED = 0;
        public static final int AVCOL_RANGE_MPEG = 1;
        public static final int AVCOL_RANGE_JPEG = 2;
        public static final int AVCOL_RANGE_NB = 3;
    }

    public static interface AVColorSpace
    {

        public static final int AVCOL_SPC_RGB = 0;
        public static final int AVCOL_SPC_BT709 = 1;
        public static final int AVCOL_SPC_UNSPECIFIED = 2;
        public static final int AVCOL_SPC_FCC = 4;
        public static final int AVCOL_SPC_BT470BG = 5;
        public static final int AVCOL_SPC_SMPTE170M = 6;
        public static final int AVCOL_SPC_SMPTE240M = 7;
        public static final int AVCOL_SPC_YCOCG = 8;
        public static final int AVCOL_SPC_BT2020_NCL = 9;
        public static final int AVCOL_SPC_BT2020_CL = 10;
        public static final int AVCOL_SPC_NB = 11;
    }

    public static class AVDictionary extends PointerType
    {

        public AVDictionary(Pointer pointer)
        {
            super(pointer);
        }

        public AVDictionary()
        {
        }
    }

    public static interface AVFrameSideDataType
    {

        public static final int AV_FRAME_DATA_PANSCAN = 0;
        public static final int AV_FRAME_DATA_A53_CC = 1;
    }

   /* public static class AVRational extends PointerType
    {

        public AVRational(Pointer pointer)
        {
            super(pointer);
        }

        public AVRational()
        {
        }
    }*/


    public static final String JNA_LIBRARY_NAME = "avutil-52";
    public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(JNA_LIBRARY_NAME);
    public static final AVUtilLibrary INSTANCE = (AVUtilLibrary)Native.loadLibrary(JNA_LIBRARY_NAME, AVUtilLibrary.class);
    public static final int AV_NUM_DATA_POINTERS = 8;
    public static final int FF_DECODE_ERROR_INVALID_BITSTREAM = 1;
    public static final int FF_DECODE_ERROR_MISSING_REFERENCE = 2;
    public static final int AV_FRAME_FLAG_CORRUPT = 1;

    public abstract long av_frame_get_best_effort_timestamp(Pointer avframe);

    public abstract void av_frame_set_best_effort_timestamp(AVFrame avframe, long l);

    public abstract long av_frame_get_pkt_duration(AVFrame avframe);

    public abstract void av_frame_set_pkt_duration(AVFrame avframe, long l);

    public abstract long av_frame_get_pkt_pos(AVFrame avframe);

    public abstract void av_frame_set_pkt_pos(AVFrame avframe, long l);

    public abstract long av_frame_get_channel_layout(AVFrame avframe);

    public abstract void av_frame_set_channel_layout(AVFrame avframe, long l);

    public abstract int av_frame_get_channels(AVFrame avframe);

    public abstract void av_frame_set_channels(AVFrame avframe, int i);

    public abstract int av_frame_get_sample_rate(AVFrame avframe);

    public abstract void av_frame_set_sample_rate(AVFrame avframe, int i);

    public abstract AVDictionary av_frame_get_metadata(AVFrame avframe);

    public abstract void av_frame_set_metadata(AVFrame avframe, AVDictionary avdictionary);

    public abstract int av_frame_get_decode_error_flags(AVFrame avframe);

    public abstract void av_frame_set_decode_error_flags(AVFrame avframe, int i);

    public abstract int av_frame_get_pkt_size(AVFrame avframe);

    public abstract void av_frame_set_pkt_size(AVFrame avframe, int i);

    public abstract AVDictionary[] avpriv_frame_get_metadatap(AVFrame avframe);

    /**
     * @deprecated Method av_frame_get_qp_table is deprecated
     */

    public abstract Pointer av_frame_get_qp_table(AVFrame avframe, IntByReference intbyreference, IntByReference intbyreference1);

    public abstract Pointer av_frame_get_qp_table(AVFrame avframe, IntBuffer intbuffer, IntBuffer intbuffer1);

    public abstract int av_frame_set_qp_table(AVFrame avframe, AVBufferRef avbufferref, int i, int j);

    public abstract int av_frame_get_colorspace(AVFrame avframe);

    public abstract void av_frame_set_colorspace(AVFrame avframe, int i);

    public abstract int av_frame_get_color_range(AVFrame avframe);

    public abstract void av_frame_set_color_range(AVFrame avframe, int i);

    public abstract Pointer av_get_colorspace_name(int i);

    public abstract AVFrame av_frame_alloc();

    /**
     * @deprecated Method av_frame_free is deprecated
     */

    public abstract void av_frame_free(PointerByReference pointerbyreference);
    
    //public abstract void av_frame_free(AVFrame avframe);
    
    public abstract void av_frame_free(Pointer avframe);

    //public abstract void av_frame_free(AVFrame.ByReference abyreference[]);

    public abstract int av_frame_ref(AVFrame avframe, AVFrame avframe1);

    public abstract AVFrame av_frame_clone(AVFrame avframe);

    public abstract void av_frame_unref(AVFrame avframe);
    public abstract void av_frame_unref(Pointer avframe);

    public abstract void av_frame_move_ref(AVFrame avframe, AVFrame avframe1);

    public abstract int av_frame_get_buffer(AVFrame avframe, int i);

    public abstract int av_frame_is_writable(AVFrame avframe);

    public abstract int av_frame_make_writable(AVFrame avframe);

    public abstract int av_frame_copy_props(AVFrame avframe, AVFrame avframe1);

    public abstract AVBufferRef av_frame_get_plane_buffer(AVFrame avframe, int i);

    public abstract AVFrameSideData av_frame_new_side_data(AVFrame avframe, int i, int j);

    public abstract AVFrameSideData av_frame_get_side_data(AVFrame avframe, int i);
    
    //rational.h
    
    int av_cmp_q(ByValue a, ByValue b);
	/**
	 * Convert rational to double.<br>
	 * @param a rational to convert<br>
	 * @return (double) a<br>
	 * Original signature : <code>double av_q2d(AVRational)</code><br>
	 * <i>native declaration : line 67</i>
	 */
	//double av_q2d(ByValue a);
    double av_q2d(AVRational a);
	/**
	 * Reduce a fraction.<br>
	 * This is useful for framerate calculations.<br>
	 * @param dst_num destination numerator<br>
	 * @param dst_den destination denominator<br>
	 * @param num source numerator<br>
	 * @param den source denominator<br>
	 * @param max the maximum allowed for dst_num & dst_den<br>
	 * @return 1 if exact, 0 otherwise<br>
	 * Original signature : <code>int av_reduce(int*, int*, int64_t, int64_t, int64_t)</code><br>
	 * <i>native declaration : line 81</i><br>
	 * @deprecated use the safer methods {@link #av_reduce(java.nio.IntBuffer, java.nio.IntBuffer, long, long, long)} and {@link #av_reduce(com.sun.jna.ptr.IntByReference, com.sun.jna.ptr.IntByReference, long, long, long)} instead
	 */
	@Deprecated 
	int av_reduce(IntByReference dst_num, IntByReference dst_den, long num, long den, long max);
	/**
	 * Reduce a fraction.<br>
	 * This is useful for framerate calculations.<br>
	 * @param dst_num destination numerator<br>
	 * @param dst_den destination denominator<br>
	 * @param num source numerator<br>
	 * @param den source denominator<br>
	 * @param max the maximum allowed for dst_num & dst_den<br>
	 * @return 1 if exact, 0 otherwise<br>
	 * Original signature : <code>int av_reduce(int*, int*, int64_t, int64_t, int64_t)</code><br>
	 * <i>native declaration : line 81</i>
	 */
	int av_reduce(IntBuffer dst_num, IntBuffer dst_den, long num, long den, long max);
//end rational.h
	
	
	//avutil.h
	public static interface AVMediaType {
		/**
		 * < Usually treated as AVMEDIA_TYPE_DATA<br>
		 * <i>native declaration : line 182</i>
		 */
		public static final int AVMEDIA_TYPE_UNKNOWN = -1;
		/** <i>native declaration : line 183</i> */
		public static final int AVMEDIA_TYPE_VIDEO = 0;
		/** <i>native declaration : line 184</i> */
		public static final int AVMEDIA_TYPE_AUDIO = 1;
		/**
		 * < Opaque data information usually continuous<br>
		 * <i>native declaration : line 185</i>
		 */
		public static final int AVMEDIA_TYPE_DATA = 2;
		/** <i>native declaration : line 186</i> */
		public static final int AVMEDIA_TYPE_SUBTITLE = 3;
		/**
		 * < Opaque data information usually sparse<br>
		 * <i>native declaration : line 187</i>
		 */
		public static final int AVMEDIA_TYPE_ATTACHMENT = 4;
		/** <i>native declaration : line 188</i> */
		public static final int AVMEDIA_TYPE_NB = 5;
	};
	/**
	 * <i>native declaration : line 254</i><br>
	 * enum values
	 */
	public static interface AVPictureType {
		/**
		 * < Undefined<br>
		 * <i>native declaration : line 255</i>
		 */
		public static final int AV_PICTURE_TYPE_NONE = 0;
		/**
		 * < Intra<br>
		 * <i>native declaration : line 256</i>
		 */
		public static final int AV_PICTURE_TYPE_I = 1;
		/**
		 * < Predicted<br>
		 * <i>native declaration : line 257</i>
		 */
		public static final int AV_PICTURE_TYPE_P = 2;
		/**
		 * < Bi-dir predicted<br>
		 * <i>native declaration : line 258</i>
		 */
		public static final int AV_PICTURE_TYPE_B = 3;
		/**
		 * < S(GMC)-VOP MPEG4<br>
		 * <i>native declaration : line 259</i>
		 */
		public static final int AV_PICTURE_TYPE_S = 4;
		/**
		 * < Switching Intra<br>
		 * <i>native declaration : line 260</i>
		 */
		public static final int AV_PICTURE_TYPE_SI = 5;
		/**
		 * < Switching Predicted<br>
		 * <i>native declaration : line 261</i>
		 */
		public static final int AV_PICTURE_TYPE_SP = 6;
		/**
		 * < BI type<br>
		 * <i>native declaration : line 262</i>
		 */
		public static final int AV_PICTURE_TYPE_BI = 7;
	};
	public static final int FF_QUALITY_SCALE = (int)(1 << 7);
	public static final int FF_QP2LAMBDA = (int)118;
	public static final int FF_LAMBDA_SHIFT = (int)7;
	public static final int AV_TIME_BASE = (int)1000000;
	public static final int FF_LAMBDA_MAX = (int)(256 * 128 - 1);
	public static final int FF_LAMBDA_SCALE = (int)(1 << 7);
	/**
	 * Return the LIBAVUTIL_VERSION_INT constant.<br>
	 * Original signature : <code>int avutil_version()</code><br>
	 * <i>native declaration : line 160</i>
	 */
	int avutil_version();
	/**
	 * Return the libavutil build-time configuration.<br>
	 * Original signature : <code>char* avutil_configuration()</code><br>
	 * <i>native declaration : line 165</i>
	 */
	Pointer avutil_configuration();
	/**
	 * Return the libavutil license.<br>
	 * Original signature : <code>char* avutil_license()</code><br>
	 * <i>native declaration : line 170</i>
	 */
	Pointer avutil_license();
	/**
	 * Return a string describing the media_type enum, NULL if media_type<br>
	 * is unknown.<br>
	 * Original signature : <code>char* av_get_media_type_string(AVMediaType)</code><br>
	 * <i>native declaration : line 195</i>
	 */
	Pointer av_get_media_type_string(int media_type);
	/**
	 * Return a single letter to describe the given picture type<br>
	 * pict_type.<br>
	 * * @param[in] pict_type the picture type @return a single character<br>
	 * representing the picture type, '?' if pict_type is unknown<br>
	 * Original signature : <code>char av_get_picture_type_char(AVPictureType)</code><br>
	 * <i>native declaration : line 272</i>
	 */
	byte av_get_picture_type_char(int pict_type);
	/**
	 * Return x default pointer in case p is NULL.<br>
	 * Original signature : <code>void* av_x_if_null(const void*, const void*)</code><br>
	 * <i>native declaration : line 282</i>
	 */
	Pointer av_x_if_null(Pointer p, Pointer x);
	//end avutil.h
	
	
	//mem.h
	//Pointer av_malloc(NativeSize size);
	Pointer av_malloc(int size);
	/**
	 * Allocate a block of size * nmemb bytes with av_malloc().<br>
	 * @param nmemb Number of elements<br>
	 * @param size Size of the single element<br>
	 * @return Pointer to the allocated block, NULL if the block cannot<br>
	 * be allocated.<br>
	 * @see av_malloc()<br>
	 * Original signature : <code>void* av_malloc_array(size_t, size_t)</code><br>
	 * <i>native declaration : line 89</i>
	 */
	//Pointer av_malloc_array(NativeSize nmemb, NativeSize size);
	/**
	 * Allocate or reallocate a block of memory.<br>
	 * If ptr is NULL and size > 0, allocate a new block. If<br>
	 * size is zero, free the memory block pointed to by ptr.<br>
	 * @param ptr Pointer to a memory block already allocated with<br>
	 * av_realloc() or NULL.<br>
	 * @param size Size in bytes of the memory block to be allocated or<br>
	 * reallocated.<br>
	 * @return Pointer to a newly-reallocated block or NULL if the block<br>
	 * cannot be reallocated or the function is used to free the memory block.<br>
	 * @warning Pointers originating from the av_malloc() family of functions must<br>
	 *          not be passed to av_realloc(). The former can be implemented using<br>
	 *          memalign() (or other functions), and there is no guarantee that<br>
	 *          pointers from such functions can be passed to realloc() at all.<br>
	 *          The situation is undefined according to POSIX and may crash with<br>
	 *          some libc implementations.<br>
	 * @see av_fast_realloc()<br>
	 * Original signature : <code>void* av_realloc(void*, size_t)</code><br>
	 * <i>native declaration : line 114</i>
	 */
	//Pointer av_realloc(Pointer ptr, NativeSize size);
	/**
	 * Allocate or reallocate a block of memory.<br>
	 * This function does the same thing as av_realloc, except:<br>
	 * - It takes two arguments and checks the result of the multiplication for<br>
	 *   integer overflow.<br>
	 * - It frees the input block in case of failure, thus avoiding the memory<br>
	 *   leak with the classic "buf = realloc(buf); if (!buf) return -1;".<br>
	 * Original signature : <code>void* av_realloc_f(void*, size_t, size_t)</code><br>
	 * <i>native declaration : line 124</i>
	 */
	//Pointer av_realloc_f(Pointer ptr, NativeSize nelem, NativeSize elsize);
	/**
	 * Allocate or reallocate a block of memory.<br>
	 * If *ptr is NULL and size > 0, allocate a new block. If<br>
	 * size is zero, free the memory block pointed to by ptr.<br>
	 * @param   ptr Pointer to a pointer to a memory block already allocated<br>
	 *          with av_realloc(), or pointer to a pointer to NULL.<br>
	 *          The pointer is updated on success, or freed on failure.<br>
	 * @param   size Size in bytes for the memory block to be allocated or<br>
	 *          reallocated<br>
	 * @return  Zero on success, an AVERROR error code on failure.<br>
	 * @warning Pointers originating from the av_malloc() family of functions must<br>
	 *          not be passed to av_reallocp(). The former can be implemented using<br>
	 *          memalign() (or other functions), and there is no guarantee that<br>
	 *          pointers from such functions can be passed to realloc() at all.<br>
	 *          The situation is undefined according to POSIX and may crash with<br>
	 *          some libc implementations.<br>
	 * Original signature : <code>int av_reallocp(void*, size_t)</code><br>
	 * <i>native declaration : line 143</i>
	 */
	//int av_reallocp(Pointer ptr, NativeSize size);
	/**
	 * Allocate or reallocate an array.<br>
	 * If ptr is NULL and nmemb > 0, allocate a new block. If<br>
	 * nmemb is zero, free the memory block pointed to by ptr.<br>
	 * @param ptr Pointer to a memory block already allocated with<br>
	 * av_realloc() or NULL.<br>
	 * @param nmemb Number of elements<br>
	 * @param size Size of the single element<br>
	 * @return Pointer to a newly-reallocated block or NULL if the block<br>
	 * cannot be reallocated or the function is used to free the memory block.<br>
	 * @warning Pointers originating from the av_malloc() family of functions must<br>
	 *          not be passed to av_realloc(). The former can be implemented using<br>
	 *          memalign() (or other functions), and there is no guarantee that<br>
	 *          pointers from such functions can be passed to realloc() at all.<br>
	 *          The situation is undefined according to POSIX and may crash with<br>
	 *          some libc implementations.<br>
	 * Original signature : <code>void* av_realloc_array(void*, size_t, size_t)</code><br>
	 * <i>native declaration : line 162</i>
	 */
	//Pointer av_realloc_array(Pointer ptr, NativeSize nmemb, NativeSize size);
	/**
	 * Allocate or reallocate an array through a pointer to a pointer.<br>
	 * If *ptr is NULL and nmemb > 0, allocate a new block. If<br>
	 * nmemb is zero, free the memory block pointed to by ptr.<br>
	 * @param ptr Pointer to a pointer to a memory block already allocated<br>
	 * with av_realloc(), or pointer to a pointer to NULL.<br>
	 * The pointer is updated on success, or freed on failure.<br>
	 * @param nmemb Number of elements<br>
	 * @param size Size of the single element<br>
	 * @return Zero on success, an AVERROR error code on failure.<br>
	 * @warning Pointers originating from the av_malloc() family of functions must<br>
	 *          not be passed to av_realloc(). The former can be implemented using<br>
	 *          memalign() (or other functions), and there is no guarantee that<br>
	 *          pointers from such functions can be passed to realloc() at all.<br>
	 *          The situation is undefined according to POSIX and may crash with<br>
	 *          some libc implementations.<br>
	 * Original signature : <code>int av_reallocp_array(void*, size_t, size_t)</code><br>
	 * <i>native declaration : line 181</i>
	 */
	//int av_reallocp_array(Pointer ptr, NativeSize nmemb, NativeSize size);
	/**
	 * Free a memory block which has been allocated with av_malloc(z)() or<br>
	 * av_realloc().<br>
	 * @param ptr Pointer to the memory block which should be freed.<br>
	 * @note ptr = NULL is explicitly allowed.<br>
	 * @note It is recommended that you use av_freep() instead.<br>
	 * @see av_freep()<br>
	 * Original signature : <code>void av_free(void*)</code><br>
	 * <i>native declaration : line 191</i>
	 */
	//void av_free(Pointer ptr);
	/**
	 * Allocate a block of size bytes with alignment suitable for all<br>
	 * memory accesses (including vectors if available on the CPU) and<br>
	 * zero all the bytes of the block.<br>
	 * @param size Size in bytes for the memory block to be allocated.<br>
	 * @return Pointer to the allocated block, NULL if it cannot be allocated.<br>
	 * @see av_malloc()<br>
	 * Original signature : <code>void* av_mallocz(size_t)</code><br>
	 * <i>native declaration : line 201</i>
	 */
	//Pointer av_mallocz(NativeSize size);
	/**
	 * Allocate a block of nmemb * size bytes with alignment suitable for all<br>
	 * memory accesses (including vectors if available on the CPU) and<br>
	 * zero all the bytes of the block.<br>
	 * The allocation will fail if nmemb * size is greater than or equal<br>
	 * to INT_MAX.<br>
	 * @param nmemb<br>
	 * @param size<br>
	 * @return Pointer to the allocated block, NULL if it cannot be allocated.<br>
	 * Original signature : <code>void* av_calloc(size_t, size_t)</code><br>
	 * <i>native declaration : line 213</i>
	 */
	//Pointer av_calloc(NativeSize nmemb, NativeSize size);
	/**
	 * Allocate a block of size * nmemb bytes with av_mallocz().<br>
	 * @param nmemb Number of elements<br>
	 * @param size Size of the single element<br>
	 * @return Pointer to the allocated block, NULL if the block cannot<br>
	 * be allocated.<br>
	 * @see av_mallocz()<br>
	 * @see av_malloc_array()<br>
	 * Original signature : <code>void* av_mallocz_array(size_t, size_t)</code><br>
	 * <i>native declaration : line 224</i>
	 */
	//Pointer av_mallocz_array(NativeSize nmemb, NativeSize size);
	/**
	 * Duplicate the string s.<br>
	 * @param s string to be duplicated<br>
	 * @return Pointer to a newly-allocated string containing a<br>
	 * copy of s or NULL if the string cannot be allocated.<br>
	 * Original signature : <code>char* av_strdup(const char*)</code><br>
	 * <i>native declaration : line 237</i><br>
	 * @deprecated use the safer methods {@link #av_strdup(java.lang.String)} and {@link #av_strdup(com.sun.jna.Pointer)} instead
	 */
	
	//Pointer av_strdup(String s);
	/**
	 * Duplicate the string s.<br>
	 * @param s string to be duplicated<br>
	 * @return Pointer to a newly-allocated string containing a<br>
	 * copy of s or NULL if the string cannot be allocated.<br>
	 * Original signature : <code>char* av_strdup(const char*)</code><br>
	 * <i>native declaration : line 237</i>
	 */
	Pointer av_strdup(String s);
	/**
	 * Duplicate the buffer p.<br>
	 * @param p buffer to be duplicated<br>
	 * @return Pointer to a newly allocated buffer containing a<br>
	 * copy of p or NULL if the buffer cannot be allocated.<br>
	 * Original signature : <code>void* av_memdup(const void*, size_t)</code><br>
	 * <i>native declaration : line 245</i>
	 * 来自mem.h
	 */
	Pointer av_memdup(Pointer p, int size);
	/**
	 * Free a memory block which has been allocated with av_malloc(z)() or<br>
	 * av_realloc() and set the pointer pointing to it to NULL.<br>
	 * @param ptr Pointer to the pointer to the memory block which should<br>
	 * be freed.<br>
	 * @see av_free()<br>
	 * Original signature : <code>void av_freep(void*)</code><br>
	 * <i>native declaration : line 254</i>
	 */
	void av_freep(Pointer ptr);
	/**
	 * Add an element to a dynamic array.<br>
	 * * The array to grow is supposed to be an array of pointers to<br>
	 * structures, and the element to add must be a pointer to an already<br>
	 * allocated structure.<br>
	 * * The array is reallocated when its size reaches powers of 2.<br>
	 * Therefore, the amortized cost of adding an element is constant.<br>
	 * * In case of success, the pointer to the array is updated in order to<br>
	 * point to the new grown array, and the number pointed to by nb_ptr<br>
	 * is incremented.<br>
	 * In case of failure, the array is freed, *tab_ptr is set to NULL and<br>
	 * *nb_ptr is set to 0.<br>
	 * * @param tab_ptr pointer to the array to grow<br>
	 * @param nb_ptr  pointer to the number of elements in the array<br>
	 * @param elem    element to add<br>
	 * @see av_dynarray2_add()<br>
	 * Original signature : <code>void av_dynarray_add(void*, int*, void*)</code><br>
	 * <i>native declaration : line 277</i><br>
	 * @deprecated use the safer methods {@link #av_dynarray_add(com.sun.jna.Pointer, java.nio.IntBuffer, com.sun.jna.Pointer)} and {@link #av_dynarray_add(com.sun.jna.Pointer, com.sun.jna.ptr.IntByReference, com.sun.jna.Pointer)} instead
	 */
	//@Deprecated 
	//void av_dynarray_add(Pointer tab_ptr, IntByReference nb_ptr, Pointer elem);
	/**
	 * Add an element to a dynamic array.<br>
	 * * The array to grow is supposed to be an array of pointers to<br>
	 * structures, and the element to add must be a pointer to an already<br>
	 * allocated structure.<br>
	 * * The array is reallocated when its size reaches powers of 2.<br>
	 * Therefore, the amortized cost of adding an element is constant.<br>
	 * * In case of success, the pointer to the array is updated in order to<br>
	 * point to the new grown array, and the number pointed to by nb_ptr<br>
	 * is incremented.<br>
	 * In case of failure, the array is freed, *tab_ptr is set to NULL and<br>
	 * *nb_ptr is set to 0.<br>
	 * * @param tab_ptr pointer to the array to grow<br>
	 * @param nb_ptr  pointer to the number of elements in the array<br>
	 * @param elem    element to add<br>
	 * @see av_dynarray2_add()<br>
	 * Original signature : <code>void av_dynarray_add(void*, int*, void*)</code><br>
	 * <i>native declaration : line 277</i>
	 */
	//void av_dynarray_add(Pointer tab_ptr, IntBuffer nb_ptr, Pointer elem);
	/**
	 * Add an element of size elem_size to a dynamic array.<br>
	 * * The array is reallocated when its number of elements reaches powers of 2.<br>
	 * Therefore, the amortized cost of adding an element is constant.<br>
	 * * In case of success, the pointer to the array is updated in order to<br>
	 * point to the new grown array, and the number pointed to by nb_ptr<br>
	 * is incremented.<br>
	 * In case of failure, the array is freed, *tab_ptr is set to NULL and<br>
	 * *nb_ptr is set to 0.<br>
	 * * @param tab_ptr   pointer to the array to grow<br>
	 * @param nb_ptr    pointer to the number of elements in the array<br>
	 * @param elem_size size in bytes of the elements in the array<br>
	 * @param elem_data pointer to the data of the element to add. If NULL, the space of<br>
	 *                  the new added element is not filled.<br>
	 * @return          pointer to the data of the element to copy in the new allocated space.<br>
	 *                  If NULL, the new allocated space is left uninitialized."<br>
	 * @see av_dynarray_add()<br>
	 * Original signature : <code>void* av_dynarray2_add(void**, int*, size_t, const uint8_t*)</code><br>
	 * <i>native declaration : line 300</i><br>
	 * @deprecated use the safer methods {@link #av_dynarray2_add(com.sun.jna.ptr.PointerByReference, java.nio.IntBuffer, com.ochafik.lang.jnaerator.runtime.NativeSize, byte[])} and {@link #av_dynarray2_add(com.sun.jna.ptr.PointerByReference, com.sun.jna.ptr.IntByReference, com.ochafik.lang.jnaerator.runtime.NativeSize, com.sun.jna.Pointer)} instead
	 */
	//@Deprecated 
	//Pointer av_dynarray2_add(PointerByReference tab_ptr, IntByReference nb_ptr, NativeSize elem_size, Pointer elem_data);
	/**
	 * Add an element of size elem_size to a dynamic array.<br>
	 * * The array is reallocated when its number of elements reaches powers of 2.<br>
	 * Therefore, the amortized cost of adding an element is constant.<br>
	 * * In case of success, the pointer to the array is updated in order to<br>
	 * point to the new grown array, and the number pointed to by nb_ptr<br>
	 * is incremented.<br>
	 * In case of failure, the array is freed, *tab_ptr is set to NULL and<br>
	 * *nb_ptr is set to 0.<br>
	 * * @param tab_ptr   pointer to the array to grow<br>
	 * @param nb_ptr    pointer to the number of elements in the array<br>
	 * @param elem_size size in bytes of the elements in the array<br>
	 * @param elem_data pointer to the data of the element to add. If NULL, the space of<br>
	 *                  the new added element is not filled.<br>
	 * @return          pointer to the data of the element to copy in the new allocated space.<br>
	 *                  If NULL, the new allocated space is left uninitialized."<br>
	 * @see av_dynarray_add()<br>
	 * Original signature : <code>void* av_dynarray2_add(void**, int*, size_t, const uint8_t*)</code><br>
	 * <i>native declaration : line 300</i>
	 */
	//Pointer av_dynarray2_add(PointerByReference tab_ptr, IntBuffer nb_ptr, NativeSize elem_size, byte elem_data[]);
	/**
	 * Multiply two size_t values checking for overflow.<br>
	 * @return  0 if success, AVERROR(EINVAL) if overflow.<br>
	 * Original signature : <code>int av_size_mult(size_t, size_t, size_t*)</code><br>
	 * <i>native declaration : line 307</i>
	 */
	//int av_size_mult(NativeSize a, NativeSize b, NativeSizeByReference r);
	/**
	 * Set the maximum size that may me allocated in one block.<br>
	 * Original signature : <code>void av_max_alloc(size_t)</code><br>
	 * <i>native declaration : line 321</i>
	 */
	//void av_max_alloc(NativeSize max);
	/**
	 * deliberately overlapping memcpy implementation<br>
	 * @param dst destination buffer<br>
	 * @param back how many bytes back we start (the initial size of the overlapping window), must be > 0<br>
	 * @param cnt number of bytes to copy, must be >= 0<br>
	 * * cnt > back is valid, this will copy the bytes we just copied,<br>
	 * thus creating a repeating pattern with a period length of back.<br>
	 * Original signature : <code>void av_memcpy_backptr(uint8_t*, int, int)</code><br>
	 * <i>native declaration : line 332</i><br>
	 * @deprecated use the safer methods {@link #av_memcpy_backptr(java.nio.ByteBuffer, int, int)} and {@link #av_memcpy_backptr(com.sun.jna.Pointer, int, int)} instead
	 */
	//@Deprecated 
	//void av_memcpy_backptr(Pointer dst, int back, int cnt);
	/**
	 * deliberately overlapping memcpy implementation<br>
	 * @param dst destination buffer<br>
	 * @param back how many bytes back we start (the initial size of the overlapping window), must be > 0<br>
	 * @param cnt number of bytes to copy, must be >= 0<br>
	 * * cnt > back is valid, this will copy the bytes we just copied,<br>
	 * thus creating a repeating pattern with a period length of back.<br>
	 * Original signature : <code>void av_memcpy_backptr(uint8_t*, int, int)</code><br>
	 * <i>native declaration : line 332</i>
	 */
	//void av_memcpy_backptr(ByteBuffer dst, int back, int cnt);
	/**
	 * Reallocate the given block if it is not large enough, otherwise do nothing.<br>
	 * * @see av_realloc<br>
	 * Original signature : <code>void* av_fast_realloc(void*, unsigned int*, size_t)</code><br>
	 * <i>native declaration : line 339</i><br>
	 * @deprecated use the safer methods {@link #av_fast_realloc(com.sun.jna.Pointer, java.nio.IntBuffer, com.ochafik.lang.jnaerator.runtime.NativeSize)} and {@link #av_fast_realloc(com.sun.jna.Pointer, com.sun.jna.ptr.IntByReference, com.ochafik.lang.jnaerator.runtime.NativeSize)} instead
	 */
	//@Deprecated 
	//Pointer av_fast_realloc(Pointer ptr, IntByReference size, NativeSize min_size);
	/**
	 * Reallocate the given block if it is not large enough, otherwise do nothing.<br>
	 * * @see av_realloc<br>
	 * Original signature : <code>void* av_fast_realloc(void*, unsigned int*, size_t)</code><br>
	 * <i>native declaration : line 339</i>
	 */
	//Pointer av_fast_realloc(Pointer ptr, IntBuffer size, NativeSize min_size);
	/**
	 * Allocate a buffer, reusing the given one if large enough.<br>
	 * * Contrary to av_fast_realloc the current buffer contents might not be<br>
	 * preserved and on error the old buffer is freed, thus no special<br>
	 * handling to avoid memleaks is necessary.<br>
	 * * @param ptr pointer to pointer to already allocated buffer, overwritten with pointer to new buffer<br>
	 * @param size size of the buffer *ptr points to<br>
	 * @param min_size minimum size of *ptr buffer after returning, *ptr will be NULL and<br>
	 *                 *size 0 if an error occurred.<br>
	 * Original signature : <code>void av_fast_malloc(void*, unsigned int*, size_t)</code><br>
	 * <i>native declaration : line 353</i><br>
	 * @deprecated use the safer methods {@link #av_fast_malloc(com.sun.jna.Pointer, java.nio.IntBuffer, com.ochafik.lang.jnaerator.runtime.NativeSize)} and {@link #av_fast_malloc(com.sun.jna.Pointer, com.sun.jna.ptr.IntByReference, com.ochafik.lang.jnaerator.runtime.NativeSize)} instead
	 */
	//@Deprecated 
	//void av_fast_malloc(Pointer ptr, IntByReference size, NativeSize min_size);
	/**
	 * Allocate a buffer, reusing the given one if large enough.<br>
	 * * Contrary to av_fast_realloc the current buffer contents might not be<br>
	 * preserved and on error the old buffer is freed, thus no special<br>
	 * handling to avoid memleaks is necessary.<br>
	 * * @param ptr pointer to pointer to already allocated buffer, overwritten with pointer to new buffer<br>
	 * @param size size of the buffer *ptr points to<br>
	 * @param min_size minimum size of *ptr buffer after returning, *ptr will be NULL and<br>
	 *                 *size 0 if an error occurred.<br>
	 * Original signature : <code>void av_fast_malloc(void*, unsigned int*, size_t)</code><br>
	 * <i>native declaration : line 353</i>
	 */
	void av_fast_malloc(Pointer ptr, IntByReference size, int min_size);
	
	long av_rescale_q(long pktpts,AVRational.ByValue bq,AVRational.ByValue cq);
	//long av_rescale_q(long pktpts,AVRational.ByReference bq,AVRational.ByReference cq);
	
	
	
	/**
	 * samplefmt.c中的方法
	 * @param sample_fmt
	 * @return
	 */
	int av_get_bytes_per_sample(int sample_fmt);
	
	
	
	public static interface AVSampleFormat {
		/** <i>native declaration : line 48</i> */
		public static final int AV_SAMPLE_FMT_NONE = -1;
		/**
		 * < unsigned 8 bits<br>
		 * <i>native declaration : line 49</i>
		 */
		public static final int AV_SAMPLE_FMT_U8 = 0;
		/**
		 * < signed 16 bits<br>
		 * <i>native declaration : line 50</i>
		 */
		public static final int AV_SAMPLE_FMT_S16 = 1;
		/**
		 * < signed 32 bits<br>
		 * <i>native declaration : line 51</i>
		 */
		public static final int AV_SAMPLE_FMT_S32 = 2;
		/**
		 * < float<br>
		 * <i>native declaration : line 52</i>
		 */
		public static final int AV_SAMPLE_FMT_FLT = 3;
		/**
		 * < double<br>
		 * <i>native declaration : line 53</i>
		 */
		public static final int AV_SAMPLE_FMT_DBL = 4;
		/**
		 * < unsigned 8 bits, planar<br>
		 * <i>native declaration : line 55</i>
		 */
		public static final int AV_SAMPLE_FMT_U8P = 5;
		/**
		 * < signed 16 bits, planar<br>
		 * <i>native declaration : line 56</i>
		 */
		public static final int AV_SAMPLE_FMT_S16P = 6;
		/**
		 * < signed 32 bits, planar<br>
		 * <i>native declaration : line 57</i>
		 */
		public static final int AV_SAMPLE_FMT_S32P = 7;
		/**
		 * < float, planar<br>
		 * <i>native declaration : line 58</i>
		 */
		public static final int AV_SAMPLE_FMT_FLTP = 8;
		/**
		 * < double, planar<br>
		 * <i>native declaration : line 59</i>
		 */
		public static final int AV_SAMPLE_FMT_DBLP = 9;
		/**
		 * < Number of sample formats. DO NOT USE if linking dynamically<br>
		 * <i>native declaration : line 61</i>
		 */
		public static final int AV_SAMPLE_FMT_NB = 10;
	};
	
	
	/**
	 * Return the name of sample_fmt, or NULL if sample_fmt is not<br>
	 * recognized.<br>
	 * Original signature : <code>char* av_get_sample_fmt_name(AVSampleFormat)</code><br>
	 * <i>native declaration : line 68</i>
	 */
	//以下这些来自channel—— layout.h
	
	
	public static interface AVMatrixEncoding {
		/** <i>native declaration : line 114</i> */
		public static final int AV_MATRIX_ENCODING_NONE = 0;
		/** <i>native declaration : line 115</i> */
		public static final int AV_MATRIX_ENCODING_DOLBY = 1;
		/** <i>native declaration : line 116</i> */
		public static final int AV_MATRIX_ENCODING_DPLII = 2;
		/** <i>native declaration : line 117</i> */
		public static final int AV_MATRIX_ENCODING_NB = 3;
	};
	public static final int AV_CH_LAYOUT_SURROUND = (int)((0x00000001 | 0x00000002) | 0x00000004);
	public static final int AV_CH_SIDE_RIGHT = (int)0x00000400;
	public static final int AV_CH_TOP_BACK_RIGHT = (int)0x00020000;
	public static final int AV_CH_LAYOUT_6POINT1_FRONT = (int)((((0x00000001 | 0x00000002) | 0x00000200 | 0x00000400) | 0x00000040 | 0x00000080) | 0x00000008);
	public static final int AV_CH_STEREO_LEFT = (int)0x20000000;
	public static final long AV_CH_LAYOUT_NATIVE = (long)0x8000000000000000L;
	public static final int AV_CH_LAYOUT_HEXAGONAL = (int)((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000010 | 0x00000020) | 0x00000100);
	public static final int AV_CH_LAYOUT_QUAD = (int)((0x00000001 | 0x00000002) | 0x00000010 | 0x00000020);
	public static final int AV_CH_FRONT_RIGHT = (int)0x00000002;
	public static final int AV_CH_TOP_FRONT_CENTER = (int)0x00002000;
	public static final int AV_CH_BACK_CENTER = (int)0x00000100;
	public static final int AV_CH_FRONT_RIGHT_OF_CENTER = (int)0x00000080;
	public static final int AV_CH_LAYOUT_7POINT1 = (int)(((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000200 | 0x00000400) | 0x00000008) | 0x00000010 | 0x00000020);
	public static final int AV_CH_LAYOUT_4POINT0 = (int)(((0x00000001 | 0x00000002) | 0x00000004) | 0x00000100);
	public static final int AV_CH_LAYOUT_2POINT1 = (int)((0x00000001 | 0x00000002) | 0x00000008);
	public static final int AV_CH_LAYOUT_7POINT0 = (int)((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000200 | 0x00000400) | 0x00000010 | 0x00000020);
	public static final int AV_CH_LAYOUT_7POINT1_WIDE_BACK = (int)(((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000010 | 0x00000020) | 0x00000008) | 0x00000040 | 0x00000080);
	public static final int AV_CH_LAYOUT_STEREO_DOWNMIX = (int)(0x20000000 | 0x40000000);
	public static final int AV_CH_BACK_RIGHT = (int)0x00000020;
	public static final int AV_CH_LAYOUT_6POINT0 = (int)((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000200 | 0x00000400) | 0x00000100);
	public static final int AV_CH_LAYOUT_7POINT0_FRONT = (int)((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000200 | 0x00000400) | 0x00000040 | 0x00000080);
	public static final int AV_CH_LAYOUT_6POINT1 = (int)(((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000200 | 0x00000400) | 0x00000008) | 0x00000100);
	public static final int AV_CH_LOW_FREQUENCY = (int)0x00000008;
	public static final int AV_CH_TOP_FRONT_LEFT = (int)0x00001000;
	public static final long AV_CH_LOW_FREQUENCY_2 = (long)0x0000000800000000L;
	public static final int AV_CH_LAYOUT_4POINT1 = (int)((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000100) | 0x00000008);
	public static final int AV_CH_TOP_FRONT_RIGHT = (int)0x00004000;
	public static final long AV_CH_WIDE_LEFT = (long)0x0000000080000000L;
	public static final int AV_CH_LAYOUT_6POINT1_BACK = (int)(((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000010 | 0x00000020) | 0x00000008) | 0x00000100);
	public static final int AV_CH_LAYOUT_5POINT0 = (int)(((0x00000001 | 0x00000002) | 0x00000004) | 0x00000200 | 0x00000400);
	public static final int AV_CH_FRONT_LEFT_OF_CENTER = (int)0x00000040;
	public static final int AV_CH_LAYOUT_5POINT1 = (int)((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000200 | 0x00000400) | 0x00000008);
	public static final int AV_CH_TOP_BACK_LEFT = (int)0x00008000;
	public static final int AV_CH_TOP_CENTER = (int)0x00000800;
	public static final int AV_CH_LAYOUT_5POINT1_BACK = (int)((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000010 | 0x00000020) | 0x00000008);
	public static final int AV_CH_LAYOUT_6POINT0_FRONT = (int)(((0x00000001 | 0x00000002) | 0x00000200 | 0x00000400) | 0x00000040 | 0x00000080);
	public static final int AV_CH_LAYOUT_STEREO = (int)(0x00000001 | 0x00000002);
	public static final int AV_CH_LAYOUT_2_1 = (int)((0x00000001 | 0x00000002) | 0x00000100);
	public static final long AV_CH_SURROUND_DIRECT_RIGHT = (long)0x0000000400000000L;
	public static final int AV_CH_FRONT_LEFT = (int)0x00000001;
	public static final long AV_CH_SURROUND_DIRECT_LEFT = (long)0x0000000200000000L;
	public static final int AV_CH_STEREO_RIGHT = (int)0x40000000;
	public static final int AV_CH_LAYOUT_7POINT1_WIDE = (int)(((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000200 | 0x00000400) | 0x00000008) | 0x00000040 | 0x00000080);
	public static final int AV_CH_LAYOUT_2_2 = (int)((0x00000001 | 0x00000002) | 0x00000200 | 0x00000400);
	public static final int AV_CH_LAYOUT_MONO = (int)(0x00000004);
	public static final int AV_CH_LAYOUT_5POINT0_BACK = (int)(((0x00000001 | 0x00000002) | 0x00000004) | 0x00000010 | 0x00000020);
	public static final int AV_CH_TOP_BACK_CENTER = (int)0x00010000;
	public static final int AV_CH_LAYOUT_OCTAGONAL = (int)((((0x00000001 | 0x00000002) | 0x00000004) | 0x00000200 | 0x00000400) | 0x00000010 | 0x00000100 | 0x00000020);
	public static final int AV_CH_LAYOUT_3POINT1 = (int)(((0x00000001 | 0x00000002) | 0x00000004) | 0x00000008);
	public static final int AV_CH_FRONT_CENTER = (int)0x00000004;
	public static final long AV_CH_WIDE_RIGHT = (long)0x0000000100000000L;
	public static final int AV_CH_BACK_LEFT = (int)0x00000010;
	public static final int AV_CH_SIDE_LEFT = (int)0x00000200;
	/**
	 * Return a channel layout id that matches name, or 0 if no match is found.<br>
	 * * name can be one or several of the following notations,<br>
	 * separated by '+' or '|':<br>
	 * - the name of an usual channel layout (mono, stereo, 4.0, quad, 5.0,<br>
	 *   5.0(side), 5.1, 5.1(side), 7.1, 7.1(wide), downmix);<br>
	 * - the name of a single channel (FL, FR, FC, LFE, BL, BR, FLC, FRC, BC,<br>
	 *   SL, SR, TC, TFL, TFC, TFR, TBL, TBC, TBR, DL, DR);<br>
	 * - a number of channels, in decimal, optionally followed by 'c', yielding<br>
	 *   the default channel layout for that number of channels (@see<br>
	 *   av_get_default_channel_layout);<br>
	 * - a channel layout mask, in hexadecimal starting with "0x" (see the<br>
	 *   AV_CH_* macros).<br>
	 * * @warning Starting from the next major bump the trailing character<br>
	 * 'c' to specify a number of channels will be required, while a<br>
	 * channel layout mask could also be specified as a decimal number<br>
	 * (if and only if not followed by "c").<br>
	 * * Example: "stereo+FC" = "2c+FC" = "2c+1c" = "0x7"<br>
	 * Original signature : <code>uint64_t av_get_channel_layout(const char*)</code><br>
	 * <i>native declaration : line 146</i><br>
	 * @deprecated use the safer methods {@link #av_get_channel_layout(java.lang.String)} and {@link #av_get_channel_layout(com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	public abstract long av_get_channel_layout(Pointer name);
	/**
	 * Return a channel layout id that matches name, or 0 if no match is found.<br>
	 * * name can be one or several of the following notations,<br>
	 * separated by '+' or '|':<br>
	 * - the name of an usual channel layout (mono, stereo, 4.0, quad, 5.0,<br>
	 *   5.0(side), 5.1, 5.1(side), 7.1, 7.1(wide), downmix);<br>
	 * - the name of a single channel (FL, FR, FC, LFE, BL, BR, FLC, FRC, BC,<br>
	 *   SL, SR, TC, TFL, TFC, TFR, TBL, TBC, TBR, DL, DR);<br>
	 * - a number of channels, in decimal, optionally followed by 'c', yielding<br>
	 *   the default channel layout for that number of channels (@see<br>
	 *   av_get_default_channel_layout);<br>
	 * - a channel layout mask, in hexadecimal starting with "0x" (see the<br>
	 *   AV_CH_* macros).<br>
	 * * @warning Starting from the next major bump the trailing character<br>
	 * 'c' to specify a number of channels will be required, while a<br>
	 * channel layout mask could also be specified as a decimal number<br>
	 * (if and only if not followed by "c").<br>
	 * * Example: "stereo+FC" = "2c+FC" = "2c+1c" = "0x7"<br>
	 * Original signature : <code>uint64_t av_get_channel_layout(const char*)</code><br>
	 * <i>native declaration : line 146</i>
	 */
	public abstract long av_get_channel_layout(String name);
	/**
	 * Return a description of a channel layout.<br>
	 * If nb_channels is <= 0, it is guessed from the channel_layout.<br>
	 * * @param buf put here the string containing the channel layout<br>
	 * @param buf_size size in bytes of the buffer<br>
	 * Original signature : <code>void av_get_channel_layout_string(char*, int, int, uint64_t)</code><br>
	 * <i>native declaration : line 155</i><br>
	 * @deprecated use the safer methods {@link #av_get_channel_layout_string(java.nio.ByteBuffer, int, int, long)} and {@link #av_get_channel_layout_string(com.sun.jna.Pointer, int, int, long)} instead
	 */
	@Deprecated 
	public abstract void av_get_channel_layout_string(Pointer buf, int buf_size, int nb_channels, long channel_layout);
	/**
	 * Return a description of a channel layout.<br>
	 * If nb_channels is <= 0, it is guessed from the channel_layout.<br>
	 * * @param buf put here the string containing the channel layout<br>
	 * @param buf_size size in bytes of the buffer<br>
	 * Original signature : <code>void av_get_channel_layout_string(char*, int, int, uint64_t)</code><br>
	 * <i>native declaration : line 155</i>
	 */
	public abstract void av_get_channel_layout_string(ByteBuffer buf, int buf_size, int nb_channels, long channel_layout);
	/**
	 * Append a description of a channel layout to a bprint buffer.<br>
	 * Original signature : <code>void av_bprint_channel_layout(AVBPrint*, int, uint64_t)</code><br>
	 * <i>native declaration : line 161</i>
	 */
	public abstract void av_bprint_channel_layout(AVBPrint bp, int nb_channels, long channel_layout);
	/**
	 * Return the number of channels in the channel layout.<br>
	 * Original signature : <code>int av_get_channel_layout_nb_channels(uint64_t)</code><br>
	 * <i>native declaration : line 166</i>
	 */
	public abstract int av_get_channel_layout_nb_channels(long channel_layout);
	/**
	 * Return default channel layout for a given number of channels.<br>
	 * Original signature : <code>int64_t av_get_default_channel_layout(int)</code><br>
	 * <i>native declaration : line 171</i>
	 */
	public abstract long av_get_default_channel_layout(int nb_channels);
	/**
	 * Get the index of a channel in channel_layout.<br>
	 * * @param channel a channel layout describing exactly one channel which must be<br>
	 *                present in channel_layout.<br>
	 * * @return index of channel in channel_layout on success, a negative AVERROR<br>
	 *         on error.<br>
	 * Original signature : <code>int av_get_channel_layout_channel_index(uint64_t, uint64_t)</code><br>
	 * <i>native declaration : line 182</i>
	 */
	public abstract int av_get_channel_layout_channel_index(long channel_layout, long channel);
	/**
	 * Get the channel with the given index in channel_layout.<br>
	 * Original signature : <code>uint64_t av_channel_layout_extract_channel(uint64_t, int)</code><br>
	 * <i>native declaration : line 188</i>
	 */
	public abstract long av_channel_layout_extract_channel(long channel_layout, int index);
	/**
	 * Get the name of a given channel.<br>
	 * * @return channel name on success, NULL on error.<br>
	 * Original signature : <code>char* av_get_channel_name(uint64_t)</code><br>
	 * <i>native declaration : line 195</i>
	 */
	public abstract Pointer av_get_channel_name(long channel);
	/**
	 * Get the description of a given channel.<br>
	 * * @param channel  a channel layout with a single channel<br>
	 * @return  channel description on success, NULL on error<br>
	 * Original signature : <code>char* av_get_channel_description(uint64_t)</code><br>
	 * <i>native declaration : line 203</i>
	 */
	public abstract Pointer av_get_channel_description(long channel);
	/**
	 * Get the value and name of a standard channel layout.<br>
	 * * @param[in]  index   index in an internal list, starting at 0<br>
	 * @param[out] layout  channel layout mask<br>
	 * @param[out] name    name of the layout<br>
	 * @return  0  if the layout exists,<br>
	 *          <0 if index is beyond the limits<br>
	 * Original signature : <code>int av_get_standard_channel_layout(unsigned, uint64_t*, const char**)</code><br>
	 * <i>native declaration : line 214</i><br>
	 * @deprecated use the safer methods {@link #av_get_standard_channel_layout(int, java.nio.LongBuffer, java.lang.String[])} and {@link #av_get_standard_channel_layout(int, com.sun.jna.ptr.LongByReference, com.sun.jna.ptr.PointerByReference)} instead
	 */
	@Deprecated 
	//public abstract int av_get_standard_channel_layout(int index, LongByReference layout, PointerByReference name);
	/**
	 * Get the value and name of a standard channel layout.<br>
	 * * @param[in]  index   index in an internal list, starting at 0<br>
	 * @param[out] layout  channel layout mask<br>
	 * @param[out] name    name of the layout<br>
	 * @return  0  if the layout exists,<br>
	 *          <0 if index is beyond the limits<br>
	 * Original signature : <code>int av_get_standard_channel_layout(unsigned, uint64_t*, const char**)</code><br>
	 * <i>native declaration : line 214</i>
	 */
	//public abstract int av_get_standard_channel_layout(int index, LongBuffer layout, String name[]);
	public static class AVBPrint extends PointerType {
		public AVBPrint(Pointer address) {
			super(address);
		}
		public AVBPrint() {
			super();
		}
	}
	//来自opt.h文件
	
	public static final int AV_OPT_SEARCH_FAKE_OBJ = (int)0x0002;
	public static final int AV_OPT_SEARCH_CHILDREN = (int)0x0001;
	
	public abstract  int av_opt_set_bin(Pointer filtercontext,String name,Pointer val,int length,int flag);
	
	
	//int av_opt_set_int(Pointer obj, Pointer name, long val, int search_flags);
	int av_opt_set_int(Pointer obj, String name, long val, int search_flags);
	
	
	
	
	String av_get_sample_fmt_name(int sample_fmt);
	
	int av_samples_get_buffer_size(IntByReference linesize, int nb_channels, int nb_samples,
            int sample_fmt, int align);
	
	int av_frame_get_channels(Pointer frame);
	
	int av_dict_set(PointerByReference pm, String key, String value, int flags);
	
}
