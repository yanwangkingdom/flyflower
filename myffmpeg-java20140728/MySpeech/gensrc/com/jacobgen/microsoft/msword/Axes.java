/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Axes extends Dispatch {

	public static final String componentName = "Word.Axes";

	public Axes() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Axes(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Axes(String compName) {
		super(compName);
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
	 * @param type an input-parameter of type int
	 * @param axisGroup an input-parameter of type int
	 * @return the result is of type Axis
	 */
	public Axis item(int type, int axisGroup) {
		return new Axis(Dispatch.call(this, "Item", new Variant(type), new Variant(axisGroup)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @return the result is of type Axis
	 */
	public Axis item(int type) {
		return new Axis(Dispatch.call(this, "Item", new Variant(type)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param type an input-parameter of type int
	 * @param axisGroup an input-parameter of type int
	 * @return the result is of type Axis
	 */
	public Axis item(int type, int axisGroup) {
		Axis result_of_Item = new Axis(Dispatch.call(this, "Item", new Variant(type), new Variant(axisGroup)).toDispatch());


		return result_of_Item;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant _NewEnum() {
		return Dispatch.call(this, "_NewEnum");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getApplication() {
		return Dispatch.get(this, "Application");
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
	 * @param type an input-parameter of type int
	 * @param axisGroup an input-parameter of type int
	 * @return the result is of type Axis
	 */
	public Axis _Default(int type, int axisGroup) {
		return new Axis(Dispatch.call(this, "_Default", new Variant(type), new Variant(axisGroup)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @return the result is of type Axis
	 */
	public Axis _Default(int type) {
		return new Axis(Dispatch.call(this, "_Default", new Variant(type)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param type an input-parameter of type int
	 * @param axisGroup an input-parameter of type int
	 * @return the result is of type Axis
	 */
	public Axis _Default(int type, int axisGroup) {
		Axis result_of__Default = new Axis(Dispatch.call(this, "_Default", new Variant(type), new Variant(axisGroup)).toDispatch());


		return result_of__Default;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getParent() {
		return Dispatch.get(this, "Parent");
	}

}
