package lqf.raiseSalay.multiThread;

/*
Q1：为什么要重写run()?
    A：run()里面封装的是被线程执行的代码
Q2:启动线程对象用的哪个方法？
    A：start()
Q3:run()和start()方法的区别？
    A:run()直接调用仅仅是普通方法，
      start()先启动线程，再由JVM调用run()方法。
Q4:有了ThreadTest extends Thread,为什么还需要 RunnableTest implements Runnable
    A:可以避免由于Java单继承带来的局限性
      适合过个相同程序的代码去处理同一个资源的情况，把线程同程序的代码，
      数据有效分离，较好的体现了面向对象的设计思想。
 */
public class RunnableTest implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        RunnableTest runnableTest = new RunnableTest();
        Thread t1 = new Thread(runnableTest,"t1");
        t1.start();
    }
}
