/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ProtectedViewWindow extends Dispatch {

	public static final String componentName = "Word.ProtectedViewWindow";

	public ProtectedViewWindow() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ProtectedViewWindow(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ProtectedViewWindow(String compName) {
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
	 * @return the result is of type String
	 */
	public String getCaption() {
		return Dispatch.get(this, "Caption").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param caption an input-parameter of type String
	 */
	public void setCaption(String caption) {
		Dispatch.put(this, "Caption", caption);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Document
	 */
	public Document getDocument() {
		return new Document(Dispatch.get(this, "Document").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLeft() {
		return Dispatch.get(this, "Left").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param left an input-parameter of type int
	 */
	public void setLeft(int left) {
		Dispatch.put(this, "Left", new Variant(left));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getTop() {
		return Dispatch.get(this, "Top").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param top an input-parameter of type int
	 */
	public void setTop(int top) {
		Dispatch.put(this, "Top", new Variant(top));
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
	public int getWindowState() {
		return Dispatch.get(this, "WindowState").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param windowState an input-parameter of type int
	 */
	public void setWindowState(int windowState) {
		Dispatch.put(this, "WindowState", new Variant(windowState));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getActive() {
		return Dispatch.get(this, "Active").changeType(Variant.VariantBoolean).getBoolean();
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
	 * @return the result is of type boolean
	 */
	public boolean getVisible() {
		return Dispatch.get(this, "Visible").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param visible an input-parameter of type boolean
	 */
	public void setVisible(boolean visible) {
		Dispatch.put(this, "Visible", new Variant(visible));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSourceName() {
		return Dispatch.get(this, "SourceName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSourcePath() {
		return Dispatch.get(this, "SourcePath").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void activate() {
		Dispatch.call(this, "Activate");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document edit(Variant passwordTemplate, Variant writePasswordDocument, Variant writePasswordTemplate) {
		return new Document(Dispatch.call(this, "Edit", passwordTemplate, writePasswordDocument, writePasswordTemplate).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document edit(Variant passwordTemplate, Variant writePasswordDocument) {
		return new Document(Dispatch.call(this, "Edit", passwordTemplate, writePasswordDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param passwordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document edit(Variant passwordTemplate) {
		return new Document(Dispatch.call(this, "Edit", passwordTemplate).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Document
	 */
	public Document edit() {
		return new Document(Dispatch.call(this, "Edit").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @return the result is of type Document
	 */
	public Document edit(Variant passwordTemplate, Variant writePasswordDocument, Variant writePasswordTemplate) {
		Document result_of_Edit = new Document(Dispatch.call(this, "Edit", passwordTemplate, writePasswordDocument, writePasswordTemplate).toDispatch());


		return result_of_Edit;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void close() {
		Dispatch.call(this, "Close");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void toggleRibbon() {
		Dispatch.call(this, "ToggleRibbon");
	}

}
