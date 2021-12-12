/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ChartBorder extends Dispatch {

	public static final String componentName = "Word.ChartBorder";

	public ChartBorder() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ChartBorder(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ChartBorder(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getColor() {
		return Dispatch.get(this, "Color");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param color an input-parameter of type Variant
	 */
	public void setColor(Variant color) {
		Dispatch.put(this, "Color", color);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getColorIndex() {
		return Dispatch.get(this, "ColorIndex");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param colorIndex an input-parameter of type Variant
	 */
	public void setColorIndex(Variant colorIndex) {
		Dispatch.put(this, "ColorIndex", colorIndex);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getLineStyle() {
		return Dispatch.get(this, "LineStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lineStyle an input-parameter of type Variant
	 */
	public void setLineStyle(Variant lineStyle) {
		Dispatch.put(this, "LineStyle", lineStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getWeight() {
		return Dispatch.get(this, "Weight");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param weight an input-parameter of type Variant
	 */
	public void setWeight(Variant weight) {
		Dispatch.put(this, "Weight", weight);
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
	 * @return the result is of type Object
	 */
	public Object getParent() {
		return Dispatch.get(this, "Parent");
	}

}
