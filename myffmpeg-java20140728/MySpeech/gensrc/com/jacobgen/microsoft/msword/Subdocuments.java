/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Subdocuments extends Dispatch {

	public static final String componentName = "Word.Subdocuments";

	public Subdocuments() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Subdocuments(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Subdocuments(String compName) {
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
	 * @return the result is of type int
	 */
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type boolean
	 */
	public boolean getExpanded() {
		return Dispatch.get(this, "Expanded").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param expanded an input-parameter of type boolean
	 */
	public void setExpanded(boolean expanded) {
		Dispatch.put(this, "Expanded", new Variant(expanded));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type Subdocument
	 */
	public Subdocument item(int index) {
		return new Subdocument(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @return the result is of type Subdocument
	 */
	public Subdocument addFromFile(Variant name, Variant confirmConversions, Variant readOnly, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate) {
		return new Subdocument(Dispatch.call(this, "AddFromFile", name, confirmConversions, readOnly, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @return the result is of type Subdocument
	 */
	public Subdocument addFromFile(Variant name, Variant confirmConversions, Variant readOnly, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument) {
		return new Subdocument(Dispatch.call(this, "AddFromFile", name, confirmConversions, readOnly, passwordDocument, passwordTemplate, revert, writePasswordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @return the result is of type Subdocument
	 */
	public Subdocument addFromFile(Variant name, Variant confirmConversions, Variant readOnly, Variant passwordDocument, Variant passwordTemplate, Variant revert) {
		return new Subdocument(Dispatch.call(this, "AddFromFile", name, confirmConversions, readOnly, passwordDocument, passwordTemplate, revert).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @return the result is of type Subdocument
	 */
	public Subdocument addFromFile(Variant name, Variant confirmConversions, Variant readOnly, Variant passwordDocument, Variant passwordTemplate) {
		return new Subdocument(Dispatch.call(this, "AddFromFile", name, confirmConversions, readOnly, passwordDocument, passwordTemplate).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @return the result is of type Subdocument
	 */
	public Subdocument addFromFile(Variant name, Variant confirmConversions, Variant readOnly, Variant passwordDocument) {
		return new Subdocument(Dispatch.call(this, "AddFromFile", name, confirmConversions, readOnly, passwordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @return the result is of type Subdocument
	 */
	public Subdocument addFromFile(Variant name, Variant confirmConversions, Variant readOnly) {
		return new Subdocument(Dispatch.call(this, "AddFromFile", name, confirmConversions, readOnly).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @return the result is of type Subdocument
	 */
	public Subdocument addFromFile(Variant name, Variant confirmConversions) {
		return new Subdocument(Dispatch.call(this, "AddFromFile", name, confirmConversions).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @return the result is of type Subdocument
	 */
	public Subdocument addFromFile(Variant name) {
		return new Subdocument(Dispatch.call(this, "AddFromFile", name).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @return the result is of type Subdocument
	 */
	public Subdocument addFromFile(Variant name, Variant confirmConversions, Variant readOnly, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate) {
		Subdocument result_of_AddFromFile = new Subdocument(Dispatch.call(this, "AddFromFile", name, confirmConversions, readOnly, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate).toDispatch());


		return result_of_AddFromFile;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type Subdocument
	 */
	public Subdocument addFromRange(Range range) {
		return new Subdocument(Dispatch.call(this, "AddFromRange", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param firstSubdocument an input-parameter of type Variant
	 * @param lastSubdocument an input-parameter of type Variant
	 */
	public void merge(Variant firstSubdocument, Variant lastSubdocument) {
		Dispatch.call(this, "Merge", firstSubdocument, lastSubdocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param firstSubdocument an input-parameter of type Variant
	 */
	public void merge(Variant firstSubdocument) {
		Dispatch.call(this, "Merge", firstSubdocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void merge() {
		Dispatch.call(this, "Merge");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param firstSubdocument an input-parameter of type Variant
	 * @param lastSubdocument an input-parameter of type Variant
	 */
	public void merge(Variant firstSubdocument, Variant lastSubdocument) {
		Dispatch.call(this, "Merge", firstSubdocument, lastSubdocument);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void select() {
		Dispatch.call(this, "Select");
	}

}
