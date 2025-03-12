package encapsulation;

public class Customer { // fully encapsulated class
	private int custId;
	String cname;
	//private double balance;
	private static String bank = "SBI";
	private Account account; //
	
	public Customer(int custId, String cname, Account account) {
		this.custId = custId;
		this.cname = cname;
		this.account = account;
	}
	
	public void dispCustomer() {
		System.out.println(custId+" "+cname+" "+bank);
		System.out.println(account); // account.toString()
	}
	
	

	
}
