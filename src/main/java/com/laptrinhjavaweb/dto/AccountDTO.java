package com.laptrinhjavaweb.dto;

public class AccountDTO {
	
	private String account_ID;
	private String username;
	private String password;
	
	public AccountDTO() {};
	
	public AccountDTO(String account_ID, String username, String password) {
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
