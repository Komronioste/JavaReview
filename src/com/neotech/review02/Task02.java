package com.neotech.review02;

public class Task02 {

	public static void main(String[] args) {

		int evensum = 0;
		int oddsum = 0;

		for (int num = 1; num <= 50; num++)

		{
			if (num % 2 == 0) {
				evensum += num;
			}

			else {
				oddsum += num;
			}

		}
		System.out.println("sum of all even numbers: " + evensum);
		System.out.println("sum of all od numbers: " + oddsum);
		System.out.println("Sum of all numbers: " + (oddsum + evensum));
	
	}
}
