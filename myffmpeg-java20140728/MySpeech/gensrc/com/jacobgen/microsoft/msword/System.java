/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class System extends Dispatch {

	public static final String componentName = "Word.System";

	public System() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public System(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public System(String compName) {
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
	public String getOperatingSystem() {
		return Dispatch.get(this, "OperatingSystem").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getProcessorType() {
		return Dispatch.get(this, "ProcessorType").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getVersion() {
		return Dispatch.get(this, "Version").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFreeDiskSpace() {
		return Dispatch.get(this, "FreeDiskSpace").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCountry() {
		return Dispatch.get(this, "Country").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getLanguageDesignation() {
		return Dispatch.get(this, "LanguageDesignation").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHorizontalResolution() {
		return Dispatch.get(this, "HorizontalResolution").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getVerticalResolution() {
		return Dispatch.get(this, "VerticalResolution").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param section an input-parameter of type String
	 * @param key an input-parameter of type String
	 * @return the result is of type String
	 */
	public String getProfileString(String section, String key) {
		return Dispatch.call(this, "ProfileString", section, key).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param section an input-parameter of type String
	 * @param key an input-parameter of type String
	 */
	public void setProfileString(String section, String key) {
		Dispatch.call(this, "ProfileString", section, key);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param section an input-parameter of type String
	 * @param key an input-parameter of type String
	 * @return the result is of type String
	 */
	public String getPrivateProfileString(String fileName, String section, String key) {
		return Dispatch.call(this, "PrivateProfileString", fileName, section, key).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param section an input-parameter of type String
	 * @param key an input-parameter of type String
	 */
	public void setPrivateProfileString(String fileName, String section, String key) {
		Dispatch.call(this, "PrivateProfileString", fileName, section, key);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMathCoprocessorInstalled() {
		return Dispatch.get(this, "MathCoprocessorInstalled").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getComputerType() {
		return Dispatch.get(this, "ComputerType").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getMacintoshName() {
		return Dispatch.get(this, "MacintoshName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getQuickDrawInstalled() {
		return Dispatch.get(this, "QuickDrawInstalled").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCursor() {
		return Dispatch.get(this, "Cursor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cursor an input-parameter of type int
	 */
	public void setCursor(int cursor) {
		Dispatch.put(this, "Cursor", new Variant(cursor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void mSInfo() {
		Dispatch.call(this, "MSInfo");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param path an input-parameter of type String
	 * @param drive an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 */
	public void connect(String path, Variant drive, Variant password) {
		Dispatch.call(this, "Connect", path, drive, password);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param path an input-parameter of type String
	 * @param drive an input-parameter of type Variant
	 */
	public void connect(String path, Variant drive) {
		Dispatch.call(this, "Connect", path, drive);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param path an input-parameter of type String
	 */
	public void connect(String path) {
		Dispatch.call(this, "Connect", path);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param path an input-parameter of type String
	 * @param drive an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 */
	public void connect(String path, Variant drive, Variant password) {
		Dispatch.call(this, "Connect", path, drive, password);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCountryRegion() {
		return Dispatch.get(this, "CountryRegion").changeType(Variant.VariantInt).getInt();
	}

}
