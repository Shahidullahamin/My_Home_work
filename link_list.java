package myworkingpakege;

import java.util.LinkedList;
import java.util.Stack;

public class link_list {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		
		list.add("shahid");
		list.add("book");
		list.add(null);
	   
	    list.addFirst("shahid");
	   list.addLast("computer");
		  
	  System.out.println(list);
}
}