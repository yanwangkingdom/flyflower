/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechGrammarRule extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechGrammarRule";

	public ISpeechGrammarRule() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechGrammarRule(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechGrammarRule(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAttributes() {
		return Dispatch.get(this, "Attributes").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechGrammarRuleState
	 */
	public ISpeechGrammarRuleState getInitialState() {
		return new ISpeechGrammarRuleState(Dispatch.get(this, "InitialState").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getName() {
		return Dispatch.get(this, "Name").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getId() {
		return Dispatch.get(this, "Id").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clear() {
		Dispatch.call(this, "Clear");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param resourceName an input-parameter of type String
	 * @param resourceValue an input-parameter of type String
	 */
	public void addResource(String resourceName, String resourceValue) {
		Dispatch.call(this, "AddResource", resourceName, resourceValue);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechGrammarRuleState
	 */
	public ISpeechGrammarRuleState addState() {
		return new ISpeechGrammarRuleState(Dispatch.call(this, "AddState").toDispatch());
	}

}
