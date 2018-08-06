package book;

import java.io.IOException;

//public class CheckAgeException {
//	void checkAge(int age)
//	{  
//		if(age<16) {
//			ArithmeticException expObject = new ArithmeticException 
//						("Age:" + age + " Not Eligible for Registration!"); 
//			throw expObject;
//		}
//		else  
//		   System.out.println
//		   			("Age: " + age +" Eligible for Registration!");  
//	} 
//	
//	public static void main(String args[])
//	{  
//		CheckAgeException obj = new CheckAgeException();
//		obj.checkAge(13);
//		System.out.println("End Of Program");  
//	}
//}

//// PROGRAM 4.10.1
//
//public class CheckAgeException {
//	void checkAge(int age)
//	{  
//		if(age<16)  {
//			IOException exObj = 
//				new IOException ("Not Eligible for Registration!");
//			throw exObj;
//		}
//		else  
//		   System.out.println
//		   	("Eligible for Registration!");  
//	} 
//	
//	public static void main(String args[])
//	{  
//		CheckAgeException obj = new CheckAgeException();
//		obj.checkAge(13);  
//		System.out.println("End Of Program");  
//	}
//}

// PROGRAM 4.10.2

public class CheckAgeException {
	void checkAge(int age) throws IOException
	{  
		if(age<16)  {
			IOException exObj = 
				new IOException ("Not Eligible for Registration!");
			throw exObj;
		}
		else  
		   System.out.println
		   	("Eligible for Registration!");  
	} 
	
	public static void main(String args[])
	{  
		CheckAgeException obj = new CheckAgeException();
		try 
		{
			obj.checkAge(13);  
		}
		catch (IOException ex) 
		{
			ex.printStackTrace();  	
		}
		System.out.println("End Of Program");  

	}
}

//PROGRAM 4.10.3

//public class CheckAgeException {
//	void checkAge(int age) throws IOException
//	{  
//		if(age<16)  {
//			IOException exObj = 
//				new IOException ("Not Eligible for Registration!");
//			throw exObj;
//		}
//		else  
//		   System.out.println
//		   	("Eligible for Registration!");  
//	} 
//	
//	public static void main(String args[]) throws IOException
//	{  
//		CheckAgeException obj = new CheckAgeException();
//		obj.checkAge(13);  
//		System.out.println("End Of Program");  
//
//	}
//}
