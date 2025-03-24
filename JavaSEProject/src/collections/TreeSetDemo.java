package collections;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(123,"Hari","DAC",9.1);
		Student s2 = new Student(132,"Vikalp","DAC",7.2);
		Student s3 = new Student(321,"Faiz","DAC",8.1);
		Student s4 = new Student(122,"Mangesh","DBDA",8.8);
		Student s5 = new Student(112,"Muskan","DBDA",7.9);
		Student s6 = new Student(323,"Naga","DBDA",8.5);
		Set<Student> studSet = new TreeSet<Student>(new MyComp());
		studSet.add(s1);
		studSet.add(s2);
		studSet.add(s3);
		studSet.add(s4);
		studSet.add(s5);
		studSet.add(s6);
		studSet.add(new Student(432,"Ravi","DESD",7.9));
		studSet.add(new Student(422,"Harsha","DESD",8.9));
		studSet.add(new Student(433,"Sreeni","DESD",9.3));
		
		System.out.println(studSet); // ?
		Iterator<Student> itr = studSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("***************************");
		
		Set<Student> studSet2 = new TreeSet<Student>(new GPAComp());
		studSet2.add(s1);
		studSet2.add(s2);
		studSet2.add(s3);
		studSet2.add(s4);
		studSet2.add(s5);
		studSet2.add(s6);
		studSet2.add(new Student(432,"Ravi","DESD",7.9));
		studSet2.add(new Student(422,"Harsha","DESD",8.9));
		studSet2.add(new Student(433,"Sreeni","DESD",9.3));
		
		System.out.println(studSet2); // ?
		
		Iterator<Student> itr1 = studSet2.iterator();
		while(itr1.hasNext())
			System.out.println(itr1.next());
		
		
	}
}

class MyComp implements Comparator<Student>{
	@Override
public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName()); // ASC
	}
	
}

class GPAComp implements Comparator<Student>{
	@Override
public int compare(Student s1, Student s2) {
		return s2.getGpa() > s1.getGpa() ? 1 : -1;
	}
	
}
