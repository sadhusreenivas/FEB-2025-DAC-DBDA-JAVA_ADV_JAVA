package exceptions;
public class TryDemo {
	public static void main(String[] args) {
       System.out.println("Welcome to Exception handling!");
       try {
    	   System.out.println("Im part of outer try");
    	   try {
    		   String s = "JAVA";
    		   System.out.println(s.length()); //
    		   
    		   int[] arr = new int[5];
    		   arr[4] = 50; 
    		   System.out.println(123/0);
    	   }
    	   catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
    		   System.err.println(e);
    	   } 
       }// outer try
       catch(Exception e) {
    	   System.out.println("handled!");
       }
       System.out.println("Resof the code follows......");
	}

}
