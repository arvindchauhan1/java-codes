interface Printable {
    default void printInterfaceName() {
        System.out.println("Interface Name: Printable");
    }
}

class MyClass implements Printable {
    // No implementation required for the printInterfaceName() method
}

public class DefaultMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.printInterfaceName(); // Output: "Interface Name: Printable"
    }
}
