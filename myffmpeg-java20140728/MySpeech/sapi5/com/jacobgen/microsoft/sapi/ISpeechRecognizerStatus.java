/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechRecognizerStatus extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechRecognizerStatus";

	public ISpeechRecognizerStatus() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechRecognizerStatus(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechRecognizerStatus(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechAudioStatus
	 */
	public ISpeechAudioStatus getAudioStatus() {
		return new ISpeechAudioStatus(Dispatch.get(this, "AudioStatus").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getCurrentStreamPosition() {
		return Dispatch.get(this, "CurrentStreamPosition");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCurrentStreamNumber() {
		return Dispatch.get(this, "CurrentStreamNumber").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNumberOfActiveRules() {
		return Dispatch.get(this, "NumberOfActiveRules").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getClsidEngine() {
		return Dispatch.get(this, "ClsidEngine").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getSupportedLanguages() {
		return Dispatch.get(this, "SupportedLanguages");
	}

}
