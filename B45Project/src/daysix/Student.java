package daysix;

public class Student extends Person {
	private String clas;
	private float per;
	public Student () {
		System.out.println("Student class default constructor");
		clas="FY";
		per=70;
		
	}
	public Student (String clas, float per ){
		this.clas=clas;
		this.per=per;
		
	}
	/**
	 * @return the clas
	 */
	public String getClas() {
		return clas;
	}
	/**
	 * @param clas the clas to set
	 */
	public void setClas(String clas) {
		this.clas = clas;
	}
	/**
	 * @return the per
	 */
	public float getPer() {
		return per;
	}
	/**
	 * @param per the per to set
	 */
	public void setPer(float per) {
		this.per = per;
	}
	
	public Student( String name, String city, String clas, float per) {
		/*super.name=name;
		super.city=city;*/     // private member cant inherite in child class
		
		super (name,city);
		this.clas=clas;
		
		this.per=per;
		
		
	}
	@Override
	public String toString() {
		return "Student [clas=" + clas + ", per=" + per + " , getName()=" + getName() + " , getCity()=" + getCity()+ "]";
	}
	

	
}
