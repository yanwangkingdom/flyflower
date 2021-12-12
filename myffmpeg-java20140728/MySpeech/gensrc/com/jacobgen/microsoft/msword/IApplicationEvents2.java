/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class IApplicationEvents2 extends Dispatch {

	public static final String componentName = "Word.IApplicationEvents2";

	public IApplicationEvents2() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public IApplicationEvents2(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public IApplicationEvents2(String compName) {
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

}
