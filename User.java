import java.util.Scanner;

/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    private String username;
    private String password;
    
    public void act()
    {
        main();
    }
   public static void main(){
    Scanner input = new Scanner(System.in);
     String username;
     String password;
    
    System.out.print("Enter your fullname for the username: ");
    username = input.nextLine();
    System.out.print("Enter your password ");
    password = input.nextLine();
        
    
    if (username.equals("username") && password.equals("password1"))
    {
        System.out.println("You are now officially logged in!");
        
    }
    else 
    {
        System.out.println("Wrong password, please try again");
        password = input.nextLine();
        
        
         if (username.equals("username") && password.equals("password1"))
        {
          System.out.println("You are now officially logged in!");
        }
        
    }
   }
     
}
