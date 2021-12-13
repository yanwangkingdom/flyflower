/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechPhraseAlternate extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechPhraseAlternate";

	public ISpeechPhraseAlternate() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechPhraseAlternate(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechPhraseAlternate(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechRecoResult
	 */
	public ISpeechRecoResult getRecoResult() {
		return new ISpeechRecoResult(Dispatch.get(this, "RecoResult").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getStartElementInResult() {
		return Dispatch.get(this, "StartElementInResult").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNumberOfElementsInResult() {
		return Dispatch.get(this, "NumberOfElementsInResult").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ISpeechPhraseInfo
	 */
	public ISpeechPhraseInfo getPhraseInfo() {
		return new ISpeechPhraseInfo(Dispatch.get(this, "PhraseInfo").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void commit() {
		Dispatch.call(this, "Commit");
	}

}
