/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class TabStops extends Dispatch {

	public static final String componentName = "Word.TabStops";

	public TabStops() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public TabStops(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public TabStops(String compName) {
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
	 * @return the result is of type TabStop
	 */
	public TabStop item(Variant index) {
		return new TabStop(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param position an input-parameter of type float
	 * @param alignment an input-parameter of type Variant
	 * @param leader an input-parameter of type Variant
	 * @return the result is of type TabStop
	 */
	public TabStop add(float position, Variant alignment, Variant leader) {
		return new TabStop(Dispatch.call(this, "Add", new Variant(position), alignment, leader).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param position an input-parameter of type float
	 * @param alignment an input-parameter of type Variant
	 * @return the result is of type TabStop
	 */
	public TabStop add(float position, Variant alignment) {
		return new TabStop(Dispatch.call(this, "Add", new Variant(position), alignment).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param position an input-parameter of type float
	 * @return the result is of type TabStop
	 */
	public TabStop add(float position) {
		return new TabStop(Dispatch.call(this, "Add", new Variant(position)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param position an input-parameter of type float
	 * @param alignment an input-parameter of type Variant
	 * @param leader an input-parameter of type Variant
	 * @return the result is of type TabStop
	 */
	public TabStop add(float position, Variant alignment, Variant leader) {
		TabStop result_of_Add = new TabStop(Dispatch.call(this, "Add", new Variant(position), alignment, leader).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void clearAll() {
		Dispatch.call(this, "ClearAll");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param position an input-parameter of type float
	 * @return the result is of type TabStop
	 */
	public TabStop before(float position) {
		return new TabStop(Dispatch.call(this, "Before", new Variant(position)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param position an input-parameter of type float
	 * @return the result is of type TabStop
	 */
	public TabStop after(float position) {
		return new TabStop(Dispatch.call(this, "After", new Variant(position)).toDispatch());
	}

}
