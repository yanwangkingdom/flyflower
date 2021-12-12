/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Trendlines extends Dispatch {

	public static final String componentName = "Word.Trendlines";

	public Trendlines() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Trendlines(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Trendlines(String compName) {
		super(compName);
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
	 * @param type an input-parameter of type int
	 * @param order an input-parameter of type Variant
	 * @param period an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param backward an input-parameter of type Variant
	 * @param intercept an input-parameter of type Variant
	 * @param displayEquation an input-parameter of type Variant
	 * @param displayRSquared an input-parameter of type Variant
	 * @param name an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline add(int type, Variant order, Variant period, Variant forward, Variant backward, Variant intercept, Variant displayEquation, Variant displayRSquared, Variant name) {
		return new Trendline(Dispatch.callN(this, "Add", new Object[] { new Variant(type), order, period, forward, backward, intercept, displayEquation, displayRSquared, name}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param order an input-parameter of type Variant
	 * @param period an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param backward an input-parameter of type Variant
	 * @param intercept an input-parameter of type Variant
	 * @param displayEquation an input-parameter of type Variant
	 * @param displayRSquared an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline add(int type, Variant order, Variant period, Variant forward, Variant backward, Variant intercept, Variant displayEquation, Variant displayRSquared) {
		return new Trendline(Dispatch.call(this, "Add", new Variant(type), order, period, forward, backward, intercept, displayEquation, displayRSquared).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param order an input-parameter of type Variant
	 * @param period an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param backward an input-parameter of type Variant
	 * @param intercept an input-parameter of type Variant
	 * @param displayEquation an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline add(int type, Variant order, Variant period, Variant forward, Variant backward, Variant intercept, Variant displayEquation) {
		return new Trendline(Dispatch.call(this, "Add", new Variant(type), order, period, forward, backward, intercept, displayEquation).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param order an input-parameter of type Variant
	 * @param period an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param backward an input-parameter of type Variant
	 * @param intercept an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline add(int type, Variant order, Variant period, Variant forward, Variant backward, Variant intercept) {
		return new Trendline(Dispatch.call(this, "Add", new Variant(type), order, period, forward, backward, intercept).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param order an input-parameter of type Variant
	 * @param period an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param backward an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline add(int type, Variant order, Variant period, Variant forward, Variant backward) {
		return new Trendline(Dispatch.call(this, "Add", new Variant(type), order, period, forward, backward).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param order an input-parameter of type Variant
	 * @param period an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline add(int type, Variant order, Variant period, Variant forward) {
		return new Trendline(Dispatch.call(this, "Add", new Variant(type), order, period, forward).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param order an input-parameter of type Variant
	 * @param period an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline add(int type, Variant order, Variant period) {
		return new Trendline(Dispatch.call(this, "Add", new Variant(type), order, period).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param order an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline add(int type, Variant order) {
		return new Trendline(Dispatch.call(this, "Add", new Variant(type), order).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @return the result is of type Trendline
	 */
	public Trendline add(int type) {
		return new Trendline(Dispatch.call(this, "Add", new Variant(type)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Trendline
	 */
	public Trendline add() {
		return new Trendline(Dispatch.call(this, "Add").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param type an input-parameter of type int
	 * @param order an input-parameter of type Variant
	 * @param period an input-parameter of type Variant
	 * @param forward an input-parameter of type Variant
	 * @param backward an input-parameter of type Variant
	 * @param intercept an input-parameter of type Variant
	 * @param displayEquation an input-parameter of type Variant
	 * @param displayRSquared an input-parameter of type Variant
	 * @param name an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline add(int type, Variant order, Variant period, Variant forward, Variant backward, Variant intercept, Variant displayEquation, Variant displayRSquared, Variant name) {
		Trendline result_of_Add = new Trendline(Dispatch.callN(this, "Add", new Object[] { new Variant(type), order, period, forward, backward, intercept, displayEquation, displayRSquared, name}).toDispatch());


		return result_of_Add;
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
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline item(Variant index) {
		return new Trendline(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Trendline
	 */
	public Trendline item() {
		return new Trendline(Dispatch.call(this, "Item").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline item(Variant index) {
		Trendline result_of_Item = new Trendline(Dispatch.call(this, "Item", index).toDispatch());


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
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline _Default(Variant index) {
		return new Trendline(Dispatch.call(this, "_Default", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Trendline
	 */
	public Trendline _Default() {
		return new Trendline(Dispatch.call(this, "_Default").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Trendline
	 */
	public Trendline _Default(Variant index) {
		Trendline result_of__Default = new Trendline(Dispatch.call(this, "_Default", index).toDispatch());


		return result_of__Default;
	}

}
