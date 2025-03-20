import java.io.*;
public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Person p1 = new Person(123456789123L,"ABC",32);
		System.out.println(p1);
		
		// serializartion
		FileOutputStream fos = new FileOutputStream("C://Users//hp//Desktop//files123//person.cdac");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1); // 
		
		// de-serialization
		FileInputStream fis = new FileInputStream("C://Users//hp//Desktop//files123//person.cdac");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p2 = (Person) ois.readObject();
		
		System.out.println(p2);
	}

}
