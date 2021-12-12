/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Style extends Dispatch {

	public static final String componentName = "Word.Style";

	public Style() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Style(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Style(String compName) {
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
	 * @return the result is of type String
	 */
	public String getNameLocal() {
		return Dispatch.get(this, "NameLocal").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param nameLocal an input-parameter of type String
	 */
	public void setNameLocal(String nameLocal) {
		Dispatch.put(this, "NameLocal", nameLocal);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getBaseStyle() {
		return Dispatch.get(this, "BaseStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param baseStyle an input-parameter of type Variant
	 */
	public void setBaseStyle(Variant baseStyle) {
		Dispatch.put(this, "BaseStyle", baseStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getDescription() {
		return Dispatch.get(this, "Description").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getType() {
		return Dispatch.get(this, "Type").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getBuiltIn() {
		return Dispatch.get(this, "BuiltIn").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getNextParagraphStyle() {
		return Dispatch.get(this, "NextParagraphStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param nextParagraphStyle an input-parameter of type Variant
	 */
	public void setNextParagraphStyle(Variant nextParagraphStyle) {
		Dispatch.put(this, "NextParagraphStyle", nextParagraphStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getInUse() {
		return Dispatch.get(this, "InUse").changeType(Variant.VariantBoolean).getBoolean();
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
	 * @return the result is of type Frame
	 */
	public Frame getFrame() {
		return new Frame(Dispatch.get(this, "Frame").toDispatch());
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
	 * @return the result is of type boolean
	 */
	public boolean getAutomaticallyUpdate() {
		return Dispatch.get(this, "AutomaticallyUpdate").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param automaticallyUpdate an input-parameter of type boolean
	 */
	public void setAutomaticallyUpdate(boolean automaticallyUpdate) {
		Dispatch.put(this, "AutomaticallyUpdate", new Variant(automaticallyUpdate));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ListTemplate
	 */
	public ListTemplate getListTemplate() {
		return new ListTemplate(Dispatch.get(this, "ListTemplate").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getListLevelNumber() {
		return Dispatch.get(this, "ListLevelNumber").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type boolean
	 */
	public boolean getHidden() {
		return Dispatch.get(this, "Hidden").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hidden an input-parameter of type boolean
	 */
	public void setHidden(boolean hidden) {
		Dispatch.put(this, "Hidden", new Variant(hidden));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param listLevelNumber an input-parameter of type Variant
	 */
	public void linkToListTemplate(ListTemplate listTemplate, Variant listLevelNumber) {
		Dispatch.call(this, "LinkToListTemplate", listTemplate, listLevelNumber);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 */
	public void linkToListTemplate(ListTemplate listTemplate) {
		Dispatch.call(this, "LinkToListTemplate", listTemplate);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param listLevelNumber an input-parameter of type Variant
	 */
	public void linkToListTemplate(ListTemplate listTemplate, Variant listLevelNumber) {
		Dispatch.call(this, "LinkToListTemplate", listTemplate, listLevelNumber);

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

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getLinkStyle() {
		return Dispatch.get(this, "LinkStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param linkStyle an input-parameter of type Variant
	 */
	public void setLinkStyle(Variant linkStyle) {
		Dispatch.put(this, "LinkStyle", linkStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getVisibility() {
		return Dispatch.get(this, "Visibility").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param visibility an input-parameter of type boolean
	 */
	public void setVisibility(boolean visibility) {
		Dispatch.put(this, "Visibility", new Variant(visibility));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getNoSpaceBetweenParagraphsOfSameStyle() {
		return Dispatch.get(this, "NoSpaceBetweenParagraphsOfSameStyle").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param noSpaceBetweenParagraphsOfSameStyle an input-parameter of type boolean
	 */
	public void setNoSpaceBetweenParagraphsOfSameStyle(boolean noSpaceBetweenParagraphsOfSameStyle) {
		Dispatch.put(this, "NoSpaceBetweenParagraphsOfSameStyle", new Variant(noSpaceBetweenParagraphsOfSameStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TableStyle
	 */
	public TableStyle getTable() {
		return new TableStyle(Dispatch.get(this, "Table").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getLocked() {
		return Dispatch.get(this, "Locked").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param locked an input-parameter of type boolean
	 */
	public void setLocked(boolean locked) {
		Dispatch.put(this, "Locked", new Variant(locked));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPriority() {
		return Dispatch.get(this, "Priority").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param priority an input-parameter of type int
	 */
	public void setPriority(int priority) {
		Dispatch.put(this, "Priority", new Variant(priority));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getUnhideWhenUsed() {
		return Dispatch.get(this, "UnhideWhenUsed").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unhideWhenUsed an input-parameter of type boolean
	 */
	public void setUnhideWhenUsed(boolean unhideWhenUsed) {
		Dispatch.put(this, "UnhideWhenUsed", new Variant(unhideWhenUsed));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getQuickStyle() {
		return Dispatch.get(this, "QuickStyle").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param quickStyle an input-parameter of type boolean
	 */
	public void setQuickStyle(boolean quickStyle) {
		Dispatch.put(this, "QuickStyle", new Variant(quickStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getLinked() {
		return Dispatch.get(this, "Linked").changeType(Variant.VariantBoolean).getBoolean();
	}

}
