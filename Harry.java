package HW2;

public class Harry extends Person {

	Watch w;

	Harry(Console c) {

		super("Harry Potter", 21, 180, "Male", "The Entrance", c);
		w = new Watch("time", c);

		System.out.println("The Entrance");
		
		System.out.println("You arrive at the doors of Hogwarts. The door on the north wall leads to the dining hall,\nthe door to the east leads to the Potions class, and the door to the west leads to the Library.");

		boolean choice = false; // choice will check if the options used are valid

		String str = c.read();

		while (!choice) {
			if (str.contains("north") || str.contains("North")) 
			{
				setLocation("The Dining Hall");
				DiningHall diningHall = new DiningHall(this, c);
				choice = true;
			}

			else if (str.contains("east") || str.contains("East")) 
			{
				setLocation("The Potions Classroom");
				PortionsClassroom potionsclassroom = new PortionsClassroom(this, c);
				choice = true;
			}

			else if (str.contains("west") || str.contains("West")) 
			{
				setLocation("The Library");
				Library library = new Library(this, c);
				choice = true;
			}

			else if (str.contains("mischief managed") || str.contains("Mischief managed")) 
			{
				choice = true;
			}

			else {
				System.out.println("Try again: ");
				System.out.println();
				str = c.read();
			}
			t = new Thread(this);
			t.start();
		}
	}

	public synchronized String getLocation() {// Getter
		return this.location;
	}

	public synchronized void setLocation(String l) {// Setter
		this.location = l;
	}

	@Override
	public void run() {
		while (true) {// To win the game
			
			if (getLocation().equals("Library")) {
				c.write("Found Hermione! ");
				
				if (c.read().equals("Mischief managed") || c.read().equals("mischief managed")) {
					c.write("Hiding map contents... end.");
					System.exit(1);
				}

			} 
			
			else if (w.b) {
				String a = c.read();
				
				if (a.equals("Mischief managed") || a.equals("mischief managed")) {
					c.write("Hiding map contents...end.");
				}
			}
			System.exit(1);
		}
	}
}
