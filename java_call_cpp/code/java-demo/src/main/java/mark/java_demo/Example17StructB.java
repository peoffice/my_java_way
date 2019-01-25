package mark.java_demo;

import com.sun.jna.Structure.FieldOrder;
import com.sun.jna.Structure;

@FieldOrder({"numVals","vals"})
public class Example17StructB extends Structure {
	public static class ByReference extends Example17StructB implements Structure.ByReference {}

	public int numVals;
	public Example17StructA.ByReference vals;
}
