import java.util.Scanner;

public class EvenOdd1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num % 2) {
			case 0:
				System.out.println(num + " is Even");
				break;

			default:
				System.out.println(num + " is Odd");
				break;
		}
		sc.close();
	}
}
