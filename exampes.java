package myworkingpakege;

public class exampes  implements Runnable{

	@Override
	public void run() {
	 System.out.println("thread runnig");
	 
	}
	
	
	
	public static void main(String[] args) {
		
    exampes m1 = new exampes();
    Thread t1 = new Thread(m1);
	t1.start();

		
	}

}
