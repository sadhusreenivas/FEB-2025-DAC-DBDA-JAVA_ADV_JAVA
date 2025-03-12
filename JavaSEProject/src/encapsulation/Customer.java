package encapsulation;

public class Customer { // fully encapsulated class
	private int custId;
	String cname;
	private double balance;
	private static String bank = "SBI";

	public Customer(int custId, String cname, double balance) {
		this.custId = custId;
		this.cname = cname;
		this.balance = balance;
	}

	public int getCustId() {
		return custId;
	}

	public String getCname() {
		return cname;
	}

	public double getBalance() {
		return balance;
	}

	public static String getBank() {
		return bank;
	}

	public String toString() {
		return "Customer [custId=" + custId + ", cname=" + cname + ", balance=" + balance + "Bank= " + bank + "]";
	}

}
