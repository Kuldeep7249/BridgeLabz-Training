class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Exercise1_Override {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
    }
}