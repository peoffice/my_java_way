package mark.java_demo;

import java.util.List;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

@FieldOrder({"r1","r2","r3","r4","r5","r6","L1"})
public class Level_2  extends Structure{
	public static class ByReference extends Level_2 implements Structure.ByReference 
	{
	}
	public static class ByValue extends Level_2 implements Structure.ByValue 
	{
	}
	public double r1;
	public double r2;
	public double r3;
	public double r4;
	public double r5;
	public double r6;
	
	public Level_1.ByValue L1 = new Level_1.ByValue();
}
