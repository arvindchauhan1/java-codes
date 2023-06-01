import java.lang.Thread;

class MulThread extends Thread {
    private int tnum;

    MulThread(int tnum) {
        this.tnum = tnum;
    }

    public synchronized void run() {
        System.out.println("thread - " + tnum);
    }
}

public class SynchronizationOfThread {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MulThread t1 = new MulThread(i);
            t1.start();
        }
    }
}
