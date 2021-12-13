/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechFileStream extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechFileStream";

	public ISpeechFileStream() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechFileStream(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechFileStream(String compName) {
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
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param position an input-parameter of type Variant
	 * @param origin an input-parameter of type int
	 * @return the result is of type Variant
	 */
	public Variant seek(Variant position, int origin) {
		Variant result_of_Seek = Dispatch.call(this, "Seek", position, new Variant(origin));


		return result_of_Seek;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param fileMode an input-parameter of type int
	 * @param doEvents an input-parameter of type boolean
	 */
	public void open(String fileName, int fileMode, boolean doEvents) {
		Dispatch.call(this, "Open", fileName, new Variant(fileMode), new Variant(doEvents));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param fileMode an input-parameter of type int
	 */
	public void open(String fileName, int fileMode) {
		Dispatch.call(this, "Open", fileName, new Variant(fileMode));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void open(String fileName) {
		Dispatch.call(this, "Open", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param fileMode an input-parameter of type int
	 * @param doEvents an input-parameter of type boolean
	 */
	public void open(String fileName, int fileMode, boolean doEvents) {
		Dispatch.call(this, "Open", fileName, new Variant(fileMode), new Variant(doEvents));

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void close() {
		Dispatch.call(this, "Close");
	}

}
