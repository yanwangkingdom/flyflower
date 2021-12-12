/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Range extends Dispatch {

	public static final String componentName = "Word.Range";

	public Range() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Range(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Range(String compName) {
		super(compName);
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
	 * @return the result is of type Range
	 */
	public Range getFormattedText() {
		return new Range(Dispatch.get(this, "FormattedText").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formattedText an input-parameter of type Range
	 */
	public void setFormattedText(Range formattedText) {
		Dispatch.put(this, "FormattedText", formattedText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getStart() {
		return Dispatch.get(this, "Start").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param start an input-parameter of type int
	 */
	public void setStart(int start) {
		Dispatch.put(this, "Start", new Variant(start));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getEnd() {
		return Dispatch.get(this, "End").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param end an input-parameter of type int
	 */
	public void setEnd(int end) {
		Dispatch.put(this, "End", new Variant(end));
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
	 * @return the result is of type Range
	 */
	public Range getDuplicate() {
		return new Range(Dispatch.get(this, "Duplicate").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getStoryType() {
		return Dispatch.get(this, "StoryType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Tables
	 */
	public Tables getTables() {
		return new Tables(Dispatch.get(this, "Tables").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Words
	 */
	public Words getWords() {
		return new Words(Dispatch.get(this, "Words").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Sentences
	 */
	public Sentences getSentences() {
		return new Sentences(Dispatch.get(this, "Sentences").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Characters
	 */
	public Characters getCharacters() {
		return new Characters(Dispatch.get(this, "Characters").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Footnotes
	 */
	public Footnotes getFootnotes() {
		return new Footnotes(Dispatch.get(this, "Footnotes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Endnotes
	 */
	public Endnotes getEndnotes() {
		return new Endnotes(Dispatch.get(this, "Endnotes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Comments
	 */
	public Comments getComments() {
		return new Comments(Dispatch.get(this, "Comments").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Cells
	 */
	public Cells getCells() {
		return new Cells(Dispatch.get(this, "Cells").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Sections
	 */
	public Sections getSections() {
		return new Sections(Dispatch.get(this, "Sections").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Paragraphs
	 */
	public Paragraphs getParagraphs() {
		return new Paragraphs(Dispatch.get(this, "Paragraphs").toDispatch());
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
	 * @return the result is of type TextRetrievalMode
	 */
	public TextRetrievalMode getTextRetrievalMode() {
		return new TextRetrievalMode(Dispatch.get(this, "TextRetrievalMode").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textRetrievalMode an input-parameter of type TextRetrievalMode
	 */
	public void setTextRetrievalMode(TextRetrievalMode textRetrievalMode) {
		Dispatch.put(this, "TextRetrievalMode", textRetrievalMode);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Fields
	 */
	public Fields getFields() {
		return new Fields(Dispatch.get(this, "Fields").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FormFields
	 */
	public FormFields getFormFields() {
		return new FormFields(Dispatch.get(this, "FormFields").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Frames
	 */
	public Frames getFrames() {
		return new Frames(Dispatch.get(this, "Frames").toDispatch());
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
	 * @return the result is of type ListFormat
	 */
	public ListFormat getListFormat() {
		return new ListFormat(Dispatch.get(this, "ListFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Bookmarks
	 */
	public Bookmarks getBookmarks() {
		return new Bookmarks(Dispatch.get(this, "Bookmarks").toDispatch());
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
	 * @return the result is of type Revisions
	 */
	public Revisions getRevisions() {
		return new Revisions(Dispatch.get(this, "Revisions").toDispatch());
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
	 * @return the result is of type int
	 */
	public int getStoryLength() {
		return Dispatch.get(this, "StoryLength").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type SynonymInfo
	 */
	public SynonymInfo getSynonymInfo() {
		return new SynonymInfo(Dispatch.get(this, "SynonymInfo").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Hyperlinks
	 */
	public Hyperlinks getHyperlinks() {
		return new Hyperlinks(Dispatch.get(this, "Hyperlinks").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ListParagraphs
	 */
	public ListParagraphs getListParagraphs() {
		return new ListParagraphs(Dispatch.get(this, "ListParagraphs").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Subdocuments
	 */
	public Subdocuments getSubdocuments() {
		return new Subdocuments(Dispatch.get(this, "Subdocuments").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getGrammarChecked() {
		return Dispatch.get(this, "GrammarChecked").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param grammarChecked an input-parameter of type boolean
	 */
	public void setGrammarChecked(boolean grammarChecked) {
		Dispatch.put(this, "GrammarChecked", new Variant(grammarChecked));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSpellingChecked() {
		return Dispatch.get(this, "SpellingChecked").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param spellingChecked an input-parameter of type boolean
	 */
	public void setSpellingChecked(boolean spellingChecked) {
		Dispatch.put(this, "SpellingChecked", new Variant(spellingChecked));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHighlightColorIndex() {
		return Dispatch.get(this, "HighlightColorIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param highlightColorIndex an input-parameter of type int
	 */
	public void setHighlightColorIndex(int highlightColorIndex) {
		Dispatch.put(this, "HighlightColorIndex", new Variant(highlightColorIndex));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Columns
	 */
	public Columns getColumns() {
		return new Columns(Dispatch.get(this, "Columns").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Rows
	 */
	public Rows getRows() {
		return new Rows(Dispatch.get(this, "Rows").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCanEdit() {
		return Dispatch.get(this, "CanEdit").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCanPaste() {
		return Dispatch.get(this, "CanPaste").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIsEndOfRowMark() {
		return Dispatch.get(this, "IsEndOfRowMark").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBookmarkID() {
		return Dispatch.get(this, "BookmarkID").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPreviousBookmarkID() {
		return Dispatch.get(this, "PreviousBookmarkID").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Find
	 */
	public Find getFind() {
		return new Find(Dispatch.get(this, "Find").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type PageSetup
	 */
	public PageSetup getPageSetup() {
		return new PageSetup(Dispatch.get(this, "PageSetup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pageSetup an input-parameter of type PageSetup
	 */
	public void setPageSetup(PageSetup pageSetup) {
		Dispatch.put(this, "PageSetup", pageSetup);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ShapeRange
	 */
	public ShapeRange getShapeRange() {
		return new ShapeRange(Dispatch.get(this, "ShapeRange").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCase() {
		return Dispatch.get(this, "Case").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param case an input-parameter of type int
	 */
	public void setCase(int case) {
		Dispatch.put(this, "Case", new Variant(case));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @return the result is of type Variant
	 */
	public Variant getInformation(int type) {
		return Dispatch.call(this, "Information", new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ReadabilityStatistics
	 */
	public ReadabilityStatistics getReadabilityStatistics() {
		return new ReadabilityStatistics(Dispatch.get(this, "ReadabilityStatistics").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ProofreadingErrors
	 */
	public ProofreadingErrors getGrammaticalErrors() {
		return new ProofreadingErrors(Dispatch.get(this, "GrammaticalErrors").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ProofreadingErrors
	 */
	public ProofreadingErrors getSpellingErrors() {
		return new ProofreadingErrors(Dispatch.get(this, "SpellingErrors").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOrientation() {
		return Dispatch.get(this, "Orientation").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param orientation an input-parameter of type int
	 */
	public void setOrientation(int orientation) {
		Dispatch.put(this, "Orientation", new Variant(orientation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type InlineShapes
	 */
	public InlineShapes getInlineShapes() {
		return new InlineShapes(Dispatch.get(this, "InlineShapes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range getNextStoryRange() {
		return new Range(Dispatch.get(this, "NextStoryRange").toDispatch());
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
	 */
	public void select() {
		Dispatch.call(this, "Select");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param start an input-parameter of type int
	 * @param end an input-parameter of type int
	 */
	public void setRange(int start, int end) {
		Dispatch.call(this, "SetRange", new Variant(start), new Variant(end));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param direction an input-parameter of type Variant
	 */
	public void collapse(Variant direction) {
		Dispatch.call(this, "Collapse", direction);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void collapse() {
		Dispatch.call(this, "Collapse");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param direction an input-parameter of type Variant
	 */
	public void collapse(Variant direction) {
		Dispatch.call(this, "Collapse", direction);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 */
	public void insertBefore(String text) {
		Dispatch.call(this, "InsertBefore", text);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 */
	public void insertAfter(String text) {
		Dispatch.call(this, "InsertAfter", text);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range next(Variant unit, Variant count) {
		return new Range(Dispatch.call(this, "Next", unit, count).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range next(Variant unit) {
		return new Range(Dispatch.call(this, "Next", unit).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range next() {
		return new Range(Dispatch.call(this, "Next").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range next(Variant unit, Variant count) {
		Range result_of_Next = new Range(Dispatch.call(this, "Next", unit, count).toDispatch());


		return result_of_Next;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range previous(Variant unit, Variant count) {
		return new Range(Dispatch.call(this, "Previous", unit, count).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range previous(Variant unit) {
		return new Range(Dispatch.call(this, "Previous", unit).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range previous() {
		return new Range(Dispatch.call(this, "Previous").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range previous(Variant unit, Variant count) {
		Range result_of_Previous = new Range(Dispatch.call(this, "Previous", unit, count).toDispatch());


		return result_of_Previous;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int startOf(Variant unit, Variant extend) {
		return Dispatch.call(this, "StartOf", unit, extend).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int startOf(Variant unit) {
		return Dispatch.call(this, "StartOf", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int startOf() {
		return Dispatch.call(this, "StartOf").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int startOf(Variant unit, Variant extend) {
		int result_of_StartOf = Dispatch.call(this, "StartOf", unit, extend).changeType(Variant.VariantInt).getInt();


		return result_of_StartOf;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int endOf(Variant unit, Variant extend) {
		return Dispatch.call(this, "EndOf", unit, extend).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int endOf(Variant unit) {
		return Dispatch.call(this, "EndOf", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int endOf() {
		return Dispatch.call(this, "EndOf").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int endOf(Variant unit, Variant extend) {
		int result_of_EndOf = Dispatch.call(this, "EndOf", unit, extend).changeType(Variant.VariantInt).getInt();


		return result_of_EndOf;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int move(Variant unit, Variant count) {
		return Dispatch.call(this, "Move", unit, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int move(Variant unit) {
		return Dispatch.call(this, "Move", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int move() {
		return Dispatch.call(this, "Move").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int move(Variant unit, Variant count) {
		int result_of_Move = Dispatch.call(this, "Move", unit, count).changeType(Variant.VariantInt).getInt();


		return result_of_Move;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveStart(Variant unit, Variant count) {
		return Dispatch.call(this, "MoveStart", unit, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveStart(Variant unit) {
		return Dispatch.call(this, "MoveStart", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int moveStart() {
		return Dispatch.call(this, "MoveStart").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveStart(Variant unit, Variant count) {
		int result_of_MoveStart = Dispatch.call(this, "MoveStart", unit, count).changeType(Variant.VariantInt).getInt();


		return result_of_MoveStart;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveEnd(Variant unit, Variant count) {
		return Dispatch.call(this, "MoveEnd", unit, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveEnd(Variant unit) {
		return Dispatch.call(this, "MoveEnd", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int moveEnd() {
		return Dispatch.call(this, "MoveEnd").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveEnd(Variant unit, Variant count) {
		int result_of_MoveEnd = Dispatch.call(this, "MoveEnd", unit, count).changeType(Variant.VariantInt).getInt();


		return result_of_MoveEnd;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveWhile(Variant cset, Variant count) {
		return Dispatch.call(this, "MoveWhile", cset, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveWhile(Variant cset) {
		return Dispatch.call(this, "MoveWhile", cset).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveWhile(Variant cset, Variant count) {
		int result_of_MoveWhile = Dispatch.call(this, "MoveWhile", cset, count).changeType(Variant.VariantInt).getInt();


		return result_of_MoveWhile;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveStartWhile(Variant cset, Variant count) {
		return Dispatch.call(this, "MoveStartWhile", cset, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveStartWhile(Variant cset) {
		return Dispatch.call(this, "MoveStartWhile", cset).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveStartWhile(Variant cset, Variant count) {
		int result_of_MoveStartWhile = Dispatch.call(this, "MoveStartWhile", cset, count).changeType(Variant.VariantInt).getInt();


		return result_of_MoveStartWhile;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveEndWhile(Variant cset, Variant count) {
		return Dispatch.call(this, "MoveEndWhile", cset, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveEndWhile(Variant cset) {
		return Dispatch.call(this, "MoveEndWhile", cset).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveEndWhile(Variant cset, Variant count) {
		int result_of_MoveEndWhile = Dispatch.call(this, "MoveEndWhile", cset, count).changeType(Variant.VariantInt).getInt();


		return result_of_MoveEndWhile;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveUntil(Variant cset, Variant count) {
		return Dispatch.call(this, "MoveUntil", cset, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveUntil(Variant cset) {
		return Dispatch.call(this, "MoveUntil", cset).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveUntil(Variant cset, Variant count) {
		int result_of_MoveUntil = Dispatch.call(this, "MoveUntil", cset, count).changeType(Variant.VariantInt).getInt();


		return result_of_MoveUntil;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveStartUntil(Variant cset, Variant count) {
		return Dispatch.call(this, "MoveStartUntil", cset, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveStartUntil(Variant cset) {
		return Dispatch.call(this, "MoveStartUntil", cset).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveStartUntil(Variant cset, Variant count) {
		int result_of_MoveStartUntil = Dispatch.call(this, "MoveStartUntil", cset, count).changeType(Variant.VariantInt).getInt();


		return result_of_MoveStartUntil;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveEndUntil(Variant cset, Variant count) {
		return Dispatch.call(this, "MoveEndUntil", cset, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveEndUntil(Variant cset) {
		return Dispatch.call(this, "MoveEndUntil", cset).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param cset an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveEndUntil(Variant cset, Variant count) {
		int result_of_MoveEndUntil = Dispatch.call(this, "MoveEndUntil", cset, count).changeType(Variant.VariantInt).getInt();


		return result_of_MoveEndUntil;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void cut() {
		Dispatch.call(this, "Cut");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void copy() {
		Dispatch.call(this, "Copy");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void paste() {
		Dispatch.call(this, "Paste");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type Variant
	 */
	public void insertBreak(Variant type) {
		Dispatch.call(this, "InsertBreak", type);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertBreak() {
		Dispatch.call(this, "InsertBreak");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param type an input-parameter of type Variant
	 */
	public void insertBreak(Variant type) {
		Dispatch.call(this, "InsertBreak", type);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param range an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param link an input-parameter of type Variant
	 * @param attachment an input-parameter of type Variant
	 */
	public void insertFile(String fileName, Variant range, Variant confirmConversions, Variant link, Variant attachment) {
		Dispatch.call(this, "InsertFile", fileName, range, confirmConversions, link, attachment);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param range an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param link an input-parameter of type Variant
	 */
	public void insertFile(String fileName, Variant range, Variant confirmConversions, Variant link) {
		Dispatch.call(this, "InsertFile", fileName, range, confirmConversions, link);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param range an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 */
	public void insertFile(String fileName, Variant range, Variant confirmConversions) {
		Dispatch.call(this, "InsertFile", fileName, range, confirmConversions);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param range an input-parameter of type Variant
	 */
	public void insertFile(String fileName, Variant range) {
		Dispatch.call(this, "InsertFile", fileName, range);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void insertFile(String fileName) {
		Dispatch.call(this, "InsertFile", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param range an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param link an input-parameter of type Variant
	 * @param attachment an input-parameter of type Variant
	 */
	public void insertFile(String fileName, Variant range, Variant confirmConversions, Variant link, Variant attachment) {
		Dispatch.call(this, "InsertFile", fileName, range, confirmConversions, link, attachment);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type boolean
	 */
	public boolean inStory(Range range) {
		return Dispatch.call(this, "InStory", range).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type boolean
	 */
	public boolean inRange(Range range) {
		return Dispatch.call(this, "InRange", range).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int delete(Variant unit, Variant count) {
		return Dispatch.call(this, "Delete", unit, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int delete(Variant unit) {
		return Dispatch.call(this, "Delete", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int delete() {
		return Dispatch.call(this, "Delete").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int delete(Variant unit, Variant count) {
		int result_of_Delete = Dispatch.call(this, "Delete", unit, count).changeType(Variant.VariantInt).getInt();


		return result_of_Delete;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void wholeStory() {
		Dispatch.call(this, "WholeStory");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int expand(Variant unit) {
		return Dispatch.call(this, "Expand", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int expand() {
		return Dispatch.call(this, "Expand").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int expand(Variant unit) {
		int result_of_Expand = Dispatch.call(this, "Expand", unit).changeType(Variant.VariantInt).getInt();


		return result_of_Expand;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertParagraph() {
		Dispatch.call(this, "InsertParagraph");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertParagraphAfter() {
		Dispatch.call(this, "InsertParagraphAfter");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @param applyLastColumn an input-parameter of type Variant
	 * @param autoFit an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn, Variant applyLastColumn, Variant autoFit) {
		return new Table(Dispatch.callN(this, "ConvertToTableOld", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn, applyLastColumn, autoFit}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @param applyLastColumn an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn, Variant applyLastColumn) {
		return new Table(Dispatch.callN(this, "ConvertToTableOld", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn, applyLastColumn}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn) {
		return new Table(Dispatch.callN(this, "ConvertToTableOld", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow) {
		return new Table(Dispatch.callN(this, "ConvertToTableOld", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows) {
		return new Table(Dispatch.callN(this, "ConvertToTableOld", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor) {
		return new Table(Dispatch.callN(this, "ConvertToTableOld", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont) {
		return new Table(Dispatch.call(this, "ConvertToTableOld", separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading) {
		return new Table(Dispatch.call(this, "ConvertToTableOld", separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders) {
		return new Table(Dispatch.call(this, "ConvertToTableOld", separator, numRows, numColumns, initialColumnWidth, format, applyBorders).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format) {
		return new Table(Dispatch.call(this, "ConvertToTableOld", separator, numRows, numColumns, initialColumnWidth, format).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth) {
		return new Table(Dispatch.call(this, "ConvertToTableOld", separator, numRows, numColumns, initialColumnWidth).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns) {
		return new Table(Dispatch.call(this, "ConvertToTableOld", separator, numRows, numColumns).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows) {
		return new Table(Dispatch.call(this, "ConvertToTableOld", separator, numRows).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator) {
		return new Table(Dispatch.call(this, "ConvertToTableOld", separator).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Table
	 */
	public Table convertToTableOld() {
		return new Table(Dispatch.call(this, "ConvertToTableOld").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @param applyLastColumn an input-parameter of type Variant
	 * @param autoFit an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTableOld(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn, Variant applyLastColumn, Variant autoFit) {
		Table result_of_ConvertToTableOld = new Table(Dispatch.callN(this, "ConvertToTableOld", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn, applyLastColumn, autoFit}).toDispatch());


		return result_of_ConvertToTableOld;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateTimeFormat an input-parameter of type Variant
	 * @param insertAsField an input-parameter of type Variant
	 * @param insertAsFullWidth an input-parameter of type Variant
	 */
	public void insertDateTimeOld(Variant dateTimeFormat, Variant insertAsField, Variant insertAsFullWidth) {
		Dispatch.call(this, "InsertDateTimeOld", dateTimeFormat, insertAsField, insertAsFullWidth);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateTimeFormat an input-parameter of type Variant
	 * @param insertAsField an input-parameter of type Variant
	 */
	public void insertDateTimeOld(Variant dateTimeFormat, Variant insertAsField) {
		Dispatch.call(this, "InsertDateTimeOld", dateTimeFormat, insertAsField);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateTimeFormat an input-parameter of type Variant
	 */
	public void insertDateTimeOld(Variant dateTimeFormat) {
		Dispatch.call(this, "InsertDateTimeOld", dateTimeFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertDateTimeOld() {
		Dispatch.call(this, "InsertDateTimeOld");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param dateTimeFormat an input-parameter of type Variant
	 * @param insertAsField an input-parameter of type Variant
	 * @param insertAsFullWidth an input-parameter of type Variant
	 */
	public void insertDateTimeOld(Variant dateTimeFormat, Variant insertAsField, Variant insertAsFullWidth) {
		Dispatch.call(this, "InsertDateTimeOld", dateTimeFormat, insertAsField, insertAsFullWidth);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param characterNumber an input-parameter of type int
	 * @param font an input-parameter of type Variant
	 * @param unicode an input-parameter of type Variant
	 * @param bias an input-parameter of type Variant
	 */
	public void insertSymbol(int characterNumber, Variant font, Variant unicode, Variant bias) {
		Dispatch.call(this, "InsertSymbol", new Variant(characterNumber), font, unicode, bias);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param characterNumber an input-parameter of type int
	 * @param font an input-parameter of type Variant
	 * @param unicode an input-parameter of type Variant
	 */
	public void insertSymbol(int characterNumber, Variant font, Variant unicode) {
		Dispatch.call(this, "InsertSymbol", new Variant(characterNumber), font, unicode);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param characterNumber an input-parameter of type int
	 * @param font an input-parameter of type Variant
	 */
	public void insertSymbol(int characterNumber, Variant font) {
		Dispatch.call(this, "InsertSymbol", new Variant(characterNumber), font);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param characterNumber an input-parameter of type int
	 */
	public void insertSymbol(int characterNumber) {
		Dispatch.call(this, "InsertSymbol", new Variant(characterNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param characterNumber an input-parameter of type int
	 * @param font an input-parameter of type Variant
	 * @param unicode an input-parameter of type Variant
	 * @param bias an input-parameter of type Variant
	 */
	public void insertSymbol(int characterNumber, Variant font, Variant unicode, Variant bias) {
		Dispatch.call(this, "InsertSymbol", new Variant(characterNumber), font, unicode, bias);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param referenceType an input-parameter of type Variant
	 * @param referenceKind an input-parameter of type int
	 * @param referenceItem an input-parameter of type Variant
	 * @param insertAsHyperlink an input-parameter of type Variant
	 * @param includePosition an input-parameter of type Variant
	 */
	public void insertCrossReference_2002(Variant referenceType, int referenceKind, Variant referenceItem, Variant insertAsHyperlink, Variant includePosition) {
		Dispatch.call(this, "InsertCrossReference_2002", referenceType, new Variant(referenceKind), referenceItem, insertAsHyperlink, includePosition);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param referenceType an input-parameter of type Variant
	 * @param referenceKind an input-parameter of type int
	 * @param referenceItem an input-parameter of type Variant
	 * @param insertAsHyperlink an input-parameter of type Variant
	 */
	public void insertCrossReference_2002(Variant referenceType, int referenceKind, Variant referenceItem, Variant insertAsHyperlink) {
		Dispatch.call(this, "InsertCrossReference_2002", referenceType, new Variant(referenceKind), referenceItem, insertAsHyperlink);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param referenceType an input-parameter of type Variant
	 * @param referenceKind an input-parameter of type int
	 * @param referenceItem an input-parameter of type Variant
	 */
	public void insertCrossReference_2002(Variant referenceType, int referenceKind, Variant referenceItem) {
		Dispatch.call(this, "InsertCrossReference_2002", referenceType, new Variant(referenceKind), referenceItem);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param referenceType an input-parameter of type Variant
	 * @param referenceKind an input-parameter of type int
	 * @param referenceItem an input-parameter of type Variant
	 * @param insertAsHyperlink an input-parameter of type Variant
	 * @param includePosition an input-parameter of type Variant
	 */
	public void insertCrossReference_2002(Variant referenceType, int referenceKind, Variant referenceItem, Variant insertAsHyperlink, Variant includePosition) {
		Dispatch.call(this, "InsertCrossReference_2002", referenceType, new Variant(referenceKind), referenceItem, insertAsHyperlink, includePosition);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param label an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 * @param titleAutoText an input-parameter of type Variant
	 * @param position an input-parameter of type Variant
	 */
	public void insertCaptionXP(Variant label, Variant title, Variant titleAutoText, Variant position) {
		Dispatch.call(this, "InsertCaptionXP", label, title, titleAutoText, position);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param label an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 * @param titleAutoText an input-parameter of type Variant
	 */
	public void insertCaptionXP(Variant label, Variant title, Variant titleAutoText) {
		Dispatch.call(this, "InsertCaptionXP", label, title, titleAutoText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param label an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 */
	public void insertCaptionXP(Variant label, Variant title) {
		Dispatch.call(this, "InsertCaptionXP", label, title);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param label an input-parameter of type Variant
	 */
	public void insertCaptionXP(Variant label) {
		Dispatch.call(this, "InsertCaptionXP", label);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param label an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 * @param titleAutoText an input-parameter of type Variant
	 * @param position an input-parameter of type Variant
	 */
	public void insertCaptionXP(Variant label, Variant title, Variant titleAutoText, Variant position) {
		Dispatch.call(this, "InsertCaptionXP", label, title, titleAutoText, position);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void copyAsPicture() {
		Dispatch.call(this, "CopyAsPicture");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param languageID an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant languageID) {
		Dispatch.callN(this, "SortOld", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, languageID});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive) {
		Dispatch.callN(this, "SortOld", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator) {
		Dispatch.callN(this, "SortOld", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn) {
		Dispatch.callN(this, "SortOld", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3) {
		Dispatch.callN(this, "SortOld", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3) {
		Dispatch.callN(this, "SortOld", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber, sortFieldType, sortOrder);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber, sortFieldType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber) {
		Dispatch.call(this, "SortOld", excludeHeader, fieldNumber);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader) {
		Dispatch.call(this, "SortOld", excludeHeader);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sortOld() {
		Dispatch.call(this, "SortOld");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param languageID an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant languageID) {
		Dispatch.callN(this, "SortOld", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, languageID});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sortAscending() {
		Dispatch.call(this, "SortAscending");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sortDescending() {
		Dispatch.call(this, "SortDescending");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type boolean
	 */
	public boolean isEqual(Range range) {
		return Dispatch.call(this, "IsEqual", range).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float calculate() {
		return Dispatch.call(this, "Calculate").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param what an input-parameter of type Variant
	 * @param which an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @param name an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range m_goTo(Variant what, Variant which, Variant count, Variant name) {
		return new Range(Dispatch.call(this, "GoTo", what, which, count, name).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param what an input-parameter of type Variant
	 * @param which an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range m_goTo(Variant what, Variant which, Variant count) {
		return new Range(Dispatch.call(this, "GoTo", what, which, count).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param what an input-parameter of type Variant
	 * @param which an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range m_goTo(Variant what, Variant which) {
		return new Range(Dispatch.call(this, "GoTo", what, which).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param what an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range m_goTo(Variant what) {
		return new Range(Dispatch.call(this, "GoTo", what).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range m_goTo() {
		return new Range(Dispatch.call(this, "GoTo").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param what an input-parameter of type Variant
	 * @param which an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @param name an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range m_goTo(Variant what, Variant which, Variant count, Variant name) {
		Range result_of_GoTo = new Range(Dispatch.call(this, "GoTo", what, which, count, name).toDispatch());


		return result_of_GoTo;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param what an input-parameter of type int
	 * @return the result is of type Range
	 */
	public Range goToNext(int what) {
		return new Range(Dispatch.call(this, "GoToNext", new Variant(what)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param what an input-parameter of type int
	 * @return the result is of type Range
	 */
	public Range goToPrevious(int what) {
		return new Range(Dispatch.call(this, "GoToPrevious", new Variant(what)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iconIndex an input-parameter of type Variant
	 * @param link an input-parameter of type Variant
	 * @param placement an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param dataType an input-parameter of type Variant
	 * @param iconFileName an input-parameter of type Variant
	 * @param iconLabel an input-parameter of type Variant
	 */
	public void pasteSpecial(Variant iconIndex, Variant link, Variant placement, Variant displayAsIcon, Variant dataType, Variant iconFileName, Variant iconLabel) {
		Dispatch.call(this, "PasteSpecial", iconIndex, link, placement, displayAsIcon, dataType, iconFileName, iconLabel);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iconIndex an input-parameter of type Variant
	 * @param link an input-parameter of type Variant
	 * @param placement an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param dataType an input-parameter of type Variant
	 * @param iconFileName an input-parameter of type Variant
	 */
	public void pasteSpecial(Variant iconIndex, Variant link, Variant placement, Variant displayAsIcon, Variant dataType, Variant iconFileName) {
		Dispatch.call(this, "PasteSpecial", iconIndex, link, placement, displayAsIcon, dataType, iconFileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iconIndex an input-parameter of type Variant
	 * @param link an input-parameter of type Variant
	 * @param placement an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param dataType an input-parameter of type Variant
	 */
	public void pasteSpecial(Variant iconIndex, Variant link, Variant placement, Variant displayAsIcon, Variant dataType) {
		Dispatch.call(this, "PasteSpecial", iconIndex, link, placement, displayAsIcon, dataType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iconIndex an input-parameter of type Variant
	 * @param link an input-parameter of type Variant
	 * @param placement an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 */
	public void pasteSpecial(Variant iconIndex, Variant link, Variant placement, Variant displayAsIcon) {
		Dispatch.call(this, "PasteSpecial", iconIndex, link, placement, displayAsIcon);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iconIndex an input-parameter of type Variant
	 * @param link an input-parameter of type Variant
	 * @param placement an input-parameter of type Variant
	 */
	public void pasteSpecial(Variant iconIndex, Variant link, Variant placement) {
		Dispatch.call(this, "PasteSpecial", iconIndex, link, placement);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iconIndex an input-parameter of type Variant
	 * @param link an input-parameter of type Variant
	 */
	public void pasteSpecial(Variant iconIndex, Variant link) {
		Dispatch.call(this, "PasteSpecial", iconIndex, link);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iconIndex an input-parameter of type Variant
	 */
	public void pasteSpecial(Variant iconIndex) {
		Dispatch.call(this, "PasteSpecial", iconIndex);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void pasteSpecial() {
		Dispatch.call(this, "PasteSpecial");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param iconIndex an input-parameter of type Variant
	 * @param link an input-parameter of type Variant
	 * @param placement an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param dataType an input-parameter of type Variant
	 * @param iconFileName an input-parameter of type Variant
	 * @param iconLabel an input-parameter of type Variant
	 */
	public void pasteSpecial(Variant iconIndex, Variant link, Variant placement, Variant displayAsIcon, Variant dataType, Variant iconFileName, Variant iconLabel) {
		Dispatch.call(this, "PasteSpecial", iconIndex, link, placement, displayAsIcon, dataType, iconFileName, iconLabel);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void lookupNameProperties() {
		Dispatch.call(this, "LookupNameProperties");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param statistic an input-parameter of type int
	 * @return the result is of type int
	 */
	public int computeStatistics(int statistic) {
		return Dispatch.call(this, "ComputeStatistics", new Variant(statistic)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param direction an input-parameter of type int
	 */
	public void relocate(int direction) {
		Dispatch.call(this, "Relocate", new Variant(direction));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void checkSynonyms() {
		Dispatch.call(this, "CheckSynonyms");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param edition an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 */
	public void subscribeTo(String edition, Variant format) {
		Dispatch.call(this, "SubscribeTo", edition, format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param edition an input-parameter of type String
	 */
	public void subscribeTo(String edition) {
		Dispatch.call(this, "SubscribeTo", edition);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param edition an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 */
	public void subscribeTo(String edition, Variant format) {
		Dispatch.call(this, "SubscribeTo", edition, format);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param edition an input-parameter of type Variant
	 * @param containsPICT an input-parameter of type Variant
	 * @param containsRTF an input-parameter of type Variant
	 * @param containsText an input-parameter of type Variant
	 */
	public void createPublisher(Variant edition, Variant containsPICT, Variant containsRTF, Variant containsText) {
		Dispatch.call(this, "CreatePublisher", edition, containsPICT, containsRTF, containsText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param edition an input-parameter of type Variant
	 * @param containsPICT an input-parameter of type Variant
	 * @param containsRTF an input-parameter of type Variant
	 */
	public void createPublisher(Variant edition, Variant containsPICT, Variant containsRTF) {
		Dispatch.call(this, "CreatePublisher", edition, containsPICT, containsRTF);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param edition an input-parameter of type Variant
	 * @param containsPICT an input-parameter of type Variant
	 */
	public void createPublisher(Variant edition, Variant containsPICT) {
		Dispatch.call(this, "CreatePublisher", edition, containsPICT);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param edition an input-parameter of type Variant
	 */
	public void createPublisher(Variant edition) {
		Dispatch.call(this, "CreatePublisher", edition);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void createPublisher() {
		Dispatch.call(this, "CreatePublisher");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param edition an input-parameter of type Variant
	 * @param containsPICT an input-parameter of type Variant
	 * @param containsRTF an input-parameter of type Variant
	 * @param containsText an input-parameter of type Variant
	 */
	public void createPublisher(Variant edition, Variant containsPICT, Variant containsRTF, Variant containsText) {
		Dispatch.call(this, "CreatePublisher", edition, containsPICT, containsRTF, containsText);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertAutoText() {
		Dispatch.call(this, "InsertAutoText");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param dataSource an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param includeFields an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource, Variant connection, Variant sQLStatement, Variant sQLStatement1, Variant passwordDocument, Variant passwordTemplate, Variant writePasswordDocument, Variant writePasswordTemplate, Variant dataSource, Variant from, Variant to, Variant includeFields) {
		Dispatch.callN(this, "InsertDatabase", new Object[] { format, style, linkToSource, connection, sQLStatement, sQLStatement1, passwordDocument, passwordTemplate, writePasswordDocument, writePasswordTemplate, dataSource, from, to, includeFields});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param dataSource an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource, Variant connection, Variant sQLStatement, Variant sQLStatement1, Variant passwordDocument, Variant passwordTemplate, Variant writePasswordDocument, Variant writePasswordTemplate, Variant dataSource, Variant from, Variant to) {
		Dispatch.callN(this, "InsertDatabase", new Object[] { format, style, linkToSource, connection, sQLStatement, sQLStatement1, passwordDocument, passwordTemplate, writePasswordDocument, writePasswordTemplate, dataSource, from, to});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param dataSource an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource, Variant connection, Variant sQLStatement, Variant sQLStatement1, Variant passwordDocument, Variant passwordTemplate, Variant writePasswordDocument, Variant writePasswordTemplate, Variant dataSource, Variant from) {
		Dispatch.callN(this, "InsertDatabase", new Object[] { format, style, linkToSource, connection, sQLStatement, sQLStatement1, passwordDocument, passwordTemplate, writePasswordDocument, writePasswordTemplate, dataSource, from});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param dataSource an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource, Variant connection, Variant sQLStatement, Variant sQLStatement1, Variant passwordDocument, Variant passwordTemplate, Variant writePasswordDocument, Variant writePasswordTemplate, Variant dataSource) {
		Dispatch.callN(this, "InsertDatabase", new Object[] { format, style, linkToSource, connection, sQLStatement, sQLStatement1, passwordDocument, passwordTemplate, writePasswordDocument, writePasswordTemplate, dataSource});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource, Variant connection, Variant sQLStatement, Variant sQLStatement1, Variant passwordDocument, Variant passwordTemplate, Variant writePasswordDocument, Variant writePasswordTemplate) {
		Dispatch.callN(this, "InsertDatabase", new Object[] { format, style, linkToSource, connection, sQLStatement, sQLStatement1, passwordDocument, passwordTemplate, writePasswordDocument, writePasswordTemplate});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource, Variant connection, Variant sQLStatement, Variant sQLStatement1, Variant passwordDocument, Variant passwordTemplate, Variant writePasswordDocument) {
		Dispatch.callN(this, "InsertDatabase", new Object[] { format, style, linkToSource, connection, sQLStatement, sQLStatement1, passwordDocument, passwordTemplate, writePasswordDocument});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource, Variant connection, Variant sQLStatement, Variant sQLStatement1, Variant passwordDocument, Variant passwordTemplate) {
		Dispatch.call(this, "InsertDatabase", format, style, linkToSource, connection, sQLStatement, sQLStatement1, passwordDocument, passwordTemplate);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource, Variant connection, Variant sQLStatement, Variant sQLStatement1, Variant passwordDocument) {
		Dispatch.call(this, "InsertDatabase", format, style, linkToSource, connection, sQLStatement, sQLStatement1, passwordDocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource, Variant connection, Variant sQLStatement, Variant sQLStatement1) {
		Dispatch.call(this, "InsertDatabase", format, style, linkToSource, connection, sQLStatement, sQLStatement1);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource, Variant connection, Variant sQLStatement) {
		Dispatch.call(this, "InsertDatabase", format, style, linkToSource, connection, sQLStatement);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource, Variant connection) {
		Dispatch.call(this, "InsertDatabase", format, style, linkToSource, connection);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource) {
		Dispatch.call(this, "InsertDatabase", format, style, linkToSource);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style) {
		Dispatch.call(this, "InsertDatabase", format, style);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format) {
		Dispatch.call(this, "InsertDatabase", format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertDatabase() {
		Dispatch.call(this, "InsertDatabase");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param format an input-parameter of type Variant
	 * @param style an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param dataSource an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param includeFields an input-parameter of type Variant
	 */
	public void insertDatabase(Variant format, Variant style, Variant linkToSource, Variant connection, Variant sQLStatement, Variant sQLStatement1, Variant passwordDocument, Variant passwordTemplate, Variant writePasswordDocument, Variant writePasswordTemplate, Variant dataSource, Variant from, Variant to, Variant includeFields) {
		Dispatch.callN(this, "InsertDatabase", new Object[] { format, style, linkToSource, connection, sQLStatement, sQLStatement1, passwordDocument, passwordTemplate, writePasswordDocument, writePasswordTemplate, dataSource, from, to, includeFields});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void autoFormat() {
		Dispatch.call(this, "AutoFormat");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void checkGrammar() {
		Dispatch.call(this, "CheckGrammar");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 * @param customDictionary10 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9, Variant customDictionary10) {
		Dispatch.callN(this, "CheckSpelling", new Object[] { customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9, customDictionary10});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9) {
		Dispatch.callN(this, "CheckSpelling", new Object[] { customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8) {
		Dispatch.callN(this, "CheckSpelling", new Object[] { customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7) {
		Dispatch.callN(this, "CheckSpelling", new Object[] { customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase, alwaysSuggest);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary) {
		Dispatch.call(this, "CheckSpelling", customDictionary);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void checkSpelling() {
		Dispatch.call(this, "CheckSpelling");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 * @param customDictionary10 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9, Variant customDictionary10) {
		Dispatch.callN(this, "CheckSpelling", new Object[] { customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9, customDictionary10});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 * @param customDictionary10 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9, Variant customDictionary10) {
		return new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9, customDictionary10}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9) {
		return new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8) {
		return new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7) {
		return new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6) {
		return new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", customDictionary, ignoreUppercase, mainDictionary, suggestionMode).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", customDictionary, ignoreUppercase, mainDictionary).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", customDictionary, ignoreUppercase).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", customDictionary).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions() {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 * @param customDictionary10 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9, Variant customDictionary10) {
		SpellingSuggestions result_of_GetSpellingSuggestions = new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9, customDictionary10}).toDispatch());


		return result_of_GetSpellingSuggestions;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertParagraphBefore() {
		Dispatch.call(this, "InsertParagraphBefore");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void nextSubdocument() {
		Dispatch.call(this, "NextSubdocument");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void previousSubdocument() {
		Dispatch.call(this, "PreviousSubdocument");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param conversionsMode an input-parameter of type Variant
	 * @param fastConversion an input-parameter of type Variant
	 * @param checkHangulEnding an input-parameter of type Variant
	 * @param enableRecentOrdering an input-parameter of type Variant
	 * @param customDictionary an input-parameter of type Variant
	 */
	public void convertHangulAndHanja(Variant conversionsMode, Variant fastConversion, Variant checkHangulEnding, Variant enableRecentOrdering, Variant customDictionary) {
		Dispatch.call(this, "ConvertHangulAndHanja", conversionsMode, fastConversion, checkHangulEnding, enableRecentOrdering, customDictionary);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param conversionsMode an input-parameter of type Variant
	 * @param fastConversion an input-parameter of type Variant
	 * @param checkHangulEnding an input-parameter of type Variant
	 * @param enableRecentOrdering an input-parameter of type Variant
	 */
	public void convertHangulAndHanja(Variant conversionsMode, Variant fastConversion, Variant checkHangulEnding, Variant enableRecentOrdering) {
		Dispatch.call(this, "ConvertHangulAndHanja", conversionsMode, fastConversion, checkHangulEnding, enableRecentOrdering);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param conversionsMode an input-parameter of type Variant
	 * @param fastConversion an input-parameter of type Variant
	 * @param checkHangulEnding an input-parameter of type Variant
	 */
	public void convertHangulAndHanja(Variant conversionsMode, Variant fastConversion, Variant checkHangulEnding) {
		Dispatch.call(this, "ConvertHangulAndHanja", conversionsMode, fastConversion, checkHangulEnding);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param conversionsMode an input-parameter of type Variant
	 * @param fastConversion an input-parameter of type Variant
	 */
	public void convertHangulAndHanja(Variant conversionsMode, Variant fastConversion) {
		Dispatch.call(this, "ConvertHangulAndHanja", conversionsMode, fastConversion);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param conversionsMode an input-parameter of type Variant
	 */
	public void convertHangulAndHanja(Variant conversionsMode) {
		Dispatch.call(this, "ConvertHangulAndHanja", conversionsMode);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void convertHangulAndHanja() {
		Dispatch.call(this, "ConvertHangulAndHanja");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param conversionsMode an input-parameter of type Variant
	 * @param fastConversion an input-parameter of type Variant
	 * @param checkHangulEnding an input-parameter of type Variant
	 * @param enableRecentOrdering an input-parameter of type Variant
	 * @param customDictionary an input-parameter of type Variant
	 */
	public void convertHangulAndHanja(Variant conversionsMode, Variant fastConversion, Variant checkHangulEnding, Variant enableRecentOrdering, Variant customDictionary) {
		Dispatch.call(this, "ConvertHangulAndHanja", conversionsMode, fastConversion, checkHangulEnding, enableRecentOrdering, customDictionary);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void pasteAsNestedTable() {
		Dispatch.call(this, "PasteAsNestedTable");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type Variant
	 * @param symbol an input-parameter of type Variant
	 * @param enclosedText an input-parameter of type Variant
	 */
	public void modifyEnclosure(Variant style, Variant symbol, Variant enclosedText) {
		Dispatch.call(this, "ModifyEnclosure", style, symbol, enclosedText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type Variant
	 * @param symbol an input-parameter of type Variant
	 */
	public void modifyEnclosure(Variant style, Variant symbol) {
		Dispatch.call(this, "ModifyEnclosure", style, symbol);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type Variant
	 */
	public void modifyEnclosure(Variant style) {
		Dispatch.call(this, "ModifyEnclosure", style);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param style an input-parameter of type Variant
	 * @param symbol an input-parameter of type Variant
	 * @param enclosedText an input-parameter of type Variant
	 */
	public void modifyEnclosure(Variant style, Variant symbol, Variant enclosedText) {
		Dispatch.call(this, "ModifyEnclosure", style, symbol, enclosedText);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 * @param alignment an input-parameter of type int
	 * @param raise an input-parameter of type int
	 * @param fontSize an input-parameter of type int
	 * @param fontName an input-parameter of type String
	 */
	public void phoneticGuide(String text, int alignment, int raise, int fontSize, String fontName) {
		Dispatch.call(this, "PhoneticGuide", text, new Variant(alignment), new Variant(raise), new Variant(fontSize), fontName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 * @param alignment an input-parameter of type int
	 * @param raise an input-parameter of type int
	 * @param fontSize an input-parameter of type int
	 */
	public void phoneticGuide(String text, int alignment, int raise, int fontSize) {
		Dispatch.call(this, "PhoneticGuide", text, new Variant(alignment), new Variant(raise), new Variant(fontSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 * @param alignment an input-parameter of type int
	 * @param raise an input-parameter of type int
	 */
	public void phoneticGuide(String text, int alignment, int raise) {
		Dispatch.call(this, "PhoneticGuide", text, new Variant(alignment), new Variant(raise));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 * @param alignment an input-parameter of type int
	 */
	public void phoneticGuide(String text, int alignment) {
		Dispatch.call(this, "PhoneticGuide", text, new Variant(alignment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 */
	public void phoneticGuide(String text) {
		Dispatch.call(this, "PhoneticGuide", text);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param text an input-parameter of type String
	 * @param alignment an input-parameter of type int
	 * @param raise an input-parameter of type int
	 * @param fontSize an input-parameter of type int
	 * @param fontName an input-parameter of type String
	 */
	public void phoneticGuide(String text, int alignment, int raise, int fontSize, String fontName) {
		Dispatch.call(this, "PhoneticGuide", text, new Variant(alignment), new Variant(raise), new Variant(fontSize), fontName);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateTimeFormat an input-parameter of type Variant
	 * @param insertAsField an input-parameter of type Variant
	 * @param insertAsFullWidth an input-parameter of type Variant
	 * @param dateLanguage an input-parameter of type Variant
	 * @param calendarType an input-parameter of type Variant
	 */
	public void insertDateTime(Variant dateTimeFormat, Variant insertAsField, Variant insertAsFullWidth, Variant dateLanguage, Variant calendarType) {
		Dispatch.call(this, "InsertDateTime", dateTimeFormat, insertAsField, insertAsFullWidth, dateLanguage, calendarType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateTimeFormat an input-parameter of type Variant
	 * @param insertAsField an input-parameter of type Variant
	 * @param insertAsFullWidth an input-parameter of type Variant
	 * @param dateLanguage an input-parameter of type Variant
	 */
	public void insertDateTime(Variant dateTimeFormat, Variant insertAsField, Variant insertAsFullWidth, Variant dateLanguage) {
		Dispatch.call(this, "InsertDateTime", dateTimeFormat, insertAsField, insertAsFullWidth, dateLanguage);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateTimeFormat an input-parameter of type Variant
	 * @param insertAsField an input-parameter of type Variant
	 * @param insertAsFullWidth an input-parameter of type Variant
	 */
	public void insertDateTime(Variant dateTimeFormat, Variant insertAsField, Variant insertAsFullWidth) {
		Dispatch.call(this, "InsertDateTime", dateTimeFormat, insertAsField, insertAsFullWidth);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateTimeFormat an input-parameter of type Variant
	 * @param insertAsField an input-parameter of type Variant
	 */
	public void insertDateTime(Variant dateTimeFormat, Variant insertAsField) {
		Dispatch.call(this, "InsertDateTime", dateTimeFormat, insertAsField);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateTimeFormat an input-parameter of type Variant
	 */
	public void insertDateTime(Variant dateTimeFormat) {
		Dispatch.call(this, "InsertDateTime", dateTimeFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertDateTime() {
		Dispatch.call(this, "InsertDateTime");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param dateTimeFormat an input-parameter of type Variant
	 * @param insertAsField an input-parameter of type Variant
	 * @param insertAsFullWidth an input-parameter of type Variant
	 * @param dateLanguage an input-parameter of type Variant
	 * @param calendarType an input-parameter of type Variant
	 */
	public void insertDateTime(Variant dateTimeFormat, Variant insertAsField, Variant insertAsFullWidth, Variant dateLanguage, Variant calendarType) {
		Dispatch.call(this, "InsertDateTime", dateTimeFormat, insertAsField, insertAsFullWidth, dateLanguage, calendarType);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 * @param ignoreHe an input-parameter of type Variant
	 * @param languageID an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 * @param ignoreHe an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber, sortFieldType, sortOrder);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber, sortFieldType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber) {
		Dispatch.call(this, "Sort", excludeHeader, fieldNumber);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader) {
		Dispatch.call(this, "Sort", excludeHeader);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sort() {
		Dispatch.call(this, "Sort");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 * @param sortFieldType2 an input-parameter of type Variant
	 * @param sortOrder2 an input-parameter of type Variant
	 * @param fieldNumber3 an input-parameter of type Variant
	 * @param sortFieldType3 an input-parameter of type Variant
	 * @param sortOrder3 an input-parameter of type Variant
	 * @param sortColumn an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 * @param ignoreHe an input-parameter of type Variant
	 * @param languageID an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void detectLanguage() {
		Dispatch.call(this, "DetectLanguage");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @param applyLastColumn an input-parameter of type Variant
	 * @param autoFit an input-parameter of type Variant
	 * @param autoFitBehavior an input-parameter of type Variant
	 * @param defaultTableBehavior an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn, Variant applyLastColumn, Variant autoFit, Variant autoFitBehavior, Variant defaultTableBehavior) {
		return new Table(Dispatch.callN(this, "ConvertToTable", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn, applyLastColumn, autoFit, autoFitBehavior, defaultTableBehavior}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @param applyLastColumn an input-parameter of type Variant
	 * @param autoFit an input-parameter of type Variant
	 * @param autoFitBehavior an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn, Variant applyLastColumn, Variant autoFit, Variant autoFitBehavior) {
		return new Table(Dispatch.callN(this, "ConvertToTable", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn, applyLastColumn, autoFit, autoFitBehavior}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @param applyLastColumn an input-parameter of type Variant
	 * @param autoFit an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn, Variant applyLastColumn, Variant autoFit) {
		return new Table(Dispatch.callN(this, "ConvertToTable", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn, applyLastColumn, autoFit}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @param applyLastColumn an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn, Variant applyLastColumn) {
		return new Table(Dispatch.callN(this, "ConvertToTable", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn, applyLastColumn}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn) {
		return new Table(Dispatch.callN(this, "ConvertToTable", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow) {
		return new Table(Dispatch.callN(this, "ConvertToTable", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows) {
		return new Table(Dispatch.callN(this, "ConvertToTable", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor) {
		return new Table(Dispatch.callN(this, "ConvertToTable", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont) {
		return new Table(Dispatch.call(this, "ConvertToTable", separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading) {
		return new Table(Dispatch.call(this, "ConvertToTable", separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders) {
		return new Table(Dispatch.call(this, "ConvertToTable", separator, numRows, numColumns, initialColumnWidth, format, applyBorders).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format) {
		return new Table(Dispatch.call(this, "ConvertToTable", separator, numRows, numColumns, initialColumnWidth, format).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth) {
		return new Table(Dispatch.call(this, "ConvertToTable", separator, numRows, numColumns, initialColumnWidth).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns) {
		return new Table(Dispatch.call(this, "ConvertToTable", separator, numRows, numColumns).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows) {
		return new Table(Dispatch.call(this, "ConvertToTable", separator, numRows).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator) {
		return new Table(Dispatch.call(this, "ConvertToTable", separator).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Table
	 */
	public Table convertToTable() {
		return new Table(Dispatch.call(this, "ConvertToTable").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param separator an input-parameter of type Variant
	 * @param numRows an input-parameter of type Variant
	 * @param numColumns an input-parameter of type Variant
	 * @param initialColumnWidth an input-parameter of type Variant
	 * @param format an input-parameter of type Variant
	 * @param applyBorders an input-parameter of type Variant
	 * @param applyShading an input-parameter of type Variant
	 * @param applyFont an input-parameter of type Variant
	 * @param applyColor an input-parameter of type Variant
	 * @param applyHeadingRows an input-parameter of type Variant
	 * @param applyLastRow an input-parameter of type Variant
	 * @param applyFirstColumn an input-parameter of type Variant
	 * @param applyLastColumn an input-parameter of type Variant
	 * @param autoFit an input-parameter of type Variant
	 * @param autoFitBehavior an input-parameter of type Variant
	 * @param defaultTableBehavior an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table convertToTable(Variant separator, Variant numRows, Variant numColumns, Variant initialColumnWidth, Variant format, Variant applyBorders, Variant applyShading, Variant applyFont, Variant applyColor, Variant applyHeadingRows, Variant applyLastRow, Variant applyFirstColumn, Variant applyLastColumn, Variant autoFit, Variant autoFitBehavior, Variant defaultTableBehavior) {
		Table result_of_ConvertToTable = new Table(Dispatch.callN(this, "ConvertToTable", new Object[] { separator, numRows, numColumns, initialColumnWidth, format, applyBorders, applyShading, applyFont, applyColor, applyHeadingRows, applyLastRow, applyFirstColumn, applyLastColumn, autoFit, autoFitBehavior, defaultTableBehavior}).toDispatch());


		return result_of_ConvertToTable;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param wdTCSCConverterDirection an input-parameter of type int
	 * @param commonTerms an input-parameter of type boolean
	 * @param useVariants an input-parameter of type boolean
	 */
	public void tCSCConverter(int wdTCSCConverterDirection, boolean commonTerms, boolean useVariants) {
		Dispatch.call(this, "TCSCConverter", new Variant(wdTCSCConverterDirection), new Variant(commonTerms), new Variant(useVariants));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param wdTCSCConverterDirection an input-parameter of type int
	 * @param commonTerms an input-parameter of type boolean
	 */
	public void tCSCConverter(int wdTCSCConverterDirection, boolean commonTerms) {
		Dispatch.call(this, "TCSCConverter", new Variant(wdTCSCConverterDirection), new Variant(commonTerms));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param wdTCSCConverterDirection an input-parameter of type int
	 */
	public void tCSCConverter(int wdTCSCConverterDirection) {
		Dispatch.call(this, "TCSCConverter", new Variant(wdTCSCConverterDirection));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void tCSCConverter() {
		Dispatch.call(this, "TCSCConverter");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param wdTCSCConverterDirection an input-parameter of type int
	 * @param commonTerms an input-parameter of type boolean
	 * @param useVariants an input-parameter of type boolean
	 */
	public void tCSCConverter(int wdTCSCConverterDirection, boolean commonTerms, boolean useVariants) {
		Dispatch.call(this, "TCSCConverter", new Variant(wdTCSCConverterDirection), new Variant(commonTerms), new Variant(useVariants));

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getLanguageDetected() {
		return Dispatch.get(this, "LanguageDetected").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param languageDetected an input-parameter of type boolean
	 */
	public void setLanguageDetected(boolean languageDetected) {
		Dispatch.put(this, "LanguageDetected", new Variant(languageDetected));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getFitTextWidth() {
		return Dispatch.get(this, "FitTextWidth").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fitTextWidth an input-parameter of type float
	 */
	public void setFitTextWidth(float fitTextWidth) {
		Dispatch.put(this, "FitTextWidth", new Variant(fitTextWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHorizontalInVertical() {
		return Dispatch.get(this, "HorizontalInVertical").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param horizontalInVertical an input-parameter of type int
	 */
	public void setHorizontalInVertical(int horizontalInVertical) {
		Dispatch.put(this, "HorizontalInVertical", new Variant(horizontalInVertical));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getTwoLinesInOne() {
		return Dispatch.get(this, "TwoLinesInOne").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param twoLinesInOne an input-parameter of type int
	 */
	public void setTwoLinesInOne(int twoLinesInOne) {
		Dispatch.put(this, "TwoLinesInOne", new Variant(twoLinesInOne));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCombineCharacters() {
		return Dispatch.get(this, "CombineCharacters").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param combineCharacters an input-parameter of type boolean
	 */
	public void setCombineCharacters(boolean combineCharacters) {
		Dispatch.put(this, "CombineCharacters", new Variant(combineCharacters));
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
	 * @return the result is of type Tables
	 */
	public Tables getTopLevelTables() {
		return new Tables(Dispatch.get(this, "TopLevelTables").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Scripts
	 */
	public Scripts getScripts() {
		return new Scripts(Dispatch.get(this, "Scripts").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCharacterWidth() {
		return Dispatch.get(this, "CharacterWidth").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param characterWidth an input-parameter of type int
	 */
	public void setCharacterWidth(int characterWidth) {
		Dispatch.put(this, "CharacterWidth", new Variant(characterWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getKana() {
		return Dispatch.get(this, "Kana").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param kana an input-parameter of type int
	 */
	public void setKana(int kana) {
		Dispatch.put(this, "Kana", new Variant(kana));
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
	 * @return the result is of type String
	 */
	public String getID() {
		return Dispatch.get(this, "ID").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iD an input-parameter of type String
	 */
	public void setID(String iD) {
		Dispatch.put(this, "ID", iD);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type HTMLDivisions
	 */
	public HTMLDivisions getHTMLDivisions() {
		return new HTMLDivisions(Dispatch.get(this, "HTMLDivisions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SmartTags
	 */
	public SmartTags getSmartTags() {
		return new SmartTags(Dispatch.get(this, "SmartTags").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowAll() {
		return Dispatch.get(this, "ShowAll").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showAll an input-parameter of type boolean
	 */
	public void setShowAll(boolean showAll) {
		Dispatch.put(this, "ShowAll", new Variant(showAll));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Document
	 */
	public Document getDocument() {
		return new Document(Dispatch.get(this, "Document").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FootnoteOptions
	 */
	public FootnoteOptions getFootnoteOptions() {
		return new FootnoteOptions(Dispatch.get(this, "FootnoteOptions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type EndnoteOptions
	 */
	public EndnoteOptions getEndnoteOptions() {
		return new EndnoteOptions(Dispatch.get(this, "EndnoteOptions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 */
	public void pasteAndFormat(int type) {
		Dispatch.call(this, "PasteAndFormat", new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param linkedToExcel an input-parameter of type boolean
	 * @param wordFormatting an input-parameter of type boolean
	 * @param rTF an input-parameter of type boolean
	 */
	public void pasteExcelTable(boolean linkedToExcel, boolean wordFormatting, boolean rTF) {
		Dispatch.call(this, "PasteExcelTable", new Variant(linkedToExcel), new Variant(wordFormatting), new Variant(rTF));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void pasteAppendTable() {
		Dispatch.call(this, "PasteAppendTable");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes getXMLNodes() {
		return new XMLNodes(Dispatch.get(this, "XMLNodes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLNode
	 */
	public XMLNode getXMLParentNode() {
		return new XMLNode(Dispatch.get(this, "XMLParentNode").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Editors
	 */
	public Editors getEditors() {
		return new Editors(Dispatch.get(this, "Editors").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dataOnly an input-parameter of type boolean
	 * @return the result is of type String
	 */
	public String getXML(boolean dataOnly) {
		return Dispatch.call(this, "XML", new Variant(dataOnly)).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getXML() {
		return Dispatch.get(this, "XML").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param dataOnly an input-parameter of type boolean
	 * @return the result is of type String
	 */
	public String getXML(boolean dataOnly) {
		String result_of_XML = Dispatch.call(this, "XML", new Variant(dataOnly)).toString();


		return result_of_XML;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getEnhMetaFileBits() {
		return Dispatch.get(this, "EnhMetaFileBits");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param editorID an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range goToEditableRange(Variant editorID) {
		return new Range(Dispatch.call(this, "GoToEditableRange", editorID).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range goToEditableRange() {
		return new Range(Dispatch.call(this, "GoToEditableRange").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param editorID an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range goToEditableRange(Variant editorID) {
		Range result_of_GoToEditableRange = new Range(Dispatch.call(this, "GoToEditableRange", editorID).toDispatch());


		return result_of_GoToEditableRange;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xML an input-parameter of type String
	 * @param transform an input-parameter of type Variant
	 */
	public void insertXML(String xML, Variant transform) {
		Dispatch.call(this, "InsertXML", xML, transform);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xML an input-parameter of type String
	 */
	public void insertXML(String xML) {
		Dispatch.call(this, "InsertXML", xML);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param xML an input-parameter of type String
	 * @param transform an input-parameter of type Variant
	 */
	public void insertXML(String xML, Variant transform) {
		Dispatch.call(this, "InsertXML", xML, transform);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param label an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 * @param titleAutoText an input-parameter of type Variant
	 * @param position an input-parameter of type Variant
	 * @param excludeLabel an input-parameter of type Variant
	 */
	public void insertCaption(Variant label, Variant title, Variant titleAutoText, Variant position, Variant excludeLabel) {
		Dispatch.call(this, "InsertCaption", label, title, titleAutoText, position, excludeLabel);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param label an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 * @param titleAutoText an input-parameter of type Variant
	 * @param position an input-parameter of type Variant
	 */
	public void insertCaption(Variant label, Variant title, Variant titleAutoText, Variant position) {
		Dispatch.call(this, "InsertCaption", label, title, titleAutoText, position);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param label an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 * @param titleAutoText an input-parameter of type Variant
	 */
	public void insertCaption(Variant label, Variant title, Variant titleAutoText) {
		Dispatch.call(this, "InsertCaption", label, title, titleAutoText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param label an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 */
	public void insertCaption(Variant label, Variant title) {
		Dispatch.call(this, "InsertCaption", label, title);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param label an input-parameter of type Variant
	 */
	public void insertCaption(Variant label) {
		Dispatch.call(this, "InsertCaption", label);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param label an input-parameter of type Variant
	 * @param title an input-parameter of type Variant
	 * @param titleAutoText an input-parameter of type Variant
	 * @param position an input-parameter of type Variant
	 * @param excludeLabel an input-parameter of type Variant
	 */
	public void insertCaption(Variant label, Variant title, Variant titleAutoText, Variant position, Variant excludeLabel) {
		Dispatch.call(this, "InsertCaption", label, title, titleAutoText, position, excludeLabel);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param referenceType an input-parameter of type Variant
	 * @param referenceKind an input-parameter of type int
	 * @param referenceItem an input-parameter of type Variant
	 * @param insertAsHyperlink an input-parameter of type Variant
	 * @param includePosition an input-parameter of type Variant
	 * @param separateNumbers an input-parameter of type Variant
	 * @param separatorString an input-parameter of type Variant
	 */
	public void insertCrossReference(Variant referenceType, int referenceKind, Variant referenceItem, Variant insertAsHyperlink, Variant includePosition, Variant separateNumbers, Variant separatorString) {
		Dispatch.call(this, "InsertCrossReference", referenceType, new Variant(referenceKind), referenceItem, insertAsHyperlink, includePosition, separateNumbers, separatorString);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param referenceType an input-parameter of type Variant
	 * @param referenceKind an input-parameter of type int
	 * @param referenceItem an input-parameter of type Variant
	 * @param insertAsHyperlink an input-parameter of type Variant
	 * @param includePosition an input-parameter of type Variant
	 * @param separateNumbers an input-parameter of type Variant
	 */
	public void insertCrossReference(Variant referenceType, int referenceKind, Variant referenceItem, Variant insertAsHyperlink, Variant includePosition, Variant separateNumbers) {
		Dispatch.call(this, "InsertCrossReference", referenceType, new Variant(referenceKind), referenceItem, insertAsHyperlink, includePosition, separateNumbers);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param referenceType an input-parameter of type Variant
	 * @param referenceKind an input-parameter of type int
	 * @param referenceItem an input-parameter of type Variant
	 * @param insertAsHyperlink an input-parameter of type Variant
	 * @param includePosition an input-parameter of type Variant
	 */
	public void insertCrossReference(Variant referenceType, int referenceKind, Variant referenceItem, Variant insertAsHyperlink, Variant includePosition) {
		Dispatch.call(this, "InsertCrossReference", referenceType, new Variant(referenceKind), referenceItem, insertAsHyperlink, includePosition);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param referenceType an input-parameter of type Variant
	 * @param referenceKind an input-parameter of type int
	 * @param referenceItem an input-parameter of type Variant
	 * @param insertAsHyperlink an input-parameter of type Variant
	 */
	public void insertCrossReference(Variant referenceType, int referenceKind, Variant referenceItem, Variant insertAsHyperlink) {
		Dispatch.call(this, "InsertCrossReference", referenceType, new Variant(referenceKind), referenceItem, insertAsHyperlink);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param referenceType an input-parameter of type Variant
	 * @param referenceKind an input-parameter of type int
	 * @param referenceItem an input-parameter of type Variant
	 */
	public void insertCrossReference(Variant referenceType, int referenceKind, Variant referenceItem) {
		Dispatch.call(this, "InsertCrossReference", referenceType, new Variant(referenceKind), referenceItem);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param referenceType an input-parameter of type Variant
	 * @param referenceKind an input-parameter of type int
	 * @param referenceItem an input-parameter of type Variant
	 * @param insertAsHyperlink an input-parameter of type Variant
	 * @param includePosition an input-parameter of type Variant
	 * @param separateNumbers an input-parameter of type Variant
	 * @param separatorString an input-parameter of type Variant
	 */
	public void insertCrossReference(Variant referenceType, int referenceKind, Variant referenceItem, Variant insertAsHyperlink, Variant includePosition, Variant separateNumbers, Variant separatorString) {
		Dispatch.call(this, "InsertCrossReference", referenceType, new Variant(referenceKind), referenceItem, insertAsHyperlink, includePosition, separateNumbers, separatorString);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMaths
	 */
	public OMaths getOMaths() {
		return new OMaths(Dispatch.get(this, "OMaths").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getCharacterStyle() {
		return Dispatch.get(this, "CharacterStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getParagraphStyle() {
		return Dispatch.get(this, "ParagraphStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getListStyle() {
		return Dispatch.get(this, "ListStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getTableStyle() {
		return Dispatch.get(this, "TableStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ContentControls
	 */
	public ContentControls getContentControls() {
		return new ContentControls(Dispatch.get(this, "ContentControls").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param format an input-parameter of type int
	 */
	public void exportFragment(String fileName, int format) {
		Dispatch.call(this, "ExportFragment", fileName, new Variant(format));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getWordOpenXML() {
		return Dispatch.get(this, "WordOpenXML").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param level an input-parameter of type short
	 */
	public void setListLevel(short level) {
		Dispatch.call(this, "SetListLevel", new Variant(level));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param alignment an input-parameter of type int
	 * @param relativeTo an input-parameter of type int
	 */
	public void insertAlignmentTab(int alignment, int relativeTo) {
		Dispatch.call(this, "InsertAlignmentTab", new Variant(alignment), new Variant(relativeTo));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param alignment an input-parameter of type int
	 */
	public void insertAlignmentTab(int alignment) {
		Dispatch.call(this, "InsertAlignmentTab", new Variant(alignment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param alignment an input-parameter of type int
	 * @param relativeTo an input-parameter of type int
	 */
	public void insertAlignmentTab(int alignment, int relativeTo) {
		Dispatch.call(this, "InsertAlignmentTab", new Variant(alignment), new Variant(relativeTo));

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ContentControl
	 */
	public ContentControl getParentContentControl() {
		return new ContentControl(Dispatch.get(this, "ParentContentControl").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param matchDestination an input-parameter of type boolean
	 */
	public void importFragment(String fileName, boolean matchDestination) {
		Dispatch.call(this, "ImportFragment", fileName, new Variant(matchDestination));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void importFragment(String fileName) {
		Dispatch.call(this, "ImportFragment", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param matchDestination an input-parameter of type boolean
	 */
	public void importFragment(String fileName, boolean matchDestination) {
		Dispatch.call(this, "ImportFragment", fileName, new Variant(matchDestination));

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param exportCurrentPage an input-parameter of type boolean
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 * @param createBookmarks an input-parameter of type int
	 * @param docStructureTags an input-parameter of type boolean
	 * @param bitmapMissingFonts an input-parameter of type boolean
	 * @param useISO19005_1 an input-parameter of type boolean
	 * @param fixedFormatExtClassPtr an input-parameter of type Variant
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, boolean exportCurrentPage, int item, boolean includeDocProps, boolean keepIRM, int createBookmarks, boolean docStructureTags, boolean bitmapMissingFonts, boolean useISO19005_1, Variant fixedFormatExtClassPtr) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(exportCurrentPage), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM), new Variant(createBookmarks), new Variant(docStructureTags), new Variant(bitmapMissingFonts), new Variant(useISO19005_1), fixedFormatExtClassPtr});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param exportCurrentPage an input-parameter of type boolean
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 * @param createBookmarks an input-parameter of type int
	 * @param docStructureTags an input-parameter of type boolean
	 * @param bitmapMissingFonts an input-parameter of type boolean
	 * @param useISO19005_1 an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, boolean exportCurrentPage, int item, boolean includeDocProps, boolean keepIRM, int createBookmarks, boolean docStructureTags, boolean bitmapMissingFonts, boolean useISO19005_1) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(exportCurrentPage), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM), new Variant(createBookmarks), new Variant(docStructureTags), new Variant(bitmapMissingFonts), new Variant(useISO19005_1)});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param exportCurrentPage an input-parameter of type boolean
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 * @param createBookmarks an input-parameter of type int
	 * @param docStructureTags an input-parameter of type boolean
	 * @param bitmapMissingFonts an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, boolean exportCurrentPage, int item, boolean includeDocProps, boolean keepIRM, int createBookmarks, boolean docStructureTags, boolean bitmapMissingFonts) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(exportCurrentPage), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM), new Variant(createBookmarks), new Variant(docStructureTags), new Variant(bitmapMissingFonts)});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param exportCurrentPage an input-parameter of type boolean
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 * @param createBookmarks an input-parameter of type int
	 * @param docStructureTags an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, boolean exportCurrentPage, int item, boolean includeDocProps, boolean keepIRM, int createBookmarks, boolean docStructureTags) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(exportCurrentPage), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM), new Variant(createBookmarks), new Variant(docStructureTags)});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param exportCurrentPage an input-parameter of type boolean
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 * @param createBookmarks an input-parameter of type int
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, boolean exportCurrentPage, int item, boolean includeDocProps, boolean keepIRM, int createBookmarks) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(exportCurrentPage), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM), new Variant(createBookmarks)});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param exportCurrentPage an input-parameter of type boolean
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, boolean exportCurrentPage, int item, boolean includeDocProps, boolean keepIRM) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(exportCurrentPage), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param exportCurrentPage an input-parameter of type boolean
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, boolean exportCurrentPage, int item, boolean includeDocProps) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(exportCurrentPage), new Variant(item), new Variant(includeDocProps));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param exportCurrentPage an input-parameter of type boolean
	 * @param item an input-parameter of type int
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, boolean exportCurrentPage, int item) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(exportCurrentPage), new Variant(item));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param exportCurrentPage an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, boolean exportCurrentPage) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(exportCurrentPage));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat), new Variant(openAfterExport));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param exportCurrentPage an input-parameter of type boolean
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 * @param createBookmarks an input-parameter of type int
	 * @param docStructureTags an input-parameter of type boolean
	 * @param bitmapMissingFonts an input-parameter of type boolean
	 * @param useISO19005_1 an input-parameter of type boolean
	 * @param fixedFormatExtClassPtr an input-parameter of type Variant
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, boolean exportCurrentPage, int item, boolean includeDocProps, boolean keepIRM, int createBookmarks, boolean docStructureTags, boolean bitmapMissingFonts, boolean useISO19005_1, Variant fixedFormatExtClassPtr) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(exportCurrentPage), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM), new Variant(createBookmarks), new Variant(docStructureTags), new Variant(bitmapMissingFonts), new Variant(useISO19005_1), fixedFormatExtClassPtr});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type CoAuthLocks
	 */
	public CoAuthLocks getLocks() {
		return new CoAuthLocks(Dispatch.get(this, "Locks").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type CoAuthUpdates
	 */
	public CoAuthUpdates getUpdates() {
		return new CoAuthUpdates(Dispatch.get(this, "Updates").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Conflicts
	 */
	public Conflicts getConflicts() {
		return new Conflicts(Dispatch.get(this, "Conflicts").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getTextVisibleOnScreen() {
		return Dispatch.get(this, "TextVisibleOnScreen").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 * @param ignoreHe an input-parameter of type Variant
	 * @param languageID an input-parameter of type Variant
	 */
	public void sortByHeadings(Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID) {
		Dispatch.callN(this, "SortByHeadings", new Object[] { sortFieldType, sortOrder, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 * @param ignoreHe an input-parameter of type Variant
	 */
	public void sortByHeadings(Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe) {
		Dispatch.call(this, "SortByHeadings", sortFieldType, sortOrder, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 */
	public void sortByHeadings(Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics) {
		Dispatch.call(this, "SortByHeadings", sortFieldType, sortOrder, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 */
	public void sortByHeadings(Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida) {
		Dispatch.call(this, "SortByHeadings", sortFieldType, sortOrder, caseSensitive, bidiSort, ignoreThe, ignoreKashida);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 */
	public void sortByHeadings(Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort, Variant ignoreThe) {
		Dispatch.call(this, "SortByHeadings", sortFieldType, sortOrder, caseSensitive, bidiSort, ignoreThe);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 */
	public void sortByHeadings(Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort) {
		Dispatch.call(this, "SortByHeadings", sortFieldType, sortOrder, caseSensitive, bidiSort);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 */
	public void sortByHeadings(Variant sortFieldType, Variant sortOrder, Variant caseSensitive) {
		Dispatch.call(this, "SortByHeadings", sortFieldType, sortOrder, caseSensitive);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 */
	public void sortByHeadings(Variant sortFieldType, Variant sortOrder) {
		Dispatch.call(this, "SortByHeadings", sortFieldType, sortOrder);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortFieldType an input-parameter of type Variant
	 */
	public void sortByHeadings(Variant sortFieldType) {
		Dispatch.call(this, "SortByHeadings", sortFieldType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sortByHeadings() {
		Dispatch.call(this, "SortByHeadings");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 * @param ignoreHe an input-parameter of type Variant
	 * @param languageID an input-parameter of type Variant
	 */
	public void sortByHeadings(Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID) {
		Dispatch.callN(this, "SortByHeadings", new Object[] { sortFieldType, sortOrder, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID});

	}

}
