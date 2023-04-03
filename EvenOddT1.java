import java.util.Scanner;

public class EvenOddT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t = num % 2;
        System.out.println(num + (t == 0 ? " is Even." : " is Odd"));
        sc.close();
    }
}
