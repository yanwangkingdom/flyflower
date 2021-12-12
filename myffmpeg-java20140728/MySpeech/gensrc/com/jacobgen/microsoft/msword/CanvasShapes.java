/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class CanvasShapes extends Dispatch {

	public static final String componentName = "Word.CanvasShapes";

	public CanvasShapes() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public CanvasShapes(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public CanvasShapes(String compName) {
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
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Shape
	 */
	public Shape item(Variant index) {
		return new Shape(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type MsoCalloutType
	 * @param left an input-parameter of type float
	 * @param top an input-parameter of type float
	 * @param width an input-parameter of type float
	 * @param height an input-parameter of type float
	 * @return the result is of type Shape
	 */
	public Shape addCallout(MsoCalloutType type, float left, float top, float width, float height) {
		return new Shape(Dispatch.call(this, "AddCallout", type, new Variant(left), new Variant(top), new Variant(width), new Variant(height)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type MsoConnectorType
	 * @param beginX an input-parameter of type float
	 * @param beginY an input-parameter of type float
	 * @param endX an input-parameter of type float
	 * @param endY an input-parameter of type float
	 * @return the result is of type Shape
	 */
	public Shape addConnector(MsoConnectorType type, float beginX, float beginY, float endX, float endY) {
		return new Shape(Dispatch.call(this, "AddConnector", type, new Variant(beginX), new Variant(beginY), new Variant(endX), new Variant(endY)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param safeArrayOfPoints an input-parameter of type Variant
	 * @return the result is of type Shape
	 */
	public Shape addCurve(Variant safeArrayOfPoints) {
		return new Shape(Dispatch.call(this, "AddCurve", safeArrayOfPoints).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param orientation an input-parameter of type MsoTextOrientation
	 * @param left an input-parameter of type float
	 * @param top an input-parameter of type float
	 * @param width an input-parameter of type float
	 * @param height an input-parameter of type float
	 * @return the result is of type Shape
	 */
	public Shape addLabel(MsoTextOrientation orientation, float left, float top, float width, float height) {
		return new Shape(Dispatch.call(this, "AddLabel", orientation, new Variant(left), new Variant(top), new Variant(width), new Variant(height)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param beginX an input-parameter of type float
	 * @param beginY an input-parameter of type float
	 * @param endX an input-parameter of type float
	 * @param endY an input-parameter of type float
	 * @return the result is of type Shape
	 */
	public Shape addLine(float beginX, float beginY, float endX, float endY) {
		return new Shape(Dispatch.call(this, "AddLine", new Variant(beginX), new Variant(beginY), new Variant(endX), new Variant(endY)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param linkToFile an input-parameter of type Variant
	 * @param saveWithDocument an input-parameter of type Variant
	 * @param left an input-parameter of type Variant
	 * @param top an input-parameter of type Variant
	 * @param width an input-parameter of type Variant
	 * @param height an input-parameter of type Variant
	 * @return the result is of type Shape
	 */
	public Shape addPicture(String fileName, Variant linkToFile, Variant saveWithDocument, Variant left, Variant top, Variant width, Variant height) {
		return new Shape(Dispatch.call(this, "AddPicture", fileName, linkToFile, saveWithDocument, left, top, width, height).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param linkToFile an input-parameter of type Variant
	 * @param saveWithDocument an input-parameter of type Variant
	 * @param left an input-parameter of type Variant
	 * @param top an input-parameter of type Variant
	 * @param width an input-parameter of type Variant
	 * @return the result is of type Shape
	 */
	public Shape addPicture(String fileName, Variant linkToFile, Variant saveWithDocument, Variant left, Variant top, Variant width) {
		return new Shape(Dispatch.call(this, "AddPicture", fileName, linkToFile, saveWithDocument, left, top, width).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param linkToFile an input-parameter of type Variant
	 * @param saveWithDocument an input-parameter of type Variant
	 * @param left an input-parameter of type Variant
	 * @param top an input-parameter of type Variant
	 * @return the result is of type Shape
	 */
	public Shape addPicture(String fileName, Variant linkToFile, Variant saveWithDocument, Variant left, Variant top) {
		return new Shape(Dispatch.call(this, "AddPicture", fileName, linkToFile, saveWithDocument, left, top).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param linkToFile an input-parameter of type Variant
	 * @param saveWithDocument an input-parameter of type Variant
	 * @param left an input-parameter of type Variant
	 * @return the result is of type Shape
	 */
	public Shape addPicture(String fileName, Variant linkToFile, Variant saveWithDocument, Variant left) {
		return new Shape(Dispatch.call(this, "AddPicture", fileName, linkToFile, saveWithDocument, left).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param linkToFile an input-parameter of type Variant
	 * @param saveWithDocument an input-parameter of type Variant
	 * @return the result is of type Shape
	 */
	public Shape addPicture(String fileName, Variant linkToFile, Variant saveWithDocument) {
		return new Shape(Dispatch.call(this, "AddPicture", fileName, linkToFile, saveWithDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param linkToFile an input-parameter of type Variant
	 * @return the result is of type Shape
	 */
	public Shape addPicture(String fileName, Variant linkToFile) {
		return new Shape(Dispatch.call(this, "AddPicture", fileName, linkToFile).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @return the result is of type Shape
	 */
	public Shape addPicture(String fileName) {
		return new Shape(Dispatch.call(this, "AddPicture", fileName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param linkToFile an input-parameter of type Variant
	 * @param saveWithDocument an input-parameter of type Variant
	 * @param left an input-parameter of type Variant
	 * @param top an input-parameter of type Variant
	 * @param width an input-parameter of type Variant
	 * @param height an input-parameter of type Variant
	 * @return the result is of type Shape
	 */
	public Shape addPicture(String fileName, Variant linkToFile, Variant saveWithDocument, Variant left, Variant top, Variant width, Variant height) {
		Shape result_of_AddPicture = new Shape(Dispatch.call(this, "AddPicture", fileName, linkToFile, saveWithDocument, left, top, width, height).toDispatch());


		return result_of_AddPicture;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param safeArrayOfPoints an input-parameter of type Variant
	 * @return the result is of type Shape
	 */
	public Shape addPolyline(Variant safeArrayOfPoints) {
		return new Shape(Dispatch.call(this, "AddPolyline", safeArrayOfPoints).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param left an input-parameter of type float
	 * @param top an input-parameter of type float
	 * @param width an input-parameter of type float
	 * @param height an input-parameter of type float
	 * @return the result is of type Shape
	 */
	public Shape addShape(int type, float left, float top, float width, float height) {
		return new Shape(Dispatch.call(this, "AddShape", new Variant(type), new Variant(left), new Variant(top), new Variant(width), new Variant(height)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param presetTextEffect an input-parameter of type MsoPresetTextEffect
	 * @param text an input-parameter of type String
	 * @param fontName an input-parameter of type String
	 * @param fontSize an input-parameter of type float
	 * @param fontBold an input-parameter of type MsoTriState
	 * @param fontItalic an input-parameter of type MsoTriState
	 * @param left an input-parameter of type float
	 * @param top an input-parameter of type float
	 * @return the result is of type Shape
	 */
	public Shape addTextEffect(MsoPresetTextEffect presetTextEffect, String text, String fontName, float fontSize, MsoTriState fontBold, MsoTriState fontItalic, float left, float top) {
		return new Shape(Dispatch.call(this, "AddTextEffect", presetTextEffect, text, fontName, new Variant(fontSize), fontBold, fontItalic, new Variant(left), new Variant(top)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param orientation an input-parameter of type MsoTextOrientation
	 * @param left an input-parameter of type float
	 * @param top an input-parameter of type float
	 * @param width an input-parameter of type float
	 * @param height an input-parameter of type float
	 * @return the result is of type Shape
	 */
	public Shape addTextbox(MsoTextOrientation orientation, float left, float top, float width, float height) {
		return new Shape(Dispatch.call(this, "AddTextbox", orientation, new Variant(left), new Variant(top), new Variant(width), new Variant(height)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param editingType an input-parameter of type MsoEditingType
	 * @param x1 an input-parameter of type float
	 * @param y1 an input-parameter of type float
	 * @return the result is of type FreeformBuilder
	 */
	public FreeformBuilder buildFreeform(MsoEditingType editingType, float x1, float y1) {
		return new FreeformBuilder(Dispatch.call(this, "BuildFreeform", editingType, new Variant(x1), new Variant(y1)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type ShapeRange
	 */
	public ShapeRange range(Variant index) {
		return new ShapeRange(Dispatch.call(this, "Range", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void selectAll() {
		Dispatch.call(this, "SelectAll");
	}

}
