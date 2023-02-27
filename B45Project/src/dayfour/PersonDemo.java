package dayfour;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		//scanner class/object to access user input
		Scanner ob = new Scanner(System.in);
		String name;
		System.out.println("Enter Person Name");
		name=ob.next();
		System.out.println("Enter age: ");
		int age= ob.nextInt();
		System.out.println("Enter Gender: ");
		String gender = ob.next();
		System.out.println("Enter taxable income");
		int income= ob.nextInt();
		
		// person object & getter-setter 
		Person person =new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
	System.out.println(person);
	
	TaxCalculation calc = new TaxCalculation();
	calc.Calculatetax(person);
	System.out.println("After calculation tax: ");
	System.out.println(person);
	ob.close();
	
		
		
	}
	

}
