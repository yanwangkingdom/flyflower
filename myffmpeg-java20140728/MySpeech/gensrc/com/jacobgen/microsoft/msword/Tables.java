/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Tables extends Dispatch {

	public static final String componentName = "Word.Tables";

	public Tables() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Tables(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Tables(String compName) {
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
	 * @param index an input-parameter of type int
	 * @return the result is of type Table
	 */
	public Table item(int index) {
		return new Table(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param numRows an input-parameter of type int
	 * @param numColumns an input-parameter of type int
	 * @return the result is of type Table
	 */
	public Table addOld(Range range, int numRows, int numColumns) {
		return new Table(Dispatch.call(this, "AddOld", range, new Variant(numRows), new Variant(numColumns)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param numRows an input-parameter of type int
	 * @param numColumns an input-parameter of type int
	 * @param defaultTableBehavior an input-parameter of type Variant
	 * @param autoFitBehavior an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table add(Range range, int numRows, int numColumns, Variant defaultTableBehavior, Variant autoFitBehavior) {
		return new Table(Dispatch.call(this, "Add", range, new Variant(numRows), new Variant(numColumns), defaultTableBehavior, autoFitBehavior).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param numRows an input-parameter of type int
	 * @param numColumns an input-parameter of type int
	 * @param defaultTableBehavior an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table add(Range range, int numRows, int numColumns, Variant defaultTableBehavior) {
		return new Table(Dispatch.call(this, "Add", range, new Variant(numRows), new Variant(numColumns), defaultTableBehavior).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param numRows an input-parameter of type int
	 * @param numColumns an input-parameter of type int
	 * @return the result is of type Table
	 */
	public Table add(Range range, int numRows, int numColumns) {
		return new Table(Dispatch.call(this, "Add", range, new Variant(numRows), new Variant(numColumns)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param numRows an input-parameter of type int
	 * @param numColumns an input-parameter of type int
	 * @param defaultTableBehavior an input-parameter of type Variant
	 * @param autoFitBehavior an input-parameter of type Variant
	 * @return the result is of type Table
	 */
	public Table add(Range range, int numRows, int numColumns, Variant defaultTableBehavior, Variant autoFitBehavior) {
		Table result_of_Add = new Table(Dispatch.call(this, "Add", range, new Variant(numRows), new Variant(numColumns), defaultTableBehavior, autoFitBehavior).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNestingLevel() {
		return Dispatch.get(this, "NestingLevel").changeType(Variant.VariantInt).getInt();
	}

}
