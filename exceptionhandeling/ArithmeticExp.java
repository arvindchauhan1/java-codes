package exceptionhandeling;

public class ArithmeticExp {
    public static void main(String[] args) {
        try {
            int dividebyzero = 5 / 0;
            System.out.println(dividebyzero);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException = " + e.getMessage());
        }

    }
}
