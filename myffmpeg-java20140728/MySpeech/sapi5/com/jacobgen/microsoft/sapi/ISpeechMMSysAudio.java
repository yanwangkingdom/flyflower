/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechMMSysAudio extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechMMSysAudio";

	public ISpeechMMSysAudio() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechMMSysAudio(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechMMSysAudio(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechAudioFormat
	 */
	public ISpeechAudioFormat getFormat() {
		return new ISpeechAudioFormat(Dispatch.get(this, "Format").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type ISpeechAudioFormat
	 */
	public void setFormat(ISpeechAudioFormat format) {
		Dispatch.put(this, "Format", format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param buffer an input-parameter of type Variant
	 * @param numberOfBytes an input-parameter of type int
	 * @return the result is of type int
	 */
	public int read(Variant buffer, int numberOfBytes) {
		return Dispatch.call(this, "Read", buffer, new Variant(numberOfBytes)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param buffer is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 * @param numberOfBytes an input-parameter of type int
	 * @return the result is of type int
	 */
	public int read(Variant[] buffer, int numberOfBytes) {
		Variant vnt_buffer = new Variant();
		if( buffer == null || buffer.length == 0 )
			vnt_buffer.putNoParam();
		else
			vnt_buffer = buffer[0];

		int result_of_Read = Dispatch.call(this, "Read", vnt_buffer, new Variant(numberOfBytes)).changeType(Variant.VariantInt).getInt();

		if( buffer != null && buffer.length > 0 )
			buffer[0] = vnt_buffer;

		return result_of_Read;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param buffer an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int write(Variant buffer) {
		return Dispatch.call(this, "Write", buffer).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param position an input-parameter of type Variant
	 * @param origin an input-parameter of type int
	 * @return the result is of type Variant
	 */
	public Variant seek(Variant position, int origin) {
		return Dispatch.call(this, "Seek", position, new Variant(origin));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param position an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant seek(Variant position) {
		return Dispatch.call(this, "Seek", position);
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechAudioStatus
	 */
	public ISpeechAudioStatus getStatus() {
		return new ISpeechAudioStatus(Dispatch.get(this, "Status").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechAudioBufferInfo
	 */
	public ISpeechAudioBufferInfo getBufferInfo() {
		return new ISpeechAudioBufferInfo(Dispatch.get(this, "BufferInfo").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechAudioFormat
	 */
	public ISpeechAudioFormat getDefaultFormat() {
		return new ISpeechAudioFormat(Dispatch.get(this, "DefaultFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getVolume() {
		return Dispatch.get(this, "Volume").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param volume an input-parameter of type int
	 */
	public void setVolume(int volume) {
		Dispatch.put(this, "Volume", new Variant(volume));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBufferNotifySize() {
		return Dispatch.get(this, "BufferNotifySize").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bufferNotifySize an input-parameter of type int
	 */
	public void setBufferNotifySize(int bufferNotifySize) {
		Dispatch.put(this, "BufferNotifySize", new Variant(bufferNotifySize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getEventHandle() {
		return Dispatch.get(this, "EventHandle").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param state an input-parameter of type int
	 */
	public void setState(int state) {
		Dispatch.call(this, "SetState", new Variant(state));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDeviceId() {
		return Dispatch.get(this, "DeviceId").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param deviceId an input-parameter of type int
	 */
	public void setDeviceId(int deviceId) {
		Dispatch.put(this, "DeviceId", new Variant(deviceId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLineId() {
		return Dispatch.get(this, "LineId").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lineId an input-parameter of type int
	 */
	public void setLineId(int lineId) {
		Dispatch.put(this, "LineId", new Variant(lineId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMMHandle() {
		return Dispatch.get(this, "MMHandle").changeType(Variant.VariantInt).getInt();
	}

}
