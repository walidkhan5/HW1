/**
 * 
 */
package HW1;

/**
 * @author walid
 *
 */
import java.util.Scanner;
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("\"Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids " +
                "\nto magical Mischief-Makers are proud to present THE MARAUDER'S MAP\"" +
                "\n\nSay the magic phrase to reveal the map.");

        Scanner object = new Scanner(System.in);

        while (!object.nextLine().equals("I solemnly swear that I am up for no good")) {
            System.out.println("Those are not the correct words try again: ");
        }

        System.out.println("The Entrance" +
                "\nYou arrive at the doors of Hogwarts. The door on the north leads to \n" +
                "the dining hall, the door to the east leads to the Potions classroom, and\n" +
                "the door to the west leads to the Library.\n");

        boolean Choice = false; 
        String End = "mischief managed"; 
        String a = object.nextLine();
        
        while (!Choice) {
            if ( a.contains("north") )
            {
                DiningHall diningHall = new DiningHall();
                Choice = true;
               
            } 
            else if (a.contains("west") ) 
            {
                Library library = new Library();
                Choice = true;
               
            }
            else if ( a.contains("east") ) 
            {
                PortionsClassroom potionsclassroom = new PortionsClassroom();
                Choice = true;
              
            } 
            else if (a.equals(End)) 
            {
                Choice = true;
            } 
            else 
            {
                System.out.println("Invalid option");
                System.out.println();
                System.out.println("So were you want to go: ");
                a = object.nextLine();
            }
        }

      
        System.out.println("Hiding map contents...end.");
    }
}


