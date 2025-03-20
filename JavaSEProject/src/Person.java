import java.io.Serializable;

public class Person implements Serializable{
	private transient long aadhar;
	private String name;
	private int age;
	
	public Person(long aadhar, String name, int age) {
		super();
		this.aadhar = aadhar;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [aadhar=" + aadhar + ", name=" + name + ", age=" + age + "]";
	}
	
}
