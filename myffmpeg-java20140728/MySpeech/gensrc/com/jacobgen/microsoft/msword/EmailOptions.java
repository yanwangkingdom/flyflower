/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class EmailOptions extends Dispatch {

	public static final String componentName = "Word.EmailOptions";

	public EmailOptions() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public EmailOptions(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public EmailOptions(String compName) {
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
	public boolean getUseThemeStyle() {
		return Dispatch.get(this, "UseThemeStyle").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param useThemeStyle an input-parameter of type boolean
	 */
	public void setUseThemeStyle(boolean useThemeStyle) {
		Dispatch.put(this, "UseThemeStyle", new Variant(useThemeStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getMarkCommentsWith() {
		return Dispatch.get(this, "MarkCommentsWith").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param markCommentsWith an input-parameter of type String
	 */
	public void setMarkCommentsWith(String markCommentsWith) {
		Dispatch.put(this, "MarkCommentsWith", markCommentsWith);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMarkComments() {
		return Dispatch.get(this, "MarkComments").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param markComments an input-parameter of type boolean
	 */
	public void setMarkComments(boolean markComments) {
		Dispatch.put(this, "MarkComments", new Variant(markComments));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type EmailSignature
	 */
	public EmailSignature getEmailSignature() {
		return new EmailSignature(Dispatch.get(this, "EmailSignature").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Style
	 */
	public Style getComposeStyle() {
		return new Style(Dispatch.get(this, "ComposeStyle").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Style
	 */
	public Style getReplyStyle() {
		return new Style(Dispatch.get(this, "ReplyStyle").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getThemeName() {
		return Dispatch.get(this, "ThemeName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param themeName an input-parameter of type String
	 */
	public void setThemeName(String themeName) {
		Dispatch.put(this, "ThemeName", themeName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDummy1() {
		return Dispatch.get(this, "Dummy1").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDummy2() {
		return Dispatch.get(this, "Dummy2").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void dummy3() {
		Dispatch.call(this, "Dummy3");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getNewColorOnReply() {
		return Dispatch.get(this, "NewColorOnReply").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param newColorOnReply an input-parameter of type boolean
	 */
	public void setNewColorOnReply(boolean newColorOnReply) {
		Dispatch.put(this, "NewColorOnReply", new Variant(newColorOnReply));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Style
	 */
	public Style getPlainTextStyle() {
		return new Style(Dispatch.get(this, "PlainTextStyle").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getUseThemeStyleOnReply() {
		return Dispatch.get(this, "UseThemeStyleOnReply").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param useThemeStyleOnReply an input-parameter of type boolean
	 */
	public void setUseThemeStyleOnReply(boolean useThemeStyleOnReply) {
		Dispatch.put(this, "UseThemeStyleOnReply", new Variant(useThemeStyleOnReply));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeApplyHeadings() {
		return Dispatch.get(this, "AutoFormatAsYouTypeApplyHeadings").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeApplyHeadings an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeApplyHeadings(boolean autoFormatAsYouTypeApplyHeadings) {
		Dispatch.put(this, "AutoFormatAsYouTypeApplyHeadings", new Variant(autoFormatAsYouTypeApplyHeadings));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeApplyBorders() {
		return Dispatch.get(this, "AutoFormatAsYouTypeApplyBorders").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeApplyBorders an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeApplyBorders(boolean autoFormatAsYouTypeApplyBorders) {
		Dispatch.put(this, "AutoFormatAsYouTypeApplyBorders", new Variant(autoFormatAsYouTypeApplyBorders));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeApplyBulletedLists() {
		return Dispatch.get(this, "AutoFormatAsYouTypeApplyBulletedLists").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeApplyBulletedLists an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeApplyBulletedLists(boolean autoFormatAsYouTypeApplyBulletedLists) {
		Dispatch.put(this, "AutoFormatAsYouTypeApplyBulletedLists", new Variant(autoFormatAsYouTypeApplyBulletedLists));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeApplyNumberedLists() {
		return Dispatch.get(this, "AutoFormatAsYouTypeApplyNumberedLists").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeApplyNumberedLists an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeApplyNumberedLists(boolean autoFormatAsYouTypeApplyNumberedLists) {
		Dispatch.put(this, "AutoFormatAsYouTypeApplyNumberedLists", new Variant(autoFormatAsYouTypeApplyNumberedLists));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeReplaceQuotes() {
		return Dispatch.get(this, "AutoFormatAsYouTypeReplaceQuotes").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeReplaceQuotes an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeReplaceQuotes(boolean autoFormatAsYouTypeReplaceQuotes) {
		Dispatch.put(this, "AutoFormatAsYouTypeReplaceQuotes", new Variant(autoFormatAsYouTypeReplaceQuotes));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeReplaceSymbols() {
		return Dispatch.get(this, "AutoFormatAsYouTypeReplaceSymbols").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeReplaceSymbols an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeReplaceSymbols(boolean autoFormatAsYouTypeReplaceSymbols) {
		Dispatch.put(this, "AutoFormatAsYouTypeReplaceSymbols", new Variant(autoFormatAsYouTypeReplaceSymbols));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeReplaceOrdinals() {
		return Dispatch.get(this, "AutoFormatAsYouTypeReplaceOrdinals").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeReplaceOrdinals an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeReplaceOrdinals(boolean autoFormatAsYouTypeReplaceOrdinals) {
		Dispatch.put(this, "AutoFormatAsYouTypeReplaceOrdinals", new Variant(autoFormatAsYouTypeReplaceOrdinals));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeReplaceFractions() {
		return Dispatch.get(this, "AutoFormatAsYouTypeReplaceFractions").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeReplaceFractions an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeReplaceFractions(boolean autoFormatAsYouTypeReplaceFractions) {
		Dispatch.put(this, "AutoFormatAsYouTypeReplaceFractions", new Variant(autoFormatAsYouTypeReplaceFractions));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeReplacePlainTextEmphasis() {
		return Dispatch.get(this, "AutoFormatAsYouTypeReplacePlainTextEmphasis").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeReplacePlainTextEmphasis an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeReplacePlainTextEmphasis(boolean autoFormatAsYouTypeReplacePlainTextEmphasis) {
		Dispatch.put(this, "AutoFormatAsYouTypeReplacePlainTextEmphasis", new Variant(autoFormatAsYouTypeReplacePlainTextEmphasis));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeFormatListItemBeginning() {
		return Dispatch.get(this, "AutoFormatAsYouTypeFormatListItemBeginning").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeFormatListItemBeginning an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeFormatListItemBeginning(boolean autoFormatAsYouTypeFormatListItemBeginning) {
		Dispatch.put(this, "AutoFormatAsYouTypeFormatListItemBeginning", new Variant(autoFormatAsYouTypeFormatListItemBeginning));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeDefineStyles() {
		return Dispatch.get(this, "AutoFormatAsYouTypeDefineStyles").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeDefineStyles an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeDefineStyles(boolean autoFormatAsYouTypeDefineStyles) {
		Dispatch.put(this, "AutoFormatAsYouTypeDefineStyles", new Variant(autoFormatAsYouTypeDefineStyles));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeReplaceHyperlinks() {
		return Dispatch.get(this, "AutoFormatAsYouTypeReplaceHyperlinks").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeReplaceHyperlinks an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeReplaceHyperlinks(boolean autoFormatAsYouTypeReplaceHyperlinks) {
		Dispatch.put(this, "AutoFormatAsYouTypeReplaceHyperlinks", new Variant(autoFormatAsYouTypeReplaceHyperlinks));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeApplyTables() {
		return Dispatch.get(this, "AutoFormatAsYouTypeApplyTables").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeApplyTables an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeApplyTables(boolean autoFormatAsYouTypeApplyTables) {
		Dispatch.put(this, "AutoFormatAsYouTypeApplyTables", new Variant(autoFormatAsYouTypeApplyTables));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeApplyFirstIndents() {
		return Dispatch.get(this, "AutoFormatAsYouTypeApplyFirstIndents").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeApplyFirstIndents an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeApplyFirstIndents(boolean autoFormatAsYouTypeApplyFirstIndents) {
		Dispatch.put(this, "AutoFormatAsYouTypeApplyFirstIndents", new Variant(autoFormatAsYouTypeApplyFirstIndents));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeApplyDates() {
		return Dispatch.get(this, "AutoFormatAsYouTypeApplyDates").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeApplyDates an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeApplyDates(boolean autoFormatAsYouTypeApplyDates) {
		Dispatch.put(this, "AutoFormatAsYouTypeApplyDates", new Variant(autoFormatAsYouTypeApplyDates));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeApplyClosings() {
		return Dispatch.get(this, "AutoFormatAsYouTypeApplyClosings").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeApplyClosings an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeApplyClosings(boolean autoFormatAsYouTypeApplyClosings) {
		Dispatch.put(this, "AutoFormatAsYouTypeApplyClosings", new Variant(autoFormatAsYouTypeApplyClosings));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeMatchParentheses() {
		return Dispatch.get(this, "AutoFormatAsYouTypeMatchParentheses").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeMatchParentheses an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeMatchParentheses(boolean autoFormatAsYouTypeMatchParentheses) {
		Dispatch.put(this, "AutoFormatAsYouTypeMatchParentheses", new Variant(autoFormatAsYouTypeMatchParentheses));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeReplaceFarEastDashes() {
		return Dispatch.get(this, "AutoFormatAsYouTypeReplaceFarEastDashes").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeReplaceFarEastDashes an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeReplaceFarEastDashes(boolean autoFormatAsYouTypeReplaceFarEastDashes) {
		Dispatch.put(this, "AutoFormatAsYouTypeReplaceFarEastDashes", new Variant(autoFormatAsYouTypeReplaceFarEastDashes));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeDeleteAutoSpaces() {
		return Dispatch.get(this, "AutoFormatAsYouTypeDeleteAutoSpaces").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeDeleteAutoSpaces an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeDeleteAutoSpaces(boolean autoFormatAsYouTypeDeleteAutoSpaces) {
		Dispatch.put(this, "AutoFormatAsYouTypeDeleteAutoSpaces", new Variant(autoFormatAsYouTypeDeleteAutoSpaces));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeInsertClosings() {
		return Dispatch.get(this, "AutoFormatAsYouTypeInsertClosings").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeInsertClosings an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeInsertClosings(boolean autoFormatAsYouTypeInsertClosings) {
		Dispatch.put(this, "AutoFormatAsYouTypeInsertClosings", new Variant(autoFormatAsYouTypeInsertClosings));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeAutoLetterWizard() {
		return Dispatch.get(this, "AutoFormatAsYouTypeAutoLetterWizard").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeAutoLetterWizard an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeAutoLetterWizard(boolean autoFormatAsYouTypeAutoLetterWizard) {
		Dispatch.put(this, "AutoFormatAsYouTypeAutoLetterWizard", new Variant(autoFormatAsYouTypeAutoLetterWizard));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatAsYouTypeInsertOvers() {
		return Dispatch.get(this, "AutoFormatAsYouTypeInsertOvers").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatAsYouTypeInsertOvers an input-parameter of type boolean
	 */
	public void setAutoFormatAsYouTypeInsertOvers(boolean autoFormatAsYouTypeInsertOvers) {
		Dispatch.put(this, "AutoFormatAsYouTypeInsertOvers", new Variant(autoFormatAsYouTypeInsertOvers));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getRelyOnCSS() {
		return Dispatch.get(this, "RelyOnCSS").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param relyOnCSS an input-parameter of type boolean
	 */
	public void setRelyOnCSS(boolean relyOnCSS) {
		Dispatch.put(this, "RelyOnCSS", new Variant(relyOnCSS));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHTMLFidelity() {
		return Dispatch.get(this, "HTMLFidelity").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hTMLFidelity an input-parameter of type int
	 */
	public void setHTMLFidelity(int hTMLFidelity) {
		Dispatch.put(this, "HTMLFidelity", new Variant(hTMLFidelity));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getEmbedSmartTag() {
		return Dispatch.get(this, "EmbedSmartTag").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param embedSmartTag an input-parameter of type boolean
	 */
	public void setEmbedSmartTag(boolean embedSmartTag) {
		Dispatch.put(this, "EmbedSmartTag", new Variant(embedSmartTag));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getTabIndentKey() {
		return Dispatch.get(this, "TabIndentKey").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tabIndentKey an input-parameter of type boolean
	 */
	public void setTabIndentKey(boolean tabIndentKey) {
		Dispatch.put(this, "TabIndentKey", new Variant(tabIndentKey));
	}

}
