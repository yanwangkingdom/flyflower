/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechObjectTokenCategory extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechObjectTokenCategory";

	public ISpeechObjectTokenCategory() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechObjectTokenCategory(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechObjectTokenCategory(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getId() {
		return Dispatch.get(this, "Id").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param p_default an input-parameter of type String
	 */
	public void setDefault(String p_default) {
		Dispatch.put(this, "Default", p_default);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getDefault() {
		return Dispatch.get(this, "Default").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param id an input-parameter of type String
	 * @param createIfNotExist an input-parameter of type boolean
	 */
	public void setId(String id, boolean createIfNotExist) {
		Dispatch.call(this, "SetId", id, new Variant(createIfNotExist));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param id an input-parameter of type String
	 */
	public void setId(String id) {
		Dispatch.call(this, "SetId", id);
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param location an input-parameter of type int
	 * @return the result is of type ISpeechDataKey
	 */
	public ISpeechDataKey getDataKey(int location) {
		return new ISpeechDataKey(Dispatch.call(this, "GetDataKey", new Variant(location)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechDataKey
	 */
	public ISpeechDataKey getDataKey() {
		return new ISpeechDataKey(Dispatch.call(this, "GetDataKey").toDispatch());
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requiredAttributes an input-parameter of type String
	 * @param optionalAttributes an input-parameter of type String
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens enumerateTokens(String requiredAttributes, String optionalAttributes) {
		return new ISpeechObjectTokens(Dispatch.call(this, "EnumerateTokens", requiredAttributes, optionalAttributes).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requiredAttributes an input-parameter of type String
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens enumerateTokens(String requiredAttributes) {
		return new ISpeechObjectTokens(Dispatch.call(this, "EnumerateTokens", requiredAttributes).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens enumerateTokens() {
		return new ISpeechObjectTokens(Dispatch.call(this, "EnumerateTokens").toDispatch());
	}

	

}
