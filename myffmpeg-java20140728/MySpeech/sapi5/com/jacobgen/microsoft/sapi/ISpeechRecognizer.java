/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechRecognizer extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechRecognizer";

	public ISpeechRecognizer() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechRecognizer(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechRecognizer(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recognizer an input-parameter of type ISpeechObjectToken
	 */
	public void setRecognizer(ISpeechObjectToken recognizer) {
		Dispatch.put(this, "Recognizer", recognizer);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechObjectToken
	 */
	public ISpeechObjectToken getRecognizer() {
		return new ISpeechObjectToken(Dispatch.get(this, "Recognizer").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allowAudioInputFormatChangesOnNextSet an input-parameter of type boolean
	 */
	public void setAllowAudioInputFormatChangesOnNextSet(boolean allowAudioInputFormatChangesOnNextSet) {
		Dispatch.put(this, "AllowAudioInputFormatChangesOnNextSet", new Variant(allowAudioInputFormatChangesOnNextSet));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAllowAudioInputFormatChangesOnNextSet() {
		return Dispatch.get(this, "AllowAudioInputFormatChangesOnNextSet").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param audioInput an input-parameter of type ISpeechObjectToken
	 */
	public void setAudioInput(ISpeechObjectToken audioInput) {
		Dispatch.put(this, "AudioInput", audioInput);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void setAudioInput() {
		Dispatch.call(this, "AudioInput");
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechObjectToken
	 */
	public ISpeechObjectToken getAudioInput() {
		return new ISpeechObjectToken(Dispatch.get(this, "AudioInput").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param audioInputStream an input-parameter of type ISpeechBaseStream
	 */
	public void setAudioInputStream(ISpeechBaseStream audioInputStream) {
		Dispatch.put(this, "AudioInputStream", audioInputStream);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void setAudioInputStream() {
		Dispatch.call(this, "AudioInputStream");
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechBaseStream
	 */
	public ISpeechBaseStream getAudioInputStream() {
		return new ISpeechBaseStream(Dispatch.get(this, "AudioInputStream").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIsShared() {
		return Dispatch.get(this, "IsShared").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param state an input-parameter of type int
	 */
	public void setState(int state) {
		Dispatch.put(this, "State", new Variant(state));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getState() {
		return Dispatch.get(this, "State").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechRecognizerStatus
	 */
	public ISpeechRecognizerStatus getStatus() {
		return new ISpeechRecognizerStatus(Dispatch.get(this, "Status").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param profile an input-parameter of type ISpeechObjectToken
	 */
	public void setProfile(ISpeechObjectToken profile) {
		Dispatch.put(this, "Profile", profile);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void setProfile() {
		Dispatch.call(this, "Profile");
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechObjectToken
	 */
	public ISpeechObjectToken getProfile() {
		return new ISpeechObjectToken(Dispatch.get(this, "Profile").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textElements an input-parameter of type Variant
	 * @param elementDisplayAttributes an input-parameter of type Variant
	 * @param languageId an input-parameter of type int
	 */
	public void emulateRecognition(Variant textElements, Variant elementDisplayAttributes, int languageId) {
		Dispatch.call(this, "EmulateRecognition", textElements, elementDisplayAttributes, new Variant(languageId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textElements an input-parameter of type Variant
	 * @param elementDisplayAttributes an input-parameter of type Variant
	 */
	public void emulateRecognition(Variant textElements, Variant elementDisplayAttributes) {
		Dispatch.call(this, "EmulateRecognition", textElements, elementDisplayAttributes);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textElements an input-parameter of type Variant
	 */
	public void emulateRecognition(Variant textElements) {
		Dispatch.call(this, "EmulateRecognition", textElements);
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechRecoContext
	 */
	public ISpeechRecoContext createRecoContext() {
		return new ISpeechRecoContext(Dispatch.call(this, "CreateRecoContext").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @return the result is of type ISpeechAudioFormat
	 */
	public ISpeechAudioFormat getFormat(int type) {
		return new ISpeechAudioFormat(Dispatch.call(this, "GetFormat", new Variant(type)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param value an input-parameter of type int
	 * @return the result is of type boolean
	 */
	public boolean setPropertyNumber(String name, int value) {
		return Dispatch.call(this, "SetPropertyNumber", name, new Variant(value)).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param value an input-parameter of type int
	 * @return the result is of type boolean
	 */
	public boolean getPropertyNumber(String name, int value) {
		return Dispatch.call(this, "GetPropertyNumber", name, new Variant(value)).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type String
	 * @param value is an one-element array which sends the input-parameter
	 *              to the ActiveX-Component and receives the output-parameter
	 * @return the result is of type boolean
	 */
	public boolean getPropertyNumber(String name, int[] value) {
		Variant vnt_value = new Variant();
		if( value == null || value.length == 0 )
			vnt_value.putNoParam();
		else
			vnt_value.putIntRef(value[0]);

		boolean result_of_GetPropertyNumber = Dispatch.call(this, "GetPropertyNumber", name, vnt_value).changeType(Variant.VariantBoolean).getBoolean();

		if( value != null && value.length > 0 )
			value[0] = vnt_value.toInt();

		return result_of_GetPropertyNumber;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param value an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean setPropertyString(String name, String value) {
		return Dispatch.call(this, "SetPropertyString", name, value).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param value an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean getPropertyString(String name, String value) {
		return Dispatch.call(this, "GetPropertyString", name, value).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type String
	 * @param value is an one-element array which sends the input-parameter
	 *              to the ActiveX-Component and receives the output-parameter
	 * @return the result is of type boolean
	 */
	public boolean getPropertyString(String name, String[] value) {
		Variant vnt_value = new Variant();
		if( value == null || value.length == 0 )
			vnt_value.putNoParam();
		else
			vnt_value.putStringRef(value[0]);

		boolean result_of_GetPropertyString = Dispatch.call(this, "GetPropertyString", name, vnt_value).changeType(Variant.VariantBoolean).getBoolean();

		if( value != null && value.length > 0 )
			value[0] = vnt_value.toString();

		return result_of_GetPropertyString;
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
	 * @param hWndParent an input-parameter of type int
	 * @param title an input-parameter of type String
	 * @param typeOfUI an input-parameter of type String
	 * @param extraData an input-parameter of type Variant
	 */
	public void displayUI(int hWndParent, String title, String typeOfUI, Variant extraData) {
		Dispatch.call(this, "DisplayUI", new Variant(hWndParent), title, typeOfUI, extraData);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hWndParent an input-parameter of type int
	 * @param title an input-parameter of type String
	 * @param typeOfUI an input-parameter of type String
	 */
	public void displayUI(int hWndParent, String title, String typeOfUI) {
		Dispatch.call(this, "DisplayUI", new Variant(hWndParent), title, typeOfUI);
	}


	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requiredAttributes an input-parameter of type String
	 * @param optionalAttributes an input-parameter of type String
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getRecognizers(String requiredAttributes, String optionalAttributes) {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetRecognizers", requiredAttributes, optionalAttributes).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requiredAttributes an input-parameter of type String
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getRecognizers(String requiredAttributes) {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetRecognizers", requiredAttributes).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getRecognizers() {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetRecognizers").toDispatch());
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requiredAttributes an input-parameter of type String
	 * @param optionalAttributes an input-parameter of type String
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getAudioInputs(String requiredAttributes, String optionalAttributes) {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetAudioInputs", requiredAttributes, optionalAttributes).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requiredAttributes an input-parameter of type String
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getAudioInputs(String requiredAttributes) {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetAudioInputs", requiredAttributes).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getAudioInputs() {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetAudioInputs").toDispatch());
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requiredAttributes an input-parameter of type String
	 * @param optionalAttributes an input-parameter of type String
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getProfiles(String requiredAttributes, String optionalAttributes) {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetProfiles", requiredAttributes, optionalAttributes).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requiredAttributes an input-parameter of type String
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getProfiles(String requiredAttributes) {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetProfiles", requiredAttributes).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getProfiles() {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetProfiles").toDispatch());
	}

	

}
