/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class MailingLabel extends Dispatch {

	public static final String componentName = "Word.MailingLabel";

	public MailingLabel() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public MailingLabel(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public MailingLabel(String compName) {
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
	public boolean getDefaultPrintBarCode() {
		return Dispatch.get(this, "DefaultPrintBarCode").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultPrintBarCode an input-parameter of type boolean
	 */
	public void setDefaultPrintBarCode(boolean defaultPrintBarCode) {
		Dispatch.put(this, "DefaultPrintBarCode", new Variant(defaultPrintBarCode));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDefaultLaserTray() {
		return Dispatch.get(this, "DefaultLaserTray").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultLaserTray an input-parameter of type int
	 */
	public void setDefaultLaserTray(int defaultLaserTray) {
		Dispatch.put(this, "DefaultLaserTray", new Variant(defaultLaserTray));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type CustomLabels
	 */
	public CustomLabels getCustomLabels() {
		return new CustomLabels(Dispatch.get(this, "CustomLabels").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getDefaultLabelName() {
		return Dispatch.get(this, "DefaultLabelName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultLabelName an input-parameter of type String
	 */
	public void setDefaultLabelName(String defaultLabelName) {
		Dispatch.put(this, "DefaultLabelName", defaultLabelName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument2000(Variant name, Variant address, Variant autoText, Variant extractAddress, Variant laserTray) {
		return new Document(Dispatch.call(this, "CreateNewDocument2000", name, address, autoText, extractAddress, laserTray).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument2000(Variant name, Variant address, Variant autoText, Variant extractAddress) {
		return new Document(Dispatch.call(this, "CreateNewDocument2000", name, address, autoText, extractAddress).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument2000(Variant name, Variant address, Variant autoText) {
		return new Document(Dispatch.call(this, "CreateNewDocument2000", name, address, autoText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument2000(Variant name, Variant address) {
		return new Document(Dispatch.call(this, "CreateNewDocument2000", name, address).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument2000(Variant name) {
		return new Document(Dispatch.call(this, "CreateNewDocument2000", name).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Document
	 */
	public Document createNewDocument2000() {
		return new Document(Dispatch.call(this, "CreateNewDocument2000").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument2000(Variant name, Variant address, Variant autoText, Variant extractAddress, Variant laserTray) {
		Document result_of_CreateNewDocument2000 = new Document(Dispatch.call(this, "CreateNewDocument2000", name, address, autoText, extractAddress, laserTray).toDispatch());


		return result_of_CreateNewDocument2000;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 * @param column an input-parameter of type Variant
	 */
	public void printOut2000(Variant name, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row, Variant column) {
		Dispatch.call(this, "PrintOut2000", name, address, extractAddress, laserTray, singleLabel, row, column);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 */
	public void printOut2000(Variant name, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row) {
		Dispatch.call(this, "PrintOut2000", name, address, extractAddress, laserTray, singleLabel, row);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 */
	public void printOut2000(Variant name, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel) {
		Dispatch.call(this, "PrintOut2000", name, address, extractAddress, laserTray, singleLabel);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 */
	public void printOut2000(Variant name, Variant address, Variant extractAddress, Variant laserTray) {
		Dispatch.call(this, "PrintOut2000", name, address, extractAddress, laserTray);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 */
	public void printOut2000(Variant name, Variant address, Variant extractAddress) {
		Dispatch.call(this, "PrintOut2000", name, address, extractAddress);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 */
	public void printOut2000(Variant name, Variant address) {
		Dispatch.call(this, "PrintOut2000", name, address);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 */
	public void printOut2000(Variant name) {
		Dispatch.call(this, "PrintOut2000", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void printOut2000() {
		Dispatch.call(this, "PrintOut2000");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 * @param column an input-parameter of type Variant
	 */
	public void printOut2000(Variant name, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row, Variant column) {
		Dispatch.call(this, "PrintOut2000", name, address, extractAddress, laserTray, singleLabel, row, column);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void labelOptions() {
		Dispatch.call(this, "LabelOptions");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param printEPostageLabel an input-parameter of type Variant
	 * @param vertical an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument(Variant name, Variant address, Variant autoText, Variant extractAddress, Variant laserTray, Variant printEPostageLabel, Variant vertical) {
		return new Document(Dispatch.call(this, "CreateNewDocument", name, address, autoText, extractAddress, laserTray, printEPostageLabel, vertical).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param printEPostageLabel an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument(Variant name, Variant address, Variant autoText, Variant extractAddress, Variant laserTray, Variant printEPostageLabel) {
		return new Document(Dispatch.call(this, "CreateNewDocument", name, address, autoText, extractAddress, laserTray, printEPostageLabel).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument(Variant name, Variant address, Variant autoText, Variant extractAddress, Variant laserTray) {
		return new Document(Dispatch.call(this, "CreateNewDocument", name, address, autoText, extractAddress, laserTray).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument(Variant name, Variant address, Variant autoText, Variant extractAddress) {
		return new Document(Dispatch.call(this, "CreateNewDocument", name, address, autoText, extractAddress).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument(Variant name, Variant address, Variant autoText) {
		return new Document(Dispatch.call(this, "CreateNewDocument", name, address, autoText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument(Variant name, Variant address) {
		return new Document(Dispatch.call(this, "CreateNewDocument", name, address).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument(Variant name) {
		return new Document(Dispatch.call(this, "CreateNewDocument", name).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Document
	 */
	public Document createNewDocument() {
		return new Document(Dispatch.call(this, "CreateNewDocument").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param printEPostageLabel an input-parameter of type Variant
	 * @param vertical an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocument(Variant name, Variant address, Variant autoText, Variant extractAddress, Variant laserTray, Variant printEPostageLabel, Variant vertical) {
		Document result_of_CreateNewDocument = new Document(Dispatch.call(this, "CreateNewDocument", name, address, autoText, extractAddress, laserTray, printEPostageLabel, vertical).toDispatch());


		return result_of_CreateNewDocument;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 * @param column an input-parameter of type Variant
	 * @param printEPostageLabel an input-parameter of type Variant
	 * @param vertical an input-parameter of type Variant
	 */
	public void printOut(Variant name, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row, Variant column, Variant printEPostageLabel, Variant vertical) {
		Dispatch.callN(this, "PrintOut", new Object[] { name, address, extractAddress, laserTray, singleLabel, row, column, printEPostageLabel, vertical});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 * @param column an input-parameter of type Variant
	 * @param printEPostageLabel an input-parameter of type Variant
	 */
	public void printOut(Variant name, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row, Variant column, Variant printEPostageLabel) {
		Dispatch.call(this, "PrintOut", name, address, extractAddress, laserTray, singleLabel, row, column, printEPostageLabel);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 * @param column an input-parameter of type Variant
	 */
	public void printOut(Variant name, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row, Variant column) {
		Dispatch.call(this, "PrintOut", name, address, extractAddress, laserTray, singleLabel, row, column);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 */
	public void printOut(Variant name, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row) {
		Dispatch.call(this, "PrintOut", name, address, extractAddress, laserTray, singleLabel, row);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 */
	public void printOut(Variant name, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel) {
		Dispatch.call(this, "PrintOut", name, address, extractAddress, laserTray, singleLabel);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 */
	public void printOut(Variant name, Variant address, Variant extractAddress, Variant laserTray) {
		Dispatch.call(this, "PrintOut", name, address, extractAddress, laserTray);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 */
	public void printOut(Variant name, Variant address, Variant extractAddress) {
		Dispatch.call(this, "PrintOut", name, address, extractAddress);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 */
	public void printOut(Variant name, Variant address) {
		Dispatch.call(this, "PrintOut", name, address);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 */
	public void printOut(Variant name) {
		Dispatch.call(this, "PrintOut", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void printOut() {
		Dispatch.call(this, "PrintOut");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 * @param column an input-parameter of type Variant
	 * @param printEPostageLabel an input-parameter of type Variant
	 * @param vertical an input-parameter of type Variant
	 */
	public void printOut(Variant name, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row, Variant column, Variant printEPostageLabel, Variant vertical) {
		Dispatch.callN(this, "PrintOut", new Object[] { name, address, extractAddress, laserTray, singleLabel, row, column, printEPostageLabel, vertical});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getVertical() {
		return Dispatch.get(this, "Vertical").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param vertical an input-parameter of type boolean
	 */
	public void setVertical(boolean vertical) {
		Dispatch.put(this, "Vertical", new Variant(vertical));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param printEPostageLabel an input-parameter of type Variant
	 * @param vertical an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocumentByID(Variant labelID, Variant address, Variant autoText, Variant extractAddress, Variant laserTray, Variant printEPostageLabel, Variant vertical) {
		return new Document(Dispatch.call(this, "CreateNewDocumentByID", labelID, address, autoText, extractAddress, laserTray, printEPostageLabel, vertical).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param printEPostageLabel an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocumentByID(Variant labelID, Variant address, Variant autoText, Variant extractAddress, Variant laserTray, Variant printEPostageLabel) {
		return new Document(Dispatch.call(this, "CreateNewDocumentByID", labelID, address, autoText, extractAddress, laserTray, printEPostageLabel).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocumentByID(Variant labelID, Variant address, Variant autoText, Variant extractAddress, Variant laserTray) {
		return new Document(Dispatch.call(this, "CreateNewDocumentByID", labelID, address, autoText, extractAddress, laserTray).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocumentByID(Variant labelID, Variant address, Variant autoText, Variant extractAddress) {
		return new Document(Dispatch.call(this, "CreateNewDocumentByID", labelID, address, autoText, extractAddress).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocumentByID(Variant labelID, Variant address, Variant autoText) {
		return new Document(Dispatch.call(this, "CreateNewDocumentByID", labelID, address, autoText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocumentByID(Variant labelID, Variant address) {
		return new Document(Dispatch.call(this, "CreateNewDocumentByID", labelID, address).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocumentByID(Variant labelID) {
		return new Document(Dispatch.call(this, "CreateNewDocumentByID", labelID).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Document
	 */
	public Document createNewDocumentByID() {
		return new Document(Dispatch.call(this, "CreateNewDocumentByID").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param printEPostageLabel an input-parameter of type Variant
	 * @param vertical an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document createNewDocumentByID(Variant labelID, Variant address, Variant autoText, Variant extractAddress, Variant laserTray, Variant printEPostageLabel, Variant vertical) {
		Document result_of_CreateNewDocumentByID = new Document(Dispatch.call(this, "CreateNewDocumentByID", labelID, address, autoText, extractAddress, laserTray, printEPostageLabel, vertical).toDispatch());


		return result_of_CreateNewDocumentByID;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 * @param column an input-parameter of type Variant
	 * @param printEPostageLabel an input-parameter of type Variant
	 * @param vertical an input-parameter of type Variant
	 */
	public void printOutByID(Variant labelID, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row, Variant column, Variant printEPostageLabel, Variant vertical) {
		Dispatch.callN(this, "PrintOutByID", new Object[] { labelID, address, extractAddress, laserTray, singleLabel, row, column, printEPostageLabel, vertical});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 * @param column an input-parameter of type Variant
	 * @param printEPostageLabel an input-parameter of type Variant
	 */
	public void printOutByID(Variant labelID, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row, Variant column, Variant printEPostageLabel) {
		Dispatch.call(this, "PrintOutByID", labelID, address, extractAddress, laserTray, singleLabel, row, column, printEPostageLabel);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 * @param column an input-parameter of type Variant
	 */
	public void printOutByID(Variant labelID, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row, Variant column) {
		Dispatch.call(this, "PrintOutByID", labelID, address, extractAddress, laserTray, singleLabel, row, column);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 */
	public void printOutByID(Variant labelID, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row) {
		Dispatch.call(this, "PrintOutByID", labelID, address, extractAddress, laserTray, singleLabel, row);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 */
	public void printOutByID(Variant labelID, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel) {
		Dispatch.call(this, "PrintOutByID", labelID, address, extractAddress, laserTray, singleLabel);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 */
	public void printOutByID(Variant labelID, Variant address, Variant extractAddress, Variant laserTray) {
		Dispatch.call(this, "PrintOutByID", labelID, address, extractAddress, laserTray);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 */
	public void printOutByID(Variant labelID, Variant address, Variant extractAddress) {
		Dispatch.call(this, "PrintOutByID", labelID, address, extractAddress);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 */
	public void printOutByID(Variant labelID, Variant address) {
		Dispatch.call(this, "PrintOutByID", labelID, address);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 */
	public void printOutByID(Variant labelID) {
		Dispatch.call(this, "PrintOutByID", labelID);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void printOutByID() {
		Dispatch.call(this, "PrintOutByID");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param labelID an input-parameter of type Variant
	 * @param address an input-parameter of type Variant
	 * @param extractAddress an input-parameter of type Variant
	 * @param laserTray an input-parameter of type Variant
	 * @param singleLabel an input-parameter of type Variant
	 * @param row an input-parameter of type Variant
	 * @param column an input-parameter of type Variant
	 * @param printEPostageLabel an input-parameter of type Variant
	 * @param vertical an input-parameter of type Variant
	 */
	public void printOutByID(Variant labelID, Variant address, Variant extractAddress, Variant laserTray, Variant singleLabel, Variant row, Variant column, Variant printEPostageLabel, Variant vertical) {
		Dispatch.callN(this, "PrintOutByID", new Object[] { labelID, address, extractAddress, laserTray, singleLabel, row, column, printEPostageLabel, vertical});

	}

}
