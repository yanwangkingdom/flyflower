/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Interior extends Dispatch {

	public static final String componentName = "Word.Interior";

	public Interior() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Interior(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Interior(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getColor() {
		return Dispatch.get(this, "Color");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param color an input-parameter of type Variant
	 */
	public void setColor(Variant color) {
		Dispatch.put(this, "Color", color);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getColorIndex() {
		return Dispatch.get(this, "ColorIndex");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param colorIndex an input-parameter of type Variant
	 */
	public void setColorIndex(Variant colorIndex) {
		Dispatch.put(this, "ColorIndex", colorIndex);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getInvertIfNegative() {
		return Dispatch.get(this, "InvertIfNegative");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param invertIfNegative an input-parameter of type Variant
	 */
	public void setInvertIfNegative(Variant invertIfNegative) {
		Dispatch.put(this, "InvertIfNegative", invertIfNegative);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getPattern() {
		return Dispatch.get(this, "Pattern");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pattern an input-parameter of type Variant
	 */
	public void setPattern(Variant pattern) {
		Dispatch.put(this, "Pattern", pattern);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getPatternColor() {
		return Dispatch.get(this, "PatternColor");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param patternColor an input-parameter of type Variant
	 */
	public void setPatternColor(Variant patternColor) {
		Dispatch.put(this, "PatternColor", patternColor);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getPatternColorIndex() {
		return Dispatch.get(this, "PatternColorIndex");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param patternColorIndex an input-parameter of type Variant
	 */
	public void setPatternColorIndex(Variant patternColorIndex) {
		Dispatch.put(this, "PatternColorIndex", patternColorIndex);
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
	 * @return the result is of type Object
	 */
	public Object getParent() {
		return Dispatch.get(this, "Parent");
	}

}
