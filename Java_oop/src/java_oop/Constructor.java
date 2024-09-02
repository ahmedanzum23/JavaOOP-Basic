package java_oop;



   class Student {
	  String name ;
	  int rollnumber ;
	  
	  
	  
	  
	  
	  public void printstudent() {
			 System.out.println(this.name);
			 System.out.println(this.rollnumber);
		 }
	  
	  //constructor
	  Student(String name, int rollnumber){   //paramittter constructor
		  this.name = name ;
		  this.rollnumber= rollnumber ;
		  
		  
		 System.out.println("this is constructor");//normal constructor
		 
		 
		 
		 
		 
	  }
	  
	  
	  
  }




public class Constructor {
           public static void main (String[]args){
        	  
        	   Student s1 = new Student("anzum", 153) ;
        	   s1.printstudent();
        	   
        	   
           }
}
