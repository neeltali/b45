package dayfourleran;



abstract class Mumbai_rules
{
abstract void speedlimist();
abstract void  helmet();
abstract void mirror();
}

		class Seltos extends Mumbai_rules 
{
	void mirror()
	{
		System.out.println("two mirror required");
	}
	
	void  helmet() {
		System.out.println("helmet is compulsory");
	}
	void speedlimist() {
		System.out.println("speed should not be more than 60km");
	}



		public static void main(String[] args) {
			Seltos obj = new Seltos();
			obj.helmet();
			obj.mirror();
			obj.speedlimist();
			
			

		}
}

