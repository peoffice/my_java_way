package mark.workspace.concurrency_toturial.synchronize;

public class TestSync {
	public void test1(){
		synchronized (this) {
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+":"+i);
				try{
					Thread.sleep(500);
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
	public synchronized void test2(){
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
		// TODO Auto-generated method stub
	      final TestSync ts = new TestSync(); 
	      final TestSync tss = new TestSync();
	         Thread test1 = new Thread(  new Runnable() {  public void run() {  ts.test1();  }  }, "test1"  );  
	         Thread test2 = new Thread(  new Runnable() {  public void run() { tss.test2();   }  }, "test2"  );  
	         test1.start();;  
	         test2.start();  
	}

}
