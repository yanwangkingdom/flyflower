/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class MailMergeDataSource extends Dispatch {

	public static final String componentName = "Word.MailMergeDataSource";

	public MailMergeDataSource() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public MailMergeDataSource(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public MailMergeDataSource(String compName) {
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
	 * @return the result is of type String
	 */
	public String getHeaderSourceName() {
		return Dispatch.get(this, "HeaderSourceName").toString();
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
	 * @return the result is of type int
	 */
	public int getHeaderSourceType() {
		return Dispatch.get(this, "HeaderSourceType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getConnectString() {
		return Dispatch.get(this, "ConnectString").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getQueryString() {
		return Dispatch.get(this, "QueryString").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param queryString an input-parameter of type String
	 */
	public void setQueryString(String queryString) {
		Dispatch.put(this, "QueryString", queryString);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getActiveRecord() {
		return Dispatch.get(this, "ActiveRecord").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param activeRecord an input-parameter of type int
	 */
	public void setActiveRecord(int activeRecord) {
		Dispatch.put(this, "ActiveRecord", new Variant(activeRecord));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getFirstRecord() {
		return Dispatch.get(this, "FirstRecord").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param firstRecord an input-parameter of type int
	 */
	public void setFirstRecord(int firstRecord) {
		Dispatch.put(this, "FirstRecord", new Variant(firstRecord));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLastRecord() {
		return Dispatch.get(this, "LastRecord").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lastRecord an input-parameter of type int
	 */
	public void setLastRecord(int lastRecord) {
		Dispatch.put(this, "LastRecord", new Variant(lastRecord));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MailMergeFieldNames
	 */
	public MailMergeFieldNames getFieldNames() {
		return new MailMergeFieldNames(Dispatch.get(this, "FieldNames").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MailMergeDataFields
	 */
	public MailMergeDataFields getDataFields() {
		return new MailMergeDataFields(Dispatch.get(this, "DataFields").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type String
	 * @param field an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean findRecord2000(String findText, String field) {
		return Dispatch.call(this, "FindRecord2000", findText, field).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRecordCount() {
		return Dispatch.get(this, "RecordCount").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIncluded() {
		return Dispatch.get(this, "Included").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param included an input-parameter of type boolean
	 */
	public void setIncluded(boolean included) {
		Dispatch.put(this, "Included", new Variant(included));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getInvalidAddress() {
		return Dispatch.get(this, "InvalidAddress").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param invalidAddress an input-parameter of type boolean
	 */
	public void setInvalidAddress(boolean invalidAddress) {
		Dispatch.put(this, "InvalidAddress", new Variant(invalidAddress));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getInvalidComments() {
		return Dispatch.get(this, "InvalidComments").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param invalidComments an input-parameter of type String
	 */
	public void setInvalidComments(String invalidComments) {
		Dispatch.put(this, "InvalidComments", invalidComments);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MappedDataFields
	 */
	public MappedDataFields getMappedDataFields() {
		return new MappedDataFields(Dispatch.get(this, "MappedDataFields").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getTableName() {
		return Dispatch.get(this, "TableName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type String
	 * @param field an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean findRecord(String findText, Variant field) {
		return Dispatch.call(this, "FindRecord", findText, field).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param findText an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean findRecord(String findText) {
		return Dispatch.call(this, "FindRecord", findText).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param findText an input-parameter of type String
	 * @param field an input-parameter of type Variant
	 * @return the result is of type boolean
	 */
	public boolean findRecord(String findText, Variant field) {
		boolean result_of_FindRecord = Dispatch.call(this, "FindRecord", findText, field).changeType(Variant.VariantBoolean).getBoolean();


		return result_of_FindRecord;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param included an input-parameter of type boolean
	 */
	public void setAllIncludedFlags(boolean included) {
		Dispatch.call(this, "SetAllIncludedFlags", new Variant(included));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param invalid an input-parameter of type boolean
	 * @param invalidComment an input-parameter of type String
	 */
	public void setAllErrorFlags(boolean invalid, String invalidComment) {
		Dispatch.call(this, "SetAllErrorFlags", new Variant(invalid), invalidComment);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void close() {
		Dispatch.call(this, "Close");
	}

}
