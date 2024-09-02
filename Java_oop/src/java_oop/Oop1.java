package java_oop;


class pen{
	String name ;
	int price ; 
	
	
	
	public void printpen() {
		System.out.println(this.name);
		System.out.println(this.price);
		
	}
	
	
}




public class Oop1 {
   public static void main (String[]args) {
	  pen p1 = new pen();
	  p1. name = "Orange-pen" ;
	  p1.price = 120;
	  
	  p1.printpen();
	  
	  
   }
}
