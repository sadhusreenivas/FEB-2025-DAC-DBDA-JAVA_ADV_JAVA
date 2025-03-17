package packages;
import cdac.dac.*;
import cdac.dbda.DBDA;

import static java.lang.Math.*;
public class Demo {

	public void getClassTotal(DAC d1, DBDA d2) {
		System.out.println(d1.getTotal() + d2.getTotal());
	}
	
	    public static void main(String[] args) {
			
	    	DAC dac = new DAC(39);
	    	DBDA dbda = new DBDA(22);
	    	
	    	Demo demo = new Demo();
	    	demo.getClassTotal(dac, dbda);
	    	
		}
	}

