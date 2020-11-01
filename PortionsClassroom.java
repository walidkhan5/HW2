/**
 * 
 */
package HW2;

/**
 * @author walid
 *
 */

public class PortionsClassroom extends School {

	Harry h;
    Console c;


     PortionsClassroom(Harry h, Console c) {
        super("Potions Classroom", "East", c);
        this.h = h;
        c.write("The Potions Classroom is one of the core subjects that first year\n" +
                "students are required to study. Professor Snape is here.");

        String str = c.read();

        while (!(str.contains("exit") || str.contains("Exit"))) {
            c.write("Invalid option please try again..");
            str = c.read();
        }
        exitingRoom();
    }

    @Override
    void exitingRoom() {
        System.out.println("Leaving the room...enter a new direction");
        boolean choice = false;
        while (!choice) {
            String str = c.read();
            if ( str.contains("west") || str.contains("West")) {
            	choice = true;
                h.setLocation("Library");
                Library library = new Library(h, c);
            } else if ( str.contains("east") || str.contains("East")) {
            	choice = true;
                h.setLocation("Dining Hall");
                DiningHall dining = new DiningHall(h, c);
            } else {
                System.out.println("Invalid option please try again:");
            }
        }

    }
}
