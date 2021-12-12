/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class TableStyle extends Dispatch {

	public static final String componentName = "Word.TableStyle";

	public TableStyle() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public TableStyle(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public TableStyle(String compName) {
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
	 * @param conditionCode an input-parameter of type int
	 * @return the result is of type ConditionalStyle
	 */
	public ConditionalStyle condition(int conditionCode) {
		return new ConditionalStyle(Dispatch.call(this, "Condition", new Variant(conditionCode)).toDispatch());
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
	 * @return the result is of type int
	 */
	public int getAllowBreakAcrossPage() {
		return Dispatch.get(this, "AllowBreakAcrossPage").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allowBreakAcrossPage an input-parameter of type int
	 */
	public void setAllowBreakAcrossPage(int allowBreakAcrossPage) {
		Dispatch.put(this, "AllowBreakAcrossPage", new Variant(allowBreakAcrossPage));
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
	 * @return the result is of type Shading
	 */
	public Shading getShading() {
		return new Shading(Dispatch.get(this, "Shading").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRowStripe() {
		return Dispatch.get(this, "RowStripe").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rowStripe an input-parameter of type int
	 */
	public void setRowStripe(int rowStripe) {
		Dispatch.put(this, "RowStripe", new Variant(rowStripe));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getColumnStripe() {
		return Dispatch.get(this, "ColumnStripe").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param columnStripe an input-parameter of type int
	 */
	public void setColumnStripe(int columnStripe) {
		Dispatch.put(this, "ColumnStripe", new Variant(columnStripe));
	}

}
