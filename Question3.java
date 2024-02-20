
class Product {
    private String name;
    private int qty;
    private double price;

    public Product(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

  
    public String getName() {
        return name;
    }

   
    public int getQty() {
        return qty;
    }

    
    public double getPrice() {
        return price;
    }

    
    public double getTotal() {
        return qty * price;
    }
}

public class Question3 {
    public static void main(String[] args) {
       
        Product product1 = new Product("Laptop", 2, 800.0);
        Product product2 = new Product("Smartphone", 3, 500.0);

        double total1 = product1.getTotal();
        double total2 = product2.getTotal();

        // Display total price for each product
        System.out.println("Total price for " + product1.getName() + " is: $" + total1);
        System.out.println("Total price for " + product2.getName() + " is: $" + total2);

        
        double totalPrice = total1 + total2;
        System.out.println("Total price for both products is: $" + totalPrice);
        System.out.println();
         System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
}
