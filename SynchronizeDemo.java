//PROGRAM 5.11.1

//package book;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;

//class Client {
//	synchronized public void readContent() { 
//		String line = null;
//		try {
//			/* Open file test.txt and read */			
//			FileReader fileReader = 
//        	    new FileReader("test.txt");
//			BufferedReader bufferedReader = 
//					new BufferedReader(fileReader);
//			while((line = bufferedReader.readLine()) != null) {
//				System.out.println(line);
//			}
//			
//			// Always close files.
//			bufferedReader.close();         
//		}
//		catch (Exception ex) {
//			ex.printStackTrace();
//		}
//	}
//		
//	synchronized public void writeContent() { 
//		String line = null;
//		try {
//			/* Open file test.txt and write */			
//			FileWriter fileWriter =
//				new FileWriter("tets.txt");
//			BufferedWriter bufferedWriter =
//				new BufferedWriter(fileWriter);
//			bufferedWriter.write("Hello there,");
//			bufferedWriter.write(" here is some text.");
//			bufferedWriter.newLine();
//			bufferedWriter.write("We are writing");
//			bufferedWriter.write(" the text to the file.");
//			
//			// Always close files.
//			bufferedWriter.close();
//		}
//		catch(IOException ex) {
//			ex.printStackTrace();
//		}
//	}
//}
//
//class ReadThread extends Thread {  
//	Client c;  
//	
//	ReadThread(Client c){  
//		this.c = c;  
//	}  
//	public void run(){  
//		c.readContent();
//	}
//}  
//
//class WriteThread extends Thread{  
//	Client c;  
//	
//	WriteThread(Client c){  
//		this.c = c;  
//	}  
//	public void run(){  
//		c.writeContent();
//	}
//}
//
//public class SynchronizeDemo {
//	public static void main(String args[]) {
//		
//		/* Create an object of class CLient */
//		Client myClient= new Client();
//		
//		/* Create objects of ReadThread and WriteThread
//		 * Start both the threads
//		 */
//		ReadThread rt = new ReadThread(myClient);
//		WriteThread wt = new WriteThread(myClient);
//		rt.start();
//		wt.start();		
//	}	
//}

//PROGRAM 5.11.2

package book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class Client {
	public void readContent() { 
		String line = null;
		try {
			FileReader fileReader = 
				new FileReader("test.txt");

            BufferedReader bufferedReader = 
            	new BufferedReader(fileReader);
		
            /* Put only the code that reads from file
             * in synchronized block 
             * */
            synchronized (this) {
            	while((line = bufferedReader.readLine()) != null) {
            		System.out.println(line);
            	}
            }
            
            // Always close files.
            bufferedReader.close();         
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
		
	public void writeContent() { 
		String line = null;
		try {
			FileWriter fileWriter =
				new FileWriter("tets.txt");
			BufferedWriter bufferedWriter =
				new BufferedWriter(fileWriter);

            /* Put only the code that writes to file
             * in synchronized block 
             * */
			synchronized(this) {
				bufferedWriter.write("Hello there,");
				bufferedWriter.write(" here is some text.");
				bufferedWriter.newLine();
				bufferedWriter.write("We are writing");
				bufferedWriter.write(" the text to the file.");
			} // synchronized
			
			// ALways close the file
			bufferedWriter.close();
		} // try
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
