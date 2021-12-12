/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class PageSetup extends Dispatch {

	public static final String componentName = "Word.PageSetup";

	public PageSetup() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public PageSetup(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public PageSetup(String compName) {
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
	 * @return the result is of type float
	 */
	public float getTopMargin() {
		return Dispatch.get(this, "TopMargin").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param topMargin an input-parameter of type float
	 */
	public void setTopMargin(float topMargin) {
		Dispatch.put(this, "TopMargin", new Variant(topMargin));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getBottomMargin() {
		return Dispatch.get(this, "BottomMargin").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bottomMargin an input-parameter of type float
	 */
	public void setBottomMargin(float bottomMargin) {
		Dispatch.put(this, "BottomMargin", new Variant(bottomMargin));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLeftMargin() {
		return Dispatch.get(this, "LeftMargin").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param leftMargin an input-parameter of type float
	 */
	public void setLeftMargin(float leftMargin) {
		Dispatch.put(this, "LeftMargin", new Variant(leftMargin));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getRightMargin() {
		return Dispatch.get(this, "RightMargin").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rightMargin an input-parameter of type float
	 */
	public void setRightMargin(float rightMargin) {
		Dispatch.put(this, "RightMargin", new Variant(rightMargin));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getGutter() {
		return Dispatch.get(this, "Gutter").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gutter an input-parameter of type float
	 */
	public void setGutter(float gutter) {
		Dispatch.put(this, "Gutter", new Variant(gutter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getPageWidth() {
		return Dispatch.get(this, "PageWidth").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pageWidth an input-parameter of type float
	 */
	public void setPageWidth(float pageWidth) {
		Dispatch.put(this, "PageWidth", new Variant(pageWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getPageHeight() {
		return Dispatch.get(this, "PageHeight").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pageHeight an input-parameter of type float
	 */
	public void setPageHeight(float pageHeight) {
		Dispatch.put(this, "PageHeight", new Variant(pageHeight));
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
	 * @return the result is of type int
	 */
	public int getFirstPageTray() {
		return Dispatch.get(this, "FirstPageTray").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param firstPageTray an input-parameter of type int
	 */
	public void setFirstPageTray(int firstPageTray) {
		Dispatch.put(this, "FirstPageTray", new Variant(firstPageTray));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOtherPagesTray() {
		return Dispatch.get(this, "OtherPagesTray").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param otherPagesTray an input-parameter of type int
	 */
	public void setOtherPagesTray(int otherPagesTray) {
		Dispatch.put(this, "OtherPagesTray", new Variant(otherPagesTray));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getVerticalAlignment() {
		return Dispatch.get(this, "VerticalAlignment").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param verticalAlignment an input-parameter of type int
	 */
	public void setVerticalAlignment(int verticalAlignment) {
		Dispatch.put(this, "VerticalAlignment", new Variant(verticalAlignment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMirrorMargins() {
		return Dispatch.get(this, "MirrorMargins").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param mirrorMargins an input-parameter of type int
	 */
	public void setMirrorMargins(int mirrorMargins) {
		Dispatch.put(this, "MirrorMargins", new Variant(mirrorMargins));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getHeaderDistance() {
		return Dispatch.get(this, "HeaderDistance").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param headerDistance an input-parameter of type float
	 */
	public void setHeaderDistance(float headerDistance) {
		Dispatch.put(this, "HeaderDistance", new Variant(headerDistance));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getFooterDistance() {
		return Dispatch.get(this, "FooterDistance").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param footerDistance an input-parameter of type float
	 */
	public void setFooterDistance(float footerDistance) {
		Dispatch.put(this, "FooterDistance", new Variant(footerDistance));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSectionStart() {
		return Dispatch.get(this, "SectionStart").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sectionStart an input-parameter of type int
	 */
	public void setSectionStart(int sectionStart) {
		Dispatch.put(this, "SectionStart", new Variant(sectionStart));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOddAndEvenPagesHeaderFooter() {
		return Dispatch.get(this, "OddAndEvenPagesHeaderFooter").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param oddAndEvenPagesHeaderFooter an input-parameter of type int
	 */
	public void setOddAndEvenPagesHeaderFooter(int oddAndEvenPagesHeaderFooter) {
		Dispatch.put(this, "OddAndEvenPagesHeaderFooter", new Variant(oddAndEvenPagesHeaderFooter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDifferentFirstPageHeaderFooter() {
		return Dispatch.get(this, "DifferentFirstPageHeaderFooter").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param differentFirstPageHeaderFooter an input-parameter of type int
	 */
	public void setDifferentFirstPageHeaderFooter(int differentFirstPageHeaderFooter) {
		Dispatch.put(this, "DifferentFirstPageHeaderFooter", new Variant(differentFirstPageHeaderFooter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSuppressEndnotes() {
		return Dispatch.get(this, "SuppressEndnotes").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param suppressEndnotes an input-parameter of type int
	 */
	public void setSuppressEndnotes(int suppressEndnotes) {
		Dispatch.put(this, "SuppressEndnotes", new Variant(suppressEndnotes));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type LineNumbering
	 */
	public LineNumbering getLineNumbering() {
		return new LineNumbering(Dispatch.get(this, "LineNumbering").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lineNumbering an input-parameter of type LineNumbering
	 */
	public void setLineNumbering(LineNumbering lineNumbering) {
		Dispatch.put(this, "LineNumbering", lineNumbering);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TextColumns
	 */
	public TextColumns getTextColumns() {
		return new TextColumns(Dispatch.get(this, "TextColumns").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textColumns an input-parameter of type TextColumns
	 */
	public void setTextColumns(TextColumns textColumns) {
		Dispatch.put(this, "TextColumns", textColumns);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPaperSize() {
		return Dispatch.get(this, "PaperSize").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param paperSize an input-parameter of type int
	 */
	public void setPaperSize(int paperSize) {
		Dispatch.put(this, "PaperSize", new Variant(paperSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getTwoPagesOnOne() {
		return Dispatch.get(this, "TwoPagesOnOne").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param twoPagesOnOne an input-parameter of type boolean
	 */
	public void setTwoPagesOnOne(boolean twoPagesOnOne) {
		Dispatch.put(this, "TwoPagesOnOne", new Variant(twoPagesOnOne));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getGutterOnTop() {
		return Dispatch.get(this, "GutterOnTop").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gutterOnTop an input-parameter of type boolean
	 */
	public void setGutterOnTop(boolean gutterOnTop) {
		Dispatch.put(this, "GutterOnTop", new Variant(gutterOnTop));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getCharsLine() {
		return Dispatch.get(this, "CharsLine").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param charsLine an input-parameter of type float
	 */
	public void setCharsLine(float charsLine) {
		Dispatch.put(this, "CharsLine", new Variant(charsLine));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLinesPage() {
		return Dispatch.get(this, "LinesPage").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param linesPage an input-parameter of type float
	 */
	public void setLinesPage(float linesPage) {
		Dispatch.put(this, "LinesPage", new Variant(linesPage));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowGrid() {
		return Dispatch.get(this, "ShowGrid").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showGrid an input-parameter of type boolean
	 */
	public void setShowGrid(boolean showGrid) {
		Dispatch.put(this, "ShowGrid", new Variant(showGrid));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void togglePortrait() {
		Dispatch.call(this, "TogglePortrait");
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
	public int getGutterStyle() {
		return Dispatch.get(this, "GutterStyle").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gutterStyle an input-parameter of type int
	 */
	public void setGutterStyle(int gutterStyle) {
		Dispatch.put(this, "GutterStyle", new Variant(gutterStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSectionDirection() {
		return Dispatch.get(this, "SectionDirection").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sectionDirection an input-parameter of type int
	 */
	public void setSectionDirection(int sectionDirection) {
		Dispatch.put(this, "SectionDirection", new Variant(sectionDirection));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLayoutMode() {
		return Dispatch.get(this, "LayoutMode").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param layoutMode an input-parameter of type int
	 */
	public void setLayoutMode(int layoutMode) {
		Dispatch.put(this, "LayoutMode", new Variant(layoutMode));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getGutterPos() {
		return Dispatch.get(this, "GutterPos").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gutterPos an input-parameter of type int
	 */
	public void setGutterPos(int gutterPos) {
		Dispatch.put(this, "GutterPos", new Variant(gutterPos));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getBookFoldPrinting() {
		return Dispatch.get(this, "BookFoldPrinting").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bookFoldPrinting an input-parameter of type boolean
	 */
	public void setBookFoldPrinting(boolean bookFoldPrinting) {
		Dispatch.put(this, "BookFoldPrinting", new Variant(bookFoldPrinting));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getBookFoldRevPrinting() {
		return Dispatch.get(this, "BookFoldRevPrinting").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bookFoldRevPrinting an input-parameter of type boolean
	 */
	public void setBookFoldRevPrinting(boolean bookFoldRevPrinting) {
		Dispatch.put(this, "BookFoldRevPrinting", new Variant(bookFoldRevPrinting));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBookFoldPrintingSheets() {
		return Dispatch.get(this, "BookFoldPrintingSheets").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bookFoldPrintingSheets an input-parameter of type int
	 */
	public void setBookFoldPrintingSheets(int bookFoldPrintingSheets) {
		Dispatch.put(this, "BookFoldPrintingSheets", new Variant(bookFoldPrintingSheets));
	}

}
