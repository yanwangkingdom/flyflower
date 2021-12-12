/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class KeysBoundTo extends Dispatch {

	public static final String componentName = "Word.KeysBoundTo";

	public KeysBoundTo() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public KeysBoundTo(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public KeysBoundTo(String compName) {
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
	 * @return the result is of type int
	 */
	public int getKeyCategory() {
		return Dispatch.get(this, "KeyCategory").changeType(Variant.VariantInt).getInt();
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
	 * @param index an input-parameter of type int
	 * @return the result is of type KeyBinding
	 */
	public KeyBinding item(int index) {
		return new KeyBinding(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param keyCode an input-parameter of type int
	 * @param keyCode2 an input-parameter of type Variant
	 * @return the result is of type KeyBinding
	 */
	public KeyBinding key(int keyCode, Variant keyCode2) {
		return new KeyBinding(Dispatch.call(this, "Key", new Variant(keyCode), keyCode2).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param keyCode an input-parameter of type int
	 * @return the result is of type KeyBinding
	 */
	public KeyBinding key(int keyCode) {
		return new KeyBinding(Dispatch.call(this, "Key", new Variant(keyCode)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param keyCode an input-parameter of type int
	 * @param keyCode2 an input-parameter of type Variant
	 * @return the result is of type KeyBinding
	 */
	public KeyBinding key(int keyCode, Variant keyCode2) {
		KeyBinding result_of_Key = new KeyBinding(Dispatch.call(this, "Key", new Variant(keyCode), keyCode2).toDispatch());


		return result_of_Key;
	}

}
