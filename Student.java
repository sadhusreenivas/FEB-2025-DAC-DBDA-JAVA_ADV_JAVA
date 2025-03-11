class Student{
	// data
    int rno; //prim+instance
    String name; // ref+instance
    double gpa; // prim + instance
    static String org ="C-DAC Hyd"; // ref+class
	// methods
	void setData(){
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	System.out.println("Please enter student deatils");
      rno = scanner.nextInt();
      name = scanner.next();
      gpa = scanner.nextDouble();
	}

	void getData(){
       System.out.println(rno+" "+name+" "+gpa+" "+org);
	}

	public static void main(String[] args) {
	
	Student[] students = new Student[5]; // array of 5 students

	for(int i=0; i<students.length; i++){
		students[i] = new Student();
		students[i].setData();
		students[i].getData();
	}
 
	}
}
