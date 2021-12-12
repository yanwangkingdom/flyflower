/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Find extends Dispatch {

	public static final String componentName = "Word.Find";

	public Find() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Find(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Find(String compName) {
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
	public boolean getForward() {
		return Dispatch.get(this, "Forward").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param forward an input-parameter of type boolean
	 */
	public void setForward(boolean forward) {
		Dispatch.put(this, "Forward", new Variant(forward));
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
	 * @return the result is of type boolean
	 */
	public boolean getFound() {
		return Dispatch.get(this, "Found").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchAllWordForms() {
		return Dispatch.get(this, "MatchAllWordForms").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchAllWordForms an input-parameter of type boolean
	 */
	public void setMatchAllWordForms(boolean matchAllWordForms) {
		Dispatch.put(this, "MatchAllWordForms", new Variant(matchAllWordForms));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchCase() {
		return Dispatch.get(this, "MatchCase").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchCase an input-parameter of type boolean
	 */
	public void setMatchCase(boolean matchCase) {
		Dispatch.put(this, "MatchCase", new Variant(matchCase));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchWildcards() {
		return Dispatch.get(this, "MatchWildcards").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchWildcards an input-parameter of type boolean
	 */
	public void setMatchWildcards(boolean matchWildcards) {
		Dispatch.put(this, "MatchWildcards", new Variant(matchWildcards));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchSoundsLike() {
		return Dispatch.get(this, "MatchSoundsLike").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchSoundsLike an input-parameter of type boolean
	 */
	public void setMatchSoundsLike(boolean matchSoundsLike) {
		Dispatch.put(this, "MatchSoundsLike", new Variant(matchSoundsLike));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchWholeWord() {
		return Dispatch.get(this, "MatchWholeWord").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchWholeWord an input-parameter of type boolean
	 */
	public void setMatchWholeWord(boolean matchWholeWord) {
		Dispatch.put(this, "MatchWholeWord", new Variant(matchWholeWord));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchFuzzy() {
		return Dispatch.get(this, "MatchFuzzy").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchFuzzy an input-parameter of type boolean
	 */
	public void setMatchFuzzy(boolean matchFuzzy) {
		Dispatch.put(this, "MatchFuzzy", new Variant(matchFuzzy));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchByte() {
		return Dispatch.get(this, "MatchByte").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchByte an input-parameter of type boolean
	 */
	public void setMatchByte(boolean matchByte) {
		Dispatch.put(this, "MatchByte", new Variant(matchByte));
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
	 * @return the result is of type Replacement
	 */
	public Replacement getReplacement() {
		return new Replacement(Dispatch.get(this, "Replacement").toDispatch());
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
	public int getWrap() {
		return Dispatch.get(this, "Wrap").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param wrap an input-parameter of type int
	 */
	public void setWrap(int wrap) {
		Dispatch.put(this, "Wrap", new Variant(wrap));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFormat() {
		return Dispatch.get(this, "Format").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type boolean
	 */
	public void setFormat(boolean format) {
		Dispatch.put(this, "Format", new Variant(format));
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
	 * @return the result is of type int
	 */
	public int getLanguageIDOther() {
		return Dispatch.get(this, "LanguageIDOther").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param languageIDOther an input-parameter of type int
	 */
	public void setLanguageIDOther(int languageIDOther) {
		Dispatch.put(this, "LanguageIDOther", new Variant(languageIDOther));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCorrectHangulEndings() {
		return Dispatch.get(this, "CorrectHangulEndings").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param correctHangulEndings an input-parameter of type boolean
	 */
	public void setCorrectHangulEndings(boolean correctHangulEndings) {
		Dispatch.put(this, "CorrectHangulEndings", new Variant(correctHangulEndings));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean executeOld(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace) {
		return Dispatch.callN(this, "ExecuteOld", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean executeOld(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith) {
		return Dispatch.callN(this, "ExecuteOld", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean executeOld(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format) {
		return Dispatch.callN(this, "ExecuteOld", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean executeOld(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap) {
		return Dispatch.call(this, "ExecuteOld", findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean executeOld(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward) {
		return Dispatch.call(this, "ExecuteOld", findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean executeOld(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms) {
		return Dispatch.call(this, "ExecuteOld", findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean executeOld(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike) {
		return Dispatch.call(this, "ExecuteOld", findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean executeOld(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards) {
		return Dispatch.call(this, "ExecuteOld", findText, matchCase, matchWholeWord, matchWildcards).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean executeOld(Variant findText, Variant matchCase, Variant matchWholeWord) {
		return Dispatch.call(this, "ExecuteOld", findText, matchCase, matchWholeWord).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean executeOld(Variant findText, Variant matchCase) {
		return Dispatch.call(this, "ExecuteOld", findText, matchCase).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean executeOld(Variant findText) {
		return Dispatch.call(this, "ExecuteOld", findText).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean executeOld() {
		return Dispatch.call(this, "ExecuteOld").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean executeOld(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace) {
		boolean result_of_ExecuteOld = Dispatch.callN(this, "ExecuteOld", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace}).changeType(Variant.VariantBoolean).getBoolean();


		return result_of_ExecuteOld;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clearFormatting() {
		Dispatch.call(this, "ClearFormatting");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void setAllFuzzyOptions() {
		Dispatch.call(this, "SetAllFuzzyOptions");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clearAllFuzzyOptions() {
		Dispatch.call(this, "ClearAllFuzzyOptions");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl) {
		return Dispatch.callN(this, "Execute", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics, matchAlefHamza, matchControl}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza) {
		return Dispatch.callN(this, "Execute", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics, matchAlefHamza}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics) {
		return Dispatch.callN(this, "Execute", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida) {
		return Dispatch.callN(this, "Execute", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace) {
		return Dispatch.callN(this, "Execute", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith) {
		return Dispatch.callN(this, "Execute", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format) {
		return Dispatch.callN(this, "Execute", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap) {
		return Dispatch.call(this, "Execute", findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward) {
		return Dispatch.call(this, "Execute", findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms) {
		return Dispatch.call(this, "Execute", findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike) {
		return Dispatch.call(this, "Execute", findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards) {
		return Dispatch.call(this, "Execute", findText, matchCase, matchWholeWord, matchWildcards).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord) {
		return Dispatch.call(this, "Execute", findText, matchCase, matchWholeWord).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase) {
		return Dispatch.call(this, "Execute", findText, matchCase).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText) {
		return Dispatch.call(this, "Execute", findText).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean execute() {
		return Dispatch.call(this, "Execute").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl) {
		boolean result_of_Execute = Dispatch.callN(this, "Execute", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics, matchAlefHamza, matchControl}).changeType(Variant.VariantBoolean).getBoolean();


		return result_of_Execute;
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
	 * @return the result is of type boolean
	 */
	public boolean getMatchKashida() {
		return Dispatch.get(this, "MatchKashida").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchKashida an input-parameter of type boolean
	 */
	public void setMatchKashida(boolean matchKashida) {
		Dispatch.put(this, "MatchKashida", new Variant(matchKashida));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchDiacritics() {
		return Dispatch.get(this, "MatchDiacritics").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchDiacritics an input-parameter of type boolean
	 */
	public void setMatchDiacritics(boolean matchDiacritics) {
		Dispatch.put(this, "MatchDiacritics", new Variant(matchDiacritics));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchAlefHamza() {
		return Dispatch.get(this, "MatchAlefHamza").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchAlefHamza an input-parameter of type boolean
	 */
	public void setMatchAlefHamza(boolean matchAlefHamza) {
		Dispatch.put(this, "MatchAlefHamza", new Variant(matchAlefHamza));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchControl() {
		return Dispatch.get(this, "MatchControl").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchControl an input-parameter of type boolean
	 */
	public void setMatchControl(boolean matchControl) {
		Dispatch.put(this, "MatchControl", new Variant(matchControl));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchPhrase() {
		return Dispatch.get(this, "MatchPhrase").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchPhrase an input-parameter of type boolean
	 */
	public void setMatchPhrase(boolean matchPhrase) {
		Dispatch.put(this, "MatchPhrase", new Variant(matchPhrase));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchPrefix() {
		return Dispatch.get(this, "MatchPrefix").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchPrefix an input-parameter of type boolean
	 */
	public void setMatchPrefix(boolean matchPrefix) {
		Dispatch.put(this, "MatchPrefix", new Variant(matchPrefix));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMatchSuffix() {
		return Dispatch.get(this, "MatchSuffix").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param matchSuffix an input-parameter of type boolean
	 */
	public void setMatchSuffix(boolean matchSuffix) {
		Dispatch.put(this, "MatchSuffix", new Variant(matchSuffix));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIgnoreSpace() {
		return Dispatch.get(this, "IgnoreSpace").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param ignoreSpace an input-parameter of type boolean
	 */
	public void setIgnoreSpace(boolean ignoreSpace) {
		Dispatch.put(this, "IgnoreSpace", new Variant(ignoreSpace));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIgnorePunct() {
		return Dispatch.get(this, "IgnorePunct").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param ignorePunct an input-parameter of type boolean
	 */
	public void setIgnorePunct(boolean ignorePunct) {
		Dispatch.put(this, "IgnorePunct", new Variant(ignorePunct));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param matchByte an input-parameter of type Variant
	 * @param matchFuzzy an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @param ignoreSpace an input-parameter of type Variant
	 * @param ignorePunct an input-parameter of type Variant
	 * @param hanjaPhoneticHangul an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant matchByte, Variant matchFuzzy, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl, Variant ignoreSpace, Variant ignorePunct, Variant hanjaPhoneticHangul) {
		return Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards, matchSoundsLike, matchAllWordForms, matchByte, matchFuzzy, matchKashida, matchDiacritics, matchAlefHamza, matchControl, ignoreSpace, ignorePunct, hanjaPhoneticHangul}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param matchByte an input-parameter of type Variant
	 * @param matchFuzzy an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @param ignoreSpace an input-parameter of type Variant
	 * @param ignorePunct an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant matchByte, Variant matchFuzzy, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl, Variant ignoreSpace, Variant ignorePunct) {
		return Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards, matchSoundsLike, matchAllWordForms, matchByte, matchFuzzy, matchKashida, matchDiacritics, matchAlefHamza, matchControl, ignoreSpace, ignorePunct}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param matchByte an input-parameter of type Variant
	 * @param matchFuzzy an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @param ignoreSpace an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant matchByte, Variant matchFuzzy, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl, Variant ignoreSpace) {
		return Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards, matchSoundsLike, matchAllWordForms, matchByte, matchFuzzy, matchKashida, matchDiacritics, matchAlefHamza, matchControl, ignoreSpace}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param matchByte an input-parameter of type Variant
	 * @param matchFuzzy an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant matchByte, Variant matchFuzzy, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl) {
		return Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards, matchSoundsLike, matchAllWordForms, matchByte, matchFuzzy, matchKashida, matchDiacritics, matchAlefHamza, matchControl}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param matchByte an input-parameter of type Variant
	 * @param matchFuzzy an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant matchByte, Variant matchFuzzy, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza) {
		return Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards, matchSoundsLike, matchAllWordForms, matchByte, matchFuzzy, matchKashida, matchDiacritics, matchAlefHamza}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param matchByte an input-parameter of type Variant
	 * @param matchFuzzy an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant matchByte, Variant matchFuzzy, Variant matchKashida, Variant matchDiacritics) {
		return Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards, matchSoundsLike, matchAllWordForms, matchByte, matchFuzzy, matchKashida, matchDiacritics}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param matchByte an input-parameter of type Variant
	 * @param matchFuzzy an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant matchByte, Variant matchFuzzy, Variant matchKashida) {
		return Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards, matchSoundsLike, matchAllWordForms, matchByte, matchFuzzy, matchKashida}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param matchByte an input-parameter of type Variant
	 * @param matchFuzzy an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant matchByte, Variant matchFuzzy) {
		return Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards, matchSoundsLike, matchAllWordForms, matchByte, matchFuzzy}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param matchByte an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant matchByte) {
		return Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards, matchSoundsLike, matchAllWordForms, matchByte}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms) {
		return Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards, matchSoundsLike, matchAllWordForms}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards, Variant matchSoundsLike) {
		return Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards, matchSoundsLike}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards) {
		return Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase) {
		return Dispatch.call(this, "HitHighlight", findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix) {
		return Dispatch.call(this, "HitHighlight", findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix) {
		return Dispatch.call(this, "HitHighlight", findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord) {
		return Dispatch.call(this, "HitHighlight", findText, highlightColor, textColor, matchCase, matchWholeWord).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase) {
		return Dispatch.call(this, "HitHighlight", findText, highlightColor, textColor, matchCase).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor) {
		return Dispatch.call(this, "HitHighlight", findText, highlightColor, textColor).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor) {
		return Dispatch.call(this, "HitHighlight", findText, highlightColor).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText) {
		return Dispatch.call(this, "HitHighlight", findText).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param highlightColor an input-parameter of type Variant
	 * @param textColor an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param matchByte an input-parameter of type Variant
	 * @param matchFuzzy an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @param ignoreSpace an input-parameter of type Variant
	 * @param ignorePunct an input-parameter of type Variant
	 * @param hanjaPhoneticHangul an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean hitHighlight(Variant findText, Variant highlightColor, Variant textColor, Variant matchCase, Variant matchWholeWord, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant matchByte, Variant matchFuzzy, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl, Variant ignoreSpace, Variant ignorePunct, Variant hanjaPhoneticHangul) {
		boolean result_of_HitHighlight = Dispatch.callN(this, "HitHighlight", new Object[] { findText, highlightColor, textColor, matchCase, matchWholeWord, matchPrefix, matchSuffix, matchPhrase, matchWildcards, matchSoundsLike, matchAllWordForms, matchByte, matchFuzzy, matchKashida, matchDiacritics, matchAlefHamza, matchControl, ignoreSpace, ignorePunct, hanjaPhoneticHangul}).changeType(Variant.VariantBoolean).getBoolean();


		return result_of_HitHighlight;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean clearHitHighlight() {
		return Dispatch.call(this, "ClearHitHighlight").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param ignoreSpace an input-parameter of type Variant
	 * @param ignorePunct an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant ignoreSpace, Variant ignorePunct) {
		return Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics, matchAlefHamza, matchControl, matchPrefix, matchSuffix, matchPhrase, ignoreSpace, ignorePunct}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param ignoreSpace an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant ignoreSpace) {
		return Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics, matchAlefHamza, matchControl, matchPrefix, matchSuffix, matchPhrase, ignoreSpace}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase) {
		return Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics, matchAlefHamza, matchControl, matchPrefix, matchSuffix, matchPhrase}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl, Variant matchPrefix, Variant matchSuffix) {
		return Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics, matchAlefHamza, matchControl, matchPrefix, matchSuffix}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl, Variant matchPrefix) {
		return Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics, matchAlefHamza, matchControl, matchPrefix}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl) {
		return Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics, matchAlefHamza, matchControl}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza) {
		return Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics, matchAlefHamza}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics) {
		return Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida) {
		return Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace) {
		return Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith) {
		return Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format) {
		return Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap) {
		return Dispatch.call(this, "Execute2007", findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward) {
		return Dispatch.call(this, "Execute2007", findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms) {
		return Dispatch.call(this, "Execute2007", findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike) {
		return Dispatch.call(this, "Execute2007", findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards) {
		return Dispatch.call(this, "Execute2007", findText, matchCase, matchWholeWord, matchWildcards).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord) {
		return Dispatch.call(this, "Execute2007", findText, matchCase, matchWholeWord).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase) {
		return Dispatch.call(this, "Execute2007", findText, matchCase).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText) {
		return Dispatch.call(this, "Execute2007", findText).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean execute2007() {
		return Dispatch.call(this, "Execute2007").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param findText an input-parameter of type Variant
	 * @param matchCase an input-parameter of type Variant
	 * @param matchWholeWord an input-parameter of type Variant
	 * @param matchWildcards an input-parameter of type Variant
	 * @param matchSoundsLike an input-parameter of type Variant
	 * @param matchAllWordForms an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param wrap an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param replaceWith an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @param matchKashida an input-parameter of type Variant
	 * @param matchDiacritics an input-parameter of type Variant
	 * @param matchAlefHamza an input-parameter of type Variant
	 * @param matchControl an input-parameter of type Variant
	 * @param matchPrefix an input-parameter of type Variant
	 * @param matchSuffix an input-parameter of type Variant
	 * @param matchPhrase an input-parameter of type Variant
	 * @param ignoreSpace an input-parameter of type Variant
	 * @param ignorePunct an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean execute2007(Variant findText, Variant matchCase, Variant matchWholeWord, Variant matchWildcards, Variant matchSoundsLike, Variant matchAllWordForms, Variant forward, Variant wrap, Variant format, Variant replaceWith, Variant replace, Variant matchKashida, Variant matchDiacritics, Variant matchAlefHamza, Variant matchControl, Variant matchPrefix, Variant matchSuffix, Variant matchPhrase, Variant ignoreSpace, Variant ignorePunct) {
		boolean result_of_Execute2007 = Dispatch.callN(this, "Execute2007", new Object[] { findText, matchCase, matchWholeWord, matchWildcards, matchSoundsLike, matchAllWordForms, forward, wrap, format, replaceWith, replace, matchKashida, matchDiacritics, matchAlefHamza, matchControl, matchPrefix, matchSuffix, matchPhrase, ignoreSpace, ignorePunct}).changeType(Variant.VariantBoolean).getBoolean();


		return result_of_Execute2007;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHanjaPhoneticHangul() {
		return Dispatch.get(this, "HanjaPhoneticHangul").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hanjaPhoneticHangul an input-parameter of type boolean
	 */
	public void setHanjaPhoneticHangul(boolean hanjaPhoneticHangul) {
		Dispatch.put(this, "HanjaPhoneticHangul", new Variant(hanjaPhoneticHangul));
	}

}
