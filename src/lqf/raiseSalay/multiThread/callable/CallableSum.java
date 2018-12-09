package lqf.raiseSalay.multiThread.callable;

import java.util.concurrent.*;

public class CallableSum implements Callable {
    private int number;
    public CallableSum(int number){
        this.number = number;
    }
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int x=1;x<number;x++) {
            sum +=number;
        }
        return sum;
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future c1 = pool.submit(new CallableSum(100));
        Future c2 = pool.submit(new CallableSum(200));
        try {
            System.out.println(c1.get());
            System.out.println(c2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        pool.shutdown();
    }
}
