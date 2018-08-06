package book;

// PROGRAM 4.8.1 - Program to write to a file
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionDemo2 {
	public static void main(String[] args) 
							throws FileNotFoundException
	{
		// Create a writer object and attach to file employee.txt
		PrintWriter printFile = new PrintWriter("E:/employee.txt");
		printFile.println("John,Manager,12031999");
		System.out.println("Successfully written to file");
	} 
}