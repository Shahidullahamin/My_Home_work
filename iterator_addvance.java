package myworkingpakege;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class student{
	int id;
	String name;
	String address;
	
	student(int id,String name ,String address){
		this.id= id;
		this.name=name;
		this.address=address;
		
	}
}
public class iterator_addvance {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<student> stulist=new ArrayList<student>();
	 
	  stulist.add(new student(1,"shahid","wardack"));
	  stulist.add(new student(2,"ahmad","wardack"));
	  stulist.add(new student(3,"naqib","wardack"));
	 stulist.add(new student(4,"nazir","wardack "));
	
	Iterator<student> reader= stulist.iterator();
	
	
		
	//int search_id = scan.nextInt();
	
	while(reader.hasNext()) {
		
		student obj=reader.next();
		//if(obj.id==search_id) {
			
		
		
		//System.out.println("id= "+obj.id+"name ="
		//+obj.name+"address="+obj.address);
		//reader.remove();

		
		System.out.println("id= "+obj.id+"name ="
		+obj.name+"address="+obj.address);		
		}
		
	
	
	}
		
	
		
	
	

}
