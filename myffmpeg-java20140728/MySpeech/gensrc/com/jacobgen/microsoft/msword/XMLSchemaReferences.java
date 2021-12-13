/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class XMLSchemaReferences extends Dispatch {

	public static final String componentName = "Word.XMLSchemaReferences";

	public XMLSchemaReferences() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public XMLSchemaReferences(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public XMLSchemaReferences(String compName) {
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
	 * @return the result is of type boolean
	 */
	public boolean getAutomaticValidation() {
		return Dispatch.get(this, "AutomaticValidation").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param automaticValidation an input-parameter of type boolean
	 */
	public void setAutomaticValidation(boolean automaticValidation) {
		Dispatch.put(this, "AutomaticValidation", new Variant(automaticValidation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAllowSaveAsXMLWithoutValidation() {
		return Dispatch.get(this, "AllowSaveAsXMLWithoutValidation").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allowSaveAsXMLWithoutValidation an input-parameter of type boolean
	 */
	public void setAllowSaveAsXMLWithoutValidation(boolean allowSaveAsXMLWithoutValidation) {
		Dispatch.put(this, "AllowSaveAsXMLWithoutValidation", new Variant(allowSaveAsXMLWithoutValidation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHideValidationErrors() {
		return Dispatch.get(this, "HideValidationErrors").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hideValidationErrors an input-parameter of type boolean
	 */
	public void setHideValidationErrors(boolean hideValidationErrors) {
		Dispatch.put(this, "HideValidationErrors", new Variant(hideValidationErrors));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIgnoreMixedContent() {
		return Dispatch.get(this, "IgnoreMixedContent").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param ignoreMixedContent an input-parameter of type boolean
	 */
	public void setIgnoreMixedContent(boolean ignoreMixedContent) {
		Dispatch.put(this, "IgnoreMixedContent", new Variant(ignoreMixedContent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowPlaceholderText() {
		return Dispatch.get(this, "ShowPlaceholderText").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showPlaceholderText an input-parameter of type boolean
	 */
	public void setShowPlaceholderText(boolean showPlaceholderText) {
		Dispatch.put(this, "ShowPlaceholderText", new Variant(showPlaceholderText));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type XMLSchemaReference
	 */
	public XMLSchemaReference item(Variant index) {
		return new XMLSchemaReference(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void validate() {
		Dispatch.call(this, "Validate");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param namespaceURI an input-parameter of type Variant
	 * @param alias an input-parameter of type Variant
	 * @param fileName an input-parameter of type Variant
	 * @param installForAllUsers an input-parameter of type boolean
	 * @return the result is of type XMLSchemaReference
	 */
	public XMLSchemaReference add(Variant namespaceURI, Variant alias, Variant fileName, boolean installForAllUsers) {
		return new XMLSchemaReference(Dispatch.call(this, "Add", namespaceURI, alias, fileName, new Variant(installForAllUsers)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param namespaceURI an input-parameter of type Variant
	 * @param alias an input-parameter of type Variant
	 * @param fileName an input-parameter of type Variant
	 * @return the result is of type XMLSchemaReference
	 */
	public XMLSchemaReference add(Variant namespaceURI, Variant alias, Variant fileName) {
		return new XMLSchemaReference(Dispatch.call(this, "Add", namespaceURI, alias, fileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param namespaceURI an input-parameter of type Variant
	 * @param alias an input-parameter of type Variant
	 * @return the result is of type XMLSchemaReference
	 */
	public XMLSchemaReference add(Variant namespaceURI, Variant alias) {
		return new XMLSchemaReference(Dispatch.call(this, "Add", namespaceURI, alias).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param namespaceURI an input-parameter of type Variant
	 * @return the result is of type XMLSchemaReference
	 */
	public XMLSchemaReference add(Variant namespaceURI) {
		return new XMLSchemaReference(Dispatch.call(this, "Add", namespaceURI).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLSchemaReference
	 */
	public XMLSchemaReference add() {
		return new XMLSchemaReference(Dispatch.call(this, "Add").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param namespaceURI an input-parameter of type Variant
	 * @param alias an input-parameter of type Variant
	 * @param fileName an input-parameter of type Variant
	 * @param installForAllUsers an input-parameter of type boolean
	 * @return the result is of type XMLSchemaReference
	 */
	public XMLSchemaReference add(Variant namespaceURI, Variant alias, Variant fileName, boolean installForAllUsers) {
		XMLSchemaReference result_of_Add = new XMLSchemaReference(Dispatch.call(this, "Add", namespaceURI, alias, fileName, new Variant(installForAllUsers)).toDispatch());


		return result_of_Add;
	}

}
