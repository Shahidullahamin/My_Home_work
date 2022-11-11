package myworkingpakege;

import java.util.Enumeration;
import java.util.Vector;

public class enumeration {

	public static void main(String[] args) {
	Vector<String> vehicle = new Vector<String>();
	 vehicle.add("shahid");
	 vehicle.add("amini");
	 vehicle.add(null);
	 
	Enumeration<String> obj =  vehicle.elements();
	 System.out.println("normal enumeration");
	 while( obj.hasMoreElements() ){
		 String s = (String)((Enumeration<String>) obj).nextElement();
		 System.out.println(s);
	 }
	
	System.out.println("genric enumeration");
	Enumeration<String>obj2=vehicle.elements();
	while(obj2.hasMoreElements()) {
		String s = obj2.nextElement();
	}
	
	}

}
