import java.util.Scanner;

public class EvenOdd2 {
	int num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EvenOdd2 obj = new EvenOdd2();
		obj.num = sc.nextInt();
		switch (obj.num % 2) {
			case 0:
				System.out.println(obj.num + " is Even");
				break;

			default:
				System.out.println(obj.num + " is Odd");
				break;
		}
		sc.close();
	}
}
