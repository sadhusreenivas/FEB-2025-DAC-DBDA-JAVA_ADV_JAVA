package collections;

public class Student {
	
	private int sid;
	private String name;
	private String course;
	private double gpa;
	
	public Student(int sid, String name, String course, double gpa) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + ", gpa=" + gpa + "]";
	}

	public int getSid() {
		return sid;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public double getGpa() {
		return gpa;
	}

}
