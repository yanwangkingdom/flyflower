/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OMathBorderBox extends Dispatch {

	public static final String componentName = "Word.OMathBorderBox";

	public OMathBorderBox() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OMathBorderBox(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OMathBorderBox(String compName) {
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
	 * @return the result is of type boolean
	 */
	public boolean getHideTop() {
		return Dispatch.get(this, "HideTop").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hideTop an input-parameter of type boolean
	 */
	public void setHideTop(boolean hideTop) {
		Dispatch.put(this, "HideTop", new Variant(hideTop));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHideBot() {
		return Dispatch.get(this, "HideBot").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hideBot an input-parameter of type boolean
	 */
	public void setHideBot(boolean hideBot) {
		Dispatch.put(this, "HideBot", new Variant(hideBot));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHideLeft() {
		return Dispatch.get(this, "HideLeft").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hideLeft an input-parameter of type boolean
	 */
	public void setHideLeft(boolean hideLeft) {
		Dispatch.put(this, "HideLeft", new Variant(hideLeft));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHideRight() {
		return Dispatch.get(this, "HideRight").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hideRight an input-parameter of type boolean
	 */
	public void setHideRight(boolean hideRight) {
		Dispatch.put(this, "HideRight", new Variant(hideRight));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getStrikeH() {
		return Dispatch.get(this, "StrikeH").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param strikeH an input-parameter of type boolean
	 */
	public void setStrikeH(boolean strikeH) {
		Dispatch.put(this, "StrikeH", new Variant(strikeH));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getStrikeV() {
		return Dispatch.get(this, "StrikeV").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param strikeV an input-parameter of type boolean
	 */
	public void setStrikeV(boolean strikeV) {
		Dispatch.put(this, "StrikeV", new Variant(strikeV));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getStrikeBLTR() {
		return Dispatch.get(this, "StrikeBLTR").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param strikeBLTR an input-parameter of type boolean
	 */
	public void setStrikeBLTR(boolean strikeBLTR) {
		Dispatch.put(this, "StrikeBLTR", new Variant(strikeBLTR));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getStrikeTLBR() {
		return Dispatch.get(this, "StrikeTLBR").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param strikeTLBR an input-parameter of type boolean
	 */
	public void setStrikeTLBR(boolean strikeTLBR) {
		Dispatch.put(this, "StrikeTLBR", new Variant(strikeTLBR));
	}

}
