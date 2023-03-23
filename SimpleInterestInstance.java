public class SimpleInterestInstance {
    float principal = 13;
    float rate = 3;
    float time = 13;

    public static void main(String args[]) {
        SimpleInterestInstance obj = new SimpleInterestInstance();
        float si = (obj.principal * obj.time * obj.rate) / 100;

        System.out.println("Simple Interest : " + si);
    }
}