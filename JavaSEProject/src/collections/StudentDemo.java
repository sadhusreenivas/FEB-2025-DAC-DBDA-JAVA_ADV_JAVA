package collections;
import java.util.*;

public class StudentDemo {
	public static void main(String[] args) {
		
		Student s1 = new Student(123,"Hari","DAC",9.1);
		Student s2 = new Student(132,"Vikalp","DAC",7.2);
		Student s3 = new Student(321,"Faiz","DAC",8.1);
		Student s4 = new Student(122,"Mangesh","DBDA",8.8);
		Student s5 = new Student(112,"Muskan","DBDA",7.9);
		Student s6 = new Student(323,"Naga","DBDA",8.5);
		
		List<Student> studList = new ArrayList<Student>();
		studList.add(s1);
		studList.add(s2);
		studList.add(s3);
		studList.add(s4);
		studList.add(s5);
		studList.add(s6);
		studList.add(new Student(432,"Ravi","DESD",7.9));
		studList.add(new Student(422,"Harsha","DESD",8.9));
		studList.add(new Student(433,"Sreeni","DESD",9.3));
		
		System.out.println(studList);
		
		Iterator<Student> itr = studList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*******************");
		studList.stream().forEach(System.out::println);
		System.out.println("*******************");
		studList.stream().forEach(x -> System.out.println(x));
		
		// Average GPA of DAC
		double sum = 0;
		int count = 0;
		
		for(Student student : studList) {
			if(student.getCourse().equalsIgnoreCase("DAC")) {
				sum = sum + student.getGpa();
				count ++;
			}
		}
		double avg = sum / count;
		System.out.println("Average GPA of DAC students: "+avg); //
		
		Collections.sort(studList, (st1,st2) -> st1.getName().compareTo(st2.getName()));
		studList.stream().forEach(x -> System.out.println(x));
		System.out.println("****************************8");
		Collections.sort(studList, (st1,st2) -> st2.getGpa()>st1.getGpa() ? 1: -1);
		studList.stream().forEach(x -> System.out.println(x));
		
	}

}
