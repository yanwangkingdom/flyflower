/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class HTMLDivision extends Dispatch {

	public static final String componentName = "Word.HTMLDivision";

	public HTMLDivision() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public HTMLDivision(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public HTMLDivision(String compName) {
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
	 * @return the result is of type Range
	 */
	public Range getRange() {
		return new Range(Dispatch.get(this, "Range").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Borders
	 */
	public Borders getBorders() {
		return new Borders(Dispatch.get(this, "Borders").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLeftIndent() {
		return Dispatch.get(this, "LeftIndent").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param leftIndent an input-parameter of type float
	 */
	public void setLeftIndent(float leftIndent) {
		Dispatch.put(this, "LeftIndent", new Variant(leftIndent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getRightIndent() {
		return Dispatch.get(this, "RightIndent").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rightIndent an input-parameter of type float
	 */
	public void setRightIndent(float rightIndent) {
		Dispatch.put(this, "RightIndent", new Variant(rightIndent));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getSpaceBefore() {
		return Dispatch.get(this, "SpaceBefore").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param spaceBefore an input-parameter of type float
	 */
	public void setSpaceBefore(float spaceBefore) {
		Dispatch.put(this, "SpaceBefore", new Variant(spaceBefore));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getSpaceAfter() {
		return Dispatch.get(this, "SpaceAfter").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param spaceAfter an input-parameter of type float
	 */
	public void setSpaceAfter(float spaceAfter) {
		Dispatch.put(this, "SpaceAfter", new Variant(spaceAfter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type HTMLDivisions
	 */
	public HTMLDivisions getHTMLDivisions() {
		return new HTMLDivisions(Dispatch.get(this, "HTMLDivisions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param levelsUp an input-parameter of type Variant
	 * @return the result is of type HTMLDivision
	 */
	public HTMLDivision hTMLDivisionParent(Variant levelsUp) {
		return new HTMLDivision(Dispatch.call(this, "HTMLDivisionParent", levelsUp).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type HTMLDivision
	 */
	public HTMLDivision hTMLDivisionParent() {
		return new HTMLDivision(Dispatch.call(this, "HTMLDivisionParent").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param levelsUp an input-parameter of type Variant
	 * @return the result is of type HTMLDivision
	 */
	public HTMLDivision hTMLDivisionParent(Variant levelsUp) {
		HTMLDivision result_of_HTMLDivisionParent = new HTMLDivision(Dispatch.call(this, "HTMLDivisionParent", levelsUp).toDispatch());


		return result_of_HTMLDivisionParent;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

}
