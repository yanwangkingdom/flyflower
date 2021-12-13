/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechRecoContext extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechRecoContext";

	public ISpeechRecoContext() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechRecoContext(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechRecoContext(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechRecognizer
	 */
	public ISpeechRecognizer getRecognizer() {
		return new ISpeechRecognizer(Dispatch.get(this, "Recognizer").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAudioInputInterferenceStatus() {
		return Dispatch.get(this, "AudioInputInterferenceStatus").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getRequestedUIType() {
		return Dispatch.get(this, "RequestedUIType").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param voice an input-parameter of type ISpeechVoice
	 */
	public void setVoice(ISpeechVoice voice) {
		Dispatch.put(this, "Voice", voice);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechVoice
	 */
	public ISpeechVoice getVoice() {
		return new ISpeechVoice(Dispatch.get(this, "Voice").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param allowVoiceFormatMatchingOnNextSet an input-parameter of type boolean
	 */
	public void setAllowVoiceFormatMatchingOnNextSet(boolean allowVoiceFormatMatchingOnNextSet) {
		Dispatch.put(this, "AllowVoiceFormatMatchingOnNextSet", new Variant(allowVoiceFormatMatchingOnNextSet));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAllowVoiceFormatMatchingOnNextSet() {
		return Dispatch.get(this, "AllowVoiceFormatMatchingOnNextSet").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param voicePurgeEvent an input-parameter of type int
	 */
	public void setVoicePurgeEvent(int voicePurgeEvent) {
		Dispatch.put(this, "VoicePurgeEvent", new Variant(voicePurgeEvent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getVoicePurgeEvent() {
		return Dispatch.get(this, "VoicePurgeEvent").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type int
	 */
	public int getEventInterests() {
		return Dispatch.get(this, "EventInterests").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cmdMaxAlternates an input-parameter of type int
	 */
	public void setCmdMaxAlternates(int cmdMaxAlternates) {
		Dispatch.put(this, "CmdMaxAlternates", new Variant(cmdMaxAlternates));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCmdMaxAlternates() {
		return Dispatch.get(this, "CmdMaxAlternates").changeType(Variant.VariantInt).getInt();
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
	 * @param retainedAudio an input-parameter of type int
	 */
	public void setRetainedAudio(int retainedAudio) {
		Dispatch.put(this, "RetainedAudio", new Variant(retainedAudio));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRetainedAudio() {
		return Dispatch.get(this, "RetainedAudio").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param retainedAudioFormat an input-parameter of type ISpeechAudioFormat
	 */
	public void setRetainedAudioFormat(ISpeechAudioFormat retainedAudioFormat) {
		Dispatch.put(this, "RetainedAudioFormat", retainedAudioFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechAudioFormat
	 */
	public ISpeechAudioFormat getRetainedAudioFormat() {
		return new ISpeechAudioFormat(Dispatch.get(this, "RetainedAudioFormat").toDispatch());
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
	 * @param grammarId an input-parameter of type Variant
	 * @return the result is of type ISpeechRecoGrammar
	 */
	public ISpeechRecoGrammar createGrammar(Variant grammarId) {
		return new ISpeechRecoGrammar(Dispatch.call(this, "CreateGrammar", grammarId).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechRecoGrammar
	 */
	public ISpeechRecoGrammar createGrammar() {
		return new ISpeechRecoGrammar(Dispatch.call(this, "CreateGrammar").toDispatch());
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param resultBlock an input-parameter of type Variant
	 * @return the result is of type ISpeechRecoResult
	 */
	public ISpeechRecoResult createResultFromMemory(Variant resultBlock) {
		return new ISpeechRecoResult(Dispatch.call(this, "CreateResultFromMemory", resultBlock).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param options an input-parameter of type int
	 * @param streamPos an input-parameter of type Variant
	 * @param bookmarkId an input-parameter of type Variant
	 */
	public void bookmark(int options, Variant streamPos, Variant bookmarkId) {
		Dispatch.call(this, "Bookmark", new Variant(options), streamPos, bookmarkId);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param adaptationString an input-parameter of type String
	 */
	public void setAdaptationData(String adaptationString) {
		Dispatch.call(this, "SetAdaptationData", adaptationString);
	}
	
	public void WaitForNotifyEvent(int dwMilliseconds){
		Dispatch.call(this, "WaitForNotifyEvent", new Variant(dwMilliseconds));
	}
	
	public void SetNotifyWin32Event(){
		Dispatch.call(this, "SetNotifyWin32Event");
	}

}
