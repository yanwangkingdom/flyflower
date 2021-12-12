/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class TablesOfAuthorities extends Dispatch {

	public static final String componentName = "Word.TablesOfAuthorities";

	public TablesOfAuthorities() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public TablesOfAuthorities(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public TablesOfAuthorities(String compName) {
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
	public int getFormat() {
		return Dispatch.get(this, "Format").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param format an input-parameter of type int
	 */
	public void setFormat(int format) {
		Dispatch.put(this, "Format", new Variant(format));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities item(int index) {
		return new TableOfAuthorities(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param category an input-parameter of type Variant
	 * @param bookmark an input-parameter of type Variant
	 * @param passim an input-parameter of type Variant
	 * @param keepEntryFormatting an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param includeSequenceName an input-parameter of type Variant
	 * @param entrySeparator an input-parameter of type Variant
	 * @param pageRangeSeparator an input-parameter of type Variant
	 * @param includeCategoryHeader an input-parameter of type Variant
	 * @param pageNumberSeparator an input-parameter of type Variant
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities add(Range range, Variant category, Variant bookmark, Variant passim, Variant keepEntryFormatting, Variant separator, Variant includeSequenceName, Variant entrySeparator, Variant pageRangeSeparator, Variant includeCategoryHeader, Variant pageNumberSeparator) {
		return new TableOfAuthorities(Dispatch.callN(this, "Add", new Object[] { range, category, bookmark, passim, keepEntryFormatting, separator, includeSequenceName, entrySeparator, pageRangeSeparator, includeCategoryHeader, pageNumberSeparator}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param category an input-parameter of type Variant
	 * @param bookmark an input-parameter of type Variant
	 * @param passim an input-parameter of type Variant
	 * @param keepEntryFormatting an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param includeSequenceName an input-parameter of type Variant
	 * @param entrySeparator an input-parameter of type Variant
	 * @param pageRangeSeparator an input-parameter of type Variant
	 * @param includeCategoryHeader an input-parameter of type Variant
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities add(Range range, Variant category, Variant bookmark, Variant passim, Variant keepEntryFormatting, Variant separator, Variant includeSequenceName, Variant entrySeparator, Variant pageRangeSeparator, Variant includeCategoryHeader) {
		return new TableOfAuthorities(Dispatch.callN(this, "Add", new Object[] { range, category, bookmark, passim, keepEntryFormatting, separator, includeSequenceName, entrySeparator, pageRangeSeparator, includeCategoryHeader}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param category an input-parameter of type Variant
	 * @param bookmark an input-parameter of type Variant
	 * @param passim an input-parameter of type Variant
	 * @param keepEntryFormatting an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param includeSequenceName an input-parameter of type Variant
	 * @param entrySeparator an input-parameter of type Variant
	 * @param pageRangeSeparator an input-parameter of type Variant
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities add(Range range, Variant category, Variant bookmark, Variant passim, Variant keepEntryFormatting, Variant separator, Variant includeSequenceName, Variant entrySeparator, Variant pageRangeSeparator) {
		return new TableOfAuthorities(Dispatch.callN(this, "Add", new Object[] { range, category, bookmark, passim, keepEntryFormatting, separator, includeSequenceName, entrySeparator, pageRangeSeparator}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param category an input-parameter of type Variant
	 * @param bookmark an input-parameter of type Variant
	 * @param passim an input-parameter of type Variant
	 * @param keepEntryFormatting an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param includeSequenceName an input-parameter of type Variant
	 * @param entrySeparator an input-parameter of type Variant
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities add(Range range, Variant category, Variant bookmark, Variant passim, Variant keepEntryFormatting, Variant separator, Variant includeSequenceName, Variant entrySeparator) {
		return new TableOfAuthorities(Dispatch.call(this, "Add", range, category, bookmark, passim, keepEntryFormatting, separator, includeSequenceName, entrySeparator).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param category an input-parameter of type Variant
	 * @param bookmark an input-parameter of type Variant
	 * @param passim an input-parameter of type Variant
	 * @param keepEntryFormatting an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param includeSequenceName an input-parameter of type Variant
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities add(Range range, Variant category, Variant bookmark, Variant passim, Variant keepEntryFormatting, Variant separator, Variant includeSequenceName) {
		return new TableOfAuthorities(Dispatch.call(this, "Add", range, category, bookmark, passim, keepEntryFormatting, separator, includeSequenceName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param category an input-parameter of type Variant
	 * @param bookmark an input-parameter of type Variant
	 * @param passim an input-parameter of type Variant
	 * @param keepEntryFormatting an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities add(Range range, Variant category, Variant bookmark, Variant passim, Variant keepEntryFormatting, Variant separator) {
		return new TableOfAuthorities(Dispatch.call(this, "Add", range, category, bookmark, passim, keepEntryFormatting, separator).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param category an input-parameter of type Variant
	 * @param bookmark an input-parameter of type Variant
	 * @param passim an input-parameter of type Variant
	 * @param keepEntryFormatting an input-parameter of type Variant
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities add(Range range, Variant category, Variant bookmark, Variant passim, Variant keepEntryFormatting) {
		return new TableOfAuthorities(Dispatch.call(this, "Add", range, category, bookmark, passim, keepEntryFormatting).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param category an input-parameter of type Variant
	 * @param bookmark an input-parameter of type Variant
	 * @param passim an input-parameter of type Variant
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities add(Range range, Variant category, Variant bookmark, Variant passim) {
		return new TableOfAuthorities(Dispatch.call(this, "Add", range, category, bookmark, passim).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param category an input-parameter of type Variant
	 * @param bookmark an input-parameter of type Variant
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities add(Range range, Variant category, Variant bookmark) {
		return new TableOfAuthorities(Dispatch.call(this, "Add", range, category, bookmark).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param category an input-parameter of type Variant
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities add(Range range, Variant category) {
		return new TableOfAuthorities(Dispatch.call(this, "Add", range, category).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities add(Range range) {
		return new TableOfAuthorities(Dispatch.call(this, "Add", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param category an input-parameter of type Variant
	 * @param bookmark an input-parameter of type Variant
	 * @param passim an input-parameter of type Variant
	 * @param keepEntryFormatting an input-parameter of type Variant
	 * @param separator an input-parameter of type Variant
	 * @param includeSequenceName an input-parameter of type Variant
	 * @param entrySeparator an input-parameter of type Variant
	 * @param pageRangeSeparator an input-parameter of type Variant
	 * @param includeCategoryHeader an input-parameter of type Variant
	 * @param pageNumberSeparator an input-parameter of type Variant
	 * @return the result is of type TableOfAuthorities
	 */
	public TableOfAuthorities add(Range range, Variant category, Variant bookmark, Variant passim, Variant keepEntryFormatting, Variant separator, Variant includeSequenceName, Variant entrySeparator, Variant pageRangeSeparator, Variant includeCategoryHeader, Variant pageNumberSeparator) {
		TableOfAuthorities result_of_Add = new TableOfAuthorities(Dispatch.callN(this, "Add", new Object[] { range, category, bookmark, passim, keepEntryFormatting, separator, includeSequenceName, entrySeparator, pageRangeSeparator, includeCategoryHeader, pageNumberSeparator}).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shortCitation an input-parameter of type String
	 */
	public void nextCitation(String shortCitation) {
		Dispatch.call(this, "NextCitation", shortCitation);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param shortCitation an input-parameter of type String
	 * @param longCitation an input-parameter of type Variant
	 * @param longCitationAutoText an input-parameter of type Variant
	 * @param category an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markCitation(Range range, String shortCitation, Variant longCitation, Variant longCitationAutoText, Variant category) {
		return new Field(Dispatch.call(this, "MarkCitation", range, shortCitation, longCitation, longCitationAutoText, category).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param shortCitation an input-parameter of type String
	 * @param longCitation an input-parameter of type Variant
	 * @param longCitationAutoText an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markCitation(Range range, String shortCitation, Variant longCitation, Variant longCitationAutoText) {
		return new Field(Dispatch.call(this, "MarkCitation", range, shortCitation, longCitation, longCitationAutoText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param shortCitation an input-parameter of type String
	 * @param longCitation an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markCitation(Range range, String shortCitation, Variant longCitation) {
		return new Field(Dispatch.call(this, "MarkCitation", range, shortCitation, longCitation).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param shortCitation an input-parameter of type String
	 * @return the result is of type Field
	 */
	public Field markCitation(Range range, String shortCitation) {
		return new Field(Dispatch.call(this, "MarkCitation", range, shortCitation).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param shortCitation an input-parameter of type String
	 * @param longCitation an input-parameter of type Variant
	 * @param longCitationAutoText an input-parameter of type Variant
	 * @param category an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markCitation(Range range, String shortCitation, Variant longCitation, Variant longCitationAutoText, Variant category) {
		Field result_of_MarkCitation = new Field(Dispatch.call(this, "MarkCitation", range, shortCitation, longCitation, longCitationAutoText, category).toDispatch());


		return result_of_MarkCitation;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shortCitation an input-parameter of type String
	 * @param longCitation an input-parameter of type Variant
	 * @param longCitationAutoText an input-parameter of type Variant
	 * @param category an input-parameter of type Variant
	 */
	public void markAllCitations(String shortCitation, Variant longCitation, Variant longCitationAutoText, Variant category) {
		Dispatch.call(this, "MarkAllCitations", shortCitation, longCitation, longCitationAutoText, category);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shortCitation an input-parameter of type String
	 * @param longCitation an input-parameter of type Variant
	 * @param longCitationAutoText an input-parameter of type Variant
	 */
	public void markAllCitations(String shortCitation, Variant longCitation, Variant longCitationAutoText) {
		Dispatch.call(this, "MarkAllCitations", shortCitation, longCitation, longCitationAutoText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shortCitation an input-parameter of type String
	 * @param longCitation an input-parameter of type Variant
	 */
	public void markAllCitations(String shortCitation, Variant longCitation) {
		Dispatch.call(this, "MarkAllCitations", shortCitation, longCitation);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shortCitation an input-parameter of type String
	 */
	public void markAllCitations(String shortCitation) {
		Dispatch.call(this, "MarkAllCitations", shortCitation);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param shortCitation an input-parameter of type String
	 * @param longCitation an input-parameter of type Variant
	 * @param longCitationAutoText an input-parameter of type Variant
	 * @param category an input-parameter of type Variant
	 */
	public void markAllCitations(String shortCitation, Variant longCitation, Variant longCitationAutoText, Variant category) {
		Dispatch.call(this, "MarkAllCitations", shortCitation, longCitation, longCitationAutoText, category);

	}

}
