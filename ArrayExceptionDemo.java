package book;

//PROGRAM 4.2.1

public class ArrayExceptionDemo {
	public static void main(String args[]) 
	{
		// Define and initialize an array data
		int data [] = {1,2,3,4,5};
		
		// print the array elements
		System.out.println("The contents of the array data::");
		for (int item = 0; item <= data.length ; item ++) 
		{	    		
			System.out.println("The element " + item + " " 
					+ "of the array is::" + data[item]);
		}	
		System.out.println("Array has been successfully ");
	}
}


