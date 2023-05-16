class MultThreadDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().threadId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class Thread_by_extending_Thread_class {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            MultThreadDemo obj = new MultThreadDemo();
            obj.start();
        }
    }

}