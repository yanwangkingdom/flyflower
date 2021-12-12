/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Column extends Dispatch {

	public static final String componentName = "Word.Column";

	public Column() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Column(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Column(String compName) {
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
	public float getWidth() {
		return Dispatch.get(this, "Width").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param width an input-parameter of type float
	 */
	public void setWidth(float width) {
		Dispatch.put(this, "Width", new Variant(width));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIsFirst() {
		return Dispatch.get(this, "IsFirst").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIsLast() {
		return Dispatch.get(this, "IsLast").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getIndex() {
		return Dispatch.get(this, "Index").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type Column
	 */
	public Column getNext() {
		return new Column(Dispatch.get(this, "Next").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Column
	 */
	public Column getPrevious() {
		return new Column(Dispatch.get(this, "Previous").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void select() {
		Dispatch.call(this, "Select");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param columnWidth an input-parameter of type float
	 * @param rulerStyle an input-parameter of type int
	 */
	public void setWidth(float columnWidth, int rulerStyle) {
		Dispatch.call(this, "SetWidth", new Variant(columnWidth), new Variant(rulerStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void autoFit() {
		Dispatch.call(this, "AutoFit");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param languageID an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant languageID) {
		Dispatch.call(this, "SortOld", excludeHeader, sortFieldType, sortOrder, caseSensitive, languageID);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant sortFieldType, Variant sortOrder, Variant caseSensitive) {
		Dispatch.call(this, "SortOld", excludeHeader, sortFieldType, sortOrder, caseSensitive);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant sortFieldType, Variant sortOrder) {
		Dispatch.call(this, "SortOld", excludeHeader, sortFieldType, sortOrder);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant sortFieldType) {
		Dispatch.call(this, "SortOld", excludeHeader, sortFieldType);
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
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param languageID an input-parameter of type Variant
	 */
	public void sortOld(Variant excludeHeader, Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant languageID) {
		Dispatch.call(this, "SortOld", excludeHeader, sortFieldType, sortOrder, caseSensitive, languageID);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
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
	public void sort(Variant excludeHeader, Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, sortFieldType, sortOrder, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 * @param ignoreHe an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, sortFieldType, sortOrder, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 * @param ignoreDiacritics an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics) {
		Dispatch.call(this, "Sort", excludeHeader, sortFieldType, sortOrder, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 * @param ignoreKashida an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida) {
		Dispatch.call(this, "Sort", excludeHeader, sortFieldType, sortOrder, caseSensitive, bidiSort, ignoreThe, ignoreKashida);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 * @param ignoreThe an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort, Variant ignoreThe) {
		Dispatch.call(this, "Sort", excludeHeader, sortFieldType, sortOrder, caseSensitive, bidiSort, ignoreThe);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 * @param bidiSort an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort) {
		Dispatch.call(this, "Sort", excludeHeader, sortFieldType, sortOrder, caseSensitive, bidiSort);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 * @param caseSensitive an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant sortFieldType, Variant sortOrder, Variant caseSensitive) {
		Dispatch.call(this, "Sort", excludeHeader, sortFieldType, sortOrder, caseSensitive);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 * @param sortOrder an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant sortFieldType, Variant sortOrder) {
		Dispatch.call(this, "Sort", excludeHeader, sortFieldType, sortOrder);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param excludeHeader an input-parameter of type Variant
	 * @param sortFieldType an input-parameter of type Variant
	 */
	public void sort(Variant excludeHeader, Variant sortFieldType) {
		Dispatch.call(this, "Sort", excludeHeader, sortFieldType);
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
	public void sort(Variant excludeHeader, Variant sortFieldType, Variant sortOrder, Variant caseSensitive, Variant bidiSort, Variant ignoreThe, Variant ignoreKashida, Variant ignoreDiacritics, Variant ignoreHe, Variant languageID) {
		Dispatch.callN(this, "Sort", new Object[] { excludeHeader, sortFieldType, sortOrder, caseSensitive, bidiSort, ignoreThe, ignoreKashida, ignoreDiacritics, ignoreHe, languageID});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNestingLevel() {
		return Dispatch.get(this, "NestingLevel").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getPreferredWidth() {
		return Dispatch.get(this, "PreferredWidth").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param preferredWidth an input-parameter of type float
	 */
	public void setPreferredWidth(float preferredWidth) {
		Dispatch.put(this, "PreferredWidth", new Variant(preferredWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPreferredWidthType() {
		return Dispatch.get(this, "PreferredWidthType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param preferredWidthType an input-parameter of type int
	 */
	public void setPreferredWidthType(int preferredWidthType) {
		Dispatch.put(this, "PreferredWidthType", new Variant(preferredWidthType));
	}

}
