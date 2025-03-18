package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		String name = br.readLine();
		System.out.println("Enter Age");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println(name+" "+age);
	}
}
