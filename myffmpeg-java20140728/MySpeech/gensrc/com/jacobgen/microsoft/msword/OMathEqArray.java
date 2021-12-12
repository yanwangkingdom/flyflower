/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OMathEqArray extends Dispatch {

	public static final String componentName = "Word.OMathEqArray";

	public OMathEqArray() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OMathEqArray(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OMathEqArray(String compName) {
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
	 * @return the result is of type OMathArgs
	 */
	public OMathArgs getE() {
		return new OMathArgs(Dispatch.get(this, "E").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMaxDist() {
		return Dispatch.get(this, "MaxDist").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param maxDist an input-parameter of type boolean
	 */
	public void setMaxDist(boolean maxDist) {
		Dispatch.put(this, "MaxDist", new Variant(maxDist));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getObjDist() {
		return Dispatch.get(this, "ObjDist").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param objDist an input-parameter of type boolean
	 */
	public void setObjDist(boolean objDist) {
		Dispatch.put(this, "ObjDist", new Variant(objDist));
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

}
