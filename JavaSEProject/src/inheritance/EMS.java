package inheritance;

public class EMS extends Object{

	public static void main(String[] args) {
		
		Employee e1 = new Employee(123321,"ABC",100000);
		e1.dispEmployee();
		e1.calSalary();
		
		TechEmp te1 = new TechEmp(234321,"XYZ", 100000, 10000);
		te1.dispEmployee();
		te1.calSalary();
		
		e1 = te1; // upcasting
		e1.calSalary(); // overridden method
		e1.dispEmployee();// overridden metho
	}

}
