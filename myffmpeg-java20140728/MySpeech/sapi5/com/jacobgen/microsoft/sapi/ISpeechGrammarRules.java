/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechGrammarRules extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechGrammarRules";

	public ISpeechGrammarRules() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechGrammarRules(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechGrammarRules(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param ruleNameOrId an input-parameter of type Variant
	 * @return the result is of type ISpeechGrammarRule
	 */
	public ISpeechGrammarRule findRule(Variant ruleNameOrId) {
		return new ISpeechGrammarRule(Dispatch.call(this, "FindRule", ruleNameOrId).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type ISpeechGrammarRule
	 */
	public ISpeechGrammarRule item(int index) {
		return new ISpeechGrammarRule(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant get_NewEnum() {
		return Dispatch.get(this, "_NewEnum");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDynamic() {
		return Dispatch.get(this, "Dynamic").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param ruleName an input-parameter of type String
	 * @param attributes an input-parameter of type int
	 * @param ruleId an input-parameter of type int
	 * @return the result is of type ISpeechGrammarRule
	 */
	public ISpeechGrammarRule add(String ruleName, int attributes, int ruleId) {
		return new ISpeechGrammarRule(Dispatch.call(this, "Add", ruleName, new Variant(attributes), new Variant(ruleId)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param ruleName an input-parameter of type String
	 * @param attributes an input-parameter of type int
	 * @return the result is of type ISpeechGrammarRule
	 */
	public ISpeechGrammarRule add(String ruleName, int attributes) {
		return new ISpeechGrammarRule(Dispatch.call(this, "Add", ruleName, new Variant(attributes)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param ruleName an input-parameter of type String
	 * @param attributes an input-parameter of type int
	 * @param ruleId an input-parameter of type int
	 * @return the result is of type ISpeechGrammarRule
	 */
	public ISpeechGrammarRule add(String ruleName, int attributes, int ruleId) {
		ISpeechGrammarRule result_of_Add = new ISpeechGrammarRule(Dispatch.call(this, "Add", ruleName, new Variant(attributes), new Variant(ruleId)).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void commit() {
		Dispatch.call(this, "Commit");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param errorText an input-parameter of type String
	 * @return the result is of type Variant
	 */
	public Variant commitAndSave(String errorText) {
		return Dispatch.call(this, "CommitAndSave", errorText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param errorText is an one-element array which sends the input-parameter
	 *                  to the ActiveX-Component and receives the output-parameter
	 * @return the result is of type Variant
	 */
	public Variant commitAndSave(String[] errorText) {
		Variant vnt_errorText = new Variant();
		if( errorText == null || errorText.length == 0 )
			vnt_errorText.putNoParam();
		else
			vnt_errorText.putStringRef(errorText[0]);

		Variant result_of_CommitAndSave = Dispatch.call(this, "CommitAndSave", vnt_errorText);

		if( errorText != null && errorText.length > 0 )
			errorText[0] = vnt_errorText.toString();

		return result_of_CommitAndSave;
	}

}
