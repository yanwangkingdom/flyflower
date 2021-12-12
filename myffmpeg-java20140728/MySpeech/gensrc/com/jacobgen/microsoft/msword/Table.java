/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Table extends Dispatch {

	public static final String componentName = "Word.Table";

	public Table() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Table(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Table(String compName) {
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
	 * @return the result is of type Columns
	 */
	public Columns getColumns() {
		return new Columns(Dispatch.get(this, "Columns").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Rows
	 */
	public Rows getRows() {
		return new Rows(Dispatch.get(this, "Rows").toDispatch());
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
	 * @return the result is of type boolean
	 */
	public boolean getUniform() {
		return Dispatch.get(this, "Uniform").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAutoFormatType() {
		return Dispatch.get(this, "AutoFormatType").changeType(Variant.VariantInt).getInt();
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
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param languageID an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant caseSensitive, Variant languageID) {
		Dispatch.callN(this, "SortOld", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, caseSensitive, languageID});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant caseSensitive) {
		Dispatch.callN(this, "SortOld", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, caseSensitive});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3) {
		Dispatch.callN(this, "SortOld", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3) {
		Dispatch.callN(this, "SortOld", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber, sortFieldType, sortOrder);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber, sortFieldType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader) {
		Dispatch.call(this, "SortOld", excludeHeader);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sortOld() {
		Dispatch.call(this, "SortOld");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param languageID an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant caseSensitive, Variant languageID) {
		Dispatch.callN(this, "SortOld", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, caseSensitive, languageID});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sortAscending() {
		Dispatch.call(this, "SortAscending");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sortDescending() {
		Dispatch.call(this, "SortDescending");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @param applyLastColumn an input-parameter of type Variant
	 * @param autoFit an input-parameter of type Variant
	 */
	public void autoFormat(Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn, Variant applyLastColumn, Variant autoFit) {
		Dispatch.callN(this, "AutoFormat", new Object[] { format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn, applyLastColumn, autoFit});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @param applyLastColumn an input-parameter of type Variant
	 */
	public void autoFormat(Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn, Variant applyLastColumn) {
		Dispatch.callN(this, "AutoFormat", new Object[] { format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn, applyLastColumn});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 */
	public void autoFormat(Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn) {
		Dispatch.call(this, "AutoFormat", format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 */
	public void autoFormat(Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow) {
		Dispatch.call(this, "AutoFormat", format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 */
	public void autoFormat(Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows) {
		Dispatch.call(this, "AutoFormat", format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 */
	public void autoFormat(Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor) {
		Dispatch.call(this, "AutoFormat", format, applyBorders, applyShading, applyFont, applyColor);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 */
	public void autoFormat(Variant format, Variant applyBorders, Variant applyShading, Variant applyFont) {
		Dispatch.call(this, "AutoFormat", format, applyBorders, applyShading, applyFont);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 */
	public void autoFormat(Variant format, Variant applyBorders, Variant applyShading) {
		Dispatch.call(this, "AutoFormat", format, applyBorders, applyShading);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 */
	public void autoFormat(Variant format, Variant applyBorders) {
		Dispatch.call(this, "AutoFormat", format, applyBorders);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 */
	public void autoFormat(Variant format) {
		Dispatch.call(this, "AutoFormat", format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void autoFormat() {
		Dispatch.call(this, "AutoFormat");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @param applyLastColumn an input-parameter of type Variant
	 * @param autoFit an input-parameter of type Variant
	 */
	public void autoFormat(Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn, Variant applyLastColumn, Variant autoFit) {
		Dispatch.callN(this, "AutoFormat", new Object[] { format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn, applyLastColumn, autoFit});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void updateAutoFormat() {
		Dispatch.call(this, "UpdateAutoFormat");
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
	 * @param row an input-parameter of type int
	 * @param column an input-parameter of type int
	 * @return the result is of type Cell
	 */
	public Cell cell(int row, int column) {
		return new Cell(Dispatch.call(this, "Cell", new Variant(row), new Variant(column)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param beforeRow an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table split(Variant beforeRow) {
		return new Table(Dispatch.call(this, "Split", beforeRow).toDispatch());
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
	 * @param behavior an input-parameter of type int
	 */
	public void autoFitBehavior(int behavior) {
		Dispatch.call(this, "AutoFitBehavior", new Variant(behavior));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 * @param ignoreHe an input-parameter of type Variant
	 * @param languageID an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 * @param ignoreHe an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, caseSensitive, bidiSort, ignoreThe, ignoreKashida});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant caseSensitive, Variant bidiSort, Variant ignoreThe) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, caseSensitive, bidiSort, ignoreThe});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant caseSensitive, Variant bidiSort) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, caseSensitive, bidiSort});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant caseSensitive) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, caseSensitive});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber, sortFieldType, sortOrder);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber, sortFieldType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader) {
		Dispatch.call(this, "Sort", excludeHeader);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sort() {
		Dispatch.call(this, "Sort");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 * @param ignoreHe an input-parameter of type Variant
	 * @param languageID an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID});

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
	public boolean getAllowPageBreaks() {
		return Dispatch.get(this, "AllowPageBreaks").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allowPageBreaks an input-parameter of type boolean
	 */
	public void setAllowPageBreaks(boolean allowPageBreaks) {
		Dispatch.put(this, "AllowPageBreaks", new Variant(allowPageBreaks));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAllowAutoFit() {
		return Dispatch.get(this, "AllowAutoFit").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allowAutoFit an input-parameter of type boolean
	 */
	public void setAllowAutoFit(boolean allowAutoFit) {
		Dispatch.put(this, "AllowAutoFit", new Variant(allowAutoFit));
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
	 * @return the result is of type Variant
	 */
	public Variant getStyle() {
		return Dispatch.get(this, "Style");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type Variant
	 */
	public void setStyle(Variant style) {
		Dispatch.put(this, "Style", style);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getApplyStyleHeadingRows() {
		return Dispatch.get(this, "ApplyStyleHeadingRows").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param applyStyleHeadingRows an input-parameter of type boolean
	 */
	public void setApplyStyleHeadingRows(boolean applyStyleHeadingRows) {
		Dispatch.put(this, "ApplyStyleHeadingRows", new Variant(applyStyleHeadingRows));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getApplyStyleLastRow() {
		return Dispatch.get(this, "ApplyStyleLastRow").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param applyStyleLastRow an input-parameter of type boolean
	 */
	public void setApplyStyleLastRow(boolean applyStyleLastRow) {
		Dispatch.put(this, "ApplyStyleLastRow", new Variant(applyStyleLastRow));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getApplyStyleFirstColumn() {
		return Dispatch.get(this, "ApplyStyleFirstColumn").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param applyStyleFirstColumn an input-parameter of type boolean
	 */
	public void setApplyStyleFirstColumn(boolean applyStyleFirstColumn) {
		Dispatch.put(this, "ApplyStyleFirstColumn", new Variant(applyStyleFirstColumn));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getApplyStyleLastColumn() {
		return Dispatch.get(this, "ApplyStyleLastColumn").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param applyStyleLastColumn an input-parameter of type boolean
	 */
	public void setApplyStyleLastColumn(boolean applyStyleLastColumn) {
		Dispatch.put(this, "ApplyStyleLastColumn", new Variant(applyStyleLastColumn));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getApplyStyleRowBands() {
		return Dispatch.get(this, "ApplyStyleRowBands").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param applyStyleRowBands an input-parameter of type boolean
	 */
	public void setApplyStyleRowBands(boolean applyStyleRowBands) {
		Dispatch.put(this, "ApplyStyleRowBands", new Variant(applyStyleRowBands));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getApplyStyleColumnBands() {
		return Dispatch.get(this, "ApplyStyleColumnBands").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param applyStyleColumnBands an input-parameter of type boolean
	 */
	public void setApplyStyleColumnBands(boolean applyStyleColumnBands) {
		Dispatch.put(this, "ApplyStyleColumnBands", new Variant(applyStyleColumnBands));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param styleName an input-parameter of type String
	 */
	public void applyStyleDirectFormatting(String styleName) {
		Dispatch.call(this, "ApplyStyleDirectFormatting", styleName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getTitle() {
		return Dispatch.get(this, "Title").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param title an input-parameter of type String
	 */
	public void setTitle(String title) {
		Dispatch.put(this, "Title", title);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getDescr() {
		return Dispatch.get(this, "Descr").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param descr an input-parameter of type String
	 */
	public void setDescr(String descr) {
		Dispatch.put(this, "Descr", descr);
	}

}
