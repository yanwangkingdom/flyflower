/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class UndoRecord extends Dispatch {

	public static final String componentName = "Word.UndoRecord";

	public UndoRecord() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public UndoRecord(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public UndoRecord(String compName) {
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
	 * @param name an input-parameter of type String
	 */
	public void startCustomRecord(String name) {
		Dispatch.call(this, "StartCustomRecord", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void startCustomRecord() {
		Dispatch.call(this, "StartCustomRecord");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void startCustomRecord(String name) {
		Dispatch.call(this, "StartCustomRecord", name);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void endCustomRecord() {
		Dispatch.call(this, "EndCustomRecord");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIsRecordingCustomRecord() {
		return Dispatch.get(this, "IsRecordingCustomRecord").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getCustomRecordName() {
		return Dispatch.get(this, "CustomRecordName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCustomRecordLevel() {
		return Dispatch.get(this, "CustomRecordLevel").changeType(Variant.VariantInt).getInt();
	}

}
