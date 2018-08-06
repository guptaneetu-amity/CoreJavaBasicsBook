package book;

// PROGRAM 4.5.1

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExceptionDemo {
	public static void main(String args[]) {
		
		/* try block starts.
		 * Code that can throw exception is written in try block
		 */
		
		try {
			// file name string
			String fname = "E:/DataFile.txt";

			// Open file
			System.out.println ("Open file:" +  fname);
			File theFile = new File (fname);
			FileReader freader = new FileReader (theFile);

			// file is opened successfully
			System.out.println ("The file " + 
					theFile.getName() + " is present");
		}
		catch(FileNotFoundException ex) {	
			System.out.println ("Exception is thrown of type " 
					+ ex.getClass());
			System.out.println (ex.getMessage());
			ex.printStackTrace();
	  }
   }
}

