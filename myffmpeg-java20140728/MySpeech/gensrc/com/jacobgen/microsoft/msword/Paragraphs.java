/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Paragraphs extends Dispatch {

	public static final String componentName = "Word.Paragraphs";

	public Paragraphs() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Paragraphs(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Paragraphs(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant get_NewEnum() {
		return Dispatch.get(this, "_NewEnum");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Paragraph
	 */
	public Paragraph getFirst() {
		return new Paragraph(Dispatch.get(this, "First").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Paragraph
	 */
	public Paragraph getLast() {
		return new Paragraph(Dispatch.get(this, "Last").toDispatch());
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
	 * @return the result is of type ParagraphFormat
	 */
	public ParagraphFormat getFormat() {
		return new ParagraphFormat(Dispatch.get(this, "Format").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type ParagraphFormat
	 */
	public void setFormat(ParagraphFormat format) {
		Dispatch.put(this, "Format", format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TabStops
	 */
	public TabStops getTabStops() {
		return new TabStops(Dispatch.get(this, "TabStops").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tabStops an input-parameter of type TabStops
	 */
	public void setTabStops(TabStops tabStops) {
		Dispatch.put(this, "TabStops", tabStops);
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
	public int getAlignment() {
		return Dispatch.get(this, "Alignment").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param alignment an input-parameter of type int
	 */
	public void setAlignment(int alignment) {
		Dispatch.put(this, "Alignment", new Variant(alignment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getKeepTogether() {
		return Dispatch.get(this, "KeepTogether").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param keepTogether an input-parameter of type int
	 */
	public void setKeepTogether(int keepTogether) {
		Dispatch.put(this, "KeepTogether", new Variant(keepTogether));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getKeepWithNext() {
		return Dispatch.get(this, "KeepWithNext").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param keepWithNext an input-parameter of type int
	 */
	public void setKeepWithNext(int keepWithNext) {
		Dispatch.put(this, "KeepWithNext", new Variant(keepWithNext));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPageBreakBefore() {
		return Dispatch.get(this, "PageBreakBefore").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pageBreakBefore an input-parameter of type int
	 */
	public void setPageBreakBefore(int pageBreakBefore) {
		Dispatch.put(this, "PageBreakBefore", new Variant(pageBreakBefore));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNoLineNumber() {
		return Dispatch.get(this, "NoLineNumber").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param noLineNumber an input-parameter of type int
	 */
	public void setNoLineNumber(int noLineNumber) {
		Dispatch.put(this, "NoLineNumber", new Variant(noLineNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getRightIndent() {
		return Dispatch.get(this, "RightIndent").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rightIndent an input-parameter of type float
	 */
	public void setRightIndent(float rightIndent) {
		Dispatch.put(this, "RightIndent", new Variant(rightIndent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLeftIndent() {
		return Dispatch.get(this, "LeftIndent").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param leftIndent an input-parameter of type float
	 */
	public void setLeftIndent(float leftIndent) {
		Dispatch.put(this, "LeftIndent", new Variant(leftIndent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getFirstLineIndent() {
		return Dispatch.get(this, "FirstLineIndent").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param firstLineIndent an input-parameter of type float
	 */
	public void setFirstLineIndent(float firstLineIndent) {
		Dispatch.put(this, "FirstLineIndent", new Variant(firstLineIndent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLineSpacing() {
		return Dispatch.get(this, "LineSpacing").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lineSpacing an input-parameter of type float
	 */
	public void setLineSpacing(float lineSpacing) {
		Dispatch.put(this, "LineSpacing", new Variant(lineSpacing));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLineSpacingRule() {
		return Dispatch.get(this, "LineSpacingRule").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lineSpacingRule an input-parameter of type int
	 */
	public void setLineSpacingRule(int lineSpacingRule) {
		Dispatch.put(this, "LineSpacingRule", new Variant(lineSpacingRule));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getSpaceBefore() {
		return Dispatch.get(this, "SpaceBefore").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param spaceBefore an input-parameter of type float
	 */
	public void setSpaceBefore(float spaceBefore) {
		Dispatch.put(this, "SpaceBefore", new Variant(spaceBefore));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getSpaceAfter() {
		return Dispatch.get(this, "SpaceAfter").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param spaceAfter an input-parameter of type float
	 */
	public void setSpaceAfter(float spaceAfter) {
		Dispatch.put(this, "SpaceAfter", new Variant(spaceAfter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHyphenation() {
		return Dispatch.get(this, "Hyphenation").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hyphenation an input-parameter of type int
	 */
	public void setHyphenation(int hyphenation) {
		Dispatch.put(this, "Hyphenation", new Variant(hyphenation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getWidowControl() {
		return Dispatch.get(this, "WidowControl").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param widowControl an input-parameter of type int
	 */
	public void setWidowControl(int widowControl) {
		Dispatch.put(this, "WidowControl", new Variant(widowControl));
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
	 * @return the result is of type int
	 */
	public int getFarEastLineBreakControl() {
		return Dispatch.get(this, "FarEastLineBreakControl").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param farEastLineBreakControl an input-parameter of type int
	 */
	public void setFarEastLineBreakControl(int farEastLineBreakControl) {
		Dispatch.put(this, "FarEastLineBreakControl", new Variant(farEastLineBreakControl));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getWordWrap() {
		return Dispatch.get(this, "WordWrap").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param wordWrap an input-parameter of type int
	 */
	public void setWordWrap(int wordWrap) {
		Dispatch.put(this, "WordWrap", new Variant(wordWrap));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHangingPunctuation() {
		return Dispatch.get(this, "HangingPunctuation").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hangingPunctuation an input-parameter of type int
	 */
	public void setHangingPunctuation(int hangingPunctuation) {
		Dispatch.put(this, "HangingPunctuation", new Variant(hangingPunctuation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHalfWidthPunctuationOnTopOfLine() {
		return Dispatch.get(this, "HalfWidthPunctuationOnTopOfLine").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param halfWidthPunctuationOnTopOfLine an input-parameter of type int
	 */
	public void setHalfWidthPunctuationOnTopOfLine(int halfWidthPunctuationOnTopOfLine) {
		Dispatch.put(this, "HalfWidthPunctuationOnTopOfLine", new Variant(halfWidthPunctuationOnTopOfLine));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAddSpaceBetweenFarEastAndAlpha() {
		return Dispatch.get(this, "AddSpaceBetweenFarEastAndAlpha").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param addSpaceBetweenFarEastAndAlpha an input-parameter of type int
	 */
	public void setAddSpaceBetweenFarEastAndAlpha(int addSpaceBetweenFarEastAndAlpha) {
		Dispatch.put(this, "AddSpaceBetweenFarEastAndAlpha", new Variant(addSpaceBetweenFarEastAndAlpha));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAddSpaceBetweenFarEastAndDigit() {
		return Dispatch.get(this, "AddSpaceBetweenFarEastAndDigit").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param addSpaceBetweenFarEastAndDigit an input-parameter of type int
	 */
	public void setAddSpaceBetweenFarEastAndDigit(int addSpaceBetweenFarEastAndDigit) {
		Dispatch.put(this, "AddSpaceBetweenFarEastAndDigit", new Variant(addSpaceBetweenFarEastAndDigit));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBaseLineAlignment() {
		return Dispatch.get(this, "BaseLineAlignment").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param baseLineAlignment an input-parameter of type int
	 */
	public void setBaseLineAlignment(int baseLineAlignment) {
		Dispatch.put(this, "BaseLineAlignment", new Variant(baseLineAlignment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAutoAdjustRightIndent() {
		return Dispatch.get(this, "AutoAdjustRightIndent").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoAdjustRightIndent an input-parameter of type int
	 */
	public void setAutoAdjustRightIndent(int autoAdjustRightIndent) {
		Dispatch.put(this, "AutoAdjustRightIndent", new Variant(autoAdjustRightIndent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDisableLineHeightGrid() {
		return Dispatch.get(this, "DisableLineHeightGrid").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param disableLineHeightGrid an input-parameter of type int
	 */
	public void setDisableLineHeightGrid(int disableLineHeightGrid) {
		Dispatch.put(this, "DisableLineHeightGrid", new Variant(disableLineHeightGrid));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOutlineLevel() {
		return Dispatch.get(this, "OutlineLevel").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outlineLevel an input-parameter of type int
	 */
	public void setOutlineLevel(int outlineLevel) {
		Dispatch.put(this, "OutlineLevel", new Variant(outlineLevel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type Paragraph
	 */
	public Paragraph item(int index) {
		return new Paragraph(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Variant
	 * @return the result is of type Paragraph
	 */
	public Paragraph add(Variant range) {
		return new Paragraph(Dispatch.call(this, "Add", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Paragraph
	 */
	public Paragraph add() {
		return new Paragraph(Dispatch.call(this, "Add").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Variant
	 * @return the result is of type Paragraph
	 */
	public Paragraph add(Variant range) {
		Paragraph result_of_Add = new Paragraph(Dispatch.call(this, "Add", range).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void closeUp() {
		Dispatch.call(this, "CloseUp");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void openUp() {
		Dispatch.call(this, "OpenUp");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void openOrCloseUp() {
		Dispatch.call(this, "OpenOrCloseUp");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param count an input-parameter of type short
	 */
	public void tabHangingIndent(short count) {
		Dispatch.call(this, "TabHangingIndent", new Variant(count));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param count an input-parameter of type short
	 */
	public void tabIndent(short count) {
		Dispatch.call(this, "TabIndent", new Variant(count));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void reset() {
		Dispatch.call(this, "Reset");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void space1() {
		Dispatch.call(this, "Space1");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void space15() {
		Dispatch.call(this, "Space15");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void space2() {
		Dispatch.call(this, "Space2");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param count an input-parameter of type short
	 */
	public void indentCharWidth(short count) {
		Dispatch.call(this, "IndentCharWidth", new Variant(count));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param count an input-parameter of type short
	 */
	public void indentFirstLineCharWidth(short count) {
		Dispatch.call(this, "IndentFirstLineCharWidth", new Variant(count));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void outlinePromote() {
		Dispatch.call(this, "OutlinePromote");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void outlineDemote() {
		Dispatch.call(this, "OutlineDemote");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void outlineDemoteToBody() {
		Dispatch.call(this, "OutlineDemoteToBody");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void indent() {
		Dispatch.call(this, "Indent");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void outdent() {
		Dispatch.call(this, "Outdent");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getCharacterUnitRightIndent() {
		return Dispatch.get(this, "CharacterUnitRightIndent").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param characterUnitRightIndent an input-parameter of type float
	 */
	public void setCharacterUnitRightIndent(float characterUnitRightIndent) {
		Dispatch.put(this, "CharacterUnitRightIndent", new Variant(characterUnitRightIndent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getCharacterUnitLeftIndent() {
		return Dispatch.get(this, "CharacterUnitLeftIndent").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param characterUnitLeftIndent an input-parameter of type float
	 */
	public void setCharacterUnitLeftIndent(float characterUnitLeftIndent) {
		Dispatch.put(this, "CharacterUnitLeftIndent", new Variant(characterUnitLeftIndent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getCharacterUnitFirstLineIndent() {
		return Dispatch.get(this, "CharacterUnitFirstLineIndent").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param characterUnitFirstLineIndent an input-parameter of type float
	 */
	public void setCharacterUnitFirstLineIndent(float characterUnitFirstLineIndent) {
		Dispatch.put(this, "CharacterUnitFirstLineIndent", new Variant(characterUnitFirstLineIndent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLineUnitBefore() {
		return Dispatch.get(this, "LineUnitBefore").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lineUnitBefore an input-parameter of type float
	 */
	public void setLineUnitBefore(float lineUnitBefore) {
		Dispatch.put(this, "LineUnitBefore", new Variant(lineUnitBefore));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLineUnitAfter() {
		return Dispatch.get(this, "LineUnitAfter").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lineUnitAfter an input-parameter of type float
	 */
	public void setLineUnitAfter(float lineUnitAfter) {
		Dispatch.put(this, "LineUnitAfter", new Variant(lineUnitAfter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getReadingOrder() {
		return Dispatch.get(this, "ReadingOrder").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param readingOrder an input-parameter of type int
	 */
	public void setReadingOrder(int readingOrder) {
		Dispatch.put(this, "ReadingOrder", new Variant(readingOrder));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSpaceBeforeAuto() {
		return Dispatch.get(this, "SpaceBeforeAuto").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param spaceBeforeAuto an input-parameter of type int
	 */
	public void setSpaceBeforeAuto(int spaceBeforeAuto) {
		Dispatch.put(this, "SpaceBeforeAuto", new Variant(spaceBeforeAuto));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSpaceAfterAuto() {
		return Dispatch.get(this, "SpaceAfterAuto").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param spaceAfterAuto an input-parameter of type int
	 */
	public void setSpaceAfterAuto(int spaceAfterAuto) {
		Dispatch.put(this, "SpaceAfterAuto", new Variant(spaceAfterAuto));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void increaseSpacing() {
		Dispatch.call(this, "IncreaseSpacing");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void decreaseSpacing() {
		Dispatch.call(this, "DecreaseSpacing");
	}

}
