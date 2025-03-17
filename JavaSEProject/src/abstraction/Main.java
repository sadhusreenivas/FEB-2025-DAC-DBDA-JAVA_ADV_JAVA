package abstraction;

public class Main implements Java9 {

	public static void main(String[] args) {
		
          Main m = new Main();
          m.sayHello();
          m.fun();
          
          Java9.test(); // static
          
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello..."+name);
	}

}
