package lqf.raiseSalay.multiThread.waitNotify;

public class SetThread implements Runnable {
    private Student s;
    private int x;
    public SetThread(Student s) {
        this.s = s;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                if(s.flag) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(x%2 == 0 ) {
                    s.name = "lily";
                    s.age = 6;
                }else {
                    s.name = "lucy";
                    s.age = 8;
                }
                x++;
                s.flag = true;
                s.notify();
            }
        }
    }
}
