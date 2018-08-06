package book;

//PROGRAM 1.7.3

/* Program to print all command line arguments passed
*/

public class CommandLineDemo2 {
	
	// Main method receives passed arguments in args
	public static void main (String args[])	{
			
		// print a simple message
		System.out.println ("The values passed are::");
	
		// a loop to print each value in args
		// this will print all the arguments passed
		// to main method
		
		for(int i = 0; i<args.length; i++) {
			System.out.println("args[" + i + "]: " 
					+  args[i]);
		}
	}
}
