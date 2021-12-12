/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class TextFrame extends Dispatch {

	public static final String componentName = "Word.TextFrame";

	public TextFrame() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public TextFrame(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public TextFrame(String compName) {
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
	 * @return the result is of type Shape
	 */
	public Shape getParent() {
		return new Shape(Dispatch.get(this, "Parent").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getMarginBottom() {
		return Dispatch.get(this, "MarginBottom").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param marginBottom an input-parameter of type float
	 */
	public void setMarginBottom(float marginBottom) {
		Dispatch.put(this, "MarginBottom", new Variant(marginBottom));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getMarginLeft() {
		return Dispatch.get(this, "MarginLeft").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param marginLeft an input-parameter of type float
	 */
	public void setMarginLeft(float marginLeft) {
		Dispatch.put(this, "MarginLeft", new Variant(marginLeft));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getMarginRight() {
		return Dispatch.get(this, "MarginRight").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param marginRight an input-parameter of type float
	 */
	public void setMarginRight(float marginRight) {
		Dispatch.put(this, "MarginRight", new Variant(marginRight));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getMarginTop() {
		return Dispatch.get(this, "MarginTop").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param marginTop an input-parameter of type float
	 */
	public void setMarginTop(float marginTop) {
		Dispatch.put(this, "MarginTop", new Variant(marginTop));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTextOrientation
	 */
	public MsoTextOrientation getOrientation() {
		return new MsoTextOrientation(Dispatch.get(this, "Orientation").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param orientation an input-parameter of type MsoTextOrientation
	 */
	public void setOrientation(MsoTextOrientation orientation) {
		Dispatch.put(this, "Orientation", orientation);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range getTextRange() {
		return new Range(Dispatch.get(this, "TextRange").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range getContainingRange() {
		return new Range(Dispatch.get(this, "ContainingRange").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TextFrame
	 */
	public TextFrame getNext() {
		return new TextFrame(Dispatch.get(this, "Next").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param next an input-parameter of type TextFrame
	 */
	public void setNext(TextFrame next) {
		Dispatch.put(this, "Next", next);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TextFrame
	 */
	public TextFrame getPrevious() {
		return new TextFrame(Dispatch.get(this, "Previous").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param previous an input-parameter of type TextFrame
	 */
	public void setPrevious(TextFrame previous) {
		Dispatch.put(this, "Previous", previous);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getOverflowing() {
		return Dispatch.get(this, "Overflowing").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHasText() {
		return Dispatch.get(this, "HasText").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void breakForwardLink() {
		Dispatch.call(this, "BreakForwardLink");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param targetTextFrame an input-parameter of type TextFrame
	 * @return the result is of type boolean
	 */
	public boolean validLinkTarget(TextFrame targetTextFrame) {
		return Dispatch.call(this, "ValidLinkTarget", targetTextFrame).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAutoSize() {
		return Dispatch.get(this, "AutoSize").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoSize an input-parameter of type int
	 */
	public void setAutoSize(int autoSize) {
		Dispatch.put(this, "AutoSize", new Variant(autoSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getWordWrap() {
		return Dispatch.get(this, "WordWrap").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param wordWrap an input-parameter of type int
	 */
	public void setWordWrap(int wordWrap) {
		Dispatch.put(this, "WordWrap", new Variant(wordWrap));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoVerticalAnchor
	 */
	public MsoVerticalAnchor getVerticalAnchor() {
		return new MsoVerticalAnchor(Dispatch.get(this, "VerticalAnchor").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param verticalAnchor an input-parameter of type MsoVerticalAnchor
	 */
	public void setVerticalAnchor(MsoVerticalAnchor verticalAnchor) {
		Dispatch.put(this, "VerticalAnchor", verticalAnchor);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoHorizontalAnchor
	 */
	public MsoHorizontalAnchor getHorizontalAnchor() {
		return new MsoHorizontalAnchor(Dispatch.get(this, "HorizontalAnchor").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param horizontalAnchor an input-parameter of type MsoHorizontalAnchor
	 */
	public void setHorizontalAnchor(MsoHorizontalAnchor horizontalAnchor) {
		Dispatch.put(this, "HorizontalAnchor", horizontalAnchor);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoPathFormat
	 */
	public MsoPathFormat getPathFormat() {
		return new MsoPathFormat(Dispatch.get(this, "PathFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pathFormat an input-parameter of type MsoPathFormat
	 */
	public void setPathFormat(MsoPathFormat pathFormat) {
		Dispatch.put(this, "PathFormat", pathFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoWarpFormat
	 */
	public MsoWarpFormat getWarpFormat() {
		return new MsoWarpFormat(Dispatch.get(this, "WarpFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param warpFormat an input-parameter of type MsoWarpFormat
	 */
	public void setWarpFormat(MsoWarpFormat warpFormat) {
		Dispatch.put(this, "WarpFormat", warpFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TextColumn2
	 */
	public TextColumn2 getColumn() {
		return new TextColumn2(Dispatch.get(this, "Column").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ThreeDFormat
	 */
	public ThreeDFormat getThreeD() {
		return new ThreeDFormat(Dispatch.get(this, "ThreeD").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getNoTextRotation() {
		return new MsoTriState(Dispatch.get(this, "NoTextRotation").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param noTextRotation an input-parameter of type MsoTriState
	 */
	public void setNoTextRotation(MsoTriState noTextRotation) {
		Dispatch.put(this, "NoTextRotation", noTextRotation);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void deleteText() {
		Dispatch.call(this, "DeleteText");
	}

}
