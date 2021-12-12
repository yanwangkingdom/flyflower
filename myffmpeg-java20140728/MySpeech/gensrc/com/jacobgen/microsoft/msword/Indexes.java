/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Indexes extends Dispatch {

	public static final String componentName = "Word.Indexes";

	public Indexes() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Indexes(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Indexes(String compName) {
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
	 * @return the result is of type Index
	 */
	public Index item(int index) {
		return new Index(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param type an input-parameter of type Variant
	 * @param numberOfColumns an input-parameter of type Variant
	 * @param accentedLetters an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index addOld(Range range, Variant headingSeparator, Variant rightAlignPageNumbers, Variant type, Variant numberOfColumns, Variant accentedLetters) {
		return new Index(Dispatch.call(this, "AddOld", range, headingSeparator, rightAlignPageNumbers, type, numberOfColumns, accentedLetters).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param type an input-parameter of type Variant
	 * @param numberOfColumns an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index addOld(Range range, Variant headingSeparator, Variant rightAlignPageNumbers, Variant type, Variant numberOfColumns) {
		return new Index(Dispatch.call(this, "AddOld", range, headingSeparator, rightAlignPageNumbers, type, numberOfColumns).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param type an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index addOld(Range range, Variant headingSeparator, Variant rightAlignPageNumbers, Variant type) {
		return new Index(Dispatch.call(this, "AddOld", range, headingSeparator, rightAlignPageNumbers, type).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index addOld(Range range, Variant headingSeparator, Variant rightAlignPageNumbers) {
		return new Index(Dispatch.call(this, "AddOld", range, headingSeparator, rightAlignPageNumbers).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index addOld(Range range, Variant headingSeparator) {
		return new Index(Dispatch.call(this, "AddOld", range, headingSeparator).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type Index
	 */
	public Index addOld(Range range) {
		return new Index(Dispatch.call(this, "AddOld", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param type an input-parameter of type Variant
	 * @param numberOfColumns an input-parameter of type Variant
	 * @param accentedLetters an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index addOld(Range range, Variant headingSeparator, Variant rightAlignPageNumbers, Variant type, Variant numberOfColumns, Variant accentedLetters) {
		Index result_of_AddOld = new Index(Dispatch.call(this, "AddOld", range, headingSeparator, rightAlignPageNumbers, type, numberOfColumns, accentedLetters).toDispatch());


		return result_of_AddOld;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param crossReference an input-parameter of type Variant
	 * @param crossReferenceAutoText an input-parameter of type Variant
	 * @param bookmarkName an input-parameter of type Variant
	 * @param bold an input-parameter of type Variant
	 * @param italic an input-parameter of type Variant
	 * @param reading an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range, Variant entry, Variant entryAutoText, Variant crossReference, Variant crossReferenceAutoText, Variant bookmarkName, Variant bold, Variant italic, Variant reading) {
		return new Field(Dispatch.callN(this, "MarkEntry", new Object[] { range, entry, entryAutoText, crossReference, crossReferenceAutoText, bookmarkName, bold, italic, reading}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param crossReference an input-parameter of type Variant
	 * @param crossReferenceAutoText an input-parameter of type Variant
	 * @param bookmarkName an input-parameter of type Variant
	 * @param bold an input-parameter of type Variant
	 * @param italic an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range, Variant entry, Variant entryAutoText, Variant crossReference, Variant crossReferenceAutoText, Variant bookmarkName, Variant bold, Variant italic) {
		return new Field(Dispatch.call(this, "MarkEntry", range, entry, entryAutoText, crossReference, crossReferenceAutoText, bookmarkName, bold, italic).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param crossReference an input-parameter of type Variant
	 * @param crossReferenceAutoText an input-parameter of type Variant
	 * @param bookmarkName an input-parameter of type Variant
	 * @param bold an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range, Variant entry, Variant entryAutoText, Variant crossReference, Variant crossReferenceAutoText, Variant bookmarkName, Variant bold) {
		return new Field(Dispatch.call(this, "MarkEntry", range, entry, entryAutoText, crossReference, crossReferenceAutoText, bookmarkName, bold).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param crossReference an input-parameter of type Variant
	 * @param crossReferenceAutoText an input-parameter of type Variant
	 * @param bookmarkName an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range, Variant entry, Variant entryAutoText, Variant crossReference, Variant crossReferenceAutoText, Variant bookmarkName) {
		return new Field(Dispatch.call(this, "MarkEntry", range, entry, entryAutoText, crossReference, crossReferenceAutoText, bookmarkName).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param crossReference an input-parameter of type Variant
	 * @param crossReferenceAutoText an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range, Variant entry, Variant entryAutoText, Variant crossReference, Variant crossReferenceAutoText) {
		return new Field(Dispatch.call(this, "MarkEntry", range, entry, entryAutoText, crossReference, crossReferenceAutoText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param crossReference an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range, Variant entry, Variant entryAutoText, Variant crossReference) {
		return new Field(Dispatch.call(this, "MarkEntry", range, entry, entryAutoText, crossReference).toDispatch());
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
	 * @param crossReference an input-parameter of type Variant
	 * @param crossReferenceAutoText an input-parameter of type Variant
	 * @param bookmarkName an input-parameter of type Variant
	 * @param bold an input-parameter of type Variant
	 * @param italic an input-parameter of type Variant
	 * @param reading an input-parameter of type Variant
	 * @return the result is of type Field
	 */
	public Field markEntry(Range range, Variant entry, Variant entryAutoText, Variant crossReference, Variant crossReferenceAutoText, Variant bookmarkName, Variant bold, Variant italic, Variant reading) {
		Field result_of_MarkEntry = new Field(Dispatch.callN(this, "MarkEntry", new Object[] { range, entry, entryAutoText, crossReference, crossReferenceAutoText, bookmarkName, bold, italic, reading}).toDispatch());


		return result_of_MarkEntry;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param crossReference an input-parameter of type Variant
	 * @param crossReferenceAutoText an input-parameter of type Variant
	 * @param bookmarkName an input-parameter of type Variant
	 * @param bold an input-parameter of type Variant
	 * @param italic an input-parameter of type Variant
	 */
	public void markAllEntries(Range range, Variant entry, Variant entryAutoText, Variant crossReference, Variant crossReferenceAutoText, Variant bookmarkName, Variant bold, Variant italic) {
		Dispatch.call(this, "MarkAllEntries", range, entry, entryAutoText, crossReference, crossReferenceAutoText, bookmarkName, bold, italic);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param crossReference an input-parameter of type Variant
	 * @param crossReferenceAutoText an input-parameter of type Variant
	 * @param bookmarkName an input-parameter of type Variant
	 * @param bold an input-parameter of type Variant
	 */
	public void markAllEntries(Range range, Variant entry, Variant entryAutoText, Variant crossReference, Variant crossReferenceAutoText, Variant bookmarkName, Variant bold) {
		Dispatch.call(this, "MarkAllEntries", range, entry, entryAutoText, crossReference, crossReferenceAutoText, bookmarkName, bold);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param crossReference an input-parameter of type Variant
	 * @param crossReferenceAutoText an input-parameter of type Variant
	 * @param bookmarkName an input-parameter of type Variant
	 */
	public void markAllEntries(Range range, Variant entry, Variant entryAutoText, Variant crossReference, Variant crossReferenceAutoText, Variant bookmarkName) {
		Dispatch.call(this, "MarkAllEntries", range, entry, entryAutoText, crossReference, crossReferenceAutoText, bookmarkName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param crossReference an input-parameter of type Variant
	 * @param crossReferenceAutoText an input-parameter of type Variant
	 */
	public void markAllEntries(Range range, Variant entry, Variant entryAutoText, Variant crossReference, Variant crossReferenceAutoText) {
		Dispatch.call(this, "MarkAllEntries", range, entry, entryAutoText, crossReference, crossReferenceAutoText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param crossReference an input-parameter of type Variant
	 */
	public void markAllEntries(Range range, Variant entry, Variant entryAutoText, Variant crossReference) {
		Dispatch.call(this, "MarkAllEntries", range, entry, entryAutoText, crossReference);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 */
	public void markAllEntries(Range range, Variant entry, Variant entryAutoText) {
		Dispatch.call(this, "MarkAllEntries", range, entry, entryAutoText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 */
	public void markAllEntries(Range range, Variant entry) {
		Dispatch.call(this, "MarkAllEntries", range, entry);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 */
	public void markAllEntries(Range range) {
		Dispatch.call(this, "MarkAllEntries", range);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param entry an input-parameter of type Variant
	 * @param entryAutoText an input-parameter of type Variant
	 * @param crossReference an input-parameter of type Variant
	 * @param crossReferenceAutoText an input-parameter of type Variant
	 * @param bookmarkName an input-parameter of type Variant
	 * @param bold an input-parameter of type Variant
	 * @param italic an input-parameter of type Variant
	 */
	public void markAllEntries(Range range, Variant entry, Variant entryAutoText, Variant crossReference, Variant crossReferenceAutoText, Variant bookmarkName, Variant bold, Variant italic) {
		Dispatch.call(this, "MarkAllEntries", range, entry, entryAutoText, crossReference, crossReferenceAutoText, bookmarkName, bold, italic);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param concordanceFileName an input-parameter of type String
	 */
	public void autoMarkEntries(String concordanceFileName) {
		Dispatch.call(this, "AutoMarkEntries", concordanceFileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param type an input-parameter of type Variant
	 * @param numberOfColumns an input-parameter of type Variant
	 * @param accentedLetters an input-parameter of type Variant
	 * @param sortBy an input-parameter of type Variant
	 * @param indexLanguage an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index add(Range range, Variant headingSeparator, Variant rightAlignPageNumbers, Variant type, Variant numberOfColumns, Variant accentedLetters, Variant sortBy, Variant indexLanguage) {
		return new Index(Dispatch.call(this, "Add", range, headingSeparator, rightAlignPageNumbers, type, numberOfColumns, accentedLetters, sortBy, indexLanguage).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param type an input-parameter of type Variant
	 * @param numberOfColumns an input-parameter of type Variant
	 * @param accentedLetters an input-parameter of type Variant
	 * @param sortBy an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index add(Range range, Variant headingSeparator, Variant rightAlignPageNumbers, Variant type, Variant numberOfColumns, Variant accentedLetters, Variant sortBy) {
		return new Index(Dispatch.call(this, "Add", range, headingSeparator, rightAlignPageNumbers, type, numberOfColumns, accentedLetters, sortBy).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param type an input-parameter of type Variant
	 * @param numberOfColumns an input-parameter of type Variant
	 * @param accentedLetters an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index add(Range range, Variant headingSeparator, Variant rightAlignPageNumbers, Variant type, Variant numberOfColumns, Variant accentedLetters) {
		return new Index(Dispatch.call(this, "Add", range, headingSeparator, rightAlignPageNumbers, type, numberOfColumns, accentedLetters).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param type an input-parameter of type Variant
	 * @param numberOfColumns an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index add(Range range, Variant headingSeparator, Variant rightAlignPageNumbers, Variant type, Variant numberOfColumns) {
		return new Index(Dispatch.call(this, "Add", range, headingSeparator, rightAlignPageNumbers, type, numberOfColumns).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param type an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index add(Range range, Variant headingSeparator, Variant rightAlignPageNumbers, Variant type) {
		return new Index(Dispatch.call(this, "Add", range, headingSeparator, rightAlignPageNumbers, type).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index add(Range range, Variant headingSeparator, Variant rightAlignPageNumbers) {
		return new Index(Dispatch.call(this, "Add", range, headingSeparator, rightAlignPageNumbers).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index add(Range range, Variant headingSeparator) {
		return new Index(Dispatch.call(this, "Add", range, headingSeparator).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type Index
	 */
	public Index add(Range range) {
		return new Index(Dispatch.call(this, "Add", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param headingSeparator an input-parameter of type Variant
	 * @param rightAlignPageNumbers an input-parameter of type Variant
	 * @param type an input-parameter of type Variant
	 * @param numberOfColumns an input-parameter of type Variant
	 * @param accentedLetters an input-parameter of type Variant
	 * @param sortBy an input-parameter of type Variant
	 * @param indexLanguage an input-parameter of type Variant
	 * @return the result is of type Index
	 */
	public Index add(Range range, Variant headingSeparator, Variant rightAlignPageNumbers, Variant type, Variant numberOfColumns, Variant accentedLetters, Variant sortBy, Variant indexLanguage) {
		Index result_of_Add = new Index(Dispatch.call(this, "Add", range, headingSeparator, rightAlignPageNumbers, type, numberOfColumns, accentedLetters, sortBy, indexLanguage).toDispatch());


		return result_of_Add;
	}

}
