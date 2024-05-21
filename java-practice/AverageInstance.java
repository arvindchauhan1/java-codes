public class AverageInstance {
    int a1 = 14, a2 = 15, a3 = 16;

    public static void main(String args[]) {
        AverageInstance obj = new AverageInstance();
        float average = (obj.a1 + obj.a2 + obj.a3) / 3;
        System.out.println(average);
    }
}
