


public class MultipleThread {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MulThread t1 = new MulThread();
            t1.start();
        }
    }
}
