public class MyClass {
    int instanceVariable;
    public static int staticVariable;

    public MyClass(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public void printInstanceVariable() {
        System.out.println("Instance variable value: " + this.instanceVariable);
    }

    public static void printStaticVariable() {
        System.out.println("Static variable value: " + staticVariable);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(20);

        obj1.printInstanceVariable();
        obj2.printInstanceVariable();

        System.out.println("Static variable value (direct access): " + staticVariable);
        System.out.println("Static variable value (through instance): " + obj1.staticVariable);
    }
}
