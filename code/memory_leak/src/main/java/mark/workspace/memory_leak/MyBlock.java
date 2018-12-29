package mark.workspace.memory_leak;

import java.util.ArrayList;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

public class MyBlock extends Structure{
	public MyBlock(){
		super();
	}
	public MyBlock(final Pointer p){
		super(p);
		read();
	}
	
	public static class ByReference extends MyBlock implements Structure.ByReference {
		public ByReference() {
		}

		public ByReference(MyBlock psubrect) {
			super(psubrect.getPointer());
			read();
		}
	}

	public static class ByValue extends MyBlock implements Structure.ByValue {
		public ByValue() {
		}

		public ByValue(MyBlock psubrect) {
			super(psubrect.getPointer());
			read();
		}
	}
	
	@Override
	protected List<String> getFieldOrder(){
		List<String> a = new ArrayList<String>();
		a.add("r1");
		a.add("r2");
		a.add("r3");
		a.add("r4");
		a.add("r5");
		a.add("r6");
		a.add("r7");
		return a;
	}
	
	public double r1;
	public double r2;
	public double r3;
	public double r4;
	public double r5;
	public double r6;
	public double r7;

}
