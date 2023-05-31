import java.util.Random;

public class StringException {
    public static void main(String[] args) {
        try {
            String s = "Hello World!";
            Random rd = new Random();
            int rnd = rd.nextInt(20);
            if (rnd < s.length())
                System.out.println("No exception");
            System.out.println(s.charAt(rnd));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException = " + e.getMessage());
        }
    }
}
