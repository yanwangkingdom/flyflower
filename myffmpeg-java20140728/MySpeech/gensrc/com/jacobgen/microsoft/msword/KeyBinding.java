/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class KeyBinding extends Dispatch {

	public static final String componentName = "Word.KeyBinding";

	public KeyBinding() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public KeyBinding(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public KeyBinding(String compName) {
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
	 * @return the result is of type String
	 */
	public String getCommand() {
		return Dispatch.get(this, "Command").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getKeyString() {
		return Dispatch.get(this, "KeyString").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getProtected() {
		return Dispatch.get(this, "Protected").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getKeyCategory() {
		return Dispatch.get(this, "KeyCategory").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getKeyCode() {
		return Dispatch.get(this, "KeyCode").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getKeyCode2() {
		return Dispatch.get(this, "KeyCode2").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getCommandParameter() {
		return Dispatch.get(this, "CommandParameter").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getContext() {
		return Dispatch.get(this, "Context");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clear() {
		Dispatch.call(this, "Clear");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void disable() {
		Dispatch.call(this, "Disable");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void execute() {
		Dispatch.call(this, "Execute");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param keyCategory an input-parameter of type int
	 * @param command an input-parameter of type String
	 * @param commandParameter an input-parameter of type Variant
	 */
	public void rebind(int keyCategory, String command, Variant commandParameter) {
		Dispatch.call(this, "Rebind", new Variant(keyCategory), command, commandParameter);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param keyCategory an input-parameter of type int
	 * @param command an input-parameter of type String
	 */
	public void rebind(int keyCategory, String command) {
		Dispatch.call(this, "Rebind", new Variant(keyCategory), command);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param keyCategory an input-parameter of type int
	 * @param command an input-parameter of type String
	 * @param commandParameter an input-parameter of type Variant
	 */
	public void rebind(int keyCategory, String command, Variant commandParameter) {
		Dispatch.call(this, "Rebind", new Variant(keyCategory), command, commandParameter);

	}

}
