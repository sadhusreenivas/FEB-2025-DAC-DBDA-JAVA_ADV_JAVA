package collections;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> hs = new TreeSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10); // duplicates
		hs.add(5);
		hs.add(25);
		// hs.add(null);
		
		System.out.println(hs);

		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		TreeSet<String> ts = new TreeSet();
		ts.add("MH");
		ts.add("UP");
		ts.add("AP");
		ts.add("GJ");
		ts.add("MP");
		ts.add("CG");
		ts.add("TG");
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.tailSet("MH"));
		System.out.println(ts.headSet("MH"));
	}

}
