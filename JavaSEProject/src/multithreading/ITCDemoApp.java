package multithreading;

public class ITCDemoApp {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(25000);
		
		Thread t1 = new Thread( () -> c1.withdraw(30000));
		t1.start();
		

		Thread t2 = new Thread( () -> c1.deposit(15000));
		t2.start();
		
	}

}
