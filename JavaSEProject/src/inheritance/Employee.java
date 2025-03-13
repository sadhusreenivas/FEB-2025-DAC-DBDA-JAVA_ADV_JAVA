package inheritance;
public class Employee {
	  private int eid;
	  private String ename;
	  protected double basicPay;
	  static private String org = "C-DAC";
	  
	  public Employee(int eid, String ename, double basicPay) {
		this.eid = eid;
		this.ename = ename;
		this.basicPay = basicPay;
	}

	public void dispEmployee() {
		  System.out.println(eid+" "+ename+" "+basicPay+" "+org);
	  }
	  
	  public void calSalary() {
		 double da = 0.53;
		 double hra = 0.3;
		 double ta = 0.1;
		 double salary = basicPay+ (basicPay*(da+hra+ta));
		 System.out.println("Salary of Emp: "+salary);
	  }
}
