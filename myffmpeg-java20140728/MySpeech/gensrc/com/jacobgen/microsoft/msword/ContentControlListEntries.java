/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ContentControlListEntries extends Dispatch {

	public static final String componentName = "Word.ContentControlListEntries";

	public ContentControlListEntries() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ContentControlListEntries(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ContentControlListEntries(String compName) {
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
	 */
	public void clear() {
		Dispatch.call(this, "Clear");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type ContentControlListEntry
	 */
	public ContentControlListEntry item(int index) {
		return new ContentControlListEntry(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 * @param value an input-parameter of type String
	 * @param index an input-parameter of type int
	 * @return the result is of type ContentControlListEntry
	 */
	public ContentControlListEntry add(String text, String value, int index) {
		return new ContentControlListEntry(Dispatch.call(this, "Add", text, value, new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 * @param value an input-parameter of type String
	 * @return the result is of type ContentControlListEntry
	 */
	public ContentControlListEntry add(String text, String value) {
		return new ContentControlListEntry(Dispatch.call(this, "Add", text, value).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 * @return the result is of type ContentControlListEntry
	 */
	public ContentControlListEntry add(String text) {
		return new ContentControlListEntry(Dispatch.call(this, "Add", text).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param text an input-parameter of type String
	 * @param value an input-parameter of type String
	 * @param index an input-parameter of type int
	 * @return the result is of type ContentControlListEntry
	 */
	public ContentControlListEntry add(String text, String value, int index) {
		ContentControlListEntry result_of_Add = new ContentControlListEntry(Dispatch.call(this, "Add", text, value, new Variant(index)).toDispatch());


		return result_of_Add;
	}

}
