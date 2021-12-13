/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class XSLTransforms extends Dispatch {

	public static final String componentName = "Word.XSLTransforms";

	public XSLTransforms() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public XSLTransforms(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public XSLTransforms(String compName) {
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
	 * @return the result is of type XSLTransform
	 */
	public XSLTransform item(Variant index) {
		return new XSLTransform(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param location an input-parameter of type String
	 * @param alias an input-parameter of type Variant
	 * @param installForAllUsers an input-parameter of type boolean
	 * @return the result is of type XSLTransform
	 */
	public XSLTransform add(String location, Variant alias, boolean installForAllUsers) {
		return new XSLTransform(Dispatch.call(this, "Add", location, alias, new Variant(installForAllUsers)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param location an input-parameter of type String
	 * @param alias an input-parameter of type Variant
	 * @return the result is of type XSLTransform
	 */
	public XSLTransform add(String location, Variant alias) {
		return new XSLTransform(Dispatch.call(this, "Add", location, alias).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param location an input-parameter of type String
	 * @return the result is of type XSLTransform
	 */
	public XSLTransform add(String location) {
		return new XSLTransform(Dispatch.call(this, "Add", location).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param location an input-parameter of type String
	 * @param alias an input-parameter of type Variant
	 * @param installForAllUsers an input-parameter of type boolean
	 * @return the result is of type XSLTransform
	 */
	public XSLTransform add(String location, Variant alias, boolean installForAllUsers) {
		XSLTransform result_of_Add = new XSLTransform(Dispatch.call(this, "Add", location, alias, new Variant(installForAllUsers)).toDispatch());


		return result_of_Add;
	}

}
