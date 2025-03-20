package filehandling;
import java.io.*;
public class FWDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C://Users//hp//Desktop//files123//abc.txt");
		
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("\nJava is robust\nJava is OOP language\nJava Dynamic");
		fw.write("\nJava is secure\nJava is Simple\nJava Distributed");
		
		fw.close();
		
		System.out.println("File written successfully!");
		
	}

}
