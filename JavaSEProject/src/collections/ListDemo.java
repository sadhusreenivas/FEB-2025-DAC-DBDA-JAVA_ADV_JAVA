package collections;

import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		String[] courses = {"DAC", "DBDA", "DASSD", "DESD"};
		for(String c:courses)
			System.out.println(c);
		Arrays.sort(courses);
		
		List<String> clist = Arrays.asList(courses);
		System.out.println(clist);
		
		al.add(10);
		al.add(50);
		al.add(5);
		al.add(10); // duplicates
		al.add(20);
		//al.add("Java");
		
		System.out.println(al.size());
		System.out.println(al);
		al.add(2, 15);
		System.out.println(al);
		System.out.println(al.remove(5));
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		Collections.sort(al); // ?
		System.out.println(al);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Iterator itr1 = clist.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
