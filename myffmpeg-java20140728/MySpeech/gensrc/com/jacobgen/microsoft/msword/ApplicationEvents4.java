/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ApplicationEvents4 extends Dispatch {

	public static final String componentName = "Word.ApplicationEvents4";

	public ApplicationEvents4() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ApplicationEvents4(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ApplicationEvents4(String compName) {
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
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param cancel is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 */
	public void documentBeforeClose(Document doc, boolean[] cancel) {
		Variant vnt_cancel = new Variant();
		if( cancel == null || cancel.length == 0 )
			vnt_cancel.putNoParam();
		else
			vnt_cancel.putBooleanRef(cancel[0]);

		Dispatch.call(this, "DocumentBeforeClose", doc, vnt_cancel);

		if( cancel != null && cancel.length > 0 )
			cancel[0] = vnt_cancel.toBoolean();
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
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param cancel is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 */
	public void documentBeforePrint(Document doc, boolean[] cancel) {
		Variant vnt_cancel = new Variant();
		if( cancel == null || cancel.length == 0 )
			vnt_cancel.putNoParam();
		else
			vnt_cancel.putBooleanRef(cancel[0]);

		Dispatch.call(this, "DocumentBeforePrint", doc, vnt_cancel);

		if( cancel != null && cancel.length > 0 )
			cancel[0] = vnt_cancel.toBoolean();
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
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param saveAsUI an input-parameter of type boolean
	 * @param cancel is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 */
	public void documentBeforeSave(Document doc, boolean saveAsUI, boolean[] cancel) {
		Variant vnt_cancel = new Variant();
		if( cancel == null || cancel.length == 0 )
			vnt_cancel.putNoParam();
		else
			vnt_cancel.putBooleanRef(cancel[0]);

		Dispatch.call(this, "DocumentBeforeSave", doc, new Variant(saveAsUI), vnt_cancel);

		if( cancel != null && cancel.length > 0 )
			cancel[0] = vnt_cancel.toBoolean();
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
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param sel an input-parameter of type Selection
	 * @param cancel is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 */
	public void windowBeforeRightClick(Selection sel, boolean[] cancel) {
		Variant vnt_cancel = new Variant();
		if( cancel == null || cancel.length == 0 )
			vnt_cancel.putNoParam();
		else
			vnt_cancel.putBooleanRef(cancel[0]);

		Dispatch.call(this, "WindowBeforeRightClick", sel, vnt_cancel);

		if( cancel != null && cancel.length > 0 )
			cancel[0] = vnt_cancel.toBoolean();
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
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param sel an input-parameter of type Selection
	 * @param cancel is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 */
	public void windowBeforeDoubleClick(Selection sel, boolean[] cancel) {
		Variant vnt_cancel = new Variant();
		if( cancel == null || cancel.length == 0 )
			vnt_cancel.putNoParam();
		else
			vnt_cancel.putBooleanRef(cancel[0]);

		Dispatch.call(this, "WindowBeforeDoubleClick", sel, vnt_cancel);

		if( cancel != null && cancel.length > 0 )
			cancel[0] = vnt_cancel.toBoolean();
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
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param startRecord an input-parameter of type int
	 * @param endRecord an input-parameter of type int
	 * @param cancel is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 */
	public void mailMergeBeforeMerge(Document doc, int startRecord, int endRecord, boolean[] cancel) {
		Variant vnt_cancel = new Variant();
		if( cancel == null || cancel.length == 0 )
			vnt_cancel.putNoParam();
		else
			vnt_cancel.putBooleanRef(cancel[0]);

		Dispatch.call(this, "MailMergeBeforeMerge", doc, new Variant(startRecord), new Variant(endRecord), vnt_cancel);

		if( cancel != null && cancel.length > 0 )
			cancel[0] = vnt_cancel.toBoolean();
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
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param cancel is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 */
	public void mailMergeBeforeRecordMerge(Document doc, boolean[] cancel) {
		Variant vnt_cancel = new Variant();
		if( cancel == null || cancel.length == 0 )
			vnt_cancel.putNoParam();
		else
			vnt_cancel.putBooleanRef(cancel[0]);

		Dispatch.call(this, "MailMergeBeforeRecordMerge", doc, vnt_cancel);

		if( cancel != null && cancel.length > 0 )
			cancel[0] = vnt_cancel.toBoolean();
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

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sel an input-parameter of type Selection
	 * @param oldXMLNode an input-parameter of type XMLNode
	 * @param newXMLNode an input-parameter of type XMLNode
	 * @param reason an input-parameter of type int
	 */
	public void xMLSelectionChange(Selection sel, XMLNode oldXMLNode, XMLNode newXMLNode, int reason) {
		Dispatch.call(this, "XMLSelectionChange", sel, oldXMLNode, newXMLNode, new Variant(reason));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xMLNode an input-parameter of type XMLNode
	 */
	public void xMLValidationError(XMLNode xMLNode) {
		Dispatch.call(this, "XMLValidationError", xMLNode);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param syncEventType an input-parameter of type MsoSyncEventType
	 */
	public void documentSync(Document doc, MsoSyncEventType syncEventType) {
		Dispatch.call(this, "DocumentSync", doc, syncEventType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param cpDeliveryAddrStart an input-parameter of type int
	 * @param cpDeliveryAddrEnd an input-parameter of type int
	 * @param cpReturnAddrStart an input-parameter of type int
	 * @param cpReturnAddrEnd an input-parameter of type int
	 * @param xaWidth an input-parameter of type int
	 * @param yaHeight an input-parameter of type int
	 * @param bstrPrinterName an input-parameter of type String
	 * @param bstrPaperFeed an input-parameter of type String
	 * @param fPrint an input-parameter of type boolean
	 * @param fCancel an input-parameter of type boolean
	 */
	public void ePostageInsertEx(Document doc, int cpDeliveryAddrStart, int cpDeliveryAddrEnd, int cpReturnAddrStart, int cpReturnAddrEnd, int xaWidth, int yaHeight, String bstrPrinterName, String bstrPaperFeed, boolean fPrint, boolean fCancel) {
		Dispatch.callN(this, "EPostageInsertEx", new Object[] { doc, new Variant(cpDeliveryAddrStart), new Variant(cpDeliveryAddrEnd), new Variant(cpReturnAddrStart), new Variant(cpReturnAddrEnd), new Variant(xaWidth), new Variant(yaHeight), bstrPrinterName, bstrPaperFeed, new Variant(fPrint), new Variant(fCancel)});
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param cpDeliveryAddrStart an input-parameter of type int
	 * @param cpDeliveryAddrEnd an input-parameter of type int
	 * @param cpReturnAddrStart an input-parameter of type int
	 * @param cpReturnAddrEnd an input-parameter of type int
	 * @param xaWidth an input-parameter of type int
	 * @param yaHeight an input-parameter of type int
	 * @param bstrPrinterName an input-parameter of type String
	 * @param bstrPaperFeed an input-parameter of type String
	 * @param fPrint an input-parameter of type boolean
	 * @param fCancel is an one-element array which sends the input-parameter
	 *                to the ActiveX-Component and receives the output-parameter
	 */
	public void ePostageInsertEx(Document doc, int cpDeliveryAddrStart, int cpDeliveryAddrEnd, int cpReturnAddrStart, int cpReturnAddrEnd, int xaWidth, int yaHeight, String bstrPrinterName, String bstrPaperFeed, boolean fPrint, boolean[] fCancel) {
		Variant vnt_fCancel = new Variant();
		if( fCancel == null || fCancel.length == 0 )
			vnt_fCancel.putNoParam();
		else
			vnt_fCancel.putBooleanRef(fCancel[0]);

		Dispatch.callN(this, "EPostageInsertEx", new Object[] { doc, new Variant(cpDeliveryAddrStart), new Variant(cpDeliveryAddrEnd), new Variant(cpReturnAddrStart), new Variant(cpReturnAddrEnd), new Variant(xaWidth), new Variant(yaHeight), bstrPrinterName, bstrPaperFeed, new Variant(fPrint), vnt_fCancel});

		if( fCancel != null && fCancel.length > 0 )
			fCancel[0] = vnt_fCancel.toBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param handled an input-parameter of type boolean
	 */
	public void mailMergeDataSourceValidate2(Document doc, boolean handled) {
		Dispatch.call(this, "MailMergeDataSourceValidate2", doc, new Variant(handled));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param doc an input-parameter of type Document
	 * @param handled is an one-element array which sends the input-parameter
	 *                to the ActiveX-Component and receives the output-parameter
	 */
	public void mailMergeDataSourceValidate2(Document doc, boolean[] handled) {
		Variant vnt_handled = new Variant();
		if( handled == null || handled.length == 0 )
			vnt_handled.putNoParam();
		else
			vnt_handled.putBooleanRef(handled[0]);

		Dispatch.call(this, "MailMergeDataSourceValidate2", doc, vnt_handled);

		if( handled != null && handled.length > 0 )
			handled[0] = vnt_handled.toBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pvWindow an input-parameter of type ProtectedViewWindow
	 */
	public void protectedViewWindowOpen(ProtectedViewWindow pvWindow) {
		Dispatch.call(this, "ProtectedViewWindowOpen", pvWindow);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pvWindow an input-parameter of type ProtectedViewWindow
	 * @param cancel an input-parameter of type boolean
	 */
	public void protectedViewWindowBeforeEdit(ProtectedViewWindow pvWindow, boolean cancel) {
		Dispatch.call(this, "ProtectedViewWindowBeforeEdit", pvWindow, new Variant(cancel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param pvWindow an input-parameter of type ProtectedViewWindow
	 * @param cancel is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 */
	public void protectedViewWindowBeforeEdit(ProtectedViewWindow pvWindow, boolean[] cancel) {
		Variant vnt_cancel = new Variant();
		if( cancel == null || cancel.length == 0 )
			vnt_cancel.putNoParam();
		else
			vnt_cancel.putBooleanRef(cancel[0]);

		Dispatch.call(this, "ProtectedViewWindowBeforeEdit", pvWindow, vnt_cancel);

		if( cancel != null && cancel.length > 0 )
			cancel[0] = vnt_cancel.toBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pvWindow an input-parameter of type ProtectedViewWindow
	 * @param closeReason an input-parameter of type int
	 * @param cancel an input-parameter of type boolean
	 */
	public void protectedViewWindowBeforeClose(ProtectedViewWindow pvWindow, int closeReason, boolean cancel) {
		Dispatch.call(this, "ProtectedViewWindowBeforeClose", pvWindow, new Variant(closeReason), new Variant(cancel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param pvWindow an input-parameter of type ProtectedViewWindow
	 * @param closeReason an input-parameter of type int
	 * @param cancel is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 */
	public void protectedViewWindowBeforeClose(ProtectedViewWindow pvWindow, int closeReason, boolean[] cancel) {
		Variant vnt_cancel = new Variant();
		if( cancel == null || cancel.length == 0 )
			vnt_cancel.putNoParam();
		else
			vnt_cancel.putBooleanRef(cancel[0]);

		Dispatch.call(this, "ProtectedViewWindowBeforeClose", pvWindow, new Variant(closeReason), vnt_cancel);

		if( cancel != null && cancel.length > 0 )
			cancel[0] = vnt_cancel.toBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pvWindow an input-parameter of type ProtectedViewWindow
	 */
	public void protectedViewWindowSize(ProtectedViewWindow pvWindow) {
		Dispatch.call(this, "ProtectedViewWindowSize", pvWindow);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pvWindow an input-parameter of type ProtectedViewWindow
	 */
	public void protectedViewWindowActivate(ProtectedViewWindow pvWindow) {
		Dispatch.call(this, "ProtectedViewWindowActivate", pvWindow);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pvWindow an input-parameter of type ProtectedViewWindow
	 */
	public void protectedViewWindowDeactivate(ProtectedViewWindow pvWindow) {
		Dispatch.call(this, "ProtectedViewWindowDeactivate", pvWindow);
	}

}
