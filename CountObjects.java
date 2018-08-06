package book;

// PROGRAM 2.9.1

public class CountObjects {
	
	//static data member
	static int counter; 
	
	// non-static data member
	int number = 0; 
	
	//Constructor – this increments counter and number
	public CountObjects () {
		counter++;
		number++;
	}
	
	// displays values of counter and number
	public void display() 
	{
		System.out.println("Counter:" + counter);
		System.out.println("Number:" + number);
	}
	
	//Method main
	public static void main(String args[]) 
	{
		// Create s1 object
		CountObjects s1 = new CountObjects();

		// Show data of s1
		System.out.println("Information of s1 object before s2----");
		s1.display();

		// create s2 object
		CountObjects s2 = new CountObjects();

		// Display data of s1 object
		System.out.println("Information of s1 object after s2----");
		s1.display();
		
		//Display data of s2 object
		System.out.println("Information of s2 object----");
		s2.display();		
	}
}

