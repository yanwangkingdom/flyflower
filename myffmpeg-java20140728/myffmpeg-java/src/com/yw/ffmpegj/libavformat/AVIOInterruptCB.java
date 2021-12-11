package com.yw.ffmpegj.libavformat;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class AVIOInterruptCB extends Structure {
	/** C type : callback_callback* */
	public AVIOInterruptCB.callback_callback callback;
	/** C type : void* */
	public Pointer opaque;
	public interface callback_callback extends Callback {
		int apply(Pointer voidPtr1);
	};
	public AVIOInterruptCB() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("callback", "opaque");
	}
	/**
	 * @param callback C type : callback_callback*<br>
	 * @param opaque C type : void*
	 */
	public AVIOInterruptCB(AVIOInterruptCB.callback_callback callback, Pointer opaque) {
		super();
		this.callback = callback;
		this.opaque = opaque;
	}
	public static class ByReference extends AVIOInterruptCB implements Structure.ByReference {
		 public ByReference()
	        {
			 super();
	        }
	};
	public static class ByValue extends AVIOInterruptCB implements Structure.ByValue {
		public ByValue()
		{
			super();
		}
	};
}

