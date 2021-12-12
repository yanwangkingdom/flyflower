/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class _LetterContent extends Dispatch {

	public static final String componentName = "Word._LetterContent";

	public _LetterContent() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public _LetterContent(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public _LetterContent(String compName) {
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
	 * @return the result is of type LetterContent
	 */
	public LetterContent getDuplicate() {
		return new LetterContent(Dispatch.get(this, "Duplicate").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getDateFormat() {
		return Dispatch.get(this, "DateFormat").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dateFormat an input-parameter of type String
	 */
	public void setDateFormat(String dateFormat) {
		Dispatch.put(this, "DateFormat", dateFormat);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getIncludeHeaderFooter() {
		return Dispatch.get(this, "IncludeHeaderFooter").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param includeHeaderFooter an input-parameter of type boolean
	 */
	public void setIncludeHeaderFooter(boolean includeHeaderFooter) {
		Dispatch.put(this, "IncludeHeaderFooter", new Variant(includeHeaderFooter));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getPageDesign() {
		return Dispatch.get(this, "PageDesign").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param pageDesign an input-parameter of type String
	 */
	public void setPageDesign(String pageDesign) {
		Dispatch.put(this, "PageDesign", pageDesign);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLetterStyle() {
		return Dispatch.get(this, "LetterStyle").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param letterStyle an input-parameter of type int
	 */
	public void setLetterStyle(int letterStyle) {
		Dispatch.put(this, "LetterStyle", new Variant(letterStyle));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getLetterhead() {
		return Dispatch.get(this, "Letterhead").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param letterhead an input-parameter of type boolean
	 */
	public void setLetterhead(boolean letterhead) {
		Dispatch.put(this, "Letterhead", new Variant(letterhead));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLetterheadLocation() {
		return Dispatch.get(this, "LetterheadLocation").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param letterheadLocation an input-parameter of type int
	 */
	public void setLetterheadLocation(int letterheadLocation) {
		Dispatch.put(this, "LetterheadLocation", new Variant(letterheadLocation));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type float
	 */
	public float getLetterheadSize() {
		return Dispatch.get(this, "LetterheadSize").changeType(Variant.VariantFloat).getFloat();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param letterheadSize an input-parameter of type float
	 */
	public void setLetterheadSize(float letterheadSize) {
		Dispatch.put(this, "LetterheadSize", new Variant(letterheadSize));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getRecipientName() {
		return Dispatch.get(this, "RecipientName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipientName an input-parameter of type String
	 */
	public void setRecipientName(String recipientName) {
		Dispatch.put(this, "RecipientName", recipientName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getRecipientAddress() {
		return Dispatch.get(this, "RecipientAddress").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipientAddress an input-parameter of type String
	 */
	public void setRecipientAddress(String recipientAddress) {
		Dispatch.put(this, "RecipientAddress", recipientAddress);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSalutation() {
		return Dispatch.get(this, "Salutation").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param salutation an input-parameter of type String
	 */
	public void setSalutation(String salutation) {
		Dispatch.put(this, "Salutation", salutation);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSalutationType() {
		return Dispatch.get(this, "SalutationType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param salutationType an input-parameter of type int
	 */
	public void setSalutationType(int salutationType) {
		Dispatch.put(this, "SalutationType", new Variant(salutationType));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getRecipientReference() {
		return Dispatch.get(this, "RecipientReference").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipientReference an input-parameter of type String
	 */
	public void setRecipientReference(String recipientReference) {
		Dispatch.put(this, "RecipientReference", recipientReference);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getMailingInstructions() {
		return Dispatch.get(this, "MailingInstructions").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param mailingInstructions an input-parameter of type String
	 */
	public void setMailingInstructions(String mailingInstructions) {
		Dispatch.put(this, "MailingInstructions", mailingInstructions);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getAttentionLine() {
		return Dispatch.get(this, "AttentionLine").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param attentionLine an input-parameter of type String
	 */
	public void setAttentionLine(String attentionLine) {
		Dispatch.put(this, "AttentionLine", attentionLine);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSubject() {
		return Dispatch.get(this, "Subject").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param subject an input-parameter of type String
	 */
	public void setSubject(String subject) {
		Dispatch.put(this, "Subject", subject);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getEnclosureNumber() {
		return Dispatch.get(this, "EnclosureNumber").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param enclosureNumber an input-parameter of type int
	 */
	public void setEnclosureNumber(int enclosureNumber) {
		Dispatch.put(this, "EnclosureNumber", new Variant(enclosureNumber));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getCCList() {
		return Dispatch.get(this, "CCList").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cCList an input-parameter of type String
	 */
	public void setCCList(String cCList) {
		Dispatch.put(this, "CCList", cCList);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getReturnAddress() {
		return Dispatch.get(this, "ReturnAddress").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param returnAddress an input-parameter of type String
	 */
	public void setReturnAddress(String returnAddress) {
		Dispatch.put(this, "ReturnAddress", returnAddress);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSenderName() {
		return Dispatch.get(this, "SenderName").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param senderName an input-parameter of type String
	 */
	public void setSenderName(String senderName) {
		Dispatch.put(this, "SenderName", senderName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getClosing() {
		return Dispatch.get(this, "Closing").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param closing an input-parameter of type String
	 */
	public void setClosing(String closing) {
		Dispatch.put(this, "Closing", closing);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSenderCompany() {
		return Dispatch.get(this, "SenderCompany").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param senderCompany an input-parameter of type String
	 */
	public void setSenderCompany(String senderCompany) {
		Dispatch.put(this, "SenderCompany", senderCompany);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSenderJobTitle() {
		return Dispatch.get(this, "SenderJobTitle").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param senderJobTitle an input-parameter of type String
	 */
	public void setSenderJobTitle(String senderJobTitle) {
		Dispatch.put(this, "SenderJobTitle", senderJobTitle);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSenderInitials() {
		return Dispatch.get(this, "SenderInitials").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param senderInitials an input-parameter of type String
	 */
	public void setSenderInitials(String senderInitials) {
		Dispatch.put(this, "SenderInitials", senderInitials);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getInfoBlock() {
		return Dispatch.get(this, "InfoBlock").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param infoBlock an input-parameter of type boolean
	 */
	public void setInfoBlock(boolean infoBlock) {
		Dispatch.put(this, "InfoBlock", new Variant(infoBlock));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getRecipientCode() {
		return Dispatch.get(this, "RecipientCode").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipientCode an input-parameter of type String
	 */
	public void setRecipientCode(String recipientCode) {
		Dispatch.put(this, "RecipientCode", recipientCode);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getRecipientGender() {
		return Dispatch.get(this, "RecipientGender").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipientGender an input-parameter of type int
	 */
	public void setRecipientGender(int recipientGender) {
		Dispatch.put(this, "RecipientGender", new Variant(recipientGender));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getReturnAddressShortForm() {
		return Dispatch.get(this, "ReturnAddressShortForm").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param returnAddressShortForm an input-parameter of type String
	 */
	public void setReturnAddressShortForm(String returnAddressShortForm) {
		Dispatch.put(this, "ReturnAddressShortForm", returnAddressShortForm);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSenderCity() {
		return Dispatch.get(this, "SenderCity").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param senderCity an input-parameter of type String
	 */
	public void setSenderCity(String senderCity) {
		Dispatch.put(this, "SenderCity", senderCity);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSenderCode() {
		return Dispatch.get(this, "SenderCode").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param senderCode an input-parameter of type String
	 */
	public void setSenderCode(String senderCode) {
		Dispatch.put(this, "SenderCode", senderCode);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getSenderGender() {
		return Dispatch.get(this, "SenderGender").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param senderGender an input-parameter of type int
	 */
	public void setSenderGender(int senderGender) {
		Dispatch.put(this, "SenderGender", new Variant(senderGender));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSenderReference() {
		return Dispatch.get(this, "SenderReference").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param senderReference an input-parameter of type String
	 */
	public void setSenderReference(String senderReference) {
		Dispatch.put(this, "SenderReference", senderReference);
	}

}
