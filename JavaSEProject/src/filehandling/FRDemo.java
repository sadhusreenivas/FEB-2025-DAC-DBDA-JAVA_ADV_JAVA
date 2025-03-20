package filehandling;

import java.io.*;

public class FRDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C://Users//hp//Desktop//files123//abc.txt");
		
		int x, cc=0, wc=0, lc=0;
		while( (x = fr.read())!= -1) {
		System.out.print((char)x);
		
		cc++;
		
		if(x == ' ')
			wc++;
		
		if(x =='\n')
			lc++;
		
		}
		fr.close();
		
		FileWriter fw = new FileWriter("C://Users//hp//Desktop//files123//result.txt", true);
		fw.write("\nNo of chars: "+cc);
		fw.write("\nNo of words: "+(wc+lc-1));
		fw.write("\nNo of lines: "+(lc+1));
		fw.close();
		System.out.println("\nResult file updated!");
	}

}
