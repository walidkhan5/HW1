/**
 * 
 */
package HW1;

/**
 * @author walid
 *
 */
import java.util.Scanner;
public class Library extends School implements Charecter{
	


	    Library() {
	       
	        System.out.println("You have entered the Library.");
	        String End = "mischief managed"; 
	        boolean Choice = false;
	        Scanner object = new Scanner(System.in);
	        this.a = object.nextLine();
	        
	        while ((!this.a.equals(End)) || (!Choice)) {
	            if (this.a.contains("talk") && (this.a.contains("Hermione"))) 
	            {
	                Choice = true;
	                talk();
	            } 
	            else if ( this.a.contains("talk") && !(this.a.contains("Hermione"))) 
	            {
	                System.out.println("The character is not the room..try again!");
	            } 
	            else if ( this.a.contains("use") &&  this.a.contains("quill")) 
	            {
	                Choice = true;
	                use();
	            } 
	            else if ( this.a.contains("read") &&  this.a.contains("book")) 
	            {
	                Choice = true;
	                use();
	            } 
	            else if ( this.a.contains("use") && !(this.a.contains("quill"))) 
	            {
	                System.out.println("Invalid object ");
	            } 
	            else if (this.a.contains("read") && !(this.a.contains("book"))) 
	            {
	                System.out.println("Invalid object ");
	            } 
	            
	            else if (this.a.contains("look")) 
	            {
	                look();
	                Choice = true;
	            } 
	            else 
	            {
	                System.out.println("Invalid option");
	            }
	            
	            this.a = object.nextLine();
	        }
	    }

	    @Override
	    public void look() {
	        System.out.println("Once the academic year starts, students spend a lot of their time in the school library.\n" +
	                "Amongst those students is Hermione .");
	    }

	    @Override
	    public void talk() {

	        System.out.println("Wingardium Leviosa");

	    }

	    @Override
	    public void use() {
	   
	                    System.out.println("You have read the book");
	                    
	    }
}

