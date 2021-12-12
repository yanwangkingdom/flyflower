/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OMathPhantom extends Dispatch {

	public static final String componentName = "Word.OMathPhantom";

	public OMathPhantom() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OMathPhantom(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OMathPhantom(String compName) {
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
	public boolean getShow() {
		return Dispatch.get(this, "Show").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param show an input-parameter of type boolean
	 */
	public void setShow(boolean show) {
		Dispatch.put(this, "Show", new Variant(show));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getZeroWid() {
		return Dispatch.get(this, "ZeroWid").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param zeroWid an input-parameter of type boolean
	 */
	public void setZeroWid(boolean zeroWid) {
		Dispatch.put(this, "ZeroWid", new Variant(zeroWid));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getZeroAsc() {
		return Dispatch.get(this, "ZeroAsc").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param zeroAsc an input-parameter of type boolean
	 */
	public void setZeroAsc(boolean zeroAsc) {
		Dispatch.put(this, "ZeroAsc", new Variant(zeroAsc));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getZeroDesc() {
		return Dispatch.get(this, "ZeroDesc").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param zeroDesc an input-parameter of type boolean
	 */
	public void setZeroDesc(boolean zeroDesc) {
		Dispatch.put(this, "ZeroDesc", new Variant(zeroDesc));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getTransp() {
		return Dispatch.get(this, "Transp").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param transp an input-parameter of type boolean
	 */
	public void setTransp(boolean transp) {
		Dispatch.put(this, "Transp", new Variant(transp));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSmash() {
		return Dispatch.get(this, "Smash").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param smash an input-parameter of type boolean
	 */
	public void setSmash(boolean smash) {
		Dispatch.put(this, "Smash", new Variant(smash));
	}

}
