package book;

//PROGRAM 3.9.1

public class Sample 
{
	int mValue;
	//Constructor
	public Sample (int value) {
		System.out.println("In Sample() constructor");
		mValue = value;
	}
	
	// A normal method
	public void display() {
		System.out.println("In Sample display() method");
		System.out.println("Value = " + mValue);
	}
	
	// A normal method
	public void increment() {
		System.out.println("In Sample increment() method");
		mValue++;
		display();
	}
	
	
	// A static method
	public static void getObject() {
		// Call to a non-static method
		display();
	}
	
	public static void main(String args[]) {  
		
		// Create an object s1
		Sample s1 = new Sample(10);
		
		// Call method increment on s1
		s1.increment();
		
		// Call static method on class Sample
		Sample.getObject();

	}
}
////PROGRAM 1.8.1
//
//public class Sample {
//
//	public void main (String args[]) 
//	{
//		System.out.println ("The values passed are::");
//		for(int i = 0; i<args.length; i++) 
//		{
//			System.out.println("args[" + i + "]: " 
//					+  args[i]);
//		}
//	}
//}


