package mark.workspace.concurrency_toturial.Volatile;

/*
 * 使用双向锁定实现的单例模式，性能相对较差，但安全性很高
 */
public class Singleton {
	private static volatile Singleton instance;
	private Singleton(){}
	public Singleton getInstance(){
		if(instance==null){
			synchronized (Singleton.class) {
				if(instance==null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
