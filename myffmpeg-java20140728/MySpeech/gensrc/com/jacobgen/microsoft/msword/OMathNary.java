/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OMathNary extends Dispatch {

	public static final String componentName = "Word.OMathNary";

	public OMathNary() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OMathNary(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OMathNary(String compName) {
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
	public OMath getSub() {
		return new OMath(Dispatch.get(this, "Sub").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMath
	 */
	public OMath getSup() {
		return new OMath(Dispatch.get(this, "Sup").toDispatch());
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
	public boolean getGrow() {
		return Dispatch.get(this, "Grow").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param grow an input-parameter of type boolean
	 */
	public void setGrow(boolean grow) {
		Dispatch.put(this, "Grow", new Variant(grow));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSubSupLim() {
		return Dispatch.get(this, "SubSupLim").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param subSupLim an input-parameter of type boolean
	 */
	public void setSubSupLim(boolean subSupLim) {
		Dispatch.put(this, "SubSupLim", new Variant(subSupLim));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHideSub() {
		return Dispatch.get(this, "HideSub").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hideSub an input-parameter of type boolean
	 */
	public void setHideSub(boolean hideSub) {
		Dispatch.put(this, "HideSub", new Variant(hideSub));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHideSup() {
		return Dispatch.get(this, "HideSup").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hideSup an input-parameter of type boolean
	 */
	public void setHideSup(boolean hideSup) {
		Dispatch.put(this, "HideSup", new Variant(hideSup));
	}

}
