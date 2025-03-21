package multithreading;

public class TableDemoApp {

	public static void main(String[] args) {
		
		Table t = new Table();
//		MyThread1 t1 = new MyThread1(t);
//		t1.start();
//		
//		MyThread2 t2 = new MyThread2(t);
//		t2.start();
		
		Thread t1 = new Thread() {
			public void run() {
				t.printTable(17);
			}	
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				t.printTable(18);
			}	
		};
		t2.start();
		
		new Thread() {
			public void run() {
				t.printTable(19);
			}	
		}.start();
		
		new Thread() {
			public void run() {
				t.printTable(16);
			}	
		}.start();
		
		
	}

}
