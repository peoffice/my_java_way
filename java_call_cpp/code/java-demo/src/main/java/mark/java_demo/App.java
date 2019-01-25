package mark.java_demo;

import java.util.concurrent.TimeUnit;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.StringArray;
import com.sun.jna.ptr.DoubleByReference;
import com.sun.jna.ptr.PointerByReference;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//test_string_input_return_value();
    	//test_string_input_output();
    	//test_structure_input_output();
    	//test_structure_nonpointer_input_output();  	
    	//test_big_data_transfor();
    	//test_big_data_transfor_ex();
    	//test_example15_send();
    	//test_example23_sendDoublePtr();
    	//test_example17_sendMultidimensionalArray();
    	//test_example22_triggerCallback();
    }
    public static void test_string_input_return_value(){
    	String input = "input";
    	
    	PointerByReference output = new PointerByReference();
    	Pointer p = AlgorithmModule.AlgorithmDll.Instance.test_string_input_return_value(input,input.length());
    	String result = p.getString(0);
    	AlgorithmModule.AlgorithmDll.Instance.test_free(p);
    	System.out.println("result:"+result);
    }
    public static void test_string_input_output(){
    	String input = "input";
    	
    	PointerByReference output = new PointerByReference();
    	int ret = AlgorithmModule.AlgorithmDll.Instance.test_string_input_output(input,input.length(), output);
    	Pointer p = output.getValue();
    	String result = p.getString(0);
    	AlgorithmModule.AlgorithmDll.Instance.test_free(p);
    	System.out.println("result:"+result);
    }
    public static void test_structure_input_output(){
     	MyPara.ByReference input = new MyPara.ByReference();
    	input.r1 = 1.0;
    	input.r2 = 2.0;
    	input.r3 = 3.0;
    	input.r4 = 4.0;
    	input.r5 = 5.0;
    	input.r6 = 6.0;
    	
    	input.L.r1 = 1.01;
    	input.L.r2 = 1.02;
    	input.L.r3 = 1.03;
    	input.L.r4 = 1.04;
    	input.L.r5 = 1.05;
    	input.L.r6 = 1.06;
    	
    	input.L.L8.r1 = 1.081;
    	input.L.L8.r2 = 1.082;
    	input.L.L8.r3 = 1.083;
    	input.L.L8.r4 = 1.084;
    	input.L.L8.r5 = 1.085;
    	input.L.L8.r6 = 1.086;
    	
    	input.L.L8.L7.r1 = 1.0871;
    	input.L.L8.L7.r2 = 1.0872;
    	input.L.L8.L7.r3 = 1.0873;
    	input.L.L8.L7.r4 = 1.0874;
    	input.L.L8.L7.r5 = 1.0875;
    	input.L.L8.L7.r6 = 1.0876;
    	
    	input.L.L8.L7.L6.r1 = 1.08761;
    	input.L.L8.L7.L6.r2 = 1.08762;
    	input.L.L8.L7.L6.r3 = 1.08763;
    	input.L.L8.L7.L6.r4 = 1.08764;
    	input.L.L8.L7.L6.r5 = 1.08765;
    	input.L.L8.L7.L6.r6 = 1.08766;
    	

    	input.L.L8.L7.L6.L5.r1 = 1.087651;
    	input.L.L8.L7.L6.L5.r2 = 1.087652;
    	input.L.L8.L7.L6.L5.r3 = 1.087653;
    	input.L.L8.L7.L6.L5.r4 = 1.087654;
    	input.L.L8.L7.L6.L5.r5 = 1.087655;
    	input.L.L8.L7.L6.L5.r6 = 1.087656;
    	
    	input.L.L8.L7.L6.L5.L4.r1 = 1.0876541;
    	input.L.L8.L7.L6.L5.L4.r2 = 1.0876542;
    	input.L.L8.L7.L6.L5.L4.r3 = 1.0876543;
    	input.L.L8.L7.L6.L5.L4.r4 = 1.0876544;
    	input.L.L8.L7.L6.L5.L4.r5 = 1.0876545;
    	input.L.L8.L7.L6.L5.L4.r6 = 1.0876546;
    	
       	input.L.L8.L7.L6.L5.L4.L3.r1 = 1.08765431;
    	input.L.L8.L7.L6.L5.L4.L3.r2 = 1.08765432;
    	input.L.L8.L7.L6.L5.L4.L3.r3 = 1.08765433;
    	input.L.L8.L7.L6.L5.L4.L3.r4 = 1.08765434;
    	input.L.L8.L7.L6.L5.L4.L3.r5 = 1.08765435;
    	input.L.L8.L7.L6.L5.L4.L3.r6 = 1.08765436;

       	input.L.L8.L7.L6.L5.L4.L3.L2.r1 = 1.087654321;
    	input.L.L8.L7.L6.L5.L4.L3.L2.r2 = 1.087654322;
    	input.L.L8.L7.L6.L5.L4.L3.L2.r3 = 1.087654323;
    	input.L.L8.L7.L6.L5.L4.L3.L2.r4 = 1.087654324;
    	input.L.L8.L7.L6.L5.L4.L3.L2.r5 = 1.087654325;
    	input.L.L8.L7.L6.L5.L4.L3.L2.r6 = 1.087654326;

       	input.L.L8.L7.L6.L5.L4.L3.L2.L1.r1 = 1.0876543211;
    	input.L.L8.L7.L6.L5.L4.L3.L2.L1.r2 = 1.0876543212;
    	input.L.L8.L7.L6.L5.L4.L3.L2.L1.r3 = 1.0876543213;
    	input.L.L8.L7.L6.L5.L4.L3.L2.L1.r4 = 1.0876543214;
    	input.L.L8.L7.L6.L5.L4.L3.L2.L1.r5 = 1.0876543215;
    	input.L.L8.L7.L6.L5.L4.L3.L2.L1.r6 = 1.0876543216;
    	
    	try{
    		MyResult.ByValue result = AlgorithmModule.AlgorithmDll.Instance.test_structure_input_output(input);
        	System.out.println("result:r="+result.r);
        	System.out.println("result:r0="+result.r0);
        	System.out.println("result:r1="+result.r1);
        	System.out.println("result:r2="+result.r2);
        	System.out.println("result:r3="+result.r3);
        	System.out.println("result:r4="+result.r4);
        	System.out.println("result:r5="+result.r5);
        	System.out.println("result:r6="+result.r6);
        	System.out.println("result:r7="+result.r7);
        	System.out.println("result:r8="+result.r8);
    	}
    	catch(Exception ex){
    		System.out.println(ex.toString());
    	}
    }
    public static void test_structure_nonpointer_input_output(){
     	MyPara.ByValue input = new MyPara.ByValue();
    	input.r1 = 1.0;
    	input.r2 = 2.0;
    	input.r3 = 3.0;
    	input.r4 = 4.0;
    	input.r5 = 5.0;
    	input.r6 = 6.0;
    	
    	input.L.r1 = 1.01;
    	input.L.r2 = 1.02;
    	input.L.r3 = 1.03;
    	input.L.r4 = 1.04;
    	input.L.r5 = 1.05;
    	input.L.r6 = 1.06;
    	
    	input.L.L8.r1 = 1.081;
    	input.L.L8.r2 = 1.082;
    	input.L.L8.r3 = 1.083;
    	input.L.L8.r4 = 1.084;
    	input.L.L8.r5 = 1.085;
    	input.L.L8.r6 = 1.086;
    	
    	input.L.L8.L7.r1 = 1.0871;
    	input.L.L8.L7.r2 = 1.0872;
    	input.L.L8.L7.r3 = 1.0873;
    	input.L.L8.L7.r4 = 1.0874;
    	input.L.L8.L7.r5 = 1.0875;
    	input.L.L8.L7.r6 = 1.0876;
    	
    	input.L.L8.L7.L6.r1 = 1.08761;
    	input.L.L8.L7.L6.r2 = 1.08762;
    	input.L.L8.L7.L6.r3 = 1.08763;
    	input.L.L8.L7.L6.r4 = 1.08764;
    	input.L.L8.L7.L6.r5 = 1.08765;
    	input.L.L8.L7.L6.r6 = 1.08766;
    	

    	input.L.L8.L7.L6.L5.r1 = 1.087651;
    	input.L.L8.L7.L6.L5.r2 = 1.087652;
    	input.L.L8.L7.L6.L5.r3 = 1.087653;
    	input.L.L8.L7.L6.L5.r4 = 1.087654;
    	input.L.L8.L7.L6.L5.r5 = 1.087655;
    	input.L.L8.L7.L6.L5.r6 = 1.087656;
    	
    	input.L.L8.L7.L6.L5.L4.r1 = 1.0876541;
    	input.L.L8.L7.L6.L5.L4.r2 = 1.0876542;
    	input.L.L8.L7.L6.L5.L4.r3 = 1.0876543;
    	input.L.L8.L7.L6.L5.L4.r4 = 1.0876544;
    	input.L.L8.L7.L6.L5.L4.r5 = 1.0876545;
    	input.L.L8.L7.L6.L5.L4.r6 = 1.0876546;
    	
       	input.L.L8.L7.L6.L5.L4.L3.r1 = 1.08765431;
    	input.L.L8.L7.L6.L5.L4.L3.r2 = 1.08765432;
    	input.L.L8.L7.L6.L5.L4.L3.r3 = 1.08765433;
    	input.L.L8.L7.L6.L5.L4.L3.r4 = 1.08765434;
    	input.L.L8.L7.L6.L5.L4.L3.r5 = 1.08765435;
    	input.L.L8.L7.L6.L5.L4.L3.r6 = 1.08765436;

       	input.L.L8.L7.L6.L5.L4.L3.L2.r1 = 1.087654321;
    	input.L.L8.L7.L6.L5.L4.L3.L2.r2 = 1.087654322;
    	input.L.L8.L7.L6.L5.L4.L3.L2.r3 = 1.087654323;
    	input.L.L8.L7.L6.L5.L4.L3.L2.r4 = 1.087654324;
    	input.L.L8.L7.L6.L5.L4.L3.L2.r5 = 1.087654325;
    	input.L.L8.L7.L6.L5.L4.L3.L2.r6 = 1.087654326;

       	input.L.L8.L7.L6.L5.L4.L3.L2.L1.r1 = 1.0876543211;
    	input.L.L8.L7.L6.L5.L4.L3.L2.L1.r2 = 1.0876543212;
    	input.L.L8.L7.L6.L5.L4.L3.L2.L1.r3 = 1.0876543213;
    	input.L.L8.L7.L6.L5.L4.L3.L2.L1.r4 = 1.0876543214;
    	input.L.L8.L7.L6.L5.L4.L3.L2.L1.r5 = 1.0876543215;
    	input.L.L8.L7.L6.L5.L4.L3.L2.L1.r6 = 1.0876543216;
    	
    	try{
    		MyResult.ByValue result = AlgorithmModule.AlgorithmDll.Instance.test_structure_nonpointer_input_output(input);
        	System.out.println("result:r="+result.r);
        	System.out.println("result:r0="+result.r0);
        	System.out.println("result:r1="+result.r1);
        	System.out.println("result:r2="+result.r2);
        	System.out.println("result:r3="+result.r3);
        	System.out.println("result:r4="+result.r4);
        	System.out.println("result:r5="+result.r5);
        	System.out.println("result:r6="+result.r6);
        	System.out.println("result:r7="+result.r7);
        	System.out.println("result:r8="+result.r8);
    	}
    	catch(Exception ex){
    		System.out.println(ex.toString());
    	}
    }
    public static void test_big_data_transfor(){
    	long startTime = System.nanoTime();
    	BigData.ByReference data = new BigData.ByReference();
    	long endTime = System.nanoTime();
    	long duration = TimeUnit.NANOSECONDS.toSeconds(endTime-startTime);
    	System.out.println("new object time: "+duration);
    	data.node[0].element[0].count[0] = 1000.0;
    	startTime = System.nanoTime();
    	int ret = AlgorithmModule.AlgorithmDll.Instance.test_big_data_transfor(data);
    	endTime = System.nanoTime();
    	duration = TimeUnit.NANOSECONDS.toSeconds(endTime-startTime);
    	System.out.println("call function time: "+duration);
    }
    public static void test_big_data_transfor_ex(){
    	long startTime = System.nanoTime();
    	BigDataEx.ByReference data = new BigDataEx.ByReference();
    	long endTime = System.nanoTime();
    	long duration = TimeUnit.NANOSECONDS.toSeconds(endTime-startTime);
    	System.out.println("new object time: "+duration);
    	data.r1 = 100.0;
    	data.node = new BigNodeEx.ByReference();
    	final BigNodeEx[] nodes = (BigNodeEx[])data.node.toArray(200);
    	for(int i=0;i<200;i++){
    		nodes[i].r1 = 200.0;
    		nodes[i].element = new BigElementEx.ByReference();
    		final BigElementEx[] elements = (BigElementEx[])nodes[i].element.toArray(200);
    		for(int j=0;j<200;j++){
    			elements[j].r1 = 300.0;
    			for(int k=0;k<200;k++){
    				elements[j].count[k] = 1000.0;  				
    			}
    		}
    	}
    	int ret = AlgorithmModule.AlgorithmDll.Instance.test_big_data_transfor_ex(data);
    	endTime = System.nanoTime();
    	duration = TimeUnit.NANOSECONDS.toSeconds(endTime-startTime);
    	System.out.println("call function time: "+duration);
    }
    public static void test_example15_send(){
    	// generate data to send
    	final Example15StructB.ByReference ex15ref = new Example15StructB.ByReference();
    	ex15ref.numAs = 5;
    	ex15ref.as = new Example15StructA.ByReference();
    	// toArray generates a block of Example15StructA's that are suitable for passing to C
    	final Example15StructA[] ex15as = (Example15StructA[])ex15ref.as.toArray(ex15ref.numAs);
    	// Note: do NOT allocate a new object for each struct in the array -
//    				toArray() has already allocated each array item
    	for (int ex15loop=0; ex15loop<ex15ref.numAs; ex15loop++) {
    		ex15as[ex15loop].val = ex15loop;
    	}
    	// call the C function to pass the data to C
    	AlgorithmModule.AlgorithmDll.Instance.example15_send(ex15ref);
    }
    public static void test_example23_sendDoublePtr(){
    	double example23_val = 5.9d;
    	final DoubleByReference example23_valRef = new DoubleByReference(example23_val);
    	AlgorithmModule.AlgorithmDll.Instance.example23_sendDoublePtr(example23_valRef);
    	System.out.println(example23_valRef.getValue());
    }
    public static void test_example17_sendMultidimensionalArray(){
    	final String[][] ex17vals = new String[3][];
    	ex17vals[0] = new String[2];
    	ex17vals[0][0] = "oneone";
    	ex17vals[0][1] = "onetwo";
    	ex17vals[1] = new String[3];
    	ex17vals[1][0] = "twoone";
    	ex17vals[1][1] = "twotwo";
    	ex17vals[1][2] = "twothree";
    	ex17vals[2] = new String[1];
    	ex17vals[2][0] = "threeone";

    	// set up JNA structure
    	final Example17StructB.ByReference ex17bref = new Example17StructB.ByReference();
    	ex17bref.numVals = ex17vals.length;
    	ex17bref.vals = new Example17StructA.ByReference();
    	final Example17StructA[] ex17aval = (Example17StructA[])ex17bref.vals.toArray(ex17bref.numVals);
    	for (int aloop=0; aloop<ex17bref.numVals; aloop++) {
    		ex17aval[aloop].numVals = ex17vals[aloop].length;
    		ex17aval[aloop].vals = new StringArray(ex17vals[aloop]);
    	}

    	// pass data to C
    	AlgorithmModule.AlgorithmDll.Instance.example17_sendMultidimensionalArray(ex17bref);
    }
    public static void test_example22_triggerCallback(){
    	// instantiate a callback wrapper instance
    	final Example22CallbackImplementation callbackImpl = new Example22CallbackImplementation();

    	// pass the callback wrapper to the C library
    	AlgorithmModule.AlgorithmDll.Instance.example22_triggerCallback(callbackImpl,200);
    }
}