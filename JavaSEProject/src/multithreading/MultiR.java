package multithreading;

public class MultiR implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
	
		MultiR r1 = new MultiR(); //
		Thread t1 = new Thread(r1); // thread
		
		t1.start();
		
		MultiR r2 = new MultiR(); //
		Thread t2 = new Thread(r2); // thread
		
		t2.start();
	}

}
