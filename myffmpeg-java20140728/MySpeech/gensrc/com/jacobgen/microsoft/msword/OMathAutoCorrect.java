/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OMathAutoCorrect extends Dispatch {

	public static final String componentName = "Word.OMathAutoCorrect";

	public OMathAutoCorrect() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OMathAutoCorrect(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OMathAutoCorrect(String compName) {
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
	public boolean getReplaceText() {
		return Dispatch.get(this, "ReplaceText").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param replaceText an input-parameter of type boolean
	 */
	public void setReplaceText(boolean replaceText) {
		Dispatch.put(this, "ReplaceText", new Variant(replaceText));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getUseOutsideOMath() {
		return Dispatch.get(this, "UseOutsideOMath").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param useOutsideOMath an input-parameter of type boolean
	 */
	public void setUseOutsideOMath(boolean useOutsideOMath) {
		Dispatch.put(this, "UseOutsideOMath", new Variant(useOutsideOMath));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathAutoCorrectEntries
	 */
	public OMathAutoCorrectEntries getEntries() {
		return new OMathAutoCorrectEntries(Dispatch.get(this, "Entries").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathRecognizedFunctions
	 */
	public OMathRecognizedFunctions getFunctions() {
		return new OMathRecognizedFunctions(Dispatch.get(this, "Functions").toDispatch());
	}

}
