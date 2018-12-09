package lqf.raiseSalay.multiThread.waitNotify;
/*
等待唤醒：
 * 		Object类中提供了三个方法：
 * 			wait():等待
 * 			notify():唤醒单个线程  //理解是解开当前的锁，因为只执行当前的进程，即唤醒了所有线程
 * 			notifyAll():唤醒所有线程
 * 		为什么这些方法不定义在Thread类中呢?
 * 			这些方法的调用必须通过锁对象调用，而我们刚才使用的锁对象是任意锁对象。
 * 			所以，这些方法必须定义在Object类中。
 */
public class WaitAndNotifyTest {
    public static void main(String[] args) {
        Student s = new Student();
        SetThread setThread = new SetThread(s);
        GetThread getThread = new GetThread(s);

        Thread t1 = new Thread(setThread);
        Thread t2 = new Thread(getThread);
        t1.start();
        t2.start();
    }
}
