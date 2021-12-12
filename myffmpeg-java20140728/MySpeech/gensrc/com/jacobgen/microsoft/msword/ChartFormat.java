/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ChartFormat extends Dispatch {

	public static final String componentName = "Word.ChartFormat";

	public ChartFormat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ChartFormat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ChartFormat(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FillFormat
	 */
	public FillFormat getFill() {
		return new FillFormat(Dispatch.get(this, "Fill").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type GlowFormat
	 */
	public GlowFormat getGlow() {
		return new GlowFormat(Dispatch.get(this, "Glow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type LineFormat
	 */
	public LineFormat getLine() {
		return new LineFormat(Dispatch.get(this, "Line").toDispatch());
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
	 * @return the result is of type PictureFormat
	 */
	public PictureFormat getPictureFormat() {
		return new PictureFormat(Dispatch.get(this, "PictureFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ShadowFormat
	 */
	public ShadowFormat getShadow() {
		return new ShadowFormat(Dispatch.get(this, "Shadow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SoftEdgeFormat
	 */
	public SoftEdgeFormat getSoftEdge() {
		return new SoftEdgeFormat(Dispatch.get(this, "SoftEdge").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TextFrame2
	 */
	public TextFrame2 getTextFrame2() {
		return new TextFrame2(Dispatch.get(this, "TextFrame2").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ThreeDFormat
	 */
	public ThreeDFormat getThreeD() {
		return new ThreeDFormat(Dispatch.get(this, "ThreeD").toDispatch());
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
	 * @return the result is of type Adjustments
	 */
	public Adjustments getAdjustments() {
		return new Adjustments(Dispatch.get(this, "Adjustments").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoAutoShapeType
	 */
	public MsoAutoShapeType getAutoShapeType() {
		return new MsoAutoShapeType(Dispatch.get(this, "AutoShapeType").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoShapeType an input-parameter of type MsoAutoShapeType
	 */
	public void setAutoShapeType(MsoAutoShapeType autoShapeType) {
		Dispatch.put(this, "AutoShapeType", autoShapeType);
	}

}
