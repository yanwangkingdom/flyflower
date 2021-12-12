/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OMathFunction extends Dispatch {

	public static final String componentName = "Word.OMathFunction";

	public OMathFunction() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OMathFunction(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OMathFunction(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getType() {
		return Dispatch.get(this, "Type").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type Range
	 */
	public Range getRange() {
		return new Range(Dispatch.get(this, "Range").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathArgs
	 */
	public OMathArgs getArgs() {
		return new OMathArgs(Dispatch.get(this, "Args").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathAcc
	 */
	public OMathAcc getAcc() {
		return new OMathAcc(Dispatch.get(this, "Acc").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathBar
	 */
	public OMathBar getBar() {
		return new OMathBar(Dispatch.get(this, "Bar").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathBox
	 */
	public OMathBox getBox() {
		return new OMathBox(Dispatch.get(this, "Box").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathBorderBox
	 */
	public OMathBorderBox getBorderBox() {
		return new OMathBorderBox(Dispatch.get(this, "BorderBox").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathDelim
	 */
	public OMathDelim getDelim() {
		return new OMathDelim(Dispatch.get(this, "Delim").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathEqArray
	 */
	public OMathEqArray getEqArray() {
		return new OMathEqArray(Dispatch.get(this, "EqArray").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathFrac
	 */
	public OMathFrac getFrac() {
		return new OMathFrac(Dispatch.get(this, "Frac").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathFunc
	 */
	public OMathFunc getFunc() {
		return new OMathFunc(Dispatch.get(this, "Func").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathGroupChar
	 */
	public OMathGroupChar getGroupChar() {
		return new OMathGroupChar(Dispatch.get(this, "GroupChar").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathLimLow
	 */
	public OMathLimLow getLimLow() {
		return new OMathLimLow(Dispatch.get(this, "LimLow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathLimUpp
	 */
	public OMathLimUpp getLimUpp() {
		return new OMathLimUpp(Dispatch.get(this, "LimUpp").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathMat
	 */
	public OMathMat getMat() {
		return new OMathMat(Dispatch.get(this, "Mat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathNary
	 */
	public OMathNary getNary() {
		return new OMathNary(Dispatch.get(this, "Nary").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathPhantom
	 */
	public OMathPhantom getPhantom() {
		return new OMathPhantom(Dispatch.get(this, "Phantom").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathScrPre
	 */
	public OMathScrPre getScrPre() {
		return new OMathScrPre(Dispatch.get(this, "ScrPre").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathRad
	 */
	public OMathRad getRad() {
		return new OMathRad(Dispatch.get(this, "Rad").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathScrSub
	 */
	public OMathScrSub getScrSub() {
		return new OMathScrSub(Dispatch.get(this, "ScrSub").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathScrSubSup
	 */
	public OMathScrSubSup getScrSubSup() {
		return new OMathScrSubSup(Dispatch.get(this, "ScrSubSup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathScrSup
	 */
	public OMathScrSup getScrSup() {
		return new OMathScrSup(Dispatch.get(this, "ScrSup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMath
	 */
	public OMath getOMath() {
		return new OMath(Dispatch.get(this, "OMath").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathFunction
	 */
	public OMathFunction remove() {
		return new OMathFunction(Dispatch.call(this, "Remove").toDispatch());
	}

}
