package multithreading;

public class Multi extends Thread{
	
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(750);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
	
		Multi t1 = new Multi(); // t1 created
		t1.start(); // ready
		try {
			t1.join(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Multi t2 = new Multi(); // t1 created
		t2.start(); // ready
		
		Multi t3 = new Multi(); // t1 created
		t3.start(); // ready
	}

}
