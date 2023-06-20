class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running.");
        // Simulate some work
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " is done.");
    }
}

public class MultTh {
    public static void main(String[] args) {
        // Create and start two threads
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");
        thread1.start();
        thread2.start();

        // Main thread continues its execution
        System.out.println("Main thread is running.");

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // All threads have finished
        System.out.println("Main thread is done.");
    }
}