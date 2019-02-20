package abstraction;

public abstract class Bank {
	// Abstraction means to hide the implimentation logic - 
	
public abstract void loan();// abstract method means - no method body


	public void credit() {
		System.out.println("Bank credit");
	
}
	public void debit() {
		System.out.println("Bank debit");
	}
}
