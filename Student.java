package book;

//PROGRAM 3.1.2

//public class Student {
//	private String mName; // member - variable
//	private String mEnrollment;
//	private String mPhone;
//
//	// Constructor I : default Constructor – with no arguments
//	Student () 
//	{
//		mName = "";
//		mEnrollment = "";
//		mPhone = "";
//	}
//
//	// Constructor II -  with three arguments
//	Student (String n, String e, String p) 
//	{
//		mName = n;
//		mEnrollment = e;
//		mPhone = p;
//	}
//	
//	public static void main(String args []) {
//		// Calls default constructor 
//		// As no argument passed 
//		Student s1 = new Student() ;
//		
//		// Calls Constructor-II
//		// As three arguments are passed
//		Student s2 = new Student ("Neela", 
//				"AW11234123", "9800009800");
//	}
//}
//
//class Student {
//	....
//	// Constructor defined with return type int
//	int Student (string n, string e, string p) 
//	{
//		name = n;
//		enrollment = e;
//		phone = p;
//		return 0;
//	}
//	....
//}


//// PROGRAM 3.1.1
//public class Student {
//	private String mName; // member - variable
//	private String mEnrollment;
//	private String mPhone;
//	
//
//	// Constructor
//	Student (String n, String e, String p) 
//	{
//		mName = n;
//		mEnrollment = e;
//		mPhone = p;
//	}
//	
//	public static void main(String args[]) {
//		Student sObject = new Student ();
//	}
//}


////PROGRAM 2.5.1
//
//public class Student {
//	private String name;
//	private String course;
//	private int marks [] = new int[5];		
//
//	/* Constructor defined
//	 * No return type, not even void
//	 * Name is same as class name that is Student
//	 */
//	Student (String n, String c) 
//	{
//		name = n;
//		course = c;
//	}
//
//	public void setName (String n)
//	{
//		name = n;
//	}
//
//	public void setCourse (String c)
//	{
//		course = c;
//	}
//	
//	public void setMarks( int m0, int m1, 
//			int m2, int m3, int m4)
//	{
//		marks[0] = m0;
//		marks[1] = m1;
//		marks[2] = m2;
//		marks[3] = m3;
//		marks[4] = m4;
//	}
//
//	// Method to calculate total of marks
//	public int totalmarks() 
//	{
//		int total = 0;
//		for (int i : marks) {
//			total += i;
//		}
//		return total;		
//	}
//
//	// Method to calculate percentage marks of student
//	public float percentage () 
//	{		
//		return totalmarks() * 5 / 100;
//	}
//}






//PROGRAM 2.4.1

public class Student {
	private String name;
	private String course;
	private int marks [] = new int[5];

	// Method to set name value
	public void setName (String n)
	{
		name = n;
	}

	// Method to set course value
	public void setCourse (String c)
	{
		course = c;
	}
	
	// Method to set values of Marks	
	public void setMarks( int m0, int m1, 
			int m2, int m3, int m4)
	{
		marks[0] = m0;
		marks[1] = m1;
		marks[2] = m2;
		marks[3] = m3;
		marks[4] = m4;
	}

	// Method to calculate total of marks
	public int totalMarks() 
	{
		int total = 0;
		for (int i : marks) {
			total += i;
		}
		return total;		
	}

	// Method to calculate percentage marks
	public float percentage () 
	{		
		return (totalMarks() / 5.0f);
	}
	
	public static void main(String args []) 
	{
		// Create a Student object s1
		Student s1 = new Student();
	  	
		// Set value of Name of Object s1
		s1.setName("Joe");
	
		// Set value for course of Object s1
		s1.setCourse("IT");
		
		// Set values of marks of Object s1
	  	s1.setMarks(67,78,88,56,43);
		
	  	// call method totalMarks() of object s1
	  	System.out.println("Total Marks: " +  s1.totalMarks());
	  	
	  	// Call method percentage of object s1
	  	System.out.println("Percentage: " + s1.percentage() +     "%");		
	}
}


// PROGRAM 2.2.1

//public class Student {
//	private String name;		// member - variable
//	private String enrollment;	// member - variable
//	private String address;		// member - variable
//	private String course;		// member – variable
//	private int marks [] = new int[5]; //member-variable
//
//	
//	// Method to calculate total marks
//	public int totalmarks () 
//	{
//		int total = 0;
//		for (int i = 0; i <= 5; i++) {
//			total += marks[i];
//		}
//		return total;
//	}
//
//	// Method to calculate percentage of Marks
//	public float percentage () 
//	{
//		return totalmarks() / 5;
//	}
//	
//	public static void main(String args []) 
//	{
////		// Create a Student object s1
//		Student s1 = new Student();
//		s1.totalmarks();
//	}
//}



//PROGRAM 2.1.3

//public class Student {
//	private String name;		// member - variable
//	private String enrollment;	// member - variable
//	private String address;		// member - variable
//	private String course;		// member – variable
//	private int marks [] = new int[5];	// member – variable
//
//	public int totalMarks() 
//	{
//		/* Calculate total marks
//		 * and return		 * 
//		 */
//		return marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
//	}
//
//	public float percentage() 
//	{
//		/* Calculate percentage marks
//		 * and return		 * 
//		 */
//		return totalMarks() / 5;
//	}
//}




////PROGRAM 2.1.2
//
//public class Student {
//	private String name;		// member - variable
//	private String enrollment;	// member - variable
//	private String address;		// member - variable
//	private String course;		// member – variable
//	private int marks [];		// member – variable
//}

