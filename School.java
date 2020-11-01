/**
 * 
 */
package HW2;

/**
 * @author walid
 *
 */
public abstract class School 
{

	String name;
	String location;
	Console c;

	public School() 
	{

	}

	public School(String n, String l, Console c) 
	{
		this.location = l;
		
		this.name = n;
		
		this.c = c;
	}

	abstract void exitingRoom();
}
