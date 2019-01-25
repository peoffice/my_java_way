package mark.java_demo;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;


@FieldOrder({"numVals","vals"})
public class Example17StructA extends Structure {
	public static class ByReference extends Example17StructA implements Structure.ByReference {}

	public int numVals;
	public Pointer vals; // char**
}
