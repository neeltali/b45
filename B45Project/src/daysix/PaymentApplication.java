package daysix;
 
interface WorldBank{
	float rateofInterest();
	
}

interface RBI {
	float RBI_rateofInterest();
}




public class PaymentApplication implements WorldBank,RBI  {
	public float rateofInterest()
	{
		return 9.0f;
	}
	
	public float RBI_rateofInterest()
	{
		return 9.1f;
	}
	
	

	public static void main(String[] args) {
		WorldBank obj = new PaymentApplication();
		RBI obj2 = new PaymentApplication();
		
		System.out.println(obj.rateofInterest());       
		System.out.println(obj2.RBI_rateofInterest());
		
		
	}

}
