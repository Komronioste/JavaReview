package com.neotech.Review08.Other;

public class PhoneDemo {

	public static void main(String[] args) {


		
		Phone p1 = new Phone ("HQ123", "Apple", "Alb123");
		
		
		String serialNumber = p1.getSerialNr("Alb123");  // since we providing right password as argument, it will print the serial number
		System.out.println(serialNumber);
		
	System.out.println("Let us try to change the serial number-------------------------------");
		
		p1.setSerialNr("Komron12345");
		
		 serialNumber = p1.getSerialNr("Alb123");  
		System.out.println(serialNumber);
			
		p1.setSerialNr("Komro");
		serialNumber = p1.getSerialNr("Alb123"); 
		System.out.println(serialNumber);

	}

}
