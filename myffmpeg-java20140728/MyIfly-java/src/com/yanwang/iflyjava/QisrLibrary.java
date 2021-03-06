package com.yanwang.iflyjava;


import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.ptr.IntByReference;

import java.nio.IntBuffer;
/**
 * JNA Wrapper for library <b>qisr</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface QisrLibrary extends QTTSLibrary,Msp_cmnLibrary,Library {
	public static final String JNA_LIBRARY_NAME = "msc_x64";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(QisrLibrary.JNA_LIBRARY_NAME);
	public static final QisrLibrary INSTANCE = (QisrLibrary)Native.loadLibrary(QisrLibrary.JNA_LIBRARY_NAME, QisrLibrary.class);
	
	
	public interface Proc_QISRSessionBegin extends Callback {
		Pointer apply(Pointer grammarList, Pointer params, IntByReference result);
	};
	public interface Proc_QISRGrammarActivate extends Callback {
		int apply(Pointer sessionID, Pointer grammar, Pointer type, int weight);
	};
	public interface Proc_QISRAudioWrite extends Callback {
		int apply(Pointer sessionID, Pointer waveData, int waveLen, int audioStatus, IntByReference epStatus, IntByReference recogStatus);
	};
	public interface Proc_QISRGetResult extends Callback {
		Pointer apply(Pointer sessionID, IntByReference rsltStatus, int waitTime, IntByReference errorCode);
	};
	public interface Proc_QISRSessionEnd extends Callback {
		int apply(Pointer sessionID, Pointer hints);
	};
	public interface Proc_QISRGetParam extends Callback {
		int apply(Pointer sessionID, Pointer paramName, Pointer paramValue, IntByReference valueLen);
	};
	public interface Proc_QISRSetParam extends Callback {
		int apply(Pointer sessionID, Pointer paramName, Pointer paramValue);
	};
	public interface recog_result_ntf_handler extends Callback {
		void apply(Pointer sessionID, Pointer result, int resultLen, int resultStatus, Pointer userData);
	};
	public interface recog_status_ntf_handler extends Callback {
		void apply(Pointer sessionID, int type, int status, int param1, Pointer param2, Pointer userData);
	};
	public interface recog_error_ntf_handler extends Callback {
		void apply(Pointer sessionID, int errorCode, Pointer detail, Pointer userData);
	};
	
	String QISRSessionBegin(String grammarList, String params, IntByReference errorCode);
	
	int QISRGrammarActivate(String sessionID, byte[] grammar, String type, int weight);
	
	int QISRAudioWrite(String sessionID, byte[] waveData, int waveLen, int audioStatus, IntByReference epStatus, IntByReference recogStatus);
	
	String QISRGetResult(String sessionID, IntByReference rsltStatus, int waitTime, IntByReference errorCode);
	@Deprecated 
	int QISRSessionEnd(Pointer sessionID, Pointer hints);
	int QISRSessionEnd(String sessionID, String hints);
	
	int QISRGetParam(Pointer sessionID, Pointer paramName, Pointer paramValue, IntByReference valueLen);
	//int QISRGetParam(String sessionID, String paramName, ByteBuffer paramValue, IntBuffer valueLen);
	@Deprecated 
	int QISRSetParam(Pointer sessionID, Pointer paramName, Pointer paramValue);
	int QISRSetParam(String sessionID, String paramName, String paramValue);
	@Deprecated 
	int QISRRegisterNotify(Pointer sessionID, QisrLibrary.recog_result_ntf_handler rsltCb, QisrLibrary.recog_status_ntf_handler statusCb, QisrLibrary.recog_error_ntf_handler errCb, Pointer userData);
	int QISRRegisterNotify(String sessionID, QisrLibrary.recog_result_ntf_handler rsltCb, QisrLibrary.recog_status_ntf_handler statusCb, QisrLibrary.recog_error_ntf_handler errCb, Pointer userData);


}
