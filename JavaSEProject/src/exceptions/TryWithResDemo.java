package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResDemo {

	public static void main(String[] args) throws IOException{

     try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
    	 System.out.println("Enter name");
    	 String name = br.readLine();
    	 System.out.println("Enter Age");
    	 int age = Integer.parseInt(br.readLine());
    	 
    	 System.out.println(name +"  "+age);
     }
//     catch(NumberFormatException e) {
//    	 System.out.println(e);
//     }
		
     System.out.println("Rest of the code follows....");
	}

}
