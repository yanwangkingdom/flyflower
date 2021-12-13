/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class XMLMapping extends Dispatch {

	public static final String componentName = "Word.XMLMapping";

	public XMLMapping() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public XMLMapping(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public XMLMapping(String compName) {
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
	 * @return the result is of type boolean
	 */
	public boolean getIsMapped() {
		return Dispatch.get(this, "IsMapped").changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type CustomXMLPart
	 */
	public CustomXMLPart getCustomXMLPart() {
		return new CustomXMLPart(Dispatch.get(this, "CustomXMLPart").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type CustomXMLNode
	 */
	public CustomXMLNode getCustomXMLNode() {
		return new CustomXMLNode(Dispatch.get(this, "CustomXMLNode").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @param source an input-parameter of type CustomXMLPart
	 * @return the result is of type boolean
	 */
	public boolean setMapping(String xPath, String prefixMapping, CustomXMLPart source) {
		return Dispatch.call(this, "SetMapping", xPath, prefixMapping, source).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean setMapping(String xPath, String prefixMapping) {
		return Dispatch.call(this, "SetMapping", xPath, prefixMapping).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean setMapping(String xPath) {
		return Dispatch.call(this, "SetMapping", xPath).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param xPath an input-parameter of type String
	 * @param prefixMapping an input-parameter of type String
	 * @param source an input-parameter of type CustomXMLPart
	 * @return the result is of type boolean
	 */
	public boolean setMapping(String xPath, String prefixMapping, CustomXMLPart source) {
		boolean result_of_SetMapping = Dispatch.call(this, "SetMapping", xPath, prefixMapping, source).changeType(Variant.VariantBoolean).getBoolean();


		return result_of_SetMapping;
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void delete() {
		Dispatch.call(this, "Delete");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param node an input-parameter of type CustomXMLNode
	 * @return the result is of type boolean
	 */
	public boolean setMappingByNode(CustomXMLNode node) {
		return Dispatch.call(this, "SetMappingByNode", node).changeType(Variant.VariantBoolean).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getXPath() {
		return Dispatch.get(this, "XPath").toString();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type String
	 */
	public String getPrefixMappings() {
		return Dispatch.get(this, "PrefixMappings").toString();
	}

}
