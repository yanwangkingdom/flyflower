/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechRecoGrammar extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechRecoGrammar";

	public ISpeechRecoGrammar() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechRecoGrammar(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechRecoGrammar(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getId() {
		return Dispatch.get(this, "Id");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechRecoContext
	 */
	public ISpeechRecoContext getRecoContext() {
		return new ISpeechRecoContext(Dispatch.get(this, "RecoContext").toDispatch());
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
	 * @return the result is of type ISpeechGrammarRules
	 */
	public ISpeechGrammarRules getRules() {
		return new ISpeechGrammarRules(Dispatch.get(this, "Rules").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param newLanguage an input-parameter of type int
	 */
	public void reset(int newLanguage) {
		Dispatch.call(this, "Reset", new Variant(newLanguage));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void reset() {
		Dispatch.call(this, "Reset");
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param loadOption an input-parameter of type int
	 */
	public void cmdLoadFromFile(String fileName, int loadOption) {
		Dispatch.call(this, "CmdLoadFromFile", fileName, new Variant(loadOption));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void cmdLoadFromFile(String fileName) {
		Dispatch.call(this, "CmdLoadFromFile", fileName);
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classId an input-parameter of type String
	 * @param grammarName an input-parameter of type String
	 * @param loadOption an input-parameter of type int
	 */
	public void cmdLoadFromObject(String classId, String grammarName, int loadOption) {
		Dispatch.call(this, "CmdLoadFromObject", classId, grammarName, new Variant(loadOption));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param classId an input-parameter of type String
	 * @param grammarName an input-parameter of type String
	 */
	public void cmdLoadFromObject(String classId, String grammarName) {
		Dispatch.call(this, "CmdLoadFromObject", classId, grammarName);
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hModule an input-parameter of type int
	 * @param resourceName an input-parameter of type Variant
	 * @param resourceType an input-parameter of type Variant
	 * @param languageId an input-parameter of type int
	 * @param loadOption an input-parameter of type int
	 */
	public void cmdLoadFromResource(int hModule, Variant resourceName, Variant resourceType, int languageId, int loadOption) {
		Dispatch.call(this, "CmdLoadFromResource", new Variant(hModule), resourceName, resourceType, new Variant(languageId), new Variant(loadOption));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hModule an input-parameter of type int
	 * @param resourceName an input-parameter of type Variant
	 * @param resourceType an input-parameter of type Variant
	 * @param languageId an input-parameter of type int
	 */
	public void cmdLoadFromResource(int hModule, Variant resourceName, Variant resourceType, int languageId) {
		Dispatch.call(this, "CmdLoadFromResource", new Variant(hModule), resourceName, resourceType, new Variant(languageId));
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param grammarData an input-parameter of type Variant
	 * @param loadOption an input-parameter of type int
	 */
	public void cmdLoadFromMemory(Variant grammarData, int loadOption) {
		Dispatch.call(this, "CmdLoadFromMemory", grammarData, new Variant(loadOption));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param grammarData an input-parameter of type Variant
	 */
	public void cmdLoadFromMemory(Variant grammarData) {
		Dispatch.call(this, "CmdLoadFromMemory", grammarData);
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param proprietaryGuid an input-parameter of type String
	 * @param proprietaryString an input-parameter of type String
	 * @param proprietaryData an input-parameter of type Variant
	 * @param loadOption an input-parameter of type int
	 */
	public void cmdLoadFromProprietaryGrammar(String proprietaryGuid, String proprietaryString, Variant proprietaryData, int loadOption) {
		Dispatch.call(this, "CmdLoadFromProprietaryGrammar", proprietaryGuid, proprietaryString, proprietaryData, new Variant(loadOption));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param proprietaryGuid an input-parameter of type String
	 * @param proprietaryString an input-parameter of type String
	 * @param proprietaryData an input-parameter of type Variant
	 */
	public void cmdLoadFromProprietaryGrammar(String proprietaryGuid, String proprietaryString, Variant proprietaryData) {
		Dispatch.call(this, "CmdLoadFromProprietaryGrammar", proprietaryGuid, proprietaryString, proprietaryData);
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param state an input-parameter of type int
	 */
	public void cmdSetRuleState(String name, int state) {
		Dispatch.call(this, "CmdSetRuleState", name, new Variant(state));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param ruleId an input-parameter of type int
	 * @param state an input-parameter of type int
	 */
	public void cmdSetRuleIdState(int ruleId, int state) {
		Dispatch.call(this, "CmdSetRuleIdState", new Variant(ruleId), new Variant(state));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param topicName an input-parameter of type String
	 * @param loadOption an input-parameter of type int
	 */
	public void dictationLoad(String topicName, int loadOption) {
		Dispatch.call(this, "DictationLoad", topicName, new Variant(loadOption));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param topicName an input-parameter of type String
	 */
	public void dictationLoad(String topicName) {
		Dispatch.call(this, "DictationLoad", topicName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void dictationLoad() {
		Dispatch.call(this, "DictationLoad");
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void dictationUnload() {
		Dispatch.call(this, "DictationUnload");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param state an input-parameter of type int
	 */
	public void dictationSetState(int state) {
		Dispatch.call(this, "DictationSetState", new Variant(state));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 * @param textLength an input-parameter of type int
	 * @param info an input-parameter of type ISpeechTextSelectionInformation
	 */
	public void setWordSequenceData(String text, int textLength, ISpeechTextSelectionInformation info) {
		Dispatch.call(this, "SetWordSequenceData", text, new Variant(textLength), info);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param info an input-parameter of type ISpeechTextSelectionInformation
	 */
	public void setTextSelection(ISpeechTextSelectionInformation info) {
		Dispatch.call(this, "SetTextSelection", info);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @return the result is of type int
	 */
	public int isPronounceable(String word) {
		return Dispatch.call(this, "IsPronounceable", word).changeType(Variant.VariantInt).getInt();
	}

}
