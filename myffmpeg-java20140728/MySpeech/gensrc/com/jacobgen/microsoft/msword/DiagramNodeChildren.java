/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class DiagramNodeChildren extends Dispatch {

	public static final String componentName = "Word.DiagramNodeChildren";

	public DiagramNodeChildren() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public DiagramNodeChildren(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public DiagramNodeChildren(String compName) {
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
	 * @return the result is of type Variant
	 */
	public Variant get_NewEnum() {
		return Dispatch.get(this, "_NewEnum");
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
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode getFirstChild() {
		return new DiagramNode(Dispatch.get(this, "FirstChild").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode getLastChild() {
		return new DiagramNode(Dispatch.get(this, "LastChild").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode item(Variant index) {
		return new DiagramNode(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @param nodeType an input-parameter of type MsoDiagramNodeType
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode addNode(Variant index, MsoDiagramNodeType nodeType) {
		return new DiagramNode(Dispatch.call(this, "AddNode", index, nodeType).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode addNode(Variant index) {
		return new DiagramNode(Dispatch.call(this, "AddNode", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode addNode() {
		return new DiagramNode(Dispatch.call(this, "AddNode").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @param nodeType an input-parameter of type MsoDiagramNodeType
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode addNode(Variant index, MsoDiagramNodeType nodeType) {
		DiagramNode result_of_AddNode = new DiagramNode(Dispatch.call(this, "AddNode", index, nodeType).toDispatch());


		return result_of_AddNode;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void selectAll() {
		Dispatch.call(this, "SelectAll");
	}

}
