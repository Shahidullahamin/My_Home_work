package javaworking1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filereading {

	public static void main(String args []) {
		Scanner sca=null;
 try {
	sca= new Scanner(new File("E: \\shahid.txt"));
	 while(sca.hasNext()){
			 System.out.println(sca.nextLine()) ;
		 
	 }
 }
        catch(FileNotFoundException e){
	   System.out.println("sdfjkds f");
	   
        }
        
   finally{
	   sca.close();
   }
	
	}


}