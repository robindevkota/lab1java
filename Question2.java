package lab1;

class Calculate {
    private int num1;
    private int num2;

    
    public void setCalc(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

   
    public void calcSum() {
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    
    public int calcMulti() {
        return num1 * num2;
    }


    public void calcDifference() {
        int diff = num1 - num2;
        System.out.println("Difference between " + num1 + " and " + num2 + " is: " + diff);
    }
}

public class Question2 {
    public static void main(String[] args) {
        // Creating instances of Calculate class
        Calculate calc1 = new Calculate();
        Calculate calc2 = new Calculate();

        calc1.setCalc(10, 5);

        // Invoking methods for calc1
        calc1.calcSum();
        int multiplicationResult = calc1.calcMulti();
        System.out.println("Multiplication of 10 and 5 is: " + multiplicationResult);
        calc1.calcDifference();

        System.out.println(); 

    
        calc2.setCalc(20, 8);


        calc2.calcSum();
        multiplicationResult = calc2.calcMulti();
        System.out.println("Multiplication of 20 and 8 is: " + multiplicationResult);
        calc2.calcDifference();
        System.out.println();
         System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
}
