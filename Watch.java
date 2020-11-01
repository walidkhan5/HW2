package HW2;

import java.util.concurrent.TimeUnit;

public class Watch implements Runnable {

	
	boolean b;
	
	Console c;
	
	String functionality;
	
	Thread t;
	
	Watch(String f, Console c) 
	{
		
		this.c = c;
		
		this.functionality = f;
		
		t = new Thread(this);
		
		t.start();
	}

	@Override
	public void run() 
	{
		try 
		{
			
			for (int i = 0; i < 3; i++) 
			{// finishs before 3 minutes
				
				TimeUnit.MINUTES.sleep(1);
				
				c.write("\n"+(i + 1) + " minutes passed...\n");
				
			}

			c.write("3 minutes have already passed...You have 10 seconds to hide map contents before  someone sees you!");
			b = true;
			
			
			
			try 
			{
				
				TimeUnit.SECONDS.sleep(10);
			} 
			
			catch (InterruptedException e) 
			{
				e.getStackTrace();
			}
			
			c.write("You have been caught... and the Marauder's map has been confiscated.");
			
			System.exit(1);
			
		} 
		
		catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
}
