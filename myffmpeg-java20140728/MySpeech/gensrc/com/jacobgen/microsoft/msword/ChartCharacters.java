/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ChartCharacters extends Dispatch {

	public static final String componentName = "Word.ChartCharacters";

	public ChartCharacters() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ChartCharacters(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ChartCharacters(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getParent() {
		return Dispatch.get(this, "Parent");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getCaption() {
		return Dispatch.get(this, "Caption").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param caption an input-parameter of type String
	 */
	public void setCaption(String caption) {
		Dispatch.put(this, "Caption", caption);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant delete() {
		return Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartFont
	 */
	public ChartFont getFont() {
		return new ChartFont(Dispatch.get(this, "Font").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param string an input-parameter of type String
	 * @return the result is of type Variant
	 */
	public Variant insert(String string) {
		return Dispatch.call(this, "Insert", string);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getText() {
		return Dispatch.get(this, "Text").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 */
	public void setText(String text) {
		Dispatch.put(this, "Text", text);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getPhoneticCharacters() {
		return Dispatch.get(this, "PhoneticCharacters").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param phoneticCharacters an input-parameter of type String
	 */
	public void setPhoneticCharacters(String phoneticCharacters) {
		Dispatch.put(this, "PhoneticCharacters", phoneticCharacters);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getApplication() {
		return Dispatch.get(this, "Application");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCreator() {
		return Dispatch.get(this, "Creator").changeType(Variant.VariantInt).getInt();
	}

}
