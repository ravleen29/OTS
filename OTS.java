import java.util.Scanner;

/**
 * Write a description of class OTS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OTS
{
    
    public void act()
    {
        main();
       
    }

        public void main() 
        {
            while (true) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.println("1. Sign Up");
            System.out.println("2. Log In");
            System.out.println("3. See Events");
            System.out.println("4. See Seats");
            System.out.println("5. Buy seats");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    signUp();
                    break;
                case 2:
                    logIn();
                    break;
                case 3:
                    seeEvents();
                    break;
                case 4:
                    seeSeats();
                    break;
                case 5:
                    buySeats();
                    break;
                case 6:
                    System.out.println("Exiting OTS. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        
       }
    }
        
        public void signUp()
        {
            System.out.println("You are in sign up option now!");
            
            
        }
        public  void logIn()
        {
            System.out.println("You are in log in option now!");
            User user = new User();
            user.main();
        }
        public void seeEvents()
        {
            System.out.println("You are in see events option now!");
             Event.showEvents();
        }
        public void seeSeats()
        {
            System.out.println("You are in See seats option now!");
            Seats seats = new Seats(20);  
            seats.checkAllSeats();
            
        }
        public void buySeats()
        {
         System.out.println("Would you like to purchase seats for the event?");
         Seats seats = new Seats(20);

   
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number of seats to purchase: ");
         int numSeats = scanner.nextInt();

    
        seats.purchaseSeats(numSeats);
        }
        
    }

