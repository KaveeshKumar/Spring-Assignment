package Question5;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	int customerId;
	String customerName;
	long customerContact;
	
	
	Address customerAddress;
	
	
	
	/*
	 * public Customer(int customerId, String customerName, long customerContact,
	 * Address customerAddress) { super(); this.customerId = customerId;
	 * this.customerName = customerName; this.customerContact = customerContact;
	 * this.customerAddress = customerAddress; }
	 */
	 

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

	public long getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}
	
	//@Resource(name = "Customeradd1")
	
	@Inject
	@Qualifier(value="Customeradd")
	
	
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void details() {
		System.out.println("customer Id: "+getCustomerId()+"\n"+
				"customer Name: "+getCustomerName()+"\n"+
				"customer Contact: "+getCustomerContact()+"\n"+
				"customer Address: "+"street: "+getCustomerAddress().getStreet()+"\n"+
				"city: "+getCustomerAddress().getCity()+"\n"+
				"state: " +getCustomerAddress().getState()+"\n"+
				"zip: "+getCustomerAddress().getZip()+"\n"+
				"country: "+getCustomerAddress().getCountry());
		
		//(result.toString());
	}
	
	
}
