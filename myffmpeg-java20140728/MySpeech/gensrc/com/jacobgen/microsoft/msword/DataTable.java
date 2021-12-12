/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class DataTable extends Dispatch {

	public static final String componentName = "Word.DataTable";

	public DataTable() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public DataTable(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public DataTable(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowLegendKey() {
		return Dispatch.get(this, "ShowLegendKey").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showLegendKey an input-parameter of type boolean
	 */
	public void setShowLegendKey(boolean showLegendKey) {
		Dispatch.put(this, "ShowLegendKey", new Variant(showLegendKey));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasBorderHorizontal() {
		return Dispatch.get(this, "HasBorderHorizontal").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasBorderHorizontal an input-parameter of type boolean
	 */
	public void setHasBorderHorizontal(boolean hasBorderHorizontal) {
		Dispatch.put(this, "HasBorderHorizontal", new Variant(hasBorderHorizontal));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasBorderVertical() {
		return Dispatch.get(this, "HasBorderVertical").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasBorderVertical an input-parameter of type boolean
	 */
	public void setHasBorderVertical(boolean hasBorderVertical) {
		Dispatch.put(this, "HasBorderVertical", new Variant(hasBorderVertical));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasBorderOutline() {
		return Dispatch.get(this, "HasBorderOutline").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasBorderOutline an input-parameter of type boolean
	 */
	public void setHasBorderOutline(boolean hasBorderOutline) {
		Dispatch.put(this, "HasBorderOutline", new Variant(hasBorderOutline));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartBorder
	 */
	public ChartBorder getBorder() {
		return new ChartBorder(Dispatch.get(this, "Border").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartFont
	 */
	public ChartFont getFont() {
		return new ChartFont(Dispatch.get(this, "Font").toDispatch());
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
	 * @return the result is of type Object
	 */
	public Object getParent() {
		return Dispatch.get(this, "Parent");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getAutoScaleFont() {
		return Dispatch.get(this, "AutoScaleFont");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoScaleFont an input-parameter of type Variant
	 */
	public void setAutoScaleFont(Variant autoScaleFont) {
		Dispatch.put(this, "AutoScaleFont", autoScaleFont);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartFormat
	 */
	public ChartFormat getFormat() {
		return new ChartFormat(Dispatch.get(this, "Format").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getApplication() {
		return Dispatch.get(this, "Application");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCreator() {
		return Dispatch.get(this, "Creator").changeType(Variant.VariantInt).getInt();
	}

}
