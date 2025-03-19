package exceptions;
import java.util.*;
public class ExceptDemo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		System.out.println("Enter two nos");
		try {
		a = scanner.nextInt();
	    b = scanner.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+sum);
        int res = a/b; // a%b  throw new ArithmeticException();
        System.out.println("Result = "+res);
		}
		catch(NullPointerException e) {
			System.err.println(e);
		}
        catch(NumberFormatException e) {
        System.err.println(e);
        }
		
		finally {
			if(scanner != null)
				scanner.close();
			System.out.println("Resources closed!");
			System.out.println("Finally always get executed");
		}
        int prod = a*b;
        System.out.println("Product = "+prod);
        
        System.out.println("Rest of the code follows.....");
	}

}
