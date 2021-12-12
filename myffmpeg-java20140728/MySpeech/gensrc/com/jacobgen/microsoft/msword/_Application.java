/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class _Application extends Dispatch {

	public static final String componentName = "Word._Application";

	public _Application() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public _Application(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public _Application(String compName) {
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
	public String getName() {
		return Dispatch.get(this, "Name").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Documents
	 */
	public Documents getDocuments() {
		return new Documents(Dispatch.get(this, "Documents").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Windows
	 */
	public Windows getWindows() {
		return new Windows(Dispatch.get(this, "Windows").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Document
	 */
	public Document getActiveDocument() {
		return new Document(Dispatch.get(this, "ActiveDocument").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Window
	 */
	public Window getActiveWindow() {
		return new Window(Dispatch.get(this, "ActiveWindow").toDispatch());
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
	 * @return the result is of type Object
	 */
	public Object getWordBasic() {
		return Dispatch.get(this, "WordBasic");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type RecentFiles
	 */
	public RecentFiles getRecentFiles() {
		return new RecentFiles(Dispatch.get(this, "RecentFiles").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Template
	 */
	public Template getNormalTemplate() {
		return new Template(Dispatch.get(this, "NormalTemplate").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type System
	 */
	public System getSystem() {
		return new System(Dispatch.get(this, "System").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type AutoCorrect
	 */
	public AutoCorrect getAutoCorrect() {
		return new AutoCorrect(Dispatch.get(this, "AutoCorrect").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FontNames
	 */
	public FontNames getFontNames() {
		return new FontNames(Dispatch.get(this, "FontNames").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FontNames
	 */
	public FontNames getLandscapeFontNames() {
		return new FontNames(Dispatch.get(this, "LandscapeFontNames").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FontNames
	 */
	public FontNames getPortraitFontNames() {
		return new FontNames(Dispatch.get(this, "PortraitFontNames").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Languages
	 */
	public Languages getLanguages() {
		return new Languages(Dispatch.get(this, "Languages").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Assistant
	 */
	public Assistant getAssistant() {
		return new Assistant(Dispatch.get(this, "Assistant").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Browser
	 */
	public Browser getBrowser() {
		return new Browser(Dispatch.get(this, "Browser").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FileConverters
	 */
	public FileConverters getFileConverters() {
		return new FileConverters(Dispatch.get(this, "FileConverters").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MailingLabel
	 */
	public MailingLabel getMailingLabel() {
		return new MailingLabel(Dispatch.get(this, "MailingLabel").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Dialogs
	 */
	public Dialogs getDialogs() {
		return new Dialogs(Dispatch.get(this, "Dialogs").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type CaptionLabels
	 */
	public CaptionLabels getCaptionLabels() {
		return new CaptionLabels(Dispatch.get(this, "CaptionLabels").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type AutoCaptions
	 */
	public AutoCaptions getAutoCaptions() {
		return new AutoCaptions(Dispatch.get(this, "AutoCaptions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type AddIns
	 */
	public AddIns getAddIns() {
		return new AddIns(Dispatch.get(this, "AddIns").toDispatch());
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
	public String getVersion() {
		return Dispatch.get(this, "Version").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getScreenUpdating() {
		return Dispatch.get(this, "ScreenUpdating").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param screenUpdating an input-parameter of type boolean
	 */
	public void setScreenUpdating(boolean screenUpdating) {
		Dispatch.put(this, "ScreenUpdating", new Variant(screenUpdating));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getPrintPreview() {
		return Dispatch.get(this, "PrintPreview").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param printPreview an input-parameter of type boolean
	 */
	public void setPrintPreview(boolean printPreview) {
		Dispatch.put(this, "PrintPreview", new Variant(printPreview));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Tasks
	 */
	public Tasks getTasks() {
		return new Tasks(Dispatch.get(this, "Tasks").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayStatusBar() {
		return Dispatch.get(this, "DisplayStatusBar").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayStatusBar an input-parameter of type boolean
	 */
	public void setDisplayStatusBar(boolean displayStatusBar) {
		Dispatch.put(this, "DisplayStatusBar", new Variant(displayStatusBar));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSpecialMode() {
		return Dispatch.get(this, "SpecialMode").changeType(Variant.VariantBoolean).getBoolean();
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
	public boolean getMathCoprocessorAvailable() {
		return Dispatch.get(this, "MathCoprocessorAvailable").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMouseAvailable() {
		return Dispatch.get(this, "MouseAvailable").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type int
	 * @return the result is of type Variant
	 */
	public Variant getInternational(int index) {
		return Dispatch.call(this, "International", new Variant(index));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getBuild() {
		return Dispatch.get(this, "Build").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCapsLock() {
		return Dispatch.get(this, "CapsLock").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getNumLock() {
		return Dispatch.get(this, "NumLock").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getUserName() {
		return Dispatch.get(this, "UserName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param userName an input-parameter of type String
	 */
	public void setUserName(String userName) {
		Dispatch.put(this, "UserName", userName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getUserInitials() {
		return Dispatch.get(this, "UserInitials").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param userInitials an input-parameter of type String
	 */
	public void setUserInitials(String userInitials) {
		Dispatch.put(this, "UserInitials", userInitials);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getUserAddress() {
		return Dispatch.get(this, "UserAddress").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param userAddress an input-parameter of type String
	 */
	public void setUserAddress(String userAddress) {
		Dispatch.put(this, "UserAddress", userAddress);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getMacroContainer() {
		return Dispatch.get(this, "MacroContainer");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayRecentFiles() {
		return Dispatch.get(this, "DisplayRecentFiles").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayRecentFiles an input-parameter of type boolean
	 */
	public void setDisplayRecentFiles(boolean displayRecentFiles) {
		Dispatch.put(this, "DisplayRecentFiles", new Variant(displayRecentFiles));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type CommandBars
	 */
	public CommandBars getCommandBars() {
		return new CommandBars(Dispatch.get(this, "CommandBars").toDispatch());
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @return the result is of type SynonymInfo
	 */
	public SynonymInfo getSynonymInfo(String word) {
		return new SynonymInfo(Dispatch.call(this, "SynonymInfo", word).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param word an input-parameter of type String
	 * @param languageID an input-parameter of type Variant
	 * @return the result is of type SynonymInfo
	 */
	public SynonymInfo getSynonymInfo(String word, Variant languageID) {
		SynonymInfo result_of_SynonymInfo = new SynonymInfo(Dispatch.call(this, "SynonymInfo", word, languageID).toDispatch());


		return result_of_SynonymInfo;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type VBE
	 */
	public VBE getVBE() {
		return new VBE(Dispatch.get(this, "VBE").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getDefaultSaveFormat() {
		return Dispatch.get(this, "DefaultSaveFormat").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultSaveFormat an input-parameter of type String
	 */
	public void setDefaultSaveFormat(String defaultSaveFormat) {
		Dispatch.put(this, "DefaultSaveFormat", defaultSaveFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ListGalleries
	 */
	public ListGalleries getListGalleries() {
		return new ListGalleries(Dispatch.get(this, "ListGalleries").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getActivePrinter() {
		return Dispatch.get(this, "ActivePrinter").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param activePrinter an input-parameter of type String
	 */
	public void setActivePrinter(String activePrinter) {
		Dispatch.put(this, "ActivePrinter", activePrinter);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Templates
	 */
	public Templates getTemplates() {
		return new Templates(Dispatch.get(this, "Templates").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getCustomizationContext() {
		return Dispatch.get(this, "CustomizationContext");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customizationContext an input-parameter of type Object
	 */
	public void setCustomizationContext(Object customizationContext) {
		Dispatch.put(this, "CustomizationContext", customizationContext);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type KeyBindings
	 */
	public KeyBindings getKeyBindings() {
		return new KeyBindings(Dispatch.get(this, "KeyBindings").toDispatch());
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param keyCategory an input-parameter of type int
	 * @param command an input-parameter of type String
	 * @return the result is of type KeysBoundTo
	 */
	public KeysBoundTo getKeysBoundTo(int keyCategory, String command) {
		return new KeysBoundTo(Dispatch.call(this, "KeysBoundTo", new Variant(keyCategory), command).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param keyCategory an input-parameter of type int
	 * @param command an input-parameter of type String
	 * @param commandParameter an input-parameter of type Variant
	 * @return the result is of type KeysBoundTo
	 */
	public KeysBoundTo getKeysBoundTo(int keyCategory, String command, Variant commandParameter) {
		KeysBoundTo result_of_KeysBoundTo = new KeysBoundTo(Dispatch.call(this, "KeysBoundTo", new Variant(keyCategory), command, commandParameter).toDispatch());


		return result_of_KeysBoundTo;
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param keyCode an input-parameter of type int
	 * @return the result is of type KeyBinding
	 */
	public KeyBinding getFindKey(int keyCode) {
		return new KeyBinding(Dispatch.call(this, "FindKey", new Variant(keyCode)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param keyCode an input-parameter of type int
	 * @param keyCode2 an input-parameter of type Variant
	 * @return the result is of type KeyBinding
	 */
	public KeyBinding getFindKey(int keyCode, Variant keyCode2) {
		KeyBinding result_of_FindKey = new KeyBinding(Dispatch.call(this, "FindKey", new Variant(keyCode), keyCode2).toDispatch());


		return result_of_FindKey;
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
	 * @return the result is of type String
	 */
	public String getPath() {
		return Dispatch.get(this, "Path").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayScrollBars() {
		return Dispatch.get(this, "DisplayScrollBars").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayScrollBars an input-parameter of type boolean
	 */
	public void setDisplayScrollBars(boolean displayScrollBars) {
		Dispatch.put(this, "DisplayScrollBars", new Variant(displayScrollBars));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getStartupPath() {
		return Dispatch.get(this, "StartupPath").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param startupPath an input-parameter of type String
	 */
	public void setStartupPath(String startupPath) {
		Dispatch.put(this, "StartupPath", startupPath);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBackgroundSavingStatus() {
		return Dispatch.get(this, "BackgroundSavingStatus").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBackgroundPrintingStatus() {
		return Dispatch.get(this, "BackgroundPrintingStatus").changeType(Variant.VariantInt).getInt();
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
	public boolean getDisplayAutoCompleteTips() {
		return Dispatch.get(this, "DisplayAutoCompleteTips").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayAutoCompleteTips an input-parameter of type boolean
	 */
	public void setDisplayAutoCompleteTips(boolean displayAutoCompleteTips) {
		Dispatch.put(this, "DisplayAutoCompleteTips", new Variant(displayAutoCompleteTips));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Options
	 */
	public Options getOptions() {
		return new Options(Dispatch.get(this, "Options").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDisplayAlerts() {
		return Dispatch.get(this, "DisplayAlerts").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayAlerts an input-parameter of type int
	 */
	public void setDisplayAlerts(int displayAlerts) {
		Dispatch.put(this, "DisplayAlerts", new Variant(displayAlerts));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Dictionaries
	 */
	public Dictionaries getCustomDictionaries() {
		return new Dictionaries(Dispatch.get(this, "CustomDictionaries").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getPathSeparator() {
		return Dispatch.get(this, "PathSeparator").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param statusBar an input-parameter of type String
	 */
	public void setStatusBar(String statusBar) {
		Dispatch.put(this, "StatusBar", statusBar);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMAPIAvailable() {
		return Dispatch.get(this, "MAPIAvailable").changeType(Variant.VariantBoolean).getBoolean();
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
	public int getEnableCancelKey() {
		return Dispatch.get(this, "EnableCancelKey").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param enableCancelKey an input-parameter of type int
	 */
	public void setEnableCancelKey(int enableCancelKey) {
		Dispatch.put(this, "EnableCancelKey", new Variant(enableCancelKey));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getUserControl() {
		return Dispatch.get(this, "UserControl").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FileSearch
	 */
	public FileSearch getFileSearch() {
		return new FileSearch(Dispatch.get(this, "FileSearch").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMailSystem() {
		return Dispatch.get(this, "MailSystem").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getDefaultTableSeparator() {
		return Dispatch.get(this, "DefaultTableSeparator").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultTableSeparator an input-parameter of type String
	 */
	public void setDefaultTableSeparator(String defaultTableSeparator) {
		Dispatch.put(this, "DefaultTableSeparator", defaultTableSeparator);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowVisualBasicEditor() {
		return Dispatch.get(this, "ShowVisualBasicEditor").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showVisualBasicEditor an input-parameter of type boolean
	 */
	public void setShowVisualBasicEditor(boolean showVisualBasicEditor) {
		Dispatch.put(this, "ShowVisualBasicEditor", new Variant(showVisualBasicEditor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getBrowseExtraFileTypes() {
		return Dispatch.get(this, "BrowseExtraFileTypes").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param browseExtraFileTypes an input-parameter of type String
	 */
	public void setBrowseExtraFileTypes(String browseExtraFileTypes) {
		Dispatch.put(this, "BrowseExtraFileTypes", browseExtraFileTypes);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param object an input-parameter of type Object
	 * @return the result is of type boolean
	 */
	public boolean getIsObjectValid(Object object) {
		return Dispatch.call(this, "IsObjectValid", object).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type HangulHanjaConversionDictionaries
	 */
	public HangulHanjaConversionDictionaries getHangulHanjaDictionaries() {
		return new HangulHanjaConversionDictionaries(Dispatch.get(this, "HangulHanjaDictionaries").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MailMessage
	 */
	public MailMessage getMailMessage() {
		return new MailMessage(Dispatch.get(this, "MailMessage").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFocusInMailHeader() {
		return Dispatch.get(this, "FocusInMailHeader").changeType(Variant.VariantBoolean).getBoolean();
	}


	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type Variant
	 * @param originalFormat an input-parameter of type Variant
	 */
	public void quit(Variant saveChanges, Variant originalFormat) {
		Dispatch.call(this, "Quit", saveChanges, originalFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type Variant
	 */
	public void quit(Variant saveChanges) {
		Dispatch.call(this, "Quit", saveChanges);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void quit() {
		Dispatch.call(this, "Quit");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param saveChanges an input-parameter of type Variant
	 * @param originalFormat an input-parameter of type Variant
	 * @param routeDocument an input-parameter of type Variant
	 */
	public void quit(Variant saveChanges, Variant originalFormat, Variant routeDocument) {
		Dispatch.call(this, "Quit", saveChanges, originalFormat, routeDocument);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void screenRefresh() {
		Dispatch.call(this, "ScreenRefresh");
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX, Variant manualDuplexPrint) {
		Dispatch.callN(this, "PrintOutOld", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX, manualDuplexPrint});
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX) {
		Dispatch.callN(this, "PrintOutOld", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX});
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
	 * @param fileName an input-parameter of type Variant
	 */
	public void printOutOld(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName) {
		Dispatch.callN(this, "PrintOutOld", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName});
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
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void lookupNameProperties(String name) {
		Dispatch.call(this, "LookupNameProperties", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param unavailableFont an input-parameter of type String
	 * @param substituteFont an input-parameter of type String
	 */
	public void substituteFont(String unavailableFont, String substituteFont) {
		Dispatch.call(this, "SubstituteFont", unavailableFont, substituteFont);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param times an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean repeat(Variant times) {
		return Dispatch.call(this, "Repeat", times).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean repeat() {
		return Dispatch.call(this, "Repeat").changeType(Variant.VariantBoolean).getBoolean();
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param channel an input-parameter of type int
	 * @param command an input-parameter of type String
	 */
	public void dDEExecute(int channel, String command) {
		Dispatch.call(this, "DDEExecute", new Variant(channel), command);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param app an input-parameter of type String
	 * @param topic an input-parameter of type String
	 * @return the result is of type int
	 */
	public int dDEInitiate(String app, String topic) {
		return Dispatch.call(this, "DDEInitiate", app, topic).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param channel an input-parameter of type int
	 * @param item an input-parameter of type String
	 * @param data an input-parameter of type String
	 */
	public void dDEPoke(int channel, String item, String data) {
		Dispatch.call(this, "DDEPoke", new Variant(channel), item, data);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param channel an input-parameter of type int
	 * @param item an input-parameter of type String
	 * @return the result is of type String
	 */
	public String dDERequest(int channel, String item) {
		return Dispatch.call(this, "DDERequest", new Variant(channel), item).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param channel an input-parameter of type int
	 */
	public void dDETerminate(int channel) {
		Dispatch.call(this, "DDETerminate", new Variant(channel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void dDETerminateAll() {
		Dispatch.call(this, "DDETerminateAll");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param arg1 an input-parameter of type int
	 * @param arg2 an input-parameter of type Variant
	 * @param arg3 an input-parameter of type Variant
	 * @param arg4 an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int buildKeyCode(int arg1, Variant arg2, Variant arg3, Variant arg4) {
		return Dispatch.call(this, "BuildKeyCode", new Variant(arg1), arg2, arg3, arg4).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param arg1 an input-parameter of type int
	 * @param arg2 an input-parameter of type Variant
	 * @param arg3 an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int buildKeyCode(int arg1, Variant arg2, Variant arg3) {
		return Dispatch.call(this, "BuildKeyCode", new Variant(arg1), arg2, arg3).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param arg1 an input-parameter of type int
	 * @param arg2 an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int buildKeyCode(int arg1, Variant arg2) {
		return Dispatch.call(this, "BuildKeyCode", new Variant(arg1), arg2).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param arg1 an input-parameter of type int
	 * @return the result is of type int
	 */
	public int buildKeyCode(int arg1) {
		return Dispatch.call(this, "BuildKeyCode", new Variant(arg1)).changeType(Variant.VariantInt).getInt();
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param keyCode an input-parameter of type int
	 * @param keyCode2 an input-parameter of type Variant
	 * @return the result is of type String
	 */
	public String keyString(int keyCode, Variant keyCode2) {
		return Dispatch.call(this, "KeyString", new Variant(keyCode), keyCode2).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param keyCode an input-parameter of type int
	 * @return the result is of type String
	 */
	public String keyString(int keyCode) {
		return Dispatch.call(this, "KeyString", new Variant(keyCode)).toString();
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type String
	 * @param destination an input-parameter of type String
	 * @param name an input-parameter of type String
	 * @param object an input-parameter of type int
	 */
	public void organizerCopy(String source, String destination, String name, int object) {
		Dispatch.call(this, "OrganizerCopy", source, destination, name, new Variant(object));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type String
	 * @param name an input-parameter of type String
	 * @param object an input-parameter of type int
	 */
	public void organizerDelete(String source, String name, int object) {
		Dispatch.call(this, "OrganizerDelete", source, name, new Variant(object));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param source an input-parameter of type String
	 * @param name an input-parameter of type String
	 * @param newName an input-parameter of type String
	 * @param object an input-parameter of type int
	 */
	public void organizerRename(String source, String name, String newName, int object) {
		Dispatch.call(this, "OrganizerRename", source, name, newName, new Variant(object));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tagID an input-parameter of type SafeArray
	 * @param value an input-parameter of type SafeArray
	 */
	public void addAddress(SafeArray tagID, SafeArray value) {
		Dispatch.call(this, "AddAddress", tagID, value);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param addressProperties an input-parameter of type Variant
	 * @param useAutoText an input-parameter of type Variant
	 * @param displaySelectDialog an input-parameter of type Variant
	 * @param selectDialog an input-parameter of type Variant
	 * @param checkNamesDialog an input-parameter of type Variant
	 * @param recentAddressesChoice an input-parameter of type Variant
	 * @param updateRecentAddresses an input-parameter of type Variant
	 * @return the result is of type String
	 */
	public String getAddress(Variant name, Variant addressProperties, Variant useAutoText, Variant displaySelectDialog, Variant selectDialog, Variant checkNamesDialog, Variant recentAddressesChoice, Variant updateRecentAddresses) {
		return Dispatch.call(this, "GetAddress", name, addressProperties, useAutoText, displaySelectDialog, selectDialog, checkNamesDialog, recentAddressesChoice, updateRecentAddresses).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param addressProperties an input-parameter of type Variant
	 * @param useAutoText an input-parameter of type Variant
	 * @param displaySelectDialog an input-parameter of type Variant
	 * @param selectDialog an input-parameter of type Variant
	 * @param checkNamesDialog an input-parameter of type Variant
	 * @param recentAddressesChoice an input-parameter of type Variant
	 * @return the result is of type String
	 */
	public String getAddress(Variant name, Variant addressProperties, Variant useAutoText, Variant displaySelectDialog, Variant selectDialog, Variant checkNamesDialog, Variant recentAddressesChoice) {
		return Dispatch.call(this, "GetAddress", name, addressProperties, useAutoText, displaySelectDialog, selectDialog, checkNamesDialog, recentAddressesChoice).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param addressProperties an input-parameter of type Variant
	 * @param useAutoText an input-parameter of type Variant
	 * @param displaySelectDialog an input-parameter of type Variant
	 * @param selectDialog an input-parameter of type Variant
	 * @param checkNamesDialog an input-parameter of type Variant
	 * @return the result is of type String
	 */
	public String getAddress(Variant name, Variant addressProperties, Variant useAutoText, Variant displaySelectDialog, Variant selectDialog, Variant checkNamesDialog) {
		return Dispatch.call(this, "GetAddress", name, addressProperties, useAutoText, displaySelectDialog, selectDialog, checkNamesDialog).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param addressProperties an input-parameter of type Variant
	 * @param useAutoText an input-parameter of type Variant
	 * @param displaySelectDialog an input-parameter of type Variant
	 * @param selectDialog an input-parameter of type Variant
	 * @return the result is of type String
	 */
	public String getAddress(Variant name, Variant addressProperties, Variant useAutoText, Variant displaySelectDialog, Variant selectDialog) {
		return Dispatch.call(this, "GetAddress", name, addressProperties, useAutoText, displaySelectDialog, selectDialog).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param addressProperties an input-parameter of type Variant
	 * @param useAutoText an input-parameter of type Variant
	 * @param displaySelectDialog an input-parameter of type Variant
	 * @return the result is of type String
	 */
	public String getAddress(Variant name, Variant addressProperties, Variant useAutoText, Variant displaySelectDialog) {
		return Dispatch.call(this, "GetAddress", name, addressProperties, useAutoText, displaySelectDialog).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param addressProperties an input-parameter of type Variant
	 * @param useAutoText an input-parameter of type Variant
	 * @return the result is of type String
	 */
	public String getAddress(Variant name, Variant addressProperties, Variant useAutoText) {
		return Dispatch.call(this, "GetAddress", name, addressProperties, useAutoText).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param addressProperties an input-parameter of type Variant
	 * @return the result is of type String
	 */
	public String getAddress(Variant name, Variant addressProperties) {
		return Dispatch.call(this, "GetAddress", name, addressProperties).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @return the result is of type String
	 */
	public String getAddress(Variant name) {
		return Dispatch.call(this, "GetAddress", name).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getAddress() {
		return Dispatch.call(this, "GetAddress").toString();
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param string an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean checkGrammar(String string) {
		return Dispatch.call(this, "CheckGrammar", string).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 * @param customDictionary10 an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9, Variant customDictionary10) {
		return Dispatch.callN(this, "CheckSpelling", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9, customDictionary10}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9) {
		return Dispatch.callN(this, "CheckSpelling", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8) {
		return Dispatch.callN(this, "CheckSpelling", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7) {
		return Dispatch.callN(this, "CheckSpelling", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6) {
		return Dispatch.callN(this, "CheckSpelling", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6}).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5) {
		return Dispatch.call(this, "CheckSpelling", word, customDictionary, ignoreUppercase, mainDictionary, customDictionary2, customDictionary3, customDictionary4, customDictionary5).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4) {
		return Dispatch.call(this, "CheckSpelling", word, customDictionary, ignoreUppercase, mainDictionary, customDictionary2, customDictionary3, customDictionary4).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant customDictionary2, Variant customDictionary3) {
		return Dispatch.call(this, "CheckSpelling", word, customDictionary, ignoreUppercase, mainDictionary, customDictionary2, customDictionary3).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant customDictionary2) {
		return Dispatch.call(this, "CheckSpelling", word, customDictionary, ignoreUppercase, mainDictionary, customDictionary2).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary) {
		return Dispatch.call(this, "CheckSpelling", word, customDictionary, ignoreUppercase, mainDictionary).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word, Variant customDictionary, Variant ignoreUppercase) {
		return Dispatch.call(this, "CheckSpelling", word, customDictionary, ignoreUppercase).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word, Variant customDictionary) {
		return Dispatch.call(this, "CheckSpelling", word, customDictionary).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean checkSpelling(String word) {
		return Dispatch.call(this, "CheckSpelling", word).changeType(Variant.VariantBoolean).getBoolean();
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void resetIgnoreAll() {
		Dispatch.call(this, "ResetIgnoreAll");
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9) {
		return new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8) {
		return new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7) {
		return new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6) {
		return new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5) {
		return new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", word, customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", word, customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", word, customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", word, customDictionary, ignoreUppercase, mainDictionary, suggestionMode).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", word, customDictionary, ignoreUppercase, mainDictionary).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", word, customDictionary, ignoreUppercase).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", word, customDictionary).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word) {
		return new SpellingSuggestions(Dispatch.call(this, "GetSpellingSuggestions", word).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param word an input-parameter of type String
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param mainDictionary an input-parameter of type Variant
	 * @param suggestionMode an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 * @param customDictionary10 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9, Variant customDictionary10) {
		SpellingSuggestions result_of_GetSpellingSuggestions = new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9, customDictionary10}).toDispatch());


		return result_of_GetSpellingSuggestions;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void goBack() {
		Dispatch.call(this, "GoBack");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param helpType an input-parameter of type Variant
	 */
	public void help(Variant helpType) {
		Dispatch.call(this, "Help", helpType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void automaticChange() {
		Dispatch.call(this, "AutomaticChange");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void showMe() {
		Dispatch.call(this, "ShowMe");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void helpTool() {
		Dispatch.call(this, "HelpTool");
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
	 * @param listAllCommands an input-parameter of type boolean
	 */
	public void listCommands(boolean listAllCommands) {
		Dispatch.call(this, "ListCommands", new Variant(listAllCommands));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void showClipboard() {
		Dispatch.call(this, "ShowClipboard");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param when an input-parameter of type Variant
	 * @param name an input-parameter of type String
	 * @param tolerance an input-parameter of type Variant
	 */
	public void onTime(Variant when, String name, Variant tolerance) {
		Dispatch.call(this, "OnTime", when, name, tolerance);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param when an input-parameter of type Variant
	 * @param name an input-parameter of type String
	 */
	public void onTime(Variant when, String name) {
		Dispatch.call(this, "OnTime", when, name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param when an input-parameter of type Variant
	 * @param name an input-parameter of type String
	 * @param tolerance an input-parameter of type Variant
	 */
	public void onTime(Variant when, String name, Variant tolerance) {
		Dispatch.call(this, "OnTime", when, name, tolerance);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void nextLetter() {
		Dispatch.call(this, "NextLetter");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param zone an input-parameter of type String
	 * @param server an input-parameter of type String
	 * @param volume an input-parameter of type String
	 * @param user an input-parameter of type Variant
	 * @param userPassword an input-parameter of type Variant
	 * @param volumePassword an input-parameter of type Variant
	 * @return the result is of type short
	 */
	public short mountVolume(String zone, String server, String volume, Variant user, Variant userPassword, Variant volumePassword) {
		return Dispatch.call(this, "MountVolume", zone, server, volume, user, userPassword, volumePassword).changeType(Variant.VariantShort).getShort();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param zone an input-parameter of type String
	 * @param server an input-parameter of type String
	 * @param volume an input-parameter of type String
	 * @param user an input-parameter of type Variant
	 * @param userPassword an input-parameter of type Variant
	 * @return the result is of type short
	 */
	public short mountVolume(String zone, String server, String volume, Variant user, Variant userPassword) {
		return Dispatch.call(this, "MountVolume", zone, server, volume, user, userPassword).changeType(Variant.VariantShort).getShort();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param zone an input-parameter of type String
	 * @param server an input-parameter of type String
	 * @param volume an input-parameter of type String
	 * @param user an input-parameter of type Variant
	 * @return the result is of type short
	 */
	public short mountVolume(String zone, String server, String volume, Variant user) {
		return Dispatch.call(this, "MountVolume", zone, server, volume, user).changeType(Variant.VariantShort).getShort();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param zone an input-parameter of type String
	 * @param server an input-parameter of type String
	 * @param volume an input-parameter of type String
	 * @return the result is of type short
	 */
	public short mountVolume(String zone, String server, String volume) {
		return Dispatch.call(this, "MountVolume", zone, server, volume).changeType(Variant.VariantShort).getShort();
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param string an input-parameter of type String
	 * @return the result is of type String
	 */
	public String cleanString(String string) {
		return Dispatch.call(this, "CleanString", string).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sendFax() {
		Dispatch.call(this, "SendFax");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param path an input-parameter of type String
	 */
	public void changeFileOpenDirectory(String path) {
		Dispatch.call(this, "ChangeFileOpenDirectory", path);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 */
	public void runOld(String macroName) {
		Dispatch.call(this, "RunOld", macroName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void goForward() {
		Dispatch.call(this, "GoForward");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param left an input-parameter of type int
	 * @param top an input-parameter of type int
	 */
	public void move(int left, int top) {
		Dispatch.call(this, "Move", new Variant(left), new Variant(top));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param width an input-parameter of type int
	 * @param height an input-parameter of type int
	 */
	public void resize(int width, int height) {
		Dispatch.call(this, "Resize", new Variant(width), new Variant(height));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param inches an input-parameter of type float
	 * @return the result is of type float
	 */
	public float inchesToPoints(float inches) {
		return Dispatch.call(this, "InchesToPoints", new Variant(inches)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param centimeters an input-parameter of type float
	 * @return the result is of type float
	 */
	public float centimetersToPoints(float centimeters) {
		return Dispatch.call(this, "CentimetersToPoints", new Variant(centimeters)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param millimeters an input-parameter of type float
	 * @return the result is of type float
	 */
	public float millimetersToPoints(float millimeters) {
		return Dispatch.call(this, "MillimetersToPoints", new Variant(millimeters)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param picas an input-parameter of type float
	 * @return the result is of type float
	 */
	public float picasToPoints(float picas) {
		return Dispatch.call(this, "PicasToPoints", new Variant(picas)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lines an input-parameter of type float
	 * @return the result is of type float
	 */
	public float linesToPoints(float lines) {
		return Dispatch.call(this, "LinesToPoints", new Variant(lines)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param points an input-parameter of type float
	 * @return the result is of type float
	 */
	public float pointsToInches(float points) {
		return Dispatch.call(this, "PointsToInches", new Variant(points)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param points an input-parameter of type float
	 * @return the result is of type float
	 */
	public float pointsToCentimeters(float points) {
		return Dispatch.call(this, "PointsToCentimeters", new Variant(points)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param points an input-parameter of type float
	 * @return the result is of type float
	 */
	public float pointsToMillimeters(float points) {
		return Dispatch.call(this, "PointsToMillimeters", new Variant(points)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param points an input-parameter of type float
	 * @return the result is of type float
	 */
	public float pointsToPicas(float points) {
		return Dispatch.call(this, "PointsToPicas", new Variant(points)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param points an input-parameter of type float
	 * @return the result is of type float
	 */
	public float pointsToLines(float points) {
		return Dispatch.call(this, "PointsToLines", new Variant(points)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void activate() {
		Dispatch.call(this, "Activate");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param points an input-parameter of type float
	 * @param fVertical an input-parameter of type Variant
	 * @return the result is of type float
	 */
	public float pointsToPixels(float points, Variant fVertical) {
		return Dispatch.call(this, "PointsToPixels", new Variant(points), fVertical).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param points an input-parameter of type float
	 * @return the result is of type float
	 */
	public float pointsToPixels(float points) {
		return Dispatch.call(this, "PointsToPixels", new Variant(points)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param points an input-parameter of type float
	 * @param fVertical an input-parameter of type Variant
	 * @return the result is of type float
	 */
	public float pointsToPixels(float points, Variant fVertical) {
		float result_of_PointsToPixels = Dispatch.call(this, "PointsToPixels", new Variant(points), fVertical).changeType(Variant.VariantFloat).getFloat();


		return result_of_PointsToPixels;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pixels an input-parameter of type float
	 * @param fVertical an input-parameter of type Variant
	 * @return the result is of type float
	 */
	public float pixelsToPoints(float pixels, Variant fVertical) {
		return Dispatch.call(this, "PixelsToPoints", new Variant(pixels), fVertical).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pixels an input-parameter of type float
	 * @return the result is of type float
	 */
	public float pixelsToPoints(float pixels) {
		return Dispatch.call(this, "PixelsToPoints", new Variant(pixels)).changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param pixels an input-parameter of type float
	 * @param fVertical an input-parameter of type Variant
	 * @return the result is of type float
	 */
	public float pixelsToPoints(float pixels, Variant fVertical) {
		float result_of_PixelsToPoints = Dispatch.call(this, "PixelsToPoints", new Variant(pixels), fVertical).changeType(Variant.VariantFloat).getFloat();


		return result_of_PixelsToPoints;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void keyboardLatin() {
		Dispatch.call(this, "KeyboardLatin");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void keyboardBidi() {
		Dispatch.call(this, "KeyboardBidi");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void toggleKeyboard() {
		Dispatch.call(this, "ToggleKeyboard");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param langId an input-parameter of type int
	 * @return the result is of type int
	 */
	public int keyboard(int langId) {
		return Dispatch.call(this, "Keyboard", new Variant(langId)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int keyboard() {
		return Dispatch.call(this, "Keyboard").changeType(Variant.VariantInt).getInt();
	}

	

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String productCode() {
		return Dispatch.call(this, "ProductCode").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DefaultWebOptions
	 */
	public DefaultWebOptions defaultWebOptions() {
		return new DefaultWebOptions(Dispatch.call(this, "DefaultWebOptions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Variant
	 * @param cid an input-parameter of type Variant
	 * @param piCSE an input-parameter of type Variant
	 */
	public void discussionSupport(Variant range, Variant cid, Variant piCSE) {
		Dispatch.call(this, "DiscussionSupport", range, cid, piCSE);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param documentType an input-parameter of type int
	 */
	public void setDefaultTheme(String name, int documentType) {
		Dispatch.call(this, "SetDefaultTheme", name, new Variant(documentType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param documentType an input-parameter of type int
	 * @return the result is of type String
	 */
	public String getDefaultTheme(int documentType) {
		return Dispatch.call(this, "GetDefaultTheme", new Variant(documentType)).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type EmailOptions
	 */
	public EmailOptions getEmailOptions() {
		return new EmailOptions(Dispatch.get(this, "EmailOptions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoLanguageID
	 */
	public MsoLanguageID getLanguage() {
		return new MsoLanguageID(Dispatch.get(this, "Language").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type COMAddIns
	 */
	public COMAddIns getCOMAddIns() {
		return new COMAddIns(Dispatch.get(this, "COMAddIns").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getCheckLanguage() {
		return Dispatch.get(this, "CheckLanguage").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param checkLanguage an input-parameter of type boolean
	 */
	public void setCheckLanguage(boolean checkLanguage) {
		Dispatch.put(this, "CheckLanguage", new Variant(checkLanguage));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type LanguageSettings
	 */
	public LanguageSettings getLanguageSettings() {
		return new LanguageSettings(Dispatch.get(this, "LanguageSettings").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDummy1() {
		return Dispatch.get(this, "Dummy1").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type AnswerWizard
	 */
	public AnswerWizard getAnswerWizard() {
		return new AnswerWizard(Dispatch.get(this, "AnswerWizard").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoFeatureInstall
	 */
	public MsoFeatureInstall getFeatureInstall() {
		return new MsoFeatureInstall(Dispatch.get(this, "FeatureInstall").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param featureInstall an input-parameter of type MsoFeatureInstall
	 */
	public void setFeatureInstall(MsoFeatureInstall featureInstall) {
		Dispatch.put(this, "FeatureInstall", featureInstall);
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 * @param printZoomPaperWidth an input-parameter of type Variant
	 * @param printZoomPaperHeight an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow, Variant printZoomPaperWidth, Variant printZoomPaperHeight) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow, printZoomPaperWidth, printZoomPaperHeight});
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 * @param printZoomPaperWidth an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow, Variant printZoomPaperWidth) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow, printZoomPaperWidth});
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow});
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX, manualDuplexPrint, printZoomColumn});
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX, Variant manualDuplexPrint) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX, manualDuplexPrint});
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX});
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
	 * @param fileName an input-parameter of type Variant
	 */
	public void printOut2000(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName) {
		Dispatch.callN(this, "PrintOut2000", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName});
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
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @param varg19 an input-parameter of type Variant
	 * @param varg20 an input-parameter of type Variant
	 * @param varg21 an input-parameter of type Variant
	 * @param varg22 an input-parameter of type Variant
	 * @param varg23 an input-parameter of type Variant
	 * @param varg24 an input-parameter of type Variant
	 * @param varg25 an input-parameter of type Variant
	 * @param varg26 an input-parameter of type Variant
	 * @param varg27 an input-parameter of type Variant
	 * @param varg28 an input-parameter of type Variant
	 * @param varg29 an input-parameter of type Variant
	 * @param varg30 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18, Variant varg19, Variant varg20, Variant varg21, Variant varg22, Variant varg23, Variant varg24, Variant varg25, Variant varg26, Variant varg27, Variant varg28, Variant varg29, Variant varg30) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18, varg19, varg20, varg21, varg22, varg23, varg24, varg25, varg26, varg27, varg28, varg29, varg30});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @param varg19 an input-parameter of type Variant
	 * @param varg20 an input-parameter of type Variant
	 * @param varg21 an input-parameter of type Variant
	 * @param varg22 an input-parameter of type Variant
	 * @param varg23 an input-parameter of type Variant
	 * @param varg24 an input-parameter of type Variant
	 * @param varg25 an input-parameter of type Variant
	 * @param varg26 an input-parameter of type Variant
	 * @param varg27 an input-parameter of type Variant
	 * @param varg28 an input-parameter of type Variant
	 * @param varg29 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18, Variant varg19, Variant varg20, Variant varg21, Variant varg22, Variant varg23, Variant varg24, Variant varg25, Variant varg26, Variant varg27, Variant varg28, Variant varg29) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18, varg19, varg20, varg21, varg22, varg23, varg24, varg25, varg26, varg27, varg28, varg29});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @param varg19 an input-parameter of type Variant
	 * @param varg20 an input-parameter of type Variant
	 * @param varg21 an input-parameter of type Variant
	 * @param varg22 an input-parameter of type Variant
	 * @param varg23 an input-parameter of type Variant
	 * @param varg24 an input-parameter of type Variant
	 * @param varg25 an input-parameter of type Variant
	 * @param varg26 an input-parameter of type Variant
	 * @param varg27 an input-parameter of type Variant
	 * @param varg28 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18, Variant varg19, Variant varg20, Variant varg21, Variant varg22, Variant varg23, Variant varg24, Variant varg25, Variant varg26, Variant varg27, Variant varg28) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18, varg19, varg20, varg21, varg22, varg23, varg24, varg25, varg26, varg27, varg28});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @param varg19 an input-parameter of type Variant
	 * @param varg20 an input-parameter of type Variant
	 * @param varg21 an input-parameter of type Variant
	 * @param varg22 an input-parameter of type Variant
	 * @param varg23 an input-parameter of type Variant
	 * @param varg24 an input-parameter of type Variant
	 * @param varg25 an input-parameter of type Variant
	 * @param varg26 an input-parameter of type Variant
	 * @param varg27 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18, Variant varg19, Variant varg20, Variant varg21, Variant varg22, Variant varg23, Variant varg24, Variant varg25, Variant varg26, Variant varg27) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18, varg19, varg20, varg21, varg22, varg23, varg24, varg25, varg26, varg27});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @param varg19 an input-parameter of type Variant
	 * @param varg20 an input-parameter of type Variant
	 * @param varg21 an input-parameter of type Variant
	 * @param varg22 an input-parameter of type Variant
	 * @param varg23 an input-parameter of type Variant
	 * @param varg24 an input-parameter of type Variant
	 * @param varg25 an input-parameter of type Variant
	 * @param varg26 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18, Variant varg19, Variant varg20, Variant varg21, Variant varg22, Variant varg23, Variant varg24, Variant varg25, Variant varg26) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18, varg19, varg20, varg21, varg22, varg23, varg24, varg25, varg26});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @param varg19 an input-parameter of type Variant
	 * @param varg20 an input-parameter of type Variant
	 * @param varg21 an input-parameter of type Variant
	 * @param varg22 an input-parameter of type Variant
	 * @param varg23 an input-parameter of type Variant
	 * @param varg24 an input-parameter of type Variant
	 * @param varg25 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18, Variant varg19, Variant varg20, Variant varg21, Variant varg22, Variant varg23, Variant varg24, Variant varg25) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18, varg19, varg20, varg21, varg22, varg23, varg24, varg25});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @param varg19 an input-parameter of type Variant
	 * @param varg20 an input-parameter of type Variant
	 * @param varg21 an input-parameter of type Variant
	 * @param varg22 an input-parameter of type Variant
	 * @param varg23 an input-parameter of type Variant
	 * @param varg24 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18, Variant varg19, Variant varg20, Variant varg21, Variant varg22, Variant varg23, Variant varg24) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18, varg19, varg20, varg21, varg22, varg23, varg24});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @param varg19 an input-parameter of type Variant
	 * @param varg20 an input-parameter of type Variant
	 * @param varg21 an input-parameter of type Variant
	 * @param varg22 an input-parameter of type Variant
	 * @param varg23 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18, Variant varg19, Variant varg20, Variant varg21, Variant varg22, Variant varg23) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18, varg19, varg20, varg21, varg22, varg23});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @param varg19 an input-parameter of type Variant
	 * @param varg20 an input-parameter of type Variant
	 * @param varg21 an input-parameter of type Variant
	 * @param varg22 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18, Variant varg19, Variant varg20, Variant varg21, Variant varg22) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18, varg19, varg20, varg21, varg22});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @param varg19 an input-parameter of type Variant
	 * @param varg20 an input-parameter of type Variant
	 * @param varg21 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18, Variant varg19, Variant varg20, Variant varg21) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18, varg19, varg20, varg21});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @param varg19 an input-parameter of type Variant
	 * @param varg20 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18, Variant varg19, Variant varg20) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18, varg19, varg20});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @param varg19 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18, Variant varg19) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18, varg19});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @param varg18 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17, Variant varg18) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17, varg18});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @param varg17 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16, Variant varg17) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16, varg17});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @param varg16 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15, Variant varg16) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15, varg16});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @param varg15 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14, Variant varg15) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14, varg15});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @param varg14 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13, Variant varg14) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13, varg14});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @param varg13 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12, Variant varg13) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12, varg13});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @param varg12 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11, Variant varg12) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11, varg12});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @param varg11 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10, Variant varg11) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10, varg11});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @param varg10 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9, Variant varg10) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9, varg10});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @param varg9 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8, Variant varg9) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8, varg9});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @param varg8 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7, Variant varg8) {
		return Dispatch.callN(this, "Run", new Object[] { macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7, varg8});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @param varg7 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6, Variant varg7) {
		return Dispatch.call(this, "Run", macroName, varg1, varg2, varg3, varg4, varg5, varg6, varg7);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @param varg6 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5, Variant varg6) {
		return Dispatch.call(this, "Run", macroName, varg1, varg2, varg3, varg4, varg5, varg6);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @param varg5 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4, Variant varg5) {
		return Dispatch.call(this, "Run", macroName, varg1, varg2, varg3, varg4, varg5);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @param varg4 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3, Variant varg4) {
		return Dispatch.call(this, "Run", macroName, varg1, varg2, varg3, varg4);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @param varg3 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2, Variant varg3) {
		return Dispatch.call(this, "Run", macroName, varg1, varg2, varg3);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @param varg2 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1, Variant varg2) {
		return Dispatch.call(this, "Run", macroName, varg1, varg2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @param varg1 an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName, Variant varg1) {
		return Dispatch.call(this, "Run", macroName, varg1);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param macroName an input-parameter of type String
	 * @return the result is of type Variant
	 */
	public Variant run(String macroName) {
		return Dispatch.call(this, "Run", macroName);
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 * @param printZoomPaperWidth an input-parameter of type Variant
	 * @param printZoomPaperHeight an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow, Variant printZoomPaperWidth, Variant printZoomPaperHeight) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow, printZoomPaperWidth, printZoomPaperHeight});
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 * @param printZoomPaperWidth an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow, Variant printZoomPaperWidth) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow, printZoomPaperWidth});
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow});
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX, manualDuplexPrint, printZoomColumn});
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX, Variant manualDuplexPrint) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX, manualDuplexPrint});
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX});
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
	 * @param fileName an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName});
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
	 * @param fileName an input-parameter of type Variant
	 * @param activePrinterMacGX an input-parameter of type Variant
	 * @param manualDuplexPrint an input-parameter of type Variant
	 * @param printZoomColumn an input-parameter of type Variant
	 * @param printZoomRow an input-parameter of type Variant
	 * @param printZoomPaperWidth an input-parameter of type Variant
	 * @param printZoomPaperHeight an input-parameter of type Variant
	 */
	public void printOut(Variant background, Variant append, Variant range, Variant outputFileName, Variant from, Variant to, Variant item, Variant copies, Variant pages, Variant pageType, Variant printToFile, Variant collate, Variant fileName, Variant activePrinterMacGX, Variant manualDuplexPrint, Variant printZoomColumn, Variant printZoomRow, Variant printZoomPaperWidth, Variant printZoomPaperHeight) {
		Dispatch.callN(this, "PrintOut", new Object[] { background, append, range, outputFileName, from, to, item, copies, pages, pageType, printToFile, collate, fileName, activePrinterMacGX, manualDuplexPrint, printZoomColumn, printZoomRow, printZoomPaperWidth, printZoomPaperHeight});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoAutomationSecurity
	 */
	public MsoAutomationSecurity getAutomationSecurity() {
		return new MsoAutomationSecurity(Dispatch.get(this, "AutomationSecurity").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param automationSecurity an input-parameter of type MsoAutomationSecurity
	 */
	public void setAutomationSecurity(MsoAutomationSecurity automationSecurity) {
		Dispatch.put(this, "AutomationSecurity", automationSecurity);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileDialogType an input-parameter of type MsoFileDialogType
	 * @return the result is of type FileDialog
	 */
	public FileDialog getFileDialog(MsoFileDialogType fileDialogType) {
		return new FileDialog(Dispatch.call(this, "FileDialog", fileDialogType).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getEmailTemplate() {
		return Dispatch.get(this, "EmailTemplate").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param emailTemplate an input-parameter of type String
	 */
	public void setEmailTemplate(String emailTemplate) {
		Dispatch.put(this, "EmailTemplate", emailTemplate);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowWindowsInTaskbar() {
		return Dispatch.get(this, "ShowWindowsInTaskbar").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showWindowsInTaskbar an input-parameter of type boolean
	 */
	public void setShowWindowsInTaskbar(boolean showWindowsInTaskbar) {
		Dispatch.put(this, "ShowWindowsInTaskbar", new Variant(showWindowsInTaskbar));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type NewFile
	 */
	public NewFile getNewDocument() {
		return new NewFile(Dispatch.get(this, "NewDocument").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowStartupDialog() {
		return Dispatch.get(this, "ShowStartupDialog").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showStartupDialog an input-parameter of type boolean
	 */
	public void setShowStartupDialog(boolean showStartupDialog) {
		Dispatch.put(this, "ShowStartupDialog", new Variant(showStartupDialog));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type AutoCorrect
	 */
	public AutoCorrect getAutoCorrectEmail() {
		return new AutoCorrect(Dispatch.get(this, "AutoCorrectEmail").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TaskPanes
	 */
	public TaskPanes getTaskPanes() {
		return new TaskPanes(Dispatch.get(this, "TaskPanes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDefaultLegalBlackline() {
		return Dispatch.get(this, "DefaultLegalBlackline").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultLegalBlackline an input-parameter of type boolean
	 */
	public void setDefaultLegalBlackline(boolean defaultLegalBlackline) {
		Dispatch.put(this, "DefaultLegalBlackline", new Variant(defaultLegalBlackline));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean dummy2() {
		return Dispatch.call(this, "Dummy2").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SmartTagRecognizers
	 */
	public SmartTagRecognizers getSmartTagRecognizers() {
		return new SmartTagRecognizers(Dispatch.get(this, "SmartTagRecognizers").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SmartTagTypes
	 */
	public SmartTagTypes getSmartTagTypes() {
		return new SmartTagTypes(Dispatch.get(this, "SmartTagTypes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLNamespaces
	 */
	public XMLNamespaces getXMLNamespaces() {
		return new XMLNamespaces(Dispatch.get(this, "XMLNamespaces").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void putFocusInMailHeader() {
		Dispatch.call(this, "PutFocusInMailHeader");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getArbitraryXMLSupportAvailable() {
		return Dispatch.get(this, "ArbitraryXMLSupportAvailable").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getBuildFull() {
		return Dispatch.get(this, "BuildFull").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getBuildFeatureCrew() {
		return Dispatch.get(this, "BuildFeatureCrew").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void loadMasterList(String fileName) {
		Dispatch.call(this, "LoadMasterList", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @param compareFields an input-parameter of type boolean
	 * @param compareComments an input-parameter of type boolean
	 * @param compareMoves an input-parameter of type boolean
	 * @param revisedAuthor an input-parameter of type String
	 * @param ignoreAllComparisonWarnings an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes, boolean compareFields, boolean compareComments, boolean compareMoves, String revisedAuthor, boolean ignoreAllComparisonWarnings) {
		return new Document(Dispatch.callN(this, "CompareDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes), new Variant(compareFields), new Variant(compareComments), new Variant(compareMoves), revisedAuthor, new Variant(ignoreAllComparisonWarnings)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @param compareFields an input-parameter of type boolean
	 * @param compareComments an input-parameter of type boolean
	 * @param compareMoves an input-parameter of type boolean
	 * @param revisedAuthor an input-parameter of type String
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes, boolean compareFields, boolean compareComments, boolean compareMoves, String revisedAuthor) {
		return new Document(Dispatch.callN(this, "CompareDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes), new Variant(compareFields), new Variant(compareComments), new Variant(compareMoves), revisedAuthor}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @param compareFields an input-parameter of type boolean
	 * @param compareComments an input-parameter of type boolean
	 * @param compareMoves an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes, boolean compareFields, boolean compareComments, boolean compareMoves) {
		return new Document(Dispatch.callN(this, "CompareDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes), new Variant(compareFields), new Variant(compareComments), new Variant(compareMoves)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @param compareFields an input-parameter of type boolean
	 * @param compareComments an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes, boolean compareFields, boolean compareComments) {
		return new Document(Dispatch.callN(this, "CompareDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes), new Variant(compareFields), new Variant(compareComments)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @param compareFields an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes, boolean compareFields) {
		return new Document(Dispatch.callN(this, "CompareDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes), new Variant(compareFields)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes) {
		return new Document(Dispatch.callN(this, "CompareDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes) {
		return new Document(Dispatch.callN(this, "CompareDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders) {
		return new Document(Dispatch.callN(this, "CompareDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables) {
		return new Document(Dispatch.call(this, "CompareDocuments", originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace) {
		return new Document(Dispatch.call(this, "CompareDocuments", originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges) {
		return new Document(Dispatch.call(this, "CompareDocuments", originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting) {
		return new Document(Dispatch.call(this, "CompareDocuments", originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity) {
		return new Document(Dispatch.call(this, "CompareDocuments", originalDocument, revisedDocument, new Variant(destination), new Variant(granularity)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument, int destination) {
		return new Document(Dispatch.call(this, "CompareDocuments", originalDocument, revisedDocument, new Variant(destination)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @return the result is of type Document
	 */
	public Document compareDocuments(Document originalDocument, Document revisedDocument) {
		return new Document(Dispatch.call(this, "CompareDocuments", originalDocument, revisedDocument).toDispatch());
	}

	
	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @param compareFields an input-parameter of type boolean
	 * @param compareComments an input-parameter of type boolean
	 * @param compareMoves an input-parameter of type boolean
	 * @param originalAuthor an input-parameter of type String
	 * @param revisedAuthor an input-parameter of type String
	 * @param formatFrom an input-parameter of type int
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes, boolean compareFields, boolean compareComments, boolean compareMoves, String originalAuthor, String revisedAuthor, int formatFrom) {
		return new Document(Dispatch.callN(this, "MergeDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes), new Variant(compareFields), new Variant(compareComments), new Variant(compareMoves), originalAuthor, revisedAuthor, new Variant(formatFrom)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @param compareFields an input-parameter of type boolean
	 * @param compareComments an input-parameter of type boolean
	 * @param compareMoves an input-parameter of type boolean
	 * @param originalAuthor an input-parameter of type String
	 * @param revisedAuthor an input-parameter of type String
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes, boolean compareFields, boolean compareComments, boolean compareMoves, String originalAuthor, String revisedAuthor) {
		return new Document(Dispatch.callN(this, "MergeDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes), new Variant(compareFields), new Variant(compareComments), new Variant(compareMoves), originalAuthor, revisedAuthor}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @param compareFields an input-parameter of type boolean
	 * @param compareComments an input-parameter of type boolean
	 * @param compareMoves an input-parameter of type boolean
	 * @param originalAuthor an input-parameter of type String
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes, boolean compareFields, boolean compareComments, boolean compareMoves, String originalAuthor) {
		return new Document(Dispatch.callN(this, "MergeDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes), new Variant(compareFields), new Variant(compareComments), new Variant(compareMoves), originalAuthor}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @param compareFields an input-parameter of type boolean
	 * @param compareComments an input-parameter of type boolean
	 * @param compareMoves an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes, boolean compareFields, boolean compareComments, boolean compareMoves) {
		return new Document(Dispatch.callN(this, "MergeDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes), new Variant(compareFields), new Variant(compareComments), new Variant(compareMoves)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @param compareFields an input-parameter of type boolean
	 * @param compareComments an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes, boolean compareFields, boolean compareComments) {
		return new Document(Dispatch.callN(this, "MergeDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes), new Variant(compareFields), new Variant(compareComments)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @param compareFields an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes, boolean compareFields) {
		return new Document(Dispatch.callN(this, "MergeDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes), new Variant(compareFields)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes) {
		return new Document(Dispatch.callN(this, "MergeDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes) {
		return new Document(Dispatch.callN(this, "MergeDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders) {
		return new Document(Dispatch.callN(this, "MergeDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables) {
		return new Document(Dispatch.call(this, "MergeDocuments", originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace) {
		return new Document(Dispatch.call(this, "MergeDocuments", originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges) {
		return new Document(Dispatch.call(this, "MergeDocuments", originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting) {
		return new Document(Dispatch.call(this, "MergeDocuments", originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity) {
		return new Document(Dispatch.call(this, "MergeDocuments", originalDocument, revisedDocument, new Variant(destination), new Variant(granularity)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination) {
		return new Document(Dispatch.call(this, "MergeDocuments", originalDocument, revisedDocument, new Variant(destination)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument) {
		return new Document(Dispatch.call(this, "MergeDocuments", originalDocument, revisedDocument).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param originalDocument an input-parameter of type Document
	 * @param revisedDocument an input-parameter of type Document
	 * @param destination an input-parameter of type int
	 * @param granularity an input-parameter of type int
	 * @param compareFormatting an input-parameter of type boolean
	 * @param compareCaseChanges an input-parameter of type boolean
	 * @param compareWhitespace an input-parameter of type boolean
	 * @param compareTables an input-parameter of type boolean
	 * @param compareHeaders an input-parameter of type boolean
	 * @param compareFootnotes an input-parameter of type boolean
	 * @param compareTextboxes an input-parameter of type boolean
	 * @param compareFields an input-parameter of type boolean
	 * @param compareComments an input-parameter of type boolean
	 * @param compareMoves an input-parameter of type boolean
	 * @param originalAuthor an input-parameter of type String
	 * @param revisedAuthor an input-parameter of type String
	 * @param formatFrom an input-parameter of type int
	 * @return the result is of type Document
	 */
	public Document mergeDocuments(Document originalDocument, Document revisedDocument, int destination, int granularity, boolean compareFormatting, boolean compareCaseChanges, boolean compareWhitespace, boolean compareTables, boolean compareHeaders, boolean compareFootnotes, boolean compareTextboxes, boolean compareFields, boolean compareComments, boolean compareMoves, String originalAuthor, String revisedAuthor, int formatFrom) {
		Document result_of_MergeDocuments = new Document(Dispatch.callN(this, "MergeDocuments", new Object[] { originalDocument, revisedDocument, new Variant(destination), new Variant(granularity), new Variant(compareFormatting), new Variant(compareCaseChanges), new Variant(compareWhitespace), new Variant(compareTables), new Variant(compareHeaders), new Variant(compareFootnotes), new Variant(compareTextboxes), new Variant(compareFields), new Variant(compareComments), new Variant(compareMoves), originalAuthor, revisedAuthor, new Variant(formatFrom)}).toDispatch());


		return result_of_MergeDocuments;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Bibliography
	 */
	public Bibliography getBibliography() {
		return new Bibliography(Dispatch.get(this, "Bibliography").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowStylePreviews() {
		return Dispatch.get(this, "ShowStylePreviews").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showStylePreviews an input-parameter of type boolean
	 */
	public void setShowStylePreviews(boolean showStylePreviews) {
		Dispatch.put(this, "ShowStylePreviews", new Variant(showStylePreviews));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getRestrictLinkedStyles() {
		return Dispatch.get(this, "RestrictLinkedStyles").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param restrictLinkedStyles an input-parameter of type boolean
	 */
	public void setRestrictLinkedStyles(boolean restrictLinkedStyles) {
		Dispatch.put(this, "RestrictLinkedStyles", new Variant(restrictLinkedStyles));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMathAutoCorrect
	 */
	public OMathAutoCorrect getOMathAutoCorrect() {
		return new OMathAutoCorrect(Dispatch.get(this, "OMathAutoCorrect").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisplayDocumentInformationPanel() {
		return Dispatch.get(this, "DisplayDocumentInformationPanel").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param displayDocumentInformationPanel an input-parameter of type boolean
	 */
	public void setDisplayDocumentInformationPanel(boolean displayDocumentInformationPanel) {
		Dispatch.put(this, "DisplayDocumentInformationPanel", new Variant(displayDocumentInformationPanel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type IAssistance
	 */
	public IAssistance getAssistance() {
		return new IAssistance(Dispatch.get(this, "Assistance").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getOpenAttachmentsInFullScreen() {
		return Dispatch.get(this, "OpenAttachmentsInFullScreen").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param openAttachmentsInFullScreen an input-parameter of type boolean
	 */
	public void setOpenAttachmentsInFullScreen(boolean openAttachmentsInFullScreen) {
		Dispatch.put(this, "OpenAttachmentsInFullScreen", new Variant(openAttachmentsInFullScreen));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getActiveEncryptionSession() {
		return Dispatch.get(this, "ActiveEncryptionSession").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDontResetInsertionPointProperties() {
		return Dispatch.get(this, "DontResetInsertionPointProperties").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dontResetInsertionPointProperties an input-parameter of type boolean
	 */
	public void setDontResetInsertionPointProperties(boolean dontResetInsertionPointProperties) {
		Dispatch.put(this, "DontResetInsertionPointProperties", new Variant(dontResetInsertionPointProperties));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SmartArtLayouts
	 */
	public SmartArtLayouts getSmartArtLayouts() {
		return new SmartArtLayouts(Dispatch.get(this, "SmartArtLayouts").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SmartArtQuickStyles
	 */
	public SmartArtQuickStyles getSmartArtQuickStyles() {
		return new SmartArtQuickStyles(Dispatch.get(this, "SmartArtQuickStyles").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SmartArtColors
	 */
	public SmartArtColors getSmartArtColors() {
		return new SmartArtColors(Dispatch.get(this, "SmartArtColors").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param localDocument an input-parameter of type Document
	 * @param serverDocument an input-parameter of type Document
	 * @param baseDocument an input-parameter of type Document
	 * @param favorSource an input-parameter of type boolean
	 */
	public void threeWayMerge(Document localDocument, Document serverDocument, Document baseDocument, boolean favorSource) {
		Dispatch.call(this, "ThreeWayMerge", localDocument, serverDocument, baseDocument, new Variant(favorSource));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void dummy4() {
		Dispatch.call(this, "Dummy4");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type UndoRecord
	 */
	public UndoRecord getUndoRecord() {
		return new UndoRecord(Dispatch.get(this, "UndoRecord").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type PickerDialog
	 */
	public PickerDialog getPickerDialog() {
		return new PickerDialog(Dispatch.get(this, "PickerDialog").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ProtectedViewWindows
	 */
	public ProtectedViewWindows getProtectedViewWindows() {
		return new ProtectedViewWindows(Dispatch.get(this, "ProtectedViewWindows").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ProtectedViewWindow
	 */
	public ProtectedViewWindow getActiveProtectedViewWindow() {
		return new ProtectedViewWindow(Dispatch.get(this, "ActiveProtectedViewWindow").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIsSandboxed() {
		return Dispatch.get(this, "IsSandboxed").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoFileValidationMode
	 */
	public MsoFileValidationMode getFileValidation() {
		return new MsoFileValidationMode(Dispatch.get(this, "FileValidation").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileValidation an input-parameter of type MsoFileValidationMode
	 */
	public void setFileValidation(MsoFileValidationMode fileValidation) {
		Dispatch.put(this, "FileValidation", fileValidation);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getChartDataPointTrack() {
		return Dispatch.get(this, "ChartDataPointTrack").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param chartDataPointTrack an input-parameter of type boolean
	 */
	public void setChartDataPointTrack(boolean chartDataPointTrack) {
		Dispatch.put(this, "ChartDataPointTrack", new Variant(chartDataPointTrack));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowAnimation() {
		return Dispatch.get(this, "ShowAnimation").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showAnimation an input-parameter of type boolean
	 */
	public void setShowAnimation(boolean showAnimation) {
		Dispatch.put(this, "ShowAnimation", new Variant(showAnimation));
	}

}
