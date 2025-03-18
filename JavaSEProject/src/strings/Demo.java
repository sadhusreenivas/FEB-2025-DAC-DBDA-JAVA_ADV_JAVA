package strings;

public class Demo {

	public static void main(String[] args) {
		
		String s1 = new String("Java");
		
		String s2 = "Python";
		
		System.out.println(s1.concat(s2)); // ?
		
		System.out.println(s1); // ?
		
		
		StringBuilder sb = new StringBuilder("Sachin");
		sb.append(" Tendulkar");
		
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Droupadi");
		sb1.append(" Murmu");
		
		System.out.println(sb1);

	}

}
