/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Language extends Dispatch {

	public static final String componentName = "Word.Language";

	public Language() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Language(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Language(String compName) {
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
	 * @return the result is of type int
	 */
	public int getID() {
		return Dispatch.get(this, "ID").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getNameLocal() {
		return Dispatch.get(this, "NameLocal").toString();
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
	 * @return the result is of type Dictionary
	 */
	public Dictionary getActiveGrammarDictionary() {
		return new Dictionary(Dispatch.get(this, "ActiveGrammarDictionary").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Dictionary
	 */
	public Dictionary getActiveHyphenationDictionary() {
		return new Dictionary(Dispatch.get(this, "ActiveHyphenationDictionary").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Dictionary
	 */
	public Dictionary getActiveSpellingDictionary() {
		return new Dictionary(Dispatch.get(this, "ActiveSpellingDictionary").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Dictionary
	 */
	public Dictionary getActiveThesaurusDictionary() {
		return new Dictionary(Dispatch.get(this, "ActiveThesaurusDictionary").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getDefaultWritingStyle() {
		return Dispatch.get(this, "DefaultWritingStyle").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param defaultWritingStyle an input-parameter of type String
	 */
	public void setDefaultWritingStyle(String defaultWritingStyle) {
		Dispatch.put(this, "DefaultWritingStyle", defaultWritingStyle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getWritingStyleList() {
		return Dispatch.get(this, "WritingStyleList");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSpellingDictionaryType() {
		return Dispatch.get(this, "SpellingDictionaryType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param spellingDictionaryType an input-parameter of type int
	 */
	public void setSpellingDictionaryType(int spellingDictionaryType) {
		Dispatch.put(this, "SpellingDictionaryType", new Variant(spellingDictionaryType));
	}

}
