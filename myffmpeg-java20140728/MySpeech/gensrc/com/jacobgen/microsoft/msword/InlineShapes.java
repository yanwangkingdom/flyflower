/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class InlineShapes extends Dispatch {

	public static final String componentName = "Word.InlineShapes";

	public InlineShapes() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public InlineShapes(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public InlineShapes(String compName) {
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
	 * @return the result is of type int
	 */
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant get_NewEnum() {
		return Dispatch.get(this, "_NewEnum");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type InlineShape
	 */
	public InlineShape item(int index) {
		return new InlineShape(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param linkToFile an input-parameter of type Variant
	 * @param saveWithDocument an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addPicture(String fileName, Variant linkToFile, Variant saveWithDocument, Variant range) {
		return new InlineShape(Dispatch.call(this, "AddPicture", fileName, linkToFile, saveWithDocument, range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param linkToFile an input-parameter of type Variant
	 * @param saveWithDocument an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addPicture(String fileName, Variant linkToFile, Variant saveWithDocument) {
		return new InlineShape(Dispatch.call(this, "AddPicture", fileName, linkToFile, saveWithDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param linkToFile an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addPicture(String fileName, Variant linkToFile) {
		return new InlineShape(Dispatch.call(this, "AddPicture", fileName, linkToFile).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @return the result is of type InlineShape
	 */
	public InlineShape addPicture(String fileName) {
		return new InlineShape(Dispatch.call(this, "AddPicture", fileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param linkToFile an input-parameter of type Variant
	 * @param saveWithDocument an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addPicture(String fileName, Variant linkToFile, Variant saveWithDocument, Variant range) {
		InlineShape result_of_AddPicture = new InlineShape(Dispatch.call(this, "AddPicture", fileName, linkToFile, saveWithDocument, range).toDispatch());


		return result_of_AddPicture;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param fileName an input-parameter of type Variant
	 * @param linkToFile an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param iconFileName an input-parameter of type Variant
	 * @param iconIndex an input-parameter of type Variant
	 * @param iconLabel an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEObject(Variant classType, Variant fileName, Variant linkToFile, Variant displayAsIcon, Variant iconFileName, Variant iconIndex, Variant iconLabel, Variant range) {
		return new InlineShape(Dispatch.call(this, "AddOLEObject", classType, fileName, linkToFile, displayAsIcon, iconFileName, iconIndex, iconLabel, range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param fileName an input-parameter of type Variant
	 * @param linkToFile an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param iconFileName an input-parameter of type Variant
	 * @param iconIndex an input-parameter of type Variant
	 * @param iconLabel an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEObject(Variant classType, Variant fileName, Variant linkToFile, Variant displayAsIcon, Variant iconFileName, Variant iconIndex, Variant iconLabel) {
		return new InlineShape(Dispatch.call(this, "AddOLEObject", classType, fileName, linkToFile, displayAsIcon, iconFileName, iconIndex, iconLabel).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param fileName an input-parameter of type Variant
	 * @param linkToFile an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param iconFileName an input-parameter of type Variant
	 * @param iconIndex an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEObject(Variant classType, Variant fileName, Variant linkToFile, Variant displayAsIcon, Variant iconFileName, Variant iconIndex) {
		return new InlineShape(Dispatch.call(this, "AddOLEObject", classType, fileName, linkToFile, displayAsIcon, iconFileName, iconIndex).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param fileName an input-parameter of type Variant
	 * @param linkToFile an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param iconFileName an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEObject(Variant classType, Variant fileName, Variant linkToFile, Variant displayAsIcon, Variant iconFileName) {
		return new InlineShape(Dispatch.call(this, "AddOLEObject", classType, fileName, linkToFile, displayAsIcon, iconFileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param fileName an input-parameter of type Variant
	 * @param linkToFile an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEObject(Variant classType, Variant fileName, Variant linkToFile, Variant displayAsIcon) {
		return new InlineShape(Dispatch.call(this, "AddOLEObject", classType, fileName, linkToFile, displayAsIcon).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param fileName an input-parameter of type Variant
	 * @param linkToFile an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEObject(Variant classType, Variant fileName, Variant linkToFile) {
		return new InlineShape(Dispatch.call(this, "AddOLEObject", classType, fileName, linkToFile).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param fileName an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEObject(Variant classType, Variant fileName) {
		return new InlineShape(Dispatch.call(this, "AddOLEObject", classType, fileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEObject(Variant classType) {
		return new InlineShape(Dispatch.call(this, "AddOLEObject", classType).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEObject() {
		return new InlineShape(Dispatch.call(this, "AddOLEObject").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param fileName an input-parameter of type Variant
	 * @param linkToFile an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param iconFileName an input-parameter of type Variant
	 * @param iconIndex an input-parameter of type Variant
	 * @param iconLabel an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEObject(Variant classType, Variant fileName, Variant linkToFile, Variant displayAsIcon, Variant iconFileName, Variant iconIndex, Variant iconLabel, Variant range) {
		InlineShape result_of_AddOLEObject = new InlineShape(Dispatch.call(this, "AddOLEObject", classType, fileName, linkToFile, displayAsIcon, iconFileName, iconIndex, iconLabel, range).toDispatch());


		return result_of_AddOLEObject;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEControl(Variant classType, Variant range) {
		return new InlineShape(Dispatch.call(this, "AddOLEControl", classType, range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEControl(Variant classType) {
		return new InlineShape(Dispatch.call(this, "AddOLEControl", classType).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEControl() {
		return new InlineShape(Dispatch.call(this, "AddOLEControl").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addOLEControl(Variant classType, Variant range) {
		InlineShape result_of_AddOLEControl = new InlineShape(Dispatch.call(this, "AddOLEControl", classType, range).toDispatch());


		return result_of_AddOLEControl;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type InlineShape
	 */
	public InlineShape m_new(Range range) {
		return new InlineShape(Dispatch.call(this, "New", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addHorizontalLine(String fileName, Variant range) {
		return new InlineShape(Dispatch.call(this, "AddHorizontalLine", fileName, range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @return the result is of type InlineShape
	 */
	public InlineShape addHorizontalLine(String fileName) {
		return new InlineShape(Dispatch.call(this, "AddHorizontalLine", fileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addHorizontalLine(String fileName, Variant range) {
		InlineShape result_of_AddHorizontalLine = new InlineShape(Dispatch.call(this, "AddHorizontalLine", fileName, range).toDispatch());


		return result_of_AddHorizontalLine;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addHorizontalLineStandard(Variant range) {
		return new InlineShape(Dispatch.call(this, "AddHorizontalLineStandard", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type InlineShape
	 */
	public InlineShape addHorizontalLineStandard() {
		return new InlineShape(Dispatch.call(this, "AddHorizontalLineStandard").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addHorizontalLineStandard(Variant range) {
		InlineShape result_of_AddHorizontalLineStandard = new InlineShape(Dispatch.call(this, "AddHorizontalLineStandard", range).toDispatch());


		return result_of_AddHorizontalLineStandard;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addPictureBullet(String fileName, Variant range) {
		return new InlineShape(Dispatch.call(this, "AddPictureBullet", fileName, range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @return the result is of type InlineShape
	 */
	public InlineShape addPictureBullet(String fileName) {
		return new InlineShape(Dispatch.call(this, "AddPictureBullet", fileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addPictureBullet(String fileName, Variant range) {
		InlineShape result_of_AddPictureBullet = new InlineShape(Dispatch.call(this, "AddPictureBullet", fileName, range).toDispatch());


		return result_of_AddPictureBullet;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type XlChartType
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addChart(XlChartType type, Variant range) {
		return new InlineShape(Dispatch.call(this, "AddChart", type, range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type XlChartType
	 * @return the result is of type InlineShape
	 */
	public InlineShape addChart(XlChartType type) {
		return new InlineShape(Dispatch.call(this, "AddChart", type).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type InlineShape
	 */
	public InlineShape addChart() {
		return new InlineShape(Dispatch.call(this, "AddChart").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param type an input-parameter of type XlChartType
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addChart(XlChartType type, Variant range) {
		InlineShape result_of_AddChart = new InlineShape(Dispatch.call(this, "AddChart", type, range).toDispatch());


		return result_of_AddChart;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param layout an input-parameter of type SmartArtLayout
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addSmartArt(SmartArtLayout layout, Variant range) {
		return new InlineShape(Dispatch.call(this, "AddSmartArt", layout, range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param layout an input-parameter of type SmartArtLayout
	 * @return the result is of type InlineShape
	 */
	public InlineShape addSmartArt(SmartArtLayout layout) {
		return new InlineShape(Dispatch.call(this, "AddSmartArt", layout).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param layout an input-parameter of type SmartArtLayout
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addSmartArt(SmartArtLayout layout, Variant range) {
		InlineShape result_of_AddSmartArt = new InlineShape(Dispatch.call(this, "AddSmartArt", layout, range).toDispatch());


		return result_of_AddSmartArt;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param embedCode an input-parameter of type String
	 * @param videoWidth an input-parameter of type Variant
	 * @param videoHeight an input-parameter of type Variant
	 * @param posterFrameImage an input-parameter of type Variant
	 * @param url an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addWebVideo(String embedCode, Variant videoWidth, Variant videoHeight, Variant posterFrameImage, Variant url, Variant range) {
		return new InlineShape(Dispatch.call(this, "AddWebVideo", embedCode, videoWidth, videoHeight, posterFrameImage, url, range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param embedCode an input-parameter of type String
	 * @param videoWidth an input-parameter of type Variant
	 * @param videoHeight an input-parameter of type Variant
	 * @param posterFrameImage an input-parameter of type Variant
	 * @param url an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addWebVideo(String embedCode, Variant videoWidth, Variant videoHeight, Variant posterFrameImage, Variant url) {
		return new InlineShape(Dispatch.call(this, "AddWebVideo", embedCode, videoWidth, videoHeight, posterFrameImage, url).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param embedCode an input-parameter of type String
	 * @param videoWidth an input-parameter of type Variant
	 * @param videoHeight an input-parameter of type Variant
	 * @param posterFrameImage an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addWebVideo(String embedCode, Variant videoWidth, Variant videoHeight, Variant posterFrameImage) {
		return new InlineShape(Dispatch.call(this, "AddWebVideo", embedCode, videoWidth, videoHeight, posterFrameImage).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param embedCode an input-parameter of type String
	 * @param videoWidth an input-parameter of type Variant
	 * @param videoHeight an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addWebVideo(String embedCode, Variant videoWidth, Variant videoHeight) {
		return new InlineShape(Dispatch.call(this, "AddWebVideo", embedCode, videoWidth, videoHeight).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param embedCode an input-parameter of type String
	 * @param videoWidth an input-parameter of type Variant
	 * @param videoHeight an input-parameter of type Variant
	 * @param posterFrameImage an input-parameter of type Variant
	 * @param url an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addWebVideo(String embedCode, Variant videoWidth, Variant videoHeight, Variant posterFrameImage, Variant url, Variant range) {
		InlineShape result_of_AddWebVideo = new InlineShape(Dispatch.call(this, "AddWebVideo", embedCode, videoWidth, videoHeight, posterFrameImage, url, range).toDispatch());


		return result_of_AddWebVideo;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type int
	 * @param type an input-parameter of type XlChartType
	 * @param range an input-parameter of type Variant
	 * @param newLayout an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addChart2(int style, XlChartType type, Variant range, Variant newLayout) {
		return new InlineShape(Dispatch.call(this, "AddChart2", new Variant(style), type, range, newLayout).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type int
	 * @param type an input-parameter of type XlChartType
	 * @param range an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addChart2(int style, XlChartType type, Variant range) {
		return new InlineShape(Dispatch.call(this, "AddChart2", new Variant(style), type, range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type int
	 * @param type an input-parameter of type XlChartType
	 * @return the result is of type InlineShape
	 */
	public InlineShape addChart2(int style, XlChartType type) {
		return new InlineShape(Dispatch.call(this, "AddChart2", new Variant(style), type).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type int
	 * @return the result is of type InlineShape
	 */
	public InlineShape addChart2(int style) {
		return new InlineShape(Dispatch.call(this, "AddChart2", new Variant(style)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type InlineShape
	 */
	public InlineShape addChart2() {
		return new InlineShape(Dispatch.call(this, "AddChart2").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param style an input-parameter of type int
	 * @param type an input-parameter of type XlChartType
	 * @param range an input-parameter of type Variant
	 * @param newLayout an input-parameter of type Variant
	 * @return the result is of type InlineShape
	 */
	public InlineShape addChart2(int style, XlChartType type, Variant range, Variant newLayout) {
		InlineShape result_of_AddChart2 = new InlineShape(Dispatch.call(this, "AddChart2", new Variant(style), type, range, newLayout).toDispatch());


		return result_of_AddChart2;
	}

}
