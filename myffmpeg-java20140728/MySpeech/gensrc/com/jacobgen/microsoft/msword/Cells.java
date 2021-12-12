/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Cells extends Dispatch {

	public static final String componentName = "Word.Cells";

	public Cells() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Cells(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Cells(String compName) {
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
	public float getHeight() {
		return Dispatch.get(this, "Height").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param height an input-parameter of type float
	 */
	public void setHeight(float height) {
		Dispatch.put(this, "Height", new Variant(height));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHeightRule() {
		return Dispatch.get(this, "HeightRule").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param heightRule an input-parameter of type int
	 */
	public void setHeightRule(int heightRule) {
		Dispatch.put(this, "HeightRule", new Variant(heightRule));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getVerticalAlignment() {
		return Dispatch.get(this, "VerticalAlignment").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param verticalAlignment an input-parameter of type int
	 */
	public void setVerticalAlignment(int verticalAlignment) {
		Dispatch.put(this, "VerticalAlignment", new Variant(verticalAlignment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Borders
	 */
	public Borders getBorders() {
		return new Borders(Dispatch.get(this, "Borders").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param borders an input-parameter of type Borders
	 */
	public void setBorders(Borders borders) {
		Dispatch.put(this, "Borders", borders);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Shading
	 */
	public Shading getShading() {
		return new Shading(Dispatch.get(this, "Shading").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type Cell
	 */
	public Cell item(int index) {
		return new Cell(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param beforeCell an input-parameter of type Variant
	 * @return the result is of type Cell
	 */
	public Cell add(Variant beforeCell) {
		return new Cell(Dispatch.call(this, "Add", beforeCell).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Cell
	 */
	public Cell add() {
		return new Cell(Dispatch.call(this, "Add").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param beforeCell an input-parameter of type Variant
	 * @return the result is of type Cell
	 */
	public Cell add(Variant beforeCell) {
		Cell result_of_Add = new Cell(Dispatch.call(this, "Add", beforeCell).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shiftCells an input-parameter of type Variant
	 */
	public void delete(Variant shiftCells) {
		Dispatch.call(this, "Delete", shiftCells);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param shiftCells an input-parameter of type Variant
	 */
	public void delete(Variant shiftCells) {
		Dispatch.call(this, "Delete", shiftCells);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param columnWidth an input-parameter of type float
	 * @param rulerStyle an input-parameter of type int
	 */
	public void setWidth(float columnWidth, int rulerStyle) {
		Dispatch.call(this, "SetWidth", new Variant(columnWidth), new Variant(rulerStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rowHeight an input-parameter of type Variant
	 * @param heightRule an input-parameter of type int
	 */
	public void setHeight(Variant rowHeight, int heightRule) {
		Dispatch.call(this, "SetHeight", rowHeight, new Variant(heightRule));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void merge() {
		Dispatch.call(this, "Merge");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param mergeBeforeSplit an input-parameter of type Variant
	 */
	public void split(Variant numRows, Variant numColumns, Variant mergeBeforeSplit) {
		Dispatch.call(this, "Split", numRows, numColumns, mergeBeforeSplit);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 */
	public void split(Variant numRows, Variant numColumns) {
		Dispatch.call(this, "Split", numRows, numColumns);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numRows an input-parameter of type Variant
	 */
	public void split(Variant numRows) {
		Dispatch.call(this, "Split", numRows);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void split() {
		Dispatch.call(this, "Split");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param mergeBeforeSplit an input-parameter of type Variant
	 */
	public void split(Variant numRows, Variant numColumns, Variant mergeBeforeSplit) {
		Dispatch.call(this, "Split", numRows, numColumns, mergeBeforeSplit);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void distributeHeight() {
		Dispatch.call(this, "DistributeHeight");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void distributeWidth() {
		Dispatch.call(this, "DistributeWidth");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void autoFit() {
		Dispatch.call(this, "AutoFit");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNestingLevel() {
		return Dispatch.get(this, "NestingLevel").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getPreferredWidth() {
		return Dispatch.get(this, "PreferredWidth").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param preferredWidth an input-parameter of type float
	 */
	public void setPreferredWidth(float preferredWidth) {
		Dispatch.put(this, "PreferredWidth", new Variant(preferredWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPreferredWidthType() {
		return Dispatch.get(this, "PreferredWidthType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param preferredWidthType an input-parameter of type int
	 */
	public void setPreferredWidthType(int preferredWidthType) {
		Dispatch.put(this, "PreferredWidthType", new Variant(preferredWidthType));
	}

}
