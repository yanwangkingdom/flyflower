/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class OMath extends Dispatch {

	public static final String componentName = "Word.OMath";

	public OMath() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public OMath(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public OMath(String compName) {
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
	 * @return the result is of type Range
	 */
	public Range getRange() {
		return new Range(Dispatch.get(this, "Range").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathFunctions
	 */
	public OMathFunctions getFunctions() {
		return new OMathFunctions(Dispatch.get(this, "Functions").toDispatch());
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
	 * @param type an input-parameter of type int
	 */
	public void setType(int type) {
		Dispatch.put(this, "Type", new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMath
	 */
	public OMath getParentOMath() {
		return new OMath(Dispatch.get(this, "ParentOMath").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathFunction
	 */
	public OMathFunction getParentFunction() {
		return new OMathFunction(Dispatch.get(this, "ParentFunction").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathMatRow
	 */
	public OMathMatRow getParentRow() {
		return new OMathMatRow(Dispatch.get(this, "ParentRow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathMatCol
	 */
	public OMathMatCol getParentCol() {
		return new OMathMatCol(Dispatch.get(this, "ParentCol").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMath
	 */
	public OMath getParentArg() {
		return new OMath(Dispatch.get(this, "ParentArg").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getArgIndex() {
		return Dispatch.get(this, "ArgIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNestingLevel() {
		return Dispatch.get(this, "NestingLevel").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getArgSize() {
		return Dispatch.get(this, "ArgSize").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param argSize an input-parameter of type int
	 */
	public void setArgSize(int argSize) {
		Dispatch.put(this, "ArgSize", new Variant(argSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathBreaks
	 */
	public OMathBreaks getBreaks() {
		return new OMathBreaks(Dispatch.get(this, "Breaks").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getJustification() {
		return Dispatch.get(this, "Justification").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param justification an input-parameter of type int
	 */
	public void setJustification(int justification) {
		Dispatch.put(this, "Justification", new Variant(justification));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAlignPoint() {
		return Dispatch.get(this, "AlignPoint").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param alignPoint an input-parameter of type int
	 */
	public void setAlignPoint(int alignPoint) {
		Dispatch.put(this, "AlignPoint", new Variant(alignPoint));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void linearize() {
		Dispatch.call(this, "Linearize");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void buildUp() {
		Dispatch.call(this, "BuildUp");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void remove() {
		Dispatch.call(this, "Remove");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void convertToMathText() {
		Dispatch.call(this, "ConvertToMathText");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void convertToNormalText() {
		Dispatch.call(this, "ConvertToNormalText");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void convertToLiteralText() {
		Dispatch.call(this, "ConvertToLiteralText");
	}

}
