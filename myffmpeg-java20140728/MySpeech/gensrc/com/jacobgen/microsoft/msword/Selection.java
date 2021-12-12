/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Selection extends Dispatch {

	public static final String componentName = "Word.Selection";

	public Selection() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Selection(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Selection(String compName) {
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
	 * @return the result is of type int
	 */
	public int getType() {
		return Dispatch.get(this, "Type").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type Bookmarks
	 */
	public Bookmarks getBookmarks() {
		return new Bookmarks(Dispatch.get(this, "Bookmarks").toDispatch());
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
	 * @return the result is of type Hyperlinks
	 */
	public Hyperlinks getHyperlinks() {
		return new Hyperlinks(Dispatch.get(this, "Hyperlinks").toDispatch());
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
	 * @return the result is of type HeaderFooter
	 */
	public HeaderFooter getHeaderFooter() {
		return new HeaderFooter(Dispatch.get(this, "HeaderFooter").toDispatch());
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
	 * @return the result is of type Range
	 */
	public Range getRange() {
		return new Range(Dispatch.get(this, "Range").toDispatch());
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
	 * @return the result is of type int
	 */
	public int getFlags() {
		return Dispatch.get(this, "Flags").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param flags an input-parameter of type int
	 */
	public void setFlags(int flags) {
		Dispatch.put(this, "Flags", new Variant(flags));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getActive() {
		return Dispatch.get(this, "Active").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getStartIsActive() {
		return Dispatch.get(this, "StartIsActive").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startIsActive an input-parameter of type boolean
	 */
	public void setStartIsActive(boolean startIsActive) {
		Dispatch.put(this, "StartIsActive", new Variant(startIsActive));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIPAtEndOfLine() {
		return Dispatch.get(this, "IPAtEndOfLine").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getExtendMode() {
		return Dispatch.get(this, "ExtendMode").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param extendMode an input-parameter of type boolean
	 */
	public void setExtendMode(boolean extendMode) {
		Dispatch.put(this, "ExtendMode", new Variant(extendMode));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getColumnSelectMode() {
		return Dispatch.get(this, "ColumnSelectMode").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param columnSelectMode an input-parameter of type boolean
	 */
	public void setColumnSelectMode(boolean columnSelectMode) {
		Dispatch.put(this, "ColumnSelectMode", new Variant(columnSelectMode));
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
	 * @return the result is of type Document
	 */
	public Document getDocument() {
		return new Document(Dispatch.get(this, "Document").toDispatch());
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
	 * @return the result is of type Field
	 */
	public Field previousField() {
		return new Field(Dispatch.call(this, "PreviousField").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Field
	 */
	public Field nextField() {
		return new Field(Dispatch.call(this, "NextField").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertParagraphBefore() {
		Dispatch.call(this, "InsertParagraphBefore");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shiftCells an input-parameter of type Variant
	 */
	public void insertCells(Variant shiftCells) {
		Dispatch.call(this, "InsertCells", shiftCells);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertCells() {
		Dispatch.call(this, "InsertCells");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param shiftCells an input-parameter of type Variant
	 */
	public void insertCells(Variant shiftCells) {
		Dispatch.call(this, "InsertCells", shiftCells);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param character an input-parameter of type Variant
	 */
	public void extend(Variant character) {
		Dispatch.call(this, "Extend", character);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void extend() {
		Dispatch.call(this, "Extend");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param character an input-parameter of type Variant
	 */
	public void extend(Variant character) {
		Dispatch.call(this, "Extend", character);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void shrink() {
		Dispatch.call(this, "Shrink");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveLeft(Variant unit, Variant count, Variant extend) {
		return Dispatch.call(this, "MoveLeft", unit, count, extend).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveLeft(Variant unit, Variant count) {
		return Dispatch.call(this, "MoveLeft", unit, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveLeft(Variant unit) {
		return Dispatch.call(this, "MoveLeft", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int moveLeft() {
		return Dispatch.call(this, "MoveLeft").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveLeft(Variant unit, Variant count, Variant extend) {
		int result_of_MoveLeft = Dispatch.call(this, "MoveLeft", unit, count, extend).changeType(Variant.VariantInt).getInt();


		return result_of_MoveLeft;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveRight(Variant unit, Variant count, Variant extend) {
		return Dispatch.call(this, "MoveRight", unit, count, extend).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveRight(Variant unit, Variant count) {
		return Dispatch.call(this, "MoveRight", unit, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveRight(Variant unit) {
		return Dispatch.call(this, "MoveRight", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int moveRight() {
		return Dispatch.call(this, "MoveRight").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveRight(Variant unit, Variant count, Variant extend) {
		int result_of_MoveRight = Dispatch.call(this, "MoveRight", unit, count, extend).changeType(Variant.VariantInt).getInt();


		return result_of_MoveRight;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveUp(Variant unit, Variant count, Variant extend) {
		return Dispatch.call(this, "MoveUp", unit, count, extend).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveUp(Variant unit, Variant count) {
		return Dispatch.call(this, "MoveUp", unit, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveUp(Variant unit) {
		return Dispatch.call(this, "MoveUp", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int moveUp() {
		return Dispatch.call(this, "MoveUp").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveUp(Variant unit, Variant count, Variant extend) {
		int result_of_MoveUp = Dispatch.call(this, "MoveUp", unit, count, extend).changeType(Variant.VariantInt).getInt();


		return result_of_MoveUp;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveDown(Variant unit, Variant count, Variant extend) {
		return Dispatch.call(this, "MoveDown", unit, count, extend).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveDown(Variant unit, Variant count) {
		return Dispatch.call(this, "MoveDown", unit, count).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveDown(Variant unit) {
		return Dispatch.call(this, "MoveDown", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int moveDown() {
		return Dispatch.call(this, "MoveDown").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int moveDown(Variant unit, Variant count, Variant extend) {
		int result_of_MoveDown = Dispatch.call(this, "MoveDown", unit, count, extend).changeType(Variant.VariantInt).getInt();


		return result_of_MoveDown;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int homeKey(Variant unit, Variant extend) {
		return Dispatch.call(this, "HomeKey", unit, extend).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int homeKey(Variant unit) {
		return Dispatch.call(this, "HomeKey", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int homeKey() {
		return Dispatch.call(this, "HomeKey").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int homeKey(Variant unit, Variant extend) {
		int result_of_HomeKey = Dispatch.call(this, "HomeKey", unit, extend).changeType(Variant.VariantInt).getInt();


		return result_of_HomeKey;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int endKey(Variant unit, Variant extend) {
		return Dispatch.call(this, "EndKey", unit, extend).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int endKey(Variant unit) {
		return Dispatch.call(this, "EndKey", unit).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int endKey() {
		return Dispatch.call(this, "EndKey").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param unit an input-parameter of type Variant
	 * @param extend an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int endKey(Variant unit, Variant extend) {
		int result_of_EndKey = Dispatch.call(this, "EndKey", unit, extend).changeType(Variant.VariantInt).getInt();


		return result_of_EndKey;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void escapeKey() {
		Dispatch.call(this, "EscapeKey");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 */
	public void typeText(String text) {
		Dispatch.call(this, "TypeText", text);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void copyFormat() {
		Dispatch.call(this, "CopyFormat");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void pasteFormat() {
		Dispatch.call(this, "PasteFormat");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void typeParagraph() {
		Dispatch.call(this, "TypeParagraph");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void typeBackspace() {
		Dispatch.call(this, "TypeBackspace");
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
	 */
	public void selectColumn() {
		Dispatch.call(this, "SelectColumn");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void selectCurrentFont() {
		Dispatch.call(this, "SelectCurrentFont");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void selectCurrentAlignment() {
		Dispatch.call(this, "SelectCurrentAlignment");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void selectCurrentSpacing() {
		Dispatch.call(this, "SelectCurrentSpacing");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void selectCurrentIndent() {
		Dispatch.call(this, "SelectCurrentIndent");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void selectCurrentTabs() {
		Dispatch.call(this, "SelectCurrentTabs");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void selectCurrentColor() {
		Dispatch.call(this, "SelectCurrentColor");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void createTextbox() {
		Dispatch.call(this, "CreateTextbox");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void wholeStory() {
		Dispatch.call(this, "WholeStory");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void selectRow() {
		Dispatch.call(this, "SelectRow");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void splitTable() {
		Dispatch.call(this, "SplitTable");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numRows an input-parameter of type Variant
	 */
	public void insertRows(Variant numRows) {
		Dispatch.call(this, "InsertRows", numRows);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertRows() {
		Dispatch.call(this, "InsertRows");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param numRows an input-parameter of type Variant
	 */
	public void insertRows(Variant numRows) {
		Dispatch.call(this, "InsertRows", numRows);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertColumns() {
		Dispatch.call(this, "InsertColumns");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formula an input-parameter of type Variant
	 * @param numberFormat an input-parameter of type Variant
	 */
	public void insertFormula(Variant formula, Variant numberFormat) {
		Dispatch.call(this, "InsertFormula", formula, numberFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formula an input-parameter of type Variant
	 */
	public void insertFormula(Variant formula) {
		Dispatch.call(this, "InsertFormula", formula);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertFormula() {
		Dispatch.call(this, "InsertFormula");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param formula an input-parameter of type Variant
	 * @param numberFormat an input-parameter of type Variant
	 */
	public void insertFormula(Variant formula, Variant numberFormat) {
		Dispatch.call(this, "InsertFormula", formula, numberFormat);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param wrap an input-parameter of type Variant
	 * @return the result is of type Revision
	 */
	public Revision nextRevision(Variant wrap) {
		return new Revision(Dispatch.call(this, "NextRevision", wrap).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Revision
	 */
	public Revision nextRevision() {
		return new Revision(Dispatch.call(this, "NextRevision").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param wrap an input-parameter of type Variant
	 * @return the result is of type Revision
	 */
	public Revision nextRevision(Variant wrap) {
		Revision result_of_NextRevision = new Revision(Dispatch.call(this, "NextRevision", wrap).toDispatch());


		return result_of_NextRevision;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param wrap an input-parameter of type Variant
	 * @return the result is of type Revision
	 */
	public Revision previousRevision(Variant wrap) {
		return new Revision(Dispatch.call(this, "PreviousRevision", wrap).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Revision
	 */
	public Revision previousRevision() {
		return new Revision(Dispatch.call(this, "PreviousRevision").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param wrap an input-parameter of type Variant
	 * @return the result is of type Revision
	 */
	public Revision previousRevision(Variant wrap) {
		Revision result_of_PreviousRevision = new Revision(Dispatch.call(this, "PreviousRevision", wrap).toDispatch());


		return result_of_PreviousRevision;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void pasteAsNestedTable() {
		Dispatch.call(this, "PasteAsNestedTable");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param styleName an input-parameter of type String
	 * @return the result is of type AutoTextEntry
	 */
	public AutoTextEntry createAutoTextEntry(String name, String styleName) {
		return new AutoTextEntry(Dispatch.call(this, "CreateAutoTextEntry", name, styleName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void detectLanguage() {
		Dispatch.call(this, "DetectLanguage");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void selectCell() {
		Dispatch.call(this, "SelectCell");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numRows an input-parameter of type Variant
	 */
	public void insertRowsBelow(Variant numRows) {
		Dispatch.call(this, "InsertRowsBelow", numRows);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertRowsBelow() {
		Dispatch.call(this, "InsertRowsBelow");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param numRows an input-parameter of type Variant
	 */
	public void insertRowsBelow(Variant numRows) {
		Dispatch.call(this, "InsertRowsBelow", numRows);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertColumnsRight() {
		Dispatch.call(this, "InsertColumnsRight");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numRows an input-parameter of type Variant
	 */
	public void insertRowsAbove(Variant numRows) {
		Dispatch.call(this, "InsertRowsAbove", numRows);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertRowsAbove() {
		Dispatch.call(this, "InsertRowsAbove");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param numRows an input-parameter of type Variant
	 */
	public void insertRowsAbove(Variant numRows) {
		Dispatch.call(this, "InsertRowsAbove", numRows);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void rtlRun() {
		Dispatch.call(this, "RtlRun");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void ltrRun() {
		Dispatch.call(this, "LtrRun");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void boldRun() {
		Dispatch.call(this, "BoldRun");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void italicRun() {
		Dispatch.call(this, "ItalicRun");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void rtlPara() {
		Dispatch.call(this, "RtlPara");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void ltrPara() {
		Dispatch.call(this, "LtrPara");
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID) {
		Dispatch.callN(this, "Sort2000", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID});
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe) {
		Dispatch.callN(this, "Sort2000", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe});
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics) {
		Dispatch.callN(this, "Sort2000", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics});
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida) {
		Dispatch.callN(this, "Sort2000", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida});
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe) {
		Dispatch.callN(this, "Sort2000", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe});
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort) {
		Dispatch.callN(this, "Sort2000", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort});
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive) {
		Dispatch.callN(this, "Sort2000", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive});
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator) {
		Dispatch.callN(this, "Sort2000", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator});
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn) {
		Dispatch.callN(this, "Sort2000", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn});
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3) {
		Dispatch.callN(this, "Sort2000", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3});
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3) {
		Dispatch.callN(this, "Sort2000", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3});
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3) {
		Dispatch.call(this, "Sort2000", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3);
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2) {
		Dispatch.call(this, "Sort2000", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2);
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2) {
		Dispatch.call(this, "Sort2000", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param fieldNumber2 an input-parameter of type Variant
	 */
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2) {
		Dispatch.call(this, "Sort2000", excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 */
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder) {
		Dispatch.call(this, "Sort2000", excludeHeader, fieldNumber, sortFieldType, sortOrder);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 */
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType) {
		Dispatch.call(this, "Sort2000", excludeHeader, fieldNumber, sortFieldType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param fieldNumber an input-parameter of type Variant
	 */
	public void sort2000(Variant excludeHeader, Variant fieldNumber) {
		Dispatch.call(this, "Sort2000", excludeHeader, fieldNumber);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 */
	public void sort2000(Variant excludeHeader) {
		Dispatch.call(this, "Sort2000", excludeHeader);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sort2000() {
		Dispatch.call(this, "Sort2000");
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
	public void sort2000(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID) {
		Dispatch.callN(this, "Sort2000", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID});

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
	 */
	public void clearFormatting() {
		Dispatch.call(this, "ClearFormatting");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void pasteAppendTable() {
		Dispatch.call(this, "PasteAppendTable");
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
	 * @return the result is of type ShapeRange
	 */
	public ShapeRange getChildShapeRange() {
		return new ShapeRange(Dispatch.get(this, "ChildShapeRange").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasChildShapeRange() {
		return Dispatch.get(this, "HasChildShapeRange").changeType(Variant.VariantBoolean).getBoolean();
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
	 */
	public void toggleCharacterCode() {
		Dispatch.call(this, "ToggleCharacterCode");
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
	public void shrinkDiscontiguousSelection() {
		Dispatch.call(this, "ShrinkDiscontiguousSelection");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertStyleSeparator() {
		Dispatch.call(this, "InsertStyleSeparator");
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
	 * @param subFieldNumber an input-parameter of type Variant
	 * @param subFieldNumber2 an input-parameter of type Variant
	 * @param subFieldNumber3 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID, Variant subFieldNumber, Variant subFieldNumber2, Variant subFieldNumber3) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID, subFieldNumber, subFieldNumber2, subFieldNumber3});
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
	 * @param subFieldNumber an input-parameter of type Variant
	 * @param subFieldNumber2 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID, Variant subFieldNumber, Variant subFieldNumber2) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID, subFieldNumber, subFieldNumber2});
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
	 * @param subFieldNumber an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID, Variant subFieldNumber) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID, subFieldNumber});
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
	 * @param subFieldNumber an input-parameter of type Variant
	 * @param subFieldNumber2 an input-parameter of type Variant
	 * @param subFieldNumber3 an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant fieldNumber, Variant sortFieldType, Variant sortOrder, Variant fieldNumber2, Variant sortFieldType2, Variant sortOrder2, Variant fieldNumber3, Variant sortFieldType3, Variant sortOrder3, Variant sortColumn, Variant separator, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID, Variant subFieldNumber, Variant subFieldNumber2, Variant subFieldNumber3) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, fieldNumber, sortFieldType, sortOrder, fieldNumber2, sortFieldType2, sortOrder2, fieldNumber3, sortFieldType3, sortOrder3, sortColumn, separator, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID, subFieldNumber, subFieldNumber2, subFieldNumber3});

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
	 * @return the result is of type String
	 */
	public String getWordOpenXML() {
		return Dispatch.get(this, "WordOpenXML").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clearParagraphStyle() {
		Dispatch.call(this, "ClearParagraphStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clearCharacterAllFormatting() {
		Dispatch.call(this, "ClearCharacterAllFormatting");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clearCharacterStyle() {
		Dispatch.call(this, "ClearCharacterStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clearCharacterDirectFormatting() {
		Dispatch.call(this, "ClearCharacterDirectFormatting");
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
	 * @return the result is of type ContentControl
	 */
	public ContentControl getParentContentControl() {
		return new ContentControl(Dispatch.get(this, "ParentContentControl").toDispatch());
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
	 */
	public void readingModeGrowFont() {
		Dispatch.call(this, "ReadingModeGrowFont");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void readingModeShrinkFont() {
		Dispatch.call(this, "ReadingModeShrinkFont");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clearParagraphAllFormatting() {
		Dispatch.call(this, "ClearParagraphAllFormatting");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clearParagraphDirectFormatting() {
		Dispatch.call(this, "ClearParagraphDirectFormatting");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void insertNewPage() {
		Dispatch.call(this, "InsertNewPage");
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
