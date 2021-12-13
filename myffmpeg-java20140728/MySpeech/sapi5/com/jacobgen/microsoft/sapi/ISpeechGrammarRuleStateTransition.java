/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechGrammarRuleStateTransition extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechGrammarRuleStateTransition";

	public ISpeechGrammarRuleStateTransition() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechGrammarRuleStateTransition(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechGrammarRuleStateTransition(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getType() {
		return Dispatch.get(this, "Type").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getText() {
		return Dispatch.get(this, "Text").toString();
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
	 * @return the result is of type Variant
	 */
	public Variant getWeight() {
		return Dispatch.get(this, "Weight");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getPropertyName() {
		return Dispatch.get(this, "PropertyName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPropertyId() {
		return Dispatch.get(this, "PropertyId").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getPropertyValue() {
		return Dispatch.get(this, "PropertyValue");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechGrammarRuleState
	 */
	public ISpeechGrammarRuleState getNextState() {
		return new ISpeechGrammarRuleState(Dispatch.get(this, "NextState").toDispatch());
	}

}
