package com.neotech.Review08.Interfaces;

public class Coconut extends Fruit implements Crackable {

	public Coconut(String color) {
		super(color);

	}

	@Override
	public void crack() {

		System.out.println("Cracking coconuts");
		
	}

}
