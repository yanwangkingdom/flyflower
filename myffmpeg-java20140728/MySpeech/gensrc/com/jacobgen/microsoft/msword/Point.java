/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Point extends Dispatch {

	public static final String componentName = "Word.Point";

	public Point() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Point(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Point(String compName) {
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
	 * @return the result is of type DataLabel
	 */
	public DataLabel getDataLabel() {
		return new DataLabel(Dispatch.get(this, "DataLabel").toDispatch());
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
	 * @return the result is of type boolean
	 */
	public boolean getHasDataLabel() {
		return Dispatch.get(this, "HasDataLabel").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasDataLabel an input-parameter of type boolean
	 */
	public void setHasDataLabel(boolean hasDataLabel) {
		Dispatch.put(this, "HasDataLabel", new Variant(hasDataLabel));
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
	 * @return the result is of type Variant
	 */
	public Variant select() {
		return Dispatch.call(this, "Select");
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
	public boolean getSecondaryPlot() {
		return Dispatch.get(this, "SecondaryPlot").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param secondaryPlot an input-parameter of type boolean
	 */
	public void setSecondaryPlot(boolean secondaryPlot) {
		Dispatch.put(this, "SecondaryPlot", new Variant(secondaryPlot));
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
	 * @return the result is of type double
	 */
	public double getHeight() {
		return Dispatch.get(this, "Height").changeType(Variant.VariantDouble).getDouble();
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
	public double getTop() {
		return Dispatch.get(this, "Top").changeType(Variant.VariantDouble).getDouble();
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
	 * @return the result is of type String
	 */
	public String getName() {
		return Dispatch.get(this, "Name").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param loc an input-parameter of type int
	 * @param index an input-parameter of type int
	 * @return the result is of type double
	 */
	public double pieSliceLocation(int loc, int index) {
		return Dispatch.call(this, "PieSliceLocation", new Variant(loc), new Variant(index)).changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param loc an input-parameter of type int
	 * @return the result is of type double
	 */
	public double pieSliceLocation(int loc) {
		return Dispatch.call(this, "PieSliceLocation", new Variant(loc)).changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param loc an input-parameter of type int
	 * @param index an input-parameter of type int
	 * @return the result is of type double
	 */
	public double pieSliceLocation(int loc, int index) {
		double result_of_PieSliceLocation = Dispatch.call(this, "PieSliceLocation", new Variant(loc), new Variant(index)).changeType(Variant.VariantDouble).getDouble();


		return result_of_PieSliceLocation;
	}

}
