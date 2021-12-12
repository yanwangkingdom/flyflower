/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class EmailSignature extends Dispatch {

	public static final String componentName = "Word.EmailSignature";

	public EmailSignature() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public EmailSignature(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public EmailSignature(String compName) {
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
	public String getNewMessageSignature() {
		return Dispatch.get(this, "NewMessageSignature").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param newMessageSignature an input-parameter of type String
	 */
	public void setNewMessageSignature(String newMessageSignature) {
		Dispatch.put(this, "NewMessageSignature", newMessageSignature);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getReplyMessageSignature() {
		return Dispatch.get(this, "ReplyMessageSignature").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param replyMessageSignature an input-parameter of type String
	 */
	public void setReplyMessageSignature(String replyMessageSignature) {
		Dispatch.put(this, "ReplyMessageSignature", replyMessageSignature);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type EmailSignatureEntries
	 */
	public EmailSignatureEntries getEmailSignatureEntries() {
		return new EmailSignatureEntries(Dispatch.get(this, "EmailSignatureEntries").toDispatch());
	}

}
