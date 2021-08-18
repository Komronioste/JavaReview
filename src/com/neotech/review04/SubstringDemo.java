package com.neotech.review04;

public class SubstringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String longStr = "I am very happy today because it is not Monday";
		
		String anotherStr = longStr.substring(5, 7);  //5 is included, 7 excluded. will take string between 5 and 7.
		
		System.out.println(anotherStr);
		
		anotherStr = longStr.substring(5); // will take string starting with index 5.
		System.out.println(anotherStr);
		
		//longStr.subSequence(7, 5); // will give a run-time error.
		
//		longStr.substring(5, 100);
		System.out.println(longStr); // out of bound run-time error.
		
	//	System.out.println(longStr.substring(-1, 10)); // run-time error.
	}

}
