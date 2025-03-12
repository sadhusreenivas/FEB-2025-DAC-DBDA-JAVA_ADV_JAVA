package encapsulation;

public class Driver {
	public static void main(String[] args) {
		
		Account account = new Account(123321456, "Savings", 100000);
		Customer c1 = new Customer(123321, "ABC", account);
		
		c1.dispCustomer();
		
	}

}
