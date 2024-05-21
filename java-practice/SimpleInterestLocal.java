class SimpleInterestLocal {
    public static void main(String args[]) {
        float principal = 12;
        float rate = 2;
        float time = 12;

        float si = (principal * time * rate) / 100;

        System.out.println("Simple Interest : " + si);
    }
}