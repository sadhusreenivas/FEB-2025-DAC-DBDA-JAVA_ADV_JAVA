package inheritance;

public class EMS {

	public static void main(String[] args) {
		
//		Employee e1 = new Employee();
//		e1.setEmployee(123321,"ABC",128400);
//		e1.dispEmployee();
//		e1.calSalary();
		
		TechEmp te1 = new TechEmp();
		te1.setEmployee(234321,"XYZ", 100000);
		te1.setBonus(10000);
		te1.dispEmployee();
		//System.out.println(te1.getBonus());
		te1.calSalary();
		
	}

}
