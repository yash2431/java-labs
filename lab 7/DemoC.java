interface A {
    int CONSTANT_A = 10;
    void methodA();
}


interface A1 extends A {
    int CONSTANT_A1 = 20;
}


interface A2 extends A {
    int CONSTANT_A2 = 30;
}


interface A12 extends A1, A2 {
    int CONSTANT_A12 = 40;
}


class B implements A12 {
    @Override
    public void methodA() {
        System.out.println("Method A called");
    }
}


public class DemoC {
    public static void main(String[] args) {

        B b = new B();

        
        b.methodA();


        System.out.println("Constant from A: " + A.CONSTANT_A);
        System.out.println("Constant from A1: " + A1.CONSTANT_A1);
        System.out.println("Constant from A2: " + A2.CONSTANT_A2);
        System.out.println("Constant from A12: " + A12.CONSTANT_A12);
    }
}
