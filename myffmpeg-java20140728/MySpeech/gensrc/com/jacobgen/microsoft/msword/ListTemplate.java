/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ListTemplate extends Dispatch {

	public static final String componentName = "Word.ListTemplate";

	public ListTemplate() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ListTemplate(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ListTemplate(String compName) {
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
	public boolean getOutlineNumbered() {
		return Dispatch.get(this, "OutlineNumbered").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outlineNumbered an input-parameter of type boolean
	 */
	public void setOutlineNumbered(boolean outlineNumbered) {
		Dispatch.put(this, "OutlineNumbered", new Variant(outlineNumbered));
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
	 * @return the result is of type ListLevels
	 */
	public ListLevels getListLevels() {
		return new ListLevels(Dispatch.get(this, "ListLevels").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param level an input-parameter of type Variant
	 * @return the result is of type ListTemplate
	 */
	public ListTemplate convert(Variant level) {
		return new ListTemplate(Dispatch.call(this, "Convert", level).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ListTemplate
	 */
	public ListTemplate convert() {
		return new ListTemplate(Dispatch.call(this, "Convert").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param level an input-parameter of type Variant
	 * @return the result is of type ListTemplate
	 */
	public ListTemplate convert(Variant level) {
		ListTemplate result_of_Convert = new ListTemplate(Dispatch.call(this, "Convert", level).toDispatch());


		return result_of_Convert;
	}

}
