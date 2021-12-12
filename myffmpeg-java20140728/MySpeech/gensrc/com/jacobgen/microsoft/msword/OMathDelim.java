/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OMathDelim extends Dispatch {

	public static final String componentName = "Word.OMathDelim";

	public OMathDelim() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OMathDelim(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OMathDelim(String compName) {
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
	 * @return the result is of type OMathArgs
	 */
	public OMathArgs getE() {
		return new OMathArgs(Dispatch.get(this, "E").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type short
	 */
	public short getBegChar() {
		return Dispatch.get(this, "BegChar").changeType(Variant.VariantShort).getShort();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param begChar an input-parameter of type short
	 */
	public void setBegChar(short begChar) {
		Dispatch.put(this, "BegChar", new Variant(begChar));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type short
	 */
	public short getSepChar() {
		return Dispatch.get(this, "SepChar").changeType(Variant.VariantShort).getShort();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param sepChar an input-parameter of type short
	 */
	public void setSepChar(short sepChar) {
		Dispatch.put(this, "SepChar", new Variant(sepChar));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type short
	 */
	public short getEndChar() {
		return Dispatch.get(this, "EndChar").changeType(Variant.VariantShort).getShort();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param endChar an input-parameter of type short
	 */
	public void setEndChar(short endChar) {
		Dispatch.put(this, "EndChar", new Variant(endChar));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getGrow() {
		return Dispatch.get(this, "Grow").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param grow an input-parameter of type boolean
	 */
	public void setGrow(boolean grow) {
		Dispatch.put(this, "Grow", new Variant(grow));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getShape() {
		return Dispatch.get(this, "Shape").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shape an input-parameter of type int
	 */
	public void setShape(int shape) {
		Dispatch.put(this, "Shape", new Variant(shape));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getNoLeftChar() {
		return Dispatch.get(this, "NoLeftChar").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param noLeftChar an input-parameter of type boolean
	 */
	public void setNoLeftChar(boolean noLeftChar) {
		Dispatch.put(this, "NoLeftChar", new Variant(noLeftChar));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getNoRightChar() {
		return Dispatch.get(this, "NoRightChar").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param noRightChar an input-parameter of type boolean
	 */
	public void setNoRightChar(boolean noRightChar) {
		Dispatch.put(this, "NoRightChar", new Variant(noRightChar));
	}

}
