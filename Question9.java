
package lab1;
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.\nIam being called from SuperClass");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("The dog barks.\nIam being called from SubClass");
    }
}

public class Question9 {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.makeSound();   
          System.out.println();
        System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
    
}
