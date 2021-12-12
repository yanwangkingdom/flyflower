/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class AutoCorrect extends Dispatch {

	public static final String componentName = "Word.AutoCorrect";

	public AutoCorrect() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public AutoCorrect(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public AutoCorrect(String compName) {
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
	 * @return the result is of type boolean
	 */
	public boolean getCorrectDays() {
		return Dispatch.get(this, "CorrectDays").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param correctDays an input-parameter of type boolean
	 */
	public void setCorrectDays(boolean correctDays) {
		Dispatch.put(this, "CorrectDays", new Variant(correctDays));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCorrectInitialCaps() {
		return Dispatch.get(this, "CorrectInitialCaps").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param correctInitialCaps an input-parameter of type boolean
	 */
	public void setCorrectInitialCaps(boolean correctInitialCaps) {
		Dispatch.put(this, "CorrectInitialCaps", new Variant(correctInitialCaps));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCorrectSentenceCaps() {
		return Dispatch.get(this, "CorrectSentenceCaps").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param correctSentenceCaps an input-parameter of type boolean
	 */
	public void setCorrectSentenceCaps(boolean correctSentenceCaps) {
		Dispatch.put(this, "CorrectSentenceCaps", new Variant(correctSentenceCaps));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getReplaceText() {
		return Dispatch.get(this, "ReplaceText").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param replaceText an input-parameter of type boolean
	 */
	public void setReplaceText(boolean replaceText) {
		Dispatch.put(this, "ReplaceText", new Variant(replaceText));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type AutoCorrectEntries
	 */
	public AutoCorrectEntries getEntries() {
		return new AutoCorrectEntries(Dispatch.get(this, "Entries").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FirstLetterExceptions
	 */
	public FirstLetterExceptions getFirstLetterExceptions() {
		return new FirstLetterExceptions(Dispatch.get(this, "FirstLetterExceptions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFirstLetterAutoAdd() {
		return Dispatch.get(this, "FirstLetterAutoAdd").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param firstLetterAutoAdd an input-parameter of type boolean
	 */
	public void setFirstLetterAutoAdd(boolean firstLetterAutoAdd) {
		Dispatch.put(this, "FirstLetterAutoAdd", new Variant(firstLetterAutoAdd));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TwoInitialCapsExceptions
	 */
	public TwoInitialCapsExceptions getTwoInitialCapsExceptions() {
		return new TwoInitialCapsExceptions(Dispatch.get(this, "TwoInitialCapsExceptions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getTwoInitialCapsAutoAdd() {
		return Dispatch.get(this, "TwoInitialCapsAutoAdd").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param twoInitialCapsAutoAdd an input-parameter of type boolean
	 */
	public void setTwoInitialCapsAutoAdd(boolean twoInitialCapsAutoAdd) {
		Dispatch.put(this, "TwoInitialCapsAutoAdd", new Variant(twoInitialCapsAutoAdd));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCorrectCapsLock() {
		return Dispatch.get(this, "CorrectCapsLock").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param correctCapsLock an input-parameter of type boolean
	 */
	public void setCorrectCapsLock(boolean correctCapsLock) {
		Dispatch.put(this, "CorrectCapsLock", new Variant(correctCapsLock));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCorrectHangulAndAlphabet() {
		return Dispatch.get(this, "CorrectHangulAndAlphabet").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param correctHangulAndAlphabet an input-parameter of type boolean
	 */
	public void setCorrectHangulAndAlphabet(boolean correctHangulAndAlphabet) {
		Dispatch.put(this, "CorrectHangulAndAlphabet", new Variant(correctHangulAndAlphabet));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type HangulAndAlphabetExceptions
	 */
	public HangulAndAlphabetExceptions getHangulAndAlphabetExceptions() {
		return new HangulAndAlphabetExceptions(Dispatch.get(this, "HangulAndAlphabetExceptions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHangulAndAlphabetAutoAdd() {
		return Dispatch.get(this, "HangulAndAlphabetAutoAdd").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hangulAndAlphabetAutoAdd an input-parameter of type boolean
	 */
	public void setHangulAndAlphabetAutoAdd(boolean hangulAndAlphabetAutoAdd) {
		Dispatch.put(this, "HangulAndAlphabetAutoAdd", new Variant(hangulAndAlphabetAutoAdd));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getReplaceTextFromSpellingChecker() {
		return Dispatch.get(this, "ReplaceTextFromSpellingChecker").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param replaceTextFromSpellingChecker an input-parameter of type boolean
	 */
	public void setReplaceTextFromSpellingChecker(boolean replaceTextFromSpellingChecker) {
		Dispatch.put(this, "ReplaceTextFromSpellingChecker", new Variant(replaceTextFromSpellingChecker));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getOtherCorrectionsAutoAdd() {
		return Dispatch.get(this, "OtherCorrectionsAutoAdd").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param otherCorrectionsAutoAdd an input-parameter of type boolean
	 */
	public void setOtherCorrectionsAutoAdd(boolean otherCorrectionsAutoAdd) {
		Dispatch.put(this, "OtherCorrectionsAutoAdd", new Variant(otherCorrectionsAutoAdd));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OtherCorrectionsExceptions
	 */
	public OtherCorrectionsExceptions getOtherCorrectionsExceptions() {
		return new OtherCorrectionsExceptions(Dispatch.get(this, "OtherCorrectionsExceptions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCorrectKeyboardSetting() {
		return Dispatch.get(this, "CorrectKeyboardSetting").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param correctKeyboardSetting an input-parameter of type boolean
	 */
	public void setCorrectKeyboardSetting(boolean correctKeyboardSetting) {
		Dispatch.put(this, "CorrectKeyboardSetting", new Variant(correctKeyboardSetting));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCorrectTableCells() {
		return Dispatch.get(this, "CorrectTableCells").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param correctTableCells an input-parameter of type boolean
	 */
	public void setCorrectTableCells(boolean correctTableCells) {
		Dispatch.put(this, "CorrectTableCells", new Variant(correctTableCells));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayAutoCorrectOptions() {
		return Dispatch.get(this, "DisplayAutoCorrectOptions").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayAutoCorrectOptions an input-parameter of type boolean
	 */
	public void setDisplayAutoCorrectOptions(boolean displayAutoCorrectOptions) {
		Dispatch.put(this, "DisplayAutoCorrectOptions", new Variant(displayAutoCorrectOptions));
	}

}
