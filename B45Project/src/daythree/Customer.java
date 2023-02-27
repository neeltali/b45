package daythree;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;


//Default constructor
 public Customer() {
	 System.out.println("Default Constructor");
 }
 
 //Parameterised constructor
 public Customer (String customerName, int customerId, String customerCity) {
	 this();
	 System.out.println("parameterized Constructor");
	 this.customerName = customerName;
	 this.customerId= customerId;
	 this.customerCity = customerCity;
	 
	 
 }

public String getCustomerCity() {
	return customerCity;
}

public void setCustomerCity(String customerCity) {
	this.customerCity = customerCity;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity=" + customerCity
			+ ", getCustomerCity()=" + getCustomerCity() + ", getCustomerId()=" + getCustomerId()
			+ ", getCustomerName()=" + getCustomerName() + "]";
}
}
 
 
 