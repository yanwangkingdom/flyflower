/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechResourceLoader extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechResourceLoader";

	public ISpeechResourceLoader() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechResourceLoader(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechResourceLoader(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrResourceUri an input-parameter of type String
	 * @param fAlwaysReload an input-parameter of type boolean
	 * @param pStream an input-parameter of type Variant
	 * @param pbstrMIMEType an input-parameter of type String
	 * @param pfModified an input-parameter of type boolean
	 * @param pbstrRedirectUrl an input-parameter of type String
	 */
	public void loadResource(String bstrResourceUri, boolean fAlwaysReload, Variant pStream, String pbstrMIMEType, boolean pfModified, String pbstrRedirectUrl) {
		Dispatch.call(this, "LoadResource", bstrResourceUri, new Variant(fAlwaysReload), pStream, pbstrMIMEType, new Variant(pfModified), pbstrRedirectUrl);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param bstrResourceUri an input-parameter of type String
	 * @param fAlwaysReload an input-parameter of type boolean
	 * @param pStream is an one-element array which sends the input-parameter
	 *                to the ActiveX-Component and receives the output-parameter
	 * @param pbstrMIMEType is an one-element array which sends the input-parameter
	 *                      to the ActiveX-Component and receives the output-parameter
	 * @param pfModified is an one-element array which sends the input-parameter
	 *                   to the ActiveX-Component and receives the output-parameter
	 * @param pbstrRedirectUrl is an one-element array which sends the input-parameter
	 *                         to the ActiveX-Component and receives the output-parameter
	 */
	public void loadResource(String bstrResourceUri, boolean fAlwaysReload, Variant[] pStream, String[] pbstrMIMEType, boolean[] pfModified, String[] pbstrRedirectUrl) {
		Variant vnt_pStream = new Variant();
		if( pStream == null || pStream.length == 0 )
			vnt_pStream.putNoParam();
		else
			vnt_pStream = pStream[0];

		Variant vnt_pbstrMIMEType = new Variant();
		if( pbstrMIMEType == null || pbstrMIMEType.length == 0 )
			vnt_pbstrMIMEType.putNoParam();
		else
			vnt_pbstrMIMEType.putStringRef(pbstrMIMEType[0]);

		Variant vnt_pfModified = new Variant();
		if( pfModified == null || pfModified.length == 0 )
			vnt_pfModified.putNoParam();
		else
			vnt_pfModified.putBooleanRef(pfModified[0]);

		Variant vnt_pbstrRedirectUrl = new Variant();
		if( pbstrRedirectUrl == null || pbstrRedirectUrl.length == 0 )
			vnt_pbstrRedirectUrl.putNoParam();
		else
			vnt_pbstrRedirectUrl.putStringRef(pbstrRedirectUrl[0]);

		Dispatch.call(this, "LoadResource", bstrResourceUri, new Variant(fAlwaysReload), vnt_pStream, vnt_pbstrMIMEType, vnt_pfModified, vnt_pbstrRedirectUrl);

		if( pStream != null && pStream.length > 0 )
			pStream[0] = vnt_pStream;
		if( pbstrMIMEType != null && pbstrMIMEType.length > 0 )
			pbstrMIMEType[0] = vnt_pbstrMIMEType.toString();
		if( pfModified != null && pfModified.length > 0 )
			pfModified[0] = vnt_pfModified.toBoolean();
		if( pbstrRedirectUrl != null && pbstrRedirectUrl.length > 0 )
			pbstrRedirectUrl[0] = vnt_pbstrRedirectUrl.toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrResourceUri an input-parameter of type String
	 * @param pbstrLocalPath an input-parameter of type String
	 * @param pbstrMIMEType an input-parameter of type String
	 * @param pbstrRedirectUrl an input-parameter of type String
	 */
	public void getLocalCopy(String bstrResourceUri, String pbstrLocalPath, String pbstrMIMEType, String pbstrRedirectUrl) {
		Dispatch.call(this, "GetLocalCopy", bstrResourceUri, pbstrLocalPath, pbstrMIMEType, pbstrRedirectUrl);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param bstrResourceUri an input-parameter of type String
	 * @param pbstrLocalPath is an one-element array which sends the input-parameter
	 *                       to the ActiveX-Component and receives the output-parameter
	 * @param pbstrMIMEType is an one-element array which sends the input-parameter
	 *                      to the ActiveX-Component and receives the output-parameter
	 * @param pbstrRedirectUrl is an one-element array which sends the input-parameter
	 *                         to the ActiveX-Component and receives the output-parameter
	 */
	public void getLocalCopy(String bstrResourceUri, String[] pbstrLocalPath, String[] pbstrMIMEType, String[] pbstrRedirectUrl) {
		Variant vnt_pbstrLocalPath = new Variant();
		if( pbstrLocalPath == null || pbstrLocalPath.length == 0 )
			vnt_pbstrLocalPath.putNoParam();
		else
			vnt_pbstrLocalPath.putStringRef(pbstrLocalPath[0]);

		Variant vnt_pbstrMIMEType = new Variant();
		if( pbstrMIMEType == null || pbstrMIMEType.length == 0 )
			vnt_pbstrMIMEType.putNoParam();
		else
			vnt_pbstrMIMEType.putStringRef(pbstrMIMEType[0]);

		Variant vnt_pbstrRedirectUrl = new Variant();
		if( pbstrRedirectUrl == null || pbstrRedirectUrl.length == 0 )
			vnt_pbstrRedirectUrl.putNoParam();
		else
			vnt_pbstrRedirectUrl.putStringRef(pbstrRedirectUrl[0]);

		Dispatch.call(this, "GetLocalCopy", bstrResourceUri, vnt_pbstrLocalPath, vnt_pbstrMIMEType, vnt_pbstrRedirectUrl);

		if( pbstrLocalPath != null && pbstrLocalPath.length > 0 )
			pbstrLocalPath[0] = vnt_pbstrLocalPath.toString();
		if( pbstrMIMEType != null && pbstrMIMEType.length > 0 )
			pbstrMIMEType[0] = vnt_pbstrMIMEType.toString();
		if( pbstrRedirectUrl != null && pbstrRedirectUrl.length > 0 )
			pbstrRedirectUrl[0] = vnt_pbstrRedirectUrl.toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pbstrLocalPath an input-parameter of type String
	 */
	public void releaseLocalCopy(String pbstrLocalPath) {
		Dispatch.call(this, "ReleaseLocalCopy", pbstrLocalPath);
	}

}
