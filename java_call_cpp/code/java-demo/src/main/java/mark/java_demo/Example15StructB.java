package mark.java_demo;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

@FieldOrder({"numAs","as"})
public class Example15StructB extends Structure {
	public static class ByReference extends Example15StructB implements Structure.ByReference {}

	public int numAs;
	public Example15StructA.ByReference as;
}
