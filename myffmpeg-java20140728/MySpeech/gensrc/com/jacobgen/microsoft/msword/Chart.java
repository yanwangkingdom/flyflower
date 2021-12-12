/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Chart extends Dispatch {

	public static final String componentName = "Word.Chart";

	public Chart() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Chart(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Chart(String compName) {
		super(compName);
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
	 * @return the result is of type ChartTitle
	 */
	public ChartTitle getChartTitle() {
		return new ChartTitle(Dispatch.get(this, "ChartTitle").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDepthPercent() {
		return Dispatch.get(this, "DepthPercent").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param depthPercent an input-parameter of type int
	 */
	public void setDepthPercent(int depthPercent) {
		Dispatch.put(this, "DepthPercent", new Variant(depthPercent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getElevation() {
		return Dispatch.get(this, "Elevation").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param elevation an input-parameter of type int
	 */
	public void setElevation(int elevation) {
		Dispatch.put(this, "Elevation", new Variant(elevation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getGapDepth() {
		return Dispatch.get(this, "GapDepth").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gapDepth an input-parameter of type int
	 */
	public void setGapDepth(int gapDepth) {
		Dispatch.put(this, "GapDepth", new Variant(gapDepth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHeightPercent() {
		return Dispatch.get(this, "HeightPercent").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param heightPercent an input-parameter of type int
	 */
	public void setHeightPercent(int heightPercent) {
		Dispatch.put(this, "HeightPercent", new Variant(heightPercent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPerspective() {
		return Dispatch.get(this, "Perspective").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param perspective an input-parameter of type int
	 */
	public void setPerspective(int perspective) {
		Dispatch.put(this, "Perspective", new Variant(perspective));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getRightAngleAxes() {
		return Dispatch.get(this, "RightAngleAxes");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rightAngleAxes an input-parameter of type Variant
	 */
	public void setRightAngleAxes(Variant rightAngleAxes) {
		Dispatch.put(this, "RightAngleAxes", rightAngleAxes);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getRotation() {
		return Dispatch.get(this, "Rotation");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rotation an input-parameter of type Variant
	 */
	public void setRotation(Variant rotation) {
		Dispatch.put(this, "Rotation", rotation);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDisplayBlanksAs() {
		return Dispatch.get(this, "DisplayBlanksAs").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayBlanksAs an input-parameter of type int
	 */
	public void setDisplayBlanksAs(int displayBlanksAs) {
		Dispatch.put(this, "DisplayBlanksAs", new Variant(displayBlanksAs));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object getChartGroups(Variant index) {
		return Dispatch.call(this, "ChartGroups", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getChartGroups() {
		return Dispatch.get(this, "ChartGroups");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object getChartGroups(Variant index) {
		Object result_of_ChartGroups = Dispatch.call(this, "ChartGroups", index);


		return result_of_ChartGroups;
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
	 * @return the result is of type Corners
	 */
	public Corners getCorners() {
		return new Corners(Dispatch.get(this, "Corners").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param hasLeaderLines an input-parameter of type Variant
	 * @param showSeriesName an input-parameter of type Variant
	 * @param showCategoryName an input-parameter of type Variant
	 * @param showValue an input-parameter of type Variant
	 * @param showPercentage an input-parameter of type Variant
	 * @param showBubbleSize an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 */
	public void applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName, Variant showCategoryName, Variant showValue, Variant showPercentage, Variant showBubbleSize, Variant separator) {
		Dispatch.callN(this, "ApplyDataLabels", new Object[] { new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName, showCategoryName, showValue, showPercentage, showBubbleSize, separator});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param hasLeaderLines an input-parameter of type Variant
	 * @param showSeriesName an input-parameter of type Variant
	 * @param showCategoryName an input-parameter of type Variant
	 * @param showValue an input-parameter of type Variant
	 * @param showPercentage an input-parameter of type Variant
	 * @param showBubbleSize an input-parameter of type Variant
	 */
	public void applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName, Variant showCategoryName, Variant showValue, Variant showPercentage, Variant showBubbleSize) {
		Dispatch.callN(this, "ApplyDataLabels", new Object[] { new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName, showCategoryName, showValue, showPercentage, showBubbleSize});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param hasLeaderLines an input-parameter of type Variant
	 * @param showSeriesName an input-parameter of type Variant
	 * @param showCategoryName an input-parameter of type Variant
	 * @param showValue an input-parameter of type Variant
	 * @param showPercentage an input-parameter of type Variant
	 */
	public void applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName, Variant showCategoryName, Variant showValue, Variant showPercentage) {
		Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName, showCategoryName, showValue, showPercentage);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param hasLeaderLines an input-parameter of type Variant
	 * @param showSeriesName an input-parameter of type Variant
	 * @param showCategoryName an input-parameter of type Variant
	 * @param showValue an input-parameter of type Variant
	 */
	public void applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName, Variant showCategoryName, Variant showValue) {
		Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName, showCategoryName, showValue);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param hasLeaderLines an input-parameter of type Variant
	 * @param showSeriesName an input-parameter of type Variant
	 * @param showCategoryName an input-parameter of type Variant
	 */
	public void applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName, Variant showCategoryName) {
		Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName, showCategoryName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param hasLeaderLines an input-parameter of type Variant
	 * @param showSeriesName an input-parameter of type Variant
	 */
	public void applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName) {
		Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param hasLeaderLines an input-parameter of type Variant
	 */
	public void applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines) {
		Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey, autoText, hasLeaderLines);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 */
	public void applyDataLabels(int type, Variant legendKey, Variant autoText) {
		Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey, autoText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 */
	public void applyDataLabels(int type, Variant legendKey) {
		Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 */
	public void applyDataLabels(int type) {
		Dispatch.call(this, "ApplyDataLabels", new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void applyDataLabels() {
		Dispatch.call(this, "ApplyDataLabels");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param hasLeaderLines an input-parameter of type Variant
	 * @param showSeriesName an input-parameter of type Variant
	 * @param showCategoryName an input-parameter of type Variant
	 * @param showValue an input-parameter of type Variant
	 * @param showPercentage an input-parameter of type Variant
	 * @param showBubbleSize an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 */
	public void applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName, Variant showCategoryName, Variant showValue, Variant showPercentage, Variant showBubbleSize, Variant separator) {
		Dispatch.callN(this, "ApplyDataLabels", new Object[] { new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName, showCategoryName, showValue, showPercentage, showBubbleSize, separator});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XlChartType
	 */
	public XlChartType getChartType() {
		return new XlChartType(Dispatch.get(this, "ChartType").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param chartType an input-parameter of type XlChartType
	 */
	public void setChartType(XlChartType chartType) {
		Dispatch.put(this, "ChartType", chartType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasDataTable() {
		return Dispatch.get(this, "HasDataTable").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasDataTable an input-parameter of type boolean
	 */
	public void setHasDataTable(boolean hasDataTable) {
		Dispatch.put(this, "HasDataTable", new Variant(hasDataTable));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param chartType an input-parameter of type XlChartType
	 * @param typeName an input-parameter of type Variant
	 */
	public void applyCustomType(XlChartType chartType, Variant typeName) {
		Dispatch.call(this, "ApplyCustomType", chartType, typeName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param chartType an input-parameter of type XlChartType
	 */
	public void applyCustomType(XlChartType chartType) {
		Dispatch.call(this, "ApplyCustomType", chartType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param chartType an input-parameter of type XlChartType
	 * @param typeName an input-parameter of type Variant
	 */
	public void applyCustomType(XlChartType chartType, Variant typeName) {
		Dispatch.call(this, "ApplyCustomType", chartType, typeName);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param x an input-parameter of type int
	 * @param y an input-parameter of type int
	 * @param elementID an input-parameter of type int
	 * @param arg1 an input-parameter of type int
	 * @param arg2 an input-parameter of type int
	 */
	public void getChartElement(int x, int y, int elementID, int arg1, int arg2) {
		Dispatch.call(this, "GetChartElement", new Variant(x), new Variant(y), new Variant(elementID), new Variant(arg1), new Variant(arg2));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param x an input-parameter of type int
	 * @param y an input-parameter of type int
	 * @param elementID is an one-element array which sends the input-parameter
	 *                  to the ActiveX-Component and receives the output-parameter
	 * @param arg1 is an one-element array which sends the input-parameter
	 *             to the ActiveX-Component and receives the output-parameter
	 * @param arg2 is an one-element array which sends the input-parameter
	 *             to the ActiveX-Component and receives the output-parameter
	 */
	public void getChartElement(int x, int y, int[] elementID, int[] arg1, int[] arg2) {
		Variant vnt_elementID = new Variant();
		if( elementID == null || elementID.length == 0 )
			vnt_elementID.putNoParam();
		else
			vnt_elementID.putIntRef(elementID[0]);

		Variant vnt_arg1 = new Variant();
		if( arg1 == null || arg1.length == 0 )
			vnt_arg1.putNoParam();
		else
			vnt_arg1.putIntRef(arg1[0]);

		Variant vnt_arg2 = new Variant();
		if( arg2 == null || arg2.length == 0 )
			vnt_arg2.putNoParam();
		else
			vnt_arg2.putIntRef(arg2[0]);

		Dispatch.call(this, "GetChartElement", new Variant(x), new Variant(y), vnt_elementID, vnt_arg1, vnt_arg2);

		if( elementID != null && elementID.length > 0 )
			elementID[0] = vnt_elementID.toInt();
		if( arg1 != null && arg1.length > 0 )
			arg1[0] = vnt_arg1.toInt();
		if( arg2 != null && arg2.length > 0 )
			arg2[0] = vnt_arg2.toInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type String
	 * @param plotBy an input-parameter of type Variant
	 */
	public void setSourceData(String source, Variant plotBy) {
		Dispatch.call(this, "SetSourceData", source, plotBy);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type String
	 */
	public void setSourceData(String source) {
		Dispatch.call(this, "SetSourceData", source);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param source an input-parameter of type String
	 * @param plotBy an input-parameter of type Variant
	 */
	public void setSourceData(String source, Variant plotBy) {
		Dispatch.call(this, "SetSourceData", source, plotBy);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPlotBy() {
		return Dispatch.get(this, "PlotBy").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param plotBy an input-parameter of type int
	 */
	public void setPlotBy(int plotBy) {
		Dispatch.put(this, "PlotBy", new Variant(plotBy));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasLegend() {
		return Dispatch.get(this, "HasLegend").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasLegend an input-parameter of type boolean
	 */
	public void setHasLegend(boolean hasLegend) {
		Dispatch.put(this, "HasLegend", new Variant(hasLegend));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Legend
	 */
	public Legend getLegend() {
		return new Legend(Dispatch.get(this, "Legend").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type Variant
	 * @param axisGroup an input-parameter of type int
	 * @return the result is of type Object
	 */
	public Object axes(Variant type, int axisGroup) {
		return Dispatch.call(this, "Axes", type, new Variant(axisGroup));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object axes(Variant type) {
		return Dispatch.call(this, "Axes", type);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object axes() {
		return Dispatch.call(this, "Axes");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param type an input-parameter of type Variant
	 * @param axisGroup an input-parameter of type int
	 * @return the result is of type Object
	 */
	public Object axes(Variant type, int axisGroup) {
		Object result_of_Axes = Dispatch.call(this, "Axes", type, new Variant(axisGroup));


		return result_of_Axes;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index1 an input-parameter of type Variant
	 * @param index2 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant getHasAxis(Variant index1, Variant index2) {
		return Dispatch.call(this, "HasAxis", index1, index2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index1 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant getHasAxis(Variant index1) {
		return Dispatch.call(this, "HasAxis", index1);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getHasAxis() {
		return Dispatch.get(this, "HasAxis");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index1 an input-parameter of type Variant
	 * @param index2 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant getHasAxis(Variant index1, Variant index2) {
		Variant result_of_HasAxis = Dispatch.call(this, "HasAxis", index1, index2);


		return result_of_HasAxis;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index1 an input-parameter of type Variant
	 * @param index2 an input-parameter of type Variant
	 */
	public void setHasAxis(Variant index1, Variant index2) {
		Dispatch.call(this, "HasAxis", index1, index2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index1 an input-parameter of type Variant
	 */
	public void setHasAxis(Variant index1) {
		Dispatch.put(this, "HasAxis", index1);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void setHasAxis() {
		Dispatch.call(this, "HasAxis");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index1 an input-parameter of type Variant
	 * @param index2 an input-parameter of type Variant
	 */
	public void setHasAxis(Variant index1, Variant index2) {
		Dispatch.call(this, "HasAxis", index1, index2);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Walls
	 */
	public Walls getWalls() {
		return new Walls(Dispatch.get(this, "Walls").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Floor
	 */
	public Floor getFloor() {
		return new Floor(Dispatch.get(this, "Floor").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type PlotArea
	 */
	public PlotArea getPlotArea() {
		return new PlotArea(Dispatch.get(this, "PlotArea").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getPlotVisibleOnly() {
		return Dispatch.get(this, "PlotVisibleOnly").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param plotVisibleOnly an input-parameter of type boolean
	 */
	public void setPlotVisibleOnly(boolean plotVisibleOnly) {
		Dispatch.put(this, "PlotVisibleOnly", new Variant(plotVisibleOnly));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartArea
	 */
	public ChartArea getChartArea() {
		return new ChartArea(Dispatch.get(this, "ChartArea").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gallery an input-parameter of type int
	 * @param format an input-parameter of type Variant
	 */
	public void autoFormat(int gallery, Variant format) {
		Dispatch.call(this, "AutoFormat", new Variant(gallery), format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gallery an input-parameter of type int
	 */
	public void autoFormat(int gallery) {
		Dispatch.call(this, "AutoFormat", new Variant(gallery));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param gallery an input-parameter of type int
	 * @param format an input-parameter of type Variant
	 */
	public void autoFormat(int gallery, Variant format) {
		Dispatch.call(this, "AutoFormat", new Variant(gallery), format);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoScaling() {
		return Dispatch.get(this, "AutoScaling").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoScaling an input-parameter of type boolean
	 */
	public void setAutoScaling(boolean autoScaling) {
		Dispatch.put(this, "AutoScaling", new Variant(autoScaling));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void setBackgroundPicture(String fileName) {
		Dispatch.call(this, "SetBackgroundPicture", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param gallery an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param plotBy an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 * @param seriesLabels an input-parameter of type Variant
	 * @param hasLegend an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 * @param categoryTitle an input-parameter of type Variant
	 * @param valueTitle an input-parameter of type Variant
	 * @param extraTitle an input-parameter of type Variant
	 */
	public void chartWizard(Variant source, Variant gallery, Variant format, Variant plotBy, Variant categoryLabels, Variant seriesLabels, Variant hasLegend, Variant title, Variant categoryTitle, Variant valueTitle, Variant extraTitle) {
		Dispatch.callN(this, "ChartWizard", new Object[] { source, gallery, format, plotBy, categoryLabels, seriesLabels, hasLegend, title, categoryTitle, valueTitle, extraTitle});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param gallery an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param plotBy an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 * @param seriesLabels an input-parameter of type Variant
	 * @param hasLegend an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 * @param categoryTitle an input-parameter of type Variant
	 * @param valueTitle an input-parameter of type Variant
	 */
	public void chartWizard(Variant source, Variant gallery, Variant format, Variant plotBy, Variant categoryLabels, Variant seriesLabels, Variant hasLegend, Variant title, Variant categoryTitle, Variant valueTitle) {
		Dispatch.callN(this, "ChartWizard", new Object[] { source, gallery, format, plotBy, categoryLabels, seriesLabels, hasLegend, title, categoryTitle, valueTitle});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param gallery an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param plotBy an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 * @param seriesLabels an input-parameter of type Variant
	 * @param hasLegend an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 * @param categoryTitle an input-parameter of type Variant
	 */
	public void chartWizard(Variant source, Variant gallery, Variant format, Variant plotBy, Variant categoryLabels, Variant seriesLabels, Variant hasLegend, Variant title, Variant categoryTitle) {
		Dispatch.callN(this, "ChartWizard", new Object[] { source, gallery, format, plotBy, categoryLabels, seriesLabels, hasLegend, title, categoryTitle});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param gallery an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param plotBy an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 * @param seriesLabels an input-parameter of type Variant
	 * @param hasLegend an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 */
	public void chartWizard(Variant source, Variant gallery, Variant format, Variant plotBy, Variant categoryLabels, Variant seriesLabels, Variant hasLegend, Variant title) {
		Dispatch.call(this, "ChartWizard", source, gallery, format, plotBy, categoryLabels, seriesLabels, hasLegend, title);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param gallery an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param plotBy an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 * @param seriesLabels an input-parameter of type Variant
	 * @param hasLegend an input-parameter of type Variant
	 */
	public void chartWizard(Variant source, Variant gallery, Variant format, Variant plotBy, Variant categoryLabels, Variant seriesLabels, Variant hasLegend) {
		Dispatch.call(this, "ChartWizard", source, gallery, format, plotBy, categoryLabels, seriesLabels, hasLegend);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param gallery an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param plotBy an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 * @param seriesLabels an input-parameter of type Variant
	 */
	public void chartWizard(Variant source, Variant gallery, Variant format, Variant plotBy, Variant categoryLabels, Variant seriesLabels) {
		Dispatch.call(this, "ChartWizard", source, gallery, format, plotBy, categoryLabels, seriesLabels);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param gallery an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param plotBy an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 */
	public void chartWizard(Variant source, Variant gallery, Variant format, Variant plotBy, Variant categoryLabels) {
		Dispatch.call(this, "ChartWizard", source, gallery, format, plotBy, categoryLabels);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param gallery an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param plotBy an input-parameter of type Variant
	 */
	public void chartWizard(Variant source, Variant gallery, Variant format, Variant plotBy) {
		Dispatch.call(this, "ChartWizard", source, gallery, format, plotBy);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param gallery an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 */
	public void chartWizard(Variant source, Variant gallery, Variant format) {
		Dispatch.call(this, "ChartWizard", source, gallery, format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param gallery an input-parameter of type Variant
	 */
	public void chartWizard(Variant source, Variant gallery) {
		Dispatch.call(this, "ChartWizard", source, gallery);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 */
	public void chartWizard(Variant source) {
		Dispatch.call(this, "ChartWizard", source);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void chartWizard() {
		Dispatch.call(this, "ChartWizard");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param gallery an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param plotBy an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 * @param seriesLabels an input-parameter of type Variant
	 * @param hasLegend an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 * @param categoryTitle an input-parameter of type Variant
	 * @param valueTitle an input-parameter of type Variant
	 * @param extraTitle an input-parameter of type Variant
	 */
	public void chartWizard(Variant source, Variant gallery, Variant format, Variant plotBy, Variant categoryLabels, Variant seriesLabels, Variant hasLegend, Variant title, Variant categoryTitle, Variant valueTitle, Variant extraTitle) {
		Dispatch.callN(this, "ChartWizard", new Object[] { source, gallery, format, plotBy, categoryLabels, seriesLabels, hasLegend, title, categoryTitle, valueTitle, extraTitle});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param appearance an input-parameter of type int
	 * @param format an input-parameter of type int
	 * @param size an input-parameter of type int
	 */
	public void copyPicture(int appearance, int format, int size) {
		Dispatch.call(this, "CopyPicture", new Variant(appearance), new Variant(format), new Variant(size));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param appearance an input-parameter of type int
	 * @param format an input-parameter of type int
	 */
	public void copyPicture(int appearance, int format) {
		Dispatch.call(this, "CopyPicture", new Variant(appearance), new Variant(format));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param appearance an input-parameter of type int
	 */
	public void copyPicture(int appearance) {
		Dispatch.call(this, "CopyPicture", new Variant(appearance));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void copyPicture() {
		Dispatch.call(this, "CopyPicture");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param appearance an input-parameter of type int
	 * @param format an input-parameter of type int
	 * @param size an input-parameter of type int
	 */
	public void copyPicture(int appearance, int format, int size) {
		Dispatch.call(this, "CopyPicture", new Variant(appearance), new Variant(format), new Variant(size));

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DataTable
	 */
	public DataTable getDataTable() {
		return new DataTable(Dispatch.get(this, "DataTable").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type Variant
	 */
	public void paste(Variant type) {
		Dispatch.call(this, "Paste", type);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void paste() {
		Dispatch.call(this, "Paste");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param type an input-parameter of type Variant
	 */
	public void paste(Variant type) {
		Dispatch.call(this, "Paste", type);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBarShape() {
		return Dispatch.get(this, "BarShape").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param barShape an input-parameter of type int
	 */
	public void setBarShape(int barShape) {
		Dispatch.put(this, "BarShape", new Variant(barShape));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param filterName an input-parameter of type Variant
	 * @param interactive an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean export(String fileName, Variant filterName, Variant interactive) {
		return Dispatch.call(this, "Export", fileName, filterName, interactive).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param filterName an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean export(String fileName, Variant filterName) {
		return Dispatch.call(this, "Export", fileName, filterName).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean export(String fileName) {
		return Dispatch.call(this, "Export", fileName).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param filterName an input-parameter of type Variant
	 * @param interactive an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean export(String fileName, Variant filterName, Variant interactive) {
		boolean result_of_Export = Dispatch.call(this, "Export", fileName, filterName, interactive).changeType(Variant.VariantBoolean).getBoolean();


		return result_of_Export;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 */
	public void setDefaultChart(Variant name) {
		Dispatch.call(this, "SetDefaultChart", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void applyChartTemplate(String fileName) {
		Dispatch.call(this, "ApplyChartTemplate", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void saveChartTemplate(String fileName) {
		Dispatch.call(this, "SaveChartTemplate", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Walls
	 */
	public Walls getSideWall() {
		return new Walls(Dispatch.get(this, "SideWall").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Walls
	 */
	public Walls getBackWall() {
		return new Walls(Dispatch.get(this, "BackWall").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getChartStyle() {
		return Dispatch.get(this, "ChartStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param chartStyle an input-parameter of type Variant
	 */
	public void setChartStyle(Variant chartStyle) {
		Dispatch.put(this, "ChartStyle", chartStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clearToMatchStyle() {
		Dispatch.call(this, "ClearToMatchStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getPivotLayout() {
		return Dispatch.get(this, "PivotLayout");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasPivotFields() {
		return Dispatch.get(this, "HasPivotFields").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasPivotFields an input-parameter of type boolean
	 */
	public void setHasPivotFields(boolean hasPivotFields) {
		Dispatch.put(this, "HasPivotFields", new Variant(hasPivotFields));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowDataLabelsOverMaximum() {
		return Dispatch.get(this, "ShowDataLabelsOverMaximum").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showDataLabelsOverMaximum an input-parameter of type boolean
	 */
	public void setShowDataLabelsOverMaximum(boolean showDataLabelsOverMaximum) {
		Dispatch.put(this, "ShowDataLabelsOverMaximum", new Variant(showDataLabelsOverMaximum));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param layout an input-parameter of type int
	 * @param chartType an input-parameter of type Variant
	 */
	public void applyLayout(int layout, Variant chartType) {
		Dispatch.call(this, "ApplyLayout", new Variant(layout), chartType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param layout an input-parameter of type int
	 */
	public void applyLayout(int layout) {
		Dispatch.call(this, "ApplyLayout", new Variant(layout));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param layout an input-parameter of type int
	 * @param chartType an input-parameter of type Variant
	 */
	public void applyLayout(int layout, Variant chartType) {
		Dispatch.call(this, "ApplyLayout", new Variant(layout), chartType);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void refresh() {
		Dispatch.call(this, "Refresh");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param element an input-parameter of type MsoChartElementType
	 */
	public void setElement(MsoChartElementType element) {
		Dispatch.call(this, "SetElement", element);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartData
	 */
	public ChartData getChartData() {
		return new ChartData(Dispatch.get(this, "ChartData").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getShapes() {
		return Dispatch.get(this, "Shapes");
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
	 * @return the result is of type ChartGroup
	 */
	public ChartGroup getArea3DGroup() {
		return new ChartGroup(Dispatch.get(this, "Area3DGroup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object areaGroups(Variant index) {
		return Dispatch.call(this, "AreaGroups", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object areaGroups() {
		return Dispatch.call(this, "AreaGroups");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object areaGroups(Variant index) {
		Object result_of_AreaGroups = Dispatch.call(this, "AreaGroups", index);


		return result_of_AreaGroups;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartGroup
	 */
	public ChartGroup getBar3DGroup() {
		return new ChartGroup(Dispatch.get(this, "Bar3DGroup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object barGroups(Variant index) {
		return Dispatch.call(this, "BarGroups", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object barGroups() {
		return Dispatch.call(this, "BarGroups");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object barGroups(Variant index) {
		Object result_of_BarGroups = Dispatch.call(this, "BarGroups", index);


		return result_of_BarGroups;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartGroup
	 */
	public ChartGroup getColumn3DGroup() {
		return new ChartGroup(Dispatch.get(this, "Column3DGroup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object columnGroups(Variant index) {
		return Dispatch.call(this, "ColumnGroups", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object columnGroups() {
		return Dispatch.call(this, "ColumnGroups");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object columnGroups(Variant index) {
		Object result_of_ColumnGroups = Dispatch.call(this, "ColumnGroups", index);


		return result_of_ColumnGroups;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartGroup
	 */
	public ChartGroup getLine3DGroup() {
		return new ChartGroup(Dispatch.get(this, "Line3DGroup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object lineGroups(Variant index) {
		return Dispatch.call(this, "LineGroups", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object lineGroups() {
		return Dispatch.call(this, "LineGroups");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object lineGroups(Variant index) {
		Object result_of_LineGroups = Dispatch.call(this, "LineGroups", index);


		return result_of_LineGroups;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartGroup
	 */
	public ChartGroup getPie3DGroup() {
		return new ChartGroup(Dispatch.get(this, "Pie3DGroup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object pieGroups(Variant index) {
		return Dispatch.call(this, "PieGroups", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object pieGroups() {
		return Dispatch.call(this, "PieGroups");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object pieGroups(Variant index) {
		Object result_of_PieGroups = Dispatch.call(this, "PieGroups", index);


		return result_of_PieGroups;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object doughnutGroups(Variant index) {
		return Dispatch.call(this, "DoughnutGroups", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object doughnutGroups() {
		return Dispatch.call(this, "DoughnutGroups");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object doughnutGroups(Variant index) {
		Object result_of_DoughnutGroups = Dispatch.call(this, "DoughnutGroups", index);


		return result_of_DoughnutGroups;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object radarGroups(Variant index) {
		return Dispatch.call(this, "RadarGroups", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object radarGroups() {
		return Dispatch.call(this, "RadarGroups");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object radarGroups(Variant index) {
		Object result_of_RadarGroups = Dispatch.call(this, "RadarGroups", index);


		return result_of_RadarGroups;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartGroup
	 */
	public ChartGroup getSurfaceGroup() {
		return new ChartGroup(Dispatch.get(this, "SurfaceGroup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object xYGroups(Variant index) {
		return Dispatch.call(this, "XYGroups", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object xYGroups() {
		return Dispatch.call(this, "XYGroups");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object xYGroups(Variant index) {
		Object result_of_XYGroups = Dispatch.call(this, "XYGroups", index);


		return result_of_XYGroups;
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
	 * @param before an input-parameter of type Variant
	 * @param after an input-parameter of type Variant
	 */
	public void copy(Variant before, Variant after) {
		Dispatch.call(this, "Copy", before, after);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param before an input-parameter of type Variant
	 */
	public void copy(Variant before) {
		Dispatch.call(this, "Copy", before);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void copy() {
		Dispatch.call(this, "Copy");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param before an input-parameter of type Variant
	 * @param after an input-parameter of type Variant
	 */
	public void copy(Variant before, Variant after) {
		Dispatch.call(this, "Copy", before, after);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param replace an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant select(Variant replace) {
		return Dispatch.call(this, "Select", replace);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant select() {
		return Dispatch.call(this, "Select");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param replace an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant select(Variant replace) {
		Variant result_of_Select = Dispatch.call(this, "Select", replace);


		return result_of_Select;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowReportFilterFieldButtons() {
		return Dispatch.get(this, "ShowReportFilterFieldButtons").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showReportFilterFieldButtons an input-parameter of type boolean
	 */
	public void setShowReportFilterFieldButtons(boolean showReportFilterFieldButtons) {
		Dispatch.put(this, "ShowReportFilterFieldButtons", new Variant(showReportFilterFieldButtons));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowLegendFieldButtons() {
		return Dispatch.get(this, "ShowLegendFieldButtons").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showLegendFieldButtons an input-parameter of type boolean
	 */
	public void setShowLegendFieldButtons(boolean showLegendFieldButtons) {
		Dispatch.put(this, "ShowLegendFieldButtons", new Variant(showLegendFieldButtons));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowAxisFieldButtons() {
		return Dispatch.get(this, "ShowAxisFieldButtons").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showAxisFieldButtons an input-parameter of type boolean
	 */
	public void setShowAxisFieldButtons(boolean showAxisFieldButtons) {
		Dispatch.put(this, "ShowAxisFieldButtons", new Variant(showAxisFieldButtons));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowValueFieldButtons() {
		return Dispatch.get(this, "ShowValueFieldButtons").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showValueFieldButtons an input-parameter of type boolean
	 */
	public void setShowValueFieldButtons(boolean showValueFieldButtons) {
		Dispatch.put(this, "ShowValueFieldButtons", new Variant(showValueFieldButtons));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowAllFieldButtons() {
		return Dispatch.get(this, "ShowAllFieldButtons").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showAllFieldButtons an input-parameter of type boolean
	 */
	public void setShowAllFieldButtons(boolean showAllFieldButtons) {
		Dispatch.put(this, "ShowAllFieldButtons", new Variant(showAllFieldButtons));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object fullSeriesCollection(Variant index) {
		return Dispatch.call(this, "FullSeriesCollection", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object fullSeriesCollection() {
		return Dispatch.call(this, "FullSeriesCollection");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object fullSeriesCollection(Variant index) {
		Object result_of_FullSeriesCollection = Dispatch.call(this, "FullSeriesCollection", index);


		return result_of_FullSeriesCollection;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCategoryLabelLevel() {
		return Dispatch.get(this, "CategoryLabelLevel").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param categoryLabelLevel an input-parameter of type int
	 */
	public void setCategoryLabelLevel(int categoryLabelLevel) {
		Dispatch.put(this, "CategoryLabelLevel", new Variant(categoryLabelLevel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSeriesNameLevel() {
		return Dispatch.get(this, "SeriesNameLevel").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param seriesNameLevel an input-parameter of type int
	 */
	public void setSeriesNameLevel(int seriesNameLevel) {
		Dispatch.put(this, "SeriesNameLevel", new Variant(seriesNameLevel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasHiddenContent() {
		return Dispatch.get(this, "HasHiddenContent").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void deleteHiddenContent() {
		Dispatch.call(this, "DeleteHiddenContent");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getChartColor() {
		return Dispatch.get(this, "ChartColor");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param chartColor an input-parameter of type Variant
	 */
	public void setChartColor(Variant chartColor) {
		Dispatch.put(this, "ChartColor", chartColor);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clearToMatchColorStyle() {
		Dispatch.call(this, "ClearToMatchColorStyle");
	}

}
