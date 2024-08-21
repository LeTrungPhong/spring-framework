package com.laptrinhjavaweb.dto;

public class CustomerDTO {

	private String customer_ID;
	private String fullname;
	private String account_ID;

	public CustomerDTO() {};
	
	public CustomerDTO(String customer_ID, String fullname, String account_ID) {};

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
