package book;

public class DemoThreadRunnable implements Runnable {
	public void run() {
		System.out.println("Current Thread Name::  " + 
				Thread.currentThread().getName());
		
		// Loop to print 0 to 10
		for (int i = 0 ; i<11 ; i++) {
			System.out.println("Numebr:" + i);			
		}
	}
		
	public static void main(String args[]) {
		 System.out.println("Current Thread Name::  " + 
				 Thread.currentThread().getName());
		 
		 /* Start a new thread*/
		 // 1. Thread Create object of DemoThreadRunnable class
		 // 2. Create a simple Thread object 
		 // with passing DemoThreadRunnable object in constructor
		 // Set name of your thread - OPTIONAL
		 // 3. Start the thread
		 DemoThreadRunnable tObj  = 
			 new DemoThreadRunnable(); 	// Define class object
		 Thread t = new Thread(tObj); 	// Create Thread class Object
		 t.setName("MyThread"); 		// Set name of our thread
		 t.start(); 					// start a new thread
		 
		 /* Continue with main method code*/
		 for (char i = 'a' ; i<'n' ; i++) 
		 {
			 System.out.println("Alphabet:" + i);
		 }
	}
}
