package CaseStudy5;

import java.util.Date;

public class Customer {
	private String customerName;
	private String Address;
	private String email;
	private Date dob;

//	Constructors
	Customer() { super(); }
	public Customer(String customerName, String address, String email, Date dob) {
		super();
		this.customerName = customerName;
		this.Address = address;
		this.email = email;
		this.dob = dob;
	}
	
//	Getters
	public String getCustomerName() { return customerName; }
	public String getAddress() { return Address; }
	public String getEmail() { return email; }
	public Date getDob() { return dob; }
	
//	Setters
	public void setCustomerName(String customerName) { this.customerName = customerName; }
	public void setAddress(String address) { this.Address = address; }
	public void setEmail(String email) { this.email = email; }
	public void setDob(Date dob) { this.dob = dob; }
	
//	Methods
	
	
}