abstract class A {

    abstract void add(int x, int y);

    void run() {
        System.out.println("running");
    }

    A() {
        System.out.println("class A's constructor");
    }

}

public class JavaAbstraction extends A {
    void add(int x, int y) {
        System.out.println("add=" + (x + y));
    }

    public static void main(String[] args) {
        JavaAbstraction ob = new JavaAbstraction();
        ob.run();
        ob.add(12, 13);
    }
}
