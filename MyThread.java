package book;

//PROGRAM 5.3.1

public class MyThread extends Thread {
	
	//override the run method of Thread class
	public void run() {
		
		// Print name of current thread i.e. mythread
		System.out.println("Current Thread Name::  " + 
				Thread.currentThread().getName());
		
		// code for mythread to print 0-10
		for (int i = 0 ; i<=10 ; i++) {
			System.out.println("Numebr:" + i);			
		}
	}
	
	public static void main(String args[]) {
		//Print name of current thread i.e. main
		System.out.println("Current Thread Name::  " + 
			 Thread.currentThread().getName());
	
		// Create an object of MyThread class and set name
		MyThread t = new MyThread ();
		t.setName("mythread");
		System.out.println("Created thread  " + 
				 t.getName());
		
		// start thread t
		t.start();
		System.out.println("Started thread  " + 
				 t.getName());
		 
		// code of main thread to print a-z 
		for (char i = 'a' ; i<='z' ; i++) {
			System.out.println("Alphabet:" + i);			
		}
	}	 
}



