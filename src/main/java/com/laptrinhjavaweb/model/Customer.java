package com.laptrinhjavaweb.model;

import jakarta.persistence.*;

@Entity
public class Customer {
	
	@Id
	private String customer_ID;
	
	@Column
	private String fullname;
	
	@Column
	private String account_ID;
	
	public Customer() {};
	
	public Customer(String customer_ID, String fullname, String account_ID) {
		this.setCustomer_ID(customer_ID);
		this.setFullname(fullname);
		this.setAccount_ID(account_ID);
	}

	public String getCustomer_ID() {
		return customer_ID;
	} 
	
	public void setCustomer_ID(String customer_ID) {
		this.customer_ID = customer_ID;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getAccount_ID() {
		return account_ID;
	}
	
	public void setAccount_ID(String account_ID) {
		this.account_ID = account_ID;
	}
	
}
