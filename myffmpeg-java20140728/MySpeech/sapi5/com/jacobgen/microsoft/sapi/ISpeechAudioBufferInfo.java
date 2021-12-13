/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechAudioBufferInfo extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechAudioBufferInfo";

	public ISpeechAudioBufferInfo() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechAudioBufferInfo(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechAudioBufferInfo(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMinNotification() {
		return Dispatch.get(this, "MinNotification").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param minNotification an input-parameter of type int
	 */
	public void setMinNotification(int minNotification) {
		Dispatch.put(this, "MinNotification", new Variant(minNotification));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBufferSize() {
		return Dispatch.get(this, "BufferSize").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bufferSize an input-parameter of type int
	 */
	public void setBufferSize(int bufferSize) {
		Dispatch.put(this, "BufferSize", new Variant(bufferSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getEventBias() {
		return Dispatch.get(this, "EventBias").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param eventBias an input-parameter of type int
	 */
	public void setEventBias(int eventBias) {
		Dispatch.put(this, "EventBias", new Variant(eventBias));
	}

}
