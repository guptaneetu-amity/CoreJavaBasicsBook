package book;

//PROGRAM 3.3.1
public class PrivateConstructorDemo {

	// Define a private constructor
	private PrivateConstructorDemo () {
        //private constructor
    }

	// Define a method to create objects
	public static PrivateConstructorDemo createObject() {
		return new PrivateConstructorDemo();
	}

	// Define a method display
	public void display () {
		System.out.println("Object of class with private constructor ");
		System.out.println("In display method.");
	}
	
	//main method
    public static void main(String args[]) {
    	PrivateConstructorDemo mObject = 
    		PrivateConstructorDemo.createObject();
    	mObject.display();
    }
}

