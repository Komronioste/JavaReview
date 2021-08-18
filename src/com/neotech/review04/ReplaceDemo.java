package com.neotech.review04;

public class ReplaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String longStr = "I am very happy today because it is not Monday";
		
		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);
		
		anotherStr = longStr.replaceAll("today", "tomorrow");
		System.out.println(anotherStr);
		
		//Regular Expression - used to find letters, symbols, numbers, spaces.
		
		anotherStr = longStr.substring(5, 15).replaceAll("[a-j]", "*");
		System.out.println(anotherStr);
		
		String ssn = "598-695-8745";
		
		System.out.println("Lets removed dashes");
		
		String newSSN;
		newSSN = ssn.replaceAll("[^0-9]", "");
		System.out.println(newSSN);
		
		String ssn1;
		ssn1 = ssn.substring(0, 7).replaceAll("[0-9]", "*").concat(ssn.substring(7, 12));
		System.out.println(ssn1);
		
		boolean asd = ssn1.contains("[0-9]");
			System.out.println(asd);
			System.out.println(ssn1);
	}

}