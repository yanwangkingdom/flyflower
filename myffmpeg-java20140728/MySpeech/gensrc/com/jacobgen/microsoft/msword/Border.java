/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Border extends Dispatch {

	public static final String componentName = "Word.Border";

	public Border() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Border(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Border(String compName) {
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
	 * @return the result is of type boolean
	 */
	public boolean getVisible() {
		return Dispatch.get(this, "Visible").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param visible an input-parameter of type boolean
	 */
	public void setVisible(boolean visible) {
		Dispatch.put(this, "Visible", new Variant(visible));
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
	 * @return the result is of type boolean
	 */
	public boolean getInside() {
		return Dispatch.get(this, "Inside").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLineStyle() {
		return Dispatch.get(this, "LineStyle").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lineStyle an input-parameter of type int
	 */
	public void setLineStyle(int lineStyle) {
		Dispatch.put(this, "LineStyle", new Variant(lineStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLineWidth() {
		return Dispatch.get(this, "LineWidth").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lineWidth an input-parameter of type int
	 */
	public void setLineWidth(int lineWidth) {
		Dispatch.put(this, "LineWidth", new Variant(lineWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getArtStyle() {
		return Dispatch.get(this, "ArtStyle").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param artStyle an input-parameter of type int
	 */
	public void setArtStyle(int artStyle) {
		Dispatch.put(this, "ArtStyle", new Variant(artStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getArtWidth() {
		return Dispatch.get(this, "ArtWidth").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param artWidth an input-parameter of type int
	 */
	public void setArtWidth(int artWidth) {
		Dispatch.put(this, "ArtWidth", new Variant(artWidth));
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

}
