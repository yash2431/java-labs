class Parent {
    final void displayMessage() {
        System.out.println("Hello from Parent class");
    }
}

class Child extends Parent {
   }

public class FinalMethodExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayMessage(); 
    }
}
