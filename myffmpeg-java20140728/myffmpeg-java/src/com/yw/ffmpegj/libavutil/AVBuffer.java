package com.yw.ffmpegj.libavutil;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

public class AVBuffer extends Structure {
	/**
	 * < data described by this buffer<br>
	 * C type : uint8_t*
	 */
	public Pointer data;
	/** < size of data in bytes */
	public int size;
	/** number of existing AVBufferRef instances referring to this buffer */
	public int refcount;
	/**
	 * a callback for freeing the data<br>
	 * C type : free_callback*
	 */
	public AVBuffer.free_callback free;
	/**
	 * an opaque pointer, to be used by the freeing callback<br>
	 * C type : void*
	 */
	public Pointer opaque;
	/** A combination of BUFFER_FLAG_* */
	public int flags;
	public interface free_callback extends Callback {
		void apply(Pointer opaque, Pointer data);
	};
	public AVBuffer() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("data", "size", "refcount", "free", "opaque", "flags");
	}
	/**
	 * @param data < data described by this buffer<br>
	 * C type : uint8_t*<br>
	 * @param size < size of data in bytes<br>
	 * @param refcount number of existing AVBufferRef instances referring to this buffer<br>
	 * @param free a callback for freeing the data<br>
	 * C type : free_callback*<br>
	 * @param opaque an opaque pointer, to be used by the freeing callback<br>
	 * C type : void*<br>
	 * @param flags A combination of BUFFER_FLAG_*
	 */
	public AVBuffer(Pointer data, int size, int refcount, AVBuffer.free_callback free, Pointer opaque, int flags) {
		super();
		this.data = data;
		this.size = size;
		this.refcount = refcount;
		this.free = free;
		this.opaque = opaque;
		this.flags = flags;
	}
	public static class ByReference extends AVBuffer implements Structure.ByReference {
		ByReference(){
			super();
		}
	};
	public static class ByValue extends AVBuffer implements Structure.ByValue {
		ByValue(){
			super();
		}
	};
}
