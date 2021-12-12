/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class _Global extends Dispatch {

	public static final String componentName = "Word._Global";

	public _Global() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public _Global(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public _Global(String compName) {
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
	 * @return the result is of type FileConverters
	 */
	public FileConverters getFileConverters() {
		return new FileConverters(Dispatch.get(this, "FileConverters").toDispatch());
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
	 * @return the result is of type Tasks
	 */
	public Tasks getTasks() {
		return new Tasks(Dispatch.get(this, "Tasks").toDispatch());
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
	 * @return the result is of type CommandBars
	 */
	public CommandBars getCommandBars() {
		return new CommandBars(Dispatch.get(this, "CommandBars").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param word an input-parameter of type String
	 * @param languageID an input-parameter of type Variant
	 * @return the result is of type SynonymInfo
	 */
	public SynonymInfo getSynonymInfo(String word, Variant languageID) {
		return new SynonymInfo(Dispatch.call(this, "SynonymInfo", word, languageID).toDispatch());
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
	 * @param commandParameter an input-parameter of type Variant
	 * @return the result is of type KeysBoundTo
	 */
	public KeysBoundTo getKeysBoundTo(int keyCategory, String command, Variant commandParameter) {
		return new KeysBoundTo(Dispatch.call(this, "KeysBoundTo", new Variant(keyCategory), command, commandParameter).toDispatch());
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
	 * @param keyCode2 an input-parameter of type Variant
	 * @return the result is of type KeyBinding
	 */
	public KeyBinding getFindKey(int keyCode, Variant keyCode2) {
		return new KeyBinding(Dispatch.call(this, "FindKey", new Variant(keyCode), keyCode2).toDispatch());
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
	 * @return the result is of type Options
	 */
	public Options getOptions() {
		return new Options(Dispatch.get(this, "Options").toDispatch());
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
	 * @param statusBar an input-parameter of type String
	 */
	public void setStatusBar(String statusBar) {
		Dispatch.put(this, "StatusBar", statusBar);
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
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param times an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean repeat(Variant times) {
		boolean result_of_Repeat = Dispatch.call(this, "Repeat", times).changeType(Variant.VariantBoolean).getBoolean();


		return result_of_Repeat;
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
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param arg1 an input-parameter of type int
	 * @param arg2 an input-parameter of type Variant
	 * @param arg3 an input-parameter of type Variant
	 * @param arg4 an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int buildKeyCode(int arg1, Variant arg2, Variant arg3, Variant arg4) {
		int result_of_BuildKeyCode = Dispatch.call(this, "BuildKeyCode", new Variant(arg1), arg2, arg3, arg4).changeType(Variant.VariantInt).getInt();


		return result_of_BuildKeyCode;
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
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param keyCode an input-parameter of type int
	 * @param keyCode2 an input-parameter of type Variant
	 * @return the result is of type String
	 */
	public String keyString(int keyCode, Variant keyCode2) {
		String result_of_KeyString = Dispatch.call(this, "KeyString", new Variant(keyCode), keyCode2).toString();


		return result_of_KeyString;
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
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
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
		boolean result_of_CheckSpelling = Dispatch.callN(this, "CheckSpelling", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9, customDictionary10}).changeType(Variant.VariantBoolean).getBoolean();


		return result_of_CheckSpelling;
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
	 * @param customDictionary10 an input-parameter of type Variant
	 * @return the result is of type SpellingSuggestions
	 */
	public SpellingSuggestions getSpellingSuggestions(String word, Variant customDictionary, Variant ignoreUppercase, Variant mainDictionary, Variant suggestionMode, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9, Variant customDictionary10) {
		return new SpellingSuggestions(Dispatch.callN(this, "GetSpellingSuggestions", new Object[] { word, customDictionary, ignoreUppercase, mainDictionary, suggestionMode, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9, customDictionary10}).toDispatch());
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
	 * @param helpType an input-parameter of type Variant
	 */
	public void help(Variant helpType) {
		Dispatch.call(this, "Help", helpType);
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
	 * @param string an input-parameter of type String
	 * @return the result is of type String
	 */
	public String cleanString(String string) {
		return Dispatch.call(this, "CleanString", string).toString();
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
	 * @return the result is of type LanguageSettings
	 */
	public LanguageSettings getLanguageSettings() {
		return new LanguageSettings(Dispatch.get(this, "LanguageSettings").toDispatch());
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
	 * @return the result is of type AutoCorrect
	 */
	public AutoCorrect getAutoCorrectEmail() {
		return new AutoCorrect(Dispatch.get(this, "AutoCorrectEmail").toDispatch());
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

}
