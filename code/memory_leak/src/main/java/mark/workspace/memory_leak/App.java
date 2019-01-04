package mark.workspace.memory_leak;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	MyBlock.ByReference block = new MyBlock.ByReference();
    	block.r1 = 100;
    	block.r2 = 200;
    	block.r3 = 300;
    	block.r4 = 400;
    	block.r5 = 500;
    	block.r6 = 600;
    	block.r7 = 700;
    	int count = 0;
    	while(true){
    		AlgProxy.AlgDll.Instance.memory_leak(block);
    		Thread.sleep(500);
    		System.out.println("runing..."+block.r1);
    		count++;
    		if(count>4)
    			break;
    	}
    }
}
