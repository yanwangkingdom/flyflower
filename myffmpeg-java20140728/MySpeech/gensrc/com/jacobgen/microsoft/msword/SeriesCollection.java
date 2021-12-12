/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class SeriesCollection extends Dispatch {

	public static final String componentName = "Word.SeriesCollection";

	public SeriesCollection() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public SeriesCollection(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public SeriesCollection(String compName) {
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
	 * @param source an input-parameter of type Variant
	 * @param rowcol an input-parameter of type int
	 * @param seriesLabels an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @return the result is of type Series
	 */
	public Series add(Variant source, int rowcol, Variant seriesLabels, Variant categoryLabels, Variant replace) {
		return new Series(Dispatch.call(this, "Add", source, new Variant(rowcol), seriesLabels, categoryLabels, replace).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param rowcol an input-parameter of type int
	 * @param seriesLabels an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 * @return the result is of type Series
	 */
	public Series add(Variant source, int rowcol, Variant seriesLabels, Variant categoryLabels) {
		return new Series(Dispatch.call(this, "Add", source, new Variant(rowcol), seriesLabels, categoryLabels).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param rowcol an input-parameter of type int
	 * @param seriesLabels an input-parameter of type Variant
	 * @return the result is of type Series
	 */
	public Series add(Variant source, int rowcol, Variant seriesLabels) {
		return new Series(Dispatch.call(this, "Add", source, new Variant(rowcol), seriesLabels).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param rowcol an input-parameter of type int
	 * @return the result is of type Series
	 */
	public Series add(Variant source, int rowcol) {
		return new Series(Dispatch.call(this, "Add", source, new Variant(rowcol)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @return the result is of type Series
	 */
	public Series add(Variant source) {
		return new Series(Dispatch.call(this, "Add", source).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param rowcol an input-parameter of type int
	 * @param seriesLabels an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 * @param replace an input-parameter of type Variant
	 * @return the result is of type Series
	 */
	public Series add(Variant source, int rowcol, Variant seriesLabels, Variant categoryLabels, Variant replace) {
		Series result_of_Add = new Series(Dispatch.call(this, "Add", source, new Variant(rowcol), seriesLabels, categoryLabels, replace).toDispatch());


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
	 * @param source an input-parameter of type Variant
	 * @param rowcol an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant extend(Variant source, Variant rowcol, Variant categoryLabels) {
		return Dispatch.call(this, "Extend", source, rowcol, categoryLabels);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param rowcol an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant extend(Variant source, Variant rowcol) {
		return Dispatch.call(this, "Extend", source, rowcol);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant extend(Variant source) {
		return Dispatch.call(this, "Extend", source);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param source an input-parameter of type Variant
	 * @param rowcol an input-parameter of type Variant
	 * @param categoryLabels an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant extend(Variant source, Variant rowcol, Variant categoryLabels) {
		Variant result_of_Extend = Dispatch.call(this, "Extend", source, rowcol, categoryLabels);


		return result_of_Extend;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Series
	 */
	public Series item(Variant index) {
		return new Series(Dispatch.call(this, "Item", index).toDispatch());
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
	 * @return the result is of type Series
	 */
	public Series newSeries() {
		return new Series(Dispatch.call(this, "NewSeries").toDispatch());
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
	 * @return the result is of type Series
	 */
	public Series _Default(Variant index) {
		return new Series(Dispatch.call(this, "_Default", index).toDispatch());
	}

}
