package com.yanwang.iflyjava;

import com.sun.jna.Library;

public interface Msp_typeLibrary {
	/*public static final String JNA_LIBRARY_NAME = "msptype";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(MsptypeLibrary.JNA_LIBRARY_NAME);
	public static final MsptypeLibrary INSTANCE = (MsptypeLibrary)Native.loadLibrary(MsptypeLibrary.JNA_LIBRARY_NAME, MsptypeLibrary.class);*/
	public static final int MSP_AUDIO_SAMPLE_INIT = 0x00;
	public static final int MSP_AUDIO_SAMPLE_FIRST = 0x01;
	public static final int MSP_AUDIO_SAMPLE_CONTINUE = 0x02;
	public static final int MSP_AUDIO_SAMPLE_LAST = 0x04;
	public static final int MSP_REC_STATUS_SUCCESS = 0;
	public static final int MSP_REC_STATUS_NO_MATCH = 1;
	public static final int MSP_REC_STATUS_INCOMPLETE = 2;
	public static final int MSP_REC_STATUS_NON_SPEECH_DETECTED = 3;
	public static final int MSP_REC_STATUS_SPEECH_DETECTED = 4;
	public static final int MSP_REC_STATUS_COMPLETE = 5;
	public static final int MSP_REC_STATUS_MAX_CPU_TIME = 6;
	public static final int MSP_REC_STATUS_MAX_SPEECH = 7;
	public static final int MSP_REC_STATUS_STOPPED = 8;
	public static final int MSP_REC_STATUS_REJECTED = 9;
	public static final int MSP_REC_STATUS_NO_SPEECH_FOUND = 10;
	public static final int MSP_REC_STATUS_FAILURE = (int)Msp_typeLibrary.MSP_REC_STATUS_NO_MATCH;
	public static final int MSP_EP_LOOKING_FOR_SPEECH = 0;
	public static final int MSP_EP_IN_SPEECH = 1;
	public static final int MSP_EP_AFTER_SPEECH = 3;
	public static final int MSP_EP_TIMEOUT = 4;
	public static final int MSP_EP_ERROR = 5;
	public static final int MSP_EP_MAX_SPEECH = 6;
	public static final int MSP_EP_IDLE = 7;
	public static final int MSP_TTS_FLAG_STILL_HAVE_DATA = 1;
	public static final int MSP_TTS_FLAG_DATA_END = 2;
	public static final int MSP_TTS_FLAG_CMD_CANCELED = 4;
}
