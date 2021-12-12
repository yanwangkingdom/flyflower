/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ChartGroup extends Dispatch {

	public static final String componentName = "Word.ChartGroup";

	public ChartGroup() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ChartGroup(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ChartGroup(String compName) {
		super(compName);
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
	 * @param axisGroup an input-parameter of type int
	 */
	public void setAxisGroup(int axisGroup) {
		Dispatch.put(this, "AxisGroup", new Variant(axisGroup));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDoughnutHoleSize() {
		return Dispatch.get(this, "DoughnutHoleSize").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doughnutHoleSize an input-parameter of type int
	 */
	public void setDoughnutHoleSize(int doughnutHoleSize) {
		Dispatch.put(this, "DoughnutHoleSize", new Variant(doughnutHoleSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DownBars
	 */
	public DownBars getDownBars() {
		return new DownBars(Dispatch.get(this, "DownBars").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DropLines
	 */
	public DropLines getDropLines() {
		return new DropLines(Dispatch.get(this, "DropLines").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFirstSliceAngle() {
		return Dispatch.get(this, "FirstSliceAngle").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param firstSliceAngle an input-parameter of type int
	 */
	public void setFirstSliceAngle(int firstSliceAngle) {
		Dispatch.put(this, "FirstSliceAngle", new Variant(firstSliceAngle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getGapWidth() {
		return Dispatch.get(this, "GapWidth").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gapWidth an input-parameter of type int
	 */
	public void setGapWidth(int gapWidth) {
		Dispatch.put(this, "GapWidth", new Variant(gapWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasDropLines() {
		return Dispatch.get(this, "HasDropLines").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasDropLines an input-parameter of type boolean
	 */
	public void setHasDropLines(boolean hasDropLines) {
		Dispatch.put(this, "HasDropLines", new Variant(hasDropLines));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasHiLoLines() {
		return Dispatch.get(this, "HasHiLoLines").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasHiLoLines an input-parameter of type boolean
	 */
	public void setHasHiLoLines(boolean hasHiLoLines) {
		Dispatch.put(this, "HasHiLoLines", new Variant(hasHiLoLines));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasRadarAxisLabels() {
		return Dispatch.get(this, "HasRadarAxisLabels").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasRadarAxisLabels an input-parameter of type boolean
	 */
	public void setHasRadarAxisLabels(boolean hasRadarAxisLabels) {
		Dispatch.put(this, "HasRadarAxisLabels", new Variant(hasRadarAxisLabels));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasSeriesLines() {
		return Dispatch.get(this, "HasSeriesLines").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasSeriesLines an input-parameter of type boolean
	 */
	public void setHasSeriesLines(boolean hasSeriesLines) {
		Dispatch.put(this, "HasSeriesLines", new Variant(hasSeriesLines));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasUpDownBars() {
		return Dispatch.get(this, "HasUpDownBars").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasUpDownBars an input-parameter of type boolean
	 */
	public void setHasUpDownBars(boolean hasUpDownBars) {
		Dispatch.put(this, "HasUpDownBars", new Variant(hasUpDownBars));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type HiLoLines
	 */
	public HiLoLines getHiLoLines() {
		return new HiLoLines(Dispatch.get(this, "HiLoLines").toDispatch());
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
	 * @return the result is of type int
	 */
	public int getOverlap() {
		return Dispatch.get(this, "Overlap").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param overlap an input-parameter of type int
	 */
	public void setOverlap(int overlap) {
		Dispatch.put(this, "Overlap", new Variant(overlap));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TickLabels
	 */
	public TickLabels getRadarAxisLabels() {
		return new TickLabels(Dispatch.get(this, "RadarAxisLabels").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object seriesCollection(Variant index) {
		return Dispatch.call(this, "SeriesCollection", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object seriesCollection() {
		return Dispatch.call(this, "SeriesCollection");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object seriesCollection(Variant index) {
		Object result_of_SeriesCollection = Dispatch.call(this, "SeriesCollection", index);


		return result_of_SeriesCollection;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SeriesLines
	 */
	public SeriesLines getSeriesLines() {
		return new SeriesLines(Dispatch.get(this, "SeriesLines").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSubType() {
		return Dispatch.get(this, "SubType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param subType an input-parameter of type int
	 */
	public void setSubType(int subType) {
		Dispatch.put(this, "SubType", new Variant(subType));
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
	 * @return the result is of type UpBars
	 */
	public UpBars getUpBars() {
		return new UpBars(Dispatch.get(this, "UpBars").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getVaryByCategories() {
		return Dispatch.get(this, "VaryByCategories").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param varyByCategories an input-parameter of type boolean
	 */
	public void setVaryByCategories(boolean varyByCategories) {
		Dispatch.put(this, "VaryByCategories", new Variant(varyByCategories));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSizeRepresents() {
		return Dispatch.get(this, "SizeRepresents").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sizeRepresents an input-parameter of type int
	 */
	public void setSizeRepresents(int sizeRepresents) {
		Dispatch.put(this, "SizeRepresents", new Variant(sizeRepresents));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBubbleScale() {
		return Dispatch.get(this, "BubbleScale").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bubbleScale an input-parameter of type int
	 */
	public void setBubbleScale(int bubbleScale) {
		Dispatch.put(this, "BubbleScale", new Variant(bubbleScale));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowNegativeBubbles() {
		return Dispatch.get(this, "ShowNegativeBubbles").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showNegativeBubbles an input-parameter of type boolean
	 */
	public void setShowNegativeBubbles(boolean showNegativeBubbles) {
		Dispatch.put(this, "ShowNegativeBubbles", new Variant(showNegativeBubbles));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSplitType() {
		return Dispatch.get(this, "SplitType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param splitType an input-parameter of type int
	 */
	public void setSplitType(int splitType) {
		Dispatch.put(this, "SplitType", new Variant(splitType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getSplitValue() {
		return Dispatch.get(this, "SplitValue");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param splitValue an input-parameter of type Variant
	 */
	public void setSplitValue(Variant splitValue) {
		Dispatch.put(this, "SplitValue", splitValue);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSecondPlotSize() {
		return Dispatch.get(this, "SecondPlotSize").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param secondPlotSize an input-parameter of type int
	 */
	public void setSecondPlotSize(int secondPlotSize) {
		Dispatch.put(this, "SecondPlotSize", new Variant(secondPlotSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHas3DShading() {
		return Dispatch.get(this, "Has3DShading").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param has3DShading an input-parameter of type boolean
	 */
	public void setHas3DShading(boolean has3DShading) {
		Dispatch.put(this, "Has3DShading", new Variant(has3DShading));
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

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object categoryCollection(Variant index) {
		return Dispatch.call(this, "CategoryCollection", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object categoryCollection() {
		return Dispatch.call(this, "CategoryCollection");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object categoryCollection(Variant index) {
		Object result_of_CategoryCollection = Dispatch.call(this, "CategoryCollection", index);


		return result_of_CategoryCollection;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object fullCategoryCollection(Variant index) {
		return Dispatch.call(this, "FullCategoryCollection", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object fullCategoryCollection() {
		return Dispatch.call(this, "FullCategoryCollection");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object fullCategoryCollection(Variant index) {
		Object result_of_FullCategoryCollection = Dispatch.call(this, "FullCategoryCollection", index);


		return result_of_FullCategoryCollection;
	}

}
