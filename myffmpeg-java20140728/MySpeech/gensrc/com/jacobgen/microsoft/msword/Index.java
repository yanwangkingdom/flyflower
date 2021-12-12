/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Index extends Dispatch {

	public static final String componentName = "Word.Index";

	public Index() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Index(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Index(String compName) {
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
	public int getHeadingSeparator() {
		return Dispatch.get(this, "HeadingSeparator").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param headingSeparator an input-parameter of type int
	 */
	public void setHeadingSeparator(int headingSeparator) {
		Dispatch.put(this, "HeadingSeparator", new Variant(headingSeparator));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getRightAlignPageNumbers() {
		return Dispatch.get(this, "RightAlignPageNumbers").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rightAlignPageNumbers an input-parameter of type boolean
	 */
	public void setRightAlignPageNumbers(boolean rightAlignPageNumbers) {
		Dispatch.put(this, "RightAlignPageNumbers", new Variant(rightAlignPageNumbers));
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
	 * @return the result is of type int
	 */
	public int getNumberOfColumns() {
		return Dispatch.get(this, "NumberOfColumns").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberOfColumns an input-parameter of type int
	 */
	public void setNumberOfColumns(int numberOfColumns) {
		Dispatch.put(this, "NumberOfColumns", new Variant(numberOfColumns));
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
	 * @return the result is of type int
	 */
	public int getTabLeader() {
		return Dispatch.get(this, "TabLeader").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tabLeader an input-parameter of type int
	 */
	public void setTabLeader(int tabLeader) {
		Dispatch.put(this, "TabLeader", new Variant(tabLeader));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAccentedLetters() {
		return Dispatch.get(this, "AccentedLetters").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param accentedLetters an input-parameter of type boolean
	 */
	public void setAccentedLetters(boolean accentedLetters) {
		Dispatch.put(this, "AccentedLetters", new Variant(accentedLetters));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSortBy() {
		return Dispatch.get(this, "SortBy").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sortBy an input-parameter of type int
	 */
	public void setSortBy(int sortBy) {
		Dispatch.put(this, "SortBy", new Variant(sortBy));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFilter() {
		return Dispatch.get(this, "Filter").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param filter an input-parameter of type int
	 */
	public void setFilter(int filter) {
		Dispatch.put(this, "Filter", new Variant(filter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void update() {
		Dispatch.call(this, "Update");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getIndexLanguage() {
		return Dispatch.get(this, "IndexLanguage").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param indexLanguage an input-parameter of type int
	 */
	public void setIndexLanguage(int indexLanguage) {
		Dispatch.put(this, "IndexLanguage", new Variant(indexLanguage));
	}

}
