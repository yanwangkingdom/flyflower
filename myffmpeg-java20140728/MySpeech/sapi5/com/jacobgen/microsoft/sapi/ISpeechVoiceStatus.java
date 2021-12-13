/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechVoiceStatus extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechVoiceStatus";

	public ISpeechVoiceStatus() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechVoiceStatus(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechVoiceStatus(String compName) {
		super(compName);
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
	public int getLastStreamNumberQueued() {
		return Dispatch.get(this, "LastStreamNumberQueued").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLastHResult() {
		return Dispatch.get(this, "LastHResult").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRunningState() {
		return Dispatch.get(this, "RunningState").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getInputWordPosition() {
		return Dispatch.get(this, "InputWordPosition").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getInputWordLength() {
		return Dispatch.get(this, "InputWordLength").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getInputSentencePosition() {
		return Dispatch.get(this, "InputSentencePosition").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getInputSentenceLength() {
		return Dispatch.get(this, "InputSentenceLength").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getLastBookmark() {
		return Dispatch.get(this, "LastBookmark").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLastBookmarkId() {
		return Dispatch.get(this, "LastBookmarkId").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type short
	 */
	public short getPhonemeId() {
		return Dispatch.get(this, "PhonemeId").changeType(Variant.VariantShort).getShort();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type short
	 */
	public short getVisemeId() {
		return Dispatch.get(this, "VisemeId").changeType(Variant.VariantShort).getShort();
	}

}
