/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Axis extends Dispatch {

	public static final String componentName = "Word.Axis";

	public Axis() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Axis(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Axis(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAxisBetweenCategories() {
		return Dispatch.get(this, "AxisBetweenCategories").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param axisBetweenCategories an input-parameter of type boolean
	 */
	public void setAxisBetweenCategories(boolean axisBetweenCategories) {
		Dispatch.put(this, "AxisBetweenCategories", new Variant(axisBetweenCategories));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAxisGroup() {
		return Dispatch.get(this, "AxisGroup").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type AxisTitle
	 */
	public AxisTitle getAxisTitle() {
		return new AxisTitle(Dispatch.get(this, "AxisTitle").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getCategoryNames() {
		return Dispatch.get(this, "CategoryNames");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param categoryNames an input-parameter of type Variant
	 */
	public void setCategoryNames(Variant categoryNames) {
		Dispatch.put(this, "CategoryNames", categoryNames);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCrosses() {
		return Dispatch.get(this, "Crosses").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param crosses an input-parameter of type int
	 */
	public void setCrosses(int crosses) {
		Dispatch.put(this, "Crosses", new Variant(crosses));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getCrossesAt() {
		return Dispatch.get(this, "CrossesAt").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param crossesAt an input-parameter of type double
	 */
	public void setCrossesAt(double crossesAt) {
		Dispatch.put(this, "CrossesAt", new Variant(crossesAt));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant delete() {
		return Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasMajorGridlines() {
		return Dispatch.get(this, "HasMajorGridlines").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasMajorGridlines an input-parameter of type boolean
	 */
	public void setHasMajorGridlines(boolean hasMajorGridlines) {
		Dispatch.put(this, "HasMajorGridlines", new Variant(hasMajorGridlines));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasMinorGridlines() {
		return Dispatch.get(this, "HasMinorGridlines").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasMinorGridlines an input-parameter of type boolean
	 */
	public void setHasMinorGridlines(boolean hasMinorGridlines) {
		Dispatch.put(this, "HasMinorGridlines", new Variant(hasMinorGridlines));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasTitle() {
		return Dispatch.get(this, "HasTitle").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasTitle an input-parameter of type boolean
	 */
	public void setHasTitle(boolean hasTitle) {
		Dispatch.put(this, "HasTitle", new Variant(hasTitle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Gridlines
	 */
	public Gridlines getMajorGridlines() {
		return new Gridlines(Dispatch.get(this, "MajorGridlines").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMajorTickMark() {
		return Dispatch.get(this, "MajorTickMark").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param majorTickMark an input-parameter of type int
	 */
	public void setMajorTickMark(int majorTickMark) {
		Dispatch.put(this, "MajorTickMark", new Variant(majorTickMark));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getMajorUnit() {
		return Dispatch.get(this, "MajorUnit").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param majorUnit an input-parameter of type double
	 */
	public void setMajorUnit(double majorUnit) {
		Dispatch.put(this, "MajorUnit", new Variant(majorUnit));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getLogBase() {
		return Dispatch.get(this, "LogBase").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param logBase an input-parameter of type double
	 */
	public void setLogBase(double logBase) {
		Dispatch.put(this, "LogBase", new Variant(logBase));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getTickLabelSpacingIsAuto() {
		return Dispatch.get(this, "TickLabelSpacingIsAuto").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tickLabelSpacingIsAuto an input-parameter of type boolean
	 */
	public void setTickLabelSpacingIsAuto(boolean tickLabelSpacingIsAuto) {
		Dispatch.put(this, "TickLabelSpacingIsAuto", new Variant(tickLabelSpacingIsAuto));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMajorUnitIsAuto() {
		return Dispatch.get(this, "MajorUnitIsAuto").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param majorUnitIsAuto an input-parameter of type boolean
	 */
	public void setMajorUnitIsAuto(boolean majorUnitIsAuto) {
		Dispatch.put(this, "MajorUnitIsAuto", new Variant(majorUnitIsAuto));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getMaximumScale() {
		return Dispatch.get(this, "MaximumScale").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param maximumScale an input-parameter of type double
	 */
	public void setMaximumScale(double maximumScale) {
		Dispatch.put(this, "MaximumScale", new Variant(maximumScale));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMaximumScaleIsAuto() {
		return Dispatch.get(this, "MaximumScaleIsAuto").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param maximumScaleIsAuto an input-parameter of type boolean
	 */
	public void setMaximumScaleIsAuto(boolean maximumScaleIsAuto) {
		Dispatch.put(this, "MaximumScaleIsAuto", new Variant(maximumScaleIsAuto));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getMinimumScale() {
		return Dispatch.get(this, "MinimumScale").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param minimumScale an input-parameter of type double
	 */
	public void setMinimumScale(double minimumScale) {
		Dispatch.put(this, "MinimumScale", new Variant(minimumScale));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMinimumScaleIsAuto() {
		return Dispatch.get(this, "MinimumScaleIsAuto").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param minimumScaleIsAuto an input-parameter of type boolean
	 */
	public void setMinimumScaleIsAuto(boolean minimumScaleIsAuto) {
		Dispatch.put(this, "MinimumScaleIsAuto", new Variant(minimumScaleIsAuto));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Gridlines
	 */
	public Gridlines getMinorGridlines() {
		return new Gridlines(Dispatch.get(this, "MinorGridlines").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMinorTickMark() {
		return Dispatch.get(this, "MinorTickMark").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param minorTickMark an input-parameter of type int
	 */
	public void setMinorTickMark(int minorTickMark) {
		Dispatch.put(this, "MinorTickMark", new Variant(minorTickMark));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getMinorUnit() {
		return Dispatch.get(this, "MinorUnit").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param minorUnit an input-parameter of type double
	 */
	public void setMinorUnit(double minorUnit) {
		Dispatch.put(this, "MinorUnit", new Variant(minorUnit));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMinorUnitIsAuto() {
		return Dispatch.get(this, "MinorUnitIsAuto").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param minorUnitIsAuto an input-parameter of type boolean
	 */
	public void setMinorUnitIsAuto(boolean minorUnitIsAuto) {
		Dispatch.put(this, "MinorUnitIsAuto", new Variant(minorUnitIsAuto));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getReversePlotOrder() {
		return Dispatch.get(this, "ReversePlotOrder").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param reversePlotOrder an input-parameter of type boolean
	 */
	public void setReversePlotOrder(boolean reversePlotOrder) {
		Dispatch.put(this, "ReversePlotOrder", new Variant(reversePlotOrder));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getScaleType() {
		return Dispatch.get(this, "ScaleType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param scaleType an input-parameter of type int
	 */
	public void setScaleType(int scaleType) {
		Dispatch.put(this, "ScaleType", new Variant(scaleType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant select() {
		return Dispatch.call(this, "Select");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getTickLabelPosition() {
		return Dispatch.get(this, "TickLabelPosition").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tickLabelPosition an input-parameter of type int
	 */
	public void setTickLabelPosition(int tickLabelPosition) {
		Dispatch.put(this, "TickLabelPosition", new Variant(tickLabelPosition));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TickLabels
	 */
	public TickLabels getTickLabels() {
		return new TickLabels(Dispatch.get(this, "TickLabels").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getTickLabelSpacing() {
		return Dispatch.get(this, "TickLabelSpacing").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tickLabelSpacing an input-parameter of type int
	 */
	public void setTickLabelSpacing(int tickLabelSpacing) {
		Dispatch.put(this, "TickLabelSpacing", new Variant(tickLabelSpacing));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getTickMarkSpacing() {
		return Dispatch.get(this, "TickMarkSpacing").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tickMarkSpacing an input-parameter of type int
	 */
	public void setTickMarkSpacing(int tickMarkSpacing) {
		Dispatch.put(this, "TickMarkSpacing", new Variant(tickMarkSpacing));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getType() {
		return Dispatch.get(this, "Type").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 */
	public void setType(int type) {
		Dispatch.put(this, "Type", new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBaseUnit() {
		return Dispatch.get(this, "BaseUnit").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param baseUnit an input-parameter of type int
	 */
	public void setBaseUnit(int baseUnit) {
		Dispatch.put(this, "BaseUnit", new Variant(baseUnit));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getBaseUnitIsAuto() {
		return Dispatch.get(this, "BaseUnitIsAuto").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param baseUnitIsAuto an input-parameter of type boolean
	 */
	public void setBaseUnitIsAuto(boolean baseUnitIsAuto) {
		Dispatch.put(this, "BaseUnitIsAuto", new Variant(baseUnitIsAuto));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMajorUnitScale() {
		return Dispatch.get(this, "MajorUnitScale").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param majorUnitScale an input-parameter of type int
	 */
	public void setMajorUnitScale(int majorUnitScale) {
		Dispatch.put(this, "MajorUnitScale", new Variant(majorUnitScale));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMinorUnitScale() {
		return Dispatch.get(this, "MinorUnitScale").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param minorUnitScale an input-parameter of type int
	 */
	public void setMinorUnitScale(int minorUnitScale) {
		Dispatch.put(this, "MinorUnitScale", new Variant(minorUnitScale));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCategoryType() {
		return Dispatch.get(this, "CategoryType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param categoryType an input-parameter of type int
	 */
	public void setCategoryType(int categoryType) {
		Dispatch.put(this, "CategoryType", new Variant(categoryType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getLeft() {
		return Dispatch.get(this, "Left").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getTop() {
		return Dispatch.get(this, "Top").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getWidth() {
		return Dispatch.get(this, "Width").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getHeight() {
		return Dispatch.get(this, "Height").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDisplayUnit() {
		return Dispatch.get(this, "DisplayUnit").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayUnit an input-parameter of type int
	 */
	public void setDisplayUnit(int displayUnit) {
		Dispatch.put(this, "DisplayUnit", new Variant(displayUnit));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getDisplayUnitCustom() {
		return Dispatch.get(this, "DisplayUnitCustom").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayUnitCustom an input-parameter of type double
	 */
	public void setDisplayUnitCustom(double displayUnitCustom) {
		Dispatch.put(this, "DisplayUnitCustom", new Variant(displayUnitCustom));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasDisplayUnitLabel() {
		return Dispatch.get(this, "HasDisplayUnitLabel").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasDisplayUnitLabel an input-parameter of type boolean
	 */
	public void setHasDisplayUnitLabel(boolean hasDisplayUnitLabel) {
		Dispatch.put(this, "HasDisplayUnitLabel", new Variant(hasDisplayUnitLabel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DisplayUnitLabel
	 */
	public DisplayUnitLabel getDisplayUnitLabel() {
		return new DisplayUnitLabel(Dispatch.get(this, "DisplayUnitLabel").toDispatch());
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

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getParent() {
		return Dispatch.get(this, "Parent");
	}

}
