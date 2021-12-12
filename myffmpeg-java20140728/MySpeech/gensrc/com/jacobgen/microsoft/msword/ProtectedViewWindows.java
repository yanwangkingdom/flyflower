/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ProtectedViewWindows extends Dispatch {

	public static final String componentName = "Word.ProtectedViewWindows";

	public ProtectedViewWindows() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ProtectedViewWindows(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ProtectedViewWindows(String compName) {
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
	 * @param index an input-parameter of type Variant
	 * @return the result is of type ProtectedViewWindow
	 */
	public ProtectedViewWindow item(Variant index) {
		return new ProtectedViewWindow(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @return the result is of type ProtectedViewWindow
	 */
	public ProtectedViewWindow open(Variant fileName, Variant addToRecentFiles, Variant passwordDocument, Variant visible, Variant openAndRepair) {
		return new ProtectedViewWindow(Dispatch.call(this, "Open", fileName, addToRecentFiles, passwordDocument, visible, openAndRepair).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @return the result is of type ProtectedViewWindow
	 */
	public ProtectedViewWindow open(Variant fileName, Variant addToRecentFiles, Variant passwordDocument, Variant visible) {
		return new ProtectedViewWindow(Dispatch.call(this, "Open", fileName, addToRecentFiles, passwordDocument, visible).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @return the result is of type ProtectedViewWindow
	 */
	public ProtectedViewWindow open(Variant fileName, Variant addToRecentFiles, Variant passwordDocument) {
		return new ProtectedViewWindow(Dispatch.call(this, "Open", fileName, addToRecentFiles, passwordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @return the result is of type ProtectedViewWindow
	 */
	public ProtectedViewWindow open(Variant fileName, Variant addToRecentFiles) {
		return new ProtectedViewWindow(Dispatch.call(this, "Open", fileName, addToRecentFiles).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @return the result is of type ProtectedViewWindow
	 */
	public ProtectedViewWindow open(Variant fileName) {
		return new ProtectedViewWindow(Dispatch.call(this, "Open", fileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param visible an input-parameter of type Variant
	 * @param openAndRepair an input-parameter of type Variant
	 * @return the result is of type ProtectedViewWindow
	 */
	public ProtectedViewWindow open(Variant fileName, Variant addToRecentFiles, Variant passwordDocument, Variant visible, Variant openAndRepair) {
		ProtectedViewWindow result_of_Open = new ProtectedViewWindow(Dispatch.call(this, "Open", fileName, addToRecentFiles, passwordDocument, visible, openAndRepair).toDispatch());


		return result_of_Open;
	}

}
