// Single Level Inheritance
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multi-Level Inheritance
class Vehicle {
    void drive() {
        System.out.println("Vehicle is being driven");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating");
    }
}

class SportsCar extends Car {
    void turboBoost() {
        System.out.println("Sports car is boosting");
    }
}

public class Question5 {
    public static void main(String[] args) {
        // Single Level Inheritance
        Dog dog = new Dog();
        dog.eat(); 
        dog.bark(); 

        System.out.println();

        // Multi-Level Inheritance
        SportsCar sportsCar = new SportsCar();
        sportsCar.drive(); 
        sportsCar.accelerate(); 
        sportsCar.turboBoost(); 
        System.out.println();
         System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
}
