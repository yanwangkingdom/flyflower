/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OMathGroupChar extends Dispatch {

	public static final String componentName = "Word.OMathGroupChar";

	public OMathGroupChar() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OMathGroupChar(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OMathGroupChar(String compName) {
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
	 * @return the result is of type OMath
	 */
	public OMath getE() {
		return new OMath(Dispatch.get(this, "E").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type short
	 */
	public short getChar() {
		return Dispatch.get(this, "Char").changeType(Variant.VariantShort).getShort();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param char an input-parameter of type short
	 */
	public void setChar(short char) {
		Dispatch.put(this, "Char", new Variant(char));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCharTop() {
		return Dispatch.get(this, "CharTop").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param charTop an input-parameter of type boolean
	 */
	public void setCharTop(boolean charTop) {
		Dispatch.put(this, "CharTop", new Variant(charTop));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAlignTop() {
		return Dispatch.get(this, "AlignTop").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param alignTop an input-parameter of type boolean
	 */
	public void setAlignTop(boolean alignTop) {
		Dispatch.put(this, "AlignTop", new Variant(alignTop));
	}

}
