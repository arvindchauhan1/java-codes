import java.util.Scanner;
class AreaOfRectangleInstance {
    int length;
    int width;

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        AreaOfRectangleInstance obj = new AreaOfRectangleInstance();
        obj.length=sc.nextInt();
        obj.width=sc.nextInt();
        int area = obj.length * obj.width;
        System.out.println("Area = " + area);
        sc.close();
    }
}