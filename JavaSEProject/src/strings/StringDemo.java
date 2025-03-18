package strings;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String s1 = new String("Java");
		String s2 = "Java";
		String s3 = "Python";
		String s4 = new String("Python");
		String s5 = "CPP";
		String s6 = "Java";
		
		System.out.println(s1.equals(s6));
		System.out.println(s1==s2);
		System.out.println(s2==s6);
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		System.out.println(s1.compareToIgnoreCase(s6));
		
		

	}

}
