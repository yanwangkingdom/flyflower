/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ColorFormat extends Dispatch {

	public static final String componentName = "Word.ColorFormat";

	public ColorFormat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ColorFormat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ColorFormat(String compName) {
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
	public int getRGB() {
		return Dispatch.get(this, "RGB").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rGB an input-parameter of type int
	 */
	public void setRGB(int rGB) {
		Dispatch.put(this, "RGB", new Variant(rGB));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSchemeColor() {
		return Dispatch.get(this, "SchemeColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param schemeColor an input-parameter of type int
	 */
	public void setSchemeColor(int schemeColor) {
		Dispatch.put(this, "SchemeColor", new Variant(schemeColor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoColorType
	 */
	public MsoColorType getType() {
		return new MsoColorType(Dispatch.get(this, "Type").toDispatch());
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
	 * @return the result is of type float
	 */
	public float getTintAndShade() {
		return Dispatch.get(this, "TintAndShade").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tintAndShade an input-parameter of type float
	 */
	public void setTintAndShade(float tintAndShade) {
		Dispatch.put(this, "TintAndShade", new Variant(tintAndShade));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getOverPrint() {
		return new MsoTriState(Dispatch.get(this, "OverPrint").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param overPrint an input-parameter of type MsoTriState
	 */
	public void setOverPrint(MsoTriState overPrint) {
		Dispatch.put(this, "OverPrint", overPrint);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type float
	 */
	public float getInk(int index) {
		return Dispatch.call(this, "Ink", new Variant(index)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 */
	public void setInk(int index) {
		Dispatch.put(this, "Ink", new Variant(index));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCyan() {
		return Dispatch.get(this, "Cyan").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cyan an input-parameter of type int
	 */
	public void setCyan(int cyan) {
		Dispatch.put(this, "Cyan", new Variant(cyan));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMagenta() {
		return Dispatch.get(this, "Magenta").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param magenta an input-parameter of type int
	 */
	public void setMagenta(int magenta) {
		Dispatch.put(this, "Magenta", new Variant(magenta));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getYellow() {
		return Dispatch.get(this, "Yellow").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param yellow an input-parameter of type int
	 */
	public void setYellow(int yellow) {
		Dispatch.put(this, "Yellow", new Variant(yellow));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBlack() {
		return Dispatch.get(this, "Black").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param black an input-parameter of type int
	 */
	public void setBlack(int black) {
		Dispatch.put(this, "Black", new Variant(black));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cyan an input-parameter of type int
	 * @param magenta an input-parameter of type int
	 * @param yellow an input-parameter of type int
	 * @param black an input-parameter of type int
	 */
	public void setCMYK(int cyan, int magenta, int yellow, int black) {
		Dispatch.call(this, "SetCMYK", new Variant(cyan), new Variant(magenta), new Variant(yellow), new Variant(black));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getObjectThemeColor() {
		return Dispatch.get(this, "ObjectThemeColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param objectThemeColor an input-parameter of type int
	 */
	public void setObjectThemeColor(int objectThemeColor) {
		Dispatch.put(this, "ObjectThemeColor", new Variant(objectThemeColor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getBrightness() {
		return Dispatch.get(this, "Brightness").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param brightness an input-parameter of type float
	 */
	public void setBrightness(float brightness) {
		Dispatch.put(this, "Brightness", new Variant(brightness));
	}

}
