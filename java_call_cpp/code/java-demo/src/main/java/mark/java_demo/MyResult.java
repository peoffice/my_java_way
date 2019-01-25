package mark.java_demo;

import java.util.List;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;


@FieldOrder({"r","r0","r1","r2","r3","r4","r5","r6","r7","r8"})
public class MyResult extends Structure{
	
	public static class ByReference extends MyResult implements Structure.ByReference 
	{
	}
	public static class ByValue extends MyResult implements Structure.ByValue 
	{
	}
	
	public double r;
	public double r0;

	public double r1;
	public double r2;
	public double r3;
	public double r4;
	public double r5;
	public double r6;
	public double r7;
	public double r8;

}
