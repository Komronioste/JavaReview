package com.neotech.review06;

public class HospitalApplication {

	public static void main(String[] args) {
		
		
		Doctor d1 = new Doctor("John", 120000, "D1234");
		d1.checkUp("Burak");

		Dermotologist d2 = new Dermotologist();
		d2.name = "Okan";
		d2.salary = 200000;
		d2.licenseId = "D789";
		d2.dermId = "XYZ";
		
		d2.checkUp("Eric");
		d2.applySkinTreatment();
		
		Dermotologist d3 = new Dermotologist("Hakan", 185000, "D007");
		d3.applySkinTreatment();
		
		
		Dermotologist d4 = new Dermotologist("Enes", 300000, "D297", "PFG");
		
		
	}

}
