package com.neotech.Review08.Abstract;

public class Albanian extends Human{

	public Albanian(String name) {
		super(name);
		
	}

	@Override
	public void talk() {
	
		//implementing talk method, previously abstract
		System.out.println(name + " says Pershendetje");
	}
	
	public void albanianDance() {
		
		System.out.println("Dancing Valle Kosovare");
	}
	
	

}
