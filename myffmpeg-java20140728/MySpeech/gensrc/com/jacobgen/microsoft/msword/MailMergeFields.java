/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class MailMergeFields extends Dispatch {

	public static final String componentName = "Word.MailMergeFields";

	public MailMergeFields() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public MailMergeFields(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public MailMergeFields(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Application
	 */
	public Application getApplication() {
		return new Application(Dispatch.get(this, "Application").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCreator() {
		return Dispatch.get(this, "Creator").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getParent() {
		return Dispatch.get(this, "Parent");
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
	 * @return the result is of type int
	 */
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField item(int index) {
		return new MailMergeField(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param name an input-parameter of type String
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField add(Range range, String name) {
		return new MailMergeField(Dispatch.call(this, "Add", range, name).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param name an input-parameter of type String
	 * @param prompt an input-parameter of type Variant
	 * @param defaultAskText an input-parameter of type Variant
	 * @param askOnce an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addAsk(Range range, String name, Variant prompt, Variant defaultAskText, Variant askOnce) {
		return new MailMergeField(Dispatch.call(this, "AddAsk", range, name, prompt, defaultAskText, askOnce).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param name an input-parameter of type String
	 * @param prompt an input-parameter of type Variant
	 * @param defaultAskText an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addAsk(Range range, String name, Variant prompt, Variant defaultAskText) {
		return new MailMergeField(Dispatch.call(this, "AddAsk", range, name, prompt, defaultAskText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param name an input-parameter of type String
	 * @param prompt an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addAsk(Range range, String name, Variant prompt) {
		return new MailMergeField(Dispatch.call(this, "AddAsk", range, name, prompt).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param name an input-parameter of type String
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addAsk(Range range, String name) {
		return new MailMergeField(Dispatch.call(this, "AddAsk", range, name).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param name an input-parameter of type String
	 * @param prompt an input-parameter of type Variant
	 * @param defaultAskText an input-parameter of type Variant
	 * @param askOnce an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addAsk(Range range, String name, Variant prompt, Variant defaultAskText, Variant askOnce) {
		MailMergeField result_of_AddAsk = new MailMergeField(Dispatch.call(this, "AddAsk", range, name, prompt, defaultAskText, askOnce).toDispatch());


		return result_of_AddAsk;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param prompt an input-parameter of type Variant
	 * @param defaultFillInText an input-parameter of type Variant
	 * @param askOnce an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addFillIn(Range range, Variant prompt, Variant defaultFillInText, Variant askOnce) {
		return new MailMergeField(Dispatch.call(this, "AddFillIn", range, prompt, defaultFillInText, askOnce).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param prompt an input-parameter of type Variant
	 * @param defaultFillInText an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addFillIn(Range range, Variant prompt, Variant defaultFillInText) {
		return new MailMergeField(Dispatch.call(this, "AddFillIn", range, prompt, defaultFillInText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param prompt an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addFillIn(Range range, Variant prompt) {
		return new MailMergeField(Dispatch.call(this, "AddFillIn", range, prompt).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addFillIn(Range range) {
		return new MailMergeField(Dispatch.call(this, "AddFillIn", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param prompt an input-parameter of type Variant
	 * @param defaultFillInText an input-parameter of type Variant
	 * @param askOnce an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addFillIn(Range range, Variant prompt, Variant defaultFillInText, Variant askOnce) {
		MailMergeField result_of_AddFillIn = new MailMergeField(Dispatch.call(this, "AddFillIn", range, prompt, defaultFillInText, askOnce).toDispatch());


		return result_of_AddFillIn;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @param compareTo an input-parameter of type Variant
	 * @param trueAutoText an input-parameter of type Variant
	 * @param trueText an input-parameter of type Variant
	 * @param falseAutoText an input-parameter of type Variant
	 * @param falseText an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addIf(Range range, String mergeField, int comparison, Variant compareTo, Variant trueAutoText, Variant trueText, Variant falseAutoText, Variant falseText) {
		return new MailMergeField(Dispatch.call(this, "AddIf", range, mergeField, new Variant(comparison), compareTo, trueAutoText, trueText, falseAutoText, falseText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @param compareTo an input-parameter of type Variant
	 * @param trueAutoText an input-parameter of type Variant
	 * @param trueText an input-parameter of type Variant
	 * @param falseAutoText an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addIf(Range range, String mergeField, int comparison, Variant compareTo, Variant trueAutoText, Variant trueText, Variant falseAutoText) {
		return new MailMergeField(Dispatch.call(this, "AddIf", range, mergeField, new Variant(comparison), compareTo, trueAutoText, trueText, falseAutoText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @param compareTo an input-parameter of type Variant
	 * @param trueAutoText an input-parameter of type Variant
	 * @param trueText an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addIf(Range range, String mergeField, int comparison, Variant compareTo, Variant trueAutoText, Variant trueText) {
		return new MailMergeField(Dispatch.call(this, "AddIf", range, mergeField, new Variant(comparison), compareTo, trueAutoText, trueText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @param compareTo an input-parameter of type Variant
	 * @param trueAutoText an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addIf(Range range, String mergeField, int comparison, Variant compareTo, Variant trueAutoText) {
		return new MailMergeField(Dispatch.call(this, "AddIf", range, mergeField, new Variant(comparison), compareTo, trueAutoText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @param compareTo an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addIf(Range range, String mergeField, int comparison, Variant compareTo) {
		return new MailMergeField(Dispatch.call(this, "AddIf", range, mergeField, new Variant(comparison), compareTo).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addIf(Range range, String mergeField, int comparison) {
		return new MailMergeField(Dispatch.call(this, "AddIf", range, mergeField, new Variant(comparison)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @param compareTo an input-parameter of type Variant
	 * @param trueAutoText an input-parameter of type Variant
	 * @param trueText an input-parameter of type Variant
	 * @param falseAutoText an input-parameter of type Variant
	 * @param falseText an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addIf(Range range, String mergeField, int comparison, Variant compareTo, Variant trueAutoText, Variant trueText, Variant falseAutoText, Variant falseText) {
		MailMergeField result_of_AddIf = new MailMergeField(Dispatch.call(this, "AddIf", range, mergeField, new Variant(comparison), compareTo, trueAutoText, trueText, falseAutoText, falseText).toDispatch());


		return result_of_AddIf;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addMergeRec(Range range) {
		return new MailMergeField(Dispatch.call(this, "AddMergeRec", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addMergeSeq(Range range) {
		return new MailMergeField(Dispatch.call(this, "AddMergeSeq", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addNext(Range range) {
		return new MailMergeField(Dispatch.call(this, "AddNext", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @param compareTo an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addNextIf(Range range, String mergeField, int comparison, Variant compareTo) {
		return new MailMergeField(Dispatch.call(this, "AddNextIf", range, mergeField, new Variant(comparison), compareTo).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addNextIf(Range range, String mergeField, int comparison) {
		return new MailMergeField(Dispatch.call(this, "AddNextIf", range, mergeField, new Variant(comparison)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @param compareTo an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addNextIf(Range range, String mergeField, int comparison, Variant compareTo) {
		MailMergeField result_of_AddNextIf = new MailMergeField(Dispatch.call(this, "AddNextIf", range, mergeField, new Variant(comparison), compareTo).toDispatch());


		return result_of_AddNextIf;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param name an input-parameter of type String
	 * @param valueText an input-parameter of type Variant
	 * @param valueAutoText an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addSet(Range range, String name, Variant valueText, Variant valueAutoText) {
		return new MailMergeField(Dispatch.call(this, "AddSet", range, name, valueText, valueAutoText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param name an input-parameter of type String
	 * @param valueText an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addSet(Range range, String name, Variant valueText) {
		return new MailMergeField(Dispatch.call(this, "AddSet", range, name, valueText).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param name an input-parameter of type String
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addSet(Range range, String name) {
		return new MailMergeField(Dispatch.call(this, "AddSet", range, name).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param name an input-parameter of type String
	 * @param valueText an input-parameter of type Variant
	 * @param valueAutoText an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addSet(Range range, String name, Variant valueText, Variant valueAutoText) {
		MailMergeField result_of_AddSet = new MailMergeField(Dispatch.call(this, "AddSet", range, name, valueText, valueAutoText).toDispatch());


		return result_of_AddSet;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @param compareTo an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addSkipIf(Range range, String mergeField, int comparison, Variant compareTo) {
		return new MailMergeField(Dispatch.call(this, "AddSkipIf", range, mergeField, new Variant(comparison), compareTo).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addSkipIf(Range range, String mergeField, int comparison) {
		return new MailMergeField(Dispatch.call(this, "AddSkipIf", range, mergeField, new Variant(comparison)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param mergeField an input-parameter of type String
	 * @param comparison an input-parameter of type int
	 * @param compareTo an input-parameter of type Variant
	 * @return the result is of type MailMergeField
	 */
	public MailMergeField addSkipIf(Range range, String mergeField, int comparison, Variant compareTo) {
		MailMergeField result_of_AddSkipIf = new MailMergeField(Dispatch.call(this, "AddSkipIf", range, mergeField, new Variant(comparison), compareTo).toDispatch());


		return result_of_AddSkipIf;
	}

}
