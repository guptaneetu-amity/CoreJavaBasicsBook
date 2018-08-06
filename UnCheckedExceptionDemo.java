package book;

// PROGRAM 4.7.2

public class UnCheckedExceptionDemo {
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println ("First Number is::" + a);
		System.out.println ("Second Number is::" + b);
		System.out.println ("Value of " + a + " power " + 
				b + "::" + Math.pow(a,b));		
	}
}
