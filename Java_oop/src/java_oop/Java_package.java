//encapsulation


package java_oop;



   class bank{
	   
	 public String bank_name ;
	 protected  int bank_cash ; //only  inside the package can access this class.
	 private String email ;
	 
	 
	 
	 public String getemail() {   //getter
		 return this.email;	 
	   
   }
   
   
   public void setemail(String pass) {  //setter
	   this.email = pass ; 
	   
   }

   }



public class Java_package {
   public static void main (String[]args) {
	   
	   bank b1= new bank();
	   b1.bank_name = "Ahnaf Ahmed Anzum Bank"  ;
	   b1.bank_cash = 50 ;    //only inside the package can access the class.
	   b1.setemail("anzum@2103gmail.com");
	   System.out.println(b1.getemail());
   }
}
