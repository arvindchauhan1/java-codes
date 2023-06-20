
public class ThisKeyword {
    int x = 12;

    void disp() {
        System.out.println("disp");
    }

    void run(int x) {
        System.out.println(x);
        System.out.println(this.x);
    }

    void objDisp(ThisKeyword x) {
        System.out.println(x.x);
        System.out.println(this.x);

    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
        obj.run(11);
        ThisKeyword obj2 = new ThisKeyword();
        obj2.x = 100;
        obj.objDisp(obj2);

    }
}
