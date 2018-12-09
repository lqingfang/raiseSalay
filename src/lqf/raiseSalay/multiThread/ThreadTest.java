package lqf.raiseSalay.multiThread;

public class ThreadTest extends Thread{
    public ThreadTest(){

    }
    public ThreadTest(String name) {
        super(name);
    }
    @Override
    public void run(){
        System.out.println(getName()+" 11111");
    }

    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest("jame");
        System.out.println(t1.getName());
        t1.start();//这个是最后执行的
        System.out.println(Thread.currentThread().getName());

        ThreadTest t2 = new ThreadTest("t2");
        t2.setPriority(1);//优先级越大，越先执行
        ThreadTest t3 = new ThreadTest("t3");
        t3.setPriority(8);
        t2.start();
        t3.start();

        ThreadTest t4 = new ThreadTest("t4");
        try {
            t4.sleep(1000);//线程休眠
            t4.join();//等待该线程终止
            t4.yield();//礼让，暂停当前正在执行的线程对象，并执行其他线程
                      //这样让多个线程的执行更和谐，但不能靠它保证一人一次。
            t4.setDaemon(true);//设为守护线程或者用户线程。
                               //当在运行的线程都是守护线程时，Java虚拟机退出。该方法必须在启动线程前调用。
            t4.interrupt();//中断线程。把线程的状态终止，并抛出一个InterruptedExceptio
            t4.stop();//让线程停止。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
