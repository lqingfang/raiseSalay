package lqf.raiseSalay.multiThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.submit(new ThreadPool());
        pool.submit(new ThreadPool());
        pool.submit(new ThreadPool());
        //结束线程池
        pool.shutdown();
    }
}
