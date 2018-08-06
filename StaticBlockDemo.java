package book;

// PROGRAM 3.7.1
public class StaticBlockDemo {
	
	// static block definition
	static 
	{		
		System.out.println
			("In static block of class StaticBlockDemo");
	}
	
	// Main method
	public static void main(String args[]) 
	{
		System.out.println("In main method of class StaticBlockDemo");
	}

}
