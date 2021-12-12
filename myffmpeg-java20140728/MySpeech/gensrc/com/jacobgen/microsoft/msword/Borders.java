/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Borders extends Dispatch {

	public static final String componentName = "Word.Borders";

	public Borders() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Borders(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Borders(String compName) {
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
	 * @return the result is of type int
	 */
	public int getEnable() {
		return Dispatch.get(this, "Enable").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param enable an input-parameter of type int
	 */
	public void setEnable(int enable) {
		Dispatch.put(this, "Enable", new Variant(enable));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDistanceFromTop() {
		return Dispatch.get(this, "DistanceFromTop").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param distanceFromTop an input-parameter of type int
	 */
	public void setDistanceFromTop(int distanceFromTop) {
		Dispatch.put(this, "DistanceFromTop", new Variant(distanceFromTop));
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
	 * @return the result is of type int
	 */
	public int getInsideLineStyle() {
		return Dispatch.get(this, "InsideLineStyle").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param insideLineStyle an input-parameter of type int
	 */
	public void setInsideLineStyle(int insideLineStyle) {
		Dispatch.put(this, "InsideLineStyle", new Variant(insideLineStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOutsideLineStyle() {
		return Dispatch.get(this, "OutsideLineStyle").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outsideLineStyle an input-parameter of type int
	 */
	public void setOutsideLineStyle(int outsideLineStyle) {
		Dispatch.put(this, "OutsideLineStyle", new Variant(outsideLineStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getInsideLineWidth() {
		return Dispatch.get(this, "InsideLineWidth").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param insideLineWidth an input-parameter of type int
	 */
	public void setInsideLineWidth(int insideLineWidth) {
		Dispatch.put(this, "InsideLineWidth", new Variant(insideLineWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOutsideLineWidth() {
		return Dispatch.get(this, "OutsideLineWidth").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outsideLineWidth an input-parameter of type int
	 */
	public void setOutsideLineWidth(int outsideLineWidth) {
		Dispatch.put(this, "OutsideLineWidth", new Variant(outsideLineWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getInsideColorIndex() {
		return Dispatch.get(this, "InsideColorIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param insideColorIndex an input-parameter of type int
	 */
	public void setInsideColorIndex(int insideColorIndex) {
		Dispatch.put(this, "InsideColorIndex", new Variant(insideColorIndex));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOutsideColorIndex() {
		return Dispatch.get(this, "OutsideColorIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outsideColorIndex an input-parameter of type int
	 */
	public void setOutsideColorIndex(int outsideColorIndex) {
		Dispatch.put(this, "OutsideColorIndex", new Variant(outsideColorIndex));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDistanceFromLeft() {
		return Dispatch.get(this, "DistanceFromLeft").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param distanceFromLeft an input-parameter of type int
	 */
	public void setDistanceFromLeft(int distanceFromLeft) {
		Dispatch.put(this, "DistanceFromLeft", new Variant(distanceFromLeft));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDistanceFromBottom() {
		return Dispatch.get(this, "DistanceFromBottom").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param distanceFromBottom an input-parameter of type int
	 */
	public void setDistanceFromBottom(int distanceFromBottom) {
		Dispatch.put(this, "DistanceFromBottom", new Variant(distanceFromBottom));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDistanceFromRight() {
		return Dispatch.get(this, "DistanceFromRight").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param distanceFromRight an input-parameter of type int
	 */
	public void setDistanceFromRight(int distanceFromRight) {
		Dispatch.put(this, "DistanceFromRight", new Variant(distanceFromRight));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAlwaysInFront() {
		return Dispatch.get(this, "AlwaysInFront").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param alwaysInFront an input-parameter of type boolean
	 */
	public void setAlwaysInFront(boolean alwaysInFront) {
		Dispatch.put(this, "AlwaysInFront", new Variant(alwaysInFront));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSurroundHeader() {
		return Dispatch.get(this, "SurroundHeader").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param surroundHeader an input-parameter of type boolean
	 */
	public void setSurroundHeader(boolean surroundHeader) {
		Dispatch.put(this, "SurroundHeader", new Variant(surroundHeader));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSurroundFooter() {
		return Dispatch.get(this, "SurroundFooter").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param surroundFooter an input-parameter of type boolean
	 */
	public void setSurroundFooter(boolean surroundFooter) {
		Dispatch.put(this, "SurroundFooter", new Variant(surroundFooter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getJoinBorders() {
		return Dispatch.get(this, "JoinBorders").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param joinBorders an input-parameter of type boolean
	 */
	public void setJoinBorders(boolean joinBorders) {
		Dispatch.put(this, "JoinBorders", new Variant(joinBorders));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasHorizontal() {
		return Dispatch.get(this, "HasHorizontal").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasVertical() {
		return Dispatch.get(this, "HasVertical").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDistanceFrom() {
		return Dispatch.get(this, "DistanceFrom").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param distanceFrom an input-parameter of type int
	 */
	public void setDistanceFrom(int distanceFrom) {
		Dispatch.put(this, "DistanceFrom", new Variant(distanceFrom));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getEnableFirstPageInSection() {
		return Dispatch.get(this, "EnableFirstPageInSection").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param enableFirstPageInSection an input-parameter of type boolean
	 */
	public void setEnableFirstPageInSection(boolean enableFirstPageInSection) {
		Dispatch.put(this, "EnableFirstPageInSection", new Variant(enableFirstPageInSection));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getEnableOtherPagesInSection() {
		return Dispatch.get(this, "EnableOtherPagesInSection").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param enableOtherPagesInSection an input-parameter of type boolean
	 */
	public void setEnableOtherPagesInSection(boolean enableOtherPagesInSection) {
		Dispatch.put(this, "EnableOtherPagesInSection", new Variant(enableOtherPagesInSection));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type Border
	 */
	public Border item(int index) {
		return new Border(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void applyPageBordersToAllSections() {
		Dispatch.call(this, "ApplyPageBordersToAllSections");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getInsideColor() {
		return Dispatch.get(this, "InsideColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param insideColor an input-parameter of type int
	 */
	public void setInsideColor(int insideColor) {
		Dispatch.put(this, "InsideColor", new Variant(insideColor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOutsideColor() {
		return Dispatch.get(this, "OutsideColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outsideColor an input-parameter of type int
	 */
	public void setOutsideColor(int outsideColor) {
		Dispatch.put(this, "OutsideColor", new Variant(outsideColor));
	}

}
