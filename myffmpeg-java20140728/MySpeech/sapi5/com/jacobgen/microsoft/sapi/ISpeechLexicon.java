/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechLexicon extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechLexicon";

	public ISpeechLexicon() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechLexicon(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechLexicon(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getGenerationId() {
		return Dispatch.get(this, "GenerationId").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param flags an input-parameter of type int
	 * @param generationId an input-parameter of type int
	 * @return the result is of type ISpeechLexiconWords
	 */
	public ISpeechLexiconWords getWords(int flags, int generationId) {
		return new ISpeechLexiconWords(Dispatch.call(this, "GetWords", new Variant(flags), new Variant(generationId)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param flags an input-parameter of type int
	 * @return the result is of type ISpeechLexiconWords
	 */
	public ISpeechLexiconWords getWords(int flags) {
		return new ISpeechLexiconWords(Dispatch.call(this, "GetWords", new Variant(flags)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechLexiconWords
	 */
	public ISpeechLexiconWords getWords() {
		return new ISpeechLexiconWords(Dispatch.call(this, "GetWords").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param flags an input-parameter of type int
	 * @param generationId is an one-element array which sends the input-parameter
	 *                     to the ActiveX-Component and receives the output-parameter
	 * @return the result is of type ISpeechLexiconWords
	 */
	public ISpeechLexiconWords getWords(int flags, int[] generationId) {
		Variant vnt_generationId = new Variant();
		if( generationId == null || generationId.length == 0 )
			vnt_generationId.putNoParam();
		else
			vnt_generationId.putIntRef(generationId[0]);

		ISpeechLexiconWords result_of_GetWords = new ISpeechLexiconWords(Dispatch.call(this, "GetWords", new Variant(flags), vnt_generationId).toDispatch());

		if( generationId != null && generationId.length > 0 )
			generationId[0] = vnt_generationId.toInt();

		return result_of_GetWords;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param partOfSpeech an input-parameter of type int
	 * @param bstrPronunciation an input-parameter of type String
	 */
	public void addPronunciation(String bstrWord, int langId, int partOfSpeech, String bstrPronunciation) {
		Dispatch.call(this, "AddPronunciation", bstrWord, new Variant(langId), new Variant(partOfSpeech), bstrPronunciation);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param partOfSpeech an input-parameter of type int
	 */
	public void addPronunciation(String bstrWord, int langId, int partOfSpeech) {
		Dispatch.call(this, "AddPronunciation", bstrWord, new Variant(langId), new Variant(partOfSpeech));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 */
	public void addPronunciation(String bstrWord, int langId) {
		Dispatch.call(this, "AddPronunciation", bstrWord, new Variant(langId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param partOfSpeech an input-parameter of type int
	 * @param bstrPronunciation an input-parameter of type String
	 */
	public void addPronunciation(String bstrWord, int langId, int partOfSpeech, String bstrPronunciation) {
		Dispatch.call(this, "AddPronunciation", bstrWord, new Variant(langId), new Variant(partOfSpeech), bstrPronunciation);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param partOfSpeech an input-parameter of type int
	 * @param phoneIds an input-parameter of type Variant
	 */
	public void addPronunciationByPhoneIds(String bstrWord, int langId, int partOfSpeech, Variant phoneIds) {
		Dispatch.call(this, "AddPronunciationByPhoneIds", bstrWord, new Variant(langId), new Variant(partOfSpeech), phoneIds);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param partOfSpeech an input-parameter of type int
	 */
	public void addPronunciationByPhoneIds(String bstrWord, int langId, int partOfSpeech) {
		Dispatch.call(this, "AddPronunciationByPhoneIds", bstrWord, new Variant(langId), new Variant(partOfSpeech));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 */
	public void addPronunciationByPhoneIds(String bstrWord, int langId) {
		Dispatch.call(this, "AddPronunciationByPhoneIds", bstrWord, new Variant(langId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param partOfSpeech an input-parameter of type int
	 * @param phoneIds an input-parameter of type Variant
	 */
	public void addPronunciationByPhoneIds(String bstrWord, int langId, int partOfSpeech, Variant phoneIds) {
		Dispatch.call(this, "AddPronunciationByPhoneIds", bstrWord, new Variant(langId), new Variant(partOfSpeech), phoneIds);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param partOfSpeech an input-parameter of type int
	 * @param bstrPronunciation an input-parameter of type String
	 */
	public void removePronunciation(String bstrWord, int langId, int partOfSpeech, String bstrPronunciation) {
		Dispatch.call(this, "RemovePronunciation", bstrWord, new Variant(langId), new Variant(partOfSpeech), bstrPronunciation);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param partOfSpeech an input-parameter of type int
	 */
	public void removePronunciation(String bstrWord, int langId, int partOfSpeech) {
		Dispatch.call(this, "RemovePronunciation", bstrWord, new Variant(langId), new Variant(partOfSpeech));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 */
	public void removePronunciation(String bstrWord, int langId) {
		Dispatch.call(this, "RemovePronunciation", bstrWord, new Variant(langId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param partOfSpeech an input-parameter of type int
	 * @param bstrPronunciation an input-parameter of type String
	 */
	public void removePronunciation(String bstrWord, int langId, int partOfSpeech, String bstrPronunciation) {
		Dispatch.call(this, "RemovePronunciation", bstrWord, new Variant(langId), new Variant(partOfSpeech), bstrPronunciation);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param partOfSpeech an input-parameter of type int
	 * @param phoneIds an input-parameter of type Variant
	 */
	public void removePronunciationByPhoneIds(String bstrWord, int langId, int partOfSpeech, Variant phoneIds) {
		Dispatch.call(this, "RemovePronunciationByPhoneIds", bstrWord, new Variant(langId), new Variant(partOfSpeech), phoneIds);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param partOfSpeech an input-parameter of type int
	 */
	public void removePronunciationByPhoneIds(String bstrWord, int langId, int partOfSpeech) {
		Dispatch.call(this, "RemovePronunciationByPhoneIds", bstrWord, new Variant(langId), new Variant(partOfSpeech));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 */
	public void removePronunciationByPhoneIds(String bstrWord, int langId) {
		Dispatch.call(this, "RemovePronunciationByPhoneIds", bstrWord, new Variant(langId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param partOfSpeech an input-parameter of type int
	 * @param phoneIds an input-parameter of type Variant
	 */
	public void removePronunciationByPhoneIds(String bstrWord, int langId, int partOfSpeech, Variant phoneIds) {
		Dispatch.call(this, "RemovePronunciationByPhoneIds", bstrWord, new Variant(langId), new Variant(partOfSpeech), phoneIds);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param typeFlags an input-parameter of type int
	 * @return the result is of type ISpeechLexiconPronunciations
	 */
	public ISpeechLexiconPronunciations getPronunciations(String bstrWord, int langId, int typeFlags) {
		return new ISpeechLexiconPronunciations(Dispatch.call(this, "GetPronunciations", bstrWord, new Variant(langId), new Variant(typeFlags)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @return the result is of type ISpeechLexiconPronunciations
	 */
	public ISpeechLexiconPronunciations getPronunciations(String bstrWord, int langId) {
		return new ISpeechLexiconPronunciations(Dispatch.call(this, "GetPronunciations", bstrWord, new Variant(langId)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @return the result is of type ISpeechLexiconPronunciations
	 */
	public ISpeechLexiconPronunciations getPronunciations(String bstrWord) {
		return new ISpeechLexiconPronunciations(Dispatch.call(this, "GetPronunciations", bstrWord).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param bstrWord an input-parameter of type String
	 * @param langId an input-parameter of type int
	 * @param typeFlags an input-parameter of type int
	 * @return the result is of type ISpeechLexiconPronunciations
	 */
	public ISpeechLexiconPronunciations getPronunciations(String bstrWord, int langId, int typeFlags) {
		ISpeechLexiconPronunciations result_of_GetPronunciations = new ISpeechLexiconPronunciations(Dispatch.call(this, "GetPronunciations", bstrWord, new Variant(langId), new Variant(typeFlags)).toDispatch());


		return result_of_GetPronunciations;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param generationId an input-parameter of type int
	 * @return the result is of type ISpeechLexiconWords
	 */
	public ISpeechLexiconWords getGenerationChange(int generationId) {
		return new ISpeechLexiconWords(Dispatch.call(this, "GetGenerationChange", new Variant(generationId)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param generationId is an one-element array which sends the input-parameter
	 *                     to the ActiveX-Component and receives the output-parameter
	 * @return the result is of type ISpeechLexiconWords
	 */
	public ISpeechLexiconWords getGenerationChange(int[] generationId) {
		Variant vnt_generationId = new Variant();
		if( generationId == null || generationId.length == 0 )
			vnt_generationId.putNoParam();
		else
			vnt_generationId.putIntRef(generationId[0]);

		ISpeechLexiconWords result_of_GetGenerationChange = new ISpeechLexiconWords(Dispatch.call(this, "GetGenerationChange", vnt_generationId).toDispatch());

		if( generationId != null && generationId.length > 0 )
			generationId[0] = vnt_generationId.toInt();

		return result_of_GetGenerationChange;
	}

}
