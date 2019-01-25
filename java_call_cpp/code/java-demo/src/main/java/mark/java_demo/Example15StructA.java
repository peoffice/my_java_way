package mark.java_demo;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

@FieldOrder({"val"})
public class Example15StructA extends Structure {
	public static class ByReference extends Example15StructA implements Structure.ByReference {}

	public int val;
}