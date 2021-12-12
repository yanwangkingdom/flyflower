/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class _Font extends Dispatch {

	public static final String componentName = "Word._Font";

	public _Font() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public _Font(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public _Font(String compName) {
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
	 * @return the result is of type Font
	 */
	public Font getDuplicate() {
		return new Font(Dispatch.get(this, "Duplicate").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBold() {
		return Dispatch.get(this, "Bold").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bold an input-parameter of type int
	 */
	public void setBold(int bold) {
		Dispatch.put(this, "Bold", new Variant(bold));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getItalic() {
		return Dispatch.get(this, "Italic").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param italic an input-parameter of type int
	 */
	public void setItalic(int italic) {
		Dispatch.put(this, "Italic", new Variant(italic));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHidden() {
		return Dispatch.get(this, "Hidden").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hidden an input-parameter of type int
	 */
	public void setHidden(int hidden) {
		Dispatch.put(this, "Hidden", new Variant(hidden));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSmallCaps() {
		return Dispatch.get(this, "SmallCaps").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param smallCaps an input-parameter of type int
	 */
	public void setSmallCaps(int smallCaps) {
		Dispatch.put(this, "SmallCaps", new Variant(smallCaps));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAllCaps() {
		return Dispatch.get(this, "AllCaps").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allCaps an input-parameter of type int
	 */
	public void setAllCaps(int allCaps) {
		Dispatch.put(this, "AllCaps", new Variant(allCaps));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getStrikeThrough() {
		return Dispatch.get(this, "StrikeThrough").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param strikeThrough an input-parameter of type int
	 */
	public void setStrikeThrough(int strikeThrough) {
		Dispatch.put(this, "StrikeThrough", new Variant(strikeThrough));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDoubleStrikeThrough() {
		return Dispatch.get(this, "DoubleStrikeThrough").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doubleStrikeThrough an input-parameter of type int
	 */
	public void setDoubleStrikeThrough(int doubleStrikeThrough) {
		Dispatch.put(this, "DoubleStrikeThrough", new Variant(doubleStrikeThrough));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getColorIndex() {
		return Dispatch.get(this, "ColorIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param colorIndex an input-parameter of type int
	 */
	public void setColorIndex(int colorIndex) {
		Dispatch.put(this, "ColorIndex", new Variant(colorIndex));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSubscript() {
		return Dispatch.get(this, "Subscript").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param subscript an input-parameter of type int
	 */
	public void setSubscript(int subscript) {
		Dispatch.put(this, "Subscript", new Variant(subscript));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSuperscript() {
		return Dispatch.get(this, "Superscript").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param superscript an input-parameter of type int
	 */
	public void setSuperscript(int superscript) {
		Dispatch.put(this, "Superscript", new Variant(superscript));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getUnderline() {
		return Dispatch.get(this, "Underline").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param underline an input-parameter of type int
	 */
	public void setUnderline(int underline) {
		Dispatch.put(this, "Underline", new Variant(underline));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getSize() {
		return Dispatch.get(this, "Size").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param size an input-parameter of type float
	 */
	public void setSize(float size) {
		Dispatch.put(this, "Size", new Variant(size));
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
	 * @return the result is of type int
	 */
	public int getPosition() {
		return Dispatch.get(this, "Position").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param position an input-parameter of type int
	 */
	public void setPosition(int position) {
		Dispatch.put(this, "Position", new Variant(position));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getSpacing() {
		return Dispatch.get(this, "Spacing").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param spacing an input-parameter of type float
	 */
	public void setSpacing(float spacing) {
		Dispatch.put(this, "Spacing", new Variant(spacing));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getScaling() {
		return Dispatch.get(this, "Scaling").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param scaling an input-parameter of type int
	 */
	public void setScaling(int scaling) {
		Dispatch.put(this, "Scaling", new Variant(scaling));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getShadow() {
		return Dispatch.get(this, "Shadow").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shadow an input-parameter of type int
	 */
	public void setShadow(int shadow) {
		Dispatch.put(this, "Shadow", new Variant(shadow));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOutline() {
		return Dispatch.get(this, "Outline").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outline an input-parameter of type int
	 */
	public void setOutline(int outline) {
		Dispatch.put(this, "Outline", new Variant(outline));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getEmboss() {
		return Dispatch.get(this, "Emboss").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param emboss an input-parameter of type int
	 */
	public void setEmboss(int emboss) {
		Dispatch.put(this, "Emboss", new Variant(emboss));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getKerning() {
		return Dispatch.get(this, "Kerning").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param kerning an input-parameter of type float
	 */
	public void setKerning(float kerning) {
		Dispatch.put(this, "Kerning", new Variant(kerning));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getEngrave() {
		return Dispatch.get(this, "Engrave").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param engrave an input-parameter of type int
	 */
	public void setEngrave(int engrave) {
		Dispatch.put(this, "Engrave", new Variant(engrave));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAnimation() {
		return Dispatch.get(this, "Animation").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param animation an input-parameter of type int
	 */
	public void setAnimation(int animation) {
		Dispatch.put(this, "Animation", new Variant(animation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Borders
	 */
	public Borders getBorders() {
		return new Borders(Dispatch.get(this, "Borders").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param borders an input-parameter of type Borders
	 */
	public void setBorders(Borders borders) {
		Dispatch.put(this, "Borders", borders);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Shading
	 */
	public Shading getShading() {
		return new Shading(Dispatch.get(this, "Shading").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getEmphasisMark() {
		return Dispatch.get(this, "EmphasisMark").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param emphasisMark an input-parameter of type int
	 */
	public void setEmphasisMark(int emphasisMark) {
		Dispatch.put(this, "EmphasisMark", new Variant(emphasisMark));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisableCharacterSpaceGrid() {
		return Dispatch.get(this, "DisableCharacterSpaceGrid").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param disableCharacterSpaceGrid an input-parameter of type boolean
	 */
	public void setDisableCharacterSpaceGrid(boolean disableCharacterSpaceGrid) {
		Dispatch.put(this, "DisableCharacterSpaceGrid", new Variant(disableCharacterSpaceGrid));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getNameFarEast() {
		return Dispatch.get(this, "NameFarEast").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param nameFarEast an input-parameter of type String
	 */
	public void setNameFarEast(String nameFarEast) {
		Dispatch.put(this, "NameFarEast", nameFarEast);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getNameAscii() {
		return Dispatch.get(this, "NameAscii").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param nameAscii an input-parameter of type String
	 */
	public void setNameAscii(String nameAscii) {
		Dispatch.put(this, "NameAscii", nameAscii);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getNameOther() {
		return Dispatch.get(this, "NameOther").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param nameOther an input-parameter of type String
	 */
	public void setNameOther(String nameOther) {
		Dispatch.put(this, "NameOther", nameOther);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void grow() {
		Dispatch.call(this, "Grow");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void shrink() {
		Dispatch.call(this, "Shrink");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void reset() {
		Dispatch.call(this, "Reset");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void setAsTemplateDefault() {
		Dispatch.call(this, "SetAsTemplateDefault");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getColor() {
		return Dispatch.get(this, "Color").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param color an input-parameter of type int
	 */
	public void setColor(int color) {
		Dispatch.put(this, "Color", new Variant(color));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBoldBi() {
		return Dispatch.get(this, "BoldBi").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param boldBi an input-parameter of type int
	 */
	public void setBoldBi(int boldBi) {
		Dispatch.put(this, "BoldBi", new Variant(boldBi));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getItalicBi() {
		return Dispatch.get(this, "ItalicBi").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param italicBi an input-parameter of type int
	 */
	public void setItalicBi(int italicBi) {
		Dispatch.put(this, "ItalicBi", new Variant(italicBi));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getSizeBi() {
		return Dispatch.get(this, "SizeBi").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sizeBi an input-parameter of type float
	 */
	public void setSizeBi(float sizeBi) {
		Dispatch.put(this, "SizeBi", new Variant(sizeBi));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getNameBi() {
		return Dispatch.get(this, "NameBi").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param nameBi an input-parameter of type String
	 */
	public void setNameBi(String nameBi) {
		Dispatch.put(this, "NameBi", nameBi);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getColorIndexBi() {
		return Dispatch.get(this, "ColorIndexBi").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param colorIndexBi an input-parameter of type int
	 */
	public void setColorIndexBi(int colorIndexBi) {
		Dispatch.put(this, "ColorIndexBi", new Variant(colorIndexBi));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDiacriticColor() {
		return Dispatch.get(this, "DiacriticColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param diacriticColor an input-parameter of type int
	 */
	public void setDiacriticColor(int diacriticColor) {
		Dispatch.put(this, "DiacriticColor", new Variant(diacriticColor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getUnderlineColor() {
		return Dispatch.get(this, "UnderlineColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param underlineColor an input-parameter of type int
	 */
	public void setUnderlineColor(int underlineColor) {
		Dispatch.put(this, "UnderlineColor", new Variant(underlineColor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type GlowFormat
	 */
	public GlowFormat getGlow() {
		return new GlowFormat(Dispatch.get(this, "Glow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param glow an input-parameter of type GlowFormat
	 */
	public void setGlow(GlowFormat glow) {
		Dispatch.put(this, "Glow", glow);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ReflectionFormat
	 */
	public ReflectionFormat getReflection() {
		return new ReflectionFormat(Dispatch.get(this, "Reflection").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param reflection an input-parameter of type ReflectionFormat
	 */
	public void setReflection(ReflectionFormat reflection) {
		Dispatch.put(this, "Reflection", reflection);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ShadowFormat
	 */
	public ShadowFormat getTextShadow() {
		return new ShadowFormat(Dispatch.get(this, "TextShadow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textShadow an input-parameter of type ShadowFormat
	 */
	public void setTextShadow(ShadowFormat textShadow) {
		Dispatch.put(this, "TextShadow", textShadow);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FillFormat
	 */
	public FillFormat getFill() {
		return new FillFormat(Dispatch.get(this, "Fill").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fill an input-parameter of type FillFormat
	 */
	public void setFill(FillFormat fill) {
		Dispatch.put(this, "Fill", fill);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type LineFormat
	 */
	public LineFormat getLine() {
		return new LineFormat(Dispatch.get(this, "Line").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param line an input-parameter of type LineFormat
	 */
	public void setLine(LineFormat line) {
		Dispatch.put(this, "Line", line);
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
	 * @param threeD an input-parameter of type ThreeDFormat
	 */
	public void setThreeD(ThreeDFormat threeD) {
		Dispatch.put(this, "ThreeD", threeD);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ColorFormat
	 */
	public ColorFormat getTextColor() {
		return new ColorFormat(Dispatch.get(this, "TextColor").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLigatures() {
		return Dispatch.get(this, "Ligatures").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param ligatures an input-parameter of type int
	 */
	public void setLigatures(int ligatures) {
		Dispatch.put(this, "Ligatures", new Variant(ligatures));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNumberForm() {
		return Dispatch.get(this, "NumberForm").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberForm an input-parameter of type int
	 */
	public void setNumberForm(int numberForm) {
		Dispatch.put(this, "NumberForm", new Variant(numberForm));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNumberSpacing() {
		return Dispatch.get(this, "NumberSpacing").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberSpacing an input-parameter of type int
	 */
	public void setNumberSpacing(int numberSpacing) {
		Dispatch.put(this, "NumberSpacing", new Variant(numberSpacing));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getContextualAlternates() {
		return Dispatch.get(this, "ContextualAlternates").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param contextualAlternates an input-parameter of type int
	 */
	public void setContextualAlternates(int contextualAlternates) {
		Dispatch.put(this, "ContextualAlternates", new Variant(contextualAlternates));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getStylisticSet() {
		return Dispatch.get(this, "StylisticSet").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param stylisticSet an input-parameter of type int
	 */
	public void setStylisticSet(int stylisticSet) {
		Dispatch.put(this, "StylisticSet", new Variant(stylisticSet));
	}

}
