/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechPhraseInfoBuilder extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechPhraseInfoBuilder";

	public ISpeechPhraseInfoBuilder() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechPhraseInfoBuilder(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechPhraseInfoBuilder(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param phraseInMemory an input-parameter of type Variant
	 * @return the result is of type ISpeechPhraseInfo
	 */
	public ISpeechPhraseInfo restorePhraseFromMemory(Variant phraseInMemory) {
		return new ISpeechPhraseInfo(Dispatch.call(this, "RestorePhraseFromMemory", phraseInMemory).toDispatch());
	}

}
