/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class MailMerge extends Dispatch {

	public static final String componentName = "Word.MailMerge";

	public MailMerge() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public MailMerge(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public MailMerge(String compName) {
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
	public int getMainDocumentType() {
		return Dispatch.get(this, "MainDocumentType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param mainDocumentType an input-parameter of type int
	 */
	public void setMainDocumentType(int mainDocumentType) {
		Dispatch.put(this, "MainDocumentType", new Variant(mainDocumentType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getState() {
		return Dispatch.get(this, "State").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getDestination() {
		return Dispatch.get(this, "Destination").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param destination an input-parameter of type int
	 */
	public void setDestination(int destination) {
		Dispatch.put(this, "Destination", new Variant(destination));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MailMergeDataSource
	 */
	public MailMergeDataSource getDataSource() {
		return new MailMergeDataSource(Dispatch.get(this, "DataSource").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MailMergeFields
	 */
	public MailMergeFields getFields() {
		return new MailMergeFields(Dispatch.get(this, "Fields").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getViewMailMergeFieldCodes() {
		return Dispatch.get(this, "ViewMailMergeFieldCodes").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param viewMailMergeFieldCodes an input-parameter of type int
	 */
	public void setViewMailMergeFieldCodes(int viewMailMergeFieldCodes) {
		Dispatch.put(this, "ViewMailMergeFieldCodes", new Variant(viewMailMergeFieldCodes));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getSuppressBlankLines() {
		return Dispatch.get(this, "SuppressBlankLines").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param suppressBlankLines an input-parameter of type boolean
	 */
	public void setSuppressBlankLines(boolean suppressBlankLines) {
		Dispatch.put(this, "SuppressBlankLines", new Variant(suppressBlankLines));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getMailAsAttachment() {
		return Dispatch.get(this, "MailAsAttachment").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param mailAsAttachment an input-parameter of type boolean
	 */
	public void setMailAsAttachment(boolean mailAsAttachment) {
		Dispatch.put(this, "MailAsAttachment", new Variant(mailAsAttachment));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getMailAddressFieldName() {
		return Dispatch.get(this, "MailAddressFieldName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param mailAddressFieldName an input-parameter of type String
	 */
	public void setMailAddressFieldName(String mailAddressFieldName) {
		Dispatch.put(this, "MailAddressFieldName", mailAddressFieldName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getMailSubject() {
		return Dispatch.get(this, "MailSubject").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param mailSubject an input-parameter of type String
	 */
	public void setMailSubject(String mailSubject) {
		Dispatch.put(this, "MailSubject", mailSubject);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param headerRecord an input-parameter of type Variant
	 * @param mSQuery an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 */
	public void createDataSource(Variant name, Variant passwordDocument, Variant writePasswordDocument, Variant headerRecord, Variant mSQuery, Variant sQLStatement, Variant sQLStatement1, Variant connection, Variant linkToSource) {
		Dispatch.callN(this, "CreateDataSource", new Object[] { name, passwordDocument, writePasswordDocument, headerRecord, mSQuery, sQLStatement, sQLStatement1, connection, linkToSource});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param headerRecord an input-parameter of type Variant
	 * @param mSQuery an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 */
	public void createDataSource(Variant name, Variant passwordDocument, Variant writePasswordDocument, Variant headerRecord, Variant mSQuery, Variant sQLStatement, Variant sQLStatement1, Variant connection) {
		Dispatch.call(this, "CreateDataSource", name, passwordDocument, writePasswordDocument, headerRecord, mSQuery, sQLStatement, sQLStatement1, connection);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param headerRecord an input-parameter of type Variant
	 * @param mSQuery an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 */
	public void createDataSource(Variant name, Variant passwordDocument, Variant writePasswordDocument, Variant headerRecord, Variant mSQuery, Variant sQLStatement, Variant sQLStatement1) {
		Dispatch.call(this, "CreateDataSource", name, passwordDocument, writePasswordDocument, headerRecord, mSQuery, sQLStatement, sQLStatement1);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param headerRecord an input-parameter of type Variant
	 * @param mSQuery an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 */
	public void createDataSource(Variant name, Variant passwordDocument, Variant writePasswordDocument, Variant headerRecord, Variant mSQuery, Variant sQLStatement) {
		Dispatch.call(this, "CreateDataSource", name, passwordDocument, writePasswordDocument, headerRecord, mSQuery, sQLStatement);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param headerRecord an input-parameter of type Variant
	 * @param mSQuery an input-parameter of type Variant
	 */
	public void createDataSource(Variant name, Variant passwordDocument, Variant writePasswordDocument, Variant headerRecord, Variant mSQuery) {
		Dispatch.call(this, "CreateDataSource", name, passwordDocument, writePasswordDocument, headerRecord, mSQuery);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param headerRecord an input-parameter of type Variant
	 */
	public void createDataSource(Variant name, Variant passwordDocument, Variant writePasswordDocument, Variant headerRecord) {
		Dispatch.call(this, "CreateDataSource", name, passwordDocument, writePasswordDocument, headerRecord);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 */
	public void createDataSource(Variant name, Variant passwordDocument, Variant writePasswordDocument) {
		Dispatch.call(this, "CreateDataSource", name, passwordDocument, writePasswordDocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 */
	public void createDataSource(Variant name, Variant passwordDocument) {
		Dispatch.call(this, "CreateDataSource", name, passwordDocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type Variant
	 */
	public void createDataSource(Variant name) {
		Dispatch.call(this, "CreateDataSource", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void createDataSource() {
		Dispatch.call(this, "CreateDataSource");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param headerRecord an input-parameter of type Variant
	 * @param mSQuery an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 */
	public void createDataSource(Variant name, Variant passwordDocument, Variant writePasswordDocument, Variant headerRecord, Variant mSQuery, Variant sQLStatement, Variant sQLStatement1, Variant connection, Variant linkToSource) {
		Dispatch.callN(this, "CreateDataSource", new Object[] { name, passwordDocument, writePasswordDocument, headerRecord, mSQuery, sQLStatement, sQLStatement1, connection, linkToSource});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param passwordDocument an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param headerRecord an input-parameter of type Variant
	 */
	public void createHeaderSource(String name, Variant passwordDocument, Variant writePasswordDocument, Variant headerRecord) {
		Dispatch.call(this, "CreateHeaderSource", name, passwordDocument, writePasswordDocument, headerRecord);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param passwordDocument an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 */
	public void createHeaderSource(String name, Variant passwordDocument, Variant writePasswordDocument) {
		Dispatch.call(this, "CreateHeaderSource", name, passwordDocument, writePasswordDocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param passwordDocument an input-parameter of type Variant
	 */
	public void createHeaderSource(String name, Variant passwordDocument) {
		Dispatch.call(this, "CreateHeaderSource", name, passwordDocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void createHeaderSource(String name) {
		Dispatch.call(this, "CreateHeaderSource", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type String
	 * @param passwordDocument an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param headerRecord an input-parameter of type Variant
	 */
	public void createHeaderSource(String name, Variant passwordDocument, Variant writePasswordDocument, Variant headerRecord) {
		Dispatch.call(this, "CreateHeaderSource", name, passwordDocument, writePasswordDocument, headerRecord);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant connection, Variant sQLStatement, Variant sQLStatement1) {
		Dispatch.callN(this, "OpenDataSource2000", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, connection, sQLStatement, sQLStatement1});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant connection, Variant sQLStatement) {
		Dispatch.callN(this, "OpenDataSource2000", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, connection, sQLStatement});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant connection) {
		Dispatch.callN(this, "OpenDataSource2000", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, connection});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate) {
		Dispatch.callN(this, "OpenDataSource2000", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument) {
		Dispatch.callN(this, "OpenDataSource2000", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert) {
		Dispatch.callN(this, "OpenDataSource2000", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate) {
		Dispatch.call(this, "OpenDataSource2000", name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument) {
		Dispatch.call(this, "OpenDataSource2000", name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles) {
		Dispatch.call(this, "OpenDataSource2000", name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource) {
		Dispatch.call(this, "OpenDataSource2000", name, format, confirmConversions, readOnly, linkToSource);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly) {
		Dispatch.call(this, "OpenDataSource2000", name, format, confirmConversions, readOnly);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions) {
		Dispatch.call(this, "OpenDataSource2000", name, format, confirmConversions);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format) {
		Dispatch.call(this, "OpenDataSource2000", name, format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void openDataSource2000(String name) {
		Dispatch.call(this, "OpenDataSource2000", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 */
	public void openDataSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant connection, Variant sQLStatement, Variant sQLStatement1) {
		Dispatch.callN(this, "OpenDataSource2000", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, connection, sQLStatement, sQLStatement1});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 */
	public void openHeaderSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate) {
		Dispatch.callN(this, "OpenHeaderSource2000", new Object[] { name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 */
	public void openHeaderSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument) {
		Dispatch.callN(this, "OpenHeaderSource2000", new Object[] { name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 */
	public void openHeaderSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert) {
		Dispatch.call(this, "OpenHeaderSource2000", name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 */
	public void openHeaderSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate) {
		Dispatch.call(this, "OpenHeaderSource2000", name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 */
	public void openHeaderSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument) {
		Dispatch.call(this, "OpenHeaderSource2000", name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void openHeaderSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles) {
		Dispatch.call(this, "OpenHeaderSource2000", name, format, confirmConversions, readOnly, addToRecentFiles);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 */
	public void openHeaderSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly) {
		Dispatch.call(this, "OpenHeaderSource2000", name, format, confirmConversions, readOnly);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 */
	public void openHeaderSource2000(String name, Variant format, Variant confirmConversions) {
		Dispatch.call(this, "OpenHeaderSource2000", name, format, confirmConversions);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 */
	public void openHeaderSource2000(String name, Variant format) {
		Dispatch.call(this, "OpenHeaderSource2000", name, format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void openHeaderSource2000(String name) {
		Dispatch.call(this, "OpenHeaderSource2000", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 */
	public void openHeaderSource2000(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate) {
		Dispatch.callN(this, "OpenHeaderSource2000", new Object[] { name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pause an input-parameter of type Variant
	 */
	public void execute(Variant pause) {
		Dispatch.call(this, "Execute", pause);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void execute() {
		Dispatch.call(this, "Execute");
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param pause an input-parameter of type Variant
	 */
	public void execute(Variant pause) {
		Dispatch.call(this, "Execute", pause);

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void check() {
		Dispatch.call(this, "Check");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void editDataSource() {
		Dispatch.call(this, "EditDataSource");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void editHeaderSource() {
		Dispatch.call(this, "EditHeaderSource");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void editMainDocument() {
		Dispatch.call(this, "EditMainDocument");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type String
	 */
	public void useAddressBook(String type) {
		Dispatch.call(this, "UseAddressBook", type);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHighlightMergeFields() {
		return Dispatch.get(this, "HighlightMergeFields").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param highlightMergeFields an input-parameter of type boolean
	 */
	public void setHighlightMergeFields(boolean highlightMergeFields) {
		Dispatch.put(this, "HighlightMergeFields", new Variant(highlightMergeFields));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getMailFormat() {
		return Dispatch.get(this, "MailFormat").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param mailFormat an input-parameter of type int
	 */
	public void setMailFormat(int mailFormat) {
		Dispatch.put(this, "MailFormat", new Variant(mailFormat));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getShowSendToCustom() {
		return Dispatch.get(this, "ShowSendToCustom").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param showSendToCustom an input-parameter of type String
	 */
	public void setShowSendToCustom(String showSendToCustom) {
		Dispatch.put(this, "ShowSendToCustom", showSendToCustom);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getWizardState() {
		return Dispatch.get(this, "WizardState").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param wizardState an input-parameter of type int
	 */
	public void setWizardState(int wizardState) {
		Dispatch.put(this, "WizardState", new Variant(wizardState));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param openExclusive an input-parameter of type Variant
	 * @param subType an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant connection, Variant sQLStatement, Variant sQLStatement1, Variant openExclusive, Variant subType) {
		Dispatch.callN(this, "OpenDataSource", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, connection, sQLStatement, sQLStatement1, openExclusive, subType});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param openExclusive an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant connection, Variant sQLStatement, Variant sQLStatement1, Variant openExclusive) {
		Dispatch.callN(this, "OpenDataSource", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, connection, sQLStatement, sQLStatement1, openExclusive});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant connection, Variant sQLStatement, Variant sQLStatement1) {
		Dispatch.callN(this, "OpenDataSource", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, connection, sQLStatement, sQLStatement1});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant connection, Variant sQLStatement) {
		Dispatch.callN(this, "OpenDataSource", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, connection, sQLStatement});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant connection) {
		Dispatch.callN(this, "OpenDataSource", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, connection});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate) {
		Dispatch.callN(this, "OpenDataSource", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument) {
		Dispatch.callN(this, "OpenDataSource", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert) {
		Dispatch.callN(this, "OpenDataSource", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate) {
		Dispatch.call(this, "OpenDataSource", name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument) {
		Dispatch.call(this, "OpenDataSource", name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles) {
		Dispatch.call(this, "OpenDataSource", name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource) {
		Dispatch.call(this, "OpenDataSource", name, format, confirmConversions, readOnly, linkToSource);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly) {
		Dispatch.call(this, "OpenDataSource", name, format, confirmConversions, readOnly);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions) {
		Dispatch.call(this, "OpenDataSource", name, format, confirmConversions);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format) {
		Dispatch.call(this, "OpenDataSource", name, format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void openDataSource(String name) {
		Dispatch.call(this, "OpenDataSource", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param linkToSource an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param connection an input-parameter of type Variant
	 * @param sQLStatement an input-parameter of type Variant
	 * @param sQLStatement1 an input-parameter of type Variant
	 * @param openExclusive an input-parameter of type Variant
	 * @param subType an input-parameter of type Variant
	 */
	public void openDataSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant linkToSource, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant connection, Variant sQLStatement, Variant sQLStatement1, Variant openExclusive, Variant subType) {
		Dispatch.callN(this, "OpenDataSource", new Object[] { name, format, confirmConversions, readOnly, linkToSource, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, connection, sQLStatement, sQLStatement1, openExclusive, subType});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param openExclusive an input-parameter of type Variant
	 */
	public void openHeaderSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant openExclusive) {
		Dispatch.callN(this, "OpenHeaderSource", new Object[] { name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, openExclusive});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 */
	public void openHeaderSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate) {
		Dispatch.callN(this, "OpenHeaderSource", new Object[] { name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 */
	public void openHeaderSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument) {
		Dispatch.callN(this, "OpenHeaderSource", new Object[] { name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument});
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 */
	public void openHeaderSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert) {
		Dispatch.call(this, "OpenHeaderSource", name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 */
	public void openHeaderSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate) {
		Dispatch.call(this, "OpenHeaderSource", name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 */
	public void openHeaderSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument) {
		Dispatch.call(this, "OpenHeaderSource", name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 */
	public void openHeaderSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles) {
		Dispatch.call(this, "OpenHeaderSource", name, format, confirmConversions, readOnly, addToRecentFiles);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 */
	public void openHeaderSource(String name, Variant format, Variant confirmConversions, Variant readOnly) {
		Dispatch.call(this, "OpenHeaderSource", name, format, confirmConversions, readOnly);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 */
	public void openHeaderSource(String name, Variant format, Variant confirmConversions) {
		Dispatch.call(this, "OpenHeaderSource", name, format, confirmConversions);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 */
	public void openHeaderSource(String name, Variant format) {
		Dispatch.call(this, "OpenHeaderSource", name, format);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 */
	public void openHeaderSource(String name) {
		Dispatch.call(this, "OpenHeaderSource", name);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type String
	 * @param format an input-parameter of type Variant
	 * @param confirmConversions an input-parameter of type Variant
	 * @param readOnly an input-parameter of type Variant
	 * @param addToRecentFiles an input-parameter of type Variant
	 * @param passwordDocument an input-parameter of type Variant
	 * @param passwordTemplate an input-parameter of type Variant
	 * @param revert an input-parameter of type Variant
	 * @param writePasswordDocument an input-parameter of type Variant
	 * @param writePasswordTemplate an input-parameter of type Variant
	 * @param openExclusive an input-parameter of type Variant
	 */
	public void openHeaderSource(String name, Variant format, Variant confirmConversions, Variant readOnly, Variant addToRecentFiles, Variant passwordDocument, Variant passwordTemplate, Variant revert, Variant writePasswordDocument, Variant writePasswordTemplate, Variant openExclusive) {
		Dispatch.callN(this, "OpenHeaderSource", new Object[] { name, format, confirmConversions, readOnly, addToRecentFiles, passwordDocument, passwordTemplate, revert, writePasswordDocument, writePasswordTemplate, openExclusive});

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param initialState an input-parameter of type Variant
	 * @param showDocumentStep an input-parameter of type Variant
	 * @param showTemplateStep an input-parameter of type Variant
	 * @param showDataStep an input-parameter of type Variant
	 * @param showWriteStep an input-parameter of type Variant
	 * @param showPreviewStep an input-parameter of type Variant
	 * @param showMergeStep an input-parameter of type Variant
	 */
	public void showWizard(Variant initialState, Variant showDocumentStep, Variant showTemplateStep, Variant showDataStep, Variant showWriteStep, Variant showPreviewStep, Variant showMergeStep) {
		Dispatch.call(this, "ShowWizard", initialState, showDocumentStep, showTemplateStep, showDataStep, showWriteStep, showPreviewStep, showMergeStep);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param initialState an input-parameter of type Variant
	 * @param showDocumentStep an input-parameter of type Variant
	 * @param showTemplateStep an input-parameter of type Variant
	 * @param showDataStep an input-parameter of type Variant
	 * @param showWriteStep an input-parameter of type Variant
	 * @param showPreviewStep an input-parameter of type Variant
	 */
	public void showWizard(Variant initialState, Variant showDocumentStep, Variant showTemplateStep, Variant showDataStep, Variant showWriteStep, Variant showPreviewStep) {
		Dispatch.call(this, "ShowWizard", initialState, showDocumentStep, showTemplateStep, showDataStep, showWriteStep, showPreviewStep);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param initialState an input-parameter of type Variant
	 * @param showDocumentStep an input-parameter of type Variant
	 * @param showTemplateStep an input-parameter of type Variant
	 * @param showDataStep an input-parameter of type Variant
	 * @param showWriteStep an input-parameter of type Variant
	 */
	public void showWizard(Variant initialState, Variant showDocumentStep, Variant showTemplateStep, Variant showDataStep, Variant showWriteStep) {
		Dispatch.call(this, "ShowWizard", initialState, showDocumentStep, showTemplateStep, showDataStep, showWriteStep);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param initialState an input-parameter of type Variant
	 * @param showDocumentStep an input-parameter of type Variant
	 * @param showTemplateStep an input-parameter of type Variant
	 * @param showDataStep an input-parameter of type Variant
	 */
	public void showWizard(Variant initialState, Variant showDocumentStep, Variant showTemplateStep, Variant showDataStep) {
		Dispatch.call(this, "ShowWizard", initialState, showDocumentStep, showTemplateStep, showDataStep);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param initialState an input-parameter of type Variant
	 * @param showDocumentStep an input-parameter of type Variant
	 * @param showTemplateStep an input-parameter of type Variant
	 */
	public void showWizard(Variant initialState, Variant showDocumentStep, Variant showTemplateStep) {
		Dispatch.call(this, "ShowWizard", initialState, showDocumentStep, showTemplateStep);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param initialState an input-parameter of type Variant
	 * @param showDocumentStep an input-parameter of type Variant
	 */
	public void showWizard(Variant initialState, Variant showDocumentStep) {
		Dispatch.call(this, "ShowWizard", initialState, showDocumentStep);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param initialState an input-parameter of type Variant
	 */
	public void showWizard(Variant initialState) {
		Dispatch.call(this, "ShowWizard", initialState);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param initialState an input-parameter of type Variant
	 * @param showDocumentStep an input-parameter of type Variant
	 * @param showTemplateStep an input-parameter of type Variant
	 * @param showDataStep an input-parameter of type Variant
	 * @param showWriteStep an input-parameter of type Variant
	 * @param showPreviewStep an input-parameter of type Variant
	 * @param showMergeStep an input-parameter of type Variant
	 */
	public void showWizard(Variant initialState, Variant showDocumentStep, Variant showTemplateStep, Variant showDataStep, Variant showWriteStep, Variant showPreviewStep, Variant showMergeStep) {
		Dispatch.call(this, "ShowWizard", initialState, showDocumentStep, showTemplateStep, showDataStep, showWriteStep, showPreviewStep, showMergeStep);

	}

}
