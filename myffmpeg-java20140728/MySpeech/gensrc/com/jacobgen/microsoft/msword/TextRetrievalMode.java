/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class TextRetrievalMode extends Dispatch {

	public static final String componentName = "Word.TextRetrievalMode";

	public TextRetrievalMode() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public TextRetrievalMode(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public TextRetrievalMode(String compName) {
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
	 * @return the result is of type int
	 */
	public int getViewType() {
		return Dispatch.get(this, "ViewType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param viewType an input-parameter of type int
	 */
	public void setViewType(int viewType) {
		Dispatch.put(this, "ViewType", new Variant(viewType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TextRetrievalMode
	 */
	public TextRetrievalMode getDuplicate() {
		return new TextRetrievalMode(Dispatch.get(this, "Duplicate").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIncludeHiddenText() {
		return Dispatch.get(this, "IncludeHiddenText").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param includeHiddenText an input-parameter of type boolean
	 */
	public void setIncludeHiddenText(boolean includeHiddenText) {
		Dispatch.put(this, "IncludeHiddenText", new Variant(includeHiddenText));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIncludeFieldCodes() {
		return Dispatch.get(this, "IncludeFieldCodes").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param includeFieldCodes an input-parameter of type boolean
	 */
	public void setIncludeFieldCodes(boolean includeFieldCodes) {
		Dispatch.put(this, "IncludeFieldCodes", new Variant(includeFieldCodes));
	}

}
