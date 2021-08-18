package com.neotech.review01;

import java.util.Scanner;

public class LogicalOperatorRichBoy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		

		String gender;
		Boolean rich;
		
		
		System.out.println("Please enter your gender (boy/girl)");
		gender = scan.next();
		
		System.out.println("Please type if you are rich or poor (true/false)");
		rich = scan.nextBoolean();
		
		if (gender.equalsIgnoreCase("boy") && rich)
		{ System.out.println("Buy a Ferrari");}
		
		else if (gender.equalsIgnoreCase("boy") && !rich)
		
		{System.out.println("Play Soccer");}
		
		else if (gender.equalsIgnoreCase("girl") && rich)
		{System.out.println("Buy a bag");}
		
		else if (gender.equalsIgnoreCase("girl") && !rich)
				{System.out.println("read a book");}
		
		else { System.out.println("Invalid choice"); }
		
	}

}
