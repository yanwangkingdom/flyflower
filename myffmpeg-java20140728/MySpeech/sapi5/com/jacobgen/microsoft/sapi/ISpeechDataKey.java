/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechDataKey extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechDataKey";

	public ISpeechDataKey() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechDataKey(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechDataKey(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param valueName an input-parameter of type String
	 * @param value an input-parameter of type Variant
	 */
	public void setBinaryValue(String valueName, Variant value) {
		Dispatch.call(this, "SetBinaryValue", valueName, value);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param valueName an input-parameter of type String
	 * @return the result is of type Variant
	 */
	public Variant getBinaryValue(String valueName) {
		return Dispatch.call(this, "GetBinaryValue", valueName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param valueName an input-parameter of type String
	 * @param value an input-parameter of type String
	 */
	public void setStringValue(String valueName, String value) {
		Dispatch.call(this, "SetStringValue", valueName, value);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param valueName an input-parameter of type String
	 * @return the result is of type String
	 */
	public String getStringValue(String valueName) {
		return Dispatch.call(this, "GetStringValue", valueName).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param valueName an input-parameter of type String
	 * @param value an input-parameter of type int
	 */
	public void setLongValue(String valueName, int value) {
		Dispatch.call(this, "SetLongValue", valueName, new Variant(value));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param valueName an input-parameter of type String
	 * @return the result is of type int
	 */
	public int getLongValue(String valueName) {
		return Dispatch.call(this, "GetLongValue", valueName).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param subKeyName an input-parameter of type String
	 * @return the result is of type ISpeechDataKey
	 */
	public ISpeechDataKey openKey(String subKeyName) {
		return new ISpeechDataKey(Dispatch.call(this, "OpenKey", subKeyName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param subKeyName an input-parameter of type String
	 * @return the result is of type ISpeechDataKey
	 */
	public ISpeechDataKey createKey(String subKeyName) {
		return new ISpeechDataKey(Dispatch.call(this, "CreateKey", subKeyName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param subKeyName an input-parameter of type String
	 */
	public void deleteKey(String subKeyName) {
		Dispatch.call(this, "DeleteKey", subKeyName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param valueName an input-parameter of type String
	 */
	public void deleteValue(String valueName) {
		Dispatch.call(this, "DeleteValue", valueName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type String
	 */
	public String enumKeys(int index) {
		return Dispatch.call(this, "EnumKeys", new Variant(index)).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type String
	 */
	public String enumValues(int index) {
		return Dispatch.call(this, "EnumValues", new Variant(index)).toString();
	}

}
