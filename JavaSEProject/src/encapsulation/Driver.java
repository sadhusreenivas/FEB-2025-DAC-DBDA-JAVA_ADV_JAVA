package encapsulation;

public class Driver {
	public static void main(String[] args) {
		Customer c1 = new Customer(123321,"ABC", 100000);
		System.out.println(c1); // c1.toString();
		
		System.out.println(c1.getCustId()+" "+c1.getBalance());
		
		System.out.println(c1.cname);
	}

}
