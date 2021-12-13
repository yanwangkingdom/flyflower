/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechAudioFormat extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechAudioFormat";

	public ISpeechAudioFormat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechAudioFormat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechAudioFormat(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getType() {
		return Dispatch.get(this, "Type").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 */
	public void setType(int type) {
		Dispatch.put(this, "Type", new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getGuid() {
		return Dispatch.get(this, "Guid").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param guid an input-parameter of type String
	 */
	public void setGuid(String guid) {
		Dispatch.put(this, "Guid", guid);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechWaveFormatEx
	 */
	public ISpeechWaveFormatEx getWaveFormatEx() {
		return new ISpeechWaveFormatEx(Dispatch.call(this, "GetWaveFormatEx").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param speechWaveFormatEx an input-parameter of type ISpeechWaveFormatEx
	 */
	public void setWaveFormatEx(ISpeechWaveFormatEx speechWaveFormatEx) {
		Dispatch.call(this, "SetWaveFormatEx", speechWaveFormatEx);
	}

}
