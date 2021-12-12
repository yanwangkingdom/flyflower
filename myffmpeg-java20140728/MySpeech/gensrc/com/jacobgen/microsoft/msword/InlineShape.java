/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class InlineShape extends Dispatch {

	public static final String componentName = "Word.InlineShape";

	public InlineShape() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public InlineShape(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public InlineShape(String compName) {
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
	 * @return the result is of type Borders
	 */
	public Borders getBorders() {
		return new Borders(Dispatch.get(this, "Borders").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param borders an input-parameter of type Borders
	 */
	public void setBorders(Borders borders) {
		Dispatch.put(this, "Borders", borders);
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
	 * @return the result is of type LinkFormat
	 */
	public LinkFormat getLinkFormat() {
		return new LinkFormat(Dispatch.get(this, "LinkFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Field
	 */
	public Field getField() {
		return new Field(Dispatch.get(this, "Field").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OLEFormat
	 */
	public OLEFormat getOLEFormat() {
		return new OLEFormat(Dispatch.get(this, "OLEFormat").toDispatch());
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
	 * @return the result is of type Hyperlink
	 */
	public Hyperlink getHyperlink() {
		return new Hyperlink(Dispatch.get(this, "Hyperlink").toDispatch());
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
	 * @return the result is of type float
	 */
	public float getScaleHeight() {
		return Dispatch.get(this, "ScaleHeight").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param scaleHeight an input-parameter of type float
	 */
	public void setScaleHeight(float scaleHeight) {
		Dispatch.put(this, "ScaleHeight", new Variant(scaleHeight));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getScaleWidth() {
		return Dispatch.get(this, "ScaleWidth").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param scaleWidth an input-parameter of type float
	 */
	public void setScaleWidth(float scaleWidth) {
		Dispatch.put(this, "ScaleWidth", new Variant(scaleWidth));
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
	 * @return the result is of type LineFormat
	 */
	public LineFormat getLine() {
		return new LineFormat(Dispatch.get(this, "Line").toDispatch());
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
	 * @return the result is of type PictureFormat
	 */
	public PictureFormat getPictureFormat() {
		return new PictureFormat(Dispatch.get(this, "PictureFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pictureFormat an input-parameter of type PictureFormat
	 */
	public void setPictureFormat(PictureFormat pictureFormat) {
		Dispatch.put(this, "PictureFormat", pictureFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void activate() {
		Dispatch.call(this, "Activate");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void reset() {
		Dispatch.call(this, "Reset");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void select() {
		Dispatch.call(this, "Select");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Shape
	 */
	public Shape convertToShape() {
		return new Shape(Dispatch.call(this, "ConvertToShape").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type HorizontalLineFormat
	 */
	public HorizontalLineFormat getHorizontalLineFormat() {
		return new HorizontalLineFormat(Dispatch.get(this, "HorizontalLineFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Script
	 */
	public Script getScript() {
		return new Script(Dispatch.get(this, "Script").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOWSAnchor() {
		return Dispatch.get(this, "OWSAnchor").changeType(Variant.VariantInt).getInt();
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
	 * @param textEffect an input-parameter of type TextEffectFormat
	 */
	public void setTextEffect(TextEffectFormat textEffect) {
		Dispatch.put(this, "TextEffect", textEffect);
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
	 * @return the result is of type boolean
	 */
	public boolean getIsPictureBullet() {
		return Dispatch.get(this, "IsPictureBullet").changeType(Variant.VariantBoolean).getBoolean();
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
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getHasChart() {
		return new MsoTriState(Dispatch.get(this, "HasChart").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Chart
	 */
	public Chart getChart() {
		return new Chart(Dispatch.get(this, "Chart").toDispatch());
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
	 * @return the result is of type ShadowFormat
	 */
	public ShadowFormat getShadow() {
		return new ShadowFormat(Dispatch.get(this, "Shadow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getHasSmartArt() {
		return new MsoTriState(Dispatch.get(this, "HasSmartArt").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SmartArt
	 */
	public SmartArt getSmartArt() {
		return new SmartArt(Dispatch.get(this, "SmartArt").toDispatch());
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

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAnchorID() {
		return Dispatch.get(this, "AnchorID").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getEditID() {
		return Dispatch.get(this, "EditID").changeType(Variant.VariantInt).getInt();
	}

}
