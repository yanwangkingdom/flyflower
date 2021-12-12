/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Replacement extends Dispatch {

	public static final String componentName = "Word.Replacement";

	public Replacement() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Replacement(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Replacement(String compName) {
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
	public Font getFont() {
		return new Font(Dispatch.get(this, "Font").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param font an input-parameter of type Font
	 */
	public void setFont(Font font) {
		Dispatch.put(this, "Font", font);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ParagraphFormat
	 */
	public ParagraphFormat getParagraphFormat() {
		return new ParagraphFormat(Dispatch.get(this, "ParagraphFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param paragraphFormat an input-parameter of type ParagraphFormat
	 */
	public void setParagraphFormat(ParagraphFormat paragraphFormat) {
		Dispatch.put(this, "ParagraphFormat", paragraphFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getStyle() {
		return Dispatch.get(this, "Style");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type Variant
	 */
	public void setStyle(Variant style) {
		Dispatch.put(this, "Style", style);
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
	 * @return the result is of type int
	 */
	public int getLanguageID() {
		return Dispatch.get(this, "LanguageID").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param languageID an input-parameter of type int
	 */
	public void setLanguageID(int languageID) {
		Dispatch.put(this, "LanguageID", new Variant(languageID));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHighlight() {
		return Dispatch.get(this, "Highlight").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param highlight an input-parameter of type int
	 */
	public void setHighlight(int highlight) {
		Dispatch.put(this, "Highlight", new Variant(highlight));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Frame
	 */
	public Frame getFrame() {
		return new Frame(Dispatch.get(this, "Frame").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLanguageIDFarEast() {
		return Dispatch.get(this, "LanguageIDFarEast").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param languageIDFarEast an input-parameter of type int
	 */
	public void setLanguageIDFarEast(int languageIDFarEast) {
		Dispatch.put(this, "LanguageIDFarEast", new Variant(languageIDFarEast));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clearFormatting() {
		Dispatch.call(this, "ClearFormatting");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNoProofing() {
		return Dispatch.get(this, "NoProofing").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param noProofing an input-parameter of type int
	 */
	public void setNoProofing(int noProofing) {
		Dispatch.put(this, "NoProofing", new Variant(noProofing));
	}

}
