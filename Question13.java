
package lab1;


interface Swim {
    void swim();
}


interface Fly {
    void fly();
}


class Bird implements Swim, Fly {
    @Override
    public void swim() {
        System.out.println("Bird is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

public class Question13 {
    public static void main(String[] args) {
        // Creating an object of Bird class
        Bird bird = new Bird();

      
        bird.swim();
        bird.fly();
        System.out.println();
        System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
}

