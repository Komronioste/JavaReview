package com.neotech.Review08.Other;

public class WrapperDemo {

	public static void main(String[] args) {
		
		
		int int1 = 9;
		Integer integer1 = new Integer(int1); //Boxing/Wrapping
		
		int int3 = integer1.intValue(); // Unboxing/UnWrapping
		
		
		//Easy way
		
		int int2 = 7;
		Integer integer2 = int2; //Auto Boxing, Auto Wrapping, Auto Converting
		int int4 = integer2; //Auto UnBoxing
		
		Boolean b1 = false;
		
		//Double Wrapper
		
		Double d1 = 4.2;
		
		System.out.println(integer1);
		
	}
	
	
}
