package myworkingpakege;

public class homework extends Thread{
    public void run() {
    	System.out.println("thread is runing");
    }
	public static void main(String[] args) {
		
   homework w = new homework(); 
	
	
	w.start();
	}

}
