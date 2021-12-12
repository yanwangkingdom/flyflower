/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class FormField extends Dispatch {

	public static final String componentName = "Word.FormField";

	public FormField() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public FormField(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public FormField(String compName) {
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
	public int getType() {
		return Dispatch.get(this, "Type").changeType(Variant.VariantInt).getInt();
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
	 * @param name an input-parameter of type String
	 */
	public void setName(String name) {
		Dispatch.put(this, "Name", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getEntryMacro() {
		return Dispatch.get(this, "EntryMacro").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param entryMacro an input-parameter of type String
	 */
	public void setEntryMacro(String entryMacro) {
		Dispatch.put(this, "EntryMacro", entryMacro);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getExitMacro() {
		return Dispatch.get(this, "ExitMacro").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param exitMacro an input-parameter of type String
	 */
	public void setExitMacro(String exitMacro) {
		Dispatch.put(this, "ExitMacro", exitMacro);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getOwnHelp() {
		return Dispatch.get(this, "OwnHelp").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param ownHelp an input-parameter of type boolean
	 */
	public void setOwnHelp(boolean ownHelp) {
		Dispatch.put(this, "OwnHelp", new Variant(ownHelp));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getOwnStatus() {
		return Dispatch.get(this, "OwnStatus").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param ownStatus an input-parameter of type boolean
	 */
	public void setOwnStatus(boolean ownStatus) {
		Dispatch.put(this, "OwnStatus", new Variant(ownStatus));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getHelpText() {
		return Dispatch.get(this, "HelpText").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param helpText an input-parameter of type String
	 */
	public void setHelpText(String helpText) {
		Dispatch.put(this, "HelpText", helpText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getStatusText() {
		return Dispatch.get(this, "StatusText").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param statusText an input-parameter of type String
	 */
	public void setStatusText(String statusText) {
		Dispatch.put(this, "StatusText", statusText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getEnabled() {
		return Dispatch.get(this, "Enabled").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param enabled an input-parameter of type boolean
	 */
	public void setEnabled(boolean enabled) {
		Dispatch.put(this, "Enabled", new Variant(enabled));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getResult() {
		return Dispatch.get(this, "Result").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param result an input-parameter of type String
	 */
	public void setResult(String result) {
		Dispatch.put(this, "Result", result);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TextInput
	 */
	public TextInput getTextInput() {
		return new TextInput(Dispatch.get(this, "TextInput").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type CheckBox
	 */
	public CheckBox getCheckBox() {
		return new CheckBox(Dispatch.get(this, "CheckBox").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DropDown
	 */
	public DropDown getDropDown() {
		return new DropDown(Dispatch.get(this, "DropDown").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FormField
	 */
	public FormField getNext() {
		return new FormField(Dispatch.get(this, "Next").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FormField
	 */
	public FormField getPrevious() {
		return new FormField(Dispatch.get(this, "Previous").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCalculateOnExit() {
		return Dispatch.get(this, "CalculateOnExit").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param calculateOnExit an input-parameter of type boolean
	 */
	public void setCalculateOnExit(boolean calculateOnExit) {
		Dispatch.put(this, "CalculateOnExit", new Variant(calculateOnExit));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range getRange() {
		return new Range(Dispatch.get(this, "Range").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void select() {
		Dispatch.call(this, "Select");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void copy() {
		Dispatch.call(this, "Copy");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void cut() {
		Dispatch.call(this, "Cut");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

}
