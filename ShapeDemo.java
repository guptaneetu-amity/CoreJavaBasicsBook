package book;

// PORGRAM 3.5.1

// PROGRAM 3.4.1

// Defines Base class - MyShape
class MyShape {
	
	//Data members
	protected float dimension1;
	protected float dimension2;
	
	//Constructor
	public MyShape (float d1, float d2) 
	{
		System.out.println("In MyShape::MyShape()");
		dimension1 = d1;
		dimension2 = d2;
	}
	
	//Method area
	public float area() 
	{
		return 0;
	}
	
	//Static method display
	static void display() {
		System.out.println("" +
				"In MyRectangle::display()");
	}
}

// Defines Derived class - MyRectangle
class MyRectangle extends MyShape {
	
	//Constructor
	public MyRectangle (float d1, float d2) 
	{
		super(d1,d2);
		System.out.println (
				"In MyRectangle::MyRectangle()");
	}
	
	// Method area
	public float area() 
	{
		System.out.println (
				"In area method of MyRectangle class");
		return dimension1*dimension2;
	}
	
	//Static method display
	static void display() {
		System.out.println("" +
				"In MyRectangle::display()");
	}
}

class MyTriangle extends MyShape {
	
	//Constructor
	public MyTriangle (float d1, float d2) 
	{
		super(d1,d2);
		System.out.println ("" +
				"In MyTriangle::MyTriangle()");
	}
	
	//Method area
	public float area() 
	{
		System.out.println ("" +
				"In area method of MyTriangle class");
		return ((float)0.5*dimension1*dimension2);
	}
	
	//Static method display
	static void display() {
		System.out.println("" +
				"In MyRectangle::display()");
	}
}

class ShapeDemo {
	public static void main (String args[]) {
		MyShape shape = new MyTriangle(10,30);
		shape.display ();	
	}
}


//public class ShapeDemo {
//	public static void main (String args[]) 
//	{
//		// Declares reference of MyShape class
//		MyShape shape;
//		
//		//
//		float area = 0;
//		
//		// Assign MyTriangle object to shape reference
//		shape = new MyTriangle(10,30);
//		area = shape.area();
//		System.out.println("Area::" + area);
//
//		// Assign MyRectangle object to shape reference
//		shape = new MyRectangle(10,30);
//		area = shape.area();
//		System.out.println("Area::" + area);
//	}
//}

