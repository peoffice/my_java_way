package mark.java_demo;

import java.util.List;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

@FieldOrder({"r1","r2","r3","r4","r5","r6","L3"})
public class Level_4  extends Structure{
	public static class ByReference extends Level_4 implements Structure.ByReference 
	{
	}
	public static class ByValue extends Level_4 implements Structure.ByValue 
	{
	}
	public double r1;
	public double r2;
	public double r3;
	public double r4;
	public double r5;
	public double r6;
	
	public Level_3.ByValue L3 = new Level_3.ByValue();
}
