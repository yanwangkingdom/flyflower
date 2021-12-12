/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Research extends Dispatch {

	public static final String componentName = "Word.Research";

	public Research() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Research(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Research(String compName) {
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
	 * @param serviceID an input-parameter of type String
	 * @param queryString an input-parameter of type String
	 * @param queryLanguage an input-parameter of type int
	 * @param useSelection an input-parameter of type boolean
	 * @param launchQuery an input-parameter of type boolean
	 * @return the result is of type Variant
	 */
	public Variant query(String serviceID, String queryString, int queryLanguage, boolean useSelection, boolean launchQuery) {
		return Dispatch.call(this, "Query", serviceID, queryString, new Variant(queryLanguage), new Variant(useSelection), new Variant(launchQuery));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param serviceID an input-parameter of type String
	 * @param queryString an input-parameter of type String
	 * @param queryLanguage an input-parameter of type int
	 * @param useSelection an input-parameter of type boolean
	 * @return the result is of type Variant
	 */
	public Variant query(String serviceID, String queryString, int queryLanguage, boolean useSelection) {
		return Dispatch.call(this, "Query", serviceID, queryString, new Variant(queryLanguage), new Variant(useSelection));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param serviceID an input-parameter of type String
	 * @param queryString an input-parameter of type String
	 * @param queryLanguage an input-parameter of type int
	 * @return the result is of type Variant
	 */
	public Variant query(String serviceID, String queryString, int queryLanguage) {
		return Dispatch.call(this, "Query", serviceID, queryString, new Variant(queryLanguage));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param serviceID an input-parameter of type String
	 * @param queryString an input-parameter of type String
	 * @return the result is of type Variant
	 */
	public Variant query(String serviceID, String queryString) {
		return Dispatch.call(this, "Query", serviceID, queryString);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param serviceID an input-parameter of type String
	 * @return the result is of type Variant
	 */
	public Variant query(String serviceID) {
		return Dispatch.call(this, "Query", serviceID);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param serviceID an input-parameter of type String
	 * @param queryString an input-parameter of type String
	 * @param queryLanguage an input-parameter of type int
	 * @param useSelection an input-parameter of type boolean
	 * @param launchQuery an input-parameter of type boolean
	 * @return the result is of type Variant
	 */
	public Variant query(String serviceID, String queryString, int queryLanguage, boolean useSelection, boolean launchQuery) {
		Variant result_of_Query = Dispatch.call(this, "Query", serviceID, queryString, new Variant(queryLanguage), new Variant(useSelection), new Variant(launchQuery));


		return result_of_Query;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param languageFrom an input-parameter of type int
	 * @param languageTo an input-parameter of type int
	 * @return the result is of type Variant
	 */
	public Variant setLanguagePair(int languageFrom, int languageTo) {
		return Dispatch.call(this, "SetLanguagePair", new Variant(languageFrom), new Variant(languageTo));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param serviceID an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean isResearchService(String serviceID) {
		return Dispatch.call(this, "IsResearchService", serviceID).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getFavoriteService() {
		return Dispatch.get(this, "FavoriteService").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param favoriteService an input-parameter of type String
	 */
	public void setFavoriteService(String favoriteService) {
		Dispatch.put(this, "FavoriteService", favoriteService);
	}

}
