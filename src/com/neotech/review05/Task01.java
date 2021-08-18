package com.neotech.review05;

public class Task01 {

	public static void main(String[] args) {
		
		
		String longStr = "I am very happy today, because today is not Monday";
		
		char[] charArray = longStr.toCharArray();
		
		for (char letter : charArray) {
			if(letter == 'a')
			
				System.out.print('e');
			
			else 
				System.out.print(letter);
			
		}
System.out.println();
	}

}
