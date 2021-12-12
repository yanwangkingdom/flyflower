/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OLEFormat extends Dispatch {

	public static final String componentName = "Word.OLEFormat";

	public OLEFormat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OLEFormat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OLEFormat(String compName) {
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
	public String getClassType() {
		return Dispatch.get(this, "ClassType").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type String
	 */
	public void setClassType(String classType) {
		Dispatch.put(this, "ClassType", classType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayAsIcon() {
		return Dispatch.get(this, "DisplayAsIcon").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayAsIcon an input-parameter of type boolean
	 */
	public void setDisplayAsIcon(boolean displayAsIcon) {
		Dispatch.put(this, "DisplayAsIcon", new Variant(displayAsIcon));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getIconName() {
		return Dispatch.get(this, "IconName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iconName an input-parameter of type String
	 */
	public void setIconName(String iconName) {
		Dispatch.put(this, "IconName", iconName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getIconPath() {
		return Dispatch.get(this, "IconPath").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getIconIndex() {
		return Dispatch.get(this, "IconIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iconIndex an input-parameter of type int
	 */
	public void setIconIndex(int iconIndex) {
		Dispatch.put(this, "IconIndex", new Variant(iconIndex));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getIconLabel() {
		return Dispatch.get(this, "IconLabel").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iconLabel an input-parameter of type String
	 */
	public void setIconLabel(String iconLabel) {
		Dispatch.put(this, "IconLabel", iconLabel);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getLabel() {
		return Dispatch.get(this, "Label").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getObject() {
		return Dispatch.get(this, "Object");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getProgID() {
		return Dispatch.get(this, "ProgID").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void activate() {
		Dispatch.call(this, "Activate");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void edit() {
		Dispatch.call(this, "Edit");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void open() {
		Dispatch.call(this, "Open");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param verbIndex an input-parameter of type Variant
	 */
	public void doVerb(Variant verbIndex) {
		Dispatch.call(this, "DoVerb", verbIndex);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void doVerb() {
		Dispatch.call(this, "DoVerb");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param verbIndex an input-parameter of type Variant
	 */
	public void doVerb(Variant verbIndex) {
		Dispatch.call(this, "DoVerb", verbIndex);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param iconFileName an input-parameter of type Variant
	 * @param iconIndex an input-parameter of type Variant
	 * @param iconLabel an input-parameter of type Variant
	 */
	public void convertTo(Variant classType, Variant displayAsIcon, Variant iconFileName, Variant iconIndex, Variant iconLabel) {
		Dispatch.call(this, "ConvertTo", classType, displayAsIcon, iconFileName, iconIndex, iconLabel);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param iconFileName an input-parameter of type Variant
	 * @param iconIndex an input-parameter of type Variant
	 */
	public void convertTo(Variant classType, Variant displayAsIcon, Variant iconFileName, Variant iconIndex) {
		Dispatch.call(this, "ConvertTo", classType, displayAsIcon, iconFileName, iconIndex);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param iconFileName an input-parameter of type Variant
	 */
	public void convertTo(Variant classType, Variant displayAsIcon, Variant iconFileName) {
		Dispatch.call(this, "ConvertTo", classType, displayAsIcon, iconFileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 */
	public void convertTo(Variant classType, Variant displayAsIcon) {
		Dispatch.call(this, "ConvertTo", classType, displayAsIcon);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type Variant
	 */
	public void convertTo(Variant classType) {
		Dispatch.call(this, "ConvertTo", classType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void convertTo() {
		Dispatch.call(this, "ConvertTo");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param classType an input-parameter of type Variant
	 * @param displayAsIcon an input-parameter of type Variant
	 * @param iconFileName an input-parameter of type Variant
	 * @param iconIndex an input-parameter of type Variant
	 * @param iconLabel an input-parameter of type Variant
	 */
	public void convertTo(Variant classType, Variant displayAsIcon, Variant iconFileName, Variant iconIndex, Variant iconLabel) {
		Dispatch.call(this, "ConvertTo", classType, displayAsIcon, iconFileName, iconIndex, iconLabel);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classType an input-parameter of type String
	 */
	public void activateAs(String classType) {
		Dispatch.call(this, "ActivateAs", classType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getPreserveFormattingOnUpdate() {
		return Dispatch.get(this, "PreserveFormattingOnUpdate").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param preserveFormattingOnUpdate an input-parameter of type boolean
	 */
	public void setPreserveFormattingOnUpdate(boolean preserveFormattingOnUpdate) {
		Dispatch.put(this, "PreserveFormattingOnUpdate", new Variant(preserveFormattingOnUpdate));
	}

}
