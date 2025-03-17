package abstraction;

public class X implements Showable {

	public void show() {
		System.out.println("Showing Movie!");
	}

	@Override
	public void print() {
		System.out.println("Printing....");
	}
	
	public static void main(String[] args) {
		
		Showable s = new X();
		s.show();
		s.print();
		
		Printable p = new X();
		p.print();
	}
	
	
}
