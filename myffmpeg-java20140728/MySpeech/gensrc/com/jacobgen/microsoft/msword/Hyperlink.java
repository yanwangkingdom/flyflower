/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Hyperlink extends Dispatch {

	public static final String componentName = "Word.Hyperlink";

	public Hyperlink() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Hyperlink(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Hyperlink(String compName) {
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
	public String getName() {
		return Dispatch.get(this, "Name").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getAddressOld() {
		return Dispatch.get(this, "AddressOld").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoHyperlinkType
	 */
	public MsoHyperlinkType getType() {
		return new MsoHyperlinkType(Dispatch.get(this, "Type").toDispatch());
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
	 * @return the result is of type Shape
	 */
	public Shape getShape() {
		return new Shape(Dispatch.get(this, "Shape").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSubAddressOld() {
		return Dispatch.get(this, "SubAddressOld").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getExtraInfoRequired() {
		return Dispatch.get(this, "ExtraInfoRequired").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param newWindow an input-parameter of type Variant
	 * @param addHistory an input-parameter of type Variant
	 * @param extraInfo an input-parameter of type Variant
	 * @param method an input-parameter of type Variant
	 * @param headerInfo an input-parameter of type Variant
	 */
	public void follow(Variant newWindow, Variant addHistory, Variant extraInfo, Variant method, Variant headerInfo) {
		Dispatch.call(this, "Follow", newWindow, addHistory, extraInfo, method, headerInfo);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param newWindow an input-parameter of type Variant
	 * @param addHistory an input-parameter of type Variant
	 * @param extraInfo an input-parameter of type Variant
	 * @param method an input-parameter of type Variant
	 */
	public void follow(Variant newWindow, Variant addHistory, Variant extraInfo, Variant method) {
		Dispatch.call(this, "Follow", newWindow, addHistory, extraInfo, method);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param newWindow an input-parameter of type Variant
	 * @param addHistory an input-parameter of type Variant
	 * @param extraInfo an input-parameter of type Variant
	 */
	public void follow(Variant newWindow, Variant addHistory, Variant extraInfo) {
		Dispatch.call(this, "Follow", newWindow, addHistory, extraInfo);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param newWindow an input-parameter of type Variant
	 * @param addHistory an input-parameter of type Variant
	 */
	public void follow(Variant newWindow, Variant addHistory) {
		Dispatch.call(this, "Follow", newWindow, addHistory);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param newWindow an input-parameter of type Variant
	 */
	public void follow(Variant newWindow) {
		Dispatch.call(this, "Follow", newWindow);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void follow() {
		Dispatch.call(this, "Follow");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param newWindow an input-parameter of type Variant
	 * @param addHistory an input-parameter of type Variant
	 * @param extraInfo an input-parameter of type Variant
	 * @param method an input-parameter of type Variant
	 * @param headerInfo an input-parameter of type Variant
	 */
	public void follow(Variant newWindow, Variant addHistory, Variant extraInfo, Variant method, Variant headerInfo) {
		Dispatch.call(this, "Follow", newWindow, addHistory, extraInfo, method, headerInfo);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void addToFavorites() {
		Dispatch.call(this, "AddToFavorites");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param editNow an input-parameter of type boolean
	 * @param overwrite an input-parameter of type boolean
	 */
	public void createNewDocument(String fileName, boolean editNow, boolean overwrite) {
		Dispatch.call(this, "CreateNewDocument", fileName, new Variant(editNow), new Variant(overwrite));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getAddress() {
		return Dispatch.get(this, "Address").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param address an input-parameter of type String
	 */
	public void setAddress(String address) {
		Dispatch.put(this, "Address", address);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSubAddress() {
		return Dispatch.get(this, "SubAddress").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param subAddress an input-parameter of type String
	 */
	public void setSubAddress(String subAddress) {
		Dispatch.put(this, "SubAddress", subAddress);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getEmailSubject() {
		return Dispatch.get(this, "EmailSubject").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param emailSubject an input-parameter of type String
	 */
	public void setEmailSubject(String emailSubject) {
		Dispatch.put(this, "EmailSubject", emailSubject);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getScreenTip() {
		return Dispatch.get(this, "ScreenTip").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param screenTip an input-parameter of type String
	 */
	public void setScreenTip(String screenTip) {
		Dispatch.put(this, "ScreenTip", screenTip);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getTextToDisplay() {
		return Dispatch.get(this, "TextToDisplay").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textToDisplay an input-parameter of type String
	 */
	public void setTextToDisplay(String textToDisplay) {
		Dispatch.put(this, "TextToDisplay", textToDisplay);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getTarget() {
		return Dispatch.get(this, "Target").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param target an input-parameter of type String
	 */
	public void setTarget(String target) {
		Dispatch.put(this, "Target", target);
	}

}
