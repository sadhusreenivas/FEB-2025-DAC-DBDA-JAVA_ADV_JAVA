package collections;

import java.util.*;

public class IHMDemo {

	public static void main(String[] args) {

        Map hm = new IdentityHashMap();
        
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        
        hm.put(i1, "DAC");
        hm.put(i2, "DBDA");
        
        System.out.println(hm);
		
	}

}
