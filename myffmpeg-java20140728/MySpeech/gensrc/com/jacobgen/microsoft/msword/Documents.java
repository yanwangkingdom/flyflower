/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Documents extends Dispatch {

	public static final String componentName = "Word.Documents";

	public Documents() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Documents(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Documents(String compName) {
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
	 * @return the result is of type Document
	 */
	public Document item(Variant index) {
		return new Document(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type Variant
	 * @param originalFormat an input-parameter of type Variant
	 * @param routeDocument an input-parameter of type Variant
	 */
	public void close(Variant saveChanges, Variant originalFormat, Variant routeDocument) {
		Dispatch.call(this, "Close", saveChanges, originalFormat, routeDocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type Variant
	 * @param originalFormat an input-parameter of type Variant
	 */
	public void close(Variant saveChanges, Variant originalFormat) {
		Dispatch.call(this, "Close", saveChanges, originalFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type Variant
	 */
	public void close(Variant saveChanges) {
		Dispatch.call(this, "Close", saveChanges);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void close() {
		Dispatch.call(this, "Close");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param saveChanges an input-parameter of type Variant
	 * @param originalFormat an input-parameter of type Variant
	 * @param routeDocument an input-parameter of type Variant
	 */
	public void close(Variant saveChanges, Variant originalFormat, Variant routeDocument) {
		Dispatch.call(this, "Close", saveChanges, originalFormat, routeDocument);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param template an input-parameter of type Variant
	 * @param newTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document addOld(Variant template, Variant newTemplate) {
		return new Document(Dispatch.call(this, "AddOld", template, newTemplate).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param template an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document addOld(Variant template) {
		return new Document(Dispatch.call(this, "AddOld", template).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Document
	 */
	public Document addOld() {
		return new Document(Dispatch.call(this, "AddOld").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param template an input-parameter of type Variant
	 * @param newTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document addOld(Variant template, Variant newTemplate) {
		Document result_of_AddOld = new Document(Dispatch.call(this, "AddOld", template, newTemplate).toDispatch());


		return result_of_AddOld;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openOld(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format) {
		return new Document(Dispatch.callN(this, "OpenOld", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openOld(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate) {
		return new Document(Dispatch.callN(this, "OpenOld", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openOld(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument) {
		return new Document(Dispatch.call(this, "OpenOld", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openOld(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert) {
		return new Document(Dispatch.call(this, "OpenOld", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openOld(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate) {
		return new Document(Dispatch.call(this, "OpenOld", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openOld(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument) {
		return new Document(Dispatch.call(this, "OpenOld", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openOld(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles) {
		return new Document(Dispatch.call(this, "OpenOld", fileName, confirmConversions, readOnly, addToRecentFiles).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openOld(Variant fileName, Variant confirmConversions, Variant readOnly) {
		return new Document(Dispatch.call(this, "OpenOld", fileName, confirmConversions, readOnly).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openOld(Variant fileName, Variant confirmConversions) {
		return new Document(Dispatch.call(this, "OpenOld", fileName, confirmConversions).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openOld(Variant fileName) {
		return new Document(Dispatch.call(this, "OpenOld", fileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openOld(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format) {
		Document result_of_OpenOld = new Document(Dispatch.callN(this, "OpenOld", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format}).toDispatch());


		return result_of_OpenOld;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param noPrompt an input-parameter of type Variant
	 * @param originalFormat an input-parameter of type Variant
	 */
	public void save(Variant noPrompt, Variant originalFormat) {
		Dispatch.call(this, "Save", noPrompt, originalFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param noPrompt an input-parameter of type Variant
	 */
	public void save(Variant noPrompt) {
		Dispatch.call(this, "Save", noPrompt);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void save() {
		Dispatch.call(this, "Save");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param noPrompt an input-parameter of type Variant
	 * @param originalFormat an input-parameter of type Variant
	 */
	public void save(Variant noPrompt, Variant originalFormat) {
		Dispatch.call(this, "Save", noPrompt, originalFormat);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param template an input-parameter of type Variant
	 * @param newTemplate an input-parameter of type Variant
	 * @param documentType an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document add(Variant template, Variant newTemplate, Variant documentType, Variant visible) {
		return new Document(Dispatch.call(this, "Add", template, newTemplate, documentType, visible).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param template an input-parameter of type Variant
	 * @param newTemplate an input-parameter of type Variant
	 * @param documentType an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document add(Variant template, Variant newTemplate, Variant documentType) {
		return new Document(Dispatch.call(this, "Add", template, newTemplate, documentType).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param template an input-parameter of type Variant
	 * @param newTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document add(Variant template, Variant newTemplate) {
		return new Document(Dispatch.call(this, "Add", template, newTemplate).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param template an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document add(Variant template) {
		return new Document(Dispatch.call(this, "Add", template).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Document
	 */
	public Document add() {
		return new Document(Dispatch.call(this, "Add").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param template an input-parameter of type Variant
	 * @param newTemplate an input-parameter of type Variant
	 * @param documentType an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document add(Variant template, Variant newTemplate, Variant documentType, Variant visible) {
		Document result_of_Add = new Document(Dispatch.call(this, "Add", template, newTemplate, documentType, visible).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible) {
		return new Document(Dispatch.callN(this, "Open2000", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding) {
		return new Document(Dispatch.callN(this, "Open2000", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format) {
		return new Document(Dispatch.callN(this, "Open2000", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate) {
		return new Document(Dispatch.callN(this, "Open2000", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument) {
		return new Document(Dispatch.call(this, "Open2000", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert) {
		return new Document(Dispatch.call(this, "Open2000", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate) {
		return new Document(Dispatch.call(this, "Open2000", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument) {
		return new Document(Dispatch.call(this, "Open2000", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles) {
		return new Document(Dispatch.call(this, "Open2000", fileName, confirmConversions, readOnly, addToRecentFiles).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName, Variant confirmConversions, Variant readOnly) {
		return new Document(Dispatch.call(this, "Open2000", fileName, confirmConversions, readOnly).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName, Variant confirmConversions) {
		return new Document(Dispatch.call(this, "Open2000", fileName, confirmConversions).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName) {
		return new Document(Dispatch.call(this, "Open2000", fileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2000(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible) {
		Document result_of_Open2000 = new Document(Dispatch.callN(this, "Open2000", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible}).toDispatch());


		return result_of_Open2000;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void checkOut(String fileName) {
		Dispatch.call(this, "CheckOut", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean canCheckOut(String fileName) {
		return Dispatch.call(this, "CanCheckOut", fileName).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @param documentDirection an input-parameter of type Variant
	 * @param noEncodingDialog an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair, Variant documentDirection, Variant noEncodingDialog) {
		return new Document(Dispatch.callN(this, "Open2002", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair, documentDirection, noEncodingDialog}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @param documentDirection an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair, Variant documentDirection) {
		return new Document(Dispatch.callN(this, "Open2002", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair, documentDirection}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair) {
		return new Document(Dispatch.callN(this, "Open2002", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible) {
		return new Document(Dispatch.callN(this, "Open2002", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding) {
		return new Document(Dispatch.callN(this, "Open2002", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format) {
		return new Document(Dispatch.callN(this, "Open2002", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate) {
		return new Document(Dispatch.callN(this, "Open2002", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument) {
		return new Document(Dispatch.call(this, "Open2002", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert) {
		return new Document(Dispatch.call(this, "Open2002", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate) {
		return new Document(Dispatch.call(this, "Open2002", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument) {
		return new Document(Dispatch.call(this, "Open2002", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles) {
		return new Document(Dispatch.call(this, "Open2002", fileName, confirmConversions, readOnly, addToRecentFiles).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly) {
		return new Document(Dispatch.call(this, "Open2002", fileName, confirmConversions, readOnly).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions) {
		return new Document(Dispatch.call(this, "Open2002", fileName, confirmConversions).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName) {
		return new Document(Dispatch.call(this, "Open2002", fileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @param documentDirection an input-parameter of type Variant
	 * @param noEncodingDialog an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open2002(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair, Variant documentDirection, Variant noEncodingDialog) {
		Document result_of_Open2002 = new Document(Dispatch.callN(this, "Open2002", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair, documentDirection, noEncodingDialog}).toDispatch());


		return result_of_Open2002;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @param documentDirection an input-parameter of type Variant
	 * @param noEncodingDialog an input-parameter of type Variant
	 * @param xMLTransform an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair, Variant documentDirection, Variant noEncodingDialog, Variant xMLTransform) {
		return new Document(Dispatch.callN(this, "Open", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair, documentDirection, noEncodingDialog, xMLTransform}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @param documentDirection an input-parameter of type Variant
	 * @param noEncodingDialog an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair, Variant documentDirection, Variant noEncodingDialog) {
		return new Document(Dispatch.callN(this, "Open", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair, documentDirection, noEncodingDialog}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @param documentDirection an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair, Variant documentDirection) {
		return new Document(Dispatch.callN(this, "Open", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair, documentDirection}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair) {
		return new Document(Dispatch.callN(this, "Open", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible) {
		return new Document(Dispatch.callN(this, "Open", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding) {
		return new Document(Dispatch.callN(this, "Open", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format) {
		return new Document(Dispatch.callN(this, "Open", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate) {
		return new Document(Dispatch.callN(this, "Open", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument) {
		return new Document(Dispatch.call(this, "Open", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert) {
		return new Document(Dispatch.call(this, "Open", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate) {
		return new Document(Dispatch.call(this, "Open", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument) {
		return new Document(Dispatch.call(this, "Open", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles) {
		return new Document(Dispatch.call(this, "Open", fileName, confirmConversions, readOnly, addToRecentFiles).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly) {
		return new Document(Dispatch.call(this, "Open", fileName, confirmConversions, readOnly).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions) {
		return new Document(Dispatch.call(this, "Open", fileName, confirmConversions).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName) {
		return new Document(Dispatch.call(this, "Open", fileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @param documentDirection an input-parameter of type Variant
	 * @param noEncodingDialog an input-parameter of type Variant
	 * @param xMLTransform an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document open(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair, Variant documentDirection, Variant noEncodingDialog, Variant xMLTransform) {
		Document result_of_Open = new Document(Dispatch.callN(this, "Open", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair, documentDirection, noEncodingDialog, xMLTransform}).toDispatch());


		return result_of_Open;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @param documentDirection an input-parameter of type Variant
	 * @param noEncodingDialog an input-parameter of type Variant
	 * @param xMLTransform an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair, Variant documentDirection, Variant noEncodingDialog, Variant xMLTransform) {
		return new Document(Dispatch.callN(this, "OpenNoRepairDialog", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair, documentDirection, noEncodingDialog, xMLTransform}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @param documentDirection an input-parameter of type Variant
	 * @param noEncodingDialog an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair, Variant documentDirection, Variant noEncodingDialog) {
		return new Document(Dispatch.callN(this, "OpenNoRepairDialog", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair, documentDirection, noEncodingDialog}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @param documentDirection an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair, Variant documentDirection) {
		return new Document(Dispatch.callN(this, "OpenNoRepairDialog", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair, documentDirection}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair) {
		return new Document(Dispatch.callN(this, "OpenNoRepairDialog", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible) {
		return new Document(Dispatch.callN(this, "OpenNoRepairDialog", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding) {
		return new Document(Dispatch.callN(this, "OpenNoRepairDialog", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format) {
		return new Document(Dispatch.callN(this, "OpenNoRepairDialog", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate) {
		return new Document(Dispatch.callN(this, "OpenNoRepairDialog", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument) {
		return new Document(Dispatch.call(this, "OpenNoRepairDialog", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert) {
		return new Document(Dispatch.call(this, "OpenNoRepairDialog", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate) {
		return new Document(Dispatch.call(this, "OpenNoRepairDialog", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument) {
		return new Document(Dispatch.call(this, "OpenNoRepairDialog", fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles) {
		return new Document(Dispatch.call(this, "OpenNoRepairDialog", fileName, confirmConversions, readOnly, addToRecentFiles).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly) {
		return new Document(Dispatch.call(this, "OpenNoRepairDialog", fileName, confirmConversions, readOnly).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions) {
		return new Document(Dispatch.call(this, "OpenNoRepairDialog", fileName, confirmConversions).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName) {
		return new Document(Dispatch.call(this, "OpenNoRepairDialog", fileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @param documentDirection an input-parameter of type Variant
	 * @param noEncodingDialog an input-parameter of type Variant
	 * @param xMLTransform an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document openNoRepairDialog(Variant fileName, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant format, Variant encoding, Variant visible, Variant openAndRepair, Variant documentDirection, Variant noEncodingDialog, Variant xMLTransform) {
		Document result_of_OpenNoRepairDialog = new Document(Dispatch.callN(this, "OpenNoRepairDialog", new Object[] { fileName, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, format, encoding, visible, openAndRepair, documentDirection, noEncodingDialog, xMLTransform}).toDispatch());


		return result_of_OpenNoRepairDialog;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param providerID an input-parameter of type String
	 * @param postURL an input-parameter of type String
	 * @param blogName an input-parameter of type String
	 * @param postID an input-parameter of type String
	 * @return the result is of type Document
	 */
	public Document addBlogDocument(String providerID, String postURL, String blogName, String postID) {
		return new Document(Dispatch.call(this, "AddBlogDocument", providerID, postURL, blogName, postID).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param providerID an input-parameter of type String
	 * @param postURL an input-parameter of type String
	 * @param blogName an input-parameter of type String
	 * @return the result is of type Document
	 */
	public Document addBlogDocument(String providerID, String postURL, String blogName) {
		return new Document(Dispatch.call(this, "AddBlogDocument", providerID, postURL, blogName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param providerID an input-parameter of type String
	 * @param postURL an input-parameter of type String
	 * @param blogName an input-parameter of type String
	 * @param postID an input-parameter of type String
	 * @return the result is of type Document
	 */
	public Document addBlogDocument(String providerID, String postURL, String blogName, String postID) {
		Document result_of_AddBlogDocument = new Document(Dispatch.call(this, "AddBlogDocument", providerID, postURL, blogName, postID).toDispatch());


		return result_of_AddBlogDocument;
	}

}
