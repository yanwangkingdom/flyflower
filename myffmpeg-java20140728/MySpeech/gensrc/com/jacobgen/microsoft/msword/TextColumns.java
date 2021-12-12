/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class TextColumns extends Dispatch {

	public static final String componentName = "Word.TextColumns";

	public TextColumns() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public TextColumns(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public TextColumns(String compName) {
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
	 * @return the result is of type int
	 */
	public int getEvenlySpaced() {
		return Dispatch.get(this, "EvenlySpaced").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param evenlySpaced an input-parameter of type int
	 */
	public void setEvenlySpaced(int evenlySpaced) {
		Dispatch.put(this, "EvenlySpaced", new Variant(evenlySpaced));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLineBetween() {
		return Dispatch.get(this, "LineBetween").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lineBetween an input-parameter of type int
	 */
	public void setLineBetween(int lineBetween) {
		Dispatch.put(this, "LineBetween", new Variant(lineBetween));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getWidth() {
		return Dispatch.get(this, "Width").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param width an input-parameter of type float
	 */
	public void setWidth(float width) {
		Dispatch.put(this, "Width", new Variant(width));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getSpacing() {
		return Dispatch.get(this, "Spacing").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param spacing an input-parameter of type float
	 */
	public void setSpacing(float spacing) {
		Dispatch.put(this, "Spacing", new Variant(spacing));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type TextColumn
	 */
	public TextColumn item(int index) {
		return new TextColumn(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param width an input-parameter of type Variant
	 * @param spacing an input-parameter of type Variant
	 * @param evenlySpaced an input-parameter of type Variant
	 * @return the result is of type TextColumn
	 */
	public TextColumn add(Variant width, Variant spacing, Variant evenlySpaced) {
		return new TextColumn(Dispatch.call(this, "Add", width, spacing, evenlySpaced).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param width an input-parameter of type Variant
	 * @param spacing an input-parameter of type Variant
	 * @return the result is of type TextColumn
	 */
	public TextColumn add(Variant width, Variant spacing) {
		return new TextColumn(Dispatch.call(this, "Add", width, spacing).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param width an input-parameter of type Variant
	 * @return the result is of type TextColumn
	 */
	public TextColumn add(Variant width) {
		return new TextColumn(Dispatch.call(this, "Add", width).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TextColumn
	 */
	public TextColumn add() {
		return new TextColumn(Dispatch.call(this, "Add").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param width an input-parameter of type Variant
	 * @param spacing an input-parameter of type Variant
	 * @param evenlySpaced an input-parameter of type Variant
	 * @return the result is of type TextColumn
	 */
	public TextColumn add(Variant width, Variant spacing, Variant evenlySpaced) {
		TextColumn result_of_Add = new TextColumn(Dispatch.call(this, "Add", width, spacing, evenlySpaced).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numColumns an input-parameter of type int
	 */
	public void setCount(int numColumns) {
		Dispatch.call(this, "SetCount", new Variant(numColumns));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFlowDirection() {
		return Dispatch.get(this, "FlowDirection").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param flowDirection an input-parameter of type int
	 */
	public void setFlowDirection(int flowDirection) {
		Dispatch.put(this, "FlowDirection", new Variant(flowDirection));
	}

}
