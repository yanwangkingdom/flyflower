/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Hyperlinks extends Dispatch {

	public static final String componentName = "Word.Hyperlinks";

	public Hyperlinks() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Hyperlinks(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Hyperlinks(String compName) {
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
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant get_NewEnum() {
		return Dispatch.get(this, "_NewEnum");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink item(Variant index) {
		return new Hyperlink(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param anchor an input-parameter of type Object
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink _Add(Object anchor, Variant address, Variant subAddress) {
		return new Hyperlink(Dispatch.call(this, "_Add", anchor, address, subAddress).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param anchor an input-parameter of type Object
	 * @param address an input-parameter of type Variant
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink _Add(Object anchor, Variant address) {
		return new Hyperlink(Dispatch.call(this, "_Add", anchor, address).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param anchor an input-parameter of type Object
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink _Add(Object anchor) {
		return new Hyperlink(Dispatch.call(this, "_Add", anchor).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param anchor an input-parameter of type Object
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink _Add(Object anchor, Variant address, Variant subAddress) {
		Hyperlink result_of__Add = new Hyperlink(Dispatch.call(this, "_Add", anchor, address, subAddress).toDispatch());


		return result_of__Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param anchor an input-parameter of type Object
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @param screenTip an input-parameter of type Variant
	 * @param textToDisplay an input-parameter of type Variant
	 * @param target an input-parameter of type Variant
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink add(Object anchor, Variant address, Variant subAddress, Variant screenTip, Variant textToDisplay, Variant target) {
		return new Hyperlink(Dispatch.call(this, "Add", anchor, address, subAddress, screenTip, textToDisplay, target).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param anchor an input-parameter of type Object
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @param screenTip an input-parameter of type Variant
	 * @param textToDisplay an input-parameter of type Variant
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink add(Object anchor, Variant address, Variant subAddress, Variant screenTip, Variant textToDisplay) {
		return new Hyperlink(Dispatch.call(this, "Add", anchor, address, subAddress, screenTip, textToDisplay).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param anchor an input-parameter of type Object
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @param screenTip an input-parameter of type Variant
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink add(Object anchor, Variant address, Variant subAddress, Variant screenTip) {
		return new Hyperlink(Dispatch.call(this, "Add", anchor, address, subAddress, screenTip).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param anchor an input-parameter of type Object
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink add(Object anchor, Variant address, Variant subAddress) {
		return new Hyperlink(Dispatch.call(this, "Add", anchor, address, subAddress).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param anchor an input-parameter of type Object
	 * @param address an input-parameter of type Variant
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink add(Object anchor, Variant address) {
		return new Hyperlink(Dispatch.call(this, "Add", anchor, address).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param anchor an input-parameter of type Object
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink add(Object anchor) {
		return new Hyperlink(Dispatch.call(this, "Add", anchor).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param anchor an input-parameter of type Object
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @param screenTip an input-parameter of type Variant
	 * @param textToDisplay an input-parameter of type Variant
	 * @param target an input-parameter of type Variant
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink add(Object anchor, Variant address, Variant subAddress, Variant screenTip, Variant textToDisplay, Variant target) {
		Hyperlink result_of_Add = new Hyperlink(Dispatch.call(this, "Add", anchor, address, subAddress, screenTip, textToDisplay, target).toDispatch());


		return result_of_Add;
	}

}
