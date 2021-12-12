/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class TextInput extends Dispatch {

	public static final String componentName = "Word.TextInput";

	public TextInput() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public TextInput(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public TextInput(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Application
	 */
	public Application getApplication() {
		return new Application(Dispatch.get(this, "Application").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCreator() {
		return Dispatch.get(this, "Creator").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type boolean
	 */
	public boolean getValid() {
		return Dispatch.get(this, "Valid").changeType(Variant.VariantBoolean).getBoolean();
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
	 * @param p_default an input-parameter of type String
	 */
	public void setDefault(String p_default) {
		Dispatch.put(this, "Default", p_default);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getType() {
		return Dispatch.get(this, "Type").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFormat() {
		return Dispatch.get(this, "Format").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getWidth() {
		return Dispatch.get(this, "Width").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param width an input-parameter of type int
	 */
	public void setWidth(int width) {
		Dispatch.put(this, "Width", new Variant(width));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clear() {
		Dispatch.call(this, "Clear");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param p_default an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param enabled an input-parameter of type Variant
	 */
	public void editType(int type, Variant p_default, Variant format, Variant enabled) {
		Dispatch.call(this, "EditType", new Variant(type), p_default, format, enabled);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param p_default an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 */
	public void editType(int type, Variant p_default, Variant format) {
		Dispatch.call(this, "EditType", new Variant(type), p_default, format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param p_default an input-parameter of type Variant
	 */
	public void editType(int type, Variant p_default) {
		Dispatch.call(this, "EditType", new Variant(type), p_default);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 */
	public void editType(int type) {
		Dispatch.call(this, "EditType", new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param type an input-parameter of type int
	 * @param p_default an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param enabled an input-parameter of type Variant
	 */
	public void editType(int type, Variant p_default, Variant format, Variant enabled) {
		Dispatch.call(this, "EditType", new Variant(type), p_default, format, enabled);

	}

}
