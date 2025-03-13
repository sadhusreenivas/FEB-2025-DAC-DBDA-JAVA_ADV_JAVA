package abstraction;

public class AbsDemo {

	public static void main(String[] args) {
		
		Person p = new Student();
		p.eat();
		p.study();
		p.talk();
		
		new Student().sleep(); //
	}

}
