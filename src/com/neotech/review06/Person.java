package com.neotech.review06;

public class Person {
	
	public String name;
	int age;
	protected int weight;
	
	Person() {}
	
	Person(String personName, int personWeight) {
		
		name = personName;
		weight = personWeight;
		
	}
	
	Person(String pName, int pWeight, int pAge) {
		
		this(pName, pWeight);    //
		age = pAge;
		
	}
	
	public void displayInfo ()
	{
		System.out.println("Name: " + name + " , weight: " + weight + ", age: " + age);
	}

}
