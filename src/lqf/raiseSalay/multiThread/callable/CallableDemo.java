package lqf.raiseSalay.multiThread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return null;
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.submit(new CallableDemo());
        pool.submit(new CallableDemo());
        pool.submit(new CallableDemo());

        pool.shutdown();
    }
}
