package java_oop;



  class student03{
	  String name;
	  int age; 
	  
	  public void print_student03(String name) {
		  System.out.println(name);
	  }
	  
	  
	  public void print_student03(int age) {
		  System.out.println(age);
	  }
	  
	  
	  
	  public void print_student03(String name, int age) {
		  System.out.println(name+"  "+age);
	  }
	  
  }




public class Compiltime_polymorphism {
	public static void main (String[]args) {
		
		
		student03 s03 = new student03();
		
		s03. name= "Ahnaf Ahmed Anzum";
		s03. age =25 ;
		
		s03.print_student03(s03.name);
		s03.print_student03(s03.age);
		s03.print_student03(s03.name,s03.age);
	}

}
