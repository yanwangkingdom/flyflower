/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechPhraseInfo extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechPhraseInfo";

	public ISpeechPhraseInfo() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechPhraseInfo(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechPhraseInfo(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLanguageId() {
		return Dispatch.get(this, "LanguageId").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getGrammarId() {
		return Dispatch.get(this, "GrammarId");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getStartTime() {
		return Dispatch.get(this, "StartTime");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getAudioStreamPosition() {
		return Dispatch.get(this, "AudioStreamPosition");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAudioSizeBytes() {
		return Dispatch.get(this, "AudioSizeBytes").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRetainedSizeBytes() {
		return Dispatch.get(this, "RetainedSizeBytes").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAudioSizeTime() {
		return Dispatch.get(this, "AudioSizeTime").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechPhraseRule
	 */
	public ISpeechPhraseRule getRule() {
		return new ISpeechPhraseRule(Dispatch.get(this, "Rule").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechPhraseProperties
	 */
	public ISpeechPhraseProperties getProperties() {
		return new ISpeechPhraseProperties(Dispatch.get(this, "Properties").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechPhraseElements
	 */
	public ISpeechPhraseElements getElements() {
		return new ISpeechPhraseElements(Dispatch.get(this, "Elements").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechPhraseReplacements
	 */
	public ISpeechPhraseReplacements getReplacements() {
		return new ISpeechPhraseReplacements(Dispatch.get(this, "Replacements").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getEngineId() {
		return Dispatch.get(this, "EngineId").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getEnginePrivateData() {
		return Dispatch.get(this, "EnginePrivateData");
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
	 * @param startElement an input-parameter of type int
	 * @param elements an input-parameter of type int
	 * @param useReplacements an input-parameter of type boolean
	 * @return the result is of type String
	 */
	public String getText(int startElement, int elements, boolean useReplacements) {
		return Dispatch.call(this, "GetText", new Variant(startElement), new Variant(elements), new Variant(useReplacements)).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startElement an input-parameter of type int
	 * @param elements an input-parameter of type int
	 * @return the result is of type String
	 */
	public String getText(int startElement, int elements) {
		return Dispatch.call(this, "GetText", new Variant(startElement), new Variant(elements)).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startElement an input-parameter of type int
	 * @return the result is of type String
	 */
	public String getText(int startElement) {
		return Dispatch.call(this, "GetText", new Variant(startElement)).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getText() {
		return Dispatch.call(this, "GetText").toString();
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startElement an input-parameter of type int
	 * @param elements an input-parameter of type int
	 * @param useReplacements an input-parameter of type boolean
	 * @return the result is of type int
	 */
	public int getDisplayAttributes(int startElement, int elements, boolean useReplacements) {
		return Dispatch.call(this, "GetDisplayAttributes", new Variant(startElement), new Variant(elements), new Variant(useReplacements)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startElement an input-parameter of type int
	 * @param elements an input-parameter of type int
	 * @return the result is of type int
	 */
	public int getDisplayAttributes(int startElement, int elements) {
		return Dispatch.call(this, "GetDisplayAttributes", new Variant(startElement), new Variant(elements)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startElement an input-parameter of type int
	 * @return the result is of type int
	 */
	public int getDisplayAttributes(int startElement) {
		return Dispatch.call(this, "GetDisplayAttributes", new Variant(startElement)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDisplayAttributes() {
		return Dispatch.call(this, "GetDisplayAttributes").changeType(Variant.VariantInt).getInt();
	}

	

}
