//PROGRAM 5.6.1

package book;

public class ThreadExample1 extends Thread{
	public void run()
    {
        System.out.println("In MyThread");
    }
	public static void main(String[] args) {
		ThreadExample1 t = new ThreadExample1 ();
        t.start();
        System.out.println("In Main");
    }
}
