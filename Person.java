package HW2;

public abstract class Person implements Runnable {

	String name;
	int age;
	int height;
	String gender;
	String location;
	Thread t;
	Console c;

	public Person() 
	{

	}

	public Person(String n, int a, int h, String g, String l, Console c) 
	{
		this.name = n;
		this.age = a;
		this.height = h;
		this.gender = g;
		this.location = l;
		this.c = c;
	}

	
}
