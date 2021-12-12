/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Mailer extends Dispatch {

	public static final String componentName = "Word.Mailer";

	public Mailer() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Mailer(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Mailer(String compName) {
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
	 * @return the result is of type Variant
	 */
	public Variant getBCCRecipients() {
		return Dispatch.get(this, "BCCRecipients");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param bCCRecipients an input-parameter of type Variant
	 */
	public void setBCCRecipients(Variant bCCRecipients) {
		Dispatch.put(this, "BCCRecipients", bCCRecipients);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getCCRecipients() {
		return Dispatch.get(this, "CCRecipients");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param cCRecipients an input-parameter of type Variant
	 */
	public void setCCRecipients(Variant cCRecipients) {
		Dispatch.put(this, "CCRecipients", cCRecipients);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getRecipients() {
		return Dispatch.get(this, "Recipients");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param recipients an input-parameter of type Variant
	 */
	public void setRecipients(Variant recipients) {
		Dispatch.put(this, "Recipients", recipients);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Variant
	 */
	public Variant getEnclosures() {
		return Dispatch.get(this, "Enclosures");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param enclosures an input-parameter of type Variant
	 */
	public void setEnclosures(Variant enclosures) {
		Dispatch.put(this, "Enclosures", enclosures);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSender() {
		return Dispatch.get(this, "Sender").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type java.util.Date
	 */
	public java.util.Date getSendDateTime() {
		return Dispatch.get(this, "SendDateTime").getJavaDate();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getReceived() {
		return Dispatch.get(this, "Received").changeType(Variant.VariantBoolean).getBoolean();
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

}
