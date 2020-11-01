/**
 * 
 */
package HW2;

/**
 * @author walid
 *
 */
import java.util.Scanner;

public class DiningHall extends School {

	Harry h;

	

	DiningHall(Harry h, Console c) 
	{

		super("DiningHall", "North", c);

		this.h = h;

		c.write("The Dining Hall is biggest open area inside Hogwarts. Professor\n" + "Dumbledore is here.");

		String str = c.read();

		while (  !(str.contains("exit") || str.contains("Exit"))  ) 
		{
			System.out.println("Invalid option please try again..");
			str = c.read();
		}
		exitingRoom();
	}

	
	
	@Override
	void exitingRoom() 
	{
		c.write("Leaving the room...enter a new direction");
		
		boolean choice = false;

		
		while (!choice) 
		{
			String str = c.read();

			if (  str.contains("east") || str.contains("East")   ) 
			{
				h.setLocation("Potions Classroom");
				choice = true;
				PortionsClassroom pc = new PortionsClassroom(h, c);
			} 
			else if (str.contains("west") || str.contains("West")) 
				{
					h.setLocation("Library");
					choice = true;
					Library lb = new Library(h, c);
				} 
			else 
			{
				System.out.println("Invalid option please try again:");
			}
		}
	}

}
