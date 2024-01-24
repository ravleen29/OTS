import java.util.Scanner;

/**
 * Write a description of class Event here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Event
{  
   public void act()
    {
        showEvents();
    }
    //  show event list  (By ravleen)
   public static void showEvents(){
    Scanner input = new Scanner(System.in);
     String eventChoice;
    
    System.out.print("Want to see the list of events? Yes or No ");
    eventChoice = input.nextLine();
    boolean eventsList = false;
    
    do{
    if (eventChoice.equals("Yes") )
    {
         eventList(); 
        
    }
    else 
    {   if (eventChoice.equals("No") )
        System.out.println("There are no other events than except for the list of shows published. ");
        System.out.print("Would you like to see the list of events and choose one of the available events! ");
        eventChoice = input.nextLine();
        
        
          if (eventChoice.equals("Yes") )
        {
          System.out.println("You might like these events to attend. ");
          eventList();
        }
        
    }
   } while (eventsList);
   } 
   public static void eventList(){
       System.out.println("Here is the list of events: ");
        System.out.println("1. Movie Nights!");
        System.out.println("2. Stand up comedy!");
        System.out.println("3. Buzz In!");
        System.out.println("4. Spill the Tea!");
   }
}
