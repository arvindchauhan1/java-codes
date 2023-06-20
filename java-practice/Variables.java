
public class Variables {

    int b = 12; // instance
    static int c = 14;// static F

    public static void main(String[] args) {
        int a = 10; // local\

        Variables obj = new Variables();
        System.out.println("a=" + a + " b=" + obj.b + " c=" + c);
    }
}
