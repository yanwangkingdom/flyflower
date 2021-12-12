/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ApplicationEvents3 extends Dispatch {

	public static final String componentName = "Word.ApplicationEvents3";

	public ApplicationEvents3() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ApplicationEvents3(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ApplicationEvents3(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void startup() {
		Dispatch.call(this, "Startup");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void quit() {
		Dispatch.call(this, "Quit");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void documentChange() {
		Dispatch.call(this, "DocumentChange");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 */
	public void documentOpen(Document doc) {
		Dispatch.call(this, "DocumentOpen", doc);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param cancel an input-parameter of type boolean
	 */
	public void documentBeforeClose(Document doc, boolean cancel) {
		Dispatch.call(this, "DocumentBeforeClose", doc, new Variant(cancel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param cancel an input-parameter of type boolean
	 */
	public void documentBeforePrint(Document doc, boolean cancel) {
		Dispatch.call(this, "DocumentBeforePrint", doc, new Variant(cancel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param saveAsUI an input-parameter of type boolean
	 * @param cancel an input-parameter of type boolean
	 */
	public void documentBeforeSave(Document doc, boolean saveAsUI, boolean cancel) {
		Dispatch.call(this, "DocumentBeforeSave", doc, new Variant(saveAsUI), new Variant(cancel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 */
	public void newDocument(Document doc) {
		Dispatch.call(this, "NewDocument", doc);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param wn an input-parameter of type Window
	 */
	public void windowActivate(Document doc, Window wn) {
		Dispatch.call(this, "WindowActivate", doc, wn);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param wn an input-parameter of type Window
	 */
	public void windowDeactivate(Document doc, Window wn) {
		Dispatch.call(this, "WindowDeactivate", doc, wn);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sel an input-parameter of type Selection
	 */
	public void windowSelectionChange(Selection sel) {
		Dispatch.call(this, "WindowSelectionChange", sel);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sel an input-parameter of type Selection
	 * @param cancel an input-parameter of type boolean
	 */
	public void windowBeforeRightClick(Selection sel, boolean cancel) {
		Dispatch.call(this, "WindowBeforeRightClick", sel, new Variant(cancel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sel an input-parameter of type Selection
	 * @param cancel an input-parameter of type boolean
	 */
	public void windowBeforeDoubleClick(Selection sel, boolean cancel) {
		Dispatch.call(this, "WindowBeforeDoubleClick", sel, new Variant(cancel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 */
	public void ePostagePropertyDialog(Document doc) {
		Dispatch.call(this, "EPostagePropertyDialog", doc);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 */
	public void ePostageInsert(Document doc) {
		Dispatch.call(this, "EPostageInsert", doc);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param docResult an input-parameter of type Document
	 */
	public void mailMergeAfterMerge(Document doc, Document docResult) {
		Dispatch.call(this, "MailMergeAfterMerge", doc, docResult);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 */
	public void mailMergeAfterRecordMerge(Document doc) {
		Dispatch.call(this, "MailMergeAfterRecordMerge", doc);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param startRecord an input-parameter of type int
	 * @param endRecord an input-parameter of type int
	 * @param cancel an input-parameter of type boolean
	 */
	public void mailMergeBeforeMerge(Document doc, int startRecord, int endRecord, boolean cancel) {
		Dispatch.call(this, "MailMergeBeforeMerge", doc, new Variant(startRecord), new Variant(endRecord), new Variant(cancel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param cancel an input-parameter of type boolean
	 */
	public void mailMergeBeforeRecordMerge(Document doc, boolean cancel) {
		Dispatch.call(this, "MailMergeBeforeRecordMerge", doc, new Variant(cancel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 */
	public void mailMergeDataSourceLoad(Document doc) {
		Dispatch.call(this, "MailMergeDataSourceLoad", doc);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param handled an input-parameter of type boolean
	 */
	public void mailMergeDataSourceValidate(Document doc, boolean handled) {
		Dispatch.call(this, "MailMergeDataSourceValidate", doc, new Variant(handled));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 */
	public void mailMergeWizardSendToCustom(Document doc) {
		Dispatch.call(this, "MailMergeWizardSendToCustom", doc);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param fromState an input-parameter of type int
	 * @param toState an input-parameter of type int
	 * @param handled an input-parameter of type boolean
	 */
	public void mailMergeWizardStateChange(Document doc, int fromState, int toState, boolean handled) {
		Dispatch.call(this, "MailMergeWizardStateChange", doc, new Variant(fromState), new Variant(toState), new Variant(handled));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param wn an input-parameter of type Window
	 */
	public void windowSize(Document doc, Window wn) {
		Dispatch.call(this, "WindowSize", doc, wn);
	}

}
