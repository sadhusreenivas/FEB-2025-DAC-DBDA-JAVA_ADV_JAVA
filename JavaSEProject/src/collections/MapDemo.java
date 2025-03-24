package collections;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String ,Integer> countryMap = new HashMap();
		countryMap.put("India", 91);
		countryMap.put("USA", 1);
		countryMap.put("UK",44);
		countryMap.put("Canada", 1);
		countryMap.put("Australia", 61);
		countryMap.put("India", 91); // duplicates
		
		System.out.println(countryMap); 
		
		Collection c1 = countryMap.keySet();
		System.out.println(c1);
		
		Collection c2 = countryMap.values();
		System.out.println(c2);
		
		Set s = countryMap.entrySet(); // set 
		
		Iterator<Map.Entry<String, Integer>> itr  = s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry m = itr.next();
			System.out.println(m.getKey()+ "   "+m.getValue());
		}
		

	}

}
