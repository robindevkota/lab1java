
package lab1;

interface Vehicle {
    void start();
    void stop();
}


interface Car extends Vehicle {
    void accelerate();
    void brake();
}


class Sedan implements Car {
    @Override
    public void start() {
        System.out.println("Sedan starting...");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopping...");
    }

    @Override
    public void accelerate() {
        System.out.println("Sedan accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Sedan braking...");
    }
}

public class Question14 {
    public static void main(String[] args) {
       
        Sedan sedan = new Sedan();

       
        sedan.start();
        sedan.accelerate();
        sedan.brake();
        sedan.stop();
         System.out.println();
        System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
}



