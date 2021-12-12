/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class RevisionsFilter extends Dispatch {

	public static final String componentName = "Word.RevisionsFilter";

	public RevisionsFilter() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public RevisionsFilter(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public RevisionsFilter(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getView() {
		return Dispatch.get(this, "View").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param view an input-parameter of type int
	 */
	public void setView(int view) {
		Dispatch.put(this, "View", new Variant(view));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMarkup() {
		return Dispatch.get(this, "Markup").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param markup an input-parameter of type int
	 */
	public void setMarkup(int markup) {
		Dispatch.put(this, "Markup", new Variant(markup));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Reviewers
	 */
	public Reviewers getReviewers() {
		return new Reviewers(Dispatch.get(this, "Reviewers").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void toggleShowAllReviewers() {
		Dispatch.call(this, "ToggleShowAllReviewers");
	}

}
