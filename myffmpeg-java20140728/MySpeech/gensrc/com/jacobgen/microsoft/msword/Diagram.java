/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Diagram extends Dispatch {

	public static final String componentName = "Word.Diagram";

	public Diagram() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Diagram(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Diagram(String compName) {
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
	 * @return the result is of type DiagramNodes
	 */
	public DiagramNodes getNodes() {
		return new DiagramNodes(Dispatch.get(this, "Nodes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoDiagramType
	 */
	public MsoDiagramType getType() {
		return new MsoDiagramType(Dispatch.get(this, "Type").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getAutoLayout() {
		return new MsoTriState(Dispatch.get(this, "AutoLayout").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoLayout an input-parameter of type MsoTriState
	 */
	public void setAutoLayout(MsoTriState autoLayout) {
		Dispatch.put(this, "AutoLayout", autoLayout);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getReverse() {
		return new MsoTriState(Dispatch.get(this, "Reverse").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param reverse an input-parameter of type MsoTriState
	 */
	public void setReverse(MsoTriState reverse) {
		Dispatch.put(this, "Reverse", reverse);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getAutoFormat() {
		return new MsoTriState(Dispatch.get(this, "AutoFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormat an input-parameter of type MsoTriState
	 */
	public void setAutoFormat(MsoTriState autoFormat) {
		Dispatch.put(this, "AutoFormat", autoFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type MsoDiagramType
	 */
	public void convert(MsoDiagramType type) {
		Dispatch.call(this, "Convert", type);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void fitText() {
		Dispatch.call(this, "FitText");
	}

}
