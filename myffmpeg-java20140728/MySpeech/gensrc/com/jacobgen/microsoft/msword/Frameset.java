/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Frameset extends Dispatch {

	public static final String componentName = "Word.Frameset";

	public Frameset() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Frameset(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Frameset(String compName) {
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
	 * @return the result is of type Frameset
	 */
	public Frameset getParentFrameset() {
		return new Frameset(Dispatch.get(this, "ParentFrameset").toDispatch());
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
	 * @return the result is of type int
	 */
	public int getWidthType() {
		return Dispatch.get(this, "WidthType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param widthType an input-parameter of type int
	 */
	public void setWidthType(int widthType) {
		Dispatch.put(this, "WidthType", new Variant(widthType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHeightType() {
		return Dispatch.get(this, "HeightType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param heightType an input-parameter of type int
	 */
	public void setHeightType(int heightType) {
		Dispatch.put(this, "HeightType", new Variant(heightType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getWidth() {
		return Dispatch.get(this, "Width").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param width an input-parameter of type int
	 */
	public void setWidth(int width) {
		Dispatch.put(this, "Width", new Variant(width));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHeight() {
		return Dispatch.get(this, "Height").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param height an input-parameter of type int
	 */
	public void setHeight(int height) {
		Dispatch.put(this, "Height", new Variant(height));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getChildFramesetCount() {
		return Dispatch.get(this, "ChildFramesetCount").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type Frameset
	 */
	public Frameset getChildFramesetItem(int index) {
		return new Frameset(Dispatch.call(this, "ChildFramesetItem", new Variant(index)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getFramesetBorderWidth() {
		return Dispatch.get(this, "FramesetBorderWidth").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param framesetBorderWidth an input-parameter of type float
	 */
	public void setFramesetBorderWidth(float framesetBorderWidth) {
		Dispatch.put(this, "FramesetBorderWidth", new Variant(framesetBorderWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFramesetBorderColor() {
		return Dispatch.get(this, "FramesetBorderColor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param framesetBorderColor an input-parameter of type int
	 */
	public void setFramesetBorderColor(int framesetBorderColor) {
		Dispatch.put(this, "FramesetBorderColor", new Variant(framesetBorderColor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFrameScrollbarType() {
		return Dispatch.get(this, "FrameScrollbarType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param frameScrollbarType an input-parameter of type int
	 */
	public void setFrameScrollbarType(int frameScrollbarType) {
		Dispatch.put(this, "FrameScrollbarType", new Variant(frameScrollbarType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFrameResizable() {
		return Dispatch.get(this, "FrameResizable").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param frameResizable an input-parameter of type boolean
	 */
	public void setFrameResizable(boolean frameResizable) {
		Dispatch.put(this, "FrameResizable", new Variant(frameResizable));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFrameName() {
		return Dispatch.get(this, "FrameName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param frameName an input-parameter of type String
	 */
	public void setFrameName(String frameName) {
		Dispatch.put(this, "FrameName", frameName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFrameDisplayBorders() {
		return Dispatch.get(this, "FrameDisplayBorders").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param frameDisplayBorders an input-parameter of type boolean
	 */
	public void setFrameDisplayBorders(boolean frameDisplayBorders) {
		Dispatch.put(this, "FrameDisplayBorders", new Variant(frameDisplayBorders));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFrameDefaultURL() {
		return Dispatch.get(this, "FrameDefaultURL").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param frameDefaultURL an input-parameter of type String
	 */
	public void setFrameDefaultURL(String frameDefaultURL) {
		Dispatch.put(this, "FrameDefaultURL", frameDefaultURL);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFrameLinkToFile() {
		return Dispatch.get(this, "FrameLinkToFile").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param frameLinkToFile an input-parameter of type boolean
	 */
	public void setFrameLinkToFile(boolean frameLinkToFile) {
		Dispatch.put(this, "FrameLinkToFile", new Variant(frameLinkToFile));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param where an input-parameter of type int
	 * @return the result is of type Frameset
	 */
	public Frameset addNewFrame(int where) {
		return new Frameset(Dispatch.call(this, "AddNewFrame", new Variant(where)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

}
