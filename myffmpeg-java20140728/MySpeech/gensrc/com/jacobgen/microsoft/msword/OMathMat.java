/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OMathMat extends Dispatch {

	public static final String componentName = "Word.OMathMat";

	public OMathMat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OMathMat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OMathMat(String compName) {
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
	 * @return the result is of type OMathMatRows
	 */
	public OMathMatRows getRows() {
		return new OMathMatRows(Dispatch.get(this, "Rows").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathMatCols
	 */
	public OMathMatCols getCols() {
		return new OMathMatCols(Dispatch.get(this, "Cols").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param row an input-parameter of type int
	 * @param col an input-parameter of type int
	 * @return the result is of type OMath
	 */
	public OMath getCell(int row, int col) {
		return new OMath(Dispatch.call(this, "Cell", new Variant(row), new Variant(col)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAlign() {
		return Dispatch.get(this, "Align").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param align an input-parameter of type int
	 */
	public void setAlign(int align) {
		Dispatch.put(this, "Align", new Variant(align));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getPlcHoldHidden() {
		return Dispatch.get(this, "PlcHoldHidden").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param plcHoldHidden an input-parameter of type boolean
	 */
	public void setPlcHoldHidden(boolean plcHoldHidden) {
		Dispatch.put(this, "PlcHoldHidden", new Variant(plcHoldHidden));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRowSpacingRule() {
		return Dispatch.get(this, "RowSpacingRule").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rowSpacingRule an input-parameter of type int
	 */
	public void setRowSpacingRule(int rowSpacingRule) {
		Dispatch.put(this, "RowSpacingRule", new Variant(rowSpacingRule));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRowSpacing() {
		return Dispatch.get(this, "RowSpacing").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rowSpacing an input-parameter of type int
	 */
	public void setRowSpacing(int rowSpacing) {
		Dispatch.put(this, "RowSpacing", new Variant(rowSpacing));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getColSpacing() {
		return Dispatch.get(this, "ColSpacing").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param colSpacing an input-parameter of type int
	 */
	public void setColSpacing(int colSpacing) {
		Dispatch.put(this, "ColSpacing", new Variant(colSpacing));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getColGapRule() {
		return Dispatch.get(this, "ColGapRule").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param colGapRule an input-parameter of type int
	 */
	public void setColGapRule(int colGapRule) {
		Dispatch.put(this, "ColGapRule", new Variant(colGapRule));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getColGap() {
		return Dispatch.get(this, "ColGap").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param colGap an input-parameter of type int
	 */
	public void setColGap(int colGap) {
		Dispatch.put(this, "ColGap", new Variant(colGap));
	}

}
