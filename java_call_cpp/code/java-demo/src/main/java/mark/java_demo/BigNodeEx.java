package mark.java_demo;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

@FieldOrder({"r1","r2","r3","r4","r5","r6","r7","r8","r9","r10",
	"r11","r12","r13","r14","r15","r16","r17","r18","r19","r20",
	"r21","r22","r23","r24","r25","r26","r27","r28","r29","r30",
	"count","element"})
public class BigNodeEx  extends Structure{
	public static class ByReference extends BigNodeEx implements Structure.ByReference 
	{
	}
	public static class ByValue extends BigNodeEx implements Structure.ByValue 
	{
	}
	public double r1;
	public double r2;
	public double r3;
	public double r4;
	public double r5;
	public double r6;
	public double r7;
	public double r8;
	public double r9;
	public double r10;
	public double r11;
	public double r12;
	public double r13;
	public double r14;
	public double r15;
	public double r16;
	public double r17;
	public double r18;
	public double r19;
	public double r20;
	public double r21;
	public double r22;
	public double r23;
	public double r24;
	public double r25;
	public double r26;
	public double r27;
	public double r28;
	public double r29;
	public double r30;
	public double[] count = new double[200];
    public BigElementEx.ByReference element;
}

