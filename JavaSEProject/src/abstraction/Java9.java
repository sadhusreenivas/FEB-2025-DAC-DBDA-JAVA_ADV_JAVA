package abstraction;

public interface Java9 {

	String name = "Java";
	void sayHello();
	
	default void fun() {
		System.out.println("Java is fun to learn!");
		wave();
	}
	
	static void test() {
		System.out.println("Testing static method");
		change();
	}
	
	private void wave() {
		System.out.println("Testing private methos");
	}
	
	static private void change() {
		System.out.println("This is static private!");
	}
	
	
}
