/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechRecoResult2 extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechRecoResult2";

	public ISpeechRecoResult2() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechRecoResult2(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechRecoResult2(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechRecoContext
	 */
	public ISpeechRecoContext getRecoContext() {
		return new ISpeechRecoContext(Dispatch.get(this, "RecoContext").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechRecoResultTimes
	 */
	public ISpeechRecoResultTimes getTimes() {
		return new ISpeechRecoResultTimes(Dispatch.get(this, "Times").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param audioFormat an input-parameter of type ISpeechAudioFormat
	 */
	public void setAudioFormat(ISpeechAudioFormat audioFormat) {
		Dispatch.put(this, "AudioFormat", audioFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechAudioFormat
	 */
	public ISpeechAudioFormat getAudioFormat() {
		return new ISpeechAudioFormat(Dispatch.get(this, "AudioFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechPhraseInfo
	 */
	public ISpeechPhraseInfo getPhraseInfo() {
		return new ISpeechPhraseInfo(Dispatch.get(this, "PhraseInfo").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requestCount an input-parameter of type int
	 * @param startElement an input-parameter of type int
	 * @param elements an input-parameter of type int
	 * @return the result is of type ISpeechPhraseAlternates
	 */
	public ISpeechPhraseAlternates alternates(int requestCount, int startElement, int elements) {
		return new ISpeechPhraseAlternates(Dispatch.call(this, "Alternates", new Variant(requestCount), new Variant(startElement), new Variant(elements)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requestCount an input-parameter of type int
	 * @param startElement an input-parameter of type int
	 * @return the result is of type ISpeechPhraseAlternates
	 */
	public ISpeechPhraseAlternates alternates(int requestCount, int startElement) {
		return new ISpeechPhraseAlternates(Dispatch.call(this, "Alternates", new Variant(requestCount), new Variant(startElement)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requestCount an input-parameter of type int
	 * @return the result is of type ISpeechPhraseAlternates
	 */
	public ISpeechPhraseAlternates alternates(int requestCount) {
		return new ISpeechPhraseAlternates(Dispatch.call(this, "Alternates", new Variant(requestCount)).toDispatch());
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startElement an input-parameter of type int
	 * @param elements an input-parameter of type int
	 * @return the result is of type ISpeechMemoryStream
	 */
	public ISpeechMemoryStream audio(int startElement, int elements) {
		return new ISpeechMemoryStream(Dispatch.call(this, "Audio", new Variant(startElement), new Variant(elements)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startElement an input-parameter of type int
	 * @return the result is of type ISpeechMemoryStream
	 */
	public ISpeechMemoryStream audio(int startElement) {
		return new ISpeechMemoryStream(Dispatch.call(this, "Audio", new Variant(startElement)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechMemoryStream
	 */
	public ISpeechMemoryStream audio() {
		return new ISpeechMemoryStream(Dispatch.call(this, "Audio").toDispatch());
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startElement an input-parameter of type int
	 * @param elements an input-parameter of type int
	 * @param flags an input-parameter of type int
	 * @return the result is of type int
	 */
	public int speakAudio(int startElement, int elements, int flags) {
		return Dispatch.call(this, "SpeakAudio", new Variant(startElement), new Variant(elements), new Variant(flags)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startElement an input-parameter of type int
	 * @param elements an input-parameter of type int
	 * @return the result is of type int
	 */
	public int speakAudio(int startElement, int elements) {
		return Dispatch.call(this, "SpeakAudio", new Variant(startElement), new Variant(elements)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startElement an input-parameter of type int
	 * @return the result is of type int
	 */
	public int speakAudio(int startElement) {
		return Dispatch.call(this, "SpeakAudio", new Variant(startElement)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int speakAudio() {
		return Dispatch.call(this, "SpeakAudio").changeType(Variant.VariantInt).getInt();
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant saveToMemory() {
		return Dispatch.call(this, "SaveToMemory");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param valueTypes an input-parameter of type int
	 */
	public void discardResultInfo(int valueTypes) {
		Dispatch.call(this, "DiscardResultInfo", new Variant(valueTypes));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param feedback an input-parameter of type String
	 * @param wasSuccessful an input-parameter of type boolean
	 */
	public void setTextFeedback(String feedback, boolean wasSuccessful) {
		Dispatch.call(this, "SetTextFeedback", feedback, new Variant(wasSuccessful));
	}

}
