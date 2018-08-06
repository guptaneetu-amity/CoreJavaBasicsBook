package book;

// PROGRAM 4.7.1 - Program to write to a file
import java.io.PrintWriter;

public class CheckedExceptionDemo {
	public static void main(String[] args)
	{
		// Create a writer object and attach to file employee.txt
		PrintWriter printFile = new PrintWriter("employee.txt");
		printFile.println("John,Manager,12031999");
	} 
}
