package multithreading;

public class Demo extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isDaemon());
		
		try {
			Thread.sleep(500,700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static void main(String[] args) {
		
    	Demo t1 = new Demo();
    	t1.setName("first");
    	t1.start();
    	
    	Demo t2 = new Demo();
    	t2.setDaemon(true);
    	t2.start();
    	
    	Demo t3 = new Demo();
    	t3.setName("third");
    	t3.setPriority(7);
    	t3.start();
	}
	 
}
