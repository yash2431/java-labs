public class FinalParameterExample {
    public static void main(String[] args) {
        int x = 10;
        final int y = 20;
        modifyValues(x, 30);
    }

    static void modifyValues(int a, final int b) {
        System.out.println("Modified values: " + a + ", " + b);
    }
}
