package book;
import java.io.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// PROGRAM 4.6.2
public class SampleException {
	public static void main(String args[]) {
	try {
		// a filename string
		String fname = "E:/DataFile1.txt";

		// open file
		System.out.println (
			"Trying to open a file " + fname);
		
		// open file
		File theFile = new File (fname);
		
		// File present - No Exception thrown
		System.out.println ("The file is present:: " 
				+ theFile.getName());
		
		// Read file
		String line = null;

		// Create a file read stream
		FileReader freader = 
			new FileReader (theFile);
		BufferedReader bufferedReader = 
			new BufferedReader(freader);
		
		// Read file line by line
		while((line = 
			bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		// Always close file(s)
		bufferedReader.close();       
	}
	catch(FileNotFoundException ex) {
		System.out.println (ex.getMessage());
		ex.printStackTrace();
	}
  	catch(IOException ex) {
  			System.out.println (ex.getMessage());
  			ex.printStackTrace();
	}  		
  	}
}


//	// PROGRAM 4.6.1
//	
//	public class SampleException {
//	  	public static void main(String args[]) {
//	  		try {
//				// a filename string
//				String fname = "E:/DataFile1.txt";
//		
//				// open file
//				System.out.println (
//					"Trying to open a file " + fname);
//				
//				// open file
//				File theFile = new File (fname);
//				
//				// File present - No Exception thrown
//				System.out.println ("The file is present:: " 
//						+ theFile.getName());
//				
//				// Read file
//				String line = null;
//	
//				// Create a file read stream
//				FileReader freader = 
//					new FileReader (theFile);
//				BufferedReader bufferedReader = 
//					new BufferedReader(freader);
//				
//				// Read file line by line
//				while((line = 
//					bufferedReader.readLine()) != null) {
//					System.out.println(line);
//				}
//				// Always close file(s)
//				bufferedReader.close();       
//			}
//	  		catch(FileNotFoundException ex) {
//	  			System.out.println (ex.getMessage());
//	  			ex.printStackTrace();
//			}
//	  	}
//	}

//class SampleException 
//{  
//   public static void main(String args[]) 
//   {
//	   // Create a File input stream - throws FIleNotFoundException
//	   FileInputStream fileStream =	
//		   new FileInputStream("E:/DataFile.txt");
//	   
//	   // Close the file - close() throws IOException
//	   fileStream.close(); 	
//   }
//}






