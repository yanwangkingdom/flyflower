/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class XMLNode extends Dispatch {

	public static final String componentName = "Word.XMLNode";

	public XMLNode() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public XMLNode(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public XMLNode(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getBaseName() {
		return Dispatch.get(this, "BaseName").toString();
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
	 * @return the result is of type Range
	 */
	public Range getRange() {
		return new Range(Dispatch.get(this, "Range").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getText() {
		return Dispatch.get(this, "Text").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param text an input-parameter of type String
	 */
	public void setText(String text) {
		Dispatch.put(this, "Text", text);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getNamespaceURI() {
		return Dispatch.get(this, "NamespaceURI").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param dataOnly an input-parameter of type boolean
	 * @return the result is of type String
	 */
	public String getXML(boolean dataOnly) {
		return Dispatch.call(this, "XML", new Variant(dataOnly)).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getXML() {
		return Dispatch.get(this, "XML").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param dataOnly an input-parameter of type boolean
	 * @return the result is of type String
	 */
	public String getXML(boolean dataOnly) {
		String result_of_XML = Dispatch.call(this, "XML", new Variant(dataOnly)).toString();


		return result_of_XML;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLNode
	 */
	public XMLNode getNextSibling() {
		return new XMLNode(Dispatch.get(this, "NextSibling").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLNode
	 */
	public XMLNode getPreviousSibling() {
		return new XMLNode(Dispatch.get(this, "PreviousSibling").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLNode
	 */
	public XMLNode getParentNode() {
		return new XMLNode(Dispatch.get(this, "ParentNode").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLNode
	 */
	public XMLNode getFirstChild() {
		return new XMLNode(Dispatch.get(this, "FirstChild").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLNode
	 */
	public XMLNode getLastChild() {
		return new XMLNode(Dispatch.get(this, "LastChild").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Document
	 */
	public Document getOwnerDocument() {
		return new Document(Dispatch.get(this, "OwnerDocument").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getNodeType() {
		return Dispatch.get(this, "NodeType").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes getChildNodes() {
		return new XMLNodes(Dispatch.get(this, "ChildNodes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes getAttributes() {
		return new XMLNodes(Dispatch.get(this, "Attributes").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getNodeValue() {
		return Dispatch.get(this, "NodeValue").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param nodeValue an input-parameter of type String
	 */
	public void setNodeValue(String nodeValue) {
		Dispatch.put(this, "NodeValue", nodeValue);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type boolean
	 */
	public boolean getHasChildNodes() {
		return Dispatch.get(this, "HasChildNodes").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @param fastSearchSkippingTextNodes an input-parameter of type boolean
	 * @return the result is of type XMLNode
	 */
	public XMLNode selectSingleNode(String xPath, String prefixMapping, boolean fastSearchSkippingTextNodes) {
		return new XMLNode(Dispatch.call(this, "SelectSingleNode", xPath, prefixMapping, new Variant(fastSearchSkippingTextNodes)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @return the result is of type XMLNode
	 */
	public XMLNode selectSingleNode(String xPath, String prefixMapping) {
		return new XMLNode(Dispatch.call(this, "SelectSingleNode", xPath, prefixMapping).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @return the result is of type XMLNode
	 */
	public XMLNode selectSingleNode(String xPath) {
		return new XMLNode(Dispatch.call(this, "SelectSingleNode", xPath).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @param fastSearchSkippingTextNodes an input-parameter of type boolean
	 * @return the result is of type XMLNode
	 */
	public XMLNode selectSingleNode(String xPath, String prefixMapping, boolean fastSearchSkippingTextNodes) {
		XMLNode result_of_SelectSingleNode = new XMLNode(Dispatch.call(this, "SelectSingleNode", xPath, prefixMapping, new Variant(fastSearchSkippingTextNodes)).toDispatch());


		return result_of_SelectSingleNode;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @param fastSearchSkippingTextNodes an input-parameter of type boolean
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes selectNodes(String xPath, String prefixMapping, boolean fastSearchSkippingTextNodes) {
		return new XMLNodes(Dispatch.call(this, "SelectNodes", xPath, prefixMapping, new Variant(fastSearchSkippingTextNodes)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes selectNodes(String xPath, String prefixMapping) {
		return new XMLNodes(Dispatch.call(this, "SelectNodes", xPath, prefixMapping).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes selectNodes(String xPath) {
		return new XMLNodes(Dispatch.call(this, "SelectNodes", xPath).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @param fastSearchSkippingTextNodes an input-parameter of type boolean
	 * @return the result is of type XMLNodes
	 */
	public XMLNodes selectNodes(String xPath, String prefixMapping, boolean fastSearchSkippingTextNodes) {
		XMLNodes result_of_SelectNodes = new XMLNodes(Dispatch.call(this, "SelectNodes", xPath, prefixMapping, new Variant(fastSearchSkippingTextNodes)).toDispatch());


		return result_of_SelectNodes;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type XMLChildNodeSuggestions
	 */
	public XMLChildNodeSuggestions getChildNodeSuggestions() {
		return new XMLChildNodeSuggestions(Dispatch.get(this, "ChildNodeSuggestions").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getLevel() {
		return Dispatch.get(this, "Level").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getValidationStatus() {
		return Dispatch.get(this, "ValidationStatus").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type SmartTag
	 */
	public SmartTag getSmartTag() {
		return new SmartTag(Dispatch.get(this, "SmartTag").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param advanced an input-parameter of type boolean
	 * @return the result is of type String
	 */
	public String getValidationErrorText(boolean advanced) {
		return Dispatch.call(this, "ValidationErrorText", new Variant(advanced)).toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getValidationErrorText() {
		return Dispatch.get(this, "ValidationErrorText").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param advanced an input-parameter of type boolean
	 * @return the result is of type String
	 */
	public String getValidationErrorText(boolean advanced) {
		String result_of_ValidationErrorText = Dispatch.call(this, "ValidationErrorText", new Variant(advanced)).toString();


		return result_of_ValidationErrorText;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getPlaceholderText() {
		return Dispatch.get(this, "PlaceholderText").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param placeholderText an input-parameter of type String
	 */
	public void setPlaceholderText(String placeholderText) {
		Dispatch.put(this, "PlaceholderText", placeholderText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void copy() {
		Dispatch.call(this, "Copy");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param childElement an input-parameter of type XMLNode
	 */
	public void removeChild(XMLNode childElement) {
		Dispatch.call(this, "RemoveChild", childElement);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void cut() {
		Dispatch.call(this, "Cut");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void validate() {
		Dispatch.call(this, "Validate");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param status an input-parameter of type int
	 * @param errorText an input-parameter of type Variant
	 * @param clearedAutomatically an input-parameter of type boolean
	 */
	public void setValidationError(int status, Variant errorText, boolean clearedAutomatically) {
		Dispatch.call(this, "SetValidationError", new Variant(status), errorText, new Variant(clearedAutomatically));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param status an input-parameter of type int
	 * @param errorText an input-parameter of type Variant
	 */
	public void setValidationError(int status, Variant errorText) {
		Dispatch.call(this, "SetValidationError", new Variant(status), errorText);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param status an input-parameter of type int
	 */
	public void setValidationError(int status) {
		Dispatch.call(this, "SetValidationError", new Variant(status));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param status an input-parameter of type int
	 * @param errorText an input-parameter of type Variant
	 * @param clearedAutomatically an input-parameter of type boolean
	 */
	public void setValidationError(int status, Variant errorText, boolean clearedAutomatically) {
		Dispatch.call(this, "SetValidationError", new Variant(status), errorText, new Variant(clearedAutomatically));

	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getWordOpenXML() {
		return Dispatch.get(this, "WordOpenXML").toString();
	}

}
