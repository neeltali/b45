package daysix;

public class Employee extends Person {
	private int empID;
    private float salary;
    private String dept;
    
    
    
    public Employee() {
    	System.out.println("Employee Class Default Constructor");
    }
    
    public Employee(String name, String city, int emId, float salary, String dept) {
    	this.empID=empID;
    	this.salary=salary;
    	this.dept=dept;
    }

	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return empID;
	}

	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}

	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

public String toString () {
	return "Employee [ empId=" + empID + " , salary=" + salary + " , dept="+ dept + " , getName()=" + getName()+ 
			" , getCity()=" + getCity()+ "]";
	

}

    

}
