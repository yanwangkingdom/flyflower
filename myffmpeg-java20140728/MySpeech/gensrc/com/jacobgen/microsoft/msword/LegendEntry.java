/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class LegendEntry extends Dispatch {

	public static final String componentName = "Word.LegendEntry";

	public LegendEntry() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public LegendEntry(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public LegendEntry(String compName) {
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
	 * @return the result is of type Variant
	 */
	public Variant delete() {
		return Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartFont
	 */
	public ChartFont getFont() {
		return new ChartFont(Dispatch.get(this, "Font").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getIndex() {
		return Dispatch.get(this, "Index").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type LegendKey
	 */
	public LegendKey getLegendKey() {
		return new LegendKey(Dispatch.get(this, "LegendKey").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant select() {
		return Dispatch.call(this, "Select");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getAutoScaleFont() {
		return Dispatch.get(this, "AutoScaleFont");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoScaleFont an input-parameter of type Variant
	 */
	public void setAutoScaleFont(Variant autoScaleFont) {
		Dispatch.put(this, "AutoScaleFont", autoScaleFont);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getLeft() {
		return Dispatch.get(this, "Left").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getTop() {
		return Dispatch.get(this, "Top").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getWidth() {
		return Dispatch.get(this, "Width").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getHeight() {
		return Dispatch.get(this, "Height").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartFormat
	 */
	public ChartFormat getFormat() {
		return new ChartFormat(Dispatch.get(this, "Format").toDispatch());
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

}
