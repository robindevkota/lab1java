// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class 1
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven...");
    }
}

// Child class 2
class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Motorcycle is being ridden...");
    }
}

public class Question6{
    public static void main(String[] args) {
        // Creating objects of child classes
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        // Calling methods from the child classes
        car.start(); 
        car.drive(); 

        System.out.println(); 
        motorcycle.start(); 
        motorcycle.ride(); 
        System.out.println();
        System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
}
