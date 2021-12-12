/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class _Document extends Dispatch {

	public static final String componentName = "Word._Document";

	public _Document() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public _Document(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public _Document(String compName) {
		super(compName);
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
	 * @return the result is of type Object
	 */
	public Object getBuiltInDocumentProperties() {
		return Dispatch.get(this, "BuiltInDocumentProperties");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getCustomDocumentProperties() {
		return Dispatch.get(this, "CustomDocumentProperties");
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
	 * @return the result is of type Bookmarks
	 */
	public Bookmarks getBookmarks() {
		return new Bookmarks(Dispatch.get(this, "Bookmarks").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Tables
	 */
	public Tables getTables() {
		return new Tables(Dispatch.get(this, "Tables").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Footnotes
	 */
	public Footnotes getFootnotes() {
		return new Footnotes(Dispatch.get(this, "Footnotes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Endnotes
	 */
	public Endnotes getEndnotes() {
		return new Endnotes(Dispatch.get(this, "Endnotes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Comments
	 */
	public Comments getComments() {
		return new Comments(Dispatch.get(this, "Comments").toDispatch());
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
	 * @return the result is of type boolean
	 */
	public boolean getAutoHyphenation() {
		return Dispatch.get(this, "AutoHyphenation").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoHyphenation an input-parameter of type boolean
	 */
	public void setAutoHyphenation(boolean autoHyphenation) {
		Dispatch.put(this, "AutoHyphenation", new Variant(autoHyphenation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHyphenateCaps() {
		return Dispatch.get(this, "HyphenateCaps").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hyphenateCaps an input-parameter of type boolean
	 */
	public void setHyphenateCaps(boolean hyphenateCaps) {
		Dispatch.put(this, "HyphenateCaps", new Variant(hyphenateCaps));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getHyphenationZone() {
		return Dispatch.get(this, "HyphenationZone").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hyphenationZone an input-parameter of type int
	 */
	public void setHyphenationZone(int hyphenationZone) {
		Dispatch.put(this, "HyphenationZone", new Variant(hyphenationZone));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getConsecutiveHyphensLimit() {
		return Dispatch.get(this, "ConsecutiveHyphensLimit").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param consecutiveHyphensLimit an input-parameter of type int
	 */
	public void setConsecutiveHyphensLimit(int consecutiveHyphensLimit) {
		Dispatch.put(this, "ConsecutiveHyphensLimit", new Variant(consecutiveHyphensLimit));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Sections
	 */
	public Sections getSections() {
		return new Sections(Dispatch.get(this, "Sections").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Paragraphs
	 */
	public Paragraphs getParagraphs() {
		return new Paragraphs(Dispatch.get(this, "Paragraphs").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Words
	 */
	public Words getWords() {
		return new Words(Dispatch.get(this, "Words").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Sentences
	 */
	public Sentences getSentences() {
		return new Sentences(Dispatch.get(this, "Sentences").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Characters
	 */
	public Characters getCharacters() {
		return new Characters(Dispatch.get(this, "Characters").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Fields
	 */
	public Fields getFields() {
		return new Fields(Dispatch.get(this, "Fields").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type FormFields
	 */
	public FormFields getFormFields() {
		return new FormFields(Dispatch.get(this, "FormFields").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Styles
	 */
	public Styles getStyles() {
		return new Styles(Dispatch.get(this, "Styles").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Frames
	 */
	public Frames getFrames() {
		return new Frames(Dispatch.get(this, "Frames").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TablesOfFigures
	 */
	public TablesOfFigures getTablesOfFigures() {
		return new TablesOfFigures(Dispatch.get(this, "TablesOfFigures").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variables
	 */
	public Variables getVariables() {
		return new Variables(Dispatch.get(this, "Variables").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MailMerge
	 */
	public MailMerge getMailMerge() {
		return new MailMerge(Dispatch.get(this, "MailMerge").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Envelope
	 */
	public Envelope getEnvelope() {
		return new Envelope(Dispatch.get(this, "Envelope").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFullName() {
		return Dispatch.get(this, "FullName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Revisions
	 */
	public Revisions getRevisions() {
		return new Revisions(Dispatch.get(this, "Revisions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TablesOfContents
	 */
	public TablesOfContents getTablesOfContents() {
		return new TablesOfContents(Dispatch.get(this, "TablesOfContents").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TablesOfAuthorities
	 */
	public TablesOfAuthorities getTablesOfAuthorities() {
		return new TablesOfAuthorities(Dispatch.get(this, "TablesOfAuthorities").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type PageSetup
	 */
	public PageSetup getPageSetup() {
		return new PageSetup(Dispatch.get(this, "PageSetup").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pageSetup an input-parameter of type PageSetup
	 */
	public void setPageSetup(PageSetup pageSetup) {
		Dispatch.put(this, "PageSetup", pageSetup);
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
	 * @return the result is of type boolean
	 */
	public boolean getHasRoutingSlip() {
		return Dispatch.get(this, "HasRoutingSlip").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasRoutingSlip an input-parameter of type boolean
	 */
	public void setHasRoutingSlip(boolean hasRoutingSlip) {
		Dispatch.put(this, "HasRoutingSlip", new Variant(hasRoutingSlip));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type RoutingSlip
	 */
	public RoutingSlip getRoutingSlip() {
		return new RoutingSlip(Dispatch.get(this, "RoutingSlip").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getRouted() {
		return Dispatch.get(this, "Routed").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type TablesOfAuthoritiesCategories
	 */
	public TablesOfAuthoritiesCategories getTablesOfAuthoritiesCategories() {
		return new TablesOfAuthoritiesCategories(Dispatch.get(this, "TablesOfAuthoritiesCategories").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Indexes
	 */
	public Indexes getIndexes() {
		return new Indexes(Dispatch.get(this, "Indexes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSaved() {
		return Dispatch.get(this, "Saved").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saved an input-parameter of type boolean
	 */
	public void setSaved(boolean saved) {
		Dispatch.put(this, "Saved", new Variant(saved));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range getContent() {
		return new Range(Dispatch.get(this, "Content").toDispatch());
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
	 * @return the result is of type int
	 */
	public int getKind() {
		return Dispatch.get(this, "Kind").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param kind an input-parameter of type int
	 */
	public void setKind(int kind) {
		Dispatch.put(this, "Kind", new Variant(kind));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getReadOnly() {
		return Dispatch.get(this, "ReadOnly").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Subdocuments
	 */
	public Subdocuments getSubdocuments() {
		return new Subdocuments(Dispatch.get(this, "Subdocuments").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIsMasterDocument() {
		return Dispatch.get(this, "IsMasterDocument").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getDefaultTabStop() {
		return Dispatch.get(this, "DefaultTabStop").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultTabStop an input-parameter of type float
	 */
	public void setDefaultTabStop(float defaultTabStop) {
		Dispatch.put(this, "DefaultTabStop", new Variant(defaultTabStop));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getEmbedTrueTypeFonts() {
		return Dispatch.get(this, "EmbedTrueTypeFonts").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param embedTrueTypeFonts an input-parameter of type boolean
	 */
	public void setEmbedTrueTypeFonts(boolean embedTrueTypeFonts) {
		Dispatch.put(this, "EmbedTrueTypeFonts", new Variant(embedTrueTypeFonts));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSaveFormsData() {
		return Dispatch.get(this, "SaveFormsData").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveFormsData an input-parameter of type boolean
	 */
	public void setSaveFormsData(boolean saveFormsData) {
		Dispatch.put(this, "SaveFormsData", new Variant(saveFormsData));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getReadOnlyRecommended() {
		return Dispatch.get(this, "ReadOnlyRecommended").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param readOnlyRecommended an input-parameter of type boolean
	 */
	public void setReadOnlyRecommended(boolean readOnlyRecommended) {
		Dispatch.put(this, "ReadOnlyRecommended", new Variant(readOnlyRecommended));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSaveSubsetFonts() {
		return Dispatch.get(this, "SaveSubsetFonts").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveSubsetFonts an input-parameter of type boolean
	 */
	public void setSaveSubsetFonts(boolean saveSubsetFonts) {
		Dispatch.put(this, "SaveSubsetFonts", new Variant(saveSubsetFonts));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @return the result is of type boolean
	 */
	public boolean getCompatibility(int type) {
		return Dispatch.call(this, "Compatibility", new Variant(type)).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 */
	public void setCompatibility(int type) {
		Dispatch.put(this, "Compatibility", new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type StoryRanges
	 */
	public StoryRanges getStoryRanges() {
		return new StoryRanges(Dispatch.get(this, "StoryRanges").toDispatch());
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
	 * @return the result is of type boolean
	 */
	public boolean getIsSubdocument() {
		return Dispatch.get(this, "IsSubdocument").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSaveFormat() {
		return Dispatch.get(this, "SaveFormat").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getProtectionType() {
		return Dispatch.get(this, "ProtectionType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Hyperlinks
	 */
	public Hyperlinks getHyperlinks() {
		return new Hyperlinks(Dispatch.get(this, "Hyperlinks").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Shapes
	 */
	public Shapes getShapes() {
		return new Shapes(Dispatch.get(this, "Shapes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ListTemplates
	 */
	public ListTemplates getListTemplates() {
		return new ListTemplates(Dispatch.get(this, "ListTemplates").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Lists
	 */
	public Lists getLists() {
		return new Lists(Dispatch.get(this, "Lists").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getUpdateStylesOnOpen() {
		return Dispatch.get(this, "UpdateStylesOnOpen").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param updateStylesOnOpen an input-parameter of type boolean
	 */
	public void setUpdateStylesOnOpen(boolean updateStylesOnOpen) {
		Dispatch.put(this, "UpdateStylesOnOpen", new Variant(updateStylesOnOpen));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getAttachedTemplate() {
		return Dispatch.get(this, "AttachedTemplate");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param attachedTemplate an input-parameter of type Variant
	 */
	public void setAttachedTemplate(Variant attachedTemplate) {
		Dispatch.put(this, "AttachedTemplate", attachedTemplate);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type InlineShapes
	 */
	public InlineShapes getInlineShapes() {
		return new InlineShapes(Dispatch.get(this, "InlineShapes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Shape
	 */
	public Shape getBackground() {
		return new Shape(Dispatch.get(this, "Background").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param background an input-parameter of type Shape
	 */
	public void setBackground(Shape background) {
		Dispatch.put(this, "Background", background);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getGrammarChecked() {
		return Dispatch.get(this, "GrammarChecked").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param grammarChecked an input-parameter of type boolean
	 */
	public void setGrammarChecked(boolean grammarChecked) {
		Dispatch.put(this, "GrammarChecked", new Variant(grammarChecked));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSpellingChecked() {
		return Dispatch.get(this, "SpellingChecked").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param spellingChecked an input-parameter of type boolean
	 */
	public void setSpellingChecked(boolean spellingChecked) {
		Dispatch.put(this, "SpellingChecked", new Variant(spellingChecked));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowGrammaticalErrors() {
		return Dispatch.get(this, "ShowGrammaticalErrors").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showGrammaticalErrors an input-parameter of type boolean
	 */
	public void setShowGrammaticalErrors(boolean showGrammaticalErrors) {
		Dispatch.put(this, "ShowGrammaticalErrors", new Variant(showGrammaticalErrors));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowSpellingErrors() {
		return Dispatch.get(this, "ShowSpellingErrors").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showSpellingErrors an input-parameter of type boolean
	 */
	public void setShowSpellingErrors(boolean showSpellingErrors) {
		Dispatch.put(this, "ShowSpellingErrors", new Variant(showSpellingErrors));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Versions
	 */
	public Versions getVersions() {
		return new Versions(Dispatch.get(this, "Versions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowSummary() {
		return Dispatch.get(this, "ShowSummary").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showSummary an input-parameter of type boolean
	 */
	public void setShowSummary(boolean showSummary) {
		Dispatch.put(this, "ShowSummary", new Variant(showSummary));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSummaryViewMode() {
		return Dispatch.get(this, "SummaryViewMode").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param summaryViewMode an input-parameter of type int
	 */
	public void setSummaryViewMode(int summaryViewMode) {
		Dispatch.put(this, "SummaryViewMode", new Variant(summaryViewMode));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSummaryLength() {
		return Dispatch.get(this, "SummaryLength").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param summaryLength an input-parameter of type int
	 */
	public void setSummaryLength(int summaryLength) {
		Dispatch.put(this, "SummaryLength", new Variant(summaryLength));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getPrintFractionalWidths() {
		return Dispatch.get(this, "PrintFractionalWidths").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param printFractionalWidths an input-parameter of type boolean
	 */
	public void setPrintFractionalWidths(boolean printFractionalWidths) {
		Dispatch.put(this, "PrintFractionalWidths", new Variant(printFractionalWidths));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getPrintPostScriptOverText() {
		return Dispatch.get(this, "PrintPostScriptOverText").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param printPostScriptOverText an input-parameter of type boolean
	 */
	public void setPrintPostScriptOverText(boolean printPostScriptOverText) {
		Dispatch.put(this, "PrintPostScriptOverText", new Variant(printPostScriptOverText));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Object
	 */
	public Object getContainer() {
		return Dispatch.get(this, "Container");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getPrintFormsData() {
		return Dispatch.get(this, "PrintFormsData").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param printFormsData an input-parameter of type boolean
	 */
	public void setPrintFormsData(boolean printFormsData) {
		Dispatch.put(this, "PrintFormsData", new Variant(printFormsData));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ListParagraphs
	 */
	public ListParagraphs getListParagraphs() {
		return new ListParagraphs(Dispatch.get(this, "ListParagraphs").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param password an input-parameter of type String
	 */
	public void setPassword(String password) {
		Dispatch.put(this, "Password", password);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param writePassword an input-parameter of type String
	 */
	public void setWritePassword(String writePassword) {
		Dispatch.put(this, "WritePassword", writePassword);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasPassword() {
		return Dispatch.get(this, "HasPassword").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getWriteReserved() {
		return Dispatch.get(this, "WriteReserved").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param languageID an input-parameter of type Variant
	 * @return the result is of type String
	 */
	public String getActiveWritingStyle(Variant languageID) {
		return Dispatch.call(this, "ActiveWritingStyle", languageID).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param languageID an input-parameter of type Variant
	 */
	public void setActiveWritingStyle(Variant languageID) {
		Dispatch.put(this, "ActiveWritingStyle", languageID);
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
	 * @param userControl an input-parameter of type boolean
	 */
	public void setUserControl(boolean userControl) {
		Dispatch.put(this, "UserControl", new Variant(userControl));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasMailer() {
		return Dispatch.get(this, "HasMailer").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param hasMailer an input-parameter of type boolean
	 */
	public void setHasMailer(boolean hasMailer) {
		Dispatch.put(this, "HasMailer", new Variant(hasMailer));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Mailer
	 */
	public Mailer getMailer() {
		return new Mailer(Dispatch.get(this, "Mailer").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ReadabilityStatistics
	 */
	public ReadabilityStatistics getReadabilityStatistics() {
		return new ReadabilityStatistics(Dispatch.get(this, "ReadabilityStatistics").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ProofreadingErrors
	 */
	public ProofreadingErrors getGrammaticalErrors() {
		return new ProofreadingErrors(Dispatch.get(this, "GrammaticalErrors").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ProofreadingErrors
	 */
	public ProofreadingErrors getSpellingErrors() {
		return new ProofreadingErrors(Dispatch.get(this, "SpellingErrors").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type VBProject
	 */
	public VBProject getVBProject() {
		return new VBProject(Dispatch.get(this, "VBProject").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFormsDesign() {
		return Dispatch.get(this, "FormsDesign").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String get_CodeName() {
		return Dispatch.get(this, "_CodeName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param _CodeName an input-parameter of type String
	 */
	public void set_CodeName(String _CodeName) {
		Dispatch.put(this, "_CodeName", _CodeName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getCodeName() {
		return Dispatch.get(this, "CodeName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSnapToGrid() {
		return Dispatch.get(this, "SnapToGrid").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param snapToGrid an input-parameter of type boolean
	 */
	public void setSnapToGrid(boolean snapToGrid) {
		Dispatch.put(this, "SnapToGrid", new Variant(snapToGrid));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSnapToShapes() {
		return Dispatch.get(this, "SnapToShapes").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param snapToShapes an input-parameter of type boolean
	 */
	public void setSnapToShapes(boolean snapToShapes) {
		Dispatch.put(this, "SnapToShapes", new Variant(snapToShapes));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getGridDistanceHorizontal() {
		return Dispatch.get(this, "GridDistanceHorizontal").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gridDistanceHorizontal an input-parameter of type float
	 */
	public void setGridDistanceHorizontal(float gridDistanceHorizontal) {
		Dispatch.put(this, "GridDistanceHorizontal", new Variant(gridDistanceHorizontal));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getGridDistanceVertical() {
		return Dispatch.get(this, "GridDistanceVertical").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gridDistanceVertical an input-parameter of type float
	 */
	public void setGridDistanceVertical(float gridDistanceVertical) {
		Dispatch.put(this, "GridDistanceVertical", new Variant(gridDistanceVertical));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getGridOriginHorizontal() {
		return Dispatch.get(this, "GridOriginHorizontal").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gridOriginHorizontal an input-parameter of type float
	 */
	public void setGridOriginHorizontal(float gridOriginHorizontal) {
		Dispatch.put(this, "GridOriginHorizontal", new Variant(gridOriginHorizontal));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getGridOriginVertical() {
		return Dispatch.get(this, "GridOriginVertical").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gridOriginVertical an input-parameter of type float
	 */
	public void setGridOriginVertical(float gridOriginVertical) {
		Dispatch.put(this, "GridOriginVertical", new Variant(gridOriginVertical));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getGridSpaceBetweenHorizontalLines() {
		return Dispatch.get(this, "GridSpaceBetweenHorizontalLines").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gridSpaceBetweenHorizontalLines an input-parameter of type int
	 */
	public void setGridSpaceBetweenHorizontalLines(int gridSpaceBetweenHorizontalLines) {
		Dispatch.put(this, "GridSpaceBetweenHorizontalLines", new Variant(gridSpaceBetweenHorizontalLines));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getGridSpaceBetweenVerticalLines() {
		return Dispatch.get(this, "GridSpaceBetweenVerticalLines").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gridSpaceBetweenVerticalLines an input-parameter of type int
	 */
	public void setGridSpaceBetweenVerticalLines(int gridSpaceBetweenVerticalLines) {
		Dispatch.put(this, "GridSpaceBetweenVerticalLines", new Variant(gridSpaceBetweenVerticalLines));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getGridOriginFromMargin() {
		return Dispatch.get(this, "GridOriginFromMargin").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param gridOriginFromMargin an input-parameter of type boolean
	 */
	public void setGridOriginFromMargin(boolean gridOriginFromMargin) {
		Dispatch.put(this, "GridOriginFromMargin", new Variant(gridOriginFromMargin));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getKerningByAlgorithm() {
		return Dispatch.get(this, "KerningByAlgorithm").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param kerningByAlgorithm an input-parameter of type boolean
	 */
	public void setKerningByAlgorithm(boolean kerningByAlgorithm) {
		Dispatch.put(this, "KerningByAlgorithm", new Variant(kerningByAlgorithm));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getJustificationMode() {
		return Dispatch.get(this, "JustificationMode").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param justificationMode an input-parameter of type int
	 */
	public void setJustificationMode(int justificationMode) {
		Dispatch.put(this, "JustificationMode", new Variant(justificationMode));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFarEastLineBreakLevel() {
		return Dispatch.get(this, "FarEastLineBreakLevel").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param farEastLineBreakLevel an input-parameter of type int
	 */
	public void setFarEastLineBreakLevel(int farEastLineBreakLevel) {
		Dispatch.put(this, "FarEastLineBreakLevel", new Variant(farEastLineBreakLevel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getNoLineBreakBefore() {
		return Dispatch.get(this, "NoLineBreakBefore").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param noLineBreakBefore an input-parameter of type String
	 */
	public void setNoLineBreakBefore(String noLineBreakBefore) {
		Dispatch.put(this, "NoLineBreakBefore", noLineBreakBefore);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getNoLineBreakAfter() {
		return Dispatch.get(this, "NoLineBreakAfter").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param noLineBreakAfter an input-parameter of type String
	 */
	public void setNoLineBreakAfter(String noLineBreakAfter) {
		Dispatch.put(this, "NoLineBreakAfter", noLineBreakAfter);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getTrackRevisions() {
		return Dispatch.get(this, "TrackRevisions").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param trackRevisions an input-parameter of type boolean
	 */
	public void setTrackRevisions(boolean trackRevisions) {
		Dispatch.put(this, "TrackRevisions", new Variant(trackRevisions));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getPrintRevisions() {
		return Dispatch.get(this, "PrintRevisions").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param printRevisions an input-parameter of type boolean
	 */
	public void setPrintRevisions(boolean printRevisions) {
		Dispatch.put(this, "PrintRevisions", new Variant(printRevisions));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getShowRevisions() {
		return Dispatch.get(this, "ShowRevisions").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showRevisions an input-parameter of type boolean
	 */
	public void setShowRevisions(boolean showRevisions) {
		Dispatch.put(this, "ShowRevisions", new Variant(showRevisions));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type Variant
	 * @param originalFormat an input-parameter of type Variant
	 * @param routeDocument an input-parameter of type Variant
	 */
	public void close(Variant saveChanges, Variant originalFormat, Variant routeDocument) {
		Dispatch.call(this, "Close", saveChanges, originalFormat, routeDocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type Variant
	 * @param originalFormat an input-parameter of type Variant
	 */
	public void close(Variant saveChanges, Variant originalFormat) {
		Dispatch.call(this, "Close", saveChanges, originalFormat);
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
	 * @param originalFormat an input-parameter of type Variant
	 * @param routeDocument an input-parameter of type Variant
	 */
	public void close(Variant saveChanges, Variant originalFormat, Variant routeDocument) {
		Dispatch.call(this, "Close", saveChanges, originalFormat, routeDocument);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 */
	public void saveAs2000(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter) {
		Dispatch.callN(this, "SaveAs2000", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 */
	public void saveAs2000(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData) {
		Dispatch.callN(this, "SaveAs2000", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 */
	public void saveAs2000(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat) {
		Dispatch.callN(this, "SaveAs2000", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 */
	public void saveAs2000(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts) {
		Dispatch.call(this, "SaveAs2000", fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 */
	public void saveAs2000(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended) {
		Dispatch.call(this, "SaveAs2000", fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 */
	public void saveAs2000(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword) {
		Dispatch.call(this, "SaveAs2000", fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void saveAs2000(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles) {
		Dispatch.call(this, "SaveAs2000", fileName, fileFormat, lockComments, password, addToRecentFiles);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 */
	public void saveAs2000(Variant fileName, Variant fileFormat, Variant lockComments, Variant password) {
		Dispatch.call(this, "SaveAs2000", fileName, fileFormat, lockComments, password);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 */
	public void saveAs2000(Variant fileName, Variant fileFormat, Variant lockComments) {
		Dispatch.call(this, "SaveAs2000", fileName, fileFormat, lockComments);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 */
	public void saveAs2000(Variant fileName, Variant fileFormat) {
		Dispatch.call(this, "SaveAs2000", fileName, fileFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 */
	public void saveAs2000(Variant fileName) {
		Dispatch.call(this, "SaveAs2000", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void saveAs2000() {
		Dispatch.call(this, "SaveAs2000");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 */
	public void saveAs2000(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter) {
		Dispatch.callN(this, "SaveAs2000", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void repaginate() {
		Dispatch.call(this, "Repaginate");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void fitToPages() {
		Dispatch.call(this, "FitToPages");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void manualHyphenation() {
		Dispatch.call(this, "ManualHyphenation");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void select() {
		Dispatch.call(this, "Select");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void dataForm() {
		Dispatch.call(this, "DataForm");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void route() {
		Dispatch.call(this, "Route");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void save() {
		Dispatch.call(this, "Save");
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
	 */
	public void sendMail() {
		Dispatch.call(this, "SendMail");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param start an input-parameter of type Variant
	 * @param end an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range range(Variant start, Variant end) {
		return new Range(Dispatch.call(this, "Range", start, end).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param start an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range range(Variant start) {
		return new Range(Dispatch.call(this, "Range", start).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range range() {
		return new Range(Dispatch.call(this, "Range").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param start an input-parameter of type Variant
	 * @param end an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range range(Variant start, Variant end) {
		Range result_of_Range = new Range(Dispatch.call(this, "Range", start, end).toDispatch());


		return result_of_Range;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param which an input-parameter of type int
	 */
	public void runAutoMacro(int which) {
		Dispatch.call(this, "RunAutoMacro", new Variant(which));
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
	public void printPreview() {
		Dispatch.call(this, "PrintPreview");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param what an input-parameter of type Variant
	 * @param which an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @param name an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range m_goTo(Variant what, Variant which, Variant count, Variant name) {
		return new Range(Dispatch.call(this, "GoTo", what, which, count, name).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param what an input-parameter of type Variant
	 * @param which an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range m_goTo(Variant what, Variant which, Variant count) {
		return new Range(Dispatch.call(this, "GoTo", what, which, count).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param what an input-parameter of type Variant
	 * @param which an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range m_goTo(Variant what, Variant which) {
		return new Range(Dispatch.call(this, "GoTo", what, which).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param what an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range m_goTo(Variant what) {
		return new Range(Dispatch.call(this, "GoTo", what).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range m_goTo() {
		return new Range(Dispatch.call(this, "GoTo").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param what an input-parameter of type Variant
	 * @param which an input-parameter of type Variant
	 * @param count an input-parameter of type Variant
	 * @param name an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range m_goTo(Variant what, Variant which, Variant count, Variant name) {
		Range result_of_GoTo = new Range(Dispatch.call(this, "GoTo", what, which, count, name).toDispatch());


		return result_of_GoTo;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param times an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean undo(Variant times) {
		return Dispatch.call(this, "Undo", times).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean undo() {
		return Dispatch.call(this, "Undo").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param times an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean undo(Variant times) {
		boolean result_of_Undo = Dispatch.call(this, "Undo", times).changeType(Variant.VariantBoolean).getBoolean();


		return result_of_Undo;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param times an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean redo(Variant times) {
		return Dispatch.call(this, "Redo", times).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean redo() {
		return Dispatch.call(this, "Redo").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param times an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean redo(Variant times) {
		boolean result_of_Redo = Dispatch.call(this, "Redo", times).changeType(Variant.VariantBoolean).getBoolean();


		return result_of_Redo;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param statistic an input-parameter of type int
	 * @param includeFootnotesAndEndnotes an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int computeStatistics(int statistic, Variant includeFootnotesAndEndnotes) {
		return Dispatch.call(this, "ComputeStatistics", new Variant(statistic), includeFootnotesAndEndnotes).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param statistic an input-parameter of type int
	 * @return the result is of type int
	 */
	public int computeStatistics(int statistic) {
		return Dispatch.call(this, "ComputeStatistics", new Variant(statistic)).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param statistic an input-parameter of type int
	 * @param includeFootnotesAndEndnotes an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int computeStatistics(int statistic, Variant includeFootnotesAndEndnotes) {
		int result_of_ComputeStatistics = Dispatch.call(this, "ComputeStatistics", new Variant(statistic), includeFootnotesAndEndnotes).changeType(Variant.VariantInt).getInt();


		return result_of_ComputeStatistics;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void makeCompatibilityDefault() {
		Dispatch.call(this, "MakeCompatibilityDefault");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param noReset an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 */
	public void protect2002(int type, Variant noReset, Variant password) {
		Dispatch.call(this, "Protect2002", new Variant(type), noReset, password);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param noReset an input-parameter of type Variant
	 */
	public void protect2002(int type, Variant noReset) {
		Dispatch.call(this, "Protect2002", new Variant(type), noReset);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 */
	public void protect2002(int type) {
		Dispatch.call(this, "Protect2002", new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param type an input-parameter of type int
	 * @param noReset an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 */
	public void protect2002(int type, Variant noReset, Variant password) {
		Dispatch.call(this, "Protect2002", new Variant(type), noReset, password);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param password an input-parameter of type Variant
	 */
	public void unprotect(Variant password) {
		Dispatch.call(this, "Unprotect", password);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void unprotect() {
		Dispatch.call(this, "Unprotect");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param password an input-parameter of type Variant
	 */
	public void unprotect(Variant password) {
		Dispatch.call(this, "Unprotect", password);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param option an input-parameter of type int
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 */
	public void editionOptions(int type, int option, String name, Variant format) {
		Dispatch.call(this, "EditionOptions", new Variant(type), new Variant(option), name, format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param option an input-parameter of type int
	 * @param name an input-parameter of type String
	 */
	public void editionOptions(int type, int option, String name) {
		Dispatch.call(this, "EditionOptions", new Variant(type), new Variant(option), name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param type an input-parameter of type int
	 * @param option an input-parameter of type int
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 */
	public void editionOptions(int type, int option, String name, Variant format) {
		Dispatch.call(this, "EditionOptions", new Variant(type), new Variant(option), name, format);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param letterContent an input-parameter of type Variant
	 * @param wizardMode an input-parameter of type Variant
	 */
	public void runLetterWizard(Variant letterContent, Variant wizardMode) {
		Dispatch.call(this, "RunLetterWizard", letterContent, wizardMode);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param letterContent an input-parameter of type Variant
	 */
	public void runLetterWizard(Variant letterContent) {
		Dispatch.call(this, "RunLetterWizard", letterContent);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void runLetterWizard() {
		Dispatch.call(this, "RunLetterWizard");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param letterContent an input-parameter of type Variant
	 * @param wizardMode an input-parameter of type Variant
	 */
	public void runLetterWizard(Variant letterContent, Variant wizardMode) {
		Dispatch.call(this, "RunLetterWizard", letterContent, wizardMode);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type LetterContent
	 */
	public LetterContent getLetterContent() {
		return new LetterContent(Dispatch.call(this, "GetLetterContent").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param letterContent an input-parameter of type Variant
	 */
	public void setLetterContent(Variant letterContent) {
		Dispatch.call(this, "SetLetterContent", letterContent);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param template an input-parameter of type String
	 */
	public void copyStylesFromTemplate(String template) {
		Dispatch.call(this, "CopyStylesFromTemplate", template);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void updateStyles() {
		Dispatch.call(this, "UpdateStyles");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void checkGrammar() {
		Dispatch.call(this, "CheckGrammar");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 * @param customDictionary10 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9, Variant customDictionary10) {
		Dispatch.callN(this, "CheckSpelling", new Object[] { customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9, customDictionary10});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9) {
		Dispatch.callN(this, "CheckSpelling", new Object[] { customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8) {
		Dispatch.callN(this, "CheckSpelling", new Object[] { customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7) {
		Dispatch.callN(this, "CheckSpelling", new Object[] { customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase, alwaysSuggest);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase) {
		Dispatch.call(this, "CheckSpelling", customDictionary, ignoreUppercase);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary) {
		Dispatch.call(this, "CheckSpelling", customDictionary);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void checkSpelling() {
		Dispatch.call(this, "CheckSpelling");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param customDictionary an input-parameter of type Variant
	 * @param ignoreUppercase an input-parameter of type Variant
	 * @param alwaysSuggest an input-parameter of type Variant
	 * @param customDictionary2 an input-parameter of type Variant
	 * @param customDictionary3 an input-parameter of type Variant
	 * @param customDictionary4 an input-parameter of type Variant
	 * @param customDictionary5 an input-parameter of type Variant
	 * @param customDictionary6 an input-parameter of type Variant
	 * @param customDictionary7 an input-parameter of type Variant
	 * @param customDictionary8 an input-parameter of type Variant
	 * @param customDictionary9 an input-parameter of type Variant
	 * @param customDictionary10 an input-parameter of type Variant
	 */
	public void checkSpelling(Variant customDictionary, Variant ignoreUppercase, Variant alwaysSuggest, Variant customDictionary2, Variant customDictionary3, Variant customDictionary4, Variant customDictionary5, Variant customDictionary6, Variant customDictionary7, Variant customDictionary8, Variant customDictionary9, Variant customDictionary10) {
		Dispatch.callN(this, "CheckSpelling", new Object[] { customDictionary, ignoreUppercase, alwaysSuggest, customDictionary2, customDictionary3, customDictionary4, customDictionary5, customDictionary6, customDictionary7, customDictionary8, customDictionary9, customDictionary10});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @param newWindow an input-parameter of type Variant
	 * @param addHistory an input-parameter of type Variant
	 * @param extraInfo an input-parameter of type Variant
	 * @param method an input-parameter of type Variant
	 * @param headerInfo an input-parameter of type Variant
	 */
	public void followHyperlink(Variant address, Variant subAddress, Variant newWindow, Variant addHistory, Variant extraInfo, Variant method, Variant headerInfo) {
		Dispatch.call(this, "FollowHyperlink", address, subAddress, newWindow, addHistory, extraInfo, method, headerInfo);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @param newWindow an input-parameter of type Variant
	 * @param addHistory an input-parameter of type Variant
	 * @param extraInfo an input-parameter of type Variant
	 * @param method an input-parameter of type Variant
	 */
	public void followHyperlink(Variant address, Variant subAddress, Variant newWindow, Variant addHistory, Variant extraInfo, Variant method) {
		Dispatch.call(this, "FollowHyperlink", address, subAddress, newWindow, addHistory, extraInfo, method);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @param newWindow an input-parameter of type Variant
	 * @param addHistory an input-parameter of type Variant
	 * @param extraInfo an input-parameter of type Variant
	 */
	public void followHyperlink(Variant address, Variant subAddress, Variant newWindow, Variant addHistory, Variant extraInfo) {
		Dispatch.call(this, "FollowHyperlink", address, subAddress, newWindow, addHistory, extraInfo);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @param newWindow an input-parameter of type Variant
	 * @param addHistory an input-parameter of type Variant
	 */
	public void followHyperlink(Variant address, Variant subAddress, Variant newWindow, Variant addHistory) {
		Dispatch.call(this, "FollowHyperlink", address, subAddress, newWindow, addHistory);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @param newWindow an input-parameter of type Variant
	 */
	public void followHyperlink(Variant address, Variant subAddress, Variant newWindow) {
		Dispatch.call(this, "FollowHyperlink", address, subAddress, newWindow);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 */
	public void followHyperlink(Variant address, Variant subAddress) {
		Dispatch.call(this, "FollowHyperlink", address, subAddress);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param address an input-parameter of type Variant
	 */
	public void followHyperlink(Variant address) {
		Dispatch.call(this, "FollowHyperlink", address);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void followHyperlink() {
		Dispatch.call(this, "FollowHyperlink");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param address an input-parameter of type Variant
	 * @param subAddress an input-parameter of type Variant
	 * @param newWindow an input-parameter of type Variant
	 * @param addHistory an input-parameter of type Variant
	 * @param extraInfo an input-parameter of type Variant
	 * @param method an input-parameter of type Variant
	 * @param headerInfo an input-parameter of type Variant
	 */
	public void followHyperlink(Variant address, Variant subAddress, Variant newWindow, Variant addHistory, Variant extraInfo, Variant method, Variant headerInfo) {
		Dispatch.call(this, "FollowHyperlink", address, subAddress, newWindow, addHistory, extraInfo, method, headerInfo);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void addToFavorites() {
		Dispatch.call(this, "AddToFavorites");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void reload() {
		Dispatch.call(this, "Reload");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param length an input-parameter of type Variant
	 * @param mode an input-parameter of type Variant
	 * @param updateProperties an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range autoSummarize(Variant length, Variant mode, Variant updateProperties) {
		return new Range(Dispatch.call(this, "AutoSummarize", length, mode, updateProperties).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param length an input-parameter of type Variant
	 * @param mode an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range autoSummarize(Variant length, Variant mode) {
		return new Range(Dispatch.call(this, "AutoSummarize", length, mode).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param length an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range autoSummarize(Variant length) {
		return new Range(Dispatch.call(this, "AutoSummarize", length).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Range
	 */
	public Range autoSummarize() {
		return new Range(Dispatch.call(this, "AutoSummarize").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param length an input-parameter of type Variant
	 * @param mode an input-parameter of type Variant
	 * @param updateProperties an input-parameter of type Variant
	 * @return the result is of type Range
	 */
	public Range autoSummarize(Variant length, Variant mode, Variant updateProperties) {
		Range result_of_AutoSummarize = new Range(Dispatch.call(this, "AutoSummarize", length, mode, updateProperties).toDispatch());


		return result_of_AutoSummarize;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 */
	public void removeNumbers(Variant numberType) {
		Dispatch.call(this, "RemoveNumbers", numberType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void removeNumbers() {
		Dispatch.call(this, "RemoveNumbers");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 */
	public void removeNumbers(Variant numberType) {
		Dispatch.call(this, "RemoveNumbers", numberType);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 */
	public void convertNumbersToText(Variant numberType) {
		Dispatch.call(this, "ConvertNumbersToText", numberType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void convertNumbersToText() {
		Dispatch.call(this, "ConvertNumbersToText");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 */
	public void convertNumbersToText(Variant numberType) {
		Dispatch.call(this, "ConvertNumbersToText", numberType);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 * @param level an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int countNumberedItems(Variant numberType, Variant level) {
		return Dispatch.call(this, "CountNumberedItems", numberType, level).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int countNumberedItems(Variant numberType) {
		return Dispatch.call(this, "CountNumberedItems", numberType).changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int countNumberedItems() {
		return Dispatch.call(this, "CountNumberedItems").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param numberType an input-parameter of type Variant
	 * @param level an input-parameter of type Variant
	 * @return the result is of type int
	 */
	public int countNumberedItems(Variant numberType, Variant level) {
		int result_of_CountNumberedItems = Dispatch.call(this, "CountNumberedItems", numberType, level).changeType(Variant.VariantInt).getInt();


		return result_of_CountNumberedItems;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void post() {
		Dispatch.call(this, "Post");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void toggleFormsDesign() {
		Dispatch.call(this, "ToggleFormsDesign");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void compare2000(String name) {
		Dispatch.call(this, "Compare2000", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void updateSummaryProperties() {
		Dispatch.call(this, "UpdateSummaryProperties");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param referenceType an input-parameter of type Variant
	 * @return the result is of type Variant
	 */
	public Variant getCrossReferenceItems(Variant referenceType) {
		return Dispatch.call(this, "GetCrossReferenceItems", referenceType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void autoFormat() {
		Dispatch.call(this, "AutoFormat");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void viewCode() {
		Dispatch.call(this, "ViewCode");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void viewPropertyBrowser() {
		Dispatch.call(this, "ViewPropertyBrowser");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void forwardMailer() {
		Dispatch.call(this, "ForwardMailer");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void reply() {
		Dispatch.call(this, "Reply");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void replyAll() {
		Dispatch.call(this, "ReplyAll");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileFormat an input-parameter of type Variant
	 * @param priority an input-parameter of type Variant
	 */
	public void sendMailer(Variant fileFormat, Variant priority) {
		Dispatch.call(this, "SendMailer", fileFormat, priority);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileFormat an input-parameter of type Variant
	 */
	public void sendMailer(Variant fileFormat) {
		Dispatch.call(this, "SendMailer", fileFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sendMailer() {
		Dispatch.call(this, "SendMailer");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileFormat an input-parameter of type Variant
	 * @param priority an input-parameter of type Variant
	 */
	public void sendMailer(Variant fileFormat, Variant priority) {
		Dispatch.call(this, "SendMailer", fileFormat, priority);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void undoClear() {
		Dispatch.call(this, "UndoClear");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void presentIt() {
		Dispatch.call(this, "PresentIt");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param address an input-parameter of type String
	 * @param subject an input-parameter of type Variant
	 */
	public void sendFax(String address, Variant subject) {
		Dispatch.call(this, "SendFax", address, subject);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param address an input-parameter of type String
	 */
	public void sendFax(String address) {
		Dispatch.call(this, "SendFax", address);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param address an input-parameter of type String
	 * @param subject an input-parameter of type Variant
	 */
	public void sendFax(String address, Variant subject) {
		Dispatch.call(this, "SendFax", address, subject);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void merge2000(String fileName) {
		Dispatch.call(this, "Merge2000", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void closePrintPreview() {
		Dispatch.call(this, "ClosePrintPreview");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void checkConsistency() {
		Dispatch.call(this, "CheckConsistency");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateFormat an input-parameter of type String
	 * @param includeHeaderFooter an input-parameter of type boolean
	 * @param pageDesign an input-parameter of type String
	 * @param letterStyle an input-parameter of type int
	 * @param letterhead an input-parameter of type boolean
	 * @param letterheadLocation an input-parameter of type int
	 * @param letterheadSize an input-parameter of type float
	 * @param recipientName an input-parameter of type String
	 * @param recipientAddress an input-parameter of type String
	 * @param salutation an input-parameter of type String
	 * @param salutationType an input-parameter of type int
	 * @param recipientReference an input-parameter of type String
	 * @param mailingInstructions an input-parameter of type String
	 * @param attentionLine an input-parameter of type String
	 * @param subject an input-parameter of type String
	 * @param cCList an input-parameter of type String
	 * @param returnAddress an input-parameter of type String
	 * @param senderName an input-parameter of type String
	 * @param closing an input-parameter of type String
	 * @param senderCompany an input-parameter of type String
	 * @param senderJobTitle an input-parameter of type String
	 * @param senderInitials an input-parameter of type String
	 * @param enclosureNumber an input-parameter of type int
	 * @param infoBlock an input-parameter of type Variant
	 * @param recipientCode an input-parameter of type Variant
	 * @param recipientGender an input-parameter of type Variant
	 * @param returnAddressShortForm an input-parameter of type Variant
	 * @param senderCity an input-parameter of type Variant
	 * @param senderCode an input-parameter of type Variant
	 * @param senderGender an input-parameter of type Variant
	 * @param senderReference an input-parameter of type Variant
	 * @return the result is of type LetterContent
	 */
	public LetterContent createLetterContent(String dateFormat, boolean includeHeaderFooter, String pageDesign, int letterStyle, boolean letterhead, int letterheadLocation, float letterheadSize, String recipientName, String recipientAddress, String salutation, int salutationType, String recipientReference, String mailingInstructions, String attentionLine, String subject, String cCList, String returnAddress, String senderName, String closing, String senderCompany, String senderJobTitle, String senderInitials, int enclosureNumber, Variant infoBlock, Variant recipientCode, Variant recipientGender, Variant returnAddressShortForm, Variant senderCity, Variant senderCode, Variant senderGender, Variant senderReference) {
		return new LetterContent(Dispatch.callN(this, "CreateLetterContent", new Object[] { dateFormat, new Variant(includeHeaderFooter), pageDesign, new Variant(letterStyle), new Variant(letterhead), new Variant(letterheadLocation), new Variant(letterheadSize), recipientName, recipientAddress, salutation, new Variant(salutationType), recipientReference, mailingInstructions, attentionLine, subject, cCList, returnAddress, senderName, closing, senderCompany, senderJobTitle, senderInitials, new Variant(enclosureNumber), infoBlock, recipientCode, recipientGender, returnAddressShortForm, senderCity, senderCode, senderGender, senderReference}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateFormat an input-parameter of type String
	 * @param includeHeaderFooter an input-parameter of type boolean
	 * @param pageDesign an input-parameter of type String
	 * @param letterStyle an input-parameter of type int
	 * @param letterhead an input-parameter of type boolean
	 * @param letterheadLocation an input-parameter of type int
	 * @param letterheadSize an input-parameter of type float
	 * @param recipientName an input-parameter of type String
	 * @param recipientAddress an input-parameter of type String
	 * @param salutation an input-parameter of type String
	 * @param salutationType an input-parameter of type int
	 * @param recipientReference an input-parameter of type String
	 * @param mailingInstructions an input-parameter of type String
	 * @param attentionLine an input-parameter of type String
	 * @param subject an input-parameter of type String
	 * @param cCList an input-parameter of type String
	 * @param returnAddress an input-parameter of type String
	 * @param senderName an input-parameter of type String
	 * @param closing an input-parameter of type String
	 * @param senderCompany an input-parameter of type String
	 * @param senderJobTitle an input-parameter of type String
	 * @param senderInitials an input-parameter of type String
	 * @param enclosureNumber an input-parameter of type int
	 * @param infoBlock an input-parameter of type Variant
	 * @param recipientCode an input-parameter of type Variant
	 * @param recipientGender an input-parameter of type Variant
	 * @param returnAddressShortForm an input-parameter of type Variant
	 * @param senderCity an input-parameter of type Variant
	 * @param senderCode an input-parameter of type Variant
	 * @param senderGender an input-parameter of type Variant
	 * @return the result is of type LetterContent
	 */
	public LetterContent createLetterContent(String dateFormat, boolean includeHeaderFooter, String pageDesign, int letterStyle, boolean letterhead, int letterheadLocation, float letterheadSize, String recipientName, String recipientAddress, String salutation, int salutationType, String recipientReference, String mailingInstructions, String attentionLine, String subject, String cCList, String returnAddress, String senderName, String closing, String senderCompany, String senderJobTitle, String senderInitials, int enclosureNumber, Variant infoBlock, Variant recipientCode, Variant recipientGender, Variant returnAddressShortForm, Variant senderCity, Variant senderCode, Variant senderGender) {
		return new LetterContent(Dispatch.callN(this, "CreateLetterContent", new Object[] { dateFormat, new Variant(includeHeaderFooter), pageDesign, new Variant(letterStyle), new Variant(letterhead), new Variant(letterheadLocation), new Variant(letterheadSize), recipientName, recipientAddress, salutation, new Variant(salutationType), recipientReference, mailingInstructions, attentionLine, subject, cCList, returnAddress, senderName, closing, senderCompany, senderJobTitle, senderInitials, new Variant(enclosureNumber), infoBlock, recipientCode, recipientGender, returnAddressShortForm, senderCity, senderCode, senderGender}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateFormat an input-parameter of type String
	 * @param includeHeaderFooter an input-parameter of type boolean
	 * @param pageDesign an input-parameter of type String
	 * @param letterStyle an input-parameter of type int
	 * @param letterhead an input-parameter of type boolean
	 * @param letterheadLocation an input-parameter of type int
	 * @param letterheadSize an input-parameter of type float
	 * @param recipientName an input-parameter of type String
	 * @param recipientAddress an input-parameter of type String
	 * @param salutation an input-parameter of type String
	 * @param salutationType an input-parameter of type int
	 * @param recipientReference an input-parameter of type String
	 * @param mailingInstructions an input-parameter of type String
	 * @param attentionLine an input-parameter of type String
	 * @param subject an input-parameter of type String
	 * @param cCList an input-parameter of type String
	 * @param returnAddress an input-parameter of type String
	 * @param senderName an input-parameter of type String
	 * @param closing an input-parameter of type String
	 * @param senderCompany an input-parameter of type String
	 * @param senderJobTitle an input-parameter of type String
	 * @param senderInitials an input-parameter of type String
	 * @param enclosureNumber an input-parameter of type int
	 * @param infoBlock an input-parameter of type Variant
	 * @param recipientCode an input-parameter of type Variant
	 * @param recipientGender an input-parameter of type Variant
	 * @param returnAddressShortForm an input-parameter of type Variant
	 * @param senderCity an input-parameter of type Variant
	 * @param senderCode an input-parameter of type Variant
	 * @return the result is of type LetterContent
	 */
	public LetterContent createLetterContent(String dateFormat, boolean includeHeaderFooter, String pageDesign, int letterStyle, boolean letterhead, int letterheadLocation, float letterheadSize, String recipientName, String recipientAddress, String salutation, int salutationType, String recipientReference, String mailingInstructions, String attentionLine, String subject, String cCList, String returnAddress, String senderName, String closing, String senderCompany, String senderJobTitle, String senderInitials, int enclosureNumber, Variant infoBlock, Variant recipientCode, Variant recipientGender, Variant returnAddressShortForm, Variant senderCity, Variant senderCode) {
		return new LetterContent(Dispatch.callN(this, "CreateLetterContent", new Object[] { dateFormat, new Variant(includeHeaderFooter), pageDesign, new Variant(letterStyle), new Variant(letterhead), new Variant(letterheadLocation), new Variant(letterheadSize), recipientName, recipientAddress, salutation, new Variant(salutationType), recipientReference, mailingInstructions, attentionLine, subject, cCList, returnAddress, senderName, closing, senderCompany, senderJobTitle, senderInitials, new Variant(enclosureNumber), infoBlock, recipientCode, recipientGender, returnAddressShortForm, senderCity, senderCode}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateFormat an input-parameter of type String
	 * @param includeHeaderFooter an input-parameter of type boolean
	 * @param pageDesign an input-parameter of type String
	 * @param letterStyle an input-parameter of type int
	 * @param letterhead an input-parameter of type boolean
	 * @param letterheadLocation an input-parameter of type int
	 * @param letterheadSize an input-parameter of type float
	 * @param recipientName an input-parameter of type String
	 * @param recipientAddress an input-parameter of type String
	 * @param salutation an input-parameter of type String
	 * @param salutationType an input-parameter of type int
	 * @param recipientReference an input-parameter of type String
	 * @param mailingInstructions an input-parameter of type String
	 * @param attentionLine an input-parameter of type String
	 * @param subject an input-parameter of type String
	 * @param cCList an input-parameter of type String
	 * @param returnAddress an input-parameter of type String
	 * @param senderName an input-parameter of type String
	 * @param closing an input-parameter of type String
	 * @param senderCompany an input-parameter of type String
	 * @param senderJobTitle an input-parameter of type String
	 * @param senderInitials an input-parameter of type String
	 * @param enclosureNumber an input-parameter of type int
	 * @param infoBlock an input-parameter of type Variant
	 * @param recipientCode an input-parameter of type Variant
	 * @param recipientGender an input-parameter of type Variant
	 * @param returnAddressShortForm an input-parameter of type Variant
	 * @param senderCity an input-parameter of type Variant
	 * @return the result is of type LetterContent
	 */
	public LetterContent createLetterContent(String dateFormat, boolean includeHeaderFooter, String pageDesign, int letterStyle, boolean letterhead, int letterheadLocation, float letterheadSize, String recipientName, String recipientAddress, String salutation, int salutationType, String recipientReference, String mailingInstructions, String attentionLine, String subject, String cCList, String returnAddress, String senderName, String closing, String senderCompany, String senderJobTitle, String senderInitials, int enclosureNumber, Variant infoBlock, Variant recipientCode, Variant recipientGender, Variant returnAddressShortForm, Variant senderCity) {
		return new LetterContent(Dispatch.callN(this, "CreateLetterContent", new Object[] { dateFormat, new Variant(includeHeaderFooter), pageDesign, new Variant(letterStyle), new Variant(letterhead), new Variant(letterheadLocation), new Variant(letterheadSize), recipientName, recipientAddress, salutation, new Variant(salutationType), recipientReference, mailingInstructions, attentionLine, subject, cCList, returnAddress, senderName, closing, senderCompany, senderJobTitle, senderInitials, new Variant(enclosureNumber), infoBlock, recipientCode, recipientGender, returnAddressShortForm, senderCity}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateFormat an input-parameter of type String
	 * @param includeHeaderFooter an input-parameter of type boolean
	 * @param pageDesign an input-parameter of type String
	 * @param letterStyle an input-parameter of type int
	 * @param letterhead an input-parameter of type boolean
	 * @param letterheadLocation an input-parameter of type int
	 * @param letterheadSize an input-parameter of type float
	 * @param recipientName an input-parameter of type String
	 * @param recipientAddress an input-parameter of type String
	 * @param salutation an input-parameter of type String
	 * @param salutationType an input-parameter of type int
	 * @param recipientReference an input-parameter of type String
	 * @param mailingInstructions an input-parameter of type String
	 * @param attentionLine an input-parameter of type String
	 * @param subject an input-parameter of type String
	 * @param cCList an input-parameter of type String
	 * @param returnAddress an input-parameter of type String
	 * @param senderName an input-parameter of type String
	 * @param closing an input-parameter of type String
	 * @param senderCompany an input-parameter of type String
	 * @param senderJobTitle an input-parameter of type String
	 * @param senderInitials an input-parameter of type String
	 * @param enclosureNumber an input-parameter of type int
	 * @param infoBlock an input-parameter of type Variant
	 * @param recipientCode an input-parameter of type Variant
	 * @param recipientGender an input-parameter of type Variant
	 * @param returnAddressShortForm an input-parameter of type Variant
	 * @return the result is of type LetterContent
	 */
	public LetterContent createLetterContent(String dateFormat, boolean includeHeaderFooter, String pageDesign, int letterStyle, boolean letterhead, int letterheadLocation, float letterheadSize, String recipientName, String recipientAddress, String salutation, int salutationType, String recipientReference, String mailingInstructions, String attentionLine, String subject, String cCList, String returnAddress, String senderName, String closing, String senderCompany, String senderJobTitle, String senderInitials, int enclosureNumber, Variant infoBlock, Variant recipientCode, Variant recipientGender, Variant returnAddressShortForm) {
		return new LetterContent(Dispatch.callN(this, "CreateLetterContent", new Object[] { dateFormat, new Variant(includeHeaderFooter), pageDesign, new Variant(letterStyle), new Variant(letterhead), new Variant(letterheadLocation), new Variant(letterheadSize), recipientName, recipientAddress, salutation, new Variant(salutationType), recipientReference, mailingInstructions, attentionLine, subject, cCList, returnAddress, senderName, closing, senderCompany, senderJobTitle, senderInitials, new Variant(enclosureNumber), infoBlock, recipientCode, recipientGender, returnAddressShortForm}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateFormat an input-parameter of type String
	 * @param includeHeaderFooter an input-parameter of type boolean
	 * @param pageDesign an input-parameter of type String
	 * @param letterStyle an input-parameter of type int
	 * @param letterhead an input-parameter of type boolean
	 * @param letterheadLocation an input-parameter of type int
	 * @param letterheadSize an input-parameter of type float
	 * @param recipientName an input-parameter of type String
	 * @param recipientAddress an input-parameter of type String
	 * @param salutation an input-parameter of type String
	 * @param salutationType an input-parameter of type int
	 * @param recipientReference an input-parameter of type String
	 * @param mailingInstructions an input-parameter of type String
	 * @param attentionLine an input-parameter of type String
	 * @param subject an input-parameter of type String
	 * @param cCList an input-parameter of type String
	 * @param returnAddress an input-parameter of type String
	 * @param senderName an input-parameter of type String
	 * @param closing an input-parameter of type String
	 * @param senderCompany an input-parameter of type String
	 * @param senderJobTitle an input-parameter of type String
	 * @param senderInitials an input-parameter of type String
	 * @param enclosureNumber an input-parameter of type int
	 * @param infoBlock an input-parameter of type Variant
	 * @param recipientCode an input-parameter of type Variant
	 * @param recipientGender an input-parameter of type Variant
	 * @return the result is of type LetterContent
	 */
	public LetterContent createLetterContent(String dateFormat, boolean includeHeaderFooter, String pageDesign, int letterStyle, boolean letterhead, int letterheadLocation, float letterheadSize, String recipientName, String recipientAddress, String salutation, int salutationType, String recipientReference, String mailingInstructions, String attentionLine, String subject, String cCList, String returnAddress, String senderName, String closing, String senderCompany, String senderJobTitle, String senderInitials, int enclosureNumber, Variant infoBlock, Variant recipientCode, Variant recipientGender) {
		return new LetterContent(Dispatch.callN(this, "CreateLetterContent", new Object[] { dateFormat, new Variant(includeHeaderFooter), pageDesign, new Variant(letterStyle), new Variant(letterhead), new Variant(letterheadLocation), new Variant(letterheadSize), recipientName, recipientAddress, salutation, new Variant(salutationType), recipientReference, mailingInstructions, attentionLine, subject, cCList, returnAddress, senderName, closing, senderCompany, senderJobTitle, senderInitials, new Variant(enclosureNumber), infoBlock, recipientCode, recipientGender}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateFormat an input-parameter of type String
	 * @param includeHeaderFooter an input-parameter of type boolean
	 * @param pageDesign an input-parameter of type String
	 * @param letterStyle an input-parameter of type int
	 * @param letterhead an input-parameter of type boolean
	 * @param letterheadLocation an input-parameter of type int
	 * @param letterheadSize an input-parameter of type float
	 * @param recipientName an input-parameter of type String
	 * @param recipientAddress an input-parameter of type String
	 * @param salutation an input-parameter of type String
	 * @param salutationType an input-parameter of type int
	 * @param recipientReference an input-parameter of type String
	 * @param mailingInstructions an input-parameter of type String
	 * @param attentionLine an input-parameter of type String
	 * @param subject an input-parameter of type String
	 * @param cCList an input-parameter of type String
	 * @param returnAddress an input-parameter of type String
	 * @param senderName an input-parameter of type String
	 * @param closing an input-parameter of type String
	 * @param senderCompany an input-parameter of type String
	 * @param senderJobTitle an input-parameter of type String
	 * @param senderInitials an input-parameter of type String
	 * @param enclosureNumber an input-parameter of type int
	 * @param infoBlock an input-parameter of type Variant
	 * @param recipientCode an input-parameter of type Variant
	 * @return the result is of type LetterContent
	 */
	public LetterContent createLetterContent(String dateFormat, boolean includeHeaderFooter, String pageDesign, int letterStyle, boolean letterhead, int letterheadLocation, float letterheadSize, String recipientName, String recipientAddress, String salutation, int salutationType, String recipientReference, String mailingInstructions, String attentionLine, String subject, String cCList, String returnAddress, String senderName, String closing, String senderCompany, String senderJobTitle, String senderInitials, int enclosureNumber, Variant infoBlock, Variant recipientCode) {
		return new LetterContent(Dispatch.callN(this, "CreateLetterContent", new Object[] { dateFormat, new Variant(includeHeaderFooter), pageDesign, new Variant(letterStyle), new Variant(letterhead), new Variant(letterheadLocation), new Variant(letterheadSize), recipientName, recipientAddress, salutation, new Variant(salutationType), recipientReference, mailingInstructions, attentionLine, subject, cCList, returnAddress, senderName, closing, senderCompany, senderJobTitle, senderInitials, new Variant(enclosureNumber), infoBlock, recipientCode}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateFormat an input-parameter of type String
	 * @param includeHeaderFooter an input-parameter of type boolean
	 * @param pageDesign an input-parameter of type String
	 * @param letterStyle an input-parameter of type int
	 * @param letterhead an input-parameter of type boolean
	 * @param letterheadLocation an input-parameter of type int
	 * @param letterheadSize an input-parameter of type float
	 * @param recipientName an input-parameter of type String
	 * @param recipientAddress an input-parameter of type String
	 * @param salutation an input-parameter of type String
	 * @param salutationType an input-parameter of type int
	 * @param recipientReference an input-parameter of type String
	 * @param mailingInstructions an input-parameter of type String
	 * @param attentionLine an input-parameter of type String
	 * @param subject an input-parameter of type String
	 * @param cCList an input-parameter of type String
	 * @param returnAddress an input-parameter of type String
	 * @param senderName an input-parameter of type String
	 * @param closing an input-parameter of type String
	 * @param senderCompany an input-parameter of type String
	 * @param senderJobTitle an input-parameter of type String
	 * @param senderInitials an input-parameter of type String
	 * @param enclosureNumber an input-parameter of type int
	 * @param infoBlock an input-parameter of type Variant
	 * @return the result is of type LetterContent
	 */
	public LetterContent createLetterContent(String dateFormat, boolean includeHeaderFooter, String pageDesign, int letterStyle, boolean letterhead, int letterheadLocation, float letterheadSize, String recipientName, String recipientAddress, String salutation, int salutationType, String recipientReference, String mailingInstructions, String attentionLine, String subject, String cCList, String returnAddress, String senderName, String closing, String senderCompany, String senderJobTitle, String senderInitials, int enclosureNumber, Variant infoBlock) {
		return new LetterContent(Dispatch.callN(this, "CreateLetterContent", new Object[] { dateFormat, new Variant(includeHeaderFooter), pageDesign, new Variant(letterStyle), new Variant(letterhead), new Variant(letterheadLocation), new Variant(letterheadSize), recipientName, recipientAddress, salutation, new Variant(salutationType), recipientReference, mailingInstructions, attentionLine, subject, cCList, returnAddress, senderName, closing, senderCompany, senderJobTitle, senderInitials, new Variant(enclosureNumber), infoBlock}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateFormat an input-parameter of type String
	 * @param includeHeaderFooter an input-parameter of type boolean
	 * @param pageDesign an input-parameter of type String
	 * @param letterStyle an input-parameter of type int
	 * @param letterhead an input-parameter of type boolean
	 * @param letterheadLocation an input-parameter of type int
	 * @param letterheadSize an input-parameter of type float
	 * @param recipientName an input-parameter of type String
	 * @param recipientAddress an input-parameter of type String
	 * @param salutation an input-parameter of type String
	 * @param salutationType an input-parameter of type int
	 * @param recipientReference an input-parameter of type String
	 * @param mailingInstructions an input-parameter of type String
	 * @param attentionLine an input-parameter of type String
	 * @param subject an input-parameter of type String
	 * @param cCList an input-parameter of type String
	 * @param returnAddress an input-parameter of type String
	 * @param senderName an input-parameter of type String
	 * @param closing an input-parameter of type String
	 * @param senderCompany an input-parameter of type String
	 * @param senderJobTitle an input-parameter of type String
	 * @param senderInitials an input-parameter of type String
	 * @param enclosureNumber an input-parameter of type int
	 * @return the result is of type LetterContent
	 */
	public LetterContent createLetterContent(String dateFormat, boolean includeHeaderFooter, String pageDesign, int letterStyle, boolean letterhead, int letterheadLocation, float letterheadSize, String recipientName, String recipientAddress, String salutation, int salutationType, String recipientReference, String mailingInstructions, String attentionLine, String subject, String cCList, String returnAddress, String senderName, String closing, String senderCompany, String senderJobTitle, String senderInitials, int enclosureNumber) {
		return new LetterContent(Dispatch.callN(this, "CreateLetterContent", new Object[] { dateFormat, new Variant(includeHeaderFooter), pageDesign, new Variant(letterStyle), new Variant(letterhead), new Variant(letterheadLocation), new Variant(letterheadSize), recipientName, recipientAddress, salutation, new Variant(salutationType), recipientReference, mailingInstructions, attentionLine, subject, cCList, returnAddress, senderName, closing, senderCompany, senderJobTitle, senderInitials, new Variant(enclosureNumber)}).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param dateFormat an input-parameter of type String
	 * @param includeHeaderFooter an input-parameter of type boolean
	 * @param pageDesign an input-parameter of type String
	 * @param letterStyle an input-parameter of type int
	 * @param letterhead an input-parameter of type boolean
	 * @param letterheadLocation an input-parameter of type int
	 * @param letterheadSize an input-parameter of type float
	 * @param recipientName an input-parameter of type String
	 * @param recipientAddress an input-parameter of type String
	 * @param salutation an input-parameter of type String
	 * @param salutationType an input-parameter of type int
	 * @param recipientReference an input-parameter of type String
	 * @param mailingInstructions an input-parameter of type String
	 * @param attentionLine an input-parameter of type String
	 * @param subject an input-parameter of type String
	 * @param cCList an input-parameter of type String
	 * @param returnAddress an input-parameter of type String
	 * @param senderName an input-parameter of type String
	 * @param closing an input-parameter of type String
	 * @param senderCompany an input-parameter of type String
	 * @param senderJobTitle an input-parameter of type String
	 * @param senderInitials an input-parameter of type String
	 * @param enclosureNumber an input-parameter of type int
	 * @param infoBlock an input-parameter of type Variant
	 * @param recipientCode an input-parameter of type Variant
	 * @param recipientGender an input-parameter of type Variant
	 * @param returnAddressShortForm an input-parameter of type Variant
	 * @param senderCity an input-parameter of type Variant
	 * @param senderCode an input-parameter of type Variant
	 * @param senderGender an input-parameter of type Variant
	 * @param senderReference an input-parameter of type Variant
	 * @return the result is of type LetterContent
	 */
	public LetterContent createLetterContent(String dateFormat, boolean includeHeaderFooter, String pageDesign, int letterStyle, boolean letterhead, int letterheadLocation, float letterheadSize, String recipientName, String recipientAddress, String salutation, int salutationType, String recipientReference, String mailingInstructions, String attentionLine, String subject, String cCList, String returnAddress, String senderName, String closing, String senderCompany, String senderJobTitle, String senderInitials, int enclosureNumber, Variant infoBlock, Variant recipientCode, Variant recipientGender, Variant returnAddressShortForm, Variant senderCity, Variant senderCode, Variant senderGender, Variant senderReference) {
		LetterContent result_of_CreateLetterContent = new LetterContent(Dispatch.callN(this, "CreateLetterContent", new Object[] { dateFormat, new Variant(includeHeaderFooter), pageDesign, new Variant(letterStyle), new Variant(letterhead), new Variant(letterheadLocation), new Variant(letterheadSize), recipientName, recipientAddress, salutation, new Variant(salutationType), recipientReference, mailingInstructions, attentionLine, subject, cCList, returnAddress, senderName, closing, senderCompany, senderJobTitle, senderInitials, new Variant(enclosureNumber), infoBlock, recipientCode, recipientGender, returnAddressShortForm, senderCity, senderCode, senderGender, senderReference}).toDispatch());


		return result_of_CreateLetterContent;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void acceptAllRevisions() {
		Dispatch.call(this, "AcceptAllRevisions");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void rejectAllRevisions() {
		Dispatch.call(this, "RejectAllRevisions");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void detectLanguage() {
		Dispatch.call(this, "DetectLanguage");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void applyTheme(String name) {
		Dispatch.call(this, "ApplyTheme", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void removeTheme() {
		Dispatch.call(this, "RemoveTheme");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void webPagePreview() {
		Dispatch.call(this, "WebPagePreview");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param encoding an input-parameter of type MsoEncoding
	 */
	public void reloadAs(MsoEncoding encoding) {
		Dispatch.call(this, "ReloadAs", encoding);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getActiveTheme() {
		return Dispatch.get(this, "ActiveTheme").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getActiveThemeDisplayName() {
		return Dispatch.get(this, "ActiveThemeDisplayName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Email
	 */
	public Email getEmail() {
		return new Email(Dispatch.get(this, "Email").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Scripts
	 */
	public Scripts getScripts() {
		return new Scripts(Dispatch.get(this, "Scripts").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getLanguageDetected() {
		return Dispatch.get(this, "LanguageDetected").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param languageDetected an input-parameter of type boolean
	 */
	public void setLanguageDetected(boolean languageDetected) {
		Dispatch.put(this, "LanguageDetected", new Variant(languageDetected));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFarEastLineBreakLanguage() {
		return Dispatch.get(this, "FarEastLineBreakLanguage").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param farEastLineBreakLanguage an input-parameter of type int
	 */
	public void setFarEastLineBreakLanguage(int farEastLineBreakLanguage) {
		Dispatch.put(this, "FarEastLineBreakLanguage", new Variant(farEastLineBreakLanguage));
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
	 * @return the result is of type Variant
	 */
	public Variant getClickAndTypeParagraphStyle() {
		return Dispatch.get(this, "ClickAndTypeParagraphStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param clickAndTypeParagraphStyle an input-parameter of type Variant
	 */
	public void setClickAndTypeParagraphStyle(Variant clickAndTypeParagraphStyle) {
		Dispatch.put(this, "ClickAndTypeParagraphStyle", clickAndTypeParagraphStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type HTMLProject
	 */
	public HTMLProject getHTMLProject() {
		return new HTMLProject(Dispatch.get(this, "HTMLProject").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type WebOptions
	 */
	public WebOptions getWebOptions() {
		return new WebOptions(Dispatch.get(this, "WebOptions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoEncoding
	 */
	public MsoEncoding getOpenEncoding() {
		return new MsoEncoding(Dispatch.get(this, "OpenEncoding").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoEncoding
	 */
	public MsoEncoding getSaveEncoding() {
		return new MsoEncoding(Dispatch.get(this, "SaveEncoding").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveEncoding an input-parameter of type MsoEncoding
	 */
	public void setSaveEncoding(MsoEncoding saveEncoding) {
		Dispatch.put(this, "SaveEncoding", saveEncoding);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getOptimizeForWord97() {
		return Dispatch.get(this, "OptimizeForWord97").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param optimizeForWord97 an input-parameter of type boolean
	 */
	public void setOptimizeForWord97(boolean optimizeForWord97) {
		Dispatch.put(this, "OptimizeForWord97", new Variant(optimizeForWord97));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getVBASigned() {
		return Dispatch.get(this, "VBASigned").changeType(Variant.VariantBoolean).getBoolean();
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
	 * @param s an input-parameter of type String
	 */
	public void sblt(String s) {
		Dispatch.call(this, "sblt", s);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param codePageOrigin an input-parameter of type int
	 */
	public void convertVietDoc(int codePageOrigin) {
		Dispatch.call(this, "ConvertVietDoc", new Variant(codePageOrigin));
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
	 * @return the result is of type MsoEnvelope
	 */
	public MsoEnvelope getMailEnvelope() {
		return new MsoEnvelope(Dispatch.get(this, "MailEnvelope").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDisableFeatures() {
		return Dispatch.get(this, "DisableFeatures").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param disableFeatures an input-parameter of type boolean
	 */
	public void setDisableFeatures(boolean disableFeatures) {
		Dispatch.put(this, "DisableFeatures", new Variant(disableFeatures));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getDoNotEmbedSystemFonts() {
		return Dispatch.get(this, "DoNotEmbedSystemFonts").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param doNotEmbedSystemFonts an input-parameter of type boolean
	 */
	public void setDoNotEmbedSystemFonts(boolean doNotEmbedSystemFonts) {
		Dispatch.put(this, "DoNotEmbedSystemFonts", new Variant(doNotEmbedSystemFonts));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SignatureSet
	 */
	public SignatureSet getSignatures() {
		return new SignatureSet(Dispatch.get(this, "Signatures").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getDefaultTargetFrame() {
		return Dispatch.get(this, "DefaultTargetFrame").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultTargetFrame an input-parameter of type String
	 */
	public void setDefaultTargetFrame(String defaultTargetFrame) {
		Dispatch.put(this, "DefaultTargetFrame", defaultTargetFrame);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type HTMLDivisions
	 */
	public HTMLDivisions getHTMLDivisions() {
		return new HTMLDivisions(Dispatch.get(this, "HTMLDivisions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDisableFeaturesIntroducedAfter() {
		return Dispatch.get(this, "DisableFeaturesIntroducedAfter").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param disableFeaturesIntroducedAfter an input-parameter of type int
	 */
	public void setDisableFeaturesIntroducedAfter(int disableFeaturesIntroducedAfter) {
		Dispatch.put(this, "DisableFeaturesIntroducedAfter", new Variant(disableFeaturesIntroducedAfter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getRemovePersonalInformation() {
		return Dispatch.get(this, "RemovePersonalInformation").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param removePersonalInformation an input-parameter of type boolean
	 */
	public void setRemovePersonalInformation(boolean removePersonalInformation) {
		Dispatch.put(this, "RemovePersonalInformation", new Variant(removePersonalInformation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SmartTags
	 */
	public SmartTags getSmartTags() {
		return new SmartTags(Dispatch.get(this, "SmartTags").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 * @param compareTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 * @param ignoreAllComparisonWarnings an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void compare2002(String name, Variant authorName, Variant compareTarget, Variant detectFormatChanges, Variant ignoreAllComparisonWarnings, Variant addToRecentFiles) {
		Dispatch.call(this, "Compare2002", name, authorName, compareTarget, detectFormatChanges, ignoreAllComparisonWarnings, addToRecentFiles);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 * @param compareTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 * @param ignoreAllComparisonWarnings an input-parameter of type Variant
	 */
	public void compare2002(String name, Variant authorName, Variant compareTarget, Variant detectFormatChanges, Variant ignoreAllComparisonWarnings) {
		Dispatch.call(this, "Compare2002", name, authorName, compareTarget, detectFormatChanges, ignoreAllComparisonWarnings);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 * @param compareTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 */
	public void compare2002(String name, Variant authorName, Variant compareTarget, Variant detectFormatChanges) {
		Dispatch.call(this, "Compare2002", name, authorName, compareTarget, detectFormatChanges);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 * @param compareTarget an input-parameter of type Variant
	 */
	public void compare2002(String name, Variant authorName, Variant compareTarget) {
		Dispatch.call(this, "Compare2002", name, authorName, compareTarget);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 */
	public void compare2002(String name, Variant authorName) {
		Dispatch.call(this, "Compare2002", name, authorName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void compare2002(String name) {
		Dispatch.call(this, "Compare2002", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 * @param compareTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 * @param ignoreAllComparisonWarnings an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void compare2002(String name, Variant authorName, Variant compareTarget, Variant detectFormatChanges, Variant ignoreAllComparisonWarnings, Variant addToRecentFiles) {
		Dispatch.call(this, "Compare2002", name, authorName, compareTarget, detectFormatChanges, ignoreAllComparisonWarnings, addToRecentFiles);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type boolean
	 * @param comments an input-parameter of type Variant
	 * @param makePublic an input-parameter of type boolean
	 */
	public void checkIn(boolean saveChanges, Variant comments, boolean makePublic) {
		Dispatch.call(this, "CheckIn", new Variant(saveChanges), comments, new Variant(makePublic));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type boolean
	 * @param comments an input-parameter of type Variant
	 */
	public void checkIn(boolean saveChanges, Variant comments) {
		Dispatch.call(this, "CheckIn", new Variant(saveChanges), comments);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type boolean
	 */
	public void checkIn(boolean saveChanges) {
		Dispatch.call(this, "CheckIn", new Variant(saveChanges));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void checkIn() {
		Dispatch.call(this, "CheckIn");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param saveChanges an input-parameter of type boolean
	 * @param comments an input-parameter of type Variant
	 * @param makePublic an input-parameter of type boolean
	 */
	public void checkIn(boolean saveChanges, Variant comments, boolean makePublic) {
		Dispatch.call(this, "CheckIn", new Variant(saveChanges), comments, new Variant(makePublic));

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean canCheckin() {
		return Dispatch.call(this, "CanCheckin").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param mergeTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 * @param useFormattingFrom an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void merge(String fileName, Variant mergeTarget, Variant detectFormatChanges, Variant useFormattingFrom, Variant addToRecentFiles) {
		Dispatch.call(this, "Merge", fileName, mergeTarget, detectFormatChanges, useFormattingFrom, addToRecentFiles);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param mergeTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 * @param useFormattingFrom an input-parameter of type Variant
	 */
	public void merge(String fileName, Variant mergeTarget, Variant detectFormatChanges, Variant useFormattingFrom) {
		Dispatch.call(this, "Merge", fileName, mergeTarget, detectFormatChanges, useFormattingFrom);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param mergeTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 */
	public void merge(String fileName, Variant mergeTarget, Variant detectFormatChanges) {
		Dispatch.call(this, "Merge", fileName, mergeTarget, detectFormatChanges);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param mergeTarget an input-parameter of type Variant
	 */
	public void merge(String fileName, Variant mergeTarget) {
		Dispatch.call(this, "Merge", fileName, mergeTarget);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void merge(String fileName) {
		Dispatch.call(this, "Merge", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type String
	 * @param mergeTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 * @param useFormattingFrom an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void merge(String fileName, Variant mergeTarget, Variant detectFormatChanges, Variant useFormattingFrom, Variant addToRecentFiles) {
		Dispatch.call(this, "Merge", fileName, mergeTarget, detectFormatChanges, useFormattingFrom, addToRecentFiles);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getEmbedSmartTags() {
		return Dispatch.get(this, "EmbedSmartTags").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param embedSmartTags an input-parameter of type boolean
	 */
	public void setEmbedSmartTags(boolean embedSmartTags) {
		Dispatch.put(this, "EmbedSmartTags", new Variant(embedSmartTags));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSmartTagsAsXMLProps() {
		return Dispatch.get(this, "SmartTagsAsXMLProps").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param smartTagsAsXMLProps an input-parameter of type boolean
	 */
	public void setSmartTagsAsXMLProps(boolean smartTagsAsXMLProps) {
		Dispatch.put(this, "SmartTagsAsXMLProps", new Variant(smartTagsAsXMLProps));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoEncoding
	 */
	public MsoEncoding getTextEncoding() {
		return new MsoEncoding(Dispatch.get(this, "TextEncoding").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textEncoding an input-parameter of type MsoEncoding
	 */
	public void setTextEncoding(MsoEncoding textEncoding) {
		Dispatch.put(this, "TextEncoding", textEncoding);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getTextLineEnding() {
		return Dispatch.get(this, "TextLineEnding").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param textLineEnding an input-parameter of type int
	 */
	public void setTextLineEnding(int textLineEnding) {
		Dispatch.put(this, "TextLineEnding", new Variant(textLineEnding));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipients an input-parameter of type Variant
	 * @param subject an input-parameter of type Variant
	 * @param showMessage an input-parameter of type Variant
	 * @param includeAttachment an input-parameter of type Variant
	 */
	public void sendForReview(Variant recipients, Variant subject, Variant showMessage, Variant includeAttachment) {
		Dispatch.call(this, "SendForReview", recipients, subject, showMessage, includeAttachment);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipients an input-parameter of type Variant
	 * @param subject an input-parameter of type Variant
	 * @param showMessage an input-parameter of type Variant
	 */
	public void sendForReview(Variant recipients, Variant subject, Variant showMessage) {
		Dispatch.call(this, "SendForReview", recipients, subject, showMessage);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipients an input-parameter of type Variant
	 * @param subject an input-parameter of type Variant
	 */
	public void sendForReview(Variant recipients, Variant subject) {
		Dispatch.call(this, "SendForReview", recipients, subject);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipients an input-parameter of type Variant
	 */
	public void sendForReview(Variant recipients) {
		Dispatch.call(this, "SendForReview", recipients);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sendForReview() {
		Dispatch.call(this, "SendForReview");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param recipients an input-parameter of type Variant
	 * @param subject an input-parameter of type Variant
	 * @param showMessage an input-parameter of type Variant
	 * @param includeAttachment an input-parameter of type Variant
	 */
	public void sendForReview(Variant recipients, Variant subject, Variant showMessage, Variant includeAttachment) {
		Dispatch.call(this, "SendForReview", recipients, subject, showMessage, includeAttachment);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showMessage an input-parameter of type Variant
	 */
	public void replyWithChanges(Variant showMessage) {
		Dispatch.call(this, "ReplyWithChanges", showMessage);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void replyWithChanges() {
		Dispatch.call(this, "ReplyWithChanges");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param showMessage an input-parameter of type Variant
	 */
	public void replyWithChanges(Variant showMessage) {
		Dispatch.call(this, "ReplyWithChanges", showMessage);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void endReview() {
		Dispatch.call(this, "EndReview");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type StyleSheets
	 */
	public StyleSheets getStyleSheets() {
		return new StyleSheets(Dispatch.get(this, "StyleSheets").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getDefaultTableStyle() {
		return Dispatch.get(this, "DefaultTableStyle");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getPasswordEncryptionProvider() {
		return Dispatch.get(this, "PasswordEncryptionProvider").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getPasswordEncryptionAlgorithm() {
		return Dispatch.get(this, "PasswordEncryptionAlgorithm").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getPasswordEncryptionKeyLength() {
		return Dispatch.get(this, "PasswordEncryptionKeyLength").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getPasswordEncryptionFileProperties() {
		return Dispatch.get(this, "PasswordEncryptionFileProperties").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param passwordEncryptionProvider an input-parameter of type String
	 * @param passwordEncryptionAlgorithm an input-parameter of type String
	 * @param passwordEncryptionKeyLength an input-parameter of type int
	 * @param passwordEncryptionFileProperties an input-parameter of type Variant
	 */
	public void setPasswordEncryptionOptions(String passwordEncryptionProvider, String passwordEncryptionAlgorithm, int passwordEncryptionKeyLength, Variant passwordEncryptionFileProperties) {
		Dispatch.call(this, "SetPasswordEncryptionOptions", passwordEncryptionProvider, passwordEncryptionAlgorithm, new Variant(passwordEncryptionKeyLength), passwordEncryptionFileProperties);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param passwordEncryptionProvider an input-parameter of type String
	 * @param passwordEncryptionAlgorithm an input-parameter of type String
	 * @param passwordEncryptionKeyLength an input-parameter of type int
	 */
	public void setPasswordEncryptionOptions(String passwordEncryptionProvider, String passwordEncryptionAlgorithm, int passwordEncryptionKeyLength) {
		Dispatch.call(this, "SetPasswordEncryptionOptions", passwordEncryptionProvider, passwordEncryptionAlgorithm, new Variant(passwordEncryptionKeyLength));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param passwordEncryptionProvider an input-parameter of type String
	 * @param passwordEncryptionAlgorithm an input-parameter of type String
	 * @param passwordEncryptionKeyLength an input-parameter of type int
	 * @param passwordEncryptionFileProperties an input-parameter of type Variant
	 */
	public void setPasswordEncryptionOptions(String passwordEncryptionProvider, String passwordEncryptionAlgorithm, int passwordEncryptionKeyLength, Variant passwordEncryptionFileProperties) {
		Dispatch.call(this, "SetPasswordEncryptionOptions", passwordEncryptionProvider, passwordEncryptionAlgorithm, new Variant(passwordEncryptionKeyLength), passwordEncryptionFileProperties);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void recheckSmartTags() {
		Dispatch.call(this, "RecheckSmartTags");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void removeSmartTags() {
		Dispatch.call(this, "RemoveSmartTags");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type Variant
	 * @param setInTemplate an input-parameter of type boolean
	 */
	public void setDefaultTableStyle(Variant style, boolean setInTemplate) {
		Dispatch.call(this, "SetDefaultTableStyle", style, new Variant(setInTemplate));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void deleteAllComments() {
		Dispatch.call(this, "DeleteAllComments");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void acceptAllRevisionsShown() {
		Dispatch.call(this, "AcceptAllRevisionsShown");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void rejectAllRevisionsShown() {
		Dispatch.call(this, "RejectAllRevisionsShown");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void deleteAllCommentsShown() {
		Dispatch.call(this, "DeleteAllCommentsShown");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void resetFormFields() {
		Dispatch.call(this, "ResetFormFields");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 * @param lineEnding an input-parameter of type Variant
	 * @param addBiDiMarks an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions, Variant lineEnding, Variant addBiDiMarks) {
		Dispatch.callN(this, "SaveAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions, lineEnding, addBiDiMarks});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 * @param lineEnding an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions, Variant lineEnding) {
		Dispatch.callN(this, "SaveAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions, lineEnding});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions) {
		Dispatch.callN(this, "SaveAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks) {
		Dispatch.callN(this, "SaveAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding) {
		Dispatch.callN(this, "SaveAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter) {
		Dispatch.callN(this, "SaveAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData) {
		Dispatch.callN(this, "SaveAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat) {
		Dispatch.callN(this, "SaveAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts) {
		Dispatch.call(this, "SaveAs", fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended) {
		Dispatch.call(this, "SaveAs", fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword) {
		Dispatch.call(this, "SaveAs", fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles) {
		Dispatch.call(this, "SaveAs", fileName, fileFormat, lockComments, password, addToRecentFiles);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password) {
		Dispatch.call(this, "SaveAs", fileName, fileFormat, lockComments, password);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments) {
		Dispatch.call(this, "SaveAs", fileName, fileFormat, lockComments);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat) {
		Dispatch.call(this, "SaveAs", fileName, fileFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName) {
		Dispatch.call(this, "SaveAs", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void saveAs() {
		Dispatch.call(this, "SaveAs");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 * @param lineEnding an input-parameter of type Variant
	 * @param addBiDiMarks an input-parameter of type Variant
	 */
	public void saveAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions, Variant lineEnding, Variant addBiDiMarks) {
		Dispatch.callN(this, "SaveAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions, lineEnding, addBiDiMarks});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getEmbedLinguisticData() {
		return Dispatch.get(this, "EmbedLinguisticData").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param embedLinguisticData an input-parameter of type boolean
	 */
	public void setEmbedLinguisticData(boolean embedLinguisticData) {
		Dispatch.put(this, "EmbedLinguisticData", new Variant(embedLinguisticData));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFormattingShowFont() {
		return Dispatch.get(this, "FormattingShowFont").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formattingShowFont an input-parameter of type boolean
	 */
	public void setFormattingShowFont(boolean formattingShowFont) {
		Dispatch.put(this, "FormattingShowFont", new Variant(formattingShowFont));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFormattingShowClear() {
		return Dispatch.get(this, "FormattingShowClear").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formattingShowClear an input-parameter of type boolean
	 */
	public void setFormattingShowClear(boolean formattingShowClear) {
		Dispatch.put(this, "FormattingShowClear", new Variant(formattingShowClear));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFormattingShowParagraph() {
		return Dispatch.get(this, "FormattingShowParagraph").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formattingShowParagraph an input-parameter of type boolean
	 */
	public void setFormattingShowParagraph(boolean formattingShowParagraph) {
		Dispatch.put(this, "FormattingShowParagraph", new Variant(formattingShowParagraph));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFormattingShowNumbering() {
		return Dispatch.get(this, "FormattingShowNumbering").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formattingShowNumbering an input-parameter of type boolean
	 */
	public void setFormattingShowNumbering(boolean formattingShowNumbering) {
		Dispatch.put(this, "FormattingShowNumbering", new Variant(formattingShowNumbering));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFormattingShowFilter() {
		return Dispatch.get(this, "FormattingShowFilter").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formattingShowFilter an input-parameter of type int
	 */
	public void setFormattingShowFilter(int formattingShowFilter) {
		Dispatch.put(this, "FormattingShowFilter", new Variant(formattingShowFilter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void checkNewSmartTags() {
		Dispatch.call(this, "CheckNewSmartTags");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Permission
	 */
	public Permission getPermission() {
		return new Permission(Dispatch.get(this, "Permission").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes getXMLNodes() {
		return new XMLNodes(Dispatch.get(this, "XMLNodes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLSchemaReferences
	 */
	public XMLSchemaReferences getXMLSchemaReferences() {
		return new XMLSchemaReferences(Dispatch.get(this, "XMLSchemaReferences").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SmartDocument
	 */
	public SmartDocument getSmartDocument() {
		return new SmartDocument(Dispatch.get(this, "SmartDocument").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SharedWorkspace
	 */
	public SharedWorkspace getSharedWorkspace() {
		return new SharedWorkspace(Dispatch.get(this, "SharedWorkspace").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Sync
	 */
	public Sync getSync() {
		return new Sync(Dispatch.get(this, "Sync").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getEnforceStyle() {
		return Dispatch.get(this, "EnforceStyle").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param enforceStyle an input-parameter of type boolean
	 */
	public void setEnforceStyle(boolean enforceStyle) {
		Dispatch.put(this, "EnforceStyle", new Variant(enforceStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getAutoFormatOverride() {
		return Dispatch.get(this, "AutoFormatOverride").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param autoFormatOverride an input-parameter of type boolean
	 */
	public void setAutoFormatOverride(boolean autoFormatOverride) {
		Dispatch.put(this, "AutoFormatOverride", new Variant(autoFormatOverride));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getXMLSaveDataOnly() {
		return Dispatch.get(this, "XMLSaveDataOnly").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xMLSaveDataOnly an input-parameter of type boolean
	 */
	public void setXMLSaveDataOnly(boolean xMLSaveDataOnly) {
		Dispatch.put(this, "XMLSaveDataOnly", new Variant(xMLSaveDataOnly));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getXMLHideNamespaces() {
		return Dispatch.get(this, "XMLHideNamespaces").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xMLHideNamespaces an input-parameter of type boolean
	 */
	public void setXMLHideNamespaces(boolean xMLHideNamespaces) {
		Dispatch.put(this, "XMLHideNamespaces", new Variant(xMLHideNamespaces));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getXMLShowAdvancedErrors() {
		return Dispatch.get(this, "XMLShowAdvancedErrors").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xMLShowAdvancedErrors an input-parameter of type boolean
	 */
	public void setXMLShowAdvancedErrors(boolean xMLShowAdvancedErrors) {
		Dispatch.put(this, "XMLShowAdvancedErrors", new Variant(xMLShowAdvancedErrors));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getXMLUseXSLTWhenSaving() {
		return Dispatch.get(this, "XMLUseXSLTWhenSaving").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xMLUseXSLTWhenSaving an input-parameter of type boolean
	 */
	public void setXMLUseXSLTWhenSaving(boolean xMLUseXSLTWhenSaving) {
		Dispatch.put(this, "XMLUseXSLTWhenSaving", new Variant(xMLUseXSLTWhenSaving));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getXMLSaveThroughXSLT() {
		return Dispatch.get(this, "XMLSaveThroughXSLT").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xMLSaveThroughXSLT an input-parameter of type String
	 */
	public void setXMLSaveThroughXSLT(String xMLSaveThroughXSLT) {
		Dispatch.put(this, "XMLSaveThroughXSLT", xMLSaveThroughXSLT);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DocumentLibraryVersions
	 */
	public DocumentLibraryVersions getDocumentLibraryVersions() {
		return new DocumentLibraryVersions(Dispatch.get(this, "DocumentLibraryVersions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getReadingModeLayoutFrozen() {
		return Dispatch.get(this, "ReadingModeLayoutFrozen").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param readingModeLayoutFrozen an input-parameter of type boolean
	 */
	public void setReadingModeLayoutFrozen(boolean readingModeLayoutFrozen) {
		Dispatch.put(this, "ReadingModeLayoutFrozen", new Variant(readingModeLayoutFrozen));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getRemoveDateAndTime() {
		return Dispatch.get(this, "RemoveDateAndTime").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param removeDateAndTime an input-parameter of type boolean
	 */
	public void setRemoveDateAndTime(boolean removeDateAndTime) {
		Dispatch.put(this, "RemoveDateAndTime", new Variant(removeDateAndTime));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipients an input-parameter of type Variant
	 * @param subject an input-parameter of type Variant
	 * @param showMessage an input-parameter of type Variant
	 */
	public void sendFaxOverInternet(Variant recipients, Variant subject, Variant showMessage) {
		Dispatch.call(this, "SendFaxOverInternet", recipients, subject, showMessage);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipients an input-parameter of type Variant
	 * @param subject an input-parameter of type Variant
	 */
	public void sendFaxOverInternet(Variant recipients, Variant subject) {
		Dispatch.call(this, "SendFaxOverInternet", recipients, subject);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipients an input-parameter of type Variant
	 */
	public void sendFaxOverInternet(Variant recipients) {
		Dispatch.call(this, "SendFaxOverInternet", recipients);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void sendFaxOverInternet() {
		Dispatch.call(this, "SendFaxOverInternet");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param recipients an input-parameter of type Variant
	 * @param subject an input-parameter of type Variant
	 * @param showMessage an input-parameter of type Variant
	 */
	public void sendFaxOverInternet(Variant recipients, Variant subject, Variant showMessage) {
		Dispatch.call(this, "SendFaxOverInternet", recipients, subject, showMessage);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param path an input-parameter of type String
	 * @param dataOnly an input-parameter of type boolean
	 */
	public void transformDocument(String path, boolean dataOnly) {
		Dispatch.call(this, "TransformDocument", path, new Variant(dataOnly));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param path an input-parameter of type String
	 */
	public void transformDocument(String path) {
		Dispatch.call(this, "TransformDocument", path);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param path an input-parameter of type String
	 * @param dataOnly an input-parameter of type boolean
	 */
	public void transformDocument(String path, boolean dataOnly) {
		Dispatch.call(this, "TransformDocument", path, new Variant(dataOnly));

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param noReset an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param useIRM an input-parameter of type Variant
	 * @param enforceStyleLock an input-parameter of type Variant
	 */
	public void protect(int type, Variant noReset, Variant password, Variant useIRM, Variant enforceStyleLock) {
		Dispatch.call(this, "Protect", new Variant(type), noReset, password, useIRM, enforceStyleLock);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param noReset an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param useIRM an input-parameter of type Variant
	 */
	public void protect(int type, Variant noReset, Variant password, Variant useIRM) {
		Dispatch.call(this, "Protect", new Variant(type), noReset, password, useIRM);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param noReset an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 */
	public void protect(int type, Variant noReset, Variant password) {
		Dispatch.call(this, "Protect", new Variant(type), noReset, password);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 * @param noReset an input-parameter of type Variant
	 */
	public void protect(int type, Variant noReset) {
		Dispatch.call(this, "Protect", new Variant(type), noReset);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type int
	 */
	public void protect(int type) {
		Dispatch.call(this, "Protect", new Variant(type));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param type an input-parameter of type int
	 * @param noReset an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param useIRM an input-parameter of type Variant
	 * @param enforceStyleLock an input-parameter of type Variant
	 */
	public void protect(int type, Variant noReset, Variant password, Variant useIRM, Variant enforceStyleLock) {
		Dispatch.call(this, "Protect", new Variant(type), noReset, password, useIRM, enforceStyleLock);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param editorID an input-parameter of type Variant
	 */
	public void selectAllEditableRanges(Variant editorID) {
		Dispatch.call(this, "SelectAllEditableRanges", editorID);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void selectAllEditableRanges() {
		Dispatch.call(this, "SelectAllEditableRanges");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param editorID an input-parameter of type Variant
	 */
	public void selectAllEditableRanges(Variant editorID) {
		Dispatch.call(this, "SelectAllEditableRanges", editorID);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param editorID an input-parameter of type Variant
	 */
	public void deleteAllEditableRanges(Variant editorID) {
		Dispatch.call(this, "DeleteAllEditableRanges", editorID);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void deleteAllEditableRanges() {
		Dispatch.call(this, "DeleteAllEditableRanges");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param editorID an input-parameter of type Variant
	 */
	public void deleteAllEditableRanges(Variant editorID) {
		Dispatch.call(this, "DeleteAllEditableRanges", editorID);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void deleteAllInkAnnotations() {
		Dispatch.call(this, "DeleteAllInkAnnotations");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param richFormat an input-parameter of type boolean
	 * @param url an input-parameter of type String
	 * @param title an input-parameter of type String
	 * @param description an input-parameter of type String
	 * @param iD an input-parameter of type String
	 */
	public void addDocumentWorkspaceHeader(boolean richFormat, String url, String title, String description, String iD) {
		Dispatch.call(this, "AddDocumentWorkspaceHeader", new Variant(richFormat), url, title, description, iD);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param iD an input-parameter of type String
	 */
	public void removeDocumentWorkspaceHeader(String iD) {
		Dispatch.call(this, "RemoveDocumentWorkspaceHeader", iD);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 * @param compareTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 * @param ignoreAllComparisonWarnings an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param removePersonalInformation an input-parameter of type Variant
	 * @param removeDateAndTime an input-parameter of type Variant
	 */
	public void compare(String name, Variant authorName, Variant compareTarget, Variant detectFormatChanges, Variant ignoreAllComparisonWarnings, Variant addToRecentFiles, Variant removePersonalInformation, Variant removeDateAndTime) {
		Dispatch.call(this, "Compare", name, authorName, compareTarget, detectFormatChanges, ignoreAllComparisonWarnings, addToRecentFiles, removePersonalInformation, removeDateAndTime);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 * @param compareTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 * @param ignoreAllComparisonWarnings an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param removePersonalInformation an input-parameter of type Variant
	 */
	public void compare(String name, Variant authorName, Variant compareTarget, Variant detectFormatChanges, Variant ignoreAllComparisonWarnings, Variant addToRecentFiles, Variant removePersonalInformation) {
		Dispatch.call(this, "Compare", name, authorName, compareTarget, detectFormatChanges, ignoreAllComparisonWarnings, addToRecentFiles, removePersonalInformation);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 * @param compareTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 * @param ignoreAllComparisonWarnings an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void compare(String name, Variant authorName, Variant compareTarget, Variant detectFormatChanges, Variant ignoreAllComparisonWarnings, Variant addToRecentFiles) {
		Dispatch.call(this, "Compare", name, authorName, compareTarget, detectFormatChanges, ignoreAllComparisonWarnings, addToRecentFiles);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 * @param compareTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 * @param ignoreAllComparisonWarnings an input-parameter of type Variant
	 */
	public void compare(String name, Variant authorName, Variant compareTarget, Variant detectFormatChanges, Variant ignoreAllComparisonWarnings) {
		Dispatch.call(this, "Compare", name, authorName, compareTarget, detectFormatChanges, ignoreAllComparisonWarnings);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 * @param compareTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 */
	public void compare(String name, Variant authorName, Variant compareTarget, Variant detectFormatChanges) {
		Dispatch.call(this, "Compare", name, authorName, compareTarget, detectFormatChanges);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 * @param compareTarget an input-parameter of type Variant
	 */
	public void compare(String name, Variant authorName, Variant compareTarget) {
		Dispatch.call(this, "Compare", name, authorName, compareTarget);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 */
	public void compare(String name, Variant authorName) {
		Dispatch.call(this, "Compare", name, authorName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void compare(String name) {
		Dispatch.call(this, "Compare", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type String
	 * @param authorName an input-parameter of type Variant
	 * @param compareTarget an input-parameter of type Variant
	 * @param detectFormatChanges an input-parameter of type Variant
	 * @param ignoreAllComparisonWarnings an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param removePersonalInformation an input-parameter of type Variant
	 * @param removeDateAndTime an input-parameter of type Variant
	 */
	public void compare(String name, Variant authorName, Variant compareTarget, Variant detectFormatChanges, Variant ignoreAllComparisonWarnings, Variant addToRecentFiles, Variant removePersonalInformation, Variant removeDateAndTime) {
		Dispatch.call(this, "Compare", name, authorName, compareTarget, detectFormatChanges, ignoreAllComparisonWarnings, addToRecentFiles, removePersonalInformation, removeDateAndTime);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void removeLockedStyles() {
		Dispatch.call(this, "RemoveLockedStyles");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLChildNodeSuggestions
	 */
	public XMLChildNodeSuggestions getChildNodeSuggestions() {
		return new XMLChildNodeSuggestions(Dispatch.get(this, "ChildNodeSuggestions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @param fastSearchSkippingTextNodes an input-parameter of type boolean
	 * @return the result is of type XMLNode
	 */
	public XMLNode selectSingleNode(String xPath, String prefixMapping, boolean fastSearchSkippingTextNodes) {
		return new XMLNode(Dispatch.call(this, "SelectSingleNode", xPath, prefixMapping, new Variant(fastSearchSkippingTextNodes)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @return the result is of type XMLNode
	 */
	public XMLNode selectSingleNode(String xPath, String prefixMapping) {
		return new XMLNode(Dispatch.call(this, "SelectSingleNode", xPath, prefixMapping).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @return the result is of type XMLNode
	 */
	public XMLNode selectSingleNode(String xPath) {
		return new XMLNode(Dispatch.call(this, "SelectSingleNode", xPath).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @param fastSearchSkippingTextNodes an input-parameter of type boolean
	 * @return the result is of type XMLNode
	 */
	public XMLNode selectSingleNode(String xPath, String prefixMapping, boolean fastSearchSkippingTextNodes) {
		XMLNode result_of_SelectSingleNode = new XMLNode(Dispatch.call(this, "SelectSingleNode", xPath, prefixMapping, new Variant(fastSearchSkippingTextNodes)).toDispatch());


		return result_of_SelectSingleNode;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @param fastSearchSkippingTextNodes an input-parameter of type boolean
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes selectNodes(String xPath, String prefixMapping, boolean fastSearchSkippingTextNodes) {
		return new XMLNodes(Dispatch.call(this, "SelectNodes", xPath, prefixMapping, new Variant(fastSearchSkippingTextNodes)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes selectNodes(String xPath, String prefixMapping) {
		return new XMLNodes(Dispatch.call(this, "SelectNodes", xPath, prefixMapping).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes selectNodes(String xPath) {
		return new XMLNodes(Dispatch.call(this, "SelectNodes", xPath).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @param fastSearchSkippingTextNodes an input-parameter of type boolean
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes selectNodes(String xPath, String prefixMapping, boolean fastSearchSkippingTextNodes) {
		XMLNodes result_of_SelectNodes = new XMLNodes(Dispatch.call(this, "SelectNodes", xPath, prefixMapping, new Variant(fastSearchSkippingTextNodes)).toDispatch());


		return result_of_SelectNodes;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes getXMLSchemaViolations() {
		return new XMLNodes(Dispatch.get(this, "XMLSchemaViolations").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getReadingLayoutSizeX() {
		return Dispatch.get(this, "ReadingLayoutSizeX").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param readingLayoutSizeX an input-parameter of type int
	 */
	public void setReadingLayoutSizeX(int readingLayoutSizeX) {
		Dispatch.put(this, "ReadingLayoutSizeX", new Variant(readingLayoutSizeX));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getReadingLayoutSizeY() {
		return Dispatch.get(this, "ReadingLayoutSizeY").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param readingLayoutSizeY an input-parameter of type int
	 */
	public void setReadingLayoutSizeY(int readingLayoutSizeY) {
		Dispatch.put(this, "ReadingLayoutSizeY", new Variant(readingLayoutSizeY));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getStyleSortMethod() {
		return Dispatch.get(this, "StyleSortMethod").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param styleSortMethod an input-parameter of type int
	 */
	public void setStyleSortMethod(int styleSortMethod) {
		Dispatch.put(this, "StyleSortMethod", new Variant(styleSortMethod));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MetaProperties
	 */
	public MetaProperties getContentTypeProperties() {
		return new MetaProperties(Dispatch.get(this, "ContentTypeProperties").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getTrackMoves() {
		return Dispatch.get(this, "TrackMoves").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param trackMoves an input-parameter of type boolean
	 */
	public void setTrackMoves(boolean trackMoves) {
		Dispatch.put(this, "TrackMoves", new Variant(trackMoves));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getTrackFormatting() {
		return Dispatch.get(this, "TrackFormatting").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param trackFormatting an input-parameter of type boolean
	 */
	public void setTrackFormatting(boolean trackFormatting) {
		Dispatch.put(this, "TrackFormatting", new Variant(trackFormatting));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void getDummy1() {
		return Dispatch.get(this, "Dummy1");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OMaths
	 */
	public OMaths getOMaths() {
		return new OMaths(Dispatch.get(this, "OMaths").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param removeDocInfoType an input-parameter of type int
	 */
	public void removeDocumentInformation(int removeDocInfoType) {
		Dispatch.call(this, "RemoveDocumentInformation", new Variant(removeDocInfoType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type boolean
	 * @param comments an input-parameter of type Variant
	 * @param makePublic an input-parameter of type boolean
	 * @param versionType an input-parameter of type Variant
	 */
	public void checkInWithVersion(boolean saveChanges, Variant comments, boolean makePublic, Variant versionType) {
		Dispatch.call(this, "CheckInWithVersion", new Variant(saveChanges), comments, new Variant(makePublic), versionType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type boolean
	 * @param comments an input-parameter of type Variant
	 * @param makePublic an input-parameter of type boolean
	 */
	public void checkInWithVersion(boolean saveChanges, Variant comments, boolean makePublic) {
		Dispatch.call(this, "CheckInWithVersion", new Variant(saveChanges), comments, new Variant(makePublic));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type boolean
	 * @param comments an input-parameter of type Variant
	 */
	public void checkInWithVersion(boolean saveChanges, Variant comments) {
		Dispatch.call(this, "CheckInWithVersion", new Variant(saveChanges), comments);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param saveChanges an input-parameter of type boolean
	 */
	public void checkInWithVersion(boolean saveChanges) {
		Dispatch.call(this, "CheckInWithVersion", new Variant(saveChanges));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void checkInWithVersion() {
		Dispatch.call(this, "CheckInWithVersion");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param saveChanges an input-parameter of type boolean
	 * @param comments an input-parameter of type Variant
	 * @param makePublic an input-parameter of type boolean
	 * @param versionType an input-parameter of type Variant
	 */
	public void checkInWithVersion(boolean saveChanges, Variant comments, boolean makePublic, Variant versionType) {
		Dispatch.call(this, "CheckInWithVersion", new Variant(saveChanges), comments, new Variant(makePublic), versionType);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void dummy2() {
		Dispatch.call(this, "Dummy2");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void getDummy3() {
		return Dispatch.get(this, "Dummy3");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ServerPolicy
	 */
	public ServerPolicy getServerPolicy() {
		return new ServerPolicy(Dispatch.get(this, "ServerPolicy").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ContentControls
	 */
	public ContentControls getContentControls() {
		return new ContentControls(Dispatch.get(this, "ContentControls").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type DocumentInspectors
	 */
	public DocumentInspectors getDocumentInspectors() {
		return new DocumentInspectors(Dispatch.get(this, "DocumentInspectors").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void lockServerFile() {
		Dispatch.call(this, "LockServerFile");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type WorkflowTasks
	 */
	public WorkflowTasks getWorkflowTasks() {
		return new WorkflowTasks(Dispatch.call(this, "GetWorkflowTasks").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type WorkflowTemplates
	 */
	public WorkflowTemplates getWorkflowTemplates() {
		return new WorkflowTemplates(Dispatch.call(this, "GetWorkflowTemplates").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void dummy4() {
		Dispatch.call(this, "Dummy4");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param skipIfAbsent an input-parameter of type boolean
	 * @param url an input-parameter of type String
	 * @param title an input-parameter of type String
	 * @param description an input-parameter of type String
	 * @param iD an input-parameter of type String
	 */
	public void addMeetingWorkspaceHeader(boolean skipIfAbsent, String url, String title, String description, String iD) {
		Dispatch.call(this, "AddMeetingWorkspaceHeader", new Variant(skipIfAbsent), url, title, description, iD);
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
	public boolean getLockTheme() {
		return Dispatch.get(this, "LockTheme").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lockTheme an input-parameter of type boolean
	 */
	public void setLockTheme(boolean lockTheme) {
		Dispatch.put(this, "LockTheme", new Variant(lockTheme));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getLockQuickStyleSet() {
		return Dispatch.get(this, "LockQuickStyleSet").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lockQuickStyleSet an input-parameter of type boolean
	 */
	public void setLockQuickStyleSet(boolean lockQuickStyleSet) {
		Dispatch.put(this, "LockQuickStyleSet", new Variant(lockQuickStyleSet));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getOriginalDocumentTitle() {
		return Dispatch.get(this, "OriginalDocumentTitle").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getRevisedDocumentTitle() {
		return Dispatch.get(this, "RevisedDocumentTitle").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type CustomXMLParts
	 */
	public CustomXMLParts getCustomXMLParts() {
		return new CustomXMLParts(Dispatch.get(this, "CustomXMLParts").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFormattingShowNextLevel() {
		return Dispatch.get(this, "FormattingShowNextLevel").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formattingShowNextLevel an input-parameter of type boolean
	 */
	public void setFormattingShowNextLevel(boolean formattingShowNextLevel) {
		Dispatch.put(this, "FormattingShowNextLevel", new Variant(formattingShowNextLevel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFormattingShowUserStyleName() {
		return Dispatch.get(this, "FormattingShowUserStyleName").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param formattingShowUserStyleName an input-parameter of type boolean
	 */
	public void setFormattingShowUserStyleName(boolean formattingShowUserStyleName) {
		Dispatch.put(this, "FormattingShowUserStyleName", new Variant(formattingShowUserStyleName));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void saveAsQuickStyleSet(String fileName) {
		Dispatch.call(this, "SaveAsQuickStyleSet", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void applyQuickStyleSet(String name) {
		Dispatch.call(this, "ApplyQuickStyleSet", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Research
	 */
	public Research getResearch() {
		return new Research(Dispatch.get(this, "Research").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getFinal() {
		return Dispatch.get(this, "Final").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param final an input-parameter of type boolean
	 */
	public void setFinal(boolean final) {
		Dispatch.put(this, "Final", new Variant(final));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOMathBreakBin() {
		return Dispatch.get(this, "OMathBreakBin").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param oMathBreakBin an input-parameter of type int
	 */
	public void setOMathBreakBin(int oMathBreakBin) {
		Dispatch.put(this, "OMathBreakBin", new Variant(oMathBreakBin));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOMathBreakSub() {
		return Dispatch.get(this, "OMathBreakSub").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param oMathBreakSub an input-parameter of type int
	 */
	public void setOMathBreakSub(int oMathBreakSub) {
		Dispatch.put(this, "OMathBreakSub", new Variant(oMathBreakSub));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getOMathJc() {
		return Dispatch.get(this, "OMathJc").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param oMathJc an input-parameter of type int
	 */
	public void setOMathJc(int oMathJc) {
		Dispatch.put(this, "OMathJc", new Variant(oMathJc));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getOMathLeftMargin() {
		return Dispatch.get(this, "OMathLeftMargin").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param oMathLeftMargin an input-parameter of type float
	 */
	public void setOMathLeftMargin(float oMathLeftMargin) {
		Dispatch.put(this, "OMathLeftMargin", new Variant(oMathLeftMargin));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getOMathRightMargin() {
		return Dispatch.get(this, "OMathRightMargin").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param oMathRightMargin an input-parameter of type float
	 */
	public void setOMathRightMargin(float oMathRightMargin) {
		Dispatch.put(this, "OMathRightMargin", new Variant(oMathRightMargin));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getOMathWrap() {
		return Dispatch.get(this, "OMathWrap").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param oMathWrap an input-parameter of type float
	 */
	public void setOMathWrap(float oMathWrap) {
		Dispatch.put(this, "OMathWrap", new Variant(oMathWrap));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getOMathIntSubSupLim() {
		return Dispatch.get(this, "OMathIntSubSupLim").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param oMathIntSubSupLim an input-parameter of type boolean
	 */
	public void setOMathIntSubSupLim(boolean oMathIntSubSupLim) {
		Dispatch.put(this, "OMathIntSubSupLim", new Variant(oMathIntSubSupLim));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getOMathNarySupSubLim() {
		return Dispatch.get(this, "OMathNarySupSubLim").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param oMathNarySupSubLim an input-parameter of type boolean
	 */
	public void setOMathNarySupSubLim(boolean oMathNarySupSubLim) {
		Dispatch.put(this, "OMathNarySupSubLim", new Variant(oMathNarySupSubLim));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getOMathSmallFrac() {
		return Dispatch.get(this, "OMathSmallFrac").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param oMathSmallFrac an input-parameter of type boolean
	 */
	public void setOMathSmallFrac(boolean oMathSmallFrac) {
		Dispatch.put(this, "OMathSmallFrac", new Variant(oMathSmallFrac));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getWordOpenXML() {
		return Dispatch.get(this, "WordOpenXML").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type OfficeTheme
	 */
	public OfficeTheme getDocumentTheme() {
		return new OfficeTheme(Dispatch.get(this, "DocumentTheme").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type String
	 */
	public void applyDocumentTheme(String fileName) {
		Dispatch.call(this, "ApplyDocumentTheme", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasVBProject() {
		return Dispatch.get(this, "HasVBProject").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param node an input-parameter of type CustomXMLNode
	 * @return the result is of type ContentControls
	 */
	public ContentControls selectLinkedControls(CustomXMLNode node) {
		return new ContentControls(Dispatch.call(this, "SelectLinkedControls", node).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param stream an input-parameter of type CustomXMLPart
	 * @return the result is of type ContentControls
	 */
	public ContentControls selectUnlinkedControls(CustomXMLPart stream) {
		return new ContentControls(Dispatch.call(this, "SelectUnlinkedControls", stream).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type ContentControls
	 */
	public ContentControls selectUnlinkedControls() {
		return new ContentControls(Dispatch.call(this, "SelectUnlinkedControls").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param stream an input-parameter of type CustomXMLPart
	 * @return the result is of type ContentControls
	 */
	public ContentControls selectUnlinkedControls(CustomXMLPart stream) {
		ContentControls result_of_SelectUnlinkedControls = new ContentControls(Dispatch.call(this, "SelectUnlinkedControls", stream).toDispatch());


		return result_of_SelectUnlinkedControls;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param title an input-parameter of type String
	 * @return the result is of type ContentControls
	 */
	public ContentControls selectContentControlsByTitle(String title) {
		return new ContentControls(Dispatch.call(this, "SelectContentControlsByTitle", title).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param range an input-parameter of type int
	 * @param from an input-parameter of type int
	 * @param to an input-parameter of type int
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 * @param createBookmarks an input-parameter of type int
	 * @param docStructureTags an input-parameter of type boolean
	 * @param bitmapMissingFonts an input-parameter of type boolean
	 * @param useISO19005_1 an input-parameter of type boolean
	 * @param fixedFormatExtClassPtr an input-parameter of type Variant
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, int range, int from, int to, int item, boolean includeDocProps, boolean keepIRM, int createBookmarks, boolean docStructureTags, boolean bitmapMissingFonts, boolean useISO19005_1, Variant fixedFormatExtClassPtr) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(range), new Variant(from), new Variant(to), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM), new Variant(createBookmarks), new Variant(docStructureTags), new Variant(bitmapMissingFonts), new Variant(useISO19005_1), fixedFormatExtClassPtr});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param range an input-parameter of type int
	 * @param from an input-parameter of type int
	 * @param to an input-parameter of type int
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 * @param createBookmarks an input-parameter of type int
	 * @param docStructureTags an input-parameter of type boolean
	 * @param bitmapMissingFonts an input-parameter of type boolean
	 * @param useISO19005_1 an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, int range, int from, int to, int item, boolean includeDocProps, boolean keepIRM, int createBookmarks, boolean docStructureTags, boolean bitmapMissingFonts, boolean useISO19005_1) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(range), new Variant(from), new Variant(to), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM), new Variant(createBookmarks), new Variant(docStructureTags), new Variant(bitmapMissingFonts), new Variant(useISO19005_1)});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param range an input-parameter of type int
	 * @param from an input-parameter of type int
	 * @param to an input-parameter of type int
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 * @param createBookmarks an input-parameter of type int
	 * @param docStructureTags an input-parameter of type boolean
	 * @param bitmapMissingFonts an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, int range, int from, int to, int item, boolean includeDocProps, boolean keepIRM, int createBookmarks, boolean docStructureTags, boolean bitmapMissingFonts) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(range), new Variant(from), new Variant(to), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM), new Variant(createBookmarks), new Variant(docStructureTags), new Variant(bitmapMissingFonts)});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param range an input-parameter of type int
	 * @param from an input-parameter of type int
	 * @param to an input-parameter of type int
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 * @param createBookmarks an input-parameter of type int
	 * @param docStructureTags an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, int range, int from, int to, int item, boolean includeDocProps, boolean keepIRM, int createBookmarks, boolean docStructureTags) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(range), new Variant(from), new Variant(to), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM), new Variant(createBookmarks), new Variant(docStructureTags)});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param range an input-parameter of type int
	 * @param from an input-parameter of type int
	 * @param to an input-parameter of type int
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 * @param createBookmarks an input-parameter of type int
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, int range, int from, int to, int item, boolean includeDocProps, boolean keepIRM, int createBookmarks) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(range), new Variant(from), new Variant(to), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM), new Variant(createBookmarks)});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param range an input-parameter of type int
	 * @param from an input-parameter of type int
	 * @param to an input-parameter of type int
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, int range, int from, int to, int item, boolean includeDocProps, boolean keepIRM) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(range), new Variant(from), new Variant(to), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM)});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param range an input-parameter of type int
	 * @param from an input-parameter of type int
	 * @param to an input-parameter of type int
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, int range, int from, int to, int item, boolean includeDocProps) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(range), new Variant(from), new Variant(to), new Variant(item), new Variant(includeDocProps)});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param range an input-parameter of type int
	 * @param from an input-parameter of type int
	 * @param to an input-parameter of type int
	 * @param item an input-parameter of type int
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, int range, int from, int to, int item) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(range), new Variant(from), new Variant(to), new Variant(item));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param range an input-parameter of type int
	 * @param from an input-parameter of type int
	 * @param to an input-parameter of type int
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, int range, int from, int to) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(range), new Variant(from), new Variant(to));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param range an input-parameter of type int
	 * @param from an input-parameter of type int
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, int range, int from) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(range), new Variant(from));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param range an input-parameter of type int
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, int range) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(range));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat), new Variant(openAfterExport));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat) {
		Dispatch.call(this, "ExportAsFixedFormat", outputFileName, new Variant(exportFormat));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param outputFileName an input-parameter of type String
	 * @param exportFormat an input-parameter of type int
	 * @param openAfterExport an input-parameter of type boolean
	 * @param optimizeFor an input-parameter of type int
	 * @param range an input-parameter of type int
	 * @param from an input-parameter of type int
	 * @param to an input-parameter of type int
	 * @param item an input-parameter of type int
	 * @param includeDocProps an input-parameter of type boolean
	 * @param keepIRM an input-parameter of type boolean
	 * @param createBookmarks an input-parameter of type int
	 * @param docStructureTags an input-parameter of type boolean
	 * @param bitmapMissingFonts an input-parameter of type boolean
	 * @param useISO19005_1 an input-parameter of type boolean
	 * @param fixedFormatExtClassPtr an input-parameter of type Variant
	 */
	public void exportAsFixedFormat(String outputFileName, int exportFormat, boolean openAfterExport, int optimizeFor, int range, int from, int to, int item, boolean includeDocProps, boolean keepIRM, int createBookmarks, boolean docStructureTags, boolean bitmapMissingFonts, boolean useISO19005_1, Variant fixedFormatExtClassPtr) {
		Dispatch.callN(this, "ExportAsFixedFormat", new Object[] { outputFileName, new Variant(exportFormat), new Variant(openAfterExport), new Variant(optimizeFor), new Variant(range), new Variant(from), new Variant(to), new Variant(item), new Variant(includeDocProps), new Variant(keepIRM), new Variant(createBookmarks), new Variant(docStructureTags), new Variant(bitmapMissingFonts), new Variant(useISO19005_1), fixedFormatExtClassPtr});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void freezeLayout() {
		Dispatch.call(this, "FreezeLayout");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void unfreezeLayout() {
		Dispatch.call(this, "UnfreezeLayout");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getOMathFontName() {
		return Dispatch.get(this, "OMathFontName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param oMathFontName an input-parameter of type String
	 */
	public void setOMathFontName(String oMathFontName) {
		Dispatch.put(this, "OMathFontName", oMathFontName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void downgradeDocument() {
		Dispatch.call(this, "DowngradeDocument");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getEncryptionProvider() {
		return Dispatch.get(this, "EncryptionProvider").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param encryptionProvider an input-parameter of type String
	 */
	public void setEncryptionProvider(String encryptionProvider) {
		Dispatch.put(this, "EncryptionProvider", encryptionProvider);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getUseMathDefaults() {
		return Dispatch.get(this, "UseMathDefaults").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param useMathDefaults an input-parameter of type boolean
	 */
	public void setUseMathDefaults(boolean useMathDefaults) {
		Dispatch.put(this, "UseMathDefaults", new Variant(useMathDefaults));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCurrentRsid() {
		return Dispatch.get(this, "CurrentRsid").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void convert() {
		Dispatch.call(this, "Convert");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param tag an input-parameter of type String
	 * @return the result is of type ContentControls
	 */
	public ContentControls selectContentControlsByTag(String tag) {
		return new ContentControls(Dispatch.call(this, "SelectContentControlsByTag", tag).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void convertAutoHyphens() {
		Dispatch.call(this, "ConvertAutoHyphens");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDocID() {
		return Dispatch.get(this, "DocID").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param style an input-parameter of type Variant
	 */
	public void applyQuickStyleSet2(Variant style) {
		Dispatch.call(this, "ApplyQuickStyleSet2", style);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCompatibilityMode() {
		return Dispatch.get(this, "CompatibilityMode").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 * @param lineEnding an input-parameter of type Variant
	 * @param addBiDiMarks an input-parameter of type Variant
	 * @param compatibilityMode an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions, Variant lineEnding, Variant addBiDiMarks, Variant compatibilityMode) {
		Dispatch.callN(this, "SaveAs2", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions, lineEnding, addBiDiMarks, compatibilityMode});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 * @param lineEnding an input-parameter of type Variant
	 * @param addBiDiMarks an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions, Variant lineEnding, Variant addBiDiMarks) {
		Dispatch.callN(this, "SaveAs2", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions, lineEnding, addBiDiMarks});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 * @param lineEnding an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions, Variant lineEnding) {
		Dispatch.callN(this, "SaveAs2", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions, lineEnding});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions) {
		Dispatch.callN(this, "SaveAs2", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks) {
		Dispatch.callN(this, "SaveAs2", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding) {
		Dispatch.callN(this, "SaveAs2", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter) {
		Dispatch.callN(this, "SaveAs2", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData) {
		Dispatch.callN(this, "SaveAs2", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat) {
		Dispatch.callN(this, "SaveAs2", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts) {
		Dispatch.call(this, "SaveAs2", fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended) {
		Dispatch.call(this, "SaveAs2", fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword) {
		Dispatch.call(this, "SaveAs2", fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles) {
		Dispatch.call(this, "SaveAs2", fileName, fileFormat, lockComments, password, addToRecentFiles);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password) {
		Dispatch.call(this, "SaveAs2", fileName, fileFormat, lockComments, password);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments) {
		Dispatch.call(this, "SaveAs2", fileName, fileFormat, lockComments);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat) {
		Dispatch.call(this, "SaveAs2", fileName, fileFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName) {
		Dispatch.call(this, "SaveAs2", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void saveAs2() {
		Dispatch.call(this, "SaveAs2");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 * @param lineEnding an input-parameter of type Variant
	 * @param addBiDiMarks an input-parameter of type Variant
	 * @param compatibilityMode an input-parameter of type Variant
	 */
	public void saveAs2(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions, Variant lineEnding, Variant addBiDiMarks, Variant compatibilityMode) {
		Dispatch.callN(this, "SaveAs2", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions, lineEnding, addBiDiMarks, compatibilityMode});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type CoAuthoring
	 */
	public CoAuthoring getCoAuthoring() {
		return new CoAuthoring(Dispatch.get(this, "CoAuthoring").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param mode an input-parameter of type int
	 */
	public void setCompatibilityMode(int mode) {
		Dispatch.call(this, "SetCompatibilityMode", new Variant(mode));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Broadcast
	 */
	public Broadcast getBroadcast() {
		return new Broadcast(Dispatch.get(this, "Broadcast").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int returnToLastReadPosition() {
		return Dispatch.call(this, "ReturnToLastReadPosition").changeType(Variant.VariantInt).getInt();
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
	public boolean getIsInAutosave() {
		return Dispatch.get(this, "IsInAutosave").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 * @param lineEnding an input-parameter of type Variant
	 * @param addBiDiMarks an input-parameter of type Variant
	 * @param compatibilityMode an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions, Variant lineEnding, Variant addBiDiMarks, Variant compatibilityMode) {
		Dispatch.callN(this, "SaveCopyAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions, lineEnding, addBiDiMarks, compatibilityMode});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 * @param lineEnding an input-parameter of type Variant
	 * @param addBiDiMarks an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions, Variant lineEnding, Variant addBiDiMarks) {
		Dispatch.callN(this, "SaveCopyAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions, lineEnding, addBiDiMarks});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 * @param lineEnding an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions, Variant lineEnding) {
		Dispatch.callN(this, "SaveCopyAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions, lineEnding});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions) {
		Dispatch.callN(this, "SaveCopyAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks) {
		Dispatch.callN(this, "SaveCopyAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding) {
		Dispatch.callN(this, "SaveCopyAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter) {
		Dispatch.callN(this, "SaveCopyAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData) {
		Dispatch.callN(this, "SaveCopyAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat) {
		Dispatch.callN(this, "SaveCopyAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts) {
		Dispatch.call(this, "SaveCopyAs", fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended) {
		Dispatch.call(this, "SaveCopyAs", fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword) {
		Dispatch.call(this, "SaveCopyAs", fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles) {
		Dispatch.call(this, "SaveCopyAs", fileName, fileFormat, lockComments, password, addToRecentFiles);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password) {
		Dispatch.call(this, "SaveCopyAs", fileName, fileFormat, lockComments, password);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments) {
		Dispatch.call(this, "SaveCopyAs", fileName, fileFormat, lockComments);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat) {
		Dispatch.call(this, "SaveCopyAs", fileName, fileFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName) {
		Dispatch.call(this, "SaveCopyAs", fileName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void saveCopyAs() {
		Dispatch.call(this, "SaveCopyAs");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param fileName an input-parameter of type Variant
	 * @param fileFormat an input-parameter of type Variant
	 * @param lockComments an input-parameter of type Variant
	 * @param password an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param writePassword an input-parameter of type Variant
	 * @param readOnlyRecommended an input-parameter of type Variant
	 * @param embedTrueTypeFonts an input-parameter of type Variant
	 * @param saveNativePictureFormat an input-parameter of type Variant
	 * @param saveFormsData an input-parameter of type Variant
	 * @param saveAsAOCELetter an input-parameter of type Variant
	 * @param encoding an input-parameter of type Variant
	 * @param insertLineBreaks an input-parameter of type Variant
	 * @param allowSubstitutions an input-parameter of type Variant
	 * @param lineEnding an input-parameter of type Variant
	 * @param addBiDiMarks an input-parameter of type Variant
	 * @param compatibilityMode an input-parameter of type Variant
	 */
	public void saveCopyAs(Variant fileName, Variant fileFormat, Variant lockComments, Variant password, Variant addToRecentFiles, Variant writePassword, Variant readOnlyRecommended, Variant embedTrueTypeFonts, Variant saveNativePictureFormat, Variant saveFormsData, Variant saveAsAOCELetter, Variant encoding, Variant insertLineBreaks, Variant allowSubstitutions, Variant lineEnding, Variant addBiDiMarks, Variant compatibilityMode) {
		Dispatch.callN(this, "SaveCopyAs", new Object[] { fileName, fileFormat, lockComments, password, addToRecentFiles, writePassword, readOnlyRecommended, embedTrueTypeFonts, saveNativePictureFormat, saveFormsData, saveAsAOCELetter, encoding, insertLineBreaks, allowSubstitutions, lineEnding, addBiDiMarks, compatibilityMode});

	}

}
