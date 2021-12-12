/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OMathFunctions extends Dispatch {

	public static final String componentName = "Word.OMathFunctions";

	public OMathFunctions() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OMathFunctions(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OMathFunctions(String compName) {
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
	 * @return the result is of type int
	 */
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type OMathFunction
	 */
	public OMathFunction item(int index) {
		return new OMathFunction(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param type an input-parameter of type int
	 * @param numArgs an input-parameter of type Variant
	 * @param numCols an input-parameter of type Variant
	 * @return the result is of type OMathFunction
	 */
	public OMathFunction add(Range range, int type, Variant numArgs, Variant numCols) {
		return new OMathFunction(Dispatch.call(this, "Add", range, new Variant(type), numArgs, numCols).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param type an input-parameter of type int
	 * @param numArgs an input-parameter of type Variant
	 * @return the result is of type OMathFunction
	 */
	public OMathFunction add(Range range, int type, Variant numArgs) {
		return new OMathFunction(Dispatch.call(this, "Add", range, new Variant(type), numArgs).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param type an input-parameter of type int
	 * @return the result is of type OMathFunction
	 */
	public OMathFunction add(Range range, int type) {
		return new OMathFunction(Dispatch.call(this, "Add", range, new Variant(type)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param type an input-parameter of type int
	 * @param numArgs an input-parameter of type Variant
	 * @param numCols an input-parameter of type Variant
	 * @return the result is of type OMathFunction
	 */
	public OMathFunction add(Range range, int type, Variant numArgs, Variant numCols) {
		OMathFunction result_of_Add = new OMathFunction(Dispatch.call(this, "Add", range, new Variant(type), numArgs, numCols).toDispatch());


		return result_of_Add;
	}

}
