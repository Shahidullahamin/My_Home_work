package javaworking;
class banking {
    String name="shahidullah amini";
     int accno=456;  
      void setname(String name){
       this.name=name;
       
     }
     }
   void setaccno(int accno){
       this.accno=accno;
       
   }
   String  getname(){
       return name;
       
   }
   }
   int getaccno(){
       return accno;
   }
}
public class test {


	public static void main(String[] args) {
	    banking obj=new banking();
	      String name =obj.getname();
	      System.out.println(name);
	       
	      int accno =obj.getaccno();
	      System.out.println(accno);
	    
	      obj.setname("shahid");
	      obj.setaccno(1234);
	     System.out.println(obj.getname());
	     System.out.println(obj.getaccno());

	}

}
