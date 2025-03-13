package abstraction;

public abstract class ATM {
	private int cashback;

	public int getCashback() {
		return cashback;
	}
	public ATM(int cashback) {
		this.cashback = cashback;
	}
	public abstract void withdraw();
	public abstract void deposit();
	public abstract void transfer();
	public void disp() {
		System.out.println("I am so and so bank!");
	}

}
