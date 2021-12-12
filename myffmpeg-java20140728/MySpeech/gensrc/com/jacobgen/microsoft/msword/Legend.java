/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Legend extends Dispatch {

	public static final String componentName = "Word.Legend";

	public Legend() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Legend(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Legend(String compName) {
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
	 * @return the result is of type ChartBorder
	 */
	public ChartBorder getBorder() {
		return new ChartBorder(Dispatch.get(this, "Border").toDispatch());
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
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object legendEntries(Variant index) {
		return Dispatch.call(this, "LegendEntries", index);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object legendEntries() {
		return Dispatch.call(this, "LegendEntries");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Object
	 */
	public Object legendEntries(Variant index) {
		Object result_of_LegendEntries = Dispatch.call(this, "LegendEntries", index);


		return result_of_LegendEntries;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPosition() {
		return Dispatch.get(this, "Position").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param position an input-parameter of type int
	 */
	public void setPosition(int position) {
		Dispatch.put(this, "Position", new Variant(position));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShadow() {
		return Dispatch.get(this, "Shadow").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shadow an input-parameter of type boolean
	 */
	public void setShadow(boolean shadow) {
		Dispatch.put(this, "Shadow", new Variant(shadow));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant clear() {
		return Dispatch.call(this, "Clear");
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
	 * @param height an input-parameter of type double
	 */
	public void setHeight(double height) {
		Dispatch.put(this, "Height", new Variant(height));
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
	 * @return the result is of type double
	 */
	public double getLeft() {
		return Dispatch.get(this, "Left").changeType(Variant.VariantDouble).getDouble();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param left an input-parameter of type double
	 */
	public void setLeft(double left) {
		Dispatch.put(this, "Left", new Variant(left));
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
	 * @param top an input-parameter of type double
	 */
	public void setTop(double top) {
		Dispatch.put(this, "Top", new Variant(top));
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
	 * @param width an input-parameter of type double
	 */
	public void setWidth(double width) {
		Dispatch.put(this, "Width", new Variant(width));
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
	 * @return the result is of type boolean
	 */
	public boolean getIncludeInLayout() {
		return Dispatch.get(this, "IncludeInLayout").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param includeInLayout an input-parameter of type boolean
	 */
	public void setIncludeInLayout(boolean includeInLayout) {
		Dispatch.put(this, "IncludeInLayout", new Variant(includeInLayout));
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
