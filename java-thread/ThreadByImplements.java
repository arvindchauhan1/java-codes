import java.lang.Runnable;

public class ThreadByImplements implements Runnable {

    public void run() {
        System.out.println("this code is running in thread - ");
    }

    public static void main(String[] args) {
        ThreadByImplements obj = new ThreadByImplements();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}