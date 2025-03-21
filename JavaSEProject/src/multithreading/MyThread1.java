package multithreading;

public class MyThread1 extends Thread{

	Table table;

	public MyThread1(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(16);
	}
	
}
