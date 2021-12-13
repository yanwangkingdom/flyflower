/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public interface SpeechRecoEvents {

	public static final int SREStreamEnd = 1;
	public static final int SRESoundStart = 2;
	public static final int SRESoundEnd = 4;
	public static final int SREPhraseStart = 8;
	public static final int SRERecognition = 16;
	public static final int SREHypothesis = 32;
	public static final int SREBookmark = 64;
	public static final int SREPropertyNumChange = 128;
	public static final int SREPropertyStringChange = 256;
	public static final int SREFalseRecognition = 512;
	public static final int SREInterference = 1024;
	public static final int SRERequestUI = 2048;
	public static final int SREStateChange = 4096;
	public static final int SREAdaptation = 8192;
	public static final int SREStreamStart = 16384;
	public static final int SRERecoOtherContext = 32768;
	public static final int SREAudioLevel = 65536;
	public static final int SREPrivate = 262144;
	public static final int SREAllEvents = 393215;
}
