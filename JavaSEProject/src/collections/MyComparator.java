package collections;

import java.util.Comparator;

public class MyComparator  implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		//return (int) (s2.getGpa() - s1.getGpa());
		return s2.getGpa() > s1.getGpa() ? 1: -1;
		
	}

}
