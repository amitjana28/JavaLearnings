package MultithreadingAndConcurrancy;

// One way to create thread
class PlayYoutube extends Thread{

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("playing youtube");
		}
	}
	
}

// Other way to create thread
class PlayMusic implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("playing music");
		}
	}
	
}

// Main class
public class MultithreadingInJava {

	public static void main(String[] args) {
		// Lifecycle of thread : New, Runnable, Running, Blocked/Waited, Terminated
		PlayMusic pm = new PlayMusic();
		Thread musicThread = new Thread(pm);
		
		PlayYoutube yb = new PlayYoutube();
		
		musicThread.start();
		yb.start();
		
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
