/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Window extends Dispatch {

	public static final String componentName = "Word.Window";

	public Window() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Window(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Window(String compName) {
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
	 * @return the result is of type Pane
	 */
	public Pane getActivePane() {
		return new Pane(Dispatch.get(this, "ActivePane").toDispatch());
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
	 * @return the result is of type Panes
	 */
	public Panes getPanes() {
		return new Panes(Dispatch.get(this, "Panes").toDispatch());
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
	 * @return the result is of type boolean
	 */
	public boolean getSplit() {
		return Dispatch.get(this, "Split").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param split an input-parameter of type boolean
	 */
	public void setSplit(boolean split) {
		Dispatch.put(this, "Split", new Variant(split));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSplitVertical() {
		return Dispatch.get(this, "SplitVertical").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param splitVertical an input-parameter of type int
	 */
	public void setSplitVertical(int splitVertical) {
		Dispatch.put(this, "SplitVertical", new Variant(splitVertical));
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
	 * @return the result is of type View
	 */
	public View getView() {
		return new View(Dispatch.get(this, "View").toDispatch());
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
	 * @return the result is of type Window
	 */
	public Window getNext() {
		return new Window(Dispatch.get(this, "Next").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Window
	 */
	public Window getPrevious() {
		return new Window(Dispatch.get(this, "Previous").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getWindowNumber() {
		return Dispatch.get(this, "WindowNumber").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayVerticalScrollBar() {
		return Dispatch.get(this, "DisplayVerticalScrollBar").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayVerticalScrollBar an input-parameter of type boolean
	 */
	public void setDisplayVerticalScrollBar(boolean displayVerticalScrollBar) {
		Dispatch.put(this, "DisplayVerticalScrollBar", new Variant(displayVerticalScrollBar));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayHorizontalScrollBar() {
		return Dispatch.get(this, "DisplayHorizontalScrollBar").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayHorizontalScrollBar an input-parameter of type boolean
	 */
	public void setDisplayHorizontalScrollBar(boolean displayHorizontalScrollBar) {
		Dispatch.put(this, "DisplayHorizontalScrollBar", new Variant(displayHorizontalScrollBar));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getStyleAreaWidth() {
		return Dispatch.get(this, "StyleAreaWidth").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param styleAreaWidth an input-parameter of type float
	 */
	public void setStyleAreaWidth(float styleAreaWidth) {
		Dispatch.put(this, "StyleAreaWidth", new Variant(styleAreaWidth));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayScreenTips() {
		return Dispatch.get(this, "DisplayScreenTips").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayScreenTips an input-parameter of type boolean
	 */
	public void setDisplayScreenTips(boolean displayScreenTips) {
		Dispatch.put(this, "DisplayScreenTips", new Variant(displayScreenTips));
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
	 * @return the result is of type boolean
	 */
	public boolean getDocumentMap() {
		return Dispatch.get(this, "DocumentMap").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param documentMap an input-parameter of type boolean
	 */
	public void setDocumentMap(boolean documentMap) {
		Dispatch.put(this, "DocumentMap", new Variant(documentMap));
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
	public int getDocumentMapPercentWidth() {
		return Dispatch.get(this, "DocumentMapPercentWidth").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param documentMapPercentWidth an input-parameter of type int
	 */
	public void setDocumentMapPercentWidth(int documentMapPercentWidth) {
		Dispatch.put(this, "DocumentMapPercentWidth", new Variant(documentMapPercentWidth));
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
	 * @return the result is of type int
	 */
	public int getIMEMode() {
		return Dispatch.get(this, "IMEMode").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iMEMode an input-parameter of type int
	 */
	public void setIMEMode(int iMEMode) {
		Dispatch.put(this, "IMEMode", new Variant(iMEMode));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void activate() {
		Dispatch.call(this, "Activate");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type Variant
	 * @param routeDocument an input-parameter of type Variant
	 */
	public void close(Variant saveChanges, Variant routeDocument) {
		Dispatch.call(this, "Close", saveChanges, routeDocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type Variant
	 */
	public void close(Variant saveChanges) {
		Dispatch.call(this, "Close", saveChanges);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void close() {
		Dispatch.call(this, "Close");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param saveChanges an input-parameter of type Variant
	 * @param routeDocument an input-parameter of type Variant
	 */
	public void close(Variant saveChanges, Variant routeDocument) {
		Dispatch.call(this, "Close", saveChanges, routeDocument);

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
	 * @return the result is of type Window
	 */
	public Window newWindow() {
		return new Window(Dispatch.call(this, "NewWindow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint) {
		Dispatch.callN(this, "PrintOutOld", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX) {
		Dispatch.callN(this, "PrintOutOld", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate) {
		Dispatch.callN(this, "PrintOutOld", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile) {
		Dispatch.callN(this, "PrintOutOld", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType) {
		Dispatch.callN(this, "PrintOutOld", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages) {
		Dispatch.callN(this, "PrintOutOld", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies) {
		Dispatch.call(this, "PrintOutOld", background, append, range, outputFileName, from, to, item, copies);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item) {
		Dispatch.call(this, "PrintOutOld", background, append, range, outputFileName, from, to, item);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to) {
		Dispatch.call(this, "PrintOutOld", background, append, range, outputFileName, from, to);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from) {
		Dispatch.call(this, "PrintOutOld", background, append, range, outputFileName, from);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName) {
		Dispatch.call(this, "PrintOutOld", background, append, range, outputFileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range) {
		Dispatch.call(this, "PrintOutOld", background, append, range);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append) {
		Dispatch.call(this, "PrintOutOld", background, append);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 */
	public void printOutOld(Variant background) {
		Dispatch.call(this, "PrintOutOld", background);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void printOutOld() {
		Dispatch.call(this, "PrintOutOld");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint) {
		Dispatch.callN(this, "PrintOutOld", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint});

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
	public void setFocus() {
		Dispatch.call(this, "SetFocus");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param x an input-parameter of type int
	 * @param y an input-parameter of type int
	 * @return the result is of type Object
	 */
	public Object rangeFromPoint(int x, int y) {
		return Dispatch.call(this, "RangeFromPoint", new Variant(x), new Variant(y));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param obj an input-parameter of type Object
	 * @param start an input-parameter of type Variant
	 */
	public void scrollIntoView(Object obj, Variant start) {
		Dispatch.call(this, "ScrollIntoView", obj, start);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param obj an input-parameter of type Object
	 */
	public void scrollIntoView(Object obj) {
		Dispatch.call(this, "ScrollIntoView", obj);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param obj an input-parameter of type Object
	 * @param start an input-parameter of type Variant
	 */
	public void scrollIntoView(Object obj, Variant start) {
		Dispatch.call(this, "ScrollIntoView", obj, start);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param screenPixelsLeft an input-parameter of type int
	 * @param screenPixelsTop an input-parameter of type int
	 * @param screenPixelsWidth an input-parameter of type int
	 * @param screenPixelsHeight an input-parameter of type int
	 * @param obj an input-parameter of type Object
	 */
	public void getPoint(int screenPixelsLeft, int screenPixelsTop, int screenPixelsWidth, int screenPixelsHeight, Object obj) {
		Dispatch.call(this, "GetPoint", new Variant(screenPixelsLeft), new Variant(screenPixelsTop), new Variant(screenPixelsWidth), new Variant(screenPixelsHeight), obj);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param screenPixelsLeft is an one-element array which sends the input-parameter
	 *                         to the ActiveX-Component and receives the output-parameter
	 * @param screenPixelsTop is an one-element array which sends the input-parameter
	 *                        to the ActiveX-Component and receives the output-parameter
	 * @param screenPixelsWidth is an one-element array which sends the input-parameter
	 *                          to the ActiveX-Component and receives the output-parameter
	 * @param screenPixelsHeight is an one-element array which sends the input-parameter
	 *                           to the ActiveX-Component and receives the output-parameter
	 * @param obj an input-parameter of type Object
	 */
	public void getPoint(int[] screenPixelsLeft, int[] screenPixelsTop, int[] screenPixelsWidth, int[] screenPixelsHeight, Object obj) {
		Variant vnt_screenPixelsLeft = new Variant();
		if( screenPixelsLeft == null || screenPixelsLeft.length == 0 )
			vnt_screenPixelsLeft.putNoParam();
		else
			vnt_screenPixelsLeft.putIntRef(screenPixelsLeft[0]);

		Variant vnt_screenPixelsTop = new Variant();
		if( screenPixelsTop == null || screenPixelsTop.length == 0 )
			vnt_screenPixelsTop.putNoParam();
		else
			vnt_screenPixelsTop.putIntRef(screenPixelsTop[0]);

		Variant vnt_screenPixelsWidth = new Variant();
		if( screenPixelsWidth == null || screenPixelsWidth.length == 0 )
			vnt_screenPixelsWidth.putNoParam();
		else
			vnt_screenPixelsWidth.putIntRef(screenPixelsWidth[0]);

		Variant vnt_screenPixelsHeight = new Variant();
		if( screenPixelsHeight == null || screenPixelsHeight.length == 0 )
			vnt_screenPixelsHeight.putNoParam();
		else
			vnt_screenPixelsHeight.putIntRef(screenPixelsHeight[0]);

		Dispatch.call(this, "GetPoint", vnt_screenPixelsLeft, vnt_screenPixelsTop, vnt_screenPixelsWidth, vnt_screenPixelsHeight, obj);

		if( screenPixelsLeft != null && screenPixelsLeft.length > 0 )
			screenPixelsLeft[0] = vnt_screenPixelsLeft.toInt();
		if( screenPixelsTop != null && screenPixelsTop.length > 0 )
			screenPixelsTop[0] = vnt_screenPixelsTop.toInt();
		if( screenPixelsWidth != null && screenPixelsWidth.length > 0 )
			screenPixelsWidth[0] = vnt_screenPixelsWidth.toInt();
		if( screenPixelsHeight != null && screenPixelsHeight.length > 0 )
			screenPixelsHeight[0] = vnt_screenPixelsHeight.toInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 * @param printZoomPaperWidth an input-parameter of type Variant
	 * @param printZoomPaperHeight an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow, Variant printZoomPaperWidth, Variant printZoomPaperHeight) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow, printZoomPaperWidth, printZoomPaperHeight});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 * @param printZoomPaperWidth an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow, Variant printZoomPaperWidth) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow, printZoomPaperWidth});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint, printZoomColumn});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies) {
		Dispatch.call(this, "PrintOut2000", background, append, range, outputFileName, from, to, item, copies);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item) {
		Dispatch.call(this, "PrintOut2000", background, append, range, outputFileName, from, to, item);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to) {
		Dispatch.call(this, "PrintOut2000", background, append, range, outputFileName, from, to);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from) {
		Dispatch.call(this, "PrintOut2000", background, append, range, outputFileName, from);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName) {
		Dispatch.call(this, "PrintOut2000", background, append, range, outputFileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range) {
		Dispatch.call(this, "PrintOut2000", background, append, range);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append) {
		Dispatch.call(this, "PrintOut2000", background, append);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 */
	public void printOut2000(Variant background) {
		Dispatch.call(this, "PrintOut2000", background);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void printOut2000() {
		Dispatch.call(this, "PrintOut2000");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 * @param printZoomPaperWidth an input-parameter of type Variant
	 * @param printZoomPaperHeight an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow, Variant printZoomPaperWidth, Variant printZoomPaperHeight) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow, printZoomPaperWidth, printZoomPaperHeight});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getUsableWidth() {
		return Dispatch.get(this, "UsableWidth").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getUsableHeight() {
		return Dispatch.get(this, "UsableHeight").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getEnvelopeVisible() {
		return Dispatch.get(this, "EnvelopeVisible").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param envelopeVisible an input-parameter of type boolean
	 */
	public void setEnvelopeVisible(boolean envelopeVisible) {
		Dispatch.put(this, "EnvelopeVisible", new Variant(envelopeVisible));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayRightRuler() {
		return Dispatch.get(this, "DisplayRightRuler").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayRightRuler an input-parameter of type boolean
	 */
	public void setDisplayRightRuler(boolean displayRightRuler) {
		Dispatch.put(this, "DisplayRightRuler", new Variant(displayRightRuler));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayLeftScrollBar() {
		return Dispatch.get(this, "DisplayLeftScrollBar").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayLeftScrollBar an input-parameter of type boolean
	 */
	public void setDisplayLeftScrollBar(boolean displayLeftScrollBar) {
		Dispatch.put(this, "DisplayLeftScrollBar", new Variant(displayLeftScrollBar));
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
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 * @param printZoomPaperWidth an input-parameter of type Variant
	 * @param printZoomPaperHeight an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow, Variant printZoomPaperWidth, Variant printZoomPaperHeight) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow, printZoomPaperWidth, printZoomPaperHeight});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 * @param printZoomPaperWidth an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow, Variant printZoomPaperWidth) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow, printZoomPaperWidth});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint, printZoomColumn});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies) {
		Dispatch.call(this, "PrintOut", background, append, range, outputFileName, from, to, item, copies);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item) {
		Dispatch.call(this, "PrintOut", background, append, range, outputFileName, from, to, item);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to) {
		Dispatch.call(this, "PrintOut", background, append, range, outputFileName, from, to);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from) {
		Dispatch.call(this, "PrintOut", background, append, range, outputFileName, from);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName) {
		Dispatch.call(this, "PrintOut", background, append, range, outputFileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range) {
		Dispatch.call(this, "PrintOut", background, append, range);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append) {
		Dispatch.call(this, "PrintOut", background, append);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Variant
	 */
	public void printOut(Variant background) {
		Dispatch.call(this, "PrintOut", background);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void printOut() {
		Dispatch.call(this, "PrintOut");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param background an input-parameter of type Variant
	 * @param append an input-parameter of type Variant
	 * @param range an input-parameter of type Variant
	 * @param outputFileName an input-parameter of type Variant
	 * @param from an input-parameter of type Variant
	 * @param to an input-parameter of type Variant
	 * @param item an input-parameter of type Variant
	 * @param copies an input-parameter of type Variant
	 * @param pages an input-parameter of type Variant
	 * @param pageType an input-parameter of type Variant
	 * @param printToFile an input-parameter of type Variant
	 * @param collate an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 * @param printZoomPaperWidth an input-parameter of type Variant
	 * @param printZoomPaperHeight an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow, Variant printZoomPaperWidth, Variant printZoomPaperHeight) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow, printZoomPaperWidth, printZoomPaperHeight});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void toggleShowAllReviewers() {
		Dispatch.call(this, "ToggleShowAllReviewers");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getThumbnails() {
		return Dispatch.get(this, "Thumbnails").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param thumbnails an input-parameter of type boolean
	 */
	public void setThumbnails(boolean thumbnails) {
		Dispatch.put(this, "Thumbnails", new Variant(thumbnails));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getShowSourceDocuments() {
		return Dispatch.get(this, "ShowSourceDocuments").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showSourceDocuments an input-parameter of type int
	 */
	public void setShowSourceDocuments(int showSourceDocuments) {
		Dispatch.put(this, "ShowSourceDocuments", new Variant(showSourceDocuments));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void toggleRibbon() {
		Dispatch.call(this, "ToggleRibbon");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHwnd() {
		return Dispatch.get(this, "Hwnd").changeType(Variant.VariantInt).getInt();
	}

}
