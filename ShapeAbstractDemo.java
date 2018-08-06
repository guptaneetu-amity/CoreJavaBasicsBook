package book;

// PORGRAM 3.6.2

abstract class MyShapeAbstract {
	void display() 
	{
		System.out.println("" +
				"In MyRectangle::display()");
	}
}

public class ShapeAbstractDemo {
	public static void main (String args[]) {
		
		// Create an object of MyShapeAbstract
		// Compiler Error
		MyShapeAbstract shapeObj = new MyShapeAbstract();

		// Declare a reference of MyShapeAbstract
		// Correct - a reference can be created
		MyShapeAbstract shapeRef;

		
	}
}
