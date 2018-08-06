package book;

public class MainThreadDemo {
	 public static void main(String args[]) {
		 // Print information related to current Thread
		 Thread currentThreadObject = Thread.currentThread();
		 System.out.println("Current Thread Name::  " 
				 + currentThreadObject.getName());
		 System.out.println("Current Thread Priority:: " 
				 + currentThreadObject.getPriority());
		 System.out.println("Current Thread State:: " 
				 + currentThreadObject.getState());
		 // Change name and print
		 currentThreadObject.setName("MyThread");
		 System.out.println("Current Thread Name Changed as ::  " 
				 + currentThreadObject.getName());
	 }
}



