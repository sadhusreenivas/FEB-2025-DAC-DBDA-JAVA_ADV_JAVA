package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RWDemo {

	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("C://Users//hp//git//repository//JavaSEProject//src//filehandling//RWDemo.java");
        BufferedWriter  bw = new BufferedWriter(new FileWriter("C://Users//hp//Desktop//files123//xyz.java"));
        BufferedReader br = new BufferedReader(fr);
        
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			bw.write(line);
			line = br.readLine();
		}
		br.close();
		bw.close();
	}

}
