package encapsulation;

public class Account {
	private int accNo;
	private String accType;
	private double balance;

	public Account(int accNo, String accType, double balance) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", balance=" + balance + "]";
	}

}
