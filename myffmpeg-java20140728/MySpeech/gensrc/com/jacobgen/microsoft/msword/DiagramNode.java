/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class DiagramNode extends Dispatch {

	public static final String componentName = "Word.DiagramNode";

	public DiagramNode() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public DiagramNode(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public DiagramNode(String compName) {
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
	 * @return the result is of type DiagramNodeChildren
	 */
	public DiagramNodeChildren getChildren() {
		return new DiagramNodeChildren(Dispatch.get(this, "Children").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Shape
	 */
	public Shape getShape() {
		return new Shape(Dispatch.get(this, "Shape").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode getRoot() {
		return new DiagramNode(Dispatch.get(this, "Root").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Diagram
	 */
	public Diagram getDiagram() {
		return new Diagram(Dispatch.get(this, "Diagram").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoOrgChartLayoutType
	 */
	public MsoOrgChartLayoutType getLayout() {
		return new MsoOrgChartLayoutType(Dispatch.get(this, "Layout").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param layout an input-parameter of type MsoOrgChartLayoutType
	 */
	public void setLayout(MsoOrgChartLayoutType layout) {
		Dispatch.put(this, "Layout", layout);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Shape
	 */
	public Shape getTextShape() {
		return new Shape(Dispatch.get(this, "TextShape").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pos an input-parameter of type MsoRelativeNodePosition
	 * @param nodeType an input-parameter of type MsoDiagramNodeType
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode addNode(MsoRelativeNodePosition pos, MsoDiagramNodeType nodeType) {
		return new DiagramNode(Dispatch.call(this, "AddNode", pos, nodeType).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pos an input-parameter of type MsoRelativeNodePosition
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode addNode(MsoRelativeNodePosition pos) {
		return new DiagramNode(Dispatch.call(this, "AddNode", pos).toDispatch());
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
	 * @param pos an input-parameter of type MsoRelativeNodePosition
	 * @param nodeType an input-parameter of type MsoDiagramNodeType
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode addNode(MsoRelativeNodePosition pos, MsoDiagramNodeType nodeType) {
		DiagramNode result_of_AddNode = new DiagramNode(Dispatch.call(this, "AddNode", pos, nodeType).toDispatch());


		return result_of_AddNode;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param targetNode an input-parameter of type VT_PTR
	 * @param pos an input-parameter of type MsoRelativeNodePosition
	 */
	public void moveNode(VT_PTR targetNode, MsoRelativeNodePosition pos) {
		Dispatch.call(this, "MoveNode", targetNode, pos);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param targetNode is an one-element array which sends the input-parameter
	 *                   to the ActiveX-Component and receives the output-parameter
	 * @param pos an input-parameter of type MsoRelativeNodePosition
	 */
	public void moveNode(VT_PTR[] targetNode, MsoRelativeNodePosition pos) {
		Variant vnt_targetNode = new Variant();
		if( targetNode == null || targetNode.length == 0 )
			vnt_targetNode.putNoParam();
		else
			vnt_targetNode.putVT_PTRRef(targetNode[0]);

		Dispatch.call(this, "MoveNode", vnt_targetNode, pos);

		if( targetNode != null && targetNode.length > 0 )
			targetNode[0] = vnt_targetNode.toVT_PTR();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param targetNode an input-parameter of type VT_PTR
	 */
	public void replaceNode(VT_PTR targetNode) {
		Dispatch.call(this, "ReplaceNode", targetNode);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param targetNode is an one-element array which sends the input-parameter
	 *                   to the ActiveX-Component and receives the output-parameter
	 */
	public void replaceNode(VT_PTR[] targetNode) {
		Variant vnt_targetNode = new Variant();
		if( targetNode == null || targetNode.length == 0 )
			vnt_targetNode.putNoParam();
		else
			vnt_targetNode.putVT_PTRRef(targetNode[0]);

		Dispatch.call(this, "ReplaceNode", vnt_targetNode);

		if( targetNode != null && targetNode.length > 0 )
			targetNode[0] = vnt_targetNode.toVT_PTR();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param targetNode an input-parameter of type VT_PTR
	 * @param pos an input-parameter of type MsoRelativeNodePosition
	 */
	public void swapNode(VT_PTR targetNode, MsoRelativeNodePosition pos) {
		Dispatch.call(this, "SwapNode", targetNode, pos);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param targetNode an input-parameter of type VT_PTR
	 */
	public void swapNode(VT_PTR targetNode) {
		Dispatch.call(this, "SwapNode", targetNode);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param targetNode is an one-element array which sends the input-parameter
	 *                   to the ActiveX-Component and receives the output-parameter
	 * @param pos an input-parameter of type MsoRelativeNodePosition
	 */
	public void swapNode(VT_PTR[] targetNode, MsoRelativeNodePosition pos) {
		Variant vnt_targetNode = new Variant();
		if( targetNode == null || targetNode.length == 0 )
			vnt_targetNode.putNoParam();
		else
			vnt_targetNode.putVT_PTRRef(targetNode[0]);

		Dispatch.call(this, "SwapNode", vnt_targetNode, pos);

		if( targetNode != null && targetNode.length > 0 )
			targetNode[0] = vnt_targetNode.toVT_PTR();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param copyChildren an input-parameter of type boolean
	 * @param targetNode an input-parameter of type VT_PTR
	 * @param pos an input-parameter of type MsoRelativeNodePosition
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode cloneNode(boolean copyChildren, VT_PTR targetNode, MsoRelativeNodePosition pos) {
		return new DiagramNode(Dispatch.call(this, "CloneNode", new Variant(copyChildren), targetNode, pos).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param copyChildren an input-parameter of type boolean
	 * @param targetNode an input-parameter of type VT_PTR
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode cloneNode(boolean copyChildren, VT_PTR targetNode) {
		return new DiagramNode(Dispatch.call(this, "CloneNode", new Variant(copyChildren), targetNode).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param copyChildren an input-parameter of type boolean
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode cloneNode(boolean copyChildren) {
		return new DiagramNode(Dispatch.call(this, "CloneNode", new Variant(copyChildren)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param copyChildren an input-parameter of type boolean
	 * @param targetNode is an one-element array which sends the input-parameter
	 *                   to the ActiveX-Component and receives the output-parameter
	 * @param pos an input-parameter of type MsoRelativeNodePosition
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode cloneNode(boolean copyChildren, VT_PTR[] targetNode, MsoRelativeNodePosition pos) {
		Variant vnt_targetNode = new Variant();
		if( targetNode == null || targetNode.length == 0 )
			vnt_targetNode.putNoParam();
		else
			vnt_targetNode.putVT_PTRRef(targetNode[0]);

		DiagramNode result_of_CloneNode = new DiagramNode(Dispatch.call(this, "CloneNode", new Variant(copyChildren), vnt_targetNode, pos).toDispatch());

		if( targetNode != null && targetNode.length > 0 )
			targetNode[0] = vnt_targetNode.toVT_PTR();

		return result_of_CloneNode;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param receivingNode an input-parameter of type VT_PTR
	 */
	public void transferChildren(VT_PTR receivingNode) {
		Dispatch.call(this, "TransferChildren", receivingNode);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param receivingNode is an one-element array which sends the input-parameter
	 *                      to the ActiveX-Component and receives the output-parameter
	 */
	public void transferChildren(VT_PTR[] receivingNode) {
		Variant vnt_receivingNode = new Variant();
		if( receivingNode == null || receivingNode.length == 0 )
			vnt_receivingNode.putNoParam();
		else
			vnt_receivingNode.putVT_PTRRef(receivingNode[0]);

		Dispatch.call(this, "TransferChildren", vnt_receivingNode);

		if( receivingNode != null && receivingNode.length > 0 )
			receivingNode[0] = vnt_receivingNode.toVT_PTR();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode nextNode() {
		return new DiagramNode(Dispatch.call(this, "NextNode").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode prevNode() {
		return new DiagramNode(Dispatch.call(this, "PrevNode").toDispatch());
	}

}
