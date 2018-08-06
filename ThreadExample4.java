//PROGRAM 5.9.1

package book;

public class ThreadExample4 extends Thread{
	public void run() {
		System.out.println("Current Thread Name::  " + 
		Thread.currentThread().getName());
		for (int i = 1 ; i<6 ; i++) {
		System.out.println("Numebr:" + i);
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
		ThreadExample4 t = new ThreadExample4();
		t.setName("MyThread");
		t.start();

		for (char i = 'a' ; i<'e' ; i++) {
			System.out.println("Alphabet:" + i);			
		}		
		System.out.println("main thread finishes...");
	}
}
