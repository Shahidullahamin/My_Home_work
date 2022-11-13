package myworkingpakege;

public class main extends Thread{

	public static void main(String[] args) {
		main thread = new main();
		thread.start();
	System.out.println("this code is outside the thread");
     
	}
 public void run() {
		System.out.println("this code is runing in a thread");
		
	 }

}
