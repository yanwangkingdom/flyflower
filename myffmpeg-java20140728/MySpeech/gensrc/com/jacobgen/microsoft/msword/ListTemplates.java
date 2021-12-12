/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ListTemplates extends Dispatch {

	public static final String componentName = "Word.ListTemplates";

	public ListTemplates() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ListTemplates(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ListTemplates(String compName) {
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
	 * @return the result is of type ListTemplate
	 */
	public ListTemplate item(Variant index) {
		return new ListTemplate(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outlineNumbered an input-parameter of type Variant
	 * @param name an input-parameter of type Variant
	 * @return the result is of type ListTemplate
	 */
	public ListTemplate add(Variant outlineNumbered, Variant name) {
		return new ListTemplate(Dispatch.call(this, "Add", outlineNumbered, name).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outlineNumbered an input-parameter of type Variant
	 * @return the result is of type ListTemplate
	 */
	public ListTemplate add(Variant outlineNumbered) {
		return new ListTemplate(Dispatch.call(this, "Add", outlineNumbered).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ListTemplate
	 */
	public ListTemplate add() {
		return new ListTemplate(Dispatch.call(this, "Add").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param outlineNumbered an input-parameter of type Variant
	 * @param name an input-parameter of type Variant
	 * @return the result is of type ListTemplate
	 */
	public ListTemplate add(Variant outlineNumbered, Variant name) {
		ListTemplate result_of_Add = new ListTemplate(Dispatch.call(this, "Add", outlineNumbered, name).toDispatch());


		return result_of_Add;
	}

}
