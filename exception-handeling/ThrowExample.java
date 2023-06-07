
public class ThrowExample {

    public void divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            int quotient = dividend / divisor;
            System.out.println("Quotient: " + quotient);
        }
    }

    public static void main(String[] args) {
        ThrowExample ob = new ThrowExample();
        ob.divide(5, 2);
        ob.divide(12, 6);
        ob.divide(5, 0);
    }
}
