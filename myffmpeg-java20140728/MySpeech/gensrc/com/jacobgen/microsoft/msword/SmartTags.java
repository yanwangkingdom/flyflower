/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class SmartTags extends Dispatch {

	public static final String componentName = "Word.SmartTags";

	public SmartTags() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public SmartTags(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public SmartTags(String compName) {
		super(compName);
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
	 * @return the result is of type int
	 */
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
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
	 * @param index an input-parameter of type Variant
	 * @return the result is of type SmartTag
	 */
	public SmartTag item(Variant index) {
		return new SmartTag(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param range an input-parameter of type Variant
	 * @param properties an input-parameter of type Variant
	 * @return the result is of type SmartTag
	 */
	public SmartTag add(String name, Variant range, Variant properties) {
		return new SmartTag(Dispatch.call(this, "Add", name, range, properties).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param range an input-parameter of type Variant
	 * @return the result is of type SmartTag
	 */
	public SmartTag add(String name, Variant range) {
		return new SmartTag(Dispatch.call(this, "Add", name, range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @return the result is of type SmartTag
	 */
	public SmartTag add(String name) {
		return new SmartTag(Dispatch.call(this, "Add", name).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type String
	 * @param range an input-parameter of type Variant
	 * @param properties an input-parameter of type Variant
	 * @return the result is of type SmartTag
	 */
	public SmartTag add(String name, Variant range, Variant properties) {
		SmartTag result_of_Add = new SmartTag(Dispatch.call(this, "Add", name, range, properties).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @return the result is of type SmartTags
	 */
	public SmartTags smartTagsByType(String name) {
		return new SmartTags(Dispatch.call(this, "SmartTagsByType", name).toDispatch());
	}

}
