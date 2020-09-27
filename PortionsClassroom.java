/**
 * 
 */
package HW1;

/**
 * @author walid
 *
 */
import java.util.Scanner;
public class PortionsClassroom extends School implements Charecter {

    

     PortionsClassroom() {
       
        System.out.println("Welcome to the Potions Classroom where you can make magical potions.");
        String End = "mischief managed"; 
        boolean Choice = false;
        Scanner Object = new Scanner(System.in);
        // a loop until the player enters the correct choice
        this.a = Object.nextLine();
        
        while ((!Choice) || (!this.a.equals(End))) {
            if ( this.a.contains("talk") && (this.a.contains("Snape"))) 
            {
                Choice = true;
                talk();
            } 
            else if ( this.a.contains("talk") && !(this.a.contains("Snape")))
            {
                Choice = true;
                System.out.println("The character is not in the room...Try again: ");
            } 
            else if ( this.a.contains("use") &&  this.a.contains("cauldron"))
            {
                Choice = true;
                use();
            } 
            else if ( this.a.contains("drink") &&  this.a.contains("potion")) 
            {
                Choice = true;
                use();
            } 
            else if ( this.a.contains("use") && ! this.a.contains("cauldron")) 
            {
                System.out.println("The Objectect is not available to use at the Potions Classroom." +
                        "\nTry again: ");
            } 
            else if (this.a.contains("drink") && ! this.a.contains("Potion")) 
            {
                System.out.println("The Objectect is not available to drink at the Potions Classroom." +
                        "\nTry again: ");
            } 
            else if (this.a.contains("look")) 
            {
                look();
                Choice = true;
            } 
            else 
            {
                System.out.println(" try again:");
            }
            this.a = Object.nextLine();
        }
    }

    @Override
    public void look() {
        System.out.println("Welcome to the Portions Classroom! Potions is one of the core subjects that first year students are required to\r\n" + 
        		"study. In the potions class there is Professor Snape who teaches the subject.");
    }

    @Override
    public void talk() {
        System.out.println("Welcome young wizards and witches!  The Potions Classroom\r\n" + 
        		"is full of equipment and material that the player can use including a cauldron to make potions, and\r\n" + 
        		"a potion to drink that casts a magical spell.");
    }

    @Override
    public void use() {
        System.out.println("The cauldron is preparing the potion now.....");
        
                System.out.println("You created a potion, have fun drinking it :)");
                
    }
}


