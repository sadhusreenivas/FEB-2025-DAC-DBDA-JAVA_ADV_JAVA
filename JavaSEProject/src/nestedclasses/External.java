package nestedclasses;

public class External {
	private int data = 199139;
	
	public void display() {
		class Local{
			void msg() {
				System.out.println(data);
			}
		} // local end
		Local l = new Local();
		l.msg();
		
	}
	
	public static void main(String[] args) {
		External ext = new External();
		ext.display();
		
	}

}
