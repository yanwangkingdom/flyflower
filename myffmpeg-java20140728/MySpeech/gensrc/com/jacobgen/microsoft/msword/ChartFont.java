/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ChartFont extends Dispatch {

	public static final String componentName = "Word.ChartFont";

	public ChartFont() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ChartFont(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ChartFont(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getBackground() {
		return Dispatch.get(this, "Background");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 */
	public void setBackground(Variant background) {
		Dispatch.put(this, "Background", background);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getBold() {
		return Dispatch.get(this, "Bold");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bold an input-parameter of type Variant
	 */
	public void setBold(Variant bold) {
		Dispatch.put(this, "Bold", bold);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getColor() {
		return Dispatch.get(this, "Color");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param color an input-parameter of type Variant
	 */
	public void setColor(Variant color) {
		Dispatch.put(this, "Color", color);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getColorIndex() {
		return Dispatch.get(this, "ColorIndex");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param colorIndex an input-parameter of type Variant
	 */
	public void setColorIndex(Variant colorIndex) {
		Dispatch.put(this, "ColorIndex", colorIndex);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getFontStyle() {
		return Dispatch.get(this, "FontStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fontStyle an input-parameter of type Variant
	 */
	public void setFontStyle(Variant fontStyle) {
		Dispatch.put(this, "FontStyle", fontStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getItalic() {
		return Dispatch.get(this, "Italic");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param italic an input-parameter of type Variant
	 */
	public void setItalic(Variant italic) {
		Dispatch.put(this, "Italic", italic);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getName() {
		return Dispatch.get(this, "Name");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 */
	public void setName(Variant name) {
		Dispatch.put(this, "Name", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getOutlineFont() {
		return Dispatch.get(this, "OutlineFont");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outlineFont an input-parameter of type Variant
	 */
	public void setOutlineFont(Variant outlineFont) {
		Dispatch.put(this, "OutlineFont", outlineFont);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getShadow() {
		return Dispatch.get(this, "Shadow");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shadow an input-parameter of type Variant
	 */
	public void setShadow(Variant shadow) {
		Dispatch.put(this, "Shadow", shadow);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getSize() {
		return Dispatch.get(this, "Size");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param size an input-parameter of type Variant
	 */
	public void setSize(Variant size) {
		Dispatch.put(this, "Size", size);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getStrikeThrough() {
		return Dispatch.get(this, "StrikeThrough");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param strikeThrough an input-parameter of type Variant
	 */
	public void setStrikeThrough(Variant strikeThrough) {
		Dispatch.put(this, "StrikeThrough", strikeThrough);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getSubscript() {
		return Dispatch.get(this, "Subscript");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param subscript an input-parameter of type Variant
	 */
	public void setSubscript(Variant subscript) {
		Dispatch.put(this, "Subscript", subscript);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getSuperscript() {
		return Dispatch.get(this, "Superscript");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param superscript an input-parameter of type Variant
	 */
	public void setSuperscript(Variant superscript) {
		Dispatch.put(this, "Superscript", superscript);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getUnderline() {
		return Dispatch.get(this, "Underline");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param underline an input-parameter of type Variant
	 */
	public void setUnderline(Variant underline) {
		Dispatch.put(this, "Underline", underline);
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
