/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Dialog extends Dispatch {

	public static final String componentName = "Word.Dialog";

	public Dialog() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Dialog(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Dialog(String compName) {
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
	public int getDefaultTab() {
		return Dispatch.get(this, "DefaultTab").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultTab an input-parameter of type int
	 */
	public void setDefaultTab(int defaultTab) {
		Dispatch.put(this, "DefaultTab", new Variant(defaultTab));
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
	 * @param timeOut an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int show(Variant timeOut) {
		return Dispatch.call(this, "Show", timeOut).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int show() {
		return Dispatch.call(this, "Show").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param timeOut an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int show(Variant timeOut) {
		int result_of_Show = Dispatch.call(this, "Show", timeOut).changeType(Variant.VariantInt).getInt();


		return result_of_Show;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param timeOut an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int display(Variant timeOut) {
		return Dispatch.call(this, "Display", timeOut).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int display() {
		return Dispatch.call(this, "Display").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param timeOut an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int display(Variant timeOut) {
		int result_of_Display = Dispatch.call(this, "Display", timeOut).changeType(Variant.VariantInt).getInt();


		return result_of_Display;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void execute() {
		Dispatch.call(this, "Execute");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void update() {
		Dispatch.call(this, "Update");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getCommandName() {
		return Dispatch.get(this, "CommandName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCommandBarId() {
		return Dispatch.get(this, "CommandBarId").changeType(Variant.VariantInt).getInt();
	}

}
