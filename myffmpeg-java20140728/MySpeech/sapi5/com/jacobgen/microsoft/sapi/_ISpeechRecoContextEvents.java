/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class _ISpeechRecoContextEvents extends Dispatch {

	public static final String componentName = "SpeechLib._ISpeechRecoContextEvents";

	public _ISpeechRecoContextEvents() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public _ISpeechRecoContextEvents(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public _ISpeechRecoContextEvents(String compName) {
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
	 * @param streamReleased an input-parameter of type boolean
	 */
	public void endStream(int streamNumber, Variant streamPosition, boolean streamReleased) {
		Dispatch.call(this, "EndStream", new Variant(streamNumber), streamPosition, new Variant(streamReleased));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param bookmarkId an input-parameter of type Variant
	 * @param options an input-parameter of type int
	 */
	public void bookmark(int streamNumber, Variant streamPosition, Variant bookmarkId, int options) {
		Dispatch.call(this, "Bookmark", new Variant(streamNumber), streamPosition, bookmarkId, new Variant(options));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 */
	public void soundStart(int streamNumber, Variant streamPosition) {
		Dispatch.call(this, "SoundStart", new Variant(streamNumber), streamPosition);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 */
	public void soundEnd(int streamNumber, Variant streamPosition) {
		Dispatch.call(this, "SoundEnd", new Variant(streamNumber), streamPosition);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 */
	public void phraseStart(int streamNumber, Variant streamPosition) {
		Dispatch.call(this, "PhraseStart", new Variant(streamNumber), streamPosition);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param recognitionType an input-parameter of type int
	 * @param result an input-parameter of type ISpeechRecoResult
	 */
	public void recognition(int streamNumber, Variant streamPosition, int recognitionType, ISpeechRecoResult result) {
		Dispatch.call(this, "Recognition", new Variant(streamNumber), streamPosition, new Variant(recognitionType), result);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param result an input-parameter of type ISpeechRecoResult
	 */
	public void hypothesis(int streamNumber, Variant streamPosition, ISpeechRecoResult result) {
		Dispatch.call(this, "Hypothesis", new Variant(streamNumber), streamPosition, result);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param propertyName an input-parameter of type String
	 * @param newNumberValue an input-parameter of type int
	 */
	public void propertyNumberChange(int streamNumber, Variant streamPosition, String propertyName, int newNumberValue) {
		Dispatch.call(this, "PropertyNumberChange", new Variant(streamNumber), streamPosition, propertyName, new Variant(newNumberValue));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param propertyName an input-parameter of type String
	 * @param newStringValue an input-parameter of type String
	 */
	public void propertyStringChange(int streamNumber, Variant streamPosition, String propertyName, String newStringValue) {
		Dispatch.call(this, "PropertyStringChange", new Variant(streamNumber), streamPosition, propertyName, newStringValue);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param result an input-parameter of type ISpeechRecoResult
	 */
	public void falseRecognition(int streamNumber, Variant streamPosition, ISpeechRecoResult result) {
		Dispatch.call(this, "FalseRecognition", new Variant(streamNumber), streamPosition, result);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param interference an input-parameter of type int
	 */
	public void interference(int streamNumber, Variant streamPosition, int interference) {
		Dispatch.call(this, "Interference", new Variant(streamNumber), streamPosition, new Variant(interference));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param uIType an input-parameter of type String
	 */
	public void requestUI(int streamNumber, Variant streamPosition, String uIType) {
		Dispatch.call(this, "RequestUI", new Variant(streamNumber), streamPosition, uIType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 * @param newState an input-parameter of type int
	 */
	public void recognizerStateChange(int streamNumber, Variant streamPosition, int newState) {
		Dispatch.call(this, "RecognizerStateChange", new Variant(streamNumber), streamPosition, new Variant(newState));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 */
	public void adaptation(int streamNumber, Variant streamPosition) {
		Dispatch.call(this, "Adaptation", new Variant(streamNumber), streamPosition);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param streamNumber an input-parameter of type int
	 * @param streamPosition an input-parameter of type Variant
	 */
	public void recognitionForOtherContext(int streamNumber, Variant streamPosition) {
		Dispatch.call(this, "RecognitionForOtherContext", new Variant(streamNumber), streamPosition);
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
	 * @param streamPosition an input-parameter of type Variant
	 * @param engineData an input-parameter of type Variant
	 */
	public void enginePrivate(int streamNumber, Variant streamPosition, Variant engineData) {
		Dispatch.call(this, "EnginePrivate", new Variant(streamNumber), streamPosition, engineData);
	}

}
