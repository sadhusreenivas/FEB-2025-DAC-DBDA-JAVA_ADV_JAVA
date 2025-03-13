package abstraction;

public class SBI extends ATM {

	public SBI(int cashback) {
		super(cashback);
	}
	@Override
	public void withdraw() {
		System.out.println("Withdraw success and u got cashback: "+getCashback() );
	}
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
	}

	@Override
	public void transfer() {
		// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
		
		ATM a = new SBI(25);
		a.deposit();
		a.disp(); //
		a.withdraw();
		a.transfer();
	}
}
