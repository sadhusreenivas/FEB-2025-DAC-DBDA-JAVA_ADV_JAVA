package inheritance;

public class TechEmp extends Employee {
	private int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	// re-define or overridding
	@Override
	public void calSalary() {
		double da = 0.53;
		double hra = 0.3;
		double ta = 0.1;
		double salary = bonus + basicPay + (basicPay * (da + hra + ta));
		System.out.println("Salary of Emp: " + salary);
	}

	@Override
	public void dispEmployee() {
		super.dispEmployee(); //
		System.out.println("Bonus: "+bonus);
	}

}
