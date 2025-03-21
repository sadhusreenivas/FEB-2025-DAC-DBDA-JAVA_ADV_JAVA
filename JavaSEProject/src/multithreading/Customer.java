package multithreading;

public class Customer {
	double balance;
    
	public double getBalance() {
		return balance;
	}

	public Customer(double balance) {
		this.balance = balance;
	}

	public synchronized void withdraw(double amount) {
       System.out.println("Going to withdraw");
       System.out.println("Balance: "+getBalance());
       if(amount > balance){
    	   System.out.println("Less Balance:  waiting for deposit");
    	   try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       }
       balance -= amount;
       System.out.println("Withdrawn amount: "+amount);
       System.out.println("Balance: "+getBalance());
	}
	
	public synchronized void deposit(double amount) {
		System.out.println("Going to deposit.....");
		balance += amount;
		System.out.println("Balance: "+getBalance());
		System.out.println("Deposoted!");
        notify();		
	}

}
