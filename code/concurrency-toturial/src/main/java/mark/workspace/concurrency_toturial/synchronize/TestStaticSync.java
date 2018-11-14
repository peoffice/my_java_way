package mark.workspace.concurrency_toturial.synchronize;

import junit.framework.Test;

public class TestStaticSync {
	public synchronized static void test1(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try{
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public synchronized static void test2(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try{
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public synchronized void test3(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try{
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		final TestStaticSync tss = new TestStaticSync();
		// TODO Auto-generated method stub
	         Thread test1 = new Thread(  new Runnable() {  public void run() { TestStaticSync.test1();  }  }, "test1"  );  
	         Thread test2 = new Thread(  new Runnable() {  public void run() { TestStaticSync.test2();  }  }, "test2"  );
	         Thread test3 = new Thread(  new Runnable() {  public void run() { tss.test3();   }  }, "test3"  );  
	         test1.start();  
	         test2.start();
	         test3.start();
	}
}
