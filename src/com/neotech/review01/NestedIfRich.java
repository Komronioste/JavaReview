package com.neotech.review01;

import java.util.Scanner;

public class NestedIfRich {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		String gender;
		Boolean wallet;
		
		
		System.out.println("Please enter your gender (boy/girl");
		gender = scan.next();
		
		System.out.println("Please type if you are rich or poor (true/false");
		wallet = scan.nextBoolean();
		
		if (gender.equalsIgnoreCase("boy"))                 // .equalsIgnoreCase receives input and doesnt care about casing boy or Boy or BOY
		{ 
			if (wallet)
			{System.out.println("Buy a Ferrari"); }
			
			else { 
				System.out.println("Play soccer");
			}
		}
		
		else if (gender.equalsIgnoreCase("girl"))
		{ if (wallet )
		{System.out.println("Play LV bag");}
		else {System.out.println("Read a book");}
		
		}
		
		else {System.out.println("invalid gender");
	}

}
}

