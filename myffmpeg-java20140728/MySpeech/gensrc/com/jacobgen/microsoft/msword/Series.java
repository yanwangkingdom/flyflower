/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Series extends Dispatch {

	public static final String componentName = "Word.Series";

	public Series() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Series(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Series(String compName) {
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
	 * @return the result is of type ChartBorder
	 */
	public ChartBorder getBorder() {
		return new ChartBorder(Dispatch.get(this, "Border").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant clearFormats() {
		return Dispatch.call(this, "ClearFormats");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant copy() {
		return Dispatch.call(this, "Copy");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object dataLabels(Variant index) {
		return Dispatch.call(this, "DataLabels", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object dataLabels() {
		return Dispatch.call(this, "DataLabels");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object dataLabels(Variant index) {
		Object result_of_DataLabels = Dispatch.call(this, "DataLabels", index);


		return result_of_DataLabels;
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
	 * @param direction an input-parameter of type int
	 * @param include an input-parameter of type int
	 * @param type an input-parameter of type int
	 * @param amount an input-parameter of type Variant
	 * @param minusValues an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant errorBar(int direction, int include, int type, Variant amount, Variant minusValues) {
		return Dispatch.call(this, "ErrorBar", new Variant(direction), new Variant(include), new Variant(type), amount, minusValues);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param direction an input-parameter of type int
	 * @param include an input-parameter of type int
	 * @param type an input-parameter of type int
	 * @param amount an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant errorBar(int direction, int include, int type, Variant amount) {
		return Dispatch.call(this, "ErrorBar", new Variant(direction), new Variant(include), new Variant(type), amount);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param direction an input-parameter of type int
	 * @param include an input-parameter of type int
	 * @param type an input-parameter of type int
	 * @return the result is of type Variant
	 */
	public Variant errorBar(int direction, int include, int type) {
		return Dispatch.call(this, "ErrorBar", new Variant(direction), new Variant(include), new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param direction an input-parameter of type int
	 * @param include an input-parameter of type int
	 * @param type an input-parameter of type int
	 * @param amount an input-parameter of type Variant
	 * @param minusValues an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant errorBar(int direction, int include, int type, Variant amount, Variant minusValues) {
		Variant result_of_ErrorBar = Dispatch.call(this, "ErrorBar", new Variant(direction), new Variant(include), new Variant(type), amount, minusValues);


		return result_of_ErrorBar;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ErrorBars
	 */
	public ErrorBars getErrorBars() {
		return new ErrorBars(Dispatch.get(this, "ErrorBars").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getExplosion() {
		return Dispatch.get(this, "Explosion").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param explosion an input-parameter of type int
	 */
	public void setExplosion(int explosion) {
		Dispatch.put(this, "Explosion", new Variant(explosion));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFormula() {
		return Dispatch.get(this, "Formula").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formula an input-parameter of type String
	 */
	public void setFormula(String formula) {
		Dispatch.put(this, "Formula", formula);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFormulaLocal() {
		return Dispatch.get(this, "FormulaLocal").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formulaLocal an input-parameter of type String
	 */
	public void setFormulaLocal(String formulaLocal) {
		Dispatch.put(this, "FormulaLocal", formulaLocal);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFormulaR1C1() {
		return Dispatch.get(this, "FormulaR1C1").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formulaR1C1 an input-parameter of type String
	 */
	public void setFormulaR1C1(String formulaR1C1) {
		Dispatch.put(this, "FormulaR1C1", formulaR1C1);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFormulaR1C1Local() {
		return Dispatch.get(this, "FormulaR1C1Local").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formulaR1C1Local an input-parameter of type String
	 */
	public void setFormulaR1C1Local(String formulaR1C1Local) {
		Dispatch.put(this, "FormulaR1C1Local", formulaR1C1Local);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasDataLabels() {
		return Dispatch.get(this, "HasDataLabels").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasDataLabels an input-parameter of type boolean
	 */
	public void setHasDataLabels(boolean hasDataLabels) {
		Dispatch.put(this, "HasDataLabels", new Variant(hasDataLabels));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasErrorBars() {
		return Dispatch.get(this, "HasErrorBars").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasErrorBars an input-parameter of type boolean
	 */
	public void setHasErrorBars(boolean hasErrorBars) {
		Dispatch.put(this, "HasErrorBars", new Variant(hasErrorBars));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Interior
	 */
	public Interior getInterior() {
		return new Interior(Dispatch.get(this, "Interior").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartFillFormat
	 */
	public ChartFillFormat getFill() {
		return new ChartFillFormat(Dispatch.get(this, "Fill").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getInvertIfNegative() {
		return Dispatch.get(this, "InvertIfNegative").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param invertIfNegative an input-parameter of type boolean
	 */
	public void setInvertIfNegative(boolean invertIfNegative) {
		Dispatch.put(this, "InvertIfNegative", new Variant(invertIfNegative));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMarkerBackgroundColor() {
		return Dispatch.get(this, "MarkerBackgroundColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param markerBackgroundColor an input-parameter of type int
	 */
	public void setMarkerBackgroundColor(int markerBackgroundColor) {
		Dispatch.put(this, "MarkerBackgroundColor", new Variant(markerBackgroundColor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMarkerBackgroundColorIndex() {
		return Dispatch.get(this, "MarkerBackgroundColorIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param markerBackgroundColorIndex an input-parameter of type int
	 */
	public void setMarkerBackgroundColorIndex(int markerBackgroundColorIndex) {
		Dispatch.put(this, "MarkerBackgroundColorIndex", new Variant(markerBackgroundColorIndex));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMarkerForegroundColor() {
		return Dispatch.get(this, "MarkerForegroundColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param markerForegroundColor an input-parameter of type int
	 */
	public void setMarkerForegroundColor(int markerForegroundColor) {
		Dispatch.put(this, "MarkerForegroundColor", new Variant(markerForegroundColor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMarkerForegroundColorIndex() {
		return Dispatch.get(this, "MarkerForegroundColorIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param markerForegroundColorIndex an input-parameter of type int
	 */
	public void setMarkerForegroundColorIndex(int markerForegroundColorIndex) {
		Dispatch.put(this, "MarkerForegroundColorIndex", new Variant(markerForegroundColorIndex));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMarkerSize() {
		return Dispatch.get(this, "MarkerSize").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param markerSize an input-parameter of type int
	 */
	public void setMarkerSize(int markerSize) {
		Dispatch.put(this, "MarkerSize", new Variant(markerSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMarkerStyle() {
		return Dispatch.get(this, "MarkerStyle").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param markerStyle an input-parameter of type int
	 */
	public void setMarkerStyle(int markerStyle) {
		Dispatch.put(this, "MarkerStyle", new Variant(markerStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getName() {
		return Dispatch.get(this, "Name").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void setName(String name) {
		Dispatch.put(this, "Name", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant paste() {
		return Dispatch.call(this, "Paste");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPictureType() {
		return Dispatch.get(this, "PictureType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pictureType an input-parameter of type int
	 */
	public void setPictureType(int pictureType) {
		Dispatch.put(this, "PictureType", new Variant(pictureType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getPictureUnit() {
		return Dispatch.get(this, "PictureUnit").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pictureUnit an input-parameter of type double
	 */
	public void setPictureUnit(double pictureUnit) {
		Dispatch.put(this, "PictureUnit", new Variant(pictureUnit));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPlotOrder() {
		return Dispatch.get(this, "PlotOrder").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param plotOrder an input-parameter of type int
	 */
	public void setPlotOrder(int plotOrder) {
		Dispatch.put(this, "PlotOrder", new Variant(plotOrder));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object points(Variant index) {
		return Dispatch.call(this, "Points", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object points() {
		return Dispatch.call(this, "Points");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object points(Variant index) {
		Object result_of_Points = Dispatch.call(this, "Points", index);


		return result_of_Points;
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
	 * @return the result is of type boolean
	 */
	public boolean getSmooth() {
		return Dispatch.get(this, "Smooth").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param smooth an input-parameter of type boolean
	 */
	public void setSmooth(boolean smooth) {
		Dispatch.put(this, "Smooth", new Variant(smooth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object trendlines(Variant index) {
		return Dispatch.call(this, "Trendlines", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object trendlines() {
		return Dispatch.call(this, "Trendlines");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object trendlines(Variant index) {
		Object result_of_Trendlines = Dispatch.call(this, "Trendlines", index);


		return result_of_Trendlines;
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
	 * @param chartType an input-parameter of type XlChartType
	 */
	public void applyCustomType(XlChartType chartType) {
		Dispatch.call(this, "ApplyCustomType", chartType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getValues() {
		return Dispatch.get(this, "Values");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param values an input-parameter of type Variant
	 */
	public void setValues(Variant values) {
		Dispatch.put(this, "Values", values);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getXValues() {
		return Dispatch.get(this, "XValues");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xValues an input-parameter of type Variant
	 */
	public void setXValues(Variant xValues) {
		Dispatch.put(this, "XValues", xValues);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getBubbleSizes() {
		return Dispatch.get(this, "BubbleSizes");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bubbleSizes an input-parameter of type Variant
	 */
	public void setBubbleSizes(Variant bubbleSizes) {
		Dispatch.put(this, "BubbleSizes", bubbleSizes);
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
	 * @return the result is of type boolean
	 */
	public boolean getApplyPictToSides() {
		return Dispatch.get(this, "ApplyPictToSides").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param applyPictToSides an input-parameter of type boolean
	 */
	public void setApplyPictToSides(boolean applyPictToSides) {
		Dispatch.put(this, "ApplyPictToSides", new Variant(applyPictToSides));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getApplyPictToFront() {
		return Dispatch.get(this, "ApplyPictToFront").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param applyPictToFront an input-parameter of type boolean
	 */
	public void setApplyPictToFront(boolean applyPictToFront) {
		Dispatch.put(this, "ApplyPictToFront", new Variant(applyPictToFront));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getApplyPictToEnd() {
		return Dispatch.get(this, "ApplyPictToEnd").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param applyPictToEnd an input-parameter of type boolean
	 */
	public void setApplyPictToEnd(boolean applyPictToEnd) {
		Dispatch.put(this, "ApplyPictToEnd", new Variant(applyPictToEnd));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHas3DEffect() {
		return Dispatch.get(this, "Has3DEffect").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param has3DEffect an input-parameter of type boolean
	 */
	public void setHas3DEffect(boolean has3DEffect) {
		Dispatch.put(this, "Has3DEffect", new Variant(has3DEffect));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShadow() {
		return Dispatch.get(this, "Shadow").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shadow an input-parameter of type boolean
	 */
	public void setShadow(boolean shadow) {
		Dispatch.put(this, "Shadow", new Variant(shadow));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasLeaderLines() {
		return Dispatch.get(this, "HasLeaderLines").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasLeaderLines an input-parameter of type boolean
	 */
	public void setHasLeaderLines(boolean hasLeaderLines) {
		Dispatch.put(this, "HasLeaderLines", new Variant(hasLeaderLines));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type LeaderLines
	 */
	public LeaderLines getLeaderLines() {
		return new LeaderLines(Dispatch.get(this, "LeaderLines").toDispatch());
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
	 * @return the result is of type Variant
	 */
	public Variant applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName, Variant showCategoryName, Variant showValue, Variant showPercentage, Variant showBubbleSize, Variant separator) {
		return Dispatch.callN(this, "ApplyDataLabels", new Object[] { new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName, showCategoryName, showValue, showPercentage, showBubbleSize, separator});
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
	 * @return the result is of type Variant
	 */
	public Variant applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName, Variant showCategoryName, Variant showValue, Variant showPercentage, Variant showBubbleSize) {
		return Dispatch.callN(this, "ApplyDataLabels", new Object[] { new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName, showCategoryName, showValue, showPercentage, showBubbleSize});
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
	 * @return the result is of type Variant
	 */
	public Variant applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName, Variant showCategoryName, Variant showValue, Variant showPercentage) {
		return Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName, showCategoryName, showValue, showPercentage);
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
	 * @return the result is of type Variant
	 */
	public Variant applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName, Variant showCategoryName, Variant showValue) {
		return Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName, showCategoryName, showValue);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param hasLeaderLines an input-parameter of type Variant
	 * @param showSeriesName an input-parameter of type Variant
	 * @param showCategoryName an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName, Variant showCategoryName) {
		return Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName, showCategoryName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param hasLeaderLines an input-parameter of type Variant
	 * @param showSeriesName an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName) {
		return Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @param hasLeaderLines an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines) {
		return Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey, autoText, hasLeaderLines);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @param autoText an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant applyDataLabels(int type, Variant legendKey, Variant autoText) {
		return Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey, autoText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param legendKey an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant applyDataLabels(int type, Variant legendKey) {
		return Dispatch.call(this, "ApplyDataLabels", new Variant(type), legendKey);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @return the result is of type Variant
	 */
	public Variant applyDataLabels(int type) {
		return Dispatch.call(this, "ApplyDataLabels", new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant applyDataLabels() {
		return Dispatch.call(this, "ApplyDataLabels");
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
	 * @return the result is of type Variant
	 */
	public Variant applyDataLabels(int type, Variant legendKey, Variant autoText, Variant hasLeaderLines, Variant showSeriesName, Variant showCategoryName, Variant showValue, Variant showPercentage, Variant showBubbleSize, Variant separator) {
		Variant result_of_ApplyDataLabels = Dispatch.callN(this, "ApplyDataLabels", new Object[] { new Variant(type), legendKey, autoText, hasLeaderLines, showSeriesName, showCategoryName, showValue, showPercentage, showBubbleSize, separator});


		return result_of_ApplyDataLabels;
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
	 * @return the result is of type double
	 */
	public double getPictureUnit2() {
		return Dispatch.get(this, "PictureUnit2").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pictureUnit2 an input-parameter of type double
	 */
	public void setPictureUnit2(double pictureUnit2) {
		Dispatch.put(this, "PictureUnit2", new Variant(pictureUnit2));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPlotColorIndex() {
		return Dispatch.get(this, "PlotColorIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getInvertColor() {
		return Dispatch.get(this, "InvertColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param invertColor an input-parameter of type int
	 */
	public void setInvertColor(int invertColor) {
		Dispatch.put(this, "InvertColor", new Variant(invertColor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getInvertColorIndex() {
		return Dispatch.get(this, "InvertColorIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param invertColorIndex an input-parameter of type int
	 */
	public void setInvertColorIndex(int invertColorIndex) {
		Dispatch.put(this, "InvertColorIndex", new Variant(invertColorIndex));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIsFiltered() {
		return Dispatch.get(this, "IsFiltered").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param isFiltered an input-parameter of type boolean
	 */
	public void setIsFiltered(boolean isFiltered) {
		Dispatch.put(this, "IsFiltered", new Variant(isFiltered));
	}

}
