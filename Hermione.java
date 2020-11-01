package HW2;

public class Hermione extends Person 
{

	Harry h;

	public Hermione(Harry h, Console c) 
	{
		super("Hermione", 22, 165, "Female", "Library", c);
		this.h = h;
		
		t = new Thread(this);
		t.start();
	}

	
	void MonitorLocation()
	{
		boolean w=true;
		while (w) {
			if ( h.getLocation().equals(this.location) ) {//if its equal to Library
				c.write("Harry I am here!");
				break;
			}
		}
	}

	
	@Override
	public void run() 
	{
		MonitorLocation();
	}
}