/**
 * 
 */
package HW1;

/**
 * @author walid
 *
 */
import java.util.Scanner;

public class DiningHall  extends School implements Charecter {
	
	String SortingHat;
	
    DiningHall() {
        System.out.println("You have entered the Dinning Hall.");
        String End = "mischief managed"; 
        boolean Choice = false;
        Scanner object = new Scanner(System.in);
        this.a = object.nextLine();
        
        while (  (  !this.a.equals(End)  )  || (!Choice)  ) {
            if ( this.a.contains("talk") && (this.a.contains("Dumbledore") )) 
            {
                Choice = true;
                talk();
            }
            else if ( this.a.contains("talk") && !(this.a.contains("Dumbledore")) ) 
            {
                System.out.println("The character is not the room..try again!");
            } 
            else if (this.a.contains("use") &&  this.a.contains("hat")) 
            {
                Choice = true;
                use();
            } 
            else if ( this.a.contains("use") && !this.a.contains("hat")) 
            {
                System.out.println("Invalid object");
            } 
            else if ( this.a.contains("eat") &&  this.a.contains("food")) 
            {
                Choice = true;
                use();
            } 
            else if (this.a.contains("eat") && !this.a.contains("food")) 
            {
                System.out.println("Invalid object");
            } 
            else if (this.a.contains("look")) 
            {
                look();
                Choice = true;
            } 
            else 
            {
                System.out.println("Try again:");
            }
            this.a = object.nextLine();
        }
    }

    @Override // indicates that the child class method is over-writing its base class method.
    public void look() {
        System.out.println("The Dining Hall is the biggest open area inside Hogwarts." +
                "Professor Dumbledore is in the hall to welcome new students");
    }

 
    @Override// indicates that the child class method is over-writing its base class method.
    public void talk() {
        /*if (this.SortingHat != null) {
            System.out.println("\"Congratulations for joining the " + SortingHat + " house.\" -Albus Dumbledore");
        } else {*/
            System.out.println("\"Welcome to the dining hall! Interact with the sorting hat to be sorted\n" +
                    "into a house, then enjoy the food served in the hall.\"");
        }
    //}

    @Override// indicates that the child class method is over-writing its base class method.
    public void use() {
        if (SortingHat == null) {
            int x = ((int) (Math.random() * 4)) + 1;
            switch (x) {
                case 1:
                    SortingHat = "Ravenclaw";
                    System.out.println(SortingHat + "!");
                   
                    break;

                case 2:
                    SortingHat = "Slytherin";
                    System.out.println(SortingHat + "!");
                    
                    break;

                case 3:
                    SortingHat = "Gryffindor";
                    System.out.println(SortingHat + "!");
                   
                    break;

                case 4:
                    SortingHat = "Hufflepuff";
                    System.out.println(SortingHat + "!");
                   
                    break;

            }
        } else
            System.out.println("You are already in the " + SortingHat + " house ");
    }

  
}


