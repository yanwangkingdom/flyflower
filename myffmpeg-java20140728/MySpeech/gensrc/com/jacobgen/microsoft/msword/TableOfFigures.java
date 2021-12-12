/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class TableOfFigures extends Dispatch {

	public static final String componentName = "Word.TableOfFigures";

	public TableOfFigures() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public TableOfFigures(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public TableOfFigures(String compName) {
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
	 * @return the result is of type String
	 */
	public String getCaption() {
		return Dispatch.get(this, "Caption").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param caption an input-parameter of type String
	 */
	public void setCaption(String caption) {
		Dispatch.put(this, "Caption", caption);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIncludeLabel() {
		return Dispatch.get(this, "IncludeLabel").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param includeLabel an input-parameter of type boolean
	 */
	public void setIncludeLabel(boolean includeLabel) {
		Dispatch.put(this, "IncludeLabel", new Variant(includeLabel));
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
	 * @return the result is of type boolean
	 */
	public boolean getUseHeadingStyles() {
		return Dispatch.get(this, "UseHeadingStyles").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param useHeadingStyles an input-parameter of type boolean
	 */
	public void setUseHeadingStyles(boolean useHeadingStyles) {
		Dispatch.put(this, "UseHeadingStyles", new Variant(useHeadingStyles));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLowerHeadingLevel() {
		return Dispatch.get(this, "LowerHeadingLevel").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lowerHeadingLevel an input-parameter of type int
	 */
	public void setLowerHeadingLevel(int lowerHeadingLevel) {
		Dispatch.put(this, "LowerHeadingLevel", new Variant(lowerHeadingLevel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getUpperHeadingLevel() {
		return Dispatch.get(this, "UpperHeadingLevel").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param upperHeadingLevel an input-parameter of type int
	 */
	public void setUpperHeadingLevel(int upperHeadingLevel) {
		Dispatch.put(this, "UpperHeadingLevel", new Variant(upperHeadingLevel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIncludePageNumbers() {
		return Dispatch.get(this, "IncludePageNumbers").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param includePageNumbers an input-parameter of type boolean
	 */
	public void setIncludePageNumbers(boolean includePageNumbers) {
		Dispatch.put(this, "IncludePageNumbers", new Variant(includePageNumbers));
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
	 * @return the result is of type boolean
	 */
	public boolean getUseFields() {
		return Dispatch.get(this, "UseFields").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param useFields an input-parameter of type boolean
	 */
	public void setUseFields(boolean useFields) {
		Dispatch.put(this, "UseFields", new Variant(useFields));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getTableID() {
		return Dispatch.get(this, "TableID").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tableID an input-parameter of type String
	 */
	public void setTableID(String tableID) {
		Dispatch.put(this, "TableID", tableID);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type HeadingStyles
	 */
	public HeadingStyles getHeadingStyles() {
		return new HeadingStyles(Dispatch.get(this, "HeadingStyles").toDispatch());
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
	public void updatePageNumbers() {
		Dispatch.call(this, "UpdatePageNumbers");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void update() {
		Dispatch.call(this, "Update");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getUseHyperlinks() {
		return Dispatch.get(this, "UseHyperlinks").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param useHyperlinks an input-parameter of type boolean
	 */
	public void setUseHyperlinks(boolean useHyperlinks) {
		Dispatch.put(this, "UseHyperlinks", new Variant(useHyperlinks));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHidePageNumbersInWeb() {
		return Dispatch.get(this, "HidePageNumbersInWeb").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hidePageNumbersInWeb an input-parameter of type boolean
	 */
	public void setHidePageNumbersInWeb(boolean hidePageNumbersInWeb) {
		Dispatch.put(this, "HidePageNumbersInWeb", new Variant(hidePageNumbersInWeb));
	}

}
