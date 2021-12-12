/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class WebOptions extends Dispatch {

	public static final String componentName = "Word.WebOptions";

	public WebOptions() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public WebOptions(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public WebOptions(String compName) {
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
	public boolean getOptimizeForBrowser() {
		return Dispatch.get(this, "OptimizeForBrowser").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param optimizeForBrowser an input-parameter of type boolean
	 */
	public void setOptimizeForBrowser(boolean optimizeForBrowser) {
		Dispatch.put(this, "OptimizeForBrowser", new Variant(optimizeForBrowser));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBrowserLevel() {
		return Dispatch.get(this, "BrowserLevel").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param browserLevel an input-parameter of type int
	 */
	public void setBrowserLevel(int browserLevel) {
		Dispatch.put(this, "BrowserLevel", new Variant(browserLevel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getRelyOnCSS() {
		return Dispatch.get(this, "RelyOnCSS").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param relyOnCSS an input-parameter of type boolean
	 */
	public void setRelyOnCSS(boolean relyOnCSS) {
		Dispatch.put(this, "RelyOnCSS", new Variant(relyOnCSS));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getOrganizeInFolder() {
		return Dispatch.get(this, "OrganizeInFolder").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param organizeInFolder an input-parameter of type boolean
	 */
	public void setOrganizeInFolder(boolean organizeInFolder) {
		Dispatch.put(this, "OrganizeInFolder", new Variant(organizeInFolder));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getUseLongFileNames() {
		return Dispatch.get(this, "UseLongFileNames").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param useLongFileNames an input-parameter of type boolean
	 */
	public void setUseLongFileNames(boolean useLongFileNames) {
		Dispatch.put(this, "UseLongFileNames", new Variant(useLongFileNames));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getRelyOnVML() {
		return Dispatch.get(this, "RelyOnVML").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param relyOnVML an input-parameter of type boolean
	 */
	public void setRelyOnVML(boolean relyOnVML) {
		Dispatch.put(this, "RelyOnVML", new Variant(relyOnVML));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAllowPNG() {
		return Dispatch.get(this, "AllowPNG").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allowPNG an input-parameter of type boolean
	 */
	public void setAllowPNG(boolean allowPNG) {
		Dispatch.put(this, "AllowPNG", new Variant(allowPNG));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoScreenSize
	 */
	public MsoScreenSize getScreenSize() {
		return new MsoScreenSize(Dispatch.get(this, "ScreenSize").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param screenSize an input-parameter of type MsoScreenSize
	 */
	public void setScreenSize(MsoScreenSize screenSize) {
		Dispatch.put(this, "ScreenSize", screenSize);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPixelsPerInch() {
		return Dispatch.get(this, "PixelsPerInch").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pixelsPerInch an input-parameter of type int
	 */
	public void setPixelsPerInch(int pixelsPerInch) {
		Dispatch.put(this, "PixelsPerInch", new Variant(pixelsPerInch));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoEncoding
	 */
	public MsoEncoding getEncoding() {
		return new MsoEncoding(Dispatch.get(this, "Encoding").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param encoding an input-parameter of type MsoEncoding
	 */
	public void setEncoding(MsoEncoding encoding) {
		Dispatch.put(this, "Encoding", encoding);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFolderSuffix() {
		return Dispatch.get(this, "FolderSuffix").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void useDefaultFolderSuffix() {
		Dispatch.call(this, "UseDefaultFolderSuffix");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTargetBrowser
	 */
	public MsoTargetBrowser getTargetBrowser() {
		return new MsoTargetBrowser(Dispatch.get(this, "TargetBrowser").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param targetBrowser an input-parameter of type MsoTargetBrowser
	 */
	public void setTargetBrowser(MsoTargetBrowser targetBrowser) {
		Dispatch.put(this, "TargetBrowser", targetBrowser);
	}

}
