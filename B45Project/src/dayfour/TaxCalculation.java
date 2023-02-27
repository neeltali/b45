package dayfour;

public class TaxCalculation {
	//fuction to calcuting tax
	public void Calculatetax(Person person) {
		if (person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("Tax not applicable");
			
		}
		else {
			if (person.getincome()<=160000) {
				person.setTax(0);
			} else if (person.getincome()>160000 && person.getincome()<=500000) {
				person.setTax(person.getincome() - 160000 * 10/100);
			} else if (person.getincome()>= 500000 && person.getincome()<=800000) {
				person.setTax((person.getincome()- 500000) * 20/100 + 34000);
			}else {
				person.setTax((person.getincome()-800000) * 30/100+ 94000);
				
			}
		}
	}

}
