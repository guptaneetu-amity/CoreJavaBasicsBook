//PROGRAM 5.8.1

package book;

public class ThreadExample3 {
	public void run()
    {
        System.out.println("In MyThread");
    }
	
	public static void main(String[] args) {
		ThreadExample1 t = new ThreadExample1 ();
        t.run ();
        System.out.println("In Main");
    }
}
