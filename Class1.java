class Class3 {
    int a = 10;
}

class Class2 extends Class3 {
    int b = 10;

    void show() {
        Class3 c = new Class3();
        System.out.println("Hello");
        c.a = c.a + 1;
        a = a + 1;
        System.out.println(c.a);
        System.out.println(a);
    }
}

public class Class1 extends Class2 {
    public static void main(String[] args) {
        Class1 c = new Class1();
        Class2 c2 = new Class2();
        c.show();
        c2.show();
        c.a++;
        System.out.println(c.a);
        c.show();

    }

}
