/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Pane extends Dispatch {

	public static final String componentName = "Word.Pane";

	public Pane() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Pane(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Pane(String compName) {
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
	 * @return the result is of type Document
	 */
	public Document getDocument() {
		return new Document(Dispatch.get(this, "Document").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Selection
	 */
	public Selection getSelection() {
		return new Selection(Dispatch.get(this, "Selection").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayRulers() {
		return Dispatch.get(this, "DisplayRulers").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayRulers an input-parameter of type boolean
	 */
	public void setDisplayRulers(boolean displayRulers) {
		Dispatch.put(this, "DisplayRulers", new Variant(displayRulers));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayVerticalRuler() {
		return Dispatch.get(this, "DisplayVerticalRuler").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayVerticalRuler an input-parameter of type boolean
	 */
	public void setDisplayVerticalRuler(boolean displayVerticalRuler) {
		Dispatch.put(this, "DisplayVerticalRuler", new Variant(displayVerticalRuler));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Zooms
	 */
	public Zooms getZooms() {
		return new Zooms(Dispatch.get(this, "Zooms").toDispatch());
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
	 * @return the result is of type View
	 */
	public View getView() {
		return new View(Dispatch.get(this, "View").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Pane
	 */
	public Pane getNext() {
		return new Pane(Dispatch.get(this, "Next").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Pane
	 */
	public Pane getPrevious() {
		return new Pane(Dispatch.get(this, "Previous").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHorizontalPercentScrolled() {
		return Dispatch.get(this, "HorizontalPercentScrolled").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param horizontalPercentScrolled an input-parameter of type int
	 */
	public void setHorizontalPercentScrolled(int horizontalPercentScrolled) {
		Dispatch.put(this, "HorizontalPercentScrolled", new Variant(horizontalPercentScrolled));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getVerticalPercentScrolled() {
		return Dispatch.get(this, "VerticalPercentScrolled").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param verticalPercentScrolled an input-parameter of type int
	 */
	public void setVerticalPercentScrolled(int verticalPercentScrolled) {
		Dispatch.put(this, "VerticalPercentScrolled", new Variant(verticalPercentScrolled));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMinimumFontSize() {
		return Dispatch.get(this, "MinimumFontSize").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param minimumFontSize an input-parameter of type int
	 */
	public void setMinimumFontSize(int minimumFontSize) {
		Dispatch.put(this, "MinimumFontSize", new Variant(minimumFontSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getBrowseToWindow() {
		return Dispatch.get(this, "BrowseToWindow").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param browseToWindow an input-parameter of type boolean
	 */
	public void setBrowseToWindow(boolean browseToWindow) {
		Dispatch.put(this, "BrowseToWindow", new Variant(browseToWindow));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBrowseWidth() {
		return Dispatch.get(this, "BrowseWidth").changeType(Variant.VariantInt).getInt();
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
	public void close() {
		Dispatch.call(this, "Close");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param down an input-parameter of type Variant
	 * @param up an input-parameter of type Variant
	 * @param toRight an input-parameter of type Variant
	 * @param toLeft an input-parameter of type Variant
	 */
	public void largeScroll(Variant down, Variant up, Variant toRight, Variant toLeft) {
		Dispatch.call(this, "LargeScroll", down, up, toRight, toLeft);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param down an input-parameter of type Variant
	 * @param up an input-parameter of type Variant
	 * @param toRight an input-parameter of type Variant
	 */
	public void largeScroll(Variant down, Variant up, Variant toRight) {
		Dispatch.call(this, "LargeScroll", down, up, toRight);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param down an input-parameter of type Variant
	 * @param up an input-parameter of type Variant
	 */
	public void largeScroll(Variant down, Variant up) {
		Dispatch.call(this, "LargeScroll", down, up);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param down an input-parameter of type Variant
	 */
	public void largeScroll(Variant down) {
		Dispatch.call(this, "LargeScroll", down);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void largeScroll() {
		Dispatch.call(this, "LargeScroll");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param down an input-parameter of type Variant
	 * @param up an input-parameter of type Variant
	 * @param toRight an input-parameter of type Variant
	 * @param toLeft an input-parameter of type Variant
	 */
	public void largeScroll(Variant down, Variant up, Variant toRight, Variant toLeft) {
		Dispatch.call(this, "LargeScroll", down, up, toRight, toLeft);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param down an input-parameter of type Variant
	 * @param up an input-parameter of type Variant
	 * @param toRight an input-parameter of type Variant
	 * @param toLeft an input-parameter of type Variant
	 */
	public void smallScroll(Variant down, Variant up, Variant toRight, Variant toLeft) {
		Dispatch.call(this, "SmallScroll", down, up, toRight, toLeft);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param down an input-parameter of type Variant
	 * @param up an input-parameter of type Variant
	 * @param toRight an input-parameter of type Variant
	 */
	public void smallScroll(Variant down, Variant up, Variant toRight) {
		Dispatch.call(this, "SmallScroll", down, up, toRight);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param down an input-parameter of type Variant
	 * @param up an input-parameter of type Variant
	 */
	public void smallScroll(Variant down, Variant up) {
		Dispatch.call(this, "SmallScroll", down, up);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param down an input-parameter of type Variant
	 */
	public void smallScroll(Variant down) {
		Dispatch.call(this, "SmallScroll", down);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void smallScroll() {
		Dispatch.call(this, "SmallScroll");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param down an input-parameter of type Variant
	 * @param up an input-parameter of type Variant
	 * @param toRight an input-parameter of type Variant
	 * @param toLeft an input-parameter of type Variant
	 */
	public void smallScroll(Variant down, Variant up, Variant toRight, Variant toLeft) {
		Dispatch.call(this, "SmallScroll", down, up, toRight, toLeft);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param velocity an input-parameter of type int
	 */
	public void autoScroll(int velocity) {
		Dispatch.call(this, "AutoScroll", new Variant(velocity));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param down an input-parameter of type Variant
	 * @param up an input-parameter of type Variant
	 */
	public void pageScroll(Variant down, Variant up) {
		Dispatch.call(this, "PageScroll", down, up);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param down an input-parameter of type Variant
	 */
	public void pageScroll(Variant down) {
		Dispatch.call(this, "PageScroll", down);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void pageScroll() {
		Dispatch.call(this, "PageScroll");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param down an input-parameter of type Variant
	 * @param up an input-parameter of type Variant
	 */
	public void pageScroll(Variant down, Variant up) {
		Dispatch.call(this, "PageScroll", down, up);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void newFrameset() {
		Dispatch.call(this, "NewFrameset");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void tOCInFrameset() {
		Dispatch.call(this, "TOCInFrameset");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Frameset
	 */
	public Frameset getFrameset() {
		return new Frameset(Dispatch.get(this, "Frameset").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Pages
	 */
	public Pages getPages() {
		return new Pages(Dispatch.get(this, "Pages").toDispatch());
	}

}
