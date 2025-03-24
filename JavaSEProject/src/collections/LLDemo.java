package collections;

import java.util.*;

public class LLDemo {

	public static void main(String[] args) {
	
		List<String> ll = new LinkedList();
		
		ll.add("Virat");
		ll.add("Rohit");
		ll.add("Dhoni");
		ll.add("Sachin");
		ll.add("Hardik");
		
		System.out.println(ll);
		String n1 = ll.get(2);
		System.out.println(n1);
		
		ListIterator<String> litr = ll.listIterator();
		
		while(litr.hasNext()) {
			String name = litr.next();
			if(name.equalsIgnoreCase("Sachin"))
				litr.remove();
			if(name.equals("Dhoni"))
				litr.set("KL Rahul");
		}
		
		System.out.println(litr.previous()); // Hardik
		
		System.out.println(ll);
		
	}

}
