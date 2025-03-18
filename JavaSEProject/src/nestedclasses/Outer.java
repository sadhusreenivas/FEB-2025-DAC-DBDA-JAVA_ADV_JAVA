package nestedclasses;

public class Outer {
	private String message = "Java";
	
	// Inner class
	class Inner{
		void sayHi() {
			System.out.println("Hello...."+message);
		}
	} // inner end
	
	public void disp() {
		Inner in = new Inner();
		in.sayHi();
	}
	
	public static void main(String[] args) {
		
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		
		in.sayHi();
		out.disp();
	}

}
