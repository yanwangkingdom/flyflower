/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ListFormat extends Dispatch {

	public static final String componentName = "Word.ListFormat";

	public ListFormat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ListFormat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ListFormat(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getListLevelNumber() {
		return Dispatch.get(this, "ListLevelNumber").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listLevelNumber an input-parameter of type int
	 */
	public void setListLevelNumber(int listLevelNumber) {
		Dispatch.put(this, "ListLevelNumber", new Variant(listLevelNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type List
	 */
	public List getList() {
		return new List(Dispatch.get(this, "List").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ListTemplate
	 */
	public ListTemplate getListTemplate() {
		return new ListTemplate(Dispatch.get(this, "ListTemplate").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getListValue() {
		return Dispatch.get(this, "ListValue").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSingleList() {
		return Dispatch.get(this, "SingleList").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSingleListTemplate() {
		return Dispatch.get(this, "SingleListTemplate").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getListType() {
		return Dispatch.get(this, "ListType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getListString() {
		return Dispatch.get(this, "ListString").toString();
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
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @return the result is of type int
	 */
	public int canContinuePreviousList(ListTemplate listTemplate) {
		return Dispatch.call(this, "CanContinuePreviousList", listTemplate).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 */
	public void removeNumbers(Variant numberType) {
		Dispatch.call(this, "RemoveNumbers", numberType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void removeNumbers() {
		Dispatch.call(this, "RemoveNumbers");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 */
	public void removeNumbers(Variant numberType) {
		Dispatch.call(this, "RemoveNumbers", numberType);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 */
	public void convertNumbersToText(Variant numberType) {
		Dispatch.call(this, "ConvertNumbersToText", numberType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void convertNumbersToText() {
		Dispatch.call(this, "ConvertNumbersToText");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 */
	public void convertNumbersToText(Variant numberType) {
		Dispatch.call(this, "ConvertNumbersToText", numberType);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 * @param level an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int countNumberedItems(Variant numberType, Variant level) {
		return Dispatch.call(this, "CountNumberedItems", numberType, level).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int countNumberedItems(Variant numberType) {
		return Dispatch.call(this, "CountNumberedItems", numberType).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int countNumberedItems() {
		return Dispatch.call(this, "CountNumberedItems").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 * @param level an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int countNumberedItems(Variant numberType, Variant level) {
		int result_of_CountNumberedItems = Dispatch.call(this, "CountNumberedItems", numberType, level).changeType(Variant.VariantInt).getInt();


		return result_of_CountNumberedItems;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void applyBulletDefaultOld() {
		Dispatch.call(this, "ApplyBulletDefaultOld");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void applyNumberDefaultOld() {
		Dispatch.call(this, "ApplyNumberDefaultOld");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void applyOutlineNumberDefaultOld() {
		Dispatch.call(this, "ApplyOutlineNumberDefaultOld");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param continuePreviousList an input-parameter of type Variant
	 * @param applyTo an input-parameter of type Variant
	 */
	public void applyListTemplateOld(ListTemplate listTemplate, Variant continuePreviousList, Variant applyTo) {
		Dispatch.call(this, "ApplyListTemplateOld", listTemplate, continuePreviousList, applyTo);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param continuePreviousList an input-parameter of type Variant
	 */
	public void applyListTemplateOld(ListTemplate listTemplate, Variant continuePreviousList) {
		Dispatch.call(this, "ApplyListTemplateOld", listTemplate, continuePreviousList);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 */
	public void applyListTemplateOld(ListTemplate listTemplate) {
		Dispatch.call(this, "ApplyListTemplateOld", listTemplate);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param continuePreviousList an input-parameter of type Variant
	 * @param applyTo an input-parameter of type Variant
	 */
	public void applyListTemplateOld(ListTemplate listTemplate, Variant continuePreviousList, Variant applyTo) {
		Dispatch.call(this, "ApplyListTemplateOld", listTemplate, continuePreviousList, applyTo);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void listOutdent() {
		Dispatch.call(this, "ListOutdent");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void listIndent() {
		Dispatch.call(this, "ListIndent");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultListBehavior an input-parameter of type Variant
	 */
	public void applyBulletDefault(Variant defaultListBehavior) {
		Dispatch.call(this, "ApplyBulletDefault", defaultListBehavior);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void applyBulletDefault() {
		Dispatch.call(this, "ApplyBulletDefault");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param defaultListBehavior an input-parameter of type Variant
	 */
	public void applyBulletDefault(Variant defaultListBehavior) {
		Dispatch.call(this, "ApplyBulletDefault", defaultListBehavior);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultListBehavior an input-parameter of type Variant
	 */
	public void applyNumberDefault(Variant defaultListBehavior) {
		Dispatch.call(this, "ApplyNumberDefault", defaultListBehavior);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void applyNumberDefault() {
		Dispatch.call(this, "ApplyNumberDefault");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param defaultListBehavior an input-parameter of type Variant
	 */
	public void applyNumberDefault(Variant defaultListBehavior) {
		Dispatch.call(this, "ApplyNumberDefault", defaultListBehavior);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultListBehavior an input-parameter of type Variant
	 */
	public void applyOutlineNumberDefault(Variant defaultListBehavior) {
		Dispatch.call(this, "ApplyOutlineNumberDefault", defaultListBehavior);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void applyOutlineNumberDefault() {
		Dispatch.call(this, "ApplyOutlineNumberDefault");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param defaultListBehavior an input-parameter of type Variant
	 */
	public void applyOutlineNumberDefault(Variant defaultListBehavior) {
		Dispatch.call(this, "ApplyOutlineNumberDefault", defaultListBehavior);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param continuePreviousList an input-parameter of type Variant
	 * @param applyTo an input-parameter of type Variant
	 * @param defaultListBehavior an input-parameter of type Variant
	 */
	public void applyListTemplate(ListTemplate listTemplate, Variant continuePreviousList, Variant applyTo, Variant defaultListBehavior) {
		Dispatch.call(this, "ApplyListTemplate", listTemplate, continuePreviousList, applyTo, defaultListBehavior);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param continuePreviousList an input-parameter of type Variant
	 * @param applyTo an input-parameter of type Variant
	 */
	public void applyListTemplate(ListTemplate listTemplate, Variant continuePreviousList, Variant applyTo) {
		Dispatch.call(this, "ApplyListTemplate", listTemplate, continuePreviousList, applyTo);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param continuePreviousList an input-parameter of type Variant
	 */
	public void applyListTemplate(ListTemplate listTemplate, Variant continuePreviousList) {
		Dispatch.call(this, "ApplyListTemplate", listTemplate, continuePreviousList);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 */
	public void applyListTemplate(ListTemplate listTemplate) {
		Dispatch.call(this, "ApplyListTemplate", listTemplate);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param continuePreviousList an input-parameter of type Variant
	 * @param applyTo an input-parameter of type Variant
	 * @param defaultListBehavior an input-parameter of type Variant
	 */
	public void applyListTemplate(ListTemplate listTemplate, Variant continuePreviousList, Variant applyTo, Variant defaultListBehavior) {
		Dispatch.call(this, "ApplyListTemplate", listTemplate, continuePreviousList, applyTo, defaultListBehavior);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type InlineShape
	 */
	public InlineShape getListPictureBullet() {
		return new InlineShape(Dispatch.get(this, "ListPictureBullet").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param continuePreviousList an input-parameter of type Variant
	 * @param applyTo an input-parameter of type Variant
	 * @param defaultListBehavior an input-parameter of type Variant
	 * @param applyLevel an input-parameter of type Variant
	 */
	public void applyListTemplateWithLevel(ListTemplate listTemplate, Variant continuePreviousList, Variant applyTo, Variant defaultListBehavior, Variant applyLevel) {
		Dispatch.call(this, "ApplyListTemplateWithLevel", listTemplate, continuePreviousList, applyTo, defaultListBehavior, applyLevel);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param continuePreviousList an input-parameter of type Variant
	 * @param applyTo an input-parameter of type Variant
	 * @param defaultListBehavior an input-parameter of type Variant
	 */
	public void applyListTemplateWithLevel(ListTemplate listTemplate, Variant continuePreviousList, Variant applyTo, Variant defaultListBehavior) {
		Dispatch.call(this, "ApplyListTemplateWithLevel", listTemplate, continuePreviousList, applyTo, defaultListBehavior);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param continuePreviousList an input-parameter of type Variant
	 * @param applyTo an input-parameter of type Variant
	 */
	public void applyListTemplateWithLevel(ListTemplate listTemplate, Variant continuePreviousList, Variant applyTo) {
		Dispatch.call(this, "ApplyListTemplateWithLevel", listTemplate, continuePreviousList, applyTo);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param continuePreviousList an input-parameter of type Variant
	 */
	public void applyListTemplateWithLevel(ListTemplate listTemplate, Variant continuePreviousList) {
		Dispatch.call(this, "ApplyListTemplateWithLevel", listTemplate, continuePreviousList);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 */
	public void applyListTemplateWithLevel(ListTemplate listTemplate) {
		Dispatch.call(this, "ApplyListTemplateWithLevel", listTemplate);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param listTemplate an input-parameter of type ListTemplate
	 * @param continuePreviousList an input-parameter of type Variant
	 * @param applyTo an input-parameter of type Variant
	 * @param defaultListBehavior an input-parameter of type Variant
	 * @param applyLevel an input-parameter of type Variant
	 */
	public void applyListTemplateWithLevel(ListTemplate listTemplate, Variant continuePreviousList, Variant applyTo, Variant defaultListBehavior, Variant applyLevel) {
		Dispatch.call(this, "ApplyListTemplateWithLevel", listTemplate, continuePreviousList, applyTo, defaultListBehavior, applyLevel);

	}

}
