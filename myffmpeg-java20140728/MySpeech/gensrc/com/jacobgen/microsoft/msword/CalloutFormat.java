/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class CalloutFormat extends Dispatch {

	public static final String componentName = "Word.CalloutFormat";

	public CalloutFormat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public CalloutFormat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public CalloutFormat(String compName) {
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
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getAccent() {
		return new MsoTriState(Dispatch.get(this, "Accent").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param accent an input-parameter of type MsoTriState
	 */
	public void setAccent(MsoTriState accent) {
		Dispatch.put(this, "Accent", accent);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoCalloutAngleType
	 */
	public MsoCalloutAngleType getAngle() {
		return new MsoCalloutAngleType(Dispatch.get(this, "Angle").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param angle an input-parameter of type MsoCalloutAngleType
	 */
	public void setAngle(MsoCalloutAngleType angle) {
		Dispatch.put(this, "Angle", angle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getAutoAttach() {
		return new MsoTriState(Dispatch.get(this, "AutoAttach").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoAttach an input-parameter of type MsoTriState
	 */
	public void setAutoAttach(MsoTriState autoAttach) {
		Dispatch.put(this, "AutoAttach", autoAttach);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getAutoLength() {
		return new MsoTriState(Dispatch.get(this, "AutoLength").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getBorder() {
		return new MsoTriState(Dispatch.get(this, "Border").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param border an input-parameter of type MsoTriState
	 */
	public void setBorder(MsoTriState border) {
		Dispatch.put(this, "Border", border);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getDrop() {
		return Dispatch.get(this, "Drop").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoCalloutDropType
	 */
	public MsoCalloutDropType getDropType() {
		return new MsoCalloutDropType(Dispatch.get(this, "DropType").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getGap() {
		return Dispatch.get(this, "Gap").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gap an input-parameter of type float
	 */
	public void setGap(float gap) {
		Dispatch.put(this, "Gap", new Variant(gap));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLength() {
		return Dispatch.get(this, "Length").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoCalloutType
	 */
	public MsoCalloutType getType() {
		return new MsoCalloutType(Dispatch.get(this, "Type").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type MsoCalloutType
	 */
	public void setType(MsoCalloutType type) {
		Dispatch.put(this, "Type", type);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void automaticLength() {
		Dispatch.call(this, "AutomaticLength");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param drop an input-parameter of type float
	 */
	public void customDrop(float drop) {
		Dispatch.call(this, "CustomDrop", new Variant(drop));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param length an input-parameter of type float
	 */
	public void customLength(float length) {
		Dispatch.call(this, "CustomLength", new Variant(length));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dropType an input-parameter of type MsoCalloutDropType
	 */
	public void presetDrop(MsoCalloutDropType dropType) {
		Dispatch.call(this, "PresetDrop", dropType);
	}

}
