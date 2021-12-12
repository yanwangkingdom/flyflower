/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ContentControl extends Dispatch {

	public static final String componentName = "Word.ContentControl";

	public ContentControl() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ContentControl(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ContentControl(String compName) {
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
	 * @return the result is of type Range
	 */
	public Range getRange() {
		return new Range(Dispatch.get(this, "Range").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getLockContentControl() {
		return Dispatch.get(this, "LockContentControl").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lockContentControl an input-parameter of type boolean
	 */
	public void setLockContentControl(boolean lockContentControl) {
		Dispatch.put(this, "LockContentControl", new Variant(lockContentControl));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getLockContents() {
		return Dispatch.get(this, "LockContents").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lockContents an input-parameter of type boolean
	 */
	public void setLockContents(boolean lockContents) {
		Dispatch.put(this, "LockContents", new Variant(lockContents));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLMapping
	 */
	public XMLMapping getXMLMapping() {
		return new XMLMapping(Dispatch.get(this, "XMLMapping").toDispatch());
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
	 */
	public void copy() {
		Dispatch.call(this, "Copy");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void cut() {
		Dispatch.call(this, "Cut");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param deleteContents an input-parameter of type boolean
	 */
	public void delete(boolean deleteContents) {
		Dispatch.call(this, "Delete", new Variant(deleteContents));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param deleteContents an input-parameter of type boolean
	 */
	public void delete(boolean deleteContents) {
		Dispatch.call(this, "Delete", new Variant(deleteContents));

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ContentControlListEntries
	 */
	public ContentControlListEntries getDropdownListEntries() {
		return new ContentControlListEntries(Dispatch.get(this, "DropdownListEntries").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type BuildingBlock
	 */
	public BuildingBlock getPlaceholderText() {
		return new BuildingBlock(Dispatch.get(this, "PlaceholderText").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param buildingBlock an input-parameter of type BuildingBlock
	 * @param range an input-parameter of type Range
	 * @param text an input-parameter of type String
	 */
	public void setPlaceholderText(BuildingBlock buildingBlock, Range range, String text) {
		Dispatch.call(this, "SetPlaceholderText", buildingBlock, range, text);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param buildingBlock an input-parameter of type BuildingBlock
	 * @param range an input-parameter of type Range
	 */
	public void setPlaceholderText(BuildingBlock buildingBlock, Range range) {
		Dispatch.call(this, "SetPlaceholderText", buildingBlock, range);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param buildingBlock an input-parameter of type BuildingBlock
	 */
	public void setPlaceholderText(BuildingBlock buildingBlock) {
		Dispatch.call(this, "SetPlaceholderText", buildingBlock);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void setPlaceholderText() {
		Dispatch.call(this, "SetPlaceholderText");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param buildingBlock an input-parameter of type BuildingBlock
	 * @param range an input-parameter of type Range
	 * @param text an input-parameter of type String
	 */
	public void setPlaceholderText(BuildingBlock buildingBlock, Range range, String text) {
		Dispatch.call(this, "SetPlaceholderText", buildingBlock, range, text);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getTitle() {
		return Dispatch.get(this, "Title").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param title an input-parameter of type String
	 */
	public void setTitle(String title) {
		Dispatch.put(this, "Title", title);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getDateDisplayFormat() {
		return Dispatch.get(this, "DateDisplayFormat").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateDisplayFormat an input-parameter of type String
	 */
	public void setDateDisplayFormat(String dateDisplayFormat) {
		Dispatch.put(this, "DateDisplayFormat", dateDisplayFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMultiLine() {
		return Dispatch.get(this, "MultiLine").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param multiLine an input-parameter of type boolean
	 */
	public void setMultiLine(boolean multiLine) {
		Dispatch.put(this, "MultiLine", new Variant(multiLine));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ContentControl
	 */
	public ContentControl getParentContentControl() {
		return new ContentControl(Dispatch.get(this, "ParentContentControl").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getTemporary() {
		return Dispatch.get(this, "Temporary").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param temporary an input-parameter of type boolean
	 */
	public void setTemporary(boolean temporary) {
		Dispatch.put(this, "Temporary", new Variant(temporary));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getID() {
		return Dispatch.get(this, "ID").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowingPlaceholderText() {
		return Dispatch.get(this, "ShowingPlaceholderText").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDateStorageFormat() {
		return Dispatch.get(this, "DateStorageFormat").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateStorageFormat an input-parameter of type int
	 */
	public void setDateStorageFormat(int dateStorageFormat) {
		Dispatch.put(this, "DateStorageFormat", new Variant(dateStorageFormat));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBuildingBlockType() {
		return Dispatch.get(this, "BuildingBlockType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param buildingBlockType an input-parameter of type int
	 */
	public void setBuildingBlockType(int buildingBlockType) {
		Dispatch.put(this, "BuildingBlockType", new Variant(buildingBlockType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getBuildingBlockCategory() {
		return Dispatch.get(this, "BuildingBlockCategory").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param buildingBlockCategory an input-parameter of type String
	 */
	public void setBuildingBlockCategory(String buildingBlockCategory) {
		Dispatch.put(this, "BuildingBlockCategory", buildingBlockCategory);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDateDisplayLocale() {
		return Dispatch.get(this, "DateDisplayLocale").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateDisplayLocale an input-parameter of type int
	 */
	public void setDateDisplayLocale(int dateDisplayLocale) {
		Dispatch.put(this, "DateDisplayLocale", new Variant(dateDisplayLocale));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void ungroup() {
		Dispatch.call(this, "Ungroup");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getDefaultTextStyle() {
		return Dispatch.get(this, "DefaultTextStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultTextStyle an input-parameter of type Variant
	 */
	public void setDefaultTextStyle(Variant defaultTextStyle) {
		Dispatch.put(this, "DefaultTextStyle", defaultTextStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDateCalendarType() {
		return Dispatch.get(this, "DateCalendarType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateCalendarType an input-parameter of type int
	 */
	public void setDateCalendarType(int dateCalendarType) {
		Dispatch.put(this, "DateCalendarType", new Variant(dateCalendarType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getTag() {
		return Dispatch.get(this, "Tag").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tag an input-parameter of type String
	 */
	public void setTag(String tag) {
		Dispatch.put(this, "Tag", tag);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getChecked() {
		return Dispatch.get(this, "Checked").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param checked an input-parameter of type boolean
	 */
	public void setChecked(boolean checked) {
		Dispatch.put(this, "Checked", new Variant(checked));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param characterNumber an input-parameter of type int
	 * @param font an input-parameter of type String
	 */
	public void setCheckedSymbol(int characterNumber, String font) {
		Dispatch.call(this, "SetCheckedSymbol", new Variant(characterNumber), font);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param characterNumber an input-parameter of type int
	 */
	public void setCheckedSymbol(int characterNumber) {
		Dispatch.call(this, "SetCheckedSymbol", new Variant(characterNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param characterNumber an input-parameter of type int
	 * @param font an input-parameter of type String
	 */
	public void setCheckedSymbol(int characterNumber, String font) {
		Dispatch.call(this, "SetCheckedSymbol", new Variant(characterNumber), font);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param characterNumber an input-parameter of type int
	 * @param font an input-parameter of type String
	 */
	public void setUncheckedSymbol(int characterNumber, String font) {
		Dispatch.call(this, "SetUncheckedSymbol", new Variant(characterNumber), font);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param characterNumber an input-parameter of type int
	 */
	public void setUncheckedSymbol(int characterNumber) {
		Dispatch.call(this, "SetUncheckedSymbol", new Variant(characterNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param characterNumber an input-parameter of type int
	 * @param font an input-parameter of type String
	 */
	public void setUncheckedSymbol(int characterNumber, String font) {
		Dispatch.call(this, "SetUncheckedSymbol", new Variant(characterNumber), font);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getColor() {
		return Dispatch.get(this, "Color").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param color an input-parameter of type int
	 */
	public void setColor(int color) {
		Dispatch.put(this, "Color", new Variant(color));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAppearance() {
		return Dispatch.get(this, "Appearance").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param appearance an input-parameter of type int
	 */
	public void setAppearance(int appearance) {
		Dispatch.put(this, "Appearance", new Variant(appearance));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLevel() {
		return Dispatch.get(this, "Level").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type RepeatingSectionItemColl
	 */
	public RepeatingSectionItemColl getRepeatingSectionItems() {
		return new RepeatingSectionItemColl(Dispatch.get(this, "RepeatingSectionItems").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getRepeatingSectionItemTitle() {
		return Dispatch.get(this, "RepeatingSectionItemTitle").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param repeatingSectionItemTitle an input-parameter of type String
	 */
	public void setRepeatingSectionItemTitle(String repeatingSectionItemTitle) {
		Dispatch.put(this, "RepeatingSectionItemTitle", repeatingSectionItemTitle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAllowInsertDeleteSection() {
		return Dispatch.get(this, "AllowInsertDeleteSection").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allowInsertDeleteSection an input-parameter of type boolean
	 */
	public void setAllowInsertDeleteSection(boolean allowInsertDeleteSection) {
		Dispatch.put(this, "AllowInsertDeleteSection", new Variant(allowInsertDeleteSection));
	}

}
