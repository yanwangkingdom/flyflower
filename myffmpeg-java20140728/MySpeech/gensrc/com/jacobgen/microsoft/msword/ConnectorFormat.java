/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class ConnectorFormat extends Dispatch {

	public static final String componentName = "Word.ConnectorFormat";

	public ConnectorFormat() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public ConnectorFormat(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public ConnectorFormat(String compName) {
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
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getBeginConnected() {
		return new MsoTriState(Dispatch.get(this, "BeginConnected").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Shape
	 */
	public Shape getBeginConnectedShape() {
		return new Shape(Dispatch.get(this, "BeginConnectedShape").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getBeginConnectionSite() {
		return Dispatch.get(this, "BeginConnectionSite").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type MsoTriState
	 */
	public MsoTriState getEndConnected() {
		return new MsoTriState(Dispatch.get(this, "EndConnected").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type Shape
	 */
	public Shape getEndConnectedShape() {
		return new Shape(Dispatch.get(this, "EndConnectedShape").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @return the result is of type int
	 */
	public int getEndConnectionSite() {
		return Dispatch.get(this, "EndConnectionSite").changeType(Variant.VariantInt).getInt();
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
	 * @return the result is of type MsoConnectorType
	 */
	public MsoConnectorType getType() {
		return new MsoConnectorType(Dispatch.get(this, "Type").toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param type an input-parameter of type MsoConnectorType
	 */
	public void setType(MsoConnectorType type) {
		Dispatch.put(this, "Type", type);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param connectedShape an input-parameter of type VT_PTR
	 * @param connectionSite an input-parameter of type int
	 */
	public void beginConnect(VT_PTR connectedShape, int connectionSite) {
		Dispatch.call(this, "BeginConnect", connectedShape, new Variant(connectionSite));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param connectedShape is an one-element array which sends the input-parameter
	 *                       to the ActiveX-Component and receives the output-parameter
	 * @param connectionSite an input-parameter of type int
	 */
	public void beginConnect(VT_PTR[] connectedShape, int connectionSite) {
		Variant vnt_connectedShape = new Variant();
		if( connectedShape == null || connectedShape.length == 0 )
			vnt_connectedShape.putNoParam();
		else
			vnt_connectedShape.putVT_PTRRef(connectedShape[0]);

		Dispatch.call(this, "BeginConnect", vnt_connectedShape, new Variant(connectionSite));

		if( connectedShape != null && connectedShape.length > 0 )
			connectedShape[0] = vnt_connectedShape.toVT_PTR();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void beginDisconnect() {
		Dispatch.call(this, "BeginDisconnect");
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param connectedShape an input-parameter of type VT_PTR
	 * @param connectionSite an input-parameter of type int
	 */
	public void endConnect(VT_PTR connectedShape, int connectionSite) {
		Dispatch.call(this, "EndConnect", connectedShape, new Variant(connectionSite));
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param connectedShape is an one-element array which sends the input-parameter
	 *                       to the ActiveX-Component and receives the output-parameter
	 * @param connectionSite an input-parameter of type int
	 */
	public void endConnect(VT_PTR[] connectedShape, int connectionSite) {
		Variant vnt_connectedShape = new Variant();
		if( connectedShape == null || connectedShape.length == 0 )
			vnt_connectedShape.putNoParam();
		else
			vnt_connectedShape.putVT_PTRRef(connectedShape[0]);

		Dispatch.call(this, "EndConnect", vnt_connectedShape, new Variant(connectionSite));

		if( connectedShape != null && connectedShape.length > 0 )
			connectedShape[0] = vnt_connectedShape.toVT_PTR();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 */
	public void endDisconnect() {
		Dispatch.call(this, "EndDisconnect");
	}

}
