package lqf.raiseSalay.multiThread;

class SellTicketThread extends Thread {
    private static int tickets = 100;

    public SellTicketThread(String name){
        super(name);
    }
    @Override
    public void run() {
        while (tickets>0) {

            System.out.println(Thread.currentThread().getName()+"___"+tickets--);
        }
    }

    public static void main(String[] args) {
        SellTicketThread stt1 = new SellTicketThread("stt1");
        SellTicketThread stt2 = new SellTicketThread("stt2");
        SellTicketThread stt3 = new SellTicketThread("stt3");
        stt1.start();
        stt2.start();
        stt3.start();
    }
}
