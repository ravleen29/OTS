import java.util.Scanner;

public class Customer extends User {
    
    public void act(){
       main();
       details();
       
    }
    private String Name;
    private int Age;
    private String Address;
    
   
    public void details(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        Name = input.nextLine();

        System.out.print("Enter your address: ");
        Address = input.nextLine(); 
        
        System.out.print("Enter your age: ");
        Age = input.nextInt();
        
        System.out.print("Details accepted! ");

        displayDetails();
    }
  
    public void displayDetails() {
        System.out.println("Customer Details:");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Address: " + Address);
    }

    
}
