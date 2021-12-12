/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ShapeRange extends Dispatch {

	public static final String componentName = "Word.ShapeRange";

	public ShapeRange() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ShapeRange(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ShapeRange(String compName) {
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
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type Adjustments
	 */
	public Adjustments getAdjustments() {
		return new Adjustments(Dispatch.get(this, "Adjustments").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoAutoShapeType
	 */
	public MsoAutoShapeType getAutoShapeType() {
		return new MsoAutoShapeType(Dispatch.get(this, "AutoShapeType").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoShapeType an input-parameter of type MsoAutoShapeType
	 */
	public void setAutoShapeType(MsoAutoShapeType autoShapeType) {
		Dispatch.put(this, "AutoShapeType", autoShapeType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type CalloutFormat
	 */
	public CalloutFormat getCallout() {
		return new CalloutFormat(Dispatch.get(this, "Callout").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getConnectionSiteCount() {
		return Dispatch.get(this, "ConnectionSiteCount").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getConnector() {
		return new MsoTriState(Dispatch.get(this, "Connector").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ConnectorFormat
	 */
	public ConnectorFormat getConnectorFormat() {
		return new ConnectorFormat(Dispatch.get(this, "ConnectorFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FillFormat
	 */
	public FillFormat getFill() {
		return new FillFormat(Dispatch.get(this, "Fill").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type GroupShapes
	 */
	public GroupShapes getGroupItems() {
		return new GroupShapes(Dispatch.get(this, "GroupItems").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getHeight() {
		return Dispatch.get(this, "Height").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param height an input-parameter of type float
	 */
	public void setHeight(float height) {
		Dispatch.put(this, "Height", new Variant(height));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getHorizontalFlip() {
		return new MsoTriState(Dispatch.get(this, "HorizontalFlip").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLeft() {
		return Dispatch.get(this, "Left").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param left an input-parameter of type float
	 */
	public void setLeft(float left) {
		Dispatch.put(this, "Left", new Variant(left));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type LineFormat
	 */
	public LineFormat getLine() {
		return new LineFormat(Dispatch.get(this, "Line").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getLockAspectRatio() {
		return new MsoTriState(Dispatch.get(this, "LockAspectRatio").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lockAspectRatio an input-parameter of type MsoTriState
	 */
	public void setLockAspectRatio(MsoTriState lockAspectRatio) {
		Dispatch.put(this, "LockAspectRatio", lockAspectRatio);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getName() {
		return Dispatch.get(this, "Name").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void setName(String name) {
		Dispatch.put(this, "Name", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ShapeNodes
	 */
	public ShapeNodes getNodes() {
		return new ShapeNodes(Dispatch.get(this, "Nodes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getRotation() {
		return Dispatch.get(this, "Rotation").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rotation an input-parameter of type float
	 */
	public void setRotation(float rotation) {
		Dispatch.put(this, "Rotation", new Variant(rotation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type PictureFormat
	 */
	public PictureFormat getPictureFormat() {
		return new PictureFormat(Dispatch.get(this, "PictureFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ShadowFormat
	 */
	public ShadowFormat getShadow() {
		return new ShadowFormat(Dispatch.get(this, "Shadow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TextEffectFormat
	 */
	public TextEffectFormat getTextEffect() {
		return new TextEffectFormat(Dispatch.get(this, "TextEffect").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TextFrame
	 */
	public TextFrame getTextFrame() {
		return new TextFrame(Dispatch.get(this, "TextFrame").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ThreeDFormat
	 */
	public ThreeDFormat getThreeD() {
		return new ThreeDFormat(Dispatch.get(this, "ThreeD").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getTop() {
		return Dispatch.get(this, "Top").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param top an input-parameter of type float
	 */
	public void setTop(float top) {
		Dispatch.put(this, "Top", new Variant(top));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoShapeType
	 */
	public MsoShapeType getType() {
		return new MsoShapeType(Dispatch.get(this, "Type").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getVerticalFlip() {
		return new MsoTriState(Dispatch.get(this, "VerticalFlip").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getVertices() {
		return Dispatch.get(this, "Vertices");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getVisible() {
		return new MsoTriState(Dispatch.get(this, "Visible").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param visible an input-parameter of type MsoTriState
	 */
	public void setVisible(MsoTriState visible) {
		Dispatch.put(this, "Visible", visible);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getWidth() {
		return Dispatch.get(this, "Width").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param width an input-parameter of type float
	 */
	public void setWidth(float width) {
		Dispatch.put(this, "Width", new Variant(width));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getZOrderPosition() {
		return Dispatch.get(this, "ZOrderPosition").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink getHyperlink() {
		return new Hyperlink(Dispatch.get(this, "Hyperlink").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRelativeHorizontalPosition() {
		return Dispatch.get(this, "RelativeHorizontalPosition").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param relativeHorizontalPosition an input-parameter of type int
	 */
	public void setRelativeHorizontalPosition(int relativeHorizontalPosition) {
		Dispatch.put(this, "RelativeHorizontalPosition", new Variant(relativeHorizontalPosition));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRelativeVerticalPosition() {
		return Dispatch.get(this, "RelativeVerticalPosition").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param relativeVerticalPosition an input-parameter of type int
	 */
	public void setRelativeVerticalPosition(int relativeVerticalPosition) {
		Dispatch.put(this, "RelativeVerticalPosition", new Variant(relativeVerticalPosition));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLockAnchor() {
		return Dispatch.get(this, "LockAnchor").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lockAnchor an input-parameter of type int
	 */
	public void setLockAnchor(int lockAnchor) {
		Dispatch.put(this, "LockAnchor", new Variant(lockAnchor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type WrapFormat
	 */
	public WrapFormat getWrapFormat() {
		return new WrapFormat(Dispatch.get(this, "WrapFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range getAnchor() {
		return new Range(Dispatch.get(this, "Anchor").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type Shape
	 */
	public Shape item(Variant index) {
		return new Shape(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param align an input-parameter of type MsoAlignCmd
	 * @param relativeTo an input-parameter of type int
	 */
	public void align(MsoAlignCmd align, int relativeTo) {
		Dispatch.call(this, "Align", align, new Variant(relativeTo));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void apply() {
		Dispatch.call(this, "Apply");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param distribute an input-parameter of type MsoDistributeCmd
	 * @param relativeTo an input-parameter of type int
	 */
	public void distribute(MsoDistributeCmd distribute, int relativeTo) {
		Dispatch.call(this, "Distribute", distribute, new Variant(relativeTo));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ShapeRange
	 */
	public ShapeRange duplicate() {
		return new ShapeRange(Dispatch.call(this, "Duplicate").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param flipCmd an input-parameter of type MsoFlipCmd
	 */
	public void flip(MsoFlipCmd flipCmd) {
		Dispatch.call(this, "Flip", flipCmd);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param increment an input-parameter of type float
	 */
	public void incrementLeft(float increment) {
		Dispatch.call(this, "IncrementLeft", new Variant(increment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param increment an input-parameter of type float
	 */
	public void incrementRotation(float increment) {
		Dispatch.call(this, "IncrementRotation", new Variant(increment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param increment an input-parameter of type float
	 */
	public void incrementTop(float increment) {
		Dispatch.call(this, "IncrementTop", new Variant(increment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Shape
	 */
	public Shape group() {
		return new Shape(Dispatch.call(this, "Group").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void pickUp() {
		Dispatch.call(this, "PickUp");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Shape
	 */
	public Shape regroup() {
		return new Shape(Dispatch.call(this, "Regroup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void rerouteConnections() {
		Dispatch.call(this, "RerouteConnections");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param factor an input-parameter of type float
	 * @param relativeToOriginalSize an input-parameter of type MsoTriState
	 * @param scale an input-parameter of type MsoScaleFrom
	 */
	public void scaleHeight(float factor, MsoTriState relativeToOriginalSize, MsoScaleFrom scale) {
		Dispatch.call(this, "ScaleHeight", new Variant(factor), relativeToOriginalSize, scale);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param factor an input-parameter of type float
	 * @param relativeToOriginalSize an input-parameter of type MsoTriState
	 */
	public void scaleHeight(float factor, MsoTriState relativeToOriginalSize) {
		Dispatch.call(this, "ScaleHeight", new Variant(factor), relativeToOriginalSize);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param factor an input-parameter of type float
	 * @param relativeToOriginalSize an input-parameter of type MsoTriState
	 * @param scale an input-parameter of type MsoScaleFrom
	 */
	public void scaleHeight(float factor, MsoTriState relativeToOriginalSize, MsoScaleFrom scale) {
		Dispatch.call(this, "ScaleHeight", new Variant(factor), relativeToOriginalSize, scale);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param factor an input-parameter of type float
	 * @param relativeToOriginalSize an input-parameter of type MsoTriState
	 * @param scale an input-parameter of type MsoScaleFrom
	 */
	public void scaleWidth(float factor, MsoTriState relativeToOriginalSize, MsoScaleFrom scale) {
		Dispatch.call(this, "ScaleWidth", new Variant(factor), relativeToOriginalSize, scale);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param factor an input-parameter of type float
	 * @param relativeToOriginalSize an input-parameter of type MsoTriState
	 */
	public void scaleWidth(float factor, MsoTriState relativeToOriginalSize) {
		Dispatch.call(this, "ScaleWidth", new Variant(factor), relativeToOriginalSize);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param factor an input-parameter of type float
	 * @param relativeToOriginalSize an input-parameter of type MsoTriState
	 * @param scale an input-parameter of type MsoScaleFrom
	 */
	public void scaleWidth(float factor, MsoTriState relativeToOriginalSize, MsoScaleFrom scale) {
		Dispatch.call(this, "ScaleWidth", new Variant(factor), relativeToOriginalSize, scale);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param replace an input-parameter of type Variant
	 */
	public void select(Variant replace) {
		Dispatch.call(this, "Select", replace);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void select() {
		Dispatch.call(this, "Select");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param replace an input-parameter of type Variant
	 */
	public void select(Variant replace) {
		Dispatch.call(this, "Select", replace);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void setShapesDefaultProperties() {
		Dispatch.call(this, "SetShapesDefaultProperties");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ShapeRange
	 */
	public ShapeRange ungroup() {
		return new ShapeRange(Dispatch.call(this, "Ungroup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param zOrderCmd an input-parameter of type MsoZOrderCmd
	 */
	public void zOrder(MsoZOrderCmd zOrderCmd) {
		Dispatch.call(this, "ZOrder", zOrderCmd);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Frame
	 */
	public Frame convertToFrame() {
		return new Frame(Dispatch.call(this, "ConvertToFrame").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type InlineShape
	 */
	public InlineShape convertToInlineShape() {
		return new InlineShape(Dispatch.call(this, "ConvertToInlineShape").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void activate() {
		Dispatch.call(this, "Activate");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getAlternativeText() {
		return Dispatch.get(this, "AlternativeText").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param alternativeText an input-parameter of type String
	 */
	public void setAlternativeText(String alternativeText) {
		Dispatch.put(this, "AlternativeText", alternativeText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getHasDiagram() {
		return new MsoTriState(Dispatch.get(this, "HasDiagram").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IMsoDiagram
	 */
	public IMsoDiagram getDiagram() {
		return new IMsoDiagram(Dispatch.get(this, "Diagram").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getHasDiagramNode() {
		return new MsoTriState(Dispatch.get(this, "HasDiagramNode").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DiagramNode
	 */
	public DiagramNode getDiagramNode() {
		return new DiagramNode(Dispatch.get(this, "DiagramNode").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getChild() {
		return new MsoTriState(Dispatch.get(this, "Child").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Shape
	 */
	public Shape getParentGroup() {
		return new Shape(Dispatch.get(this, "ParentGroup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type CanvasShapes
	 */
	public CanvasShapes getCanvasItems() {
		return new CanvasShapes(Dispatch.get(this, "CanvasItems").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getID() {
		return Dispatch.get(this, "ID").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param increment an input-parameter of type float
	 */
	public void canvasCropLeft(float increment) {
		Dispatch.call(this, "CanvasCropLeft", new Variant(increment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param increment an input-parameter of type float
	 */
	public void canvasCropTop(float increment) {
		Dispatch.call(this, "CanvasCropTop", new Variant(increment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param increment an input-parameter of type float
	 */
	public void canvasCropRight(float increment) {
		Dispatch.call(this, "CanvasCropRight", new Variant(increment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param increment an input-parameter of type float
	 */
	public void canvasCropBottom(float increment) {
		Dispatch.call(this, "CanvasCropBottom", new Variant(increment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rTF an input-parameter of type String
	 */
	public void setRTF(String rTF) {
		Dispatch.put(this, "RTF", rTF);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLayoutInCell() {
		return Dispatch.get(this, "LayoutInCell").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param layoutInCell an input-parameter of type int
	 */
	public void setLayoutInCell(int layoutInCell) {
		Dispatch.put(this, "LayoutInCell", new Variant(layoutInCell));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLeftRelative() {
		return Dispatch.get(this, "LeftRelative").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param leftRelative an input-parameter of type float
	 */
	public void setLeftRelative(float leftRelative) {
		Dispatch.put(this, "LeftRelative", new Variant(leftRelative));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getTopRelative() {
		return Dispatch.get(this, "TopRelative").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param topRelative an input-parameter of type float
	 */
	public void setTopRelative(float topRelative) {
		Dispatch.put(this, "TopRelative", new Variant(topRelative));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getWidthRelative() {
		return Dispatch.get(this, "WidthRelative").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param widthRelative an input-parameter of type float
	 */
	public void setWidthRelative(float widthRelative) {
		Dispatch.put(this, "WidthRelative", new Variant(widthRelative));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getHeightRelative() {
		return Dispatch.get(this, "HeightRelative").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param heightRelative an input-parameter of type float
	 */
	public void setHeightRelative(float heightRelative) {
		Dispatch.put(this, "HeightRelative", new Variant(heightRelative));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRelativeHorizontalSize() {
		return Dispatch.get(this, "RelativeHorizontalSize").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param relativeHorizontalSize an input-parameter of type int
	 */
	public void setRelativeHorizontalSize(int relativeHorizontalSize) {
		Dispatch.put(this, "RelativeHorizontalSize", new Variant(relativeHorizontalSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRelativeVerticalSize() {
		return Dispatch.get(this, "RelativeVerticalSize").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param relativeVerticalSize an input-parameter of type int
	 */
	public void setRelativeVerticalSize(int relativeVerticalSize) {
		Dispatch.put(this, "RelativeVerticalSize", new Variant(relativeVerticalSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SoftEdgeFormat
	 */
	public SoftEdgeFormat getSoftEdge() {
		return new SoftEdgeFormat(Dispatch.get(this, "SoftEdge").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type GlowFormat
	 */
	public GlowFormat getGlow() {
		return new GlowFormat(Dispatch.get(this, "Glow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ReflectionFormat
	 */
	public ReflectionFormat getReflection() {
		return new ReflectionFormat(Dispatch.get(this, "Reflection").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TextFrame2
	 */
	public TextFrame2 getTextFrame2() {
		return new TextFrame2(Dispatch.get(this, "TextFrame2").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoShapeStyleIndex
	 */
	public MsoShapeStyleIndex getShapeStyle() {
		return new MsoShapeStyleIndex(Dispatch.get(this, "ShapeStyle").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param shapeStyle an input-parameter of type MsoShapeStyleIndex
	 */
	public void setShapeStyle(MsoShapeStyleIndex shapeStyle) {
		Dispatch.put(this, "ShapeStyle", shapeStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoBackgroundStyleIndex
	 */
	public MsoBackgroundStyleIndex getBackgroundStyle() {
		return new MsoBackgroundStyleIndex(Dispatch.get(this, "BackgroundStyle").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param backgroundStyle an input-parameter of type MsoBackgroundStyleIndex
	 */
	public void setBackgroundStyle(MsoBackgroundStyleIndex backgroundStyle) {
		Dispatch.put(this, "BackgroundStyle", backgroundStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getTitle() {
		return Dispatch.get(this, "Title").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param title an input-parameter of type String
	 */
	public void setTitle(String title) {
		Dispatch.put(this, "Title", title);
	}

}
