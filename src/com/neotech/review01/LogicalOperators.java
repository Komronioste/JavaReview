package com.neotech.review01;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your age");

		int age = scan.nextInt();

		String result = "";

		if (age >= 1 && age <= 3) {                      // using && is better for a range of numbers
			result = "baby";
		} else if (age == 4 || age == 5) {				// using || is better for individual values							
			result = "toddler";
		}

		else if (age >= 6 && age <= 12) {
			result = "kid";
		}

		else if (age >= 13 && age <= 19) {
			result = "teenager";
		}

		else if (age >= 20) {
			result = "adult";
		}
		
		else { result = "alien"; }
		
		System.out.println("You are an/a " + result);

		// ------------------------- OR ---------------------------------

	}

}
