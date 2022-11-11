package myworkingpakege;

import java.util.ArrayList;
import java.util.Iterator;

public class ginrici_iterator {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();
		
	    list.add("book");
	    list.add("pen");
	    list.add("ali");
	    list.add("page");
		
		
		
		Iterator<String> myiter= list.iterator()	;
	  while(myiter.hasNext()) {
		  String s = myiter.next();
		  System.out.println(s);
		  
	  }
	
	  
	}

}
