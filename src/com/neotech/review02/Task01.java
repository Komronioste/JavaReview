package com.neotech.review02;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a positive number to add it to total");
//
//		int sum = 0;
//		boolean input = true;
//
//		while (input)
//
//		{
//			int num = scan.nextInt();
//			sum += num;
//
//			if (num == -1) { System.out.println("Operation is over");
//				break;
//			}
//			System.out.println("the sum is: " +sum);
//			System.out.println("Enter another number to add to your sum");
//			System.out.println("Enter -1 to STOP");
//			
			////////////////////////////////////OR///////////////////////////
			
			
			int number =0;
			int total =0;
			
			do {
				System.out.println("Enter a number! To stop enter -1");
				number = scan.nextInt();
				if (number != -1) {
				total+=number; }
			} while (number!=-1);
			System.out.println("Total = " + total);
		}

	}


