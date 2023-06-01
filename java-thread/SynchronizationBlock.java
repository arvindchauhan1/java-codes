import java.lang.Runnable;

class MulThread implements Runnable {

    private int threadNumber;

    public MulThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        synchronized (this) {
            System.out.println("this code is running in thread - " + threadNumber);
        }
    }
}

public class SynchronizationBlock {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MulThread ob = new MulThread(i);
            Thread t1 = new Thread(ob);
            t1.start();
        }
    }
}
