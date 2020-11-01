/**
 * 
 */
package HW2;

/**
 * @author walid
 *
 */
import java.util.Scanner;

public class Library extends School {
	
	Hermione her;
	Harry har;
	Console c;

	
	Library(Harry har, Console c) 
	{
		super("Library", "West", c);
		
		this.har = har;
		
		her = new Hermione(har, c);
		
		c.write("The Library is where students spend a lot of their time once the academic year starts. Hermione is here.");
	}

	@Override
	void exitingRoom() 
	{
		// Harry has reached Hermione. Hence, he does not need to go anywhere next.
	}
}
