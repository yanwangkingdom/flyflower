/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechWaveFormatEx extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechWaveFormatEx";

	public ISpeechWaveFormatEx() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechWaveFormatEx(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechWaveFormatEx(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type short
	 */
	public short getFormatTag() {
		return Dispatch.get(this, "FormatTag").changeType(Variant.VariantShort).getShort();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formatTag an input-parameter of type short
	 */
	public void setFormatTag(short formatTag) {
		Dispatch.put(this, "FormatTag", new Variant(formatTag));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type short
	 */
	public short getChannels() {
		return Dispatch.get(this, "Channels").changeType(Variant.VariantShort).getShort();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param channels an input-parameter of type short
	 */
	public void setChannels(short channels) {
		Dispatch.put(this, "Channels", new Variant(channels));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSamplesPerSec() {
		return Dispatch.get(this, "SamplesPerSec").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param samplesPerSec an input-parameter of type int
	 */
	public void setSamplesPerSec(int samplesPerSec) {
		Dispatch.put(this, "SamplesPerSec", new Variant(samplesPerSec));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAvgBytesPerSec() {
		return Dispatch.get(this, "AvgBytesPerSec").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param avgBytesPerSec an input-parameter of type int
	 */
	public void setAvgBytesPerSec(int avgBytesPerSec) {
		Dispatch.put(this, "AvgBytesPerSec", new Variant(avgBytesPerSec));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type short
	 */
	public short getBlockAlign() {
		return Dispatch.get(this, "BlockAlign").changeType(Variant.VariantShort).getShort();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param blockAlign an input-parameter of type short
	 */
	public void setBlockAlign(short blockAlign) {
		Dispatch.put(this, "BlockAlign", new Variant(blockAlign));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type short
	 */
	public short getBitsPerSample() {
		return Dispatch.get(this, "BitsPerSample").changeType(Variant.VariantShort).getShort();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bitsPerSample an input-parameter of type short
	 */
	public void setBitsPerSample(short bitsPerSample) {
		Dispatch.put(this, "BitsPerSample", new Variant(bitsPerSample));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getExtraData() {
		return Dispatch.get(this, "ExtraData");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param extraData an input-parameter of type Variant
	 */
	public void setExtraData(Variant extraData) {
		Dispatch.put(this, "ExtraData", extraData);
	}

}
