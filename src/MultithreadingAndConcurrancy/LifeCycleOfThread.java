package MultithreadingAndConcurrancy;

public class LifeCycleOfThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is running");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		LifeCycleOfThread t1 = new LifeCycleOfThread();
		System.out.println(t1.getState()+" "+Thread.currentThread().getState());
		
		t1.start();
		System.out.println(t1.getState()+" "+Thread.currentThread().getState());
		
		Thread.sleep(100);
		System.out.println(t1.getState()+" "+Thread.currentThread().getState());
		
		// Join Methed will wait to finish t1
		t1.join();
		System.out.println(t1.getState()+" "+Thread.currentThread().getState());
		System.out.println("Hello I am printed after 4 sec due to T1");

	}

}
