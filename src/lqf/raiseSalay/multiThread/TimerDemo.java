package lqf.raiseSalay.multiThread;

import java.util.Timer;
import java.util.TimerTask;
/*
多线程常见面试题

1:多线程有几种实现方案，分别是哪几种?
	两种。

	继承Thread类
	实现Runnable接口

	扩展一种：实现Callable接口。这个得和线程池结合。

2:同步有几种方式，分别是什么?
	两种。

	同步代码块
	同步方法

3:启动一个线程是run()还是start()?它们的区别?
	start();

	run():封装了被线程执行的代码,直接调用仅仅是普通方法的调用
	start():启动线程，并由JVM自动调用run()方法

4:sleep()和wait()方法的区别
	sleep():必须指时间;不释放锁。
	wait():可以不指定时间，也可以指定时间;释放锁。

5:为什么wait(),notify(),notifyAll()等方法都定义在Object类中
	因为这些方法的调用是依赖于锁对象的，而同步代码块的锁对象是任意锁。
	而Object代码任意的对象，所以，定义在这里面。

6:线程的生命周期图
	新建 -- 就绪 -- 运行 -- 死亡
	新建 -- 就绪 -- 运行 -- 阻塞 -- 就绪 -- 运行 -- 死亡
	建议：画图解释。
 */
public class TimerDemo  extends TimerTask {
    private Timer t;
    public TimerDemo(Timer t) {
        this.t = t;
    }
    @Override
    public void run() {
        System.out.println("worker--------");
        t.cancel();
    }

    public static void main(String[] args) {
        Timer t = new Timer();
        t.schedule(new TimerDemo(t),2000);
        t.schedule(new TimerDemo(t),3000,2000);

    }
}
