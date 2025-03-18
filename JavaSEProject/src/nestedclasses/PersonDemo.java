package nestedclasses;

public class PersonDemo {

	public static void main(String[] args) {
		
		// AIC
		
		Person p = new Person() {
			
			@Override
			public void study() {
				System.out.println("Learning Java deeply!"); 
			}
		};
		
		p.eat();
		p.study();

	}

}
