class BMS{ // driver class
	
	public static void main(String[] args) {
   
       Book b1 = new Book("Java Complete Reference","Herbert Schildt", 600, 500);
       System.out.println(b1);
          
       Book.change(); // static

       Book b2 = new Book("C in Depth","Srivastava",350,300,1234567);
       System.out.println(b2);
	}
}