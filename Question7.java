
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

// Child class inheriting from Dog
class Kio extends Dog {
    void guard() {
        System.out.println("German Shepherd is guarding");
    }
}

public class Question7 {
    public static void main(String[] args) {
        // Creating an object of the child class
        Kio dog = new Kio();

        
        dog.eat(); 
        dog.bark(); 
        dog.guard(); 
        System.out.println();
        System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
}
