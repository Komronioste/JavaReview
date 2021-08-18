package com.neotech.review06;

public class Doctor {
	// OOP - Object oriented programming
	// 1. Inheritance
	// 2. Polymorphism
	// 3. Abstraction
	// 4. Encapsulation
	
	String name;
	int salary;
	String licenseId;
	
	Doctor() 
	{
	
	}
	
	Doctor (String name, int salary, String licenseId) {
		this.name = name;
		this.salary = salary;
		this.licenseId = licenseId;
			}
	public void checkUp(String patientName) {
		System.out.println("Doctor " + name + " makes a checkup on " + patientName);
	}

}
