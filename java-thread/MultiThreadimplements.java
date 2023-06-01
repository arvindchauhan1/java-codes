import java.lang.Runnable;

class MulThread implements Runnable {

    private int threadNumber;

    public MulThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        System.out.println("this code is running in thread - " + threadNumber);
    }
}

public class MultiThreadimplements {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MulThread obj = new MulThread(i);
            Thread t1 = new Thread(obj);
            t1.start();
        }
    }
}
