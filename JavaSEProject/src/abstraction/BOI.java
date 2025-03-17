package abstraction;

public class BOI implements RBI, TTP{
	@Override
	public void withdraw() {
		System.out.println("withdraw sucess and you got cashback: "+CASHBACK);
	}
	@Override
	public void transfer() {
	System.out.println("Transferred....");
	}
	@Override
	public void deposit() {

	System.out.println("Doposied");	
	}
	
	public void disp() {
		System.out.println("Bank of India ATM!");
	}
	@Override
	public void confirmTransaction() {
        System.out.println("Transaction confirmed!");
		
	}

}
