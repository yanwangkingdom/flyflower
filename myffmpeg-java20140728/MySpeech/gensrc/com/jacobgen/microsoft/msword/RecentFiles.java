/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class RecentFiles extends Dispatch {

	public static final String componentName = "Word.RecentFiles";

	public RecentFiles() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public RecentFiles(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public RecentFiles(String compName) {
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
	 * @return the result is of type int
	 */
	public int getMaximum() {
		return Dispatch.get(this, "Maximum").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param maximum an input-parameter of type int
	 */
	public void setMaximum(int maximum) {
		Dispatch.put(this, "Maximum", new Variant(maximum));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type RecentFile
	 */
	public RecentFile item(int index) {
		return new RecentFile(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param document an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @return the result is of type RecentFile
	 */
	public RecentFile add(Variant document, Variant readOnly) {
		return new RecentFile(Dispatch.call(this, "Add", document, readOnly).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param document an input-parameter of type Variant
	 * @return the result is of type RecentFile
	 */
	public RecentFile add(Variant document) {
		return new RecentFile(Dispatch.call(this, "Add", document).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param document an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @return the result is of type RecentFile
	 */
	public RecentFile add(Variant document, Variant readOnly) {
		RecentFile result_of_Add = new RecentFile(Dispatch.call(this, "Add", document, readOnly).toDispatch());


		return result_of_Add;
	}

}
