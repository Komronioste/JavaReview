package com.neotech.Review08.Abstract;

public class Turkish extends Human{

	public Turkish(String name) {
		super(name);
		
	}

	@Override
	public void talk() {
		
		System.out.println(name + " says Merhaba.");
		
	}

	public void makeBaklava( ) {
		
		System.out.println("I am making Baklava.");
	}
	
}
