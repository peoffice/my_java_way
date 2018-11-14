#### 基本概念
* 可重入锁
  > 如果锁具备可重入性，则称作为可重入锁。像synchronized和ReentrantLock都是可重入锁，可重入性在我看来实际上表明了锁的分配机制：基于线程的分配，而不是基于方法调用的分配。举个简单的例子，当一个线程执行到某个synchronized方法时，比如说method1，而在method1中会调用另外一个synchronized方法method2，此时线程不必重新去申请锁，而是可以直接执行方法method2

* 可中断锁
  > 顾名思义，就是可以相应中断的锁，在Java中，synchronized就不是可以中断的锁，而Lock是可中断的锁

* 公平锁
  > 公平锁即尽量以请求锁的顺序来获取锁。比如同是有多个线程在等待一个锁，当这个锁被释放时，等待时间最久的线程（最先请求的线程）会获得该所，这种就是公平锁。

  > 非公平锁即无法保证锁的获取是按照请求锁的顺序进行的。这样就可能导致某个或者一些线程永远获取不到锁。
  
  > 在Java中，synchronized就是非公平锁，它无法保证等待的线程获取锁的顺序。
  
  > 而对于ReentrantLock和ReentrantReadWriteLock，它默认情况下是非公平锁，但是可以设置为公平锁

* 读写锁
  > 读写锁将对一个资源（比如文件）的访问分成了2个锁，一个读锁和一个写锁。
  > 正因为有了读写锁，才使得多个线程之间的读操作不会发生冲突。
  
  > ReadWriteLock就是读写锁，它是一个接口，ReentrantReadWriteLock实现了这个接口。
  
  > 可以通过readLock()获取读锁，通过writeLock()获取写锁。


#### Java锁
##### Lock
```
public interface Lock{
    void lock();
    void lockInterruptibly() throws InterruptedException;
    boolean tryLock();
    boolean tryLock(long time,TimeUnit unit) throws InterruptedException;
    void unlock();
    Codition newCondition();
} 
```
* lockInterruptibly()方法比较特殊，当通过这个方法获取锁时，如果线程正在等待获取锁则这个线程能够相应中断，即中断线程的等待状态，
  * 注意这里描述的是等待状态，如果已经获得锁，则不能中断
  * 如果使用synchronized，当一个线程处于等待某个锁的状态，是无法被中断的，只有一直等待下去

##### ReentrantLock

##### ReadWriteLock
```
public interface ReadWriteLock{
    Lock readLock();
    Lock writeLock();
}
```
##### ReentrantReadWriteLock