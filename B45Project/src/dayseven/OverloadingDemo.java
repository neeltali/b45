package dayseven;

public class OverloadingDemo {
	public void m1(int a, String b) {
		System.out.println("Firstprogramm");
		
	}
	public void m1 (String r, int s) {
		System.out.println("Secondprogramm");
	}

	public static void main(String[] args) {
		OverloadingDemo h= new OverloadingDemo();
		h.m1(12,"swapnil");
		h.m1("harshal", 34);
		
		

	}

}
