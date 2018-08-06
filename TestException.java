package book;

// PROGRAM 4.3.1

import java.io.File;
import java.io.FileReader;

public class TestException {
	public static void main(String args[]) {		
		File fname = new File ("E:/DataFile.txt");
		FileReader freader = new FileReader (fname);
	}
}
