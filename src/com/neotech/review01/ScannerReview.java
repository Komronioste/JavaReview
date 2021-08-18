package com.neotech.review01;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);   // ctrl+shift+O shortcut to import util/Scanner
		
//		System.out.println("Enter first name: ");            
//		
//		String fName = scan.next();                         // .next() reads until space
//		
//		System.out.println("Enter last name: ");
//		String lName = scan.next();
//		
//		System.out.println("Full name is: " + fName + " " + lName);
		
		System.out.println("-----------------------------------------");
		
		// .nextLine() reads the whole line until Enter
		
//		System.out.println("Enter first name: ");
//		String fName = scan.nextLine();
//		
//		System.out.println("Enter last name");
//		String lName = scan.nextLine();
//		
//		System.out.println(" Full name is: " + fName + " " + lName);
		
//		
//		System.out.println("Please enter an int, boolean and a double");
//		
//		int num = scan.nextInt();
//		boolean b = scan.nextBoolean();
//		double d = scan.nextDouble();
//		
//		System.out.println("What you entered was " + num + " " + b + " " + d);
				
		//----------------------
		
		System.out.println("Please enter a sentence");
		String str1 = scan.next();    // this will read first word until space
		String str2 = scan.next();    // this will read 2nd word until space
		String str3 = scan.nextLine();  //this will read the rest
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
