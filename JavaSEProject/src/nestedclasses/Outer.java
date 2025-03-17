package nestedclasses;

public class Outer {
	private String message = "Java";
	
	// Inner class
	class Inner{
		void sayHi() {
			System.out.println("Hello...."+message);
		}
	}
	
	public static void main(String[] args) {
		
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		
		in.sayHi();
	}

}
