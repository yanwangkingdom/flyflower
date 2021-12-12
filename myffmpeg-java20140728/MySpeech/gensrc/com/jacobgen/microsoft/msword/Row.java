/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Row extends Dispatch {

	public static final String componentName = "Word.Row";

	public Row() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Row(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Row(String compName) {
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
	 * @return the result is of type boolean
	 */
	public boolean getIsLast() {
		return Dispatch.get(this, "IsLast").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIsFirst() {
		return Dispatch.get(this, "IsFirst").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getIndex() {
		return Dispatch.get(this, "Index").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Cells
	 */
	public Cells getCells() {
		return new Cells(Dispatch.get(this, "Cells").toDispatch());
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
	 * @return the result is of type Row
	 */
	public Row getNext() {
		return new Row(Dispatch.get(this, "Next").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Row
	 */
	public Row getPrevious() {
		return new Row(Dispatch.get(this, "Previous").toDispatch());
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
	public int getNestingLevel() {
		return Dispatch.get(this, "NestingLevel").changeType(Variant.VariantInt).getInt();
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

}
