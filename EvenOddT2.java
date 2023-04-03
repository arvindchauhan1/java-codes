import java.util.Scanner;

public class EvenOddT2 {
    int num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenOddT2 obj = new EvenOddT2();
        obj.num = sc.nextInt();
        int t = obj.num % 2;
        System.out.println(obj.num + (t == 0 ? " is Even." : " is Odd"));
        sc.close();
    }
}
