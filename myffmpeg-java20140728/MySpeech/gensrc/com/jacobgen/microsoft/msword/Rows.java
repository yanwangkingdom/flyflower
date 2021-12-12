/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Rows extends Dispatch {

	public static final String componentName = "Word.Rows";

	public Rows() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Rows(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Rows(String compName) {
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
	 * @return the result is of type int
	 */
	public int getAllowBreakAcrossPages() {
		return Dispatch.get(this, "AllowBreakAcrossPages").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allowBreakAcrossPages an input-parameter of type int
	 */
	public void setAllowBreakAcrossPages(int allowBreakAcrossPages) {
		Dispatch.put(this, "AllowBreakAcrossPages", new Variant(allowBreakAcrossPages));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAlignment() {
		return Dispatch.get(this, "Alignment").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param alignment an input-parameter of type int
	 */
	public void setAlignment(int alignment) {
		Dispatch.put(this, "Alignment", new Variant(alignment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHeadingFormat() {
		return Dispatch.get(this, "HeadingFormat").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param headingFormat an input-parameter of type int
	 */
	public void setHeadingFormat(int headingFormat) {
		Dispatch.put(this, "HeadingFormat", new Variant(headingFormat));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getSpaceBetweenColumns() {
		return Dispatch.get(this, "SpaceBetweenColumns").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param spaceBetweenColumns an input-parameter of type float
	 */
	public void setSpaceBetweenColumns(float spaceBetweenColumns) {
		Dispatch.put(this, "SpaceBetweenColumns", new Variant(spaceBetweenColumns));
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
	 * @return the result is of type float
	 */
	public float getLeftIndent() {
		return Dispatch.get(this, "LeftIndent").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param leftIndent an input-parameter of type float
	 */
	public void setLeftIndent(float leftIndent) {
		Dispatch.put(this, "LeftIndent", new Variant(leftIndent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Row
	 */
	public Row getFirst() {
		return new Row(Dispatch.get(this, "First").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Row
	 */
	public Row getLast() {
		return new Row(Dispatch.get(this, "Last").toDispatch());
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
	 * @return the result is of type Row
	 */
	public Row item(int index) {
		return new Row(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param beforeRow an input-parameter of type Variant
	 * @return the result is of type Row
	 */
	public Row add(Variant beforeRow) {
		return new Row(Dispatch.call(this, "Add", beforeRow).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Row
	 */
	public Row add() {
		return new Row(Dispatch.call(this, "Add").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param beforeRow an input-parameter of type Variant
	 * @return the result is of type Row
	 */
	public Row add(Variant beforeRow) {
		Row result_of_Add = new Row(Dispatch.call(this, "Add", beforeRow).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void select() {
		Dispatch.call(this, "Select");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param leftIndent an input-parameter of type float
	 * @param rulerStyle an input-parameter of type int
	 */
	public void setLeftIndent(float leftIndent, int rulerStyle) {
		Dispatch.call(this, "SetLeftIndent", new Variant(leftIndent), new Variant(rulerStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rowHeight an input-parameter of type float
	 * @param heightRule an input-parameter of type int
	 */
	public void setHeight(float rowHeight, int heightRule) {
		Dispatch.call(this, "SetHeight", new Variant(rowHeight), new Variant(heightRule));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range convertToTextOld(Variant separator) {
		return new Range(Dispatch.call(this, "ConvertToTextOld", separator).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range convertToTextOld() {
		return new Range(Dispatch.call(this, "ConvertToTextOld").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range convertToTextOld(Variant separator) {
		Range result_of_ConvertToTextOld = new Range(Dispatch.call(this, "ConvertToTextOld", separator).toDispatch());


		return result_of_ConvertToTextOld;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void distributeHeight() {
		Dispatch.call(this, "DistributeHeight");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param nestedTables an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range convertToText(Variant separator, Variant nestedTables) {
		return new Range(Dispatch.call(this, "ConvertToText", separator, nestedTables).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range convertToText(Variant separator) {
		return new Range(Dispatch.call(this, "ConvertToText", separator).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range convertToText() {
		return new Range(Dispatch.call(this, "ConvertToText").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param nestedTables an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range convertToText(Variant separator, Variant nestedTables) {
		Range result_of_ConvertToText = new Range(Dispatch.call(this, "ConvertToText", separator, nestedTables).toDispatch());


		return result_of_ConvertToText;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getWrapAroundText() {
		return Dispatch.get(this, "WrapAroundText").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param wrapAroundText an input-parameter of type int
	 */
	public void setWrapAroundText(int wrapAroundText) {
		Dispatch.put(this, "WrapAroundText", new Variant(wrapAroundText));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getDistanceTop() {
		return Dispatch.get(this, "DistanceTop").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param distanceTop an input-parameter of type float
	 */
	public void setDistanceTop(float distanceTop) {
		Dispatch.put(this, "DistanceTop", new Variant(distanceTop));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getDistanceBottom() {
		return Dispatch.get(this, "DistanceBottom").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param distanceBottom an input-parameter of type float
	 */
	public void setDistanceBottom(float distanceBottom) {
		Dispatch.put(this, "DistanceBottom", new Variant(distanceBottom));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getDistanceLeft() {
		return Dispatch.get(this, "DistanceLeft").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param distanceLeft an input-parameter of type float
	 */
	public void setDistanceLeft(float distanceLeft) {
		Dispatch.put(this, "DistanceLeft", new Variant(distanceLeft));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getDistanceRight() {
		return Dispatch.get(this, "DistanceRight").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param distanceRight an input-parameter of type float
	 */
	public void setDistanceRight(float distanceRight) {
		Dispatch.put(this, "DistanceRight", new Variant(distanceRight));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getHorizontalPosition() {
		return Dispatch.get(this, "HorizontalPosition").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param horizontalPosition an input-parameter of type float
	 */
	public void setHorizontalPosition(float horizontalPosition) {
		Dispatch.put(this, "HorizontalPosition", new Variant(horizontalPosition));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getVerticalPosition() {
		return Dispatch.get(this, "VerticalPosition").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param verticalPosition an input-parameter of type float
	 */
	public void setVerticalPosition(float verticalPosition) {
		Dispatch.put(this, "VerticalPosition", new Variant(verticalPosition));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRelativeHorizontalPosition() {
		return Dispatch.get(this, "RelativeHorizontalPosition").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param relativeHorizontalPosition an input-parameter of type int
	 */
	public void setRelativeHorizontalPosition(int relativeHorizontalPosition) {
		Dispatch.put(this, "RelativeHorizontalPosition", new Variant(relativeHorizontalPosition));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRelativeVerticalPosition() {
		return Dispatch.get(this, "RelativeVerticalPosition").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param relativeVerticalPosition an input-parameter of type int
	 */
	public void setRelativeVerticalPosition(int relativeVerticalPosition) {
		Dispatch.put(this, "RelativeVerticalPosition", new Variant(relativeVerticalPosition));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAllowOverlap() {
		return Dispatch.get(this, "AllowOverlap").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allowOverlap an input-parameter of type int
	 */
	public void setAllowOverlap(int allowOverlap) {
		Dispatch.put(this, "AllowOverlap", new Variant(allowOverlap));
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
	 * @return the result is of type int
	 */
	public int getTableDirection() {
		return Dispatch.get(this, "TableDirection").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tableDirection an input-parameter of type int
	 */
	public void setTableDirection(int tableDirection) {
		Dispatch.put(this, "TableDirection", new Variant(tableDirection));
	}

}
