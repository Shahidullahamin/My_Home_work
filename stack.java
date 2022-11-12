package myworkingpakege;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<String> list=new Stack<String>();
	
	   list.push("shaihd");
	   list.push("amini");
	   list.push("khan");
	
	System.out.println(list);
	
	list.pop();
	System.out.println(list);
	list.peek();
	

}
}