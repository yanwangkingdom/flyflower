/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.sapi;

import com.jacob.com.*;

public class ISpeechTextSelectionInformation extends Dispatch {

	public static final String componentName = "SpeechLib.ISpeechTextSelectionInformation";

	public ISpeechTextSelectionInformation() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ISpeechTextSelectionInformation(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ISpeechTextSelectionInformation(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param activeOffset an input-parameter of type int
	 */
	public void setActiveOffset(int activeOffset) {
		Dispatch.put(this, "ActiveOffset", new Variant(activeOffset));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getActiveOffset() {
		return Dispatch.get(this, "ActiveOffset").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param activeLength an input-parameter of type int
	 */
	public void setActiveLength(int activeLength) {
		Dispatch.put(this, "ActiveLength", new Variant(activeLength));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getActiveLength() {
		return Dispatch.get(this, "ActiveLength").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param selectionOffset an input-parameter of type int
	 */
	public void setSelectionOffset(int selectionOffset) {
		Dispatch.put(this, "SelectionOffset", new Variant(selectionOffset));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSelectionOffset() {
		return Dispatch.get(this, "SelectionOffset").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param selectionLength an input-parameter of type int
	 */
	public void setSelectionLength(int selectionLength) {
		Dispatch.put(this, "SelectionLength", new Variant(selectionLength));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSelectionLength() {
		return Dispatch.get(this, "SelectionLength").changeType(Variant.VariantInt).getInt();
	}

}
