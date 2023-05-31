import java.util.Random;

public class Finallyblock {
    public static void main(String[] args) {
        try {
            Random rd = new Random();
            int a[] = { 1, 2, 3, 4 };
            int rnd = rd.nextInt(10);
            if (rnd < 4)
                System.out.println("No exception");
            System.out.println(a[rnd]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException = " + e.getMessage());
        } finally {
            System.out.println("\nfinally block excecuting no matter whether there is an exception or not.");
        }
    }
}
