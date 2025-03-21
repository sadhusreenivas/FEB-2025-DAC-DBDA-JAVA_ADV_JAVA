package multithreading;

public class DisplayDemo {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		Thread t1 = new Thread() {
			public void run() {
				d.printUpper();
			}
		};
        t1.start();
        
        new Thread() {
			public void run() {
				d.printLower();;
			}
		}.start();
		
		Thread t3 = new Thread(()-> d.printNumbers());
        t3.start();
        
        
	}

}
