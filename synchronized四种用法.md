#### 1. 修饰方法
* 方式1
```
public synchronized void method()
{
    //todo
}
```
* 方式2
```
public void method(){
    synchronized(this){
        //todo
    }
}
```
* synchronized关键字不能继承

#### 2. 修饰一个代码块
* 一个线程访问一个对象中的synchronized(this)同步代码块时，其他试图访问该对象的线程将被阻塞
* 当一个线程访问对象的一个synchronized(this)同步代码块时，另一个线程任然可以访问该对象中的非synchronized(this)代码块
* 指定要给某个对象加锁

#### 3. 修饰一个静态的方法
```
public synchronized static void method(){
    //todo
}
```
静态方法是属于类而不属于对象的，所以，synchronized修饰的静态方法锁定的是这个类的所有对象

#### 4. 修饰一个类
```
public ClassName{
    public void method(){
        synchronized(ClassName.class){
            //todo
        }
    }
}
```