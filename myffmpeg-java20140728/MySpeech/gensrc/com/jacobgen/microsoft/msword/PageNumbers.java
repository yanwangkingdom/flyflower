/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class PageNumbers extends Dispatch {

	public static final String componentName = "Word.PageNumbers";

	public PageNumbers() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public PageNumbers(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public PageNumbers(String compName) {
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
	 * @return the result is of type int
	 */
	public int getNumberStyle() {
		return Dispatch.get(this, "NumberStyle").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberStyle an input-parameter of type int
	 */
	public void setNumberStyle(int numberStyle) {
		Dispatch.put(this, "NumberStyle", new Variant(numberStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIncludeChapterNumber() {
		return Dispatch.get(this, "IncludeChapterNumber").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param includeChapterNumber an input-parameter of type boolean
	 */
	public void setIncludeChapterNumber(boolean includeChapterNumber) {
		Dispatch.put(this, "IncludeChapterNumber", new Variant(includeChapterNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHeadingLevelForChapter() {
		return Dispatch.get(this, "HeadingLevelForChapter").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param headingLevelForChapter an input-parameter of type int
	 */
	public void setHeadingLevelForChapter(int headingLevelForChapter) {
		Dispatch.put(this, "HeadingLevelForChapter", new Variant(headingLevelForChapter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getChapterPageSeparator() {
		return Dispatch.get(this, "ChapterPageSeparator").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param chapterPageSeparator an input-parameter of type int
	 */
	public void setChapterPageSeparator(int chapterPageSeparator) {
		Dispatch.put(this, "ChapterPageSeparator", new Variant(chapterPageSeparator));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getRestartNumberingAtSection() {
		return Dispatch.get(this, "RestartNumberingAtSection").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param restartNumberingAtSection an input-parameter of type boolean
	 */
	public void setRestartNumberingAtSection(boolean restartNumberingAtSection) {
		Dispatch.put(this, "RestartNumberingAtSection", new Variant(restartNumberingAtSection));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getStartingNumber() {
		return Dispatch.get(this, "StartingNumber").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startingNumber an input-parameter of type int
	 */
	public void setStartingNumber(int startingNumber) {
		Dispatch.put(this, "StartingNumber", new Variant(startingNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowFirstPageNumber() {
		return Dispatch.get(this, "ShowFirstPageNumber").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showFirstPageNumber an input-parameter of type boolean
	 */
	public void setShowFirstPageNumber(boolean showFirstPageNumber) {
		Dispatch.put(this, "ShowFirstPageNumber", new Variant(showFirstPageNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type PageNumber
	 */
	public PageNumber item(int index) {
		return new PageNumber(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pageNumberAlignment an input-parameter of type Variant
	 * @param firstPage an input-parameter of type Variant
	 * @return the result is of type PageNumber
	 */
	public PageNumber add(Variant pageNumberAlignment, Variant firstPage) {
		return new PageNumber(Dispatch.call(this, "Add", pageNumberAlignment, firstPage).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pageNumberAlignment an input-parameter of type Variant
	 * @return the result is of type PageNumber
	 */
	public PageNumber add(Variant pageNumberAlignment) {
		return new PageNumber(Dispatch.call(this, "Add", pageNumberAlignment).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type PageNumber
	 */
	public PageNumber add() {
		return new PageNumber(Dispatch.call(this, "Add").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param pageNumberAlignment an input-parameter of type Variant
	 * @param firstPage an input-parameter of type Variant
	 * @return the result is of type PageNumber
	 */
	public PageNumber add(Variant pageNumberAlignment, Variant firstPage) {
		PageNumber result_of_Add = new PageNumber(Dispatch.call(this, "Add", pageNumberAlignment, firstPage).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDoubleQuote() {
		return Dispatch.get(this, "DoubleQuote").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doubleQuote an input-parameter of type boolean
	 */
	public void setDoubleQuote(boolean doubleQuote) {
		Dispatch.put(this, "DoubleQuote", new Variant(doubleQuote));
	}

}
