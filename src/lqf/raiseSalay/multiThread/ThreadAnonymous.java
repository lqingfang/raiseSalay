package lqf.raiseSalay.multiThread;

public class ThreadAnonymous {
    public static void main(String[] args) {
        new Thread(){
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }){}.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }){
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();
    }
}
