/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class SmartTagAction extends Dispatch {

	public static final String componentName = "Word.SmartTagAction";

	public SmartTagAction() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public SmartTagAction(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public SmartTagAction(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getName() {
		return Dispatch.get(this, "Name").toString();
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
	 */
	public void execute() {
		Dispatch.call(this, "Execute");
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
	 * @return the result is of type boolean
	 */
	public boolean getPresentInPane() {
		return Dispatch.get(this, "PresentInPane").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getExpandHelp() {
		return Dispatch.get(this, "ExpandHelp").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param expandHelp an input-parameter of type boolean
	 */
	public void setExpandHelp(boolean expandHelp) {
		Dispatch.put(this, "ExpandHelp", new Variant(expandHelp));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCheckboxState() {
		return Dispatch.get(this, "CheckboxState").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param checkboxState an input-parameter of type boolean
	 */
	public void setCheckboxState(boolean checkboxState) {
		Dispatch.put(this, "CheckboxState", new Variant(checkboxState));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getTextboxText() {
		return Dispatch.get(this, "TextboxText").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textboxText an input-parameter of type String
	 */
	public void setTextboxText(String textboxText) {
		Dispatch.put(this, "TextboxText", textboxText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getListSelection() {
		return Dispatch.get(this, "ListSelection").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listSelection an input-parameter of type int
	 */
	public void setListSelection(int listSelection) {
		Dispatch.put(this, "ListSelection", new Variant(listSelection));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRadioGroupSelection() {
		return Dispatch.get(this, "RadioGroupSelection").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param radioGroupSelection an input-parameter of type int
	 */
	public void setRadioGroupSelection(int radioGroupSelection) {
		Dispatch.put(this, "RadioGroupSelection", new Variant(radioGroupSelection));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getExpandDocumentFragment() {
		return Dispatch.get(this, "ExpandDocumentFragment").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param expandDocumentFragment an input-parameter of type boolean
	 */
	public void setExpandDocumentFragment(boolean expandDocumentFragment) {
		Dispatch.put(this, "ExpandDocumentFragment", new Variant(expandDocumentFragment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getActiveXControl() {
		return Dispatch.get(this, "ActiveXControl");
	}

}
