package com.neotech.review03;

public class Array2DTaskLargest {

	public static void main(String[] args) {

		int[][] num = { { 2, 3, 5 }, { 2, 4 }, { 8 }, { 3, 5, 1,25 } };
		int largest = num[0][0];
		
		for (int i = 0; i < num.length; i++) 
		{
			for (int j = 0; j < num[i].length; j++)
		{
				if (largest < num[i][j])
				{
					largest = num[i][j];
				}

			}

		}

		System.out.println("largest: " + largest);

		int biggest = 0;
		System.out.println("------------------------------------");
		
		for ( int [] a : num )
		{
			for (int b : a)
			{
				if (b>biggest)
				{
					biggest = b;
				}
			}
		}
		System.out.println("biggest is: " + biggest);
	}

}
