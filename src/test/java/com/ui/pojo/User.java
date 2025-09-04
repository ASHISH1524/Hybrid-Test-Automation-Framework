package com.ui.pojo;

public class User {

	private String emailAddress;
	private String pasword;
	
	
	
	public User(String emailAddress, String pasword) {
		super();
		this.emailAddress = emailAddress;
		this.pasword = pasword;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	@Override
	public String toString() {
		return "User [emailAddress=" + emailAddress + ", pasword=" + pasword + "]";
	}
	
}
