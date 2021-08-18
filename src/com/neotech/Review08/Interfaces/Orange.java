package com.neotech.Review08.Interfaces;

public class Orange extends Fruit implements Peelable{

	public Orange(String color) {
		super(color);
		
	}

	@Override
	public void peel() {
		
		System.out.println("Peeling the orange");
	}
	

}
