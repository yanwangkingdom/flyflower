/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class Broadcast extends Dispatch {

	public static final String componentName = "Word.Broadcast";

	public Broadcast() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public Broadcast(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public Broadcast(String compName) {
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
	 * @return the result is of type Object
	 */
	public Object getParent() {
		return Dispatch.get(this, "Parent");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getAttendeeUrl() {
		return Dispatch.get(this, "AttendeeUrl").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoBroadcastState
	 */
	public MsoBroadcastState getState() {
		return new MsoBroadcastState(Dispatch.get(this, "State").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getCapabilities() {
		return Dispatch.get(this, "Capabilities").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getPresenterServiceUrl() {
		return Dispatch.get(this, "PresenterServiceUrl").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getSessionID() {
		return Dispatch.get(this, "SessionID").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param serverUrl an input-parameter of type String
	 */
	public void start(String serverUrl) {
		Dispatch.call(this, "Start", serverUrl);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void pause() {
		Dispatch.call(this, "Pause");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void resume() {
		Dispatch.call(this, "Resume");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void end() {
		Dispatch.call(this, "End");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param notesUrl an input-parameter of type String
	 * @param notesWacUrl an input-parameter of type String
	 */
	public void addMeetingNotes(String notesUrl, String notesWacUrl) {
		Dispatch.call(this, "AddMeetingNotes", notesUrl, notesWacUrl);
	}

}
