/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ReflectionFormat extends Dispatch {

	public static final String componentName = "Word.ReflectionFormat";

	public ReflectionFormat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ReflectionFormat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ReflectionFormat(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoReflectionType
	 */
	public MsoReflectionType getType() {
		return new MsoReflectionType(Dispatch.get(this, "Type").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type MsoReflectionType
	 */
	public void setType(MsoReflectionType type) {
		Dispatch.put(this, "Type", type);
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
	 * @return the result is of type float
	 */
	public float getTransparency() {
		return Dispatch.get(this, "Transparency").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param transparency an input-parameter of type float
	 */
	public void setTransparency(float transparency) {
		Dispatch.put(this, "Transparency", new Variant(transparency));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getSize() {
		return Dispatch.get(this, "Size").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param size an input-parameter of type float
	 */
	public void setSize(float size) {
		Dispatch.put(this, "Size", new Variant(size));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getOffset() {
		return Dispatch.get(this, "Offset").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param offset an input-parameter of type float
	 */
	public void setOffset(float offset) {
		Dispatch.put(this, "Offset", new Variant(offset));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getBlur() {
		return Dispatch.get(this, "Blur").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param blur an input-parameter of type float
	 */
	public void setBlur(float blur) {
		Dispatch.put(this, "Blur", new Variant(blur));
	}

}
