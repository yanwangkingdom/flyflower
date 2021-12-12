/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ShapeNodes extends Dispatch {

	public static final String componentName = "Word.ShapeNodes";

	public ShapeNodes() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ShapeNodes(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ShapeNodes(String compName) {
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
	 * @param index an input-parameter of type int
	 */
	public void delete(int index) {
		Dispatch.call(this, "Delete", new Variant(index));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type ShapeNode
	 */
	public ShapeNode item(Variant index) {
		return new ShapeNode(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @param editingType an input-parameter of type MsoEditingType
	 */
	public void setEditingType(int index, MsoEditingType editingType) {
		Dispatch.call(this, "SetEditingType", new Variant(index), editingType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @param x1 an input-parameter of type float
	 * @param y1 an input-parameter of type float
	 */
	public void setPosition(int index, float x1, float y1) {
		Dispatch.call(this, "SetPosition", new Variant(index), new Variant(x1), new Variant(y1));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @param segmentType an input-parameter of type MsoSegmentType
	 */
	public void setSegmentType(int index, MsoSegmentType segmentType) {
		Dispatch.call(this, "SetSegmentType", new Variant(index), segmentType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @param segmentType an input-parameter of type MsoSegmentType
	 * @param editingType an input-parameter of type MsoEditingType
	 * @param x1 an input-parameter of type float
	 * @param y1 an input-parameter of type float
	 * @param x2 an input-parameter of type float
	 * @param y2 an input-parameter of type float
	 * @param x3 an input-parameter of type float
	 * @param y3 an input-parameter of type float
	 */
	public void insert(int index, MsoSegmentType segmentType, MsoEditingType editingType, float x1, float y1, float x2, float y2, float x3, float y3) {
		Dispatch.callN(this, "Insert", new Object[] { new Variant(index), segmentType, editingType, new Variant(x1), new Variant(y1), new Variant(x2), new Variant(y2), new Variant(x3), new Variant(y3)});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @param segmentType an input-parameter of type MsoSegmentType
	 * @param editingType an input-parameter of type MsoEditingType
	 * @param x1 an input-parameter of type float
	 * @param y1 an input-parameter of type float
	 * @param x2 an input-parameter of type float
	 * @param y2 an input-parameter of type float
	 * @param x3 an input-parameter of type float
	 */
	public void insert(int index, MsoSegmentType segmentType, MsoEditingType editingType, float x1, float y1, float x2, float y2, float x3) {
		Dispatch.call(this, "Insert", new Variant(index), segmentType, editingType, new Variant(x1), new Variant(y1), new Variant(x2), new Variant(y2), new Variant(x3));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @param segmentType an input-parameter of type MsoSegmentType
	 * @param editingType an input-parameter of type MsoEditingType
	 * @param x1 an input-parameter of type float
	 * @param y1 an input-parameter of type float
	 * @param x2 an input-parameter of type float
	 * @param y2 an input-parameter of type float
	 */
	public void insert(int index, MsoSegmentType segmentType, MsoEditingType editingType, float x1, float y1, float x2, float y2) {
		Dispatch.call(this, "Insert", new Variant(index), segmentType, editingType, new Variant(x1), new Variant(y1), new Variant(x2), new Variant(y2));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @param segmentType an input-parameter of type MsoSegmentType
	 * @param editingType an input-parameter of type MsoEditingType
	 * @param x1 an input-parameter of type float
	 * @param y1 an input-parameter of type float
	 * @param x2 an input-parameter of type float
	 */
	public void insert(int index, MsoSegmentType segmentType, MsoEditingType editingType, float x1, float y1, float x2) {
		Dispatch.call(this, "Insert", new Variant(index), segmentType, editingType, new Variant(x1), new Variant(y1), new Variant(x2));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @param segmentType an input-parameter of type MsoSegmentType
	 * @param editingType an input-parameter of type MsoEditingType
	 * @param x1 an input-parameter of type float
	 * @param y1 an input-parameter of type float
	 */
	public void insert(int index, MsoSegmentType segmentType, MsoEditingType editingType, float x1, float y1) {
		Dispatch.call(this, "Insert", new Variant(index), segmentType, editingType, new Variant(x1), new Variant(y1));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type int
	 * @param segmentType an input-parameter of type MsoSegmentType
	 * @param editingType an input-parameter of type MsoEditingType
	 * @param x1 an input-parameter of type float
	 * @param y1 an input-parameter of type float
	 * @param x2 an input-parameter of type float
	 * @param y2 an input-parameter of type float
	 * @param x3 an input-parameter of type float
	 * @param y3 an input-parameter of type float
	 */
	public void insert(int index, MsoSegmentType segmentType, MsoEditingType editingType, float x1, float y1, float x2, float y2, float x3, float y3) {
		Dispatch.callN(this, "Insert", new Object[] { new Variant(index), segmentType, editingType, new Variant(x1), new Variant(y1), new Variant(x2), new Variant(y2), new Variant(x3), new Variant(y3)});

	}

}
