/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.jacobgen.microsoft.msword;

import com.jacob.com.*;

public class BuildingBlockEntries extends Dispatch {

	public static final String componentName = "Word.BuildingBlockEntries";

	public BuildingBlockEntries() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public BuildingBlockEntries(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public BuildingBlockEntries(String compName) {
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
	public int getCount() {
		return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param index an input-parameter of type Variant
	 * @return the result is of type BuildingBlock
	 */
	public BuildingBlock item(Variant index) {
		return new BuildingBlock(Dispatch.call(this, "Item", index).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param type an input-parameter of type int
	 * @param category an input-parameter of type String
	 * @param range an input-parameter of type Range
	 * @param description an input-parameter of type Variant
	 * @param insertOptions an input-parameter of type int
	 * @return the result is of type BuildingBlock
	 */
	public BuildingBlock add(String name, int type, String category, Range range, Variant description, int insertOptions) {
		return new BuildingBlock(Dispatch.call(this, "Add", name, new Variant(type), category, range, description, new Variant(insertOptions)).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param type an input-parameter of type int
	 * @param category an input-parameter of type String
	 * @param range an input-parameter of type Range
	 * @param description an input-parameter of type Variant
	 * @return the result is of type BuildingBlock
	 */
	public BuildingBlock add(String name, int type, String category, Range range, Variant description) {
		return new BuildingBlock(Dispatch.call(this, "Add", name, new Variant(type), category, range, description).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param name an input-parameter of type String
	 * @param type an input-parameter of type int
	 * @param category an input-parameter of type String
	 * @param range an input-parameter of type Range
	 * @return the result is of type BuildingBlock
	 */
	public BuildingBlock add(String name, int type, String category, Range range) {
		return new BuildingBlock(Dispatch.call(this, "Add", name, new Variant(type), category, range).toDispatch());
	}

	/**
	 * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
	 * @param name an input-parameter of type String
	 * @param type an input-parameter of type int
	 * @param category an input-parameter of type String
	 * @param range an input-parameter of type Range
	 * @param description an input-parameter of type Variant
	 * @param insertOptions an input-parameter of type int
	 * @return the result is of type BuildingBlock
	 */
	public BuildingBlock add(String name, int type, String category, Range range, Variant description, int insertOptions) {
		BuildingBlock result_of_Add = new BuildingBlock(Dispatch.call(this, "Add", name, new Variant(type), category, range, description, new Variant(insertOptions)).toDispatch());


		return result_of_Add;
	}

}
