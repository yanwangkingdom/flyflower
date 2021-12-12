/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ThreeDFormat extends Dispatch {

	public static final String componentName = "Word.ThreeDFormat";

	public ThreeDFormat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ThreeDFormat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ThreeDFormat(String compName) {
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
	 * @return the result is of type float
	 */
	public float getDepth() {
		return Dispatch.get(this, "Depth").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param depth an input-parameter of type float
	 */
	public void setDepth(float depth) {
		Dispatch.put(this, "Depth", new Variant(depth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ColorFormat
	 */
	public ColorFormat getExtrusionColor() {
		return new ColorFormat(Dispatch.get(this, "ExtrusionColor").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoExtrusionColorType
	 */
	public MsoExtrusionColorType getExtrusionColorType() {
		return new MsoExtrusionColorType(Dispatch.get(this, "ExtrusionColorType").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param extrusionColorType an input-parameter of type MsoExtrusionColorType
	 */
	public void setExtrusionColorType(MsoExtrusionColorType extrusionColorType) {
		Dispatch.put(this, "ExtrusionColorType", extrusionColorType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getPerspective() {
		return new MsoTriState(Dispatch.get(this, "Perspective").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param perspective an input-parameter of type MsoTriState
	 */
	public void setPerspective(MsoTriState perspective) {
		Dispatch.put(this, "Perspective", perspective);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoPresetExtrusionDirection
	 */
	public MsoPresetExtrusionDirection getPresetExtrusionDirection() {
		return new MsoPresetExtrusionDirection(Dispatch.get(this, "PresetExtrusionDirection").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoPresetLightingDirection
	 */
	public MsoPresetLightingDirection getPresetLightingDirection() {
		return new MsoPresetLightingDirection(Dispatch.get(this, "PresetLightingDirection").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param presetLightingDirection an input-parameter of type MsoPresetLightingDirection
	 */
	public void setPresetLightingDirection(MsoPresetLightingDirection presetLightingDirection) {
		Dispatch.put(this, "PresetLightingDirection", presetLightingDirection);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoPresetLightingSoftness
	 */
	public MsoPresetLightingSoftness getPresetLightingSoftness() {
		return new MsoPresetLightingSoftness(Dispatch.get(this, "PresetLightingSoftness").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param presetLightingSoftness an input-parameter of type MsoPresetLightingSoftness
	 */
	public void setPresetLightingSoftness(MsoPresetLightingSoftness presetLightingSoftness) {
		Dispatch.put(this, "PresetLightingSoftness", presetLightingSoftness);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoPresetMaterial
	 */
	public MsoPresetMaterial getPresetMaterial() {
		return new MsoPresetMaterial(Dispatch.get(this, "PresetMaterial").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param presetMaterial an input-parameter of type MsoPresetMaterial
	 */
	public void setPresetMaterial(MsoPresetMaterial presetMaterial) {
		Dispatch.put(this, "PresetMaterial", presetMaterial);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoPresetThreeDFormat
	 */
	public MsoPresetThreeDFormat getPresetThreeDFormat() {
		return new MsoPresetThreeDFormat(Dispatch.get(this, "PresetThreeDFormat").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getRotationX() {
		return Dispatch.get(this, "RotationX").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rotationX an input-parameter of type float
	 */
	public void setRotationX(float rotationX) {
		Dispatch.put(this, "RotationX", new Variant(rotationX));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getRotationY() {
		return Dispatch.get(this, "RotationY").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rotationY an input-parameter of type float
	 */
	public void setRotationY(float rotationY) {
		Dispatch.put(this, "RotationY", new Variant(rotationY));
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
	 * @param increment an input-parameter of type float
	 */
	public void incrementRotationX(float increment) {
		Dispatch.call(this, "IncrementRotationX", new Variant(increment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param increment an input-parameter of type float
	 */
	public void incrementRotationY(float increment) {
		Dispatch.call(this, "IncrementRotationY", new Variant(increment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void resetRotation() {
		Dispatch.call(this, "ResetRotation");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param presetExtrusionDirection an input-parameter of type MsoPresetExtrusionDirection
	 */
	public void setExtrusionDirection(MsoPresetExtrusionDirection presetExtrusionDirection) {
		Dispatch.call(this, "SetExtrusionDirection", presetExtrusionDirection);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param presetThreeDFormat an input-parameter of type MsoPresetThreeDFormat
	 */
	public void setThreeDFormat(MsoPresetThreeDFormat presetThreeDFormat) {
		Dispatch.call(this, "SetThreeDFormat", presetThreeDFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param presetCamera an input-parameter of type MsoPresetCamera
	 */
	public void setPresetCamera(MsoPresetCamera presetCamera) {
		Dispatch.call(this, "SetPresetCamera", presetCamera);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param increment an input-parameter of type float
	 */
	public void incrementRotationZ(float increment) {
		Dispatch.call(this, "IncrementRotationZ", new Variant(increment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param increment an input-parameter of type float
	 */
	public void incrementRotationHorizontal(float increment) {
		Dispatch.call(this, "IncrementRotationHorizontal", new Variant(increment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param increment an input-parameter of type float
	 */
	public void incrementRotationVertical(float increment) {
		Dispatch.call(this, "IncrementRotationVertical", new Variant(increment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoLightRigType
	 */
	public MsoLightRigType getPresetLighting() {
		return new MsoLightRigType(Dispatch.get(this, "PresetLighting").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param presetLighting an input-parameter of type MsoLightRigType
	 */
	public void setPresetLighting(MsoLightRigType presetLighting) {
		Dispatch.put(this, "PresetLighting", presetLighting);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getZ() {
		return Dispatch.get(this, "Z").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param z an input-parameter of type float
	 */
	public void setZ(float z) {
		Dispatch.put(this, "Z", new Variant(z));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoBevelType
	 */
	public MsoBevelType getBevelTopType() {
		return new MsoBevelType(Dispatch.get(this, "BevelTopType").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bevelTopType an input-parameter of type MsoBevelType
	 */
	public void setBevelTopType(MsoBevelType bevelTopType) {
		Dispatch.put(this, "BevelTopType", bevelTopType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getBevelTopInset() {
		return Dispatch.get(this, "BevelTopInset").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bevelTopInset an input-parameter of type float
	 */
	public void setBevelTopInset(float bevelTopInset) {
		Dispatch.put(this, "BevelTopInset", new Variant(bevelTopInset));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getBevelTopDepth() {
		return Dispatch.get(this, "BevelTopDepth").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bevelTopDepth an input-parameter of type float
	 */
	public void setBevelTopDepth(float bevelTopDepth) {
		Dispatch.put(this, "BevelTopDepth", new Variant(bevelTopDepth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoBevelType
	 */
	public MsoBevelType getBevelBottomType() {
		return new MsoBevelType(Dispatch.get(this, "BevelBottomType").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bevelBottomType an input-parameter of type MsoBevelType
	 */
	public void setBevelBottomType(MsoBevelType bevelBottomType) {
		Dispatch.put(this, "BevelBottomType", bevelBottomType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getBevelBottomInset() {
		return Dispatch.get(this, "BevelBottomInset").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bevelBottomInset an input-parameter of type float
	 */
	public void setBevelBottomInset(float bevelBottomInset) {
		Dispatch.put(this, "BevelBottomInset", new Variant(bevelBottomInset));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getBevelBottomDepth() {
		return Dispatch.get(this, "BevelBottomDepth").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bevelBottomDepth an input-parameter of type float
	 */
	public void setBevelBottomDepth(float bevelBottomDepth) {
		Dispatch.put(this, "BevelBottomDepth", new Variant(bevelBottomDepth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoPresetCamera
	 */
	public MsoPresetCamera getPresetCamera() {
		return new MsoPresetCamera(Dispatch.get(this, "PresetCamera").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getRotationZ() {
		return Dispatch.get(this, "RotationZ").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param rotationZ an input-parameter of type float
	 */
	public void setRotationZ(float rotationZ) {
		Dispatch.put(this, "RotationZ", new Variant(rotationZ));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getContourWidth() {
		return Dispatch.get(this, "ContourWidth").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param contourWidth an input-parameter of type float
	 */
	public void setContourWidth(float contourWidth) {
		Dispatch.put(this, "ContourWidth", new Variant(contourWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ColorFormat
	 */
	public ColorFormat getContourColor() {
		return new ColorFormat(Dispatch.get(this, "ContourColor").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getFieldOfView() {
		return Dispatch.get(this, "FieldOfView").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fieldOfView an input-parameter of type float
	 */
	public void setFieldOfView(float fieldOfView) {
		Dispatch.put(this, "FieldOfView", new Variant(fieldOfView));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getProjectText() {
		return new MsoTriState(Dispatch.get(this, "ProjectText").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param projectText an input-parameter of type MsoTriState
	 */
	public void setProjectText(MsoTriState projectText) {
		Dispatch.put(this, "ProjectText", projectText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLightAngle() {
		return Dispatch.get(this, "LightAngle").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lightAngle an input-parameter of type float
	 */
	public void setLightAngle(float lightAngle) {
		Dispatch.put(this, "LightAngle", new Variant(lightAngle));
	}

}
