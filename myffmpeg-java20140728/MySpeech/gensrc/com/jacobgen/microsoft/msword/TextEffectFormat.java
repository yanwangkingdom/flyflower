/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class TextEffectFormat extends Dispatch {

	public static final String componentName = "Word.TextEffectFormat";

	public TextEffectFormat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public TextEffectFormat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public TextEffectFormat(String compName) {
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
	 * @return the result is of type MsoTextEffectAlignment
	 */
	public MsoTextEffectAlignment getAlignment() {
		return new MsoTextEffectAlignment(Dispatch.get(this, "Alignment").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param alignment an input-parameter of type MsoTextEffectAlignment
	 */
	public void setAlignment(MsoTextEffectAlignment alignment) {
		Dispatch.put(this, "Alignment", alignment);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getFontBold() {
		return new MsoTriState(Dispatch.get(this, "FontBold").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fontBold an input-parameter of type MsoTriState
	 */
	public void setFontBold(MsoTriState fontBold) {
		Dispatch.put(this, "FontBold", fontBold);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getFontItalic() {
		return new MsoTriState(Dispatch.get(this, "FontItalic").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fontItalic an input-parameter of type MsoTriState
	 */
	public void setFontItalic(MsoTriState fontItalic) {
		Dispatch.put(this, "FontItalic", fontItalic);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFontName() {
		return Dispatch.get(this, "FontName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fontName an input-parameter of type String
	 */
	public void setFontName(String fontName) {
		Dispatch.put(this, "FontName", fontName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getFontSize() {
		return Dispatch.get(this, "FontSize").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fontSize an input-parameter of type float
	 */
	public void setFontSize(float fontSize) {
		Dispatch.put(this, "FontSize", new Variant(fontSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getKernedPairs() {
		return new MsoTriState(Dispatch.get(this, "KernedPairs").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param kernedPairs an input-parameter of type MsoTriState
	 */
	public void setKernedPairs(MsoTriState kernedPairs) {
		Dispatch.put(this, "KernedPairs", kernedPairs);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getNormalizedHeight() {
		return new MsoTriState(Dispatch.get(this, "NormalizedHeight").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param normalizedHeight an input-parameter of type MsoTriState
	 */
	public void setNormalizedHeight(MsoTriState normalizedHeight) {
		Dispatch.put(this, "NormalizedHeight", normalizedHeight);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoPresetTextEffectShape
	 */
	public MsoPresetTextEffectShape getPresetShape() {
		return new MsoPresetTextEffectShape(Dispatch.get(this, "PresetShape").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param presetShape an input-parameter of type MsoPresetTextEffectShape
	 */
	public void setPresetShape(MsoPresetTextEffectShape presetShape) {
		Dispatch.put(this, "PresetShape", presetShape);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoPresetTextEffect
	 */
	public MsoPresetTextEffect getPresetTextEffect() {
		return new MsoPresetTextEffect(Dispatch.get(this, "PresetTextEffect").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param presetTextEffect an input-parameter of type MsoPresetTextEffect
	 */
	public void setPresetTextEffect(MsoPresetTextEffect presetTextEffect) {
		Dispatch.put(this, "PresetTextEffect", presetTextEffect);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getRotatedChars() {
		return new MsoTriState(Dispatch.get(this, "RotatedChars").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rotatedChars an input-parameter of type MsoTriState
	 */
	public void setRotatedChars(MsoTriState rotatedChars) {
		Dispatch.put(this, "RotatedChars", rotatedChars);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getText() {
		return Dispatch.get(this, "Text").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 */
	public void setText(String text) {
		Dispatch.put(this, "Text", text);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getTracking() {
		return Dispatch.get(this, "Tracking").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tracking an input-parameter of type float
	 */
	public void setTracking(float tracking) {
		Dispatch.put(this, "Tracking", new Variant(tracking));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void toggleVerticalText() {
		Dispatch.call(this, "ToggleVerticalText");
	}

}
