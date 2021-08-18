package com.neotech.review01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		//make calculator
		
		//ctrl+shift+o  will import the class
		
		
		Scanner scan = new Scanner (System.in); 
		
		System.out.println("Please enter your first number");
		
		double num1, num2;
		
		 num1 = scan.nextDouble();
		
		 System.out.println("Please enter the second number");
		 
		 num2 = scan.nextDouble();
		 
		 System.out.println("Please enter an operator: +   -   *  /");
		 
		 String operator = scan.next();
		 
		 double result = 0;                     // have to declare and assign result beforehand
		 
		 if (operator.equals("+"))
			 
		 {
			// System.out.println(num1 + num2);
			 result = num1+num2;
		 }
		
		 else if (operator.equals("-"))           // for String we use .equals("") instead of ==
		 {
			// System.out.println(num1-num2);
			 result = num1-num2;
		 }
		 
		 else if (operator.equals("/"))
		 {
			// System.out.println(num1/num2);
			 result = num1 / num2;
		 }
		 else if (operator.equals("*"))
		 {
			// System.out.println(num1*num2);
			 result = num1*num2;
		 }
		 
		 else { System.out.println("invalid input");
		 }
		 
		 if (operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*"))
		 {
		 System.out.println("The result is " + result);
		 }
			
	}
	
	
	
}
