
class MyClass {
  
    private String message;

   
    public MyClass(String msg) {
        this.message = msg;
    }

   
    public void displayMessage() {
        System.out.println("Message from MyClass: " + message);
    }
}


public class FirstDemo {
    public static void main(String[] args) {
       
        MyClass obj = new MyClass("Hye! java is working fine ");

      
        obj.displayMessage();
        System.out.println();
         System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
}
