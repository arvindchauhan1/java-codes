class PClass {
    void add(int a, int b) {
        System.out.println("add in PClass");
        System.out.println("add = " + (a + b));
    }

    int value = 10;

    void disp() {
        System.out.println("disp() of parent class PClass");
    }
}

class MOverloading extends PClass {

    @Override
    void add(int a, int b) {
        System.out.println("add in MOverloading");
        System.out.println("add = " + (a + b));
    }

    // overloading add method
    // 1.by changing number of arguments
    void add(int a, int b, int c) {
        System.out.println("overloaded add in MOverloading");
        System.out.println("add = " + (a + b + c));
    }

    // 1.by changing data type
    void add(float a, float b) {
        System.out.println("overloaded add in MOverloading");
        System.out.println("add = " + (a + b));
    }

    void useSuper() {
        System.out.println("calling parent method by using super");
        super.disp();
        System.out.println("value = " + super.value);
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        MOverloading obj = new MOverloading();
        obj.add(12, 13);
        obj.add(12, 13, 14);
        obj.add(12.22f, 13.22f);

        PClass obj2 = new PClass();
        obj2.add(13, 13);
        // calling overridden class
        obj.add(11, 11);

        // use of super
        obj.useSuper();
    }
}
