/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechXMLRecoResult extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechXMLRecoResult";

	public ISpeechXMLRecoResult() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechXMLRecoResult(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechXMLRecoResult(String compName) {
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
	 * @param options an input-parameter of type int
	 * @return the result is of type String
	 */
	public String getXMLResult(int options) {
		return Dispatch.call(this, "GetXMLResult", new Variant(options)).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lineNumber an input-parameter of type int
	 * @param scriptLine an input-parameter of type String
	 * @param source an input-parameter of type String
	 * @param description an input-parameter of type String
	 * @param resultCode an input-parameter of type int
	 * @return the result is of type boolean
	 */
	public boolean getXMLErrorInfo(int lineNumber, String scriptLine, String source, String description, int resultCode) {
		return Dispatch.call(this, "GetXMLErrorInfo", new Variant(lineNumber), scriptLine, source, description, new Variant(resultCode)).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param lineNumber is an one-element array which sends the input-parameter
	 *                   to the ActiveX-Component and receives the output-parameter
	 * @param scriptLine is an one-element array which sends the input-parameter
	 *                   to the ActiveX-Component and receives the output-parameter
	 * @param source is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 * @param description is an one-element array which sends the input-parameter
	 *                    to the ActiveX-Component and receives the output-parameter
	 * @param resultCode is an one-element array which sends the input-parameter
	 *                   to the ActiveX-Component and receives the output-parameter
	 * @return the result is of type boolean
	 */
	public boolean getXMLErrorInfo(int[] lineNumber, String[] scriptLine, String[] source, String[] description, int[] resultCode) {
		Variant vnt_lineNumber = new Variant();
		if( lineNumber == null || lineNumber.length == 0 )
			vnt_lineNumber.putNoParam();
		else
			vnt_lineNumber.putIntRef(lineNumber[0]);

		Variant vnt_scriptLine = new Variant();
		if( scriptLine == null || scriptLine.length == 0 )
			vnt_scriptLine.putNoParam();
		else
			vnt_scriptLine.putStringRef(scriptLine[0]);

		Variant vnt_source = new Variant();
		if( source == null || source.length == 0 )
			vnt_source.putNoParam();
		else
			vnt_source.putStringRef(source[0]);

		Variant vnt_description = new Variant();
		if( description == null || description.length == 0 )
			vnt_description.putNoParam();
		else
			vnt_description.putStringRef(description[0]);

		Variant vnt_resultCode = new Variant();
		if( resultCode == null || resultCode.length == 0 )
			vnt_resultCode.putNoParam();
		else
			vnt_resultCode.putIntRef(resultCode[0]);

		boolean result_of_GetXMLErrorInfo = Dispatch.call(this, "GetXMLErrorInfo", vnt_lineNumber, vnt_scriptLine, vnt_source, vnt_description, vnt_resultCode).changeType(Variant.VariantBoolean).getBoolean();

		if( lineNumber != null && lineNumber.length > 0 )
			lineNumber[0] = vnt_lineNumber.toInt();
		if( scriptLine != null && scriptLine.length > 0 )
			scriptLine[0] = vnt_scriptLine.toString();
		if( source != null && source.length > 0 )
			source[0] = vnt_source.toString();
		if( description != null && description.length > 0 )
			description[0] = vnt_description.toString();
		if( resultCode != null && resultCode.length > 0 )
			resultCode[0] = vnt_resultCode.toInt();

		return result_of_GetXMLErrorInfo;
	}

}
