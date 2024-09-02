package java_oop;


  class Student02{
	  
	  String name;
	  int id ;
	  
	  
	  public void printstudent02(){
		  System.out.println(this.name);
		  System.out.println(this.id);
		  
	  }
	  
	  
	  Student02(String n, int i){
		  this.name= n;
		  this.id=i ;
		  
	  }
	  
  }




public class Peramitter_Constructor {
  public static void main (String[]args) {
	  Student02 s02 = new Student02("Ahnaf", 177);
	   s02.printstudent02();
	  
  }
}
