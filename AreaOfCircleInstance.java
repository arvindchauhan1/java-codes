import java.util.Scanner;

public class AreaOfCircleInstance {
    double radius = 22;

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        AreaOfCircleInstance obj = new AreaOfCircleInstance();
        obj.radius=sc.nextDouble();
        double area = 3.14 * obj.radius * obj.radius;
        System.out.println("Area = " + area);
    }
}
