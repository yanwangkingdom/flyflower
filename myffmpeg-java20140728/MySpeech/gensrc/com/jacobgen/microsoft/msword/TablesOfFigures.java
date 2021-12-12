/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class TablesOfFigures extends Dispatch {

	public static final String componentName = "Word.TablesOfFigures";

	public TablesOfFigures() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public TablesOfFigures(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public TablesOfFigures(String compName) {
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
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures item(int index) {
		return new TableOfFigures(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param includePageNumbers an input-parameter of type Variant
	 * @param addedStyles an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures addOld(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields, Variant tableID, Variant rightAlignPageNumbers, Variant includePageNumbers, Variant addedStyles) {
		return new TableOfFigures(Dispatch.callN(this, "AddOld", new Object[] { range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields, tableID, rightAlignPageNumbers, includePageNumbers, addedStyles}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param includePageNumbers an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures addOld(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields, Variant tableID, Variant rightAlignPageNumbers, Variant includePageNumbers) {
		return new TableOfFigures(Dispatch.callN(this, "AddOld", new Object[] { range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields, tableID, rightAlignPageNumbers, includePageNumbers}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures addOld(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields, Variant tableID, Variant rightAlignPageNumbers) {
		return new TableOfFigures(Dispatch.callN(this, "AddOld", new Object[] { range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields, tableID, rightAlignPageNumbers}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures addOld(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields, Variant tableID) {
		return new TableOfFigures(Dispatch.call(this, "AddOld", range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields, tableID).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures addOld(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields) {
		return new TableOfFigures(Dispatch.call(this, "AddOld", range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures addOld(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel) {
		return new TableOfFigures(Dispatch.call(this, "AddOld", range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures addOld(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel) {
		return new TableOfFigures(Dispatch.call(this, "AddOld", range, caption, includeLabel, useHeadingStyles, upperHeadingLevel).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures addOld(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles) {
		return new TableOfFigures(Dispatch.call(this, "AddOld", range, caption, includeLabel, useHeadingStyles).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures addOld(Range range, Variant caption, Variant includeLabel) {
		return new TableOfFigures(Dispatch.call(this, "AddOld", range, caption, includeLabel).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures addOld(Range range, Variant caption) {
		return new TableOfFigures(Dispatch.call(this, "AddOld", range, caption).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures addOld(Range range) {
		return new TableOfFigures(Dispatch.call(this, "AddOld", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param includePageNumbers an input-parameter of type Variant
	 * @param addedStyles an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures addOld(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields, Variant tableID, Variant rightAlignPageNumbers, Variant includePageNumbers, Variant addedStyles) {
		TableOfFigures result_of_AddOld = new TableOfFigures(Dispatch.callN(this, "AddOld", new Object[] { range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields, tableID, rightAlignPageNumbers, includePageNumbers, addedStyles}).toDispatch());


		return result_of_AddOld;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @param level an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range, Variant entry, Variant entryAutoText, Variant tableID, Variant level) {
		return new Field(Dispatch.call(this, "MarkEntry", range, entry, entryAutoText, tableID, level).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range, Variant entry, Variant entryAutoText, Variant tableID) {
		return new Field(Dispatch.call(this, "MarkEntry", range, entry, entryAutoText, tableID).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range, Variant entry, Variant entryAutoText) {
		return new Field(Dispatch.call(this, "MarkEntry", range, entry, entryAutoText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range, Variant entry) {
		return new Field(Dispatch.call(this, "MarkEntry", range, entry).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range) {
		return new Field(Dispatch.call(this, "MarkEntry", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @param level an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range, Variant entry, Variant entryAutoText, Variant tableID, Variant level) {
		Field result_of_MarkEntry = new Field(Dispatch.call(this, "MarkEntry", range, entry, entryAutoText, tableID, level).toDispatch());


		return result_of_MarkEntry;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param includePageNumbers an input-parameter of type Variant
	 * @param addedStyles an input-parameter of type Variant
	 * @param useHyperlinks an input-parameter of type Variant
	 * @param hidePageNumbersInWeb an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields, Variant tableID, Variant rightAlignPageNumbers, Variant includePageNumbers, Variant addedStyles, Variant useHyperlinks, Variant hidePageNumbersInWeb) {
		return new TableOfFigures(Dispatch.callN(this, "Add", new Object[] { range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields, tableID, rightAlignPageNumbers, includePageNumbers, addedStyles, useHyperlinks, hidePageNumbersInWeb}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param includePageNumbers an input-parameter of type Variant
	 * @param addedStyles an input-parameter of type Variant
	 * @param useHyperlinks an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields, Variant tableID, Variant rightAlignPageNumbers, Variant includePageNumbers, Variant addedStyles, Variant useHyperlinks) {
		return new TableOfFigures(Dispatch.callN(this, "Add", new Object[] { range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields, tableID, rightAlignPageNumbers, includePageNumbers, addedStyles, useHyperlinks}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param includePageNumbers an input-parameter of type Variant
	 * @param addedStyles an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields, Variant tableID, Variant rightAlignPageNumbers, Variant includePageNumbers, Variant addedStyles) {
		return new TableOfFigures(Dispatch.callN(this, "Add", new Object[] { range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields, tableID, rightAlignPageNumbers, includePageNumbers, addedStyles}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param includePageNumbers an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields, Variant tableID, Variant rightAlignPageNumbers, Variant includePageNumbers) {
		return new TableOfFigures(Dispatch.callN(this, "Add", new Object[] { range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields, tableID, rightAlignPageNumbers, includePageNumbers}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields, Variant tableID, Variant rightAlignPageNumbers) {
		return new TableOfFigures(Dispatch.callN(this, "Add", new Object[] { range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields, tableID, rightAlignPageNumbers}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields, Variant tableID) {
		return new TableOfFigures(Dispatch.call(this, "Add", range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields, tableID).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields) {
		return new TableOfFigures(Dispatch.call(this, "Add", range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel) {
		return new TableOfFigures(Dispatch.call(this, "Add", range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel) {
		return new TableOfFigures(Dispatch.call(this, "Add", range, caption, includeLabel, useHeadingStyles, upperHeadingLevel).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles) {
		return new TableOfFigures(Dispatch.call(this, "Add", range, caption, includeLabel, useHeadingStyles).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption, Variant includeLabel) {
		return new TableOfFigures(Dispatch.call(this, "Add", range, caption, includeLabel).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption) {
		return new TableOfFigures(Dispatch.call(this, "Add", range, caption).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range) {
		return new TableOfFigures(Dispatch.call(this, "Add", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param caption an input-parameter of type Variant
	 * @param includeLabel an input-parameter of type Variant
	 * @param useHeadingStyles an input-parameter of type Variant
	 * @param upperHeadingLevel an input-parameter of type Variant
	 * @param lowerHeadingLevel an input-parameter of type Variant
	 * @param useFields an input-parameter of type Variant
	 * @param tableID an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param includePageNumbers an input-parameter of type Variant
	 * @param addedStyles an input-parameter of type Variant
	 * @param useHyperlinks an input-parameter of type Variant
	 * @param hidePageNumbersInWeb an input-parameter of type Variant
	 * @return the result is of type TableOfFigures
	 */
	public TableOfFigures add(Range range, Variant caption, Variant includeLabel, Variant useHeadingStyles, Variant upperHeadingLevel, Variant lowerHeadingLevel, Variant useFields, Variant tableID, Variant rightAlignPageNumbers, Variant includePageNumbers, Variant addedStyles, Variant useHyperlinks, Variant hidePageNumbersInWeb) {
		TableOfFigures result_of_Add = new TableOfFigures(Dispatch.callN(this, "Add", new Object[] { range, caption, includeLabel, useHeadingStyles, upperHeadingLevel, lowerHeadingLevel, useFields, tableID, rightAlignPageNumbers, includePageNumbers, addedStyles, useHyperlinks, hidePageNumbersInWeb}).toDispatch());


		return result_of_Add;
	}

}
