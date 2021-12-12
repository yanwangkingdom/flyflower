/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Walls extends Dispatch {

	public static final String componentName = "Word.Walls";

	public Walls() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Walls(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Walls(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getName() {
		return Dispatch.get(this, "Name").toString();
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
	 * @return the result is of type Object
	 */
	public Object getParent() {
		return Dispatch.get(this, "Parent");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartBorder
	 */
	public ChartBorder getBorder() {
		return new ChartBorder(Dispatch.get(this, "Border").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant clearFormats() {
		return Dispatch.call(this, "ClearFormats");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Interior
	 */
	public Interior getInterior() {
		return new Interior(Dispatch.get(this, "Interior").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartFillFormat
	 */
	public ChartFillFormat getFill() {
		return new ChartFillFormat(Dispatch.get(this, "Fill").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getPictureType() {
		return Dispatch.get(this, "PictureType");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pictureType an input-parameter of type Variant
	 */
	public void setPictureType(Variant pictureType) {
		Dispatch.put(this, "PictureType", pictureType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void paste() {
		Dispatch.call(this, "Paste");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getPictureUnit() {
		return Dispatch.get(this, "PictureUnit");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pictureUnit an input-parameter of type Variant
	 */
	public void setPictureUnit(Variant pictureUnit) {
		Dispatch.put(this, "PictureUnit", pictureUnit);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getThickness() {
		return Dispatch.get(this, "Thickness").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param thickness an input-parameter of type int
	 */
	public void setThickness(int thickness) {
		Dispatch.put(this, "Thickness", new Variant(thickness));
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
