/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class FillFormat extends Dispatch {

	public static final String componentName = "Word.FillFormat";

	public FillFormat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public FillFormat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public FillFormat(String compName) {
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
	 * @return the result is of type ColorFormat
	 */
	public ColorFormat getForeColor() {
		return new ColorFormat(Dispatch.get(this, "ForeColor").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoGradientColorType
	 */
	public MsoGradientColorType getGradientColorType() {
		return new MsoGradientColorType(Dispatch.get(this, "GradientColorType").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getGradientDegree() {
		return Dispatch.get(this, "GradientDegree").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoGradientStyle
	 */
	public MsoGradientStyle getGradientStyle() {
		return new MsoGradientStyle(Dispatch.get(this, "GradientStyle").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getGradientVariant() {
		return Dispatch.get(this, "GradientVariant").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type MsoPresetGradientType
	 */
	public MsoPresetGradientType getPresetGradientType() {
		return new MsoPresetGradientType(Dispatch.get(this, "PresetGradientType").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoPresetTexture
	 */
	public MsoPresetTexture getPresetTexture() {
		return new MsoPresetTexture(Dispatch.get(this, "PresetTexture").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getTextureName() {
		return Dispatch.get(this, "TextureName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTextureType
	 */
	public MsoTextureType getTextureType() {
		return new MsoTextureType(Dispatch.get(this, "TextureType").toDispatch());
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
	 * @return the result is of type MsoFillType
	 */
	public MsoFillType getType() {
		return new MsoFillType(Dispatch.get(this, "Type").toDispatch());
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
	 */
	public void background() {
		Dispatch.call(this, "Background");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type MsoGradientStyle
	 * @param variant an input-parameter of type int
	 * @param degree an input-parameter of type float
	 */
	public void oneColorGradient(MsoGradientStyle style, int variant, float degree) {
		Dispatch.call(this, "OneColorGradient", style, new Variant(variant), new Variant(degree));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pattern an input-parameter of type MsoPatternType
	 */
	public void patterned(MsoPatternType pattern) {
		Dispatch.call(this, "Patterned", pattern);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type MsoGradientStyle
	 * @param variant an input-parameter of type int
	 * @param presetGradientType an input-parameter of type MsoPresetGradientType
	 */
	public void presetGradient(MsoGradientStyle style, int variant, MsoPresetGradientType presetGradientType) {
		Dispatch.call(this, "PresetGradient", style, new Variant(variant), presetGradientType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param presetTexture an input-parameter of type MsoPresetTexture
	 */
	public void presetTextured(MsoPresetTexture presetTexture) {
		Dispatch.call(this, "PresetTextured", presetTexture);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void solid() {
		Dispatch.call(this, "Solid");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type MsoGradientStyle
	 * @param variant an input-parameter of type int
	 */
	public void twoColorGradient(MsoGradientStyle style, int variant) {
		Dispatch.call(this, "TwoColorGradient", style, new Variant(variant));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pictureFile an input-parameter of type String
	 */
	public void userPicture(String pictureFile) {
		Dispatch.call(this, "UserPicture", pictureFile);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textureFile an input-parameter of type String
	 */
	public void userTextured(String textureFile) {
		Dispatch.call(this, "UserTextured", textureFile);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type GradientStops
	 */
	public GradientStops getGradientStops() {
		return new GradientStops(Dispatch.get(this, "GradientStops").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getTextureOffsetX() {
		return Dispatch.get(this, "TextureOffsetX").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textureOffsetX an input-parameter of type float
	 */
	public void setTextureOffsetX(float textureOffsetX) {
		Dispatch.put(this, "TextureOffsetX", new Variant(textureOffsetX));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getTextureOffsetY() {
		return Dispatch.get(this, "TextureOffsetY").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textureOffsetY an input-parameter of type float
	 */
	public void setTextureOffsetY(float textureOffsetY) {
		Dispatch.put(this, "TextureOffsetY", new Variant(textureOffsetY));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTextureAlignment
	 */
	public MsoTextureAlignment getTextureAlignment() {
		return new MsoTextureAlignment(Dispatch.get(this, "TextureAlignment").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textureAlignment an input-parameter of type MsoTextureAlignment
	 */
	public void setTextureAlignment(MsoTextureAlignment textureAlignment) {
		Dispatch.put(this, "TextureAlignment", textureAlignment);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getTextureHorizontalScale() {
		return Dispatch.get(this, "TextureHorizontalScale").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textureHorizontalScale an input-parameter of type float
	 */
	public void setTextureHorizontalScale(float textureHorizontalScale) {
		Dispatch.put(this, "TextureHorizontalScale", new Variant(textureHorizontalScale));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getTextureVerticalScale() {
		return Dispatch.get(this, "TextureVerticalScale").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textureVerticalScale an input-parameter of type float
	 */
	public void setTextureVerticalScale(float textureVerticalScale) {
		Dispatch.put(this, "TextureVerticalScale", new Variant(textureVerticalScale));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getTextureTile() {
		return new MsoTriState(Dispatch.get(this, "TextureTile").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textureTile an input-parameter of type MsoTriState
	 */
	public void setTextureTile(MsoTriState textureTile) {
		Dispatch.put(this, "TextureTile", textureTile);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getRotateWithObject() {
		return new MsoTriState(Dispatch.get(this, "RotateWithObject").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rotateWithObject an input-parameter of type MsoTriState
	 */
	public void setRotateWithObject(MsoTriState rotateWithObject) {
		Dispatch.put(this, "RotateWithObject", rotateWithObject);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type PictureEffects
	 */
	public PictureEffects getPictureEffects() {
		return new PictureEffects(Dispatch.get(this, "PictureEffects").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getGradientAngle() {
		return Dispatch.get(this, "GradientAngle").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gradientAngle an input-parameter of type float
	 */
	public void setGradientAngle(float gradientAngle) {
		Dispatch.put(this, "GradientAngle", new Variant(gradientAngle));
	}

}
