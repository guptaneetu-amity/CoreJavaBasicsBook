package book;

class Account
{	
	protected String name;
	protected String accountNo;
	protected long balance;
	protected String type;
 
	 Account(String name, long amount)
	 {
	    this.name = name;
	    this.accountNo = "";
	    this.balance = amount;
	 }
}

class Savings extends Account {

	Savings (String name, long amount)
	{
		this.name = name;
		this.accountNo = "";
		this.balance = amount;
		type = "S";
	}
}

public class AccountDemo {
	public static void main (String args[]) 
	{
		Savings sObject = new Savings("", 10000);		
	}	
}

////PROGRAM 2.14.1
//
//class Account {	
//		protected String name;
//		protected String accountNo;
//		protected long balance;
//		protected String type;	
// 
//	// Constructor
//	 Account(String name, long amount)
//	 {
//	    this.name = name;
//	    this.accountNo = name;
//	    this.balance = amount;
//	 }
//
//	 // Method deposit
//	 void deposit(long amount)
//	 {
//	    this.balance += amount;
//	 }
//	 
//	 // Method balance to check balance amount
//	 long balance()
//	 {
//	    return balance;
//	 }
//}
//
//class Savings extends Account {
//	
//	// Constructor
//	Savings (String name, long amount)
//	{
//		super(name,amount);
//		type = "S";
//	}
//}
//
//class Current extends Account {
//	Current (String name, long amount)
//	{
//		super(name,amount);
//		type = "C";
//	}
//}
//
//public class AccountDemo {
//	public static void main (String args[]) {
//		Savings sObject = new Savings("User1", 10000);		
//		Current scObject = new Current("User2", 0);
//	}	
//}
