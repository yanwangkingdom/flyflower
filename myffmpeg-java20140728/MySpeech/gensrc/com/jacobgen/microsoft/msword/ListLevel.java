/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ListLevel extends Dispatch {

	public static final String componentName = "Word.ListLevel";

	public ListLevel() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ListLevel(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ListLevel(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getIndex() {
		return Dispatch.get(this, "Index").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getNumberFormat() {
		return Dispatch.get(this, "NumberFormat").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberFormat an input-parameter of type String
	 */
	public void setNumberFormat(String numberFormat) {
		Dispatch.put(this, "NumberFormat", numberFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getTrailingCharacter() {
		return Dispatch.get(this, "TrailingCharacter").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param trailingCharacter an input-parameter of type int
	 */
	public void setTrailingCharacter(int trailingCharacter) {
		Dispatch.put(this, "TrailingCharacter", new Variant(trailingCharacter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNumberStyle() {
		return Dispatch.get(this, "NumberStyle").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberStyle an input-parameter of type int
	 */
	public void setNumberStyle(int numberStyle) {
		Dispatch.put(this, "NumberStyle", new Variant(numberStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getNumberPosition() {
		return Dispatch.get(this, "NumberPosition").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberPosition an input-parameter of type float
	 */
	public void setNumberPosition(float numberPosition) {
		Dispatch.put(this, "NumberPosition", new Variant(numberPosition));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getAlignment() {
		return Dispatch.get(this, "Alignment").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param alignment an input-parameter of type int
	 */
	public void setAlignment(int alignment) {
		Dispatch.put(this, "Alignment", new Variant(alignment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getTextPosition() {
		return Dispatch.get(this, "TextPosition").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textPosition an input-parameter of type float
	 */
	public void setTextPosition(float textPosition) {
		Dispatch.put(this, "TextPosition", new Variant(textPosition));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getTabPosition() {
		return Dispatch.get(this, "TabPosition").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tabPosition an input-parameter of type float
	 */
	public void setTabPosition(float tabPosition) {
		Dispatch.put(this, "TabPosition", new Variant(tabPosition));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getResetOnHigherOld() {
		return Dispatch.get(this, "ResetOnHigherOld").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param resetOnHigherOld an input-parameter of type boolean
	 */
	public void setResetOnHigherOld(boolean resetOnHigherOld) {
		Dispatch.put(this, "ResetOnHigherOld", new Variant(resetOnHigherOld));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getStartAt() {
		return Dispatch.get(this, "StartAt").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startAt an input-parameter of type int
	 */
	public void setStartAt(int startAt) {
		Dispatch.put(this, "StartAt", new Variant(startAt));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getLinkedStyle() {
		return Dispatch.get(this, "LinkedStyle").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param linkedStyle an input-parameter of type String
	 */
	public void setLinkedStyle(String linkedStyle) {
		Dispatch.put(this, "LinkedStyle", linkedStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Font
	 */
	public Font getFont() {
		return new Font(Dispatch.get(this, "Font").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param font an input-parameter of type Font
	 */
	public void setFont(Font font) {
		Dispatch.put(this, "Font", font);
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
	public int getResetOnHigher() {
		return Dispatch.get(this, "ResetOnHigher").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param resetOnHigher an input-parameter of type int
	 */
	public void setResetOnHigher(int resetOnHigher) {
		Dispatch.put(this, "ResetOnHigher", new Variant(resetOnHigher));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type InlineShape
	 */
	public InlineShape getPictureBullet() {
		return new InlineShape(Dispatch.get(this, "PictureBullet").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @return the result is of type InlineShape
	 */
	public InlineShape applyPictureBullet(String fileName) {
		return new InlineShape(Dispatch.call(this, "ApplyPictureBullet", fileName).toDispatch());
	}

}
