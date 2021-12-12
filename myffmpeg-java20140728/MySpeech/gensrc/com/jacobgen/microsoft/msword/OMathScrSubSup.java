/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OMathScrSubSup extends Dispatch {

	public static final String componentName = "Word.OMathScrSubSup";

	public OMathScrSubSup() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OMathScrSubSup(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OMathScrSubSup(String compName) {
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
	 * @return the result is of type boolean
	 */
	public boolean getAlignScripts() {
		return Dispatch.get(this, "AlignScripts").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param alignScripts an input-parameter of type boolean
	 */
	public void setAlignScripts(boolean alignScripts) {
		Dispatch.put(this, "AlignScripts", new Variant(alignScripts));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathFunction
	 */
	public OMathFunction removeSub() {
		return new OMathFunction(Dispatch.call(this, "RemoveSub").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathFunction
	 */
	public OMathFunction removeSup() {
		return new OMathFunction(Dispatch.call(this, "RemoveSup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathFunction
	 */
	public OMathFunction toScrPre() {
		return new OMathFunction(Dispatch.call(this, "ToScrPre").toDispatch());
	}

}
