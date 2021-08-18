package com.neotech.Review08.Abstract;

public abstract class Human {
	
	String name;
	static final String planet = "World";
	
	public Human(String name) {
		
		this.name = name;
	}
	
	public abstract void talk();
	
	public void sleep() {
		
		System.out.println("All human sleep the same");
	}
	

}
