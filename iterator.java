package myworkingpakege;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	
    list.add("book");
    list.add("pen");
    list.add("ali");
    list.add("page");
	//normal iterator
    Iterator<String> myter= list.iterator();
    while(myter.hasNext()) {
    String s= (String)myter.next();
    System.out.println(s);
    }
	}

}
