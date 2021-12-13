/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class XMLNamespace extends Dispatch {

	public static final String componentName = "Word.XMLNamespace";

	public XMLNamespace() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public XMLNamespace(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public XMLNamespace(String compName) {
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
	 * @return the result is of type String
	 */
	public String getURI() {
		return Dispatch.get(this, "URI").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allUsers an input-parameter of type boolean
	 * @return the result is of type String
	 */
	public String getLocation(boolean allUsers) {
		return Dispatch.call(this, "Location", new Variant(allUsers)).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getLocation() {
		return Dispatch.get(this, "Location").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param allUsers an input-parameter of type boolean
	 * @return the result is of type String
	 */
	public String getLocation(boolean allUsers) {
		String result_of_Location = Dispatch.call(this, "Location", new Variant(allUsers)).toString();


		return result_of_Location;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allUsers an input-parameter of type boolean
	 */
	public void setLocation(boolean allUsers) {
		Dispatch.put(this, "Location", new Variant(allUsers));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void setLocation() {
		Dispatch.call(this, "Location");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param allUsers an input-parameter of type boolean
	 */
	public void setLocation(boolean allUsers) {
		Dispatch.put(this, "Location", new Variant(allUsers));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allUsers an input-parameter of type boolean
	 * @return the result is of type String
	 */
	public String getAlias(boolean allUsers) {
		return Dispatch.call(this, "Alias", new Variant(allUsers)).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getAlias() {
		return Dispatch.get(this, "Alias").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param allUsers an input-parameter of type boolean
	 * @return the result is of type String
	 */
	public String getAlias(boolean allUsers) {
		String result_of_Alias = Dispatch.call(this, "Alias", new Variant(allUsers)).toString();


		return result_of_Alias;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allUsers an input-parameter of type boolean
	 */
	public void setAlias(boolean allUsers) {
		Dispatch.put(this, "Alias", new Variant(allUsers));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void setAlias() {
		Dispatch.call(this, "Alias");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param allUsers an input-parameter of type boolean
	 */
	public void setAlias(boolean allUsers) {
		Dispatch.put(this, "Alias", new Variant(allUsers));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XSLTransforms
	 */
	public XSLTransforms getXSLTransforms() {
		return new XSLTransforms(Dispatch.get(this, "XSLTransforms").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allUsers an input-parameter of type boolean
	 * @return the result is of type XSLTransform
	 */
	public XSLTransform getDefaultTransform(boolean allUsers) {
		return new XSLTransform(Dispatch.call(this, "DefaultTransform", new Variant(allUsers)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XSLTransform
	 */
	public XSLTransform getDefaultTransform() {
		return new XSLTransform(Dispatch.get(this, "DefaultTransform").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param allUsers an input-parameter of type boolean
	 * @return the result is of type XSLTransform
	 */
	public XSLTransform getDefaultTransform(boolean allUsers) {
		XSLTransform result_of_DefaultTransform = new XSLTransform(Dispatch.call(this, "DefaultTransform", new Variant(allUsers)).toDispatch());


		return result_of_DefaultTransform;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allUsers an input-parameter of type boolean
	 */
	public void setDefaultTransform(boolean allUsers) {
		Dispatch.put(this, "DefaultTransform", new Variant(allUsers));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void setDefaultTransform() {
		Dispatch.call(this, "DefaultTransform");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param allUsers an input-parameter of type boolean
	 */
	public void setDefaultTransform(boolean allUsers) {
		Dispatch.put(this, "DefaultTransform", new Variant(allUsers));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param document an input-parameter of type Variant
	 */
	public void attachToDocument(Variant document) {
		Dispatch.call(this, "AttachToDocument", document);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

}
