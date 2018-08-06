// PROGRAM 5.9.2

package book;

public class ThreadJoinDemo extends Thread{
	public void run() {
		System.out.println("Current Thread Name::  " + 
		Thread.currentThread().getName());
		
		/* Implement for loop and 
		 * sleep for 500 ms in each iteration.
		 * sleep() may throw exception InterruptedException
		 */
		for (int i = 1 ; i<6 ; i++) {
			System.out.println("Number:" + i);
			try {
			sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
		System.out.println("mythread thread finishes...");			
	}

	public static void main(String args[]) {
		System.out.println("Current Thread Name::  " + 
						Thread.currentThread().getName());
		
		/* Create thread t of type ThreadExample4
		 * Set the name of thread as MyThread
		 * And start the thread calling start () method
		 * */
		ThreadJoinDemo t = new ThreadJoinDemo();
		t.setName("MyThread");
		t.start();
		
		/* Code to print alphabets a to d */
		for (char i = 'a' ; i<'e' ; i++) {
			System.out.println("Alphabet:" + i);
			
			try {
				sleep(300);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
		
		/* Join main thread with thread t
		 * A call to join method may throw an exception
		 * of type InterruptedException. Hence it must be
		 * handled hare using try-catch
		 * */
		try {
			t.join();
		}
		catch(InterruptedException e){
				System.out.println(e);
		}
		
		System.out.println("main thread finishes...");
	}
}



