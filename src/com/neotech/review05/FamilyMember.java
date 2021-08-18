package com.neotech.review05;

public class FamilyMember {

	
	String firstName;  //instance variable, belongs to the instance/object
	static String lastName; // static/class variable
	int age;  //instance variable, belongs to the instance/object
	
	 void printFullName()
	{
		System.out.println(firstName + " " + lastName);
	}
	 
	 static void printFamilyName() 
	 {
		 System.out.println(lastName);
	 }
	
	public static void main(String[] args) {
		
		FamilyMember.lastName = "James";
		
		FamilyMember.printFamilyName();
		
		FamilyMember member1 = new FamilyMember();
		member1.firstName = "Lebron";
		member1.age = 36;
		
		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Savannah";
		member2.age = 34;
		
		member1.printFullName();
		member2.printFullName();
		
		
		
		
	}
}
