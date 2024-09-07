package java_oop;



 abstract class animal{
	
	abstract void walk() ;
		public void eat() {
			System.out.println("animal can eat");
		}
	}
	
	
 class horse extends animal{
		
		public void walk() {
			System.out.println("hourse can walk with 4 legs");
		}
		}
	
	
	
	
 class chicken extends animal{
		
		public void walk() {
			System.out.println("hourse can walk with 2 legs");
		}
		}
	
	








public class abstraction {
    public static void main (String[]args) {
    	
    	horse h1 = new  horse();
    	h1.walk();
    	h1.eat();
    	
    	//animal a1= new animal();  //compile time error
    	//a1.walk();
    	
    	
    	
    }
}
