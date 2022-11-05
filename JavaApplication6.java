
package javaapplication6;

// 1 incapsulation teach

import static com.sun.javafx.fxml.expression.Expression.set;
import static com.sun.javafx.fxml.expression.Expression.set;
import static com.sun.scenario.Settings.set;
import static java.lang.reflect.Array.set;




class banking {
        String name="shahidullah amini";
         int accno=456;  
          void setname(String name){
           this.name=name;
           
         }
       void setaccno(int accno){
           this.accno=accno;
           
       }
       String  getname(){
           return name;
           
       }
       int getaccno(){
           return accno;
}
}
    ///2 mutable and immutable
   class example1{
        private final String s;
        example1(final String s){
           this.s=s;
        }
        
        final String getname(){
            return s;
   
}   
        }
  


















//3 relationship in java  
       ///agrygation part int java
      class address{
            int street_num;
            String city;
            
            address(int street_num,String city){
                this.street_num=street_num;
               
                this.city=city;
            }

       }   
       class student{
           String name;
           int id ;
           address address;
           student(String name, int id , address address){
               this.name=name;
               this.id=id;
               this.address=address;
          
          }
        
         
       }
  ////////compsation part in java
  class job{
           private String role;
           private int salary;
           private int id;
           public String getrole(){
               return role;
               
           }
            public void setrole(String role){
              this.role=role;
          }
              public long gitsalary(){
               return salary;
           } 
              public void setsalary(int salary){
                  this.salary=salary;
              }
           public int gitid(){
               return id;
          }
           public void setid(int id){
               this.id=id;
           }
       }

       class person{

        private job job;
               person(){
                   
                   this.job=new job();
                   job.setsalary(10000);
                   }
               long gitsalary(){
                   return job.gitsalary();
               }
           }
    ////////////////
     class engine{
           private String type;
           private int horsepower;
           engine(String type,int horsefower ){
               this.type=type;
               this.horsepower =horsepower;
               
           }
          public String gettype(){
              return type;
              
          }
          public int gethorsepowers(){
              return horsepower;
              }
          public void settype(String type){
              this.type=type;
              
          }
          public void sethorsepower(int horsepower){
              this.horsepower=horsepower;
          }
       }
     class car{
         private final String name;
         private final engine engine;
         //composetion
         public car(String name ,engine engine){
             this.name=name;
             this.engine=engine;
             }
         public String getname(){
             return name;
            
         }public  engine getengine(){
                 return engine;
         }
         }
   
//////////////////////
     class unboxing{
    
      
         
         Integer a =new Integer(3);
     int i=a.intValue();
      int j=a;
     
     
     
      void show(){
          System.out.println("a is = "+a);
          System.out.println("i is = "+i);
          System.out.println("j is = "+j);
      }
         
    
     
     }
 
 class student1 {
       int sid;
       String sname;
       student1(int sid, String sname){
           this.sid=sid;
           this.sname=sname;
           
       }
     
 }
  class emp{
      int empid;
      String empname;
      emp(int empid,String empname){
          this.empid=empid;
          this.empname=empname;
      }

  }

 public class JavaApplication6 {

    private static address address;
    private static Object set;
   
      
    public static void main(String[] args) {
     
     
        //1 incapsulation work
        banking obj=new banking();
      String name =obj.getname();
      System.out.println(name);
       
      int accno =obj.getaccno();
      System.out.println(accno);
    
      obj.setname("shahid");
      obj.setaccno(1234);
     System.out.println(obj.getname());
     System.out.println(obj.getaccno());


    
// 2 mutable and imutable work
      example1 obj1=new example1("shis is shaidullah work");
     System.out.println(obj1.getname());
 
        
     String s="amini";
     s.concat("shahid");
     System.out.println(s);
       int x=12;
        x=44;
        System.out.println("x is = "+x+" \n\n");
         
   
        ///////////////////////////////////////////////////////////////
       // wrapper classes
       System.out.println(" this is rapper class part '''''''''''''''\n");
       int a=54;
         Integer i=Integer.valueOf(a);
         Integer j=a;
       System.out.println("i is = "+i+" a is =   "+a+" j is =  "+j);
    
      System.out.println(" \n\n");

     ////////////////////////////////////
    
     System.out.println("//////////////////////////");
    
      unboxing box= new unboxing();
       box.show();

  ///////////
    

  
  
  System.out.println("**************************");
    
    System.out.println("this is argigation part \n\n\n");

  person per= new person();
        long salary=per.gitsalary();
   
    
    engine eng = new engine("petrol",300);
    car ca = new car("alto",eng);
    System.out.println("name of ca"+ca.getname()
     +"\n"+"type op engine:"+eng.gettype()
      +"horse power of engine"+eng.gethorsepowers());
    
    /////////////////////////////////// 
  
    


    

/////////////////////////////////////////////////////////////
    //3 relationship inn java
     System.out.println("**************************");
    
    System.out.println("this is argigation part \n\n\n");
    address add=new address(12,"wardck") ;
     student stu = new student("shahid",1,address);
 
       System.out.println("street-num is = :"+add.street_num);
       System.out.println("city is = "+add.city);
    /////
     System.out.println("student name is = "+stu.name);
    System.out.println("student id is = "+stu.id); 
     System.out.println("student address street is = "+stu.address.street_num);
     System.out.println("student address city is = "+stu.address.city); 
    /////
  
  
   
    }//<editor-fold defaultstate="collapsed" desc="comment">
    
//</editor-fold>

   
        }
    

   
    


    

 
   
    

  
    
    
    


