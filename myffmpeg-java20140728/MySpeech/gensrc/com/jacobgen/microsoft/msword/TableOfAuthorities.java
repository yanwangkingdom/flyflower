/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class TableOfAuthorities extends Dispatch {

	public static final String componentName = "Word.TableOfAuthorities";

	public TableOfAuthorities() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public TableOfAuthorities(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public TableOfAuthorities(String compName) {
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
	 * @return the result is of type boolean
	 */
	public boolean getPassim() {
		return Dispatch.get(this, "Passim").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param passim an input-parameter of type boolean
	 */
	public void setPassim(boolean passim) {
		Dispatch.put(this, "Passim", new Variant(passim));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getKeepEntryFormatting() {
		return Dispatch.get(this, "KeepEntryFormatting").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param keepEntryFormatting an input-parameter of type boolean
	 */
	public void setKeepEntryFormatting(boolean keepEntryFormatting) {
		Dispatch.put(this, "KeepEntryFormatting", new Variant(keepEntryFormatting));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCategory() {
		return Dispatch.get(this, "Category").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param category an input-parameter of type int
	 */
	public void setCategory(int category) {
		Dispatch.put(this, "Category", new Variant(category));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getBookmark() {
		return Dispatch.get(this, "Bookmark").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bookmark an input-parameter of type String
	 */
	public void setBookmark(String bookmark) {
		Dispatch.put(this, "Bookmark", bookmark);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSeparator() {
		return Dispatch.get(this, "Separator").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param separator an input-parameter of type String
	 */
	public void setSeparator(String separator) {
		Dispatch.put(this, "Separator", separator);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getIncludeSequenceName() {
		return Dispatch.get(this, "IncludeSequenceName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param includeSequenceName an input-parameter of type String
	 */
	public void setIncludeSequenceName(String includeSequenceName) {
		Dispatch.put(this, "IncludeSequenceName", includeSequenceName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getEntrySeparator() {
		return Dispatch.get(this, "EntrySeparator").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param entrySeparator an input-parameter of type String
	 */
	public void setEntrySeparator(String entrySeparator) {
		Dispatch.put(this, "EntrySeparator", entrySeparator);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getPageRangeSeparator() {
		return Dispatch.get(this, "PageRangeSeparator").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pageRangeSeparator an input-parameter of type String
	 */
	public void setPageRangeSeparator(String pageRangeSeparator) {
		Dispatch.put(this, "PageRangeSeparator", pageRangeSeparator);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIncludeCategoryHeader() {
		return Dispatch.get(this, "IncludeCategoryHeader").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param includeCategoryHeader an input-parameter of type boolean
	 */
	public void setIncludeCategoryHeader(boolean includeCategoryHeader) {
		Dispatch.put(this, "IncludeCategoryHeader", new Variant(includeCategoryHeader));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getPageNumberSeparator() {
		return Dispatch.get(this, "PageNumberSeparator").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pageNumberSeparator an input-parameter of type String
	 */
	public void setPageNumberSeparator(String pageNumberSeparator) {
		Dispatch.put(this, "PageNumberSeparator", pageNumberSeparator);
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

}
