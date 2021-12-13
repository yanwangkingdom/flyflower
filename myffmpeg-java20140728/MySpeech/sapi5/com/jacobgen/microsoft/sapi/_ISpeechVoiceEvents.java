/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class _ISpeechVoiceEvents extends Dispatch {

	public static final String componentName = "SpeechLib._ISpeechVoiceEvents";

	public _ISpeechVoiceEvents() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public _ISpeechVoiceEvents(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public _ISpeechVoiceEvents(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 */
	public void startStream(int streamNumber, Variant streamPosition) {
		Dispatch.call(this, "StartStream", new Variant(streamNumber), streamPosition);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 */
	public void endStream(int streamNumber, Variant streamPosition) {
		Dispatch.call(this, "EndStream", new Variant(streamNumber), streamPosition);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param voiceObjectToken an input-parameter of type ISpeechObjectToken
	 */
	public void voiceChange(int streamNumber, Variant streamPosition, ISpeechObjectToken voiceObjectToken) {
		Dispatch.call(this, "VoiceChange", new Variant(streamNumber), streamPosition, voiceObjectToken);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param bookmark an input-parameter of type String
	 * @param bookmarkId an input-parameter of type int
	 */
	public void bookmark(int streamNumber, Variant streamPosition, String bookmark, int bookmarkId) {
		Dispatch.call(this, "Bookmark", new Variant(streamNumber), streamPosition, bookmark, new Variant(bookmarkId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param characterPosition an input-parameter of type int
	 * @param length an input-parameter of type int
	 */
	public void word(int streamNumber, Variant streamPosition, int characterPosition, int length) {
		Dispatch.call(this, "Word", new Variant(streamNumber), streamPosition, new Variant(characterPosition), new Variant(length));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param characterPosition an input-parameter of type int
	 * @param length an input-parameter of type int
	 */
	public void sentence(int streamNumber, Variant streamPosition, int characterPosition, int length) {
		Dispatch.call(this, "Sentence", new Variant(streamNumber), streamPosition, new Variant(characterPosition), new Variant(length));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param duration an input-parameter of type int
	 * @param nextPhoneId an input-parameter of type short
	 * @param feature an input-parameter of type int
	 * @param currentPhoneId an input-parameter of type short
	 */
	public void phoneme(int streamNumber, Variant streamPosition, int duration, short nextPhoneId, int feature, short currentPhoneId) {
		Dispatch.call(this, "Phoneme", new Variant(streamNumber), streamPosition, new Variant(duration), new Variant(nextPhoneId), new Variant(feature), new Variant(currentPhoneId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param duration an input-parameter of type int
	 * @param nextVisemeId an input-parameter of type int
	 * @param feature an input-parameter of type int
	 * @param currentVisemeId an input-parameter of type int
	 */
	public void viseme(int streamNumber, Variant streamPosition, int duration, int nextVisemeId, int feature, int currentVisemeId) {
		Dispatch.call(this, "Viseme", new Variant(streamNumber), streamPosition, new Variant(duration), new Variant(nextVisemeId), new Variant(feature), new Variant(currentVisemeId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param audioLevel an input-parameter of type int
	 */
	public void audioLevel(int streamNumber, Variant streamPosition, int audioLevel) {
		Dispatch.call(this, "AudioLevel", new Variant(streamNumber), streamPosition, new Variant(audioLevel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type int
	 * @param engineData an input-parameter of type Variant
	 */
	public void enginePrivate(int streamNumber, int streamPosition, Variant engineData) {
		Dispatch.call(this, "EnginePrivate", new Variant(streamNumber), new Variant(streamPosition), engineData);
	}

}
