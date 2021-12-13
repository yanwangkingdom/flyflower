/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechObjectToken extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechObjectToken";

	public ISpeechObjectToken() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechObjectToken(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechObjectToken(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getId() {
		return Dispatch.get(this, "Id").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechDataKey
	 */
	public ISpeechDataKey getDataKey() {
		return new ISpeechDataKey(Dispatch.get(this, "DataKey").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechObjectTokenCategory
	 */
	public ISpeechObjectTokenCategory getCategory() {
		return new ISpeechObjectTokenCategory(Dispatch.get(this, "Category").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getDescription() {
		return Dispatch.call(this, "GetDescription").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param locale an input-parameter of type int
	 * @return the result is of type String
	 */
	public String getDescription(int locale) {
		String result_of_GetDescription = Dispatch.call(this, "GetDescription", new Variant(locale)).toString();


		return result_of_GetDescription;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param id an input-parameter of type String
	 * @param categoryID an input-parameter of type String
	 * @param createIfNotExist an input-parameter of type boolean
	 */
	public void setId(String id, String categoryID, boolean createIfNotExist) {
		Dispatch.call(this, "SetId", id, categoryID, new Variant(createIfNotExist));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param id an input-parameter of type String
	 * @param categoryID an input-parameter of type String
	 */
	public void setId(String id, String categoryID) {
		Dispatch.call(this, "SetId", id, categoryID);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param id an input-parameter of type String
	 */
	public void setId(String id) {
		Dispatch.call(this, "SetId", id);
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param attributeName an input-parameter of type String
	 * @return the result is of type String
	 */
	public String getAttribute(String attributeName) {
		return Dispatch.call(this, "GetAttribute", attributeName).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pUnkOuter an input-parameter of type Variant
	 * @param clsContext an input-parameter of type int
	 * @return the result is of type Variant
	 */
	public Variant createInstance(Variant pUnkOuter, int clsContext) {
		return Dispatch.call(this, "CreateInstance", pUnkOuter, new Variant(clsContext));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pUnkOuter an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant createInstance(Variant pUnkOuter) {
		return Dispatch.call(this, "CreateInstance", pUnkOuter);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant createInstance() {
		return Dispatch.call(this, "CreateInstance");
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param objectStorageCLSID an input-parameter of type String
	 */
	public void remove(String objectStorageCLSID) {
		Dispatch.call(this, "Remove", objectStorageCLSID);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param objectStorageCLSID an input-parameter of type String
	 * @param keyName an input-parameter of type String
	 * @param fileName an input-parameter of type String
	 * @param folder an input-parameter of type int
	 * @return the result is of type String
	 */
	public String getStorageFileName(String objectStorageCLSID, String keyName, String fileName, int folder) {
		return Dispatch.call(this, "GetStorageFileName", objectStorageCLSID, keyName, fileName, new Variant(folder)).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param objectStorageCLSID an input-parameter of type String
	 * @param keyName an input-parameter of type String
	 * @param deleteFile an input-parameter of type boolean
	 */
	public void removeStorageFileName(String objectStorageCLSID, String keyName, boolean deleteFile) {
		Dispatch.call(this, "RemoveStorageFileName", objectStorageCLSID, keyName, new Variant(deleteFile));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param typeOfUI an input-parameter of type String
	 * @param extraData an input-parameter of type Variant
	 * @param object an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean isUISupported(String typeOfUI, Variant extraData, Variant object) {
		return Dispatch.call(this, "IsUISupported", typeOfUI, extraData, object).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param typeOfUI an input-parameter of type String
	 * @param extraData an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean isUISupported(String typeOfUI, Variant extraData) {
		return Dispatch.call(this, "IsUISupported", typeOfUI, extraData).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param typeOfUI an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean isUISupported(String typeOfUI) {
		return Dispatch.call(this, "IsUISupported", typeOfUI).changeType(Variant.VariantBoolean).getBoolean();
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hWnd an input-parameter of type int
	 * @param title an input-parameter of type String
	 * @param typeOfUI an input-parameter of type String
	 * @param extraData an input-parameter of type Variant
	 * @param object an input-parameter of type Variant
	 */
	public void displayUI(int hWnd, String title, String typeOfUI, Variant extraData, Variant object) {
		Dispatch.call(this, "DisplayUI", new Variant(hWnd), title, typeOfUI, extraData, object);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hWnd an input-parameter of type int
	 * @param title an input-parameter of type String
	 * @param typeOfUI an input-parameter of type String
	 * @param extraData an input-parameter of type Variant
	 */
	public void displayUI(int hWnd, String title, String typeOfUI, Variant extraData) {
		Dispatch.call(this, "DisplayUI", new Variant(hWnd), title, typeOfUI, extraData);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hWnd an input-parameter of type int
	 * @param title an input-parameter of type String
	 * @param typeOfUI an input-parameter of type String
	 */
	public void displayUI(int hWnd, String title, String typeOfUI) {
		Dispatch.call(this, "DisplayUI", new Variant(hWnd), title, typeOfUI);
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param attributes an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean matchesAttributes(String attributes) {
		return Dispatch.call(this, "MatchesAttributes", attributes).changeType(Variant.VariantBoolean).getBoolean();
	}

}
