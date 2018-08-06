package book;

// PROGRAM 2.8.1

public class StaticDemo {
	
	// static data member
	static int counter = 5;
	
	// non-static data member
	int number = 10;   		
	
	// Non-static method
	public void display () {
		System.out.println ("This is non-static method");
		System.out.println ("Counter =" + counter);
		System.out.println ("Number=" + number);
	}
	
	// Static method
	public static void count() {
		System.out.println ("“This is a static method");
	
		// use of non static method
		display (); //compilation error

		// use of non-static variable
		number = 10; //compilation error
		
		// use of static variable and method - OK
		counter = 5;
	}	
}



////PROGRAM 2.7.1
//
//public class StaticDemo {
//  
//	// Static data member
//	static int counter = 5;
//	
//	// Non-static data member
//	int number = 5;
//
//	// A Non-static method
//	public void display() 
//	{
//		System.out.println ("This is non-static method");
//	}
//	
//	// A Static method
//	public static void count() 
//	{
//		System.out.println ("“This is a static method");
//	}
//	
//	
//	//main method
//	public static void main(String[] args) 
//	{
//		// Create an object sampleObj
//		StaticDemo sampleObj = new StaticDemo ();
//		  
//		// Print non-static data member number
//		System.out.println ("Value of number = " + 
//				  sampleObj.number);
//		  
//		// Print static data member counter
//		System.out.println ("Value of Counter = " + 
//				  StaticDemo.counter);
//		
//		// Call static method - count
//		StaticDemo.count ();
//	    	
//		// Call Non- Static method - display
//		sampleObj.display ();
//	  } 
//}

