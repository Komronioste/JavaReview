package com.neotech.review06;


// Doctor is parent/base/super class
// Dermotologist is the child/derived/sub class

public class Dermotologist extends Doctor{
	
	String dermId;
	
	public Dermotologist()
	{
		
	}
	
	Dermotologist(String name, int salary, String licenseId)
	{
		 // we also can use this. or super. keyword, since Dermatologist has variable name, salary etc
		super(name, salary, licenseId);
		
		//we use super constructor, just not to repeat code since its already done in parent constructor
	}
	
	Dermotologist(String name, int salary, String licenseId, String dermId) {
		this(name, salary, licenseId);
		this.dermId = dermId;
	}

	
	public void applySkinTreatment ()
	{
		System.out.println("Doctor " + name + " applies skin treatment");
	}

}
