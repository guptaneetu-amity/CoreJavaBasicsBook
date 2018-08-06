//PROGRAM 5.7.1

package book;

//public class ThreadExample2 implements Runnable {
//
//	public void run()
//	{
//		System.out.println("Run");
//	}
//
//	public static void main(String[] args)
//	{
//		ThreadExample2 t = new ThreadExample2 ();
//		t.start();
//		System.out.println("Main");
//	}
//}

public class ThreadExample2 implements Runnable {

	public void run()
	{
		System.out.println("Run");
	}

	public static void main(String[] args)
	{
		ThreadExample2 tObj = new ThreadExample2 ();
		Thread t = new Thread(tObj);
		t.start();
		System.out.println("Main");
	}
}