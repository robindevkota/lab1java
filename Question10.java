package lab1;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class Question10 {
    public static void main(String[] args) {
    
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Dynamic method dispatch
        animal1.makeSound(); 
        animal2.makeSound(); 
        System.out.println();
         System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
}
