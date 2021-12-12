/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class AxisTitle extends Dispatch {

	public static final String componentName = "Word.AxisTitle";

	public AxisTitle() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public AxisTitle(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public AxisTitle(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getCaption() {
		return Dispatch.get(this, "Caption").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param caption an input-parameter of type String
	 */
	public void setCaption(String caption) {
		Dispatch.put(this, "Caption", caption);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param start an input-parameter of type Variant
	 * @param length an input-parameter of type Variant
	 * @return the result is of type ChartCharacters
	 */
	public ChartCharacters getCharacters(Variant start, Variant length) {
		return new ChartCharacters(Dispatch.call(this, "Characters", start, length).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param start an input-parameter of type Variant
	 * @return the result is of type ChartCharacters
	 */
	public ChartCharacters getCharacters(Variant start) {
		return new ChartCharacters(Dispatch.call(this, "Characters", start).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ChartCharacters
	 */
	public ChartCharacters getCharacters() {
		return new ChartCharacters(Dispatch.get(this, "Characters").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param start an input-parameter of type Variant
	 * @param length an input-parameter of type Variant
	 * @return the result is of type ChartCharacters
	 */
	public ChartCharacters getCharacters(Variant start, Variant length) {
		ChartCharacters result_of_Characters = new ChartCharacters(Dispatch.call(this, "Characters", start, length).toDispatch());


		return result_of_Characters;
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
	 * @return the result is of type Variant
	 */
	public Variant getHorizontalAlignment() {
		return Dispatch.get(this, "HorizontalAlignment");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param horizontalAlignment an input-parameter of type Variant
	 */
	public void setHorizontalAlignment(Variant horizontalAlignment) {
		Dispatch.put(this, "HorizontalAlignment", horizontalAlignment);
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
	 * @return the result is of type Variant
	 */
	public Variant getOrientation() {
		return Dispatch.get(this, "Orientation");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param orientation an input-parameter of type Variant
	 */
	public void setOrientation(Variant orientation) {
		Dispatch.put(this, "Orientation", orientation);
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
	 * @return the result is of type String
	 */
	public String getText() {
		return Dispatch.get(this, "Text").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 */
	public void setText(String text) {
		Dispatch.put(this, "Text", text);
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
	 * @return the result is of type Variant
	 */
	public Variant getVerticalAlignment() {
		return Dispatch.get(this, "VerticalAlignment");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param verticalAlignment an input-parameter of type Variant
	 */
	public void setVerticalAlignment(Variant verticalAlignment) {
		Dispatch.put(this, "VerticalAlignment", verticalAlignment);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getReadingOrder() {
		return Dispatch.get(this, "ReadingOrder").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param readingOrder an input-parameter of type int
	 */
	public void setReadingOrder(int readingOrder) {
		Dispatch.put(this, "ReadingOrder", new Variant(readingOrder));
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
	public Variant delete() {
		return Dispatch.call(this, "Delete");
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
	 * @return the result is of type String
	 */
	public String getName() {
		return Dispatch.get(this, "Name").toString();
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
	public Variant select() {
		return Dispatch.call(this, "Select");
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

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type double
	 */
	public double getHeight() {
		return Dispatch.get(this, "Height").changeType(Variant.VariantDouble).getDouble();
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
	 * @return the result is of type String
	 */
	public String getFormula() {
		return Dispatch.get(this, "Formula").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formula an input-parameter of type String
	 */
	public void setFormula(String formula) {
		Dispatch.put(this, "Formula", formula);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFormulaR1C1() {
		return Dispatch.get(this, "FormulaR1C1").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formulaR1C1 an input-parameter of type String
	 */
	public void setFormulaR1C1(String formulaR1C1) {
		Dispatch.put(this, "FormulaR1C1", formulaR1C1);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFormulaLocal() {
		return Dispatch.get(this, "FormulaLocal").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formulaLocal an input-parameter of type String
	 */
	public void setFormulaLocal(String formulaLocal) {
		Dispatch.put(this, "FormulaLocal", formulaLocal);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFormulaR1C1Local() {
		return Dispatch.get(this, "FormulaR1C1Local").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formulaR1C1Local an input-parameter of type String
	 */
	public void setFormulaR1C1Local(String formulaR1C1Local) {
		Dispatch.put(this, "FormulaR1C1Local", formulaR1C1Local);
	}

}
