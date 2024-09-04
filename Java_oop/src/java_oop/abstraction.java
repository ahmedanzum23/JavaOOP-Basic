package java_oop;



 abstract class animal{
	
	abstract void walk() ;
		
	}
	
	
	public class horse extends animal{
		
		public void walk() {
			System.out.println("hourse can walk with 4 legs");
		}
		}
	
	
	
	
public class chicken extends animal{
		
		public void walk() {
			System.out.println("hourse can walk with 2 legs");
		}
		}
	
	
}







public class abstraction {
    public static void main (String[]args) {
    	
    	horse h1 = new  horse();
    	h1.walk();
    	
    	
    	animal a1= new animal();  //compile time error
    	a1.walk();
    	
    	
    	
    }
}
