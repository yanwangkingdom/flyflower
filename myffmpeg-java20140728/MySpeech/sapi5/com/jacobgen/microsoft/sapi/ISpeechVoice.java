/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechVoice extends Dispatch {

	public static final String componentName = "SAPI.SPVoice";

	public ISpeechVoice() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechVoice(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechVoice(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechVoiceStatus
	 */
	public ISpeechVoiceStatus getStatus() {
		return new ISpeechVoiceStatus(Dispatch.get(this, "Status").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechObjectToken
	 */
	public ISpeechObjectToken getVoice() {
		return new ISpeechObjectToken(Dispatch.get(this, "Voice").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param voice an input-parameter of type ISpeechObjectToken
	 */
	public void setVoice(ISpeechObjectToken voice) {
		Dispatch.putRef(this, "Voice", voice);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechObjectToken
	 */
	public ISpeechObjectToken getAudioOutput() {
		return new ISpeechObjectToken(Dispatch.get(this, "AudioOutput").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param audioOutput an input-parameter of type ISpeechObjectToken
	 */
	public void setAudioOutput(ISpeechObjectToken audioOutput) {
		Dispatch.put(this, "AudioOutput", audioOutput);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechBaseStream
	 */
	public ISpeechBaseStream getAudioOutputStream() {
		return new ISpeechBaseStream(Dispatch.get(this, "AudioOutputStream").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param audioOutputStream an input-parameter of type ISpeechBaseStream
	 */
	public void setAudioOutputStream(ISpeechBaseStream audioOutputStream) {
		Dispatch.put(this, "AudioOutputStream", audioOutputStream);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRate() {
		return Dispatch.get(this, "Rate").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rate an input-parameter of type int
	 */
	public void setRate(int rate) {
		Dispatch.put(this, "Rate", new Variant(rate));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getVolume() {
		return Dispatch.get(this, "Volume").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param volume an input-parameter of type int
	 */
	public void setVolume(int volume) {
		Dispatch.put(this, "Volume", new Variant(volume));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allowAudioOutputFormatChangesOnNextSet an input-parameter of type boolean
	 */
	public void setAllowAudioOutputFormatChangesOnNextSet(boolean allowAudioOutputFormatChangesOnNextSet) {
		Dispatch.put(this, "AllowAudioOutputFormatChangesOnNextSet", new Variant(allowAudioOutputFormatChangesOnNextSet));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAllowAudioOutputFormatChangesOnNextSet() {
		return Dispatch.get(this, "AllowAudioOutputFormatChangesOnNextSet").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getEventInterests() {
		return Dispatch.get(this, "EventInterests").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param eventInterests an input-parameter of type int
	 */
	public void setEventInterests(int eventInterests) {
		Dispatch.put(this, "EventInterests", new Variant(eventInterests));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param priority an input-parameter of type int
	 */
	public void setPriority(int priority) {
		Dispatch.put(this, "Priority", new Variant(priority));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPriority() {
		return Dispatch.get(this, "Priority").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param alertBoundary an input-parameter of type int
	 */
	public void setAlertBoundary(int alertBoundary) {
		Dispatch.put(this, "AlertBoundary", new Variant(alertBoundary));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAlertBoundary() {
		return Dispatch.get(this, "AlertBoundary").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param synchronousSpeakTimeout an input-parameter of type int
	 */
	public void setSynchronousSpeakTimeout(int synchronousSpeakTimeout) {
		Dispatch.put(this, "SynchronousSpeakTimeout", new Variant(synchronousSpeakTimeout));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSynchronousSpeakTimeout() {
		return Dispatch.get(this, "SynchronousSpeakTimeout").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 * @param flags an input-parameter of type int
	 * @return the result is of type int
	 */
	public int speak(String text, int flags) {
		return Dispatch.call(this, "Speak", text, new Variant(flags)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 * @return the result is of type int
	 */
	public int speak(String text) {
		return Dispatch.call(this, "Speak", text).changeType(Variant.VariantInt).getInt();
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param stream an input-parameter of type ISpeechBaseStream
	 * @param flags an input-parameter of type int
	 * @return the result is of type int
	 */
	public int speakStream(ISpeechBaseStream stream, int flags) {
		return Dispatch.call(this, "SpeakStream", stream, new Variant(flags)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param stream an input-parameter of type ISpeechBaseStream
	 * @return the result is of type int
	 */
	public int speakStream(ISpeechBaseStream stream) {
		return Dispatch.call(this, "SpeakStream", stream).changeType(Variant.VariantInt).getInt();
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void pause() {
		Dispatch.call(this, "Pause");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void resume() {
		Dispatch.call(this, "Resume");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type String
	 * @param numItems an input-parameter of type int
	 * @return the result is of type int
	 */
	public int skip(String type, int numItems) {
		return Dispatch.call(this, "Skip", type, new Variant(numItems)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requiredAttributes an input-parameter of type String
	 * @param optionalAttributes an input-parameter of type String
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getVoices(String requiredAttributes, String optionalAttributes) {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetVoices", requiredAttributes, optionalAttributes).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requiredAttributes an input-parameter of type String
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getVoices(String requiredAttributes) {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetVoices", requiredAttributes).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getVoices() {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetVoices").toDispatch());
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requiredAttributes an input-parameter of type String
	 * @param optionalAttributes an input-parameter of type String
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getAudioOutputs(String requiredAttributes, String optionalAttributes) {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetAudioOutputs", requiredAttributes, optionalAttributes).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param requiredAttributes an input-parameter of type String
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getAudioOutputs(String requiredAttributes) {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetAudioOutputs", requiredAttributes).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechObjectTokens
	 */
	public ISpeechObjectTokens getAudioOutputs() {
		return new ISpeechObjectTokens(Dispatch.call(this, "GetAudioOutputs").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param msTimeout an input-parameter of type int
	 * @return the result is of type boolean
	 */
	public boolean waitUntilDone(int msTimeout) {
		return Dispatch.call(this, "WaitUntilDone", new Variant(msTimeout)).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int speakCompleteEvent() {
		return Dispatch.call(this, "SpeakCompleteEvent").changeType(Variant.VariantInt).getInt();
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

	

}
