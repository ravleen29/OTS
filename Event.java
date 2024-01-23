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
    
    System.out.print("Would you like to see the list of events? ");
    eventChoice = input.nextLine();
    boolean eventsList = false;
    
    do{
    if (eventChoice.equals("Yes") )
    {
        System.out.println("Here is the list of events for the following dates: ");
        
    }
    else 
    {   if (eventChoice.equals("No") )
        System.out.println("There are no other events than except for the list of shows published. ");
        System.out.print("Would you like to see the list of events and choose one of the available events! ");
        eventChoice = input.nextLine();
        
        
          if (eventChoice.equals("Yes") )
        {
          System.out.println("You might like these events to attend. Here is the list: ");
        }
        
    }
   } while (eventsList);
   } 
}
