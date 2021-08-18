package com.neotech.review03;

import java.util.Scanner;

public class Scanner2DArray_Example {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		
		
		System.out.println("Please enter number of arrays");
			int	row = scan.nextInt();
		System.out.println("How many numbers do you want to store in each array");
		 	int	col = scan.nextInt();
		String [][] names = new String [row][col];
		
		for ( int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				System.out.println("Please enter names");
			
				names[i][j] = scan.next() ;
			
			}
			
		}
		
		for (String[] a : names)
		{
			for (String b: a)
			{
				System.out.print( b + " ");
			}
			System.out.println();
		}	
	}

}
