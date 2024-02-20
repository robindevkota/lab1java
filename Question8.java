
class Animal {
    String name;

    // Superclass constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called.");
    }

    void eat() {
        System.out.println(name + " is eating...");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    String breed;

    // Subclass constructor
   // Subclass constructor
Dog(String name, String breed) {
    super(name); // Call to superclass constructor
    this.breed = breed;
    System.out.println("Dog constructor called.");
}


    void bark() {
        System.out.println(name + " is barking...");
    }
}

public class Question8{
    public static void main(String[] args) {
        // Creating an object of the subclass
        Dog dog = new Dog("Buddy", "Labrador");

        // Calling methods of the subclass
        dog.eat(); 
        dog.bark(); 
         System.out.println();
        System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
}
}
