package com.neotech.review01;

public class TypeCasting {
	
	
	public static void main(String[] args) {
		
		
		int intNumber = 24;
		
		double d = intNumber;   // widening, implicitly, automatically
		
		
		System.out.println(intNumber);
		System.out.println(d);
		
		
		double a = 23/6;   // when in declaration you do calculation, it gets result in integer, no matter what the datatype is. will print 3.0
		double b = 23.0/6; // to get result with decimals, we have to have decimals in calculations. will print 3.833333
		
	System.out.println(a);
	System.out.println(b);
	
	
	byte byteNumber = (byte)intNumber;  // if trying to store small number from bigger container in a smaller, you should still indicate =(datatype) 
	
	System.out.println("byte "+byteNumber);
		
	intNumber = 2400;
	byteNumber = (byte) intNumber;
	System.out.println(byteNumber);
	
	//widening is done automatically
	//narrowing done manually
	
	}

}
