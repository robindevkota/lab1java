/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
class BankAccount {
    private int accNo;
    private String name;
    private String address;
    private String phone;
    private char gender;

    // Constructor to set bank details
    public BankAccount(int accNo, String name, String address, String phone, char gender) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
    }

    // Method to display account details
    public void showDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Gender: " + gender);
    }
}

class SavingAccount extends BankAccount {
    private double currentAmount;
    private int month;

    // Constructor to set data members
    public SavingAccount(int accNo, String name, String address, String phone, char gender, double currentAmount, int month) {
        super(accNo, name, address, phone, gender);
        this.currentAmount = currentAmount;
        this.month = month;
    }

    // Method to calculate total amount with bonus
    public double calcTotal() {
        double bonus = 0.0;
        if (month < 3) {
            bonus = 0.02 * currentAmount;
        } else if (month >= 3 && month <= 6) {
            bonus = 0.05 * currentAmount;
        } else if (month > 6 && month <= 12) {
            bonus = 0.08 * currentAmount;
        } else {
            bonus = 0.1103 * currentAmount;
        }
        return currentAmount + bonus;
    }
}

public class Question11 {
    public static void main(String[] args) {
        SavingAccount savingAcc = new SavingAccount(123456, "Robion", "Thamel", "1234567-88", 'M', 50000.0, 8);
        
        // Displaying account details
        System.out.println("Bank Account Details:");
        savingAcc.showDetails();

        // Calculating total amount with bonus
        double totalAmount = savingAcc.calcTotal();
        System.out.println("Total amount with bonus: $" + totalAmount);
        System.out.println();
        System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
}


