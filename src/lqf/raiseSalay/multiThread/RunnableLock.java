package lqf.raiseSalay.multiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//线程锁
public class RunnableLock implements Runnable{

    private int tickets = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (tickets>0) {
            try {
                lock.lock();

                Thread.sleep(1000);

                System.out.println(Thread.currentThread().getName()+":"+tickets--);
            }catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        RunnableLock runnableLock = new RunnableLock();
        Thread t1 = new Thread(runnableLock,"t1");
        Thread t2 = new Thread(runnableLock,"t2");
        Thread t3 = new Thread(runnableLock,"t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
