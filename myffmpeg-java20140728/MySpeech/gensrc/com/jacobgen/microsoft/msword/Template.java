/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Template extends Dispatch {

	public static final String componentName = "Word.Template";

	public Template() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Template(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Template(String compName) {
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
	 * @return the result is of type String
	 */
	public String getPath() {
		return Dispatch.get(this, "Path").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type AutoTextEntries
	 */
	public AutoTextEntries getAutoTextEntries() {
		return new AutoTextEntries(Dispatch.get(this, "AutoTextEntries").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLanguageID() {
		return Dispatch.get(this, "LanguageID").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param languageID an input-parameter of type int
	 */
	public void setLanguageID(int languageID) {
		Dispatch.put(this, "LanguageID", new Variant(languageID));
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
	 * @return the result is of type int
	 */
	public int getType() {
		return Dispatch.get(this, "Type").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type ListTemplates
	 */
	public ListTemplates getListTemplates() {
		return new ListTemplates(Dispatch.get(this, "ListTemplates").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLanguageIDFarEast() {
		return Dispatch.get(this, "LanguageIDFarEast").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param languageIDFarEast an input-parameter of type int
	 */
	public void setLanguageIDFarEast(int languageIDFarEast) {
		Dispatch.put(this, "LanguageIDFarEast", new Variant(languageIDFarEast));
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
	 * @return the result is of type Document
	 */
	public Document openAsDocument() {
		return new Document(Dispatch.call(this, "OpenAsDocument").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void save() {
		Dispatch.call(this, "Save");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNoProofing() {
		return Dispatch.get(this, "NoProofing").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param noProofing an input-parameter of type int
	 */
	public void setNoProofing(int noProofing) {
		Dispatch.put(this, "NoProofing", new Variant(noProofing));
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
	 * @return the result is of type BuildingBlockEntries
	 */
	public BuildingBlockEntries getBuildingBlockEntries() {
		return new BuildingBlockEntries(Dispatch.get(this, "BuildingBlockEntries").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type BuildingBlockTypes
	 */
	public BuildingBlockTypes getBuildingBlockTypes() {
		return new BuildingBlockTypes(Dispatch.get(this, "BuildingBlockTypes").toDispatch());
	}

}
