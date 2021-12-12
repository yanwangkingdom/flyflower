/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class DocumentEvents2 extends Dispatch {

	public static final String componentName = "Word.DocumentEvents2";

	public DocumentEvents2() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public DocumentEvents2(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public DocumentEvents2(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void m_new() {
		Dispatch.call(this, "New");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void open() {
		Dispatch.call(this, "Open");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void close() {
		Dispatch.call(this, "Close");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param syncEventType an input-parameter of type MsoSyncEventType
	 */
	public void sync(MsoSyncEventType syncEventType) {
		Dispatch.call(this, "Sync", syncEventType);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param newXMLNode an input-parameter of type XMLNode
	 * @param inUndoRedo an input-parameter of type boolean
	 */
	public void xMLAfterInsert(XMLNode newXMLNode, boolean inUndoRedo) {
		Dispatch.call(this, "XMLAfterInsert", newXMLNode, new Variant(inUndoRedo));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param deletedRange an input-parameter of type Range
	 * @param oldXMLNode an input-parameter of type XMLNode
	 * @param inUndoRedo an input-parameter of type boolean
	 */
	public void xMLBeforeDelete(Range deletedRange, XMLNode oldXMLNode, boolean inUndoRedo) {
		Dispatch.call(this, "XMLBeforeDelete", deletedRange, oldXMLNode, new Variant(inUndoRedo));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param newContentControl an input-parameter of type ContentControl
	 * @param inUndoRedo an input-parameter of type boolean
	 */
	public void contentControlAfterAdd(ContentControl newContentControl, boolean inUndoRedo) {
		Dispatch.call(this, "ContentControlAfterAdd", newContentControl, new Variant(inUndoRedo));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param oldContentControl an input-parameter of type ContentControl
	 * @param inUndoRedo an input-parameter of type boolean
	 */
	public void contentControlBeforeDelete(ContentControl oldContentControl, boolean inUndoRedo) {
		Dispatch.call(this, "ContentControlBeforeDelete", oldContentControl, new Variant(inUndoRedo));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param contentControl an input-parameter of type ContentControl
	 * @param cancel an input-parameter of type boolean
	 */
	public void contentControlOnExit(ContentControl contentControl, boolean cancel) {
		Dispatch.call(this, "ContentControlOnExit", contentControl, new Variant(cancel));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param contentControl an input-parameter of type ContentControl
	 * @param cancel is an one-element array which sends the input-parameter
	 *               to the ActiveX-Component and receives the output-parameter
	 */
	public void contentControlOnExit(ContentControl contentControl, boolean[] cancel) {
		Variant vnt_cancel = new Variant();
		if( cancel == null || cancel.length == 0 )
			vnt_cancel.putNoParam();
		else
			vnt_cancel.putBooleanRef(cancel[0]);

		Dispatch.call(this, "ContentControlOnExit", contentControl, vnt_cancel);

		if( cancel != null && cancel.length > 0 )
			cancel[0] = vnt_cancel.toBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param contentControl an input-parameter of type ContentControl
	 */
	public void contentControlOnEnter(ContentControl contentControl) {
		Dispatch.call(this, "ContentControlOnEnter", contentControl);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param contentControl an input-parameter of type ContentControl
	 * @param content an input-parameter of type String
	 */
	public void contentControlBeforeStoreUpdate(ContentControl contentControl, String content) {
		Dispatch.call(this, "ContentControlBeforeStoreUpdate", contentControl, content);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param contentControl an input-parameter of type ContentControl
	 * @param content is an one-element array which sends the input-parameter
	 *                to the ActiveX-Component and receives the output-parameter
	 */
	public void contentControlBeforeStoreUpdate(ContentControl contentControl, String[] content) {
		Variant vnt_content = new Variant();
		if( content == null || content.length == 0 )
			vnt_content.putNoParam();
		else
			vnt_content.putStringRef(content[0]);

		Dispatch.call(this, "ContentControlBeforeStoreUpdate", contentControl, vnt_content);

		if( content != null && content.length > 0 )
			content[0] = vnt_content.toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param contentControl an input-parameter of type ContentControl
	 * @param content an input-parameter of type String
	 */
	public void contentControlBeforeContentUpdate(ContentControl contentControl, String content) {
		Dispatch.call(this, "ContentControlBeforeContentUpdate", contentControl, content);
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param contentControl an input-parameter of type ContentControl
	 * @param content is an one-element array which sends the input-parameter
	 *                to the ActiveX-Component and receives the output-parameter
	 */
	public void contentControlBeforeContentUpdate(ContentControl contentControl, String[] content) {
		Variant vnt_content = new Variant();
		if( content == null || content.length == 0 )
			vnt_content.putNoParam();
		else
			vnt_content.putStringRef(content[0]);

		Dispatch.call(this, "ContentControlBeforeContentUpdate", contentControl, vnt_content);

		if( content != null && content.length > 0 )
			content[0] = vnt_content.toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param range an input-parameter of type Range
	 * @param name an input-parameter of type String
	 * @param category an input-parameter of type String
	 * @param blockType an input-parameter of type String
	 * @param template an input-parameter of type String
	 */
	public void buildingBlockInsert(Range range, String name, String category, String blockType, String template) {
		Dispatch.call(this, "BuildingBlockInsert", range, name, category, blockType, template);
	}

}
