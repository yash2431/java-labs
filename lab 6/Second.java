class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }

    void eat() {
        super.eat();
        System.out.println(name + " is eating dog food.");
    }
}

public class Second {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.display();
        dog.eat();
    }
}
