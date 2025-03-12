class Book{
	String title;
	String author;
	int pages;
	double price;
	static String publisher;
    int isbn;
 
    static {
      // initialize static variables
    	publisher = "TMH";
    	System.out.println("Static block will get allocated during class loading time");
    	System.out.println("It executes before main()");
    }

    Book(){
    	System.out.println("Its a default cons");
    }
    Book(String title, String author, int pages, double price){
    this();
    this.title = title;
    this.author = author;
    this.pages=pages;
    this.price=price;
    }

    Book(String title, String author, int pages, double price, int isbn){
    	this(title,author,pages,price); // 
    	this.isbn = isbn;
    }
    
    public String toString(){
    	return "Book Details: "+title+" "+author+" "+pages+" "+price+" "+publisher+" "+isbn;
    }

    static void change(){
    	publisher = "Penguin";
    }
}