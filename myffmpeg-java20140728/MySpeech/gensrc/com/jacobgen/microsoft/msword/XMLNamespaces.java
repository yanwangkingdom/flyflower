/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class XMLNamespaces extends Dispatch {

	public static final String componentName = "Word.XMLNamespaces";

	public XMLNamespaces() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public XMLNamespaces(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public XMLNamespaces(String compName) {
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
	 * @return the result is of type XMLNamespace
	 */
	public XMLNamespace item(Variant index) {
		return new XMLNamespace(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param path an input-parameter of type String
	 * @param namespaceURI an input-parameter of type Variant
	 * @param alias an input-parameter of type Variant
	 * @param installForAllUsers an input-parameter of type boolean
	 * @return the result is of type XMLNamespace
	 */
	public XMLNamespace add(String path, Variant namespaceURI, Variant alias, boolean installForAllUsers) {
		return new XMLNamespace(Dispatch.call(this, "Add", path, namespaceURI, alias, new Variant(installForAllUsers)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param path an input-parameter of type String
	 * @param namespaceURI an input-parameter of type Variant
	 * @param alias an input-parameter of type Variant
	 * @return the result is of type XMLNamespace
	 */
	public XMLNamespace add(String path, Variant namespaceURI, Variant alias) {
		return new XMLNamespace(Dispatch.call(this, "Add", path, namespaceURI, alias).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param path an input-parameter of type String
	 * @param namespaceURI an input-parameter of type Variant
	 * @return the result is of type XMLNamespace
	 */
	public XMLNamespace add(String path, Variant namespaceURI) {
		return new XMLNamespace(Dispatch.call(this, "Add", path, namespaceURI).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param path an input-parameter of type String
	 * @return the result is of type XMLNamespace
	 */
	public XMLNamespace add(String path) {
		return new XMLNamespace(Dispatch.call(this, "Add", path).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param path an input-parameter of type String
	 * @param namespaceURI an input-parameter of type Variant
	 * @param alias an input-parameter of type Variant
	 * @param installForAllUsers an input-parameter of type boolean
	 * @return the result is of type XMLNamespace
	 */
	public XMLNamespace add(String path, Variant namespaceURI, Variant alias, boolean installForAllUsers) {
		XMLNamespace result_of_Add = new XMLNamespace(Dispatch.call(this, "Add", path, namespaceURI, alias, new Variant(installForAllUsers)).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param path an input-parameter of type String
	 * @param installForAllUsers an input-parameter of type boolean
	 */
	public void installManifest(String path, boolean installForAllUsers) {
		Dispatch.call(this, "InstallManifest", path, new Variant(installForAllUsers));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param path an input-parameter of type String
	 */
	public void installManifest(String path) {
		Dispatch.call(this, "InstallManifest", path);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param path an input-parameter of type String
	 * @param installForAllUsers an input-parameter of type boolean
	 */
	public void installManifest(String path, boolean installForAllUsers) {
		Dispatch.call(this, "InstallManifest", path, new Variant(installForAllUsers));

	}

}
