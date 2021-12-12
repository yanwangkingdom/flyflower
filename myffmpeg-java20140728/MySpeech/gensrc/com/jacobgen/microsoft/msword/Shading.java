/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Shading extends Dispatch {

	public static final String componentName = "Word.Shading";

	public Shading() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Shading(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Shading(String compName) {
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
	 * @return the result is of type int
	 */
	public int getForegroundPatternColorIndex() {
		return Dispatch.get(this, "ForegroundPatternColorIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param foregroundPatternColorIndex an input-parameter of type int
	 */
	public void setForegroundPatternColorIndex(int foregroundPatternColorIndex) {
		Dispatch.put(this, "ForegroundPatternColorIndex", new Variant(foregroundPatternColorIndex));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBackgroundPatternColorIndex() {
		return Dispatch.get(this, "BackgroundPatternColorIndex").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param backgroundPatternColorIndex an input-parameter of type int
	 */
	public void setBackgroundPatternColorIndex(int backgroundPatternColorIndex) {
		Dispatch.put(this, "BackgroundPatternColorIndex", new Variant(backgroundPatternColorIndex));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getTexture() {
		return Dispatch.get(this, "Texture").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param texture an input-parameter of type int
	 */
	public void setTexture(int texture) {
		Dispatch.put(this, "Texture", new Variant(texture));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getForegroundPatternColor() {
		return Dispatch.get(this, "ForegroundPatternColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param foregroundPatternColor an input-parameter of type int
	 */
	public void setForegroundPatternColor(int foregroundPatternColor) {
		Dispatch.put(this, "ForegroundPatternColor", new Variant(foregroundPatternColor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBackgroundPatternColor() {
		return Dispatch.get(this, "BackgroundPatternColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param backgroundPatternColor an input-parameter of type int
	 */
	public void setBackgroundPatternColor(int backgroundPatternColor) {
		Dispatch.put(this, "BackgroundPatternColor", new Variant(backgroundPatternColor));
	}

}
