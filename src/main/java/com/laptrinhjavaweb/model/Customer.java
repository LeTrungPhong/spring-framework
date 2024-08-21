package com.laptrinhjavaweb.model;

import jakarta.persistence.*;

@Entity
public class Customer {
	
	@Id
//  @GeneratedValue (strategy=GenerationType.IDENTITY)
//  @GeneratedValue (strategy=GenerationType.AUTO,generator="empid_generator")
//  @SequenceGenerator (name="empid_generator",initialValue=1,allocationSize=1)
	private String customer_ID;
	
	@Column
	private String fullname;
	
	@OneToOne
	private Account account;
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Customer() {};

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

	
}
