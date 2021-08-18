package com.neotech.review03;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many numbers would you like to enter?");

		int num = scan.nextInt();

		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter next number");
			array[i] = scan.nextInt();

		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
			
		}
		
	int	sum=0;
		
		for (int a : array)
		{
			sum+=a;
		}
		System.out.println("sum is " + sum);
	}

}
