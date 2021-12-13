/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechPhoneConverter extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechPhoneConverter";

	public ISpeechPhoneConverter() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechPhoneConverter(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechPhoneConverter(String compName) {
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
	 * @param languageId an input-parameter of type int
	 */
	public void setLanguageId(int languageId) {
		Dispatch.put(this, "LanguageId", new Variant(languageId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param phonemes an input-parameter of type String
	 * @return the result is of type Variant
	 */
	public Variant phoneToId(String phonemes) {
		return Dispatch.call(this, "PhoneToId", phonemes);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param idArray an input-parameter of type Variant
	 * @return the result is of type String
	 */
	public String idToPhone(Variant idArray) {
		return Dispatch.call(this, "IdToPhone", idArray).toString();
	}

}
