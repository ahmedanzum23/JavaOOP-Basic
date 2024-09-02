package java_oop;


class shape {
	
	public void are() {
		System.out.println("please display area");
	}
}


class traingle extends shape{          //single level inheritance
	  public void area(int l, int h) {
		  System.out.println(1/2*h*l);
		  
	  }
}
        

//multilevel inheritance

  //class Equilateraltraingle  extends traingle{
	  //public void area(int l, int h) {
		  //System.out.println(1/2*h*l);
		  
	  //}
	   
 // }




                           //Hierarchial inheritance 

class circle extends shape{          
	  public void area(int r) {
		  System.out.println(3.1416*r*r);
		  
	  }
}
  





public class Inheritance {
  public static void main (String[]args) {
	  
	  
	  
  }
}
