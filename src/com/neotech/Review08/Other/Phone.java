package com.neotech.Review08.Other;

public class Phone {

	private String serialNr;
	private String brand;
	private String password;

	public Phone(String serialNr, String brand, String password) {
		this.serialNr = serialNr;
		this.brand = brand;
		this.password = password;
	}

	public String getSerialNr(String password) {   // if password provided then we will provide serialNr

		String result = "";
		if (password.equals(this.password)) {
			result = serialNr;
		} else {
			result = "Invalid access";
		}

		return result;
	}

	public void setSerialNr(String serialNr) {
		
		if(serialNr.length() == 5)
		
		this.serialNr = serialNr;
	}

}
