package HW2;

import java.util.Scanner;

public class Console implements Runnable {
	Thread t;
	Scanner object;;

	boolean checkifReadingfReading;
	boolean checkifReadingfWriting;

	String in;
	String out;

	Console() {// constructor
		object = new Scanner(System.in);
		// at the beginning both are false
		checkifReadingfReading = false;
		checkifReadingfWriting = false;
		System.out.println("\"Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids "
				+ "\nto magical Mischief-Makers are proud to present THE MARAUDER'S MAP\""
				+ "\nSay the magic phrase to reveal the map.");

		while (!object.nextLine().equals("I solemnly swear that I am up for no good")) {
			write("Looks like you are not ready for this adventure ... Please try again. ");
		}
		in = " ";
		out = " ";
		t = new Thread(this);
		t.start();
	}

	void write(String a) {
		System.out.println(a);
	}

	String read() {
		return object.nextLine();
	}

	@Override
	public void run() {

	}
}