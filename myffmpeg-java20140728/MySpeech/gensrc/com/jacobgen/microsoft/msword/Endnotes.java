/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Endnotes extends Dispatch {

	public static final String componentName = "Word.Endnotes";

	public Endnotes() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Endnotes(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Endnotes(String compName) {
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
	 * @return the result is of type int
	 */
	public int getLocation() {
		return Dispatch.get(this, "Location").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param location an input-parameter of type int
	 */
	public void setLocation(int location) {
		Dispatch.put(this, "Location", new Variant(location));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNumberStyle() {
		return Dispatch.get(this, "NumberStyle").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberStyle an input-parameter of type int
	 */
	public void setNumberStyle(int numberStyle) {
		Dispatch.put(this, "NumberStyle", new Variant(numberStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getStartingNumber() {
		return Dispatch.get(this, "StartingNumber").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startingNumber an input-parameter of type int
	 */
	public void setStartingNumber(int startingNumber) {
		Dispatch.put(this, "StartingNumber", new Variant(startingNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNumberingRule() {
		return Dispatch.get(this, "NumberingRule").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberingRule an input-parameter of type int
	 */
	public void setNumberingRule(int numberingRule) {
		Dispatch.put(this, "NumberingRule", new Variant(numberingRule));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range getSeparator() {
		return new Range(Dispatch.get(this, "Separator").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range getContinuationSeparator() {
		return new Range(Dispatch.get(this, "ContinuationSeparator").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range getContinuationNotice() {
		return new Range(Dispatch.get(this, "ContinuationNotice").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type Endnote
	 */
	public Endnote item(int index) {
		return new Endnote(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param reference an input-parameter of type Variant
	 * @param text an input-parameter of type Variant
	 * @return the result is of type Endnote
	 */
	public Endnote add(Range range, Variant reference, Variant text) {
		return new Endnote(Dispatch.call(this, "Add", range, reference, text).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param reference an input-parameter of type Variant
	 * @return the result is of type Endnote
	 */
	public Endnote add(Range range, Variant reference) {
		return new Endnote(Dispatch.call(this, "Add", range, reference).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @return the result is of type Endnote
	 */
	public Endnote add(Range range) {
		return new Endnote(Dispatch.call(this, "Add", range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param reference an input-parameter of type Variant
	 * @param text an input-parameter of type Variant
	 * @return the result is of type Endnote
	 */
	public Endnote add(Range range, Variant reference, Variant text) {
		Endnote result_of_Add = new Endnote(Dispatch.call(this, "Add", range, reference, text).toDispatch());


		return result_of_Add;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void convert() {
		Dispatch.call(this, "Convert");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void swapWithFootnotes() {
		Dispatch.call(this, "SwapWithFootnotes");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void resetSeparator() {
		Dispatch.call(this, "ResetSeparator");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void resetContinuationSeparator() {
		Dispatch.call(this, "ResetContinuationSeparator");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void resetContinuationNotice() {
		Dispatch.call(this, "ResetContinuationNotice");
	}

}
