/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechGrammarRuleState extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechGrammarRuleState";

	public ISpeechGrammarRuleState() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechGrammarRuleState(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechGrammarRuleState(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechGrammarRule
	 */
	public ISpeechGrammarRule getRule() {
		return new ISpeechGrammarRule(Dispatch.get(this, "Rule").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechGrammarRuleStateTransitions
	 */
	public ISpeechGrammarRuleStateTransitions getTransitions() {
		return new ISpeechGrammarRuleStateTransitions(Dispatch.get(this, "Transitions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destState an input-parameter of type ISpeechGrammarRuleState
	 * @param words an input-parameter of type String
	 * @param separators an input-parameter of type String
	 * @param type an input-parameter of type int
	 * @param propertyName an input-parameter of type String
	 * @param propertyId an input-parameter of type int
	 * @param propertyValue an input-parameter of type Variant
	 * @param weight an input-parameter of type float
	 */
	public void addWordTransition(ISpeechGrammarRuleState destState, String words, String separators, int type, String propertyName, int propertyId, Variant propertyValue, float weight) {
		Dispatch.call(this, "AddWordTransition", destState, words, separators, new Variant(type), propertyName, new Variant(propertyId), propertyValue, new Variant(weight));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destState an input-parameter of type ISpeechGrammarRuleState
	 * @param words an input-parameter of type String
	 * @param separators an input-parameter of type String
	 * @param type an input-parameter of type int
	 * @param propertyName an input-parameter of type String
	 * @param propertyId an input-parameter of type int
	 * @param propertyValue an input-parameter of type Variant
	 */
	public void addWordTransition(ISpeechGrammarRuleState destState, String words, String separators, int type, String propertyName, int propertyId, Variant propertyValue) {
		Dispatch.call(this, "AddWordTransition", destState, words, separators, new Variant(type), propertyName, new Variant(propertyId), propertyValue);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destState an input-parameter of type ISpeechGrammarRuleState
	 * @param words an input-parameter of type String
	 * @param separators an input-parameter of type String
	 * @param type an input-parameter of type int
	 * @param propertyName an input-parameter of type String
	 * @param propertyId an input-parameter of type int
	 */
	public void addWordTransition(ISpeechGrammarRuleState destState, String words, String separators, int type, String propertyName, int propertyId) {
		Dispatch.call(this, "AddWordTransition", destState, words, separators, new Variant(type), propertyName, new Variant(propertyId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destState an input-parameter of type ISpeechGrammarRuleState
	 * @param words an input-parameter of type String
	 * @param separators an input-parameter of type String
	 * @param type an input-parameter of type int
	 * @param propertyName an input-parameter of type String
	 */
	public void addWordTransition(ISpeechGrammarRuleState destState, String words, String separators, int type, String propertyName) {
		Dispatch.call(this, "AddWordTransition", destState, words, separators, new Variant(type), propertyName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destState an input-parameter of type ISpeechGrammarRuleState
	 * @param words an input-parameter of type String
	 * @param separators an input-parameter of type String
	 * @param type an input-parameter of type int
	 */
	public void addWordTransition(ISpeechGrammarRuleState destState, String words, String separators, int type) {
		Dispatch.call(this, "AddWordTransition", destState, words, separators, new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destState an input-parameter of type ISpeechGrammarRuleState
	 * @param words an input-parameter of type String
	 * @param separators an input-parameter of type String
	 */
	public void addWordTransition(ISpeechGrammarRuleState destState, String words, String separators) {
		Dispatch.call(this, "AddWordTransition", destState, words, separators);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destState an input-parameter of type ISpeechGrammarRuleState
	 * @param words an input-parameter of type String
	 */
	public void addWordTransition(ISpeechGrammarRuleState destState, String words) {
		Dispatch.call(this, "AddWordTransition", destState, words);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param destState an input-parameter of type ISpeechGrammarRuleState
	 * @param words an input-parameter of type String
	 * @param separators an input-parameter of type String
	 * @param type an input-parameter of type int
	 * @param propertyName an input-parameter of type String
	 * @param propertyId an input-parameter of type int
	 * @param propertyValue an input-parameter of type Variant
	 * @param weight an input-parameter of type float
	 */
	public void addWordTransition(ISpeechGrammarRuleState destState, String words, String separators, int type, String propertyName, int propertyId, Variant propertyValue, float weight) {
		Dispatch.call(this, "AddWordTransition", destState, words, separators, new Variant(type), propertyName, new Variant(propertyId), propertyValue, new Variant(weight));

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destinationState an input-parameter of type ISpeechGrammarRuleState
	 * @param rule an input-parameter of type ISpeechGrammarRule
	 * @param propertyName an input-parameter of type String
	 * @param propertyId an input-parameter of type int
	 * @param propertyValue an input-parameter of type Variant
	 * @param weight an input-parameter of type float
	 */
	public void addRuleTransition(ISpeechGrammarRuleState destinationState, ISpeechGrammarRule rule, String propertyName, int propertyId, Variant propertyValue, float weight) {
		Dispatch.call(this, "AddRuleTransition", destinationState, rule, propertyName, new Variant(propertyId), propertyValue, new Variant(weight));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destinationState an input-parameter of type ISpeechGrammarRuleState
	 * @param rule an input-parameter of type ISpeechGrammarRule
	 * @param propertyName an input-parameter of type String
	 * @param propertyId an input-parameter of type int
	 * @param propertyValue an input-parameter of type Variant
	 */
	public void addRuleTransition(ISpeechGrammarRuleState destinationState, ISpeechGrammarRule rule, String propertyName, int propertyId, Variant propertyValue) {
		Dispatch.call(this, "AddRuleTransition", destinationState, rule, propertyName, new Variant(propertyId), propertyValue);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destinationState an input-parameter of type ISpeechGrammarRuleState
	 * @param rule an input-parameter of type ISpeechGrammarRule
	 * @param propertyName an input-parameter of type String
	 * @param propertyId an input-parameter of type int
	 */
	public void addRuleTransition(ISpeechGrammarRuleState destinationState, ISpeechGrammarRule rule, String propertyName, int propertyId) {
		Dispatch.call(this, "AddRuleTransition", destinationState, rule, propertyName, new Variant(propertyId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destinationState an input-parameter of type ISpeechGrammarRuleState
	 * @param rule an input-parameter of type ISpeechGrammarRule
	 * @param propertyName an input-parameter of type String
	 */
	public void addRuleTransition(ISpeechGrammarRuleState destinationState, ISpeechGrammarRule rule, String propertyName) {
		Dispatch.call(this, "AddRuleTransition", destinationState, rule, propertyName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destinationState an input-parameter of type ISpeechGrammarRuleState
	 * @param rule an input-parameter of type ISpeechGrammarRule
	 */
	public void addRuleTransition(ISpeechGrammarRuleState destinationState, ISpeechGrammarRule rule) {
		Dispatch.call(this, "AddRuleTransition", destinationState, rule);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param destinationState an input-parameter of type ISpeechGrammarRuleState
	 * @param rule an input-parameter of type ISpeechGrammarRule
	 * @param propertyName an input-parameter of type String
	 * @param propertyId an input-parameter of type int
	 * @param propertyValue an input-parameter of type Variant
	 * @param weight an input-parameter of type float
	 */
	public void addRuleTransition(ISpeechGrammarRuleState destinationState, ISpeechGrammarRule rule, String propertyName, int propertyId, Variant propertyValue, float weight) {
		Dispatch.call(this, "AddRuleTransition", destinationState, rule, propertyName, new Variant(propertyId), propertyValue, new Variant(weight));

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destinationState an input-parameter of type ISpeechGrammarRuleState
	 * @param type an input-parameter of type int
	 * @param propertyName an input-parameter of type String
	 * @param propertyId an input-parameter of type int
	 * @param propertyValue an input-parameter of type Variant
	 * @param weight an input-parameter of type float
	 */
	public void addSpecialTransition(ISpeechGrammarRuleState destinationState, int type, String propertyName, int propertyId, Variant propertyValue, float weight) {
		Dispatch.call(this, "AddSpecialTransition", destinationState, new Variant(type), propertyName, new Variant(propertyId), propertyValue, new Variant(weight));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destinationState an input-parameter of type ISpeechGrammarRuleState
	 * @param type an input-parameter of type int
	 * @param propertyName an input-parameter of type String
	 * @param propertyId an input-parameter of type int
	 * @param propertyValue an input-parameter of type Variant
	 */
	public void addSpecialTransition(ISpeechGrammarRuleState destinationState, int type, String propertyName, int propertyId, Variant propertyValue) {
		Dispatch.call(this, "AddSpecialTransition", destinationState, new Variant(type), propertyName, new Variant(propertyId), propertyValue);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destinationState an input-parameter of type ISpeechGrammarRuleState
	 * @param type an input-parameter of type int
	 * @param propertyName an input-parameter of type String
	 * @param propertyId an input-parameter of type int
	 */
	public void addSpecialTransition(ISpeechGrammarRuleState destinationState, int type, String propertyName, int propertyId) {
		Dispatch.call(this, "AddSpecialTransition", destinationState, new Variant(type), propertyName, new Variant(propertyId));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destinationState an input-parameter of type ISpeechGrammarRuleState
	 * @param type an input-parameter of type int
	 * @param propertyName an input-parameter of type String
	 */
	public void addSpecialTransition(ISpeechGrammarRuleState destinationState, int type, String propertyName) {
		Dispatch.call(this, "AddSpecialTransition", destinationState, new Variant(type), propertyName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destinationState an input-parameter of type ISpeechGrammarRuleState
	 * @param type an input-parameter of type int
	 */
	public void addSpecialTransition(ISpeechGrammarRuleState destinationState, int type) {
		Dispatch.call(this, "AddSpecialTransition", destinationState, new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param destinationState an input-parameter of type ISpeechGrammarRuleState
	 * @param type an input-parameter of type int
	 * @param propertyName an input-parameter of type String
	 * @param propertyId an input-parameter of type int
	 * @param propertyValue an input-parameter of type Variant
	 * @param weight an input-parameter of type float
	 */
	public void addSpecialTransition(ISpeechGrammarRuleState destinationState, int type, String propertyName, int propertyId, Variant propertyValue, float weight) {
		Dispatch.call(this, "AddSpecialTransition", destinationState, new Variant(type), propertyName, new Variant(propertyId), propertyValue, new Variant(weight));

	}

}
