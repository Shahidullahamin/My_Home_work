package javaworking1;
 
  
import java.io.FileInputStream;
  import java.io.FileOutputStream;
  import java.io.IOException;
  import java.io.PrintWriter;
  import java.io.Writer;

public class fileoutputclass {

	

			public static void main(String[] args) {
			try {
		       FileOutputStream put= new FileOutputStream("e:\\ myfile.text");
				PrintWriter  pw = new PrintWriter(put);
			  pw.write("wellceme to onput stream");
			 pw.close();
			}catch(IOException e) {
				
			}
			System.out.println("file successfully created");

	}

}
