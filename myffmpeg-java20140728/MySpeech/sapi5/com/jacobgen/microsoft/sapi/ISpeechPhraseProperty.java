/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechPhraseProperty extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechPhraseProperty";

	public ISpeechPhraseProperty() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechPhraseProperty(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechPhraseProperty(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getName() {
		return Dispatch.get(this, "Name").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getId() {
		return Dispatch.get(this, "Id").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getValue() {
		return Dispatch.get(this, "Value");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFirstElement() {
		return Dispatch.get(this, "FirstElement").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNumberOfElements() {
		return Dispatch.get(this, "NumberOfElements").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getEngineConfidence() {
		return Dispatch.get(this, "EngineConfidence").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getConfidence() {
		return Dispatch.get(this, "Confidence").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechPhraseProperty
	 */
	public ISpeechPhraseProperty getParent() {
		return new ISpeechPhraseProperty(Dispatch.get(this, "Parent").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechPhraseProperties
	 */
	public ISpeechPhraseProperties getChildren() {
		return new ISpeechPhraseProperties(Dispatch.get(this, "Children").toDispatch());
	}

}
