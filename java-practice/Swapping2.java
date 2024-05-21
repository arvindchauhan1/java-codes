import java.util.Scanner;;
public class Swapping2 {
    int a, b;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Swapping2 obj = new Swapping2();
        obj.a = sc.nextInt();
        obj.b = sc.nextInt();
        System.out.println("a=" + obj.a + " b=" + obj.b);
        obj.a = obj.a + obj.b;
        obj.b = obj.a - obj.b;
        obj.a = obj.a - obj.b;
        System.out.println("after Swapping");
        System.out.println("a=" + obj.a + " b=" + obj.b);
        sc.close();
    }
}
