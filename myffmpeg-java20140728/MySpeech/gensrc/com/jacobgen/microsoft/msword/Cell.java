/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Cell extends Dispatch {

	public static final String componentName = "Word.Cell";

	public Cell() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Cell(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Cell(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range getRange() {
		return new Range(Dispatch.get(this, "Range").toDispatch());
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
	public int getRowIndex() {
		return Dispatch.get(this, "RowIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getColumnIndex() {
		return Dispatch.get(this, "ColumnIndex").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type Column
	 */
	public Column getColumn() {
		return new Column(Dispatch.get(this, "Column").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Row
	 */
	public Row getRow() {
		return new Row(Dispatch.get(this, "Row").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Cell
	 */
	public Cell getNext() {
		return new Cell(Dispatch.get(this, "Next").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Cell
	 */
	public Cell getPrevious() {
		return new Cell(Dispatch.get(this, "Previous").toDispatch());
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
	 */
	public void select() {
		Dispatch.call(this, "Select");
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
	 * @param formula an input-parameter of type Variant
	 * @param numFormat an input-parameter of type Variant
	 */
	public void formula(Variant formula, Variant numFormat) {
		Dispatch.call(this, "Formula", formula, numFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formula an input-parameter of type Variant
	 */
	public void formula(Variant formula) {
		Dispatch.call(this, "Formula", formula);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void formula() {
		Dispatch.call(this, "Formula");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param formula an input-parameter of type Variant
	 * @param numFormat an input-parameter of type Variant
	 */
	public void formula(Variant formula, Variant numFormat) {
		Dispatch.call(this, "Formula", formula, numFormat);

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
	 * @param mergeTo an input-parameter of type Cell
	 */
	public void merge(Cell mergeTo) {
		Dispatch.call(this, "Merge", mergeTo);
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
	 */
	public void split(Variant numRows, Variant numColumns) {
		Dispatch.call(this, "Split", numRows, numColumns);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void autoSum() {
		Dispatch.call(this, "AutoSum");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Tables
	 */
	public Tables getTables() {
		return new Tables(Dispatch.get(this, "Tables").toDispatch());
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
	 * @return the result is of type boolean
	 */
	public boolean getWordWrap() {
		return Dispatch.get(this, "WordWrap").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param wordWrap an input-parameter of type boolean
	 */
	public void setWordWrap(boolean wordWrap) {
		Dispatch.put(this, "WordWrap", new Variant(wordWrap));
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
	 * @return the result is of type boolean
	 */
	public boolean getFitText() {
		return Dispatch.get(this, "FitText").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fitText an input-parameter of type boolean
	 */
	public void setFitText(boolean fitText) {
		Dispatch.put(this, "FitText", new Variant(fitText));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getTopPadding() {
		return Dispatch.get(this, "TopPadding").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param topPadding an input-parameter of type float
	 */
	public void setTopPadding(float topPadding) {
		Dispatch.put(this, "TopPadding", new Variant(topPadding));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getBottomPadding() {
		return Dispatch.get(this, "BottomPadding").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bottomPadding an input-parameter of type float
	 */
	public void setBottomPadding(float bottomPadding) {
		Dispatch.put(this, "BottomPadding", new Variant(bottomPadding));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLeftPadding() {
		return Dispatch.get(this, "LeftPadding").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param leftPadding an input-parameter of type float
	 */
	public void setLeftPadding(float leftPadding) {
		Dispatch.put(this, "LeftPadding", new Variant(leftPadding));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getRightPadding() {
		return Dispatch.get(this, "RightPadding").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rightPadding an input-parameter of type float
	 */
	public void setRightPadding(float rightPadding) {
		Dispatch.put(this, "RightPadding", new Variant(rightPadding));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getID() {
		return Dispatch.get(this, "ID").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iD an input-parameter of type String
	 */
	public void setID(String iD) {
		Dispatch.put(this, "ID", iD);
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
