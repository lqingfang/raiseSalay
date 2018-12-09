package lqf.raiseSalay.multiThread;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        threadGroupDefaultName();
        setThreadGroup();
    }
    private static void threadGroupDefaultName(){
        Thread t1 = new Thread("t1");
        Thread t2 = new Thread("t2");
        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());
    }
    private static void setThreadGroup() {
        ThreadGroup tg = new ThreadGroup("tg");
        Thread t1 = new Thread(tg,"t1");
        Thread t2 = new Thread(tg,"t2");
        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());
        //通过组名称设置后台线程，表示该组的线程都是后台线程
        tg.setDaemon(true);
    }
}
