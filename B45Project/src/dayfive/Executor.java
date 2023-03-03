package dayfive;

public class Executor {

	public static void main(String[] args) {
		//accessing same package class
		Base b1 =new Base();     //object
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		
	b1.varDefault=11;
	b1.methodDefault();
	// private member accessing
	  /*b1.varPrivate=21;
	b1.mehtodPrivate(); */
	
	b1.varProtected=31;
	b1.methodProtected();
	
    b1.varPublic=41;
    b1.methodPublic();
    
    
   // instance operator
    System.out.println(b1 instanceof Base);   //true 
    
	
	
	
	


	}

}
