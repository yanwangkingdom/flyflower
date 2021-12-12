/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class View extends Dispatch {

	public static final String componentName = "Word.View";

	public View() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public View(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public View(String compName) {
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
	public int getType() {
		return Dispatch.get(this, "Type").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 */
	public void setType(int type) {
		Dispatch.put(this, "Type", new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFullScreen() {
		return Dispatch.get(this, "FullScreen").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fullScreen an input-parameter of type boolean
	 */
	public void setFullScreen(boolean fullScreen) {
		Dispatch.put(this, "FullScreen", new Variant(fullScreen));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDraft() {
		return Dispatch.get(this, "Draft").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param draft an input-parameter of type boolean
	 */
	public void setDraft(boolean draft) {
		Dispatch.put(this, "Draft", new Variant(draft));
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
	 * @return the result is of type boolean
	 */
	public boolean getShowFieldCodes() {
		return Dispatch.get(this, "ShowFieldCodes").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showFieldCodes an input-parameter of type boolean
	 */
	public void setShowFieldCodes(boolean showFieldCodes) {
		Dispatch.put(this, "ShowFieldCodes", new Variant(showFieldCodes));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMailMergeDataView() {
		return Dispatch.get(this, "MailMergeDataView").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param mailMergeDataView an input-parameter of type boolean
	 */
	public void setMailMergeDataView(boolean mailMergeDataView) {
		Dispatch.put(this, "MailMergeDataView", new Variant(mailMergeDataView));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMagnifier() {
		return Dispatch.get(this, "Magnifier").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param magnifier an input-parameter of type boolean
	 */
	public void setMagnifier(boolean magnifier) {
		Dispatch.put(this, "Magnifier", new Variant(magnifier));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowFirstLineOnly() {
		return Dispatch.get(this, "ShowFirstLineOnly").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showFirstLineOnly an input-parameter of type boolean
	 */
	public void setShowFirstLineOnly(boolean showFirstLineOnly) {
		Dispatch.put(this, "ShowFirstLineOnly", new Variant(showFirstLineOnly));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowFormat() {
		return Dispatch.get(this, "ShowFormat").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showFormat an input-parameter of type boolean
	 */
	public void setShowFormat(boolean showFormat) {
		Dispatch.put(this, "ShowFormat", new Variant(showFormat));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Zoom
	 */
	public Zoom getZoom() {
		return new Zoom(Dispatch.get(this, "Zoom").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowObjectAnchors() {
		return Dispatch.get(this, "ShowObjectAnchors").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showObjectAnchors an input-parameter of type boolean
	 */
	public void setShowObjectAnchors(boolean showObjectAnchors) {
		Dispatch.put(this, "ShowObjectAnchors", new Variant(showObjectAnchors));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowTextBoundaries() {
		return Dispatch.get(this, "ShowTextBoundaries").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showTextBoundaries an input-parameter of type boolean
	 */
	public void setShowTextBoundaries(boolean showTextBoundaries) {
		Dispatch.put(this, "ShowTextBoundaries", new Variant(showTextBoundaries));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowHighlight() {
		return Dispatch.get(this, "ShowHighlight").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showHighlight an input-parameter of type boolean
	 */
	public void setShowHighlight(boolean showHighlight) {
		Dispatch.put(this, "ShowHighlight", new Variant(showHighlight));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowDrawings() {
		return Dispatch.get(this, "ShowDrawings").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showDrawings an input-parameter of type boolean
	 */
	public void setShowDrawings(boolean showDrawings) {
		Dispatch.put(this, "ShowDrawings", new Variant(showDrawings));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowTabs() {
		return Dispatch.get(this, "ShowTabs").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showTabs an input-parameter of type boolean
	 */
	public void setShowTabs(boolean showTabs) {
		Dispatch.put(this, "ShowTabs", new Variant(showTabs));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowSpaces() {
		return Dispatch.get(this, "ShowSpaces").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showSpaces an input-parameter of type boolean
	 */
	public void setShowSpaces(boolean showSpaces) {
		Dispatch.put(this, "ShowSpaces", new Variant(showSpaces));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowParagraphs() {
		return Dispatch.get(this, "ShowParagraphs").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showParagraphs an input-parameter of type boolean
	 */
	public void setShowParagraphs(boolean showParagraphs) {
		Dispatch.put(this, "ShowParagraphs", new Variant(showParagraphs));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowHyphens() {
		return Dispatch.get(this, "ShowHyphens").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showHyphens an input-parameter of type boolean
	 */
	public void setShowHyphens(boolean showHyphens) {
		Dispatch.put(this, "ShowHyphens", new Variant(showHyphens));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowHiddenText() {
		return Dispatch.get(this, "ShowHiddenText").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showHiddenText an input-parameter of type boolean
	 */
	public void setShowHiddenText(boolean showHiddenText) {
		Dispatch.put(this, "ShowHiddenText", new Variant(showHiddenText));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getWrapToWindow() {
		return Dispatch.get(this, "WrapToWindow").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param wrapToWindow an input-parameter of type boolean
	 */
	public void setWrapToWindow(boolean wrapToWindow) {
		Dispatch.put(this, "WrapToWindow", new Variant(wrapToWindow));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowPicturePlaceHolders() {
		return Dispatch.get(this, "ShowPicturePlaceHolders").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showPicturePlaceHolders an input-parameter of type boolean
	 */
	public void setShowPicturePlaceHolders(boolean showPicturePlaceHolders) {
		Dispatch.put(this, "ShowPicturePlaceHolders", new Variant(showPicturePlaceHolders));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowBookmarks() {
		return Dispatch.get(this, "ShowBookmarks").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showBookmarks an input-parameter of type boolean
	 */
	public void setShowBookmarks(boolean showBookmarks) {
		Dispatch.put(this, "ShowBookmarks", new Variant(showBookmarks));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFieldShading() {
		return Dispatch.get(this, "FieldShading").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fieldShading an input-parameter of type int
	 */
	public void setFieldShading(int fieldShading) {
		Dispatch.put(this, "FieldShading", new Variant(fieldShading));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowAnimation() {
		return Dispatch.get(this, "ShowAnimation").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showAnimation an input-parameter of type boolean
	 */
	public void setShowAnimation(boolean showAnimation) {
		Dispatch.put(this, "ShowAnimation", new Variant(showAnimation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getTableGridlines() {
		return Dispatch.get(this, "TableGridlines").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tableGridlines an input-parameter of type boolean
	 */
	public void setTableGridlines(boolean tableGridlines) {
		Dispatch.put(this, "TableGridlines", new Variant(tableGridlines));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getEnlargeFontsLessThan() {
		return Dispatch.get(this, "EnlargeFontsLessThan").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param enlargeFontsLessThan an input-parameter of type int
	 */
	public void setEnlargeFontsLessThan(int enlargeFontsLessThan) {
		Dispatch.put(this, "EnlargeFontsLessThan", new Variant(enlargeFontsLessThan));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowMainTextLayer() {
		return Dispatch.get(this, "ShowMainTextLayer").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showMainTextLayer an input-parameter of type boolean
	 */
	public void setShowMainTextLayer(boolean showMainTextLayer) {
		Dispatch.put(this, "ShowMainTextLayer", new Variant(showMainTextLayer));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSeekView() {
		return Dispatch.get(this, "SeekView").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param seekView an input-parameter of type int
	 */
	public void setSeekView(int seekView) {
		Dispatch.put(this, "SeekView", new Variant(seekView));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSplitSpecial() {
		return Dispatch.get(this, "SplitSpecial").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param splitSpecial an input-parameter of type int
	 */
	public void setSplitSpecial(int splitSpecial) {
		Dispatch.put(this, "SplitSpecial", new Variant(splitSpecial));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBrowseToWindow() {
		return Dispatch.get(this, "BrowseToWindow").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param browseToWindow an input-parameter of type int
	 */
	public void setBrowseToWindow(int browseToWindow) {
		Dispatch.put(this, "BrowseToWindow", new Variant(browseToWindow));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowOptionalBreaks() {
		return Dispatch.get(this, "ShowOptionalBreaks").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showOptionalBreaks an input-parameter of type boolean
	 */
	public void setShowOptionalBreaks(boolean showOptionalBreaks) {
		Dispatch.put(this, "ShowOptionalBreaks", new Variant(showOptionalBreaks));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Variant
	 */
	public void collapseOutline(Variant range) {
		Dispatch.call(this, "CollapseOutline", range);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void collapseOutline() {
		Dispatch.call(this, "CollapseOutline");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Variant
	 */
	public void collapseOutline(Variant range) {
		Dispatch.call(this, "CollapseOutline", range);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Variant
	 */
	public void expandOutline(Variant range) {
		Dispatch.call(this, "ExpandOutline", range);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void expandOutline() {
		Dispatch.call(this, "ExpandOutline");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Variant
	 */
	public void expandOutline(Variant range) {
		Dispatch.call(this, "ExpandOutline", range);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void showAllHeadings() {
		Dispatch.call(this, "ShowAllHeadings");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param level an input-parameter of type int
	 */
	public void showHeading(int level) {
		Dispatch.call(this, "ShowHeading", new Variant(level));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void previousHeaderFooter() {
		Dispatch.call(this, "PreviousHeaderFooter");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void nextHeaderFooter() {
		Dispatch.call(this, "NextHeaderFooter");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayPageBoundaries() {
		return Dispatch.get(this, "DisplayPageBoundaries").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayPageBoundaries an input-parameter of type boolean
	 */
	public void setDisplayPageBoundaries(boolean displayPageBoundaries) {
		Dispatch.put(this, "DisplayPageBoundaries", new Variant(displayPageBoundaries));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplaySmartTags() {
		return Dispatch.get(this, "DisplaySmartTags").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displaySmartTags an input-parameter of type boolean
	 */
	public void setDisplaySmartTags(boolean displaySmartTags) {
		Dispatch.put(this, "DisplaySmartTags", new Variant(displaySmartTags));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowRevisionsAndComments() {
		return Dispatch.get(this, "ShowRevisionsAndComments").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showRevisionsAndComments an input-parameter of type boolean
	 */
	public void setShowRevisionsAndComments(boolean showRevisionsAndComments) {
		Dispatch.put(this, "ShowRevisionsAndComments", new Variant(showRevisionsAndComments));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowComments() {
		return Dispatch.get(this, "ShowComments").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showComments an input-parameter of type boolean
	 */
	public void setShowComments(boolean showComments) {
		Dispatch.put(this, "ShowComments", new Variant(showComments));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowInsertionsAndDeletions() {
		return Dispatch.get(this, "ShowInsertionsAndDeletions").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showInsertionsAndDeletions an input-parameter of type boolean
	 */
	public void setShowInsertionsAndDeletions(boolean showInsertionsAndDeletions) {
		Dispatch.put(this, "ShowInsertionsAndDeletions", new Variant(showInsertionsAndDeletions));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowFormatChanges() {
		return Dispatch.get(this, "ShowFormatChanges").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showFormatChanges an input-parameter of type boolean
	 */
	public void setShowFormatChanges(boolean showFormatChanges) {
		Dispatch.put(this, "ShowFormatChanges", new Variant(showFormatChanges));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRevisionsView() {
		return Dispatch.get(this, "RevisionsView").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param revisionsView an input-parameter of type int
	 */
	public void setRevisionsView(int revisionsView) {
		Dispatch.put(this, "RevisionsView", new Variant(revisionsView));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRevisionsMode() {
		return Dispatch.get(this, "RevisionsMode").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param revisionsMode an input-parameter of type int
	 */
	public void setRevisionsMode(int revisionsMode) {
		Dispatch.put(this, "RevisionsMode", new Variant(revisionsMode));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getRevisionsBalloonWidth() {
		return Dispatch.get(this, "RevisionsBalloonWidth").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param revisionsBalloonWidth an input-parameter of type float
	 */
	public void setRevisionsBalloonWidth(float revisionsBalloonWidth) {
		Dispatch.put(this, "RevisionsBalloonWidth", new Variant(revisionsBalloonWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRevisionsBalloonWidthType() {
		return Dispatch.get(this, "RevisionsBalloonWidthType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param revisionsBalloonWidthType an input-parameter of type int
	 */
	public void setRevisionsBalloonWidthType(int revisionsBalloonWidthType) {
		Dispatch.put(this, "RevisionsBalloonWidthType", new Variant(revisionsBalloonWidthType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRevisionsBalloonSide() {
		return Dispatch.get(this, "RevisionsBalloonSide").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param revisionsBalloonSide an input-parameter of type int
	 */
	public void setRevisionsBalloonSide(int revisionsBalloonSide) {
		Dispatch.put(this, "RevisionsBalloonSide", new Variant(revisionsBalloonSide));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Reviewers
	 */
	public Reviewers getReviewers() {
		return new Reviewers(Dispatch.get(this, "Reviewers").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getRevisionsBalloonShowConnectingLines() {
		return Dispatch.get(this, "RevisionsBalloonShowConnectingLines").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param revisionsBalloonShowConnectingLines an input-parameter of type boolean
	 */
	public void setRevisionsBalloonShowConnectingLines(boolean revisionsBalloonShowConnectingLines) {
		Dispatch.put(this, "RevisionsBalloonShowConnectingLines", new Variant(revisionsBalloonShowConnectingLines));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getReadingLayout() {
		return Dispatch.get(this, "ReadingLayout").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param readingLayout an input-parameter of type boolean
	 */
	public void setReadingLayout(boolean readingLayout) {
		Dispatch.put(this, "ReadingLayout", new Variant(readingLayout));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getShowXMLMarkup() {
		return Dispatch.get(this, "ShowXMLMarkup").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showXMLMarkup an input-parameter of type int
	 */
	public void setShowXMLMarkup(int showXMLMarkup) {
		Dispatch.put(this, "ShowXMLMarkup", new Variant(showXMLMarkup));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getShadeEditableRanges() {
		return Dispatch.get(this, "ShadeEditableRanges").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shadeEditableRanges an input-parameter of type int
	 */
	public void setShadeEditableRanges(int shadeEditableRanges) {
		Dispatch.put(this, "ShadeEditableRanges", new Variant(shadeEditableRanges));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowInkAnnotations() {
		return Dispatch.get(this, "ShowInkAnnotations").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showInkAnnotations an input-parameter of type boolean
	 */
	public void setShowInkAnnotations(boolean showInkAnnotations) {
		Dispatch.put(this, "ShowInkAnnotations", new Variant(showInkAnnotations));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayBackgrounds() {
		return Dispatch.get(this, "DisplayBackgrounds").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayBackgrounds an input-parameter of type boolean
	 */
	public void setDisplayBackgrounds(boolean displayBackgrounds) {
		Dispatch.put(this, "DisplayBackgrounds", new Variant(displayBackgrounds));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getReadingLayoutActualView() {
		return Dispatch.get(this, "ReadingLayoutActualView").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param readingLayoutActualView an input-parameter of type boolean
	 */
	public void setReadingLayoutActualView(boolean readingLayoutActualView) {
		Dispatch.put(this, "ReadingLayoutActualView", new Variant(readingLayoutActualView));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getReadingLayoutAllowMultiplePages() {
		return Dispatch.get(this, "ReadingLayoutAllowMultiplePages").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param readingLayoutAllowMultiplePages an input-parameter of type boolean
	 */
	public void setReadingLayoutAllowMultiplePages(boolean readingLayoutAllowMultiplePages) {
		Dispatch.put(this, "ReadingLayoutAllowMultiplePages", new Variant(readingLayoutAllowMultiplePages));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getReadingLayoutAllowEditing() {
		return Dispatch.get(this, "ReadingLayoutAllowEditing").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param readingLayoutAllowEditing an input-parameter of type boolean
	 */
	public void setReadingLayoutAllowEditing(boolean readingLayoutAllowEditing) {
		Dispatch.put(this, "ReadingLayoutAllowEditing", new Variant(readingLayoutAllowEditing));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getReadingLayoutTruncateMargins() {
		return Dispatch.get(this, "ReadingLayoutTruncateMargins").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param readingLayoutTruncateMargins an input-parameter of type int
	 */
	public void setReadingLayoutTruncateMargins(int readingLayoutTruncateMargins) {
		Dispatch.put(this, "ReadingLayoutTruncateMargins", new Variant(readingLayoutTruncateMargins));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowMarkupAreaHighlight() {
		return Dispatch.get(this, "ShowMarkupAreaHighlight").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showMarkupAreaHighlight an input-parameter of type boolean
	 */
	public void setShowMarkupAreaHighlight(boolean showMarkupAreaHighlight) {
		Dispatch.put(this, "ShowMarkupAreaHighlight", new Variant(showMarkupAreaHighlight));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getPanning() {
		return Dispatch.get(this, "Panning").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param panning an input-parameter of type boolean
	 */
	public void setPanning(boolean panning) {
		Dispatch.put(this, "Panning", new Variant(panning));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowCropMarks() {
		return Dispatch.get(this, "ShowCropMarks").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showCropMarks an input-parameter of type boolean
	 */
	public void setShowCropMarks(boolean showCropMarks) {
		Dispatch.put(this, "ShowCropMarks", new Variant(showCropMarks));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMarkupMode() {
		return Dispatch.get(this, "MarkupMode").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param markupMode an input-parameter of type int
	 */
	public void setMarkupMode(int markupMode) {
		Dispatch.put(this, "MarkupMode", new Variant(markupMode));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getConflictMode() {
		return Dispatch.get(this, "ConflictMode").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param conflictMode an input-parameter of type boolean
	 */
	public void setConflictMode(boolean conflictMode) {
		Dispatch.put(this, "ConflictMode", new Variant(conflictMode));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowOtherAuthors() {
		return Dispatch.get(this, "ShowOtherAuthors").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showOtherAuthors an input-parameter of type boolean
	 */
	public void setShowOtherAuthors(boolean showOtherAuthors) {
		Dispatch.put(this, "ShowOtherAuthors", new Variant(showOtherAuthors));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void expandAllHeadings() {
		Dispatch.call(this, "ExpandAllHeadings");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void collapseAllHeadings() {
		Dispatch.call(this, "CollapseAllHeadings");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type RevisionsFilter
	 */
	public RevisionsFilter getRevisionsFilter() {
		return new RevisionsFilter(Dispatch.get(this, "RevisionsFilter").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPageColor() {
		return Dispatch.get(this, "PageColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pageColor an input-parameter of type int
	 */
	public void setPageColor(int pageColor) {
		Dispatch.put(this, "PageColor", new Variant(pageColor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getColumnWidth() {
		return Dispatch.get(this, "ColumnWidth").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param columnWidth an input-parameter of type int
	 */
	public void setColumnWidth(int columnWidth) {
		Dispatch.put(this, "ColumnWidth", new Variant(columnWidth));
	}

}
