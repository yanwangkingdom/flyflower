/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Windows extends Dispatch {

	public static final String componentName = "Word.Windows";

	public Windows() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Windows(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Windows(String compName) {
		super(compName);
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
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Window
	 */
	public Window item(Variant index) {
		return new Window(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param window an input-parameter of type Variant
	 * @return the result is of type Window
	 */
	public Window add(Variant window) {
		return new Window(Dispatch.call(this, "Add", window).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Window
	 */
	public Window add() {
		return new Window(Dispatch.call(this, "Add").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param window an input-parameter of type Variant
	 * @return the result is of type Window
	 */
	public Window add(Variant window) {
		Window result_of_Add = new Window(Dispatch.call(this, "Add", window).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param arrangeStyle an input-parameter of type Variant
	 */
	public void arrange(Variant arrangeStyle) {
		Dispatch.call(this, "Arrange", arrangeStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void arrange() {
		Dispatch.call(this, "Arrange");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param arrangeStyle an input-parameter of type Variant
	 */
	public void arrange(Variant arrangeStyle) {
		Dispatch.call(this, "Arrange", arrangeStyle);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param document an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean compareSideBySideWith(Variant document) {
		return Dispatch.call(this, "CompareSideBySideWith", document).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean breakSideBySide() {
		return Dispatch.call(this, "BreakSideBySide").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void resetPositionsSideBySide() {
		Dispatch.call(this, "ResetPositionsSideBySide");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSyncScrollingSideBySide() {
		return Dispatch.get(this, "SyncScrollingSideBySide").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param syncScrollingSideBySide an input-parameter of type boolean
	 */
	public void setSyncScrollingSideBySide(boolean syncScrollingSideBySide) {
		Dispatch.put(this, "SyncScrollingSideBySide", new Variant(syncScrollingSideBySide));
	}

}
