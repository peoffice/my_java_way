package mark.java_demo;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.DoubleByReference;
import com.sun.jna.ptr.PointerByReference;

/*
 * 如果C++里面定义的静态数组，则不能使用Pointer或ByRefence方式
 * 如果C++里面是指针变量（退化数组），则可以使用
 */
public class AlgorithmModule {
	public interface AlgorithmDll extends Library{
		AlgorithmDll Instance = (AlgorithmDll)Native.loadLibrary("algorithm",AlgorithmDll.class);
		
		public int test_free(Pointer pointer);
		public Pointer test_string_input_return_value(String input,int length);
		public int test_string_input_output(String input,int length,PointerByReference output);		
		public MyResult.ByValue test_structure_input_output(MyPara.ByReference para);
		public MyResult.ByValue test_structure_nonpointer_input_output(MyPara.ByValue para);
		public int test_big_data_transfor(BigData.ByReference data);
		public int test_big_data_transfor_ex(BigDataEx.ByReference data);
		
		public void example15_send(Example15StructB.ByReference data);
		
		/*通过指针方式也是可以作为获取修改数据的方式*/
		public void example23_sendDoublePtr(DoubleByReference pVal);
		
		public void example17_sendMultidimensionalArray(Example17StructB.ByReference pVal);
		/*回调函数的使用*/
		public void example22_triggerCallback(Example22CallbackInterface callback,int target);
	}
}
