package abstraction;

public class Student extends Person{
	@Override
	void eat() {
		System.out.println("Canteen Food!");
	}

	@Override
	void talk() {
		System.out.println("Java Tech");
	}

	@Override
	public void study() {
		super.study();
		System.out.println("Studies hardly");
	}
	
	public void sleep() {
		System.out.println("Often sleeps in classs!!");
	}
}
