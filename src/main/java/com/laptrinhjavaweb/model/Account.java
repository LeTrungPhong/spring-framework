package com.laptrinhjavaweb.model;

import jakarta.persistence.*;

@Entity
public class Account {
	
	@Id
	private String account_ID;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	public Account() {};
	
	public Account(String account_ID, String username, String password) {
		this.setAccount_ID(account_ID);
		this.setUsername(username);
		this.setPassword(password);
	}
	
	
	public String getAccount_ID() {
		return account_ID;
	}
	 
	public void setAccount_ID(String account_ID) {
		this.account_ID = account_ID;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "account_ID = " + this.account_ID + ", username  = " + this.username + ", passwork = " + this.password;
	}
}
