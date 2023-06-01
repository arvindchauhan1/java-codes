
public class ThreadByExtend extends Thread {
    public static void main(String[] args) {
        ThreadByExtend obj = new ThreadByExtend();
        System.out.println("this code is running outside thread");
        obj.start();
    }

    public void run() {
        System.out.println("this code is running in thread");
    }
}
