interface Transport {
    void deliver();
}


abstract class Animal {
    abstract void sound();
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger roars");
    }
}


class Camel extends Animal implements Transport {
    @Override
    void sound() {
        System.out.println("Camel grunts");
    }

    @Override
    public void deliver() {
        System.out.println("Camel delivers goods");
    }
}

class Deer extends Animal {
    @Override
    void sound() {
        System.out.println("Deer barks");
    }
}

class Donkey extends Animal implements Transport {
    @Override
    void sound() {
        System.out.println("Donkey brays");
    }

    @Override
    public void deliver() {
        System.out.println("Donkey delivers goods");
    }
}

public class DeliverDemo {
    public static void main(String[] args) {
        Animal[] animals = {new Tiger(), new Camel(), new Deer(), new Donkey()};

        for (Animal animal : animals) {
            if (animal instanceof Transport) {
                ((Transport) animal).deliver();
            }
        }
    }
}
