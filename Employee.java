class Employee{
	int eid;
	String ename;
	double basicPay;
	static String worksFor="Google";

	//constructor => eliminating setter
    Employee(int id, String name, double basic){ // parameterized cons
    	eid =id;
    	ename = name;
    	basicPay = basic;
    }

    Employee(){ // default cons
     System.out.println("Constructor invoked");
    }

	/* getter or accessor
    void getEmployee(){
    	System.out.println(eid+" "+ename+" "+basicPay+" "+worksFor);
    } */

    public String toString(){
    	return "EMP: "+eid+" "+ename+" "+basicPay+" "+worksFor;
    }


    // business method
    void calSalary(){
    	// da = 53%, hra = 30% ta = 10%
    	double salary = basicPay + basicPay*0.93;
    	System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
    	Employee e1 = new Employee(12345,"ABC",100000); // creating object
    	//e1.getEmployee();
    	System.out.println(e1);
    	e1.calSalary(); // 

    	Employee e2 = new Employee(); //
    	//e2.getEmployee(); // 0 null 0.0 Google
    	System.out.println(e2);

    	System.out.println(e1.hashCode()); // 
    	System.out.println(e1); //e1.toString()
    	//System.out.println(e1.toString());
    }
}