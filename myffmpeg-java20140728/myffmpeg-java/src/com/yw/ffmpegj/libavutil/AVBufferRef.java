package com.yw.ffmpegj.libavutil;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

public class AVBufferRef extends Structure {
	/** C type : AVBuffer* */
	public Pointer buffer;//AVBuffer.ByReference buffer;
	/**
	 * The data buffer. It is considered writable if and only if<br>
	 * this is the only reference to the buffer, in which case<br>
	 * av_buffer_is_writable() returns 1.<br>
	 * C type : uint8_t*
	 */
	public Pointer data;
	/** Size of data in bytes. */
	public int size;
	public AVBufferRef() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("buffer", "data", "size");
	}
	/**
	 * @param buffer C type : AVBuffer*<br>
	 * @param data The data buffer. It is considered writable if and only if<br>
	 * this is the only reference to the buffer, in which case<br>
	 * av_buffer_is_writable() returns 1.<br>
	 * C type : uint8_t*<br>
	 * @param size Size of data in bytes.
	 */
	public AVBufferRef(Pointer buffer, Pointer data, int size) {
		super();
		this.buffer = buffer;
		this.data = data;
		this.size = size;
	}
	public static class ByReference extends AVBufferRef implements Structure.ByReference {
		ByReference(){
			super();
		}
	};
	public static class ByValue extends AVBufferRef implements Structure.ByValue {
		ByValue(){
			super();
		}
	};
}
