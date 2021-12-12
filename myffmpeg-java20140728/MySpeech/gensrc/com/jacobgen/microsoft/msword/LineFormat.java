/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class LineFormat extends Dispatch {

	public static final String componentName = "Word.LineFormat";

	public LineFormat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public LineFormat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public LineFormat(String compName) {
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
	 * @return the result is of type ColorFormat
	 */
	public ColorFormat getBackColor() {
		return new ColorFormat(Dispatch.get(this, "BackColor").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoArrowheadLength
	 */
	public MsoArrowheadLength getBeginArrowheadLength() {
		return new MsoArrowheadLength(Dispatch.get(this, "BeginArrowheadLength").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param beginArrowheadLength an input-parameter of type MsoArrowheadLength
	 */
	public void setBeginArrowheadLength(MsoArrowheadLength beginArrowheadLength) {
		Dispatch.put(this, "BeginArrowheadLength", beginArrowheadLength);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoArrowheadStyle
	 */
	public MsoArrowheadStyle getBeginArrowheadStyle() {
		return new MsoArrowheadStyle(Dispatch.get(this, "BeginArrowheadStyle").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param beginArrowheadStyle an input-parameter of type MsoArrowheadStyle
	 */
	public void setBeginArrowheadStyle(MsoArrowheadStyle beginArrowheadStyle) {
		Dispatch.put(this, "BeginArrowheadStyle", beginArrowheadStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoArrowheadWidth
	 */
	public MsoArrowheadWidth getBeginArrowheadWidth() {
		return new MsoArrowheadWidth(Dispatch.get(this, "BeginArrowheadWidth").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param beginArrowheadWidth an input-parameter of type MsoArrowheadWidth
	 */
	public void setBeginArrowheadWidth(MsoArrowheadWidth beginArrowheadWidth) {
		Dispatch.put(this, "BeginArrowheadWidth", beginArrowheadWidth);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoLineDashStyle
	 */
	public MsoLineDashStyle getDashStyle() {
		return new MsoLineDashStyle(Dispatch.get(this, "DashStyle").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dashStyle an input-parameter of type MsoLineDashStyle
	 */
	public void setDashStyle(MsoLineDashStyle dashStyle) {
		Dispatch.put(this, "DashStyle", dashStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoArrowheadLength
	 */
	public MsoArrowheadLength getEndArrowheadLength() {
		return new MsoArrowheadLength(Dispatch.get(this, "EndArrowheadLength").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param endArrowheadLength an input-parameter of type MsoArrowheadLength
	 */
	public void setEndArrowheadLength(MsoArrowheadLength endArrowheadLength) {
		Dispatch.put(this, "EndArrowheadLength", endArrowheadLength);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoArrowheadStyle
	 */
	public MsoArrowheadStyle getEndArrowheadStyle() {
		return new MsoArrowheadStyle(Dispatch.get(this, "EndArrowheadStyle").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param endArrowheadStyle an input-parameter of type MsoArrowheadStyle
	 */
	public void setEndArrowheadStyle(MsoArrowheadStyle endArrowheadStyle) {
		Dispatch.put(this, "EndArrowheadStyle", endArrowheadStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoArrowheadWidth
	 */
	public MsoArrowheadWidth getEndArrowheadWidth() {
		return new MsoArrowheadWidth(Dispatch.get(this, "EndArrowheadWidth").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param endArrowheadWidth an input-parameter of type MsoArrowheadWidth
	 */
	public void setEndArrowheadWidth(MsoArrowheadWidth endArrowheadWidth) {
		Dispatch.put(this, "EndArrowheadWidth", endArrowheadWidth);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ColorFormat
	 */
	public ColorFormat getForeColor() {
		return new ColorFormat(Dispatch.get(this, "ForeColor").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoPatternType
	 */
	public MsoPatternType getPattern() {
		return new MsoPatternType(Dispatch.get(this, "Pattern").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pattern an input-parameter of type MsoPatternType
	 */
	public void setPattern(MsoPatternType pattern) {
		Dispatch.put(this, "Pattern", pattern);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoLineStyle
	 */
	public MsoLineStyle getStyle() {
		return new MsoLineStyle(Dispatch.get(this, "Style").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type MsoLineStyle
	 */
	public void setStyle(MsoLineStyle style) {
		Dispatch.put(this, "Style", style);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getTransparency() {
		return Dispatch.get(this, "Transparency").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param transparency an input-parameter of type float
	 */
	public void setTransparency(float transparency) {
		Dispatch.put(this, "Transparency", new Variant(transparency));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getVisible() {
		return new MsoTriState(Dispatch.get(this, "Visible").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param visible an input-parameter of type MsoTriState
	 */
	public void setVisible(MsoTriState visible) {
		Dispatch.put(this, "Visible", visible);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getWeight() {
		return Dispatch.get(this, "Weight").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param weight an input-parameter of type float
	 */
	public void setWeight(float weight) {
		Dispatch.put(this, "Weight", new Variant(weight));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getInsetPen() {
		return new MsoTriState(Dispatch.get(this, "InsetPen").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param insetPen an input-parameter of type MsoTriState
	 */
	public void setInsetPen(MsoTriState insetPen) {
		Dispatch.put(this, "InsetPen", insetPen);
	}

}
