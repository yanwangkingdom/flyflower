/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Fields extends Dispatch {

	public static final String componentName = "Word.Fields";

	public Fields() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Fields(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Fields(String compName) {
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
	 * @return the result is of type int
	 */
	public int getLocked() {
		return Dispatch.get(this, "Locked").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param locked an input-parameter of type int
	 */
	public void setLocked(int locked) {
		Dispatch.put(this, "Locked", new Variant(locked));
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
	 * @param index an input-parameter of type int
	 * @return the result is of type Field
	 */
	public Field item(int index) {
		return new Field(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void toggleShowCodes() {
		Dispatch.call(this, "ToggleShowCodes");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int update() {
		return Dispatch.call(this, "Update").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void unlink() {
		Dispatch.call(this, "Unlink");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void updateSource() {
		Dispatch.call(this, "UpdateSource");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param type an input-parameter of type Variant
	 * @param text an input-parameter of type Variant
	 * @param preserveFormatting an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field add(Range range, Variant type, Variant text, Variant preserveFormatting) {
		return new Field(Dispatch.call(this, "Add", range, type, text, preserveFormatting).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param type an input-parameter of type Variant
	 * @param text an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field add(Range range, Variant type, Variant text) {
		return new Field(Dispatch.call(this, "Add", range, type, text).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param type an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field add(Range range, Variant type) {
		return new Field(Dispatch.call(this, "Add", range, type).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type Field
	 */
	public Field add(Range range) {
		return new Field(Dispatch.call(this, "Add", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param type an input-parameter of type Variant
	 * @param text an input-parameter of type Variant
	 * @param preserveFormatting an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field add(Range range, Variant type, Variant text, Variant preserveFormatting) {
		Field result_of_Add = new Field(Dispatch.call(this, "Add", range, type, text, preserveFormatting).toDispatch());


		return result_of_Add;
	}

}
