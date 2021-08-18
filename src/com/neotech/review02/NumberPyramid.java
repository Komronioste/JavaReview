package com.neotech.review02;

public class NumberPyramid {

	public static void main(String[] args) {
		
		
		//1111
		//2222
		//3333
		//4444
		
		
		for (int i = 1; i<=4; i++) 
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

		
		
		System.out.println("-------------------------------");
		
		//1111
		//222
		//33
		//4
		
		for ( int i = 1; i<=4; i++)
		{
			for (int j=4; j>=i; j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		for (int i = 4; i >=1; i--)															//4444
		{																					//3333		
			for (int j = 1; j<=4; j++)														//2222	
			{																				//1111	
				System.out.print(i);			
			}
			System.out.println();
		}
		
		
		
		System.out.println("----------------------");
		
		for (int i =4; i >=1; i--)									//4444
		{															//333	
			for (int j = 1; j<=i; j++)								//22
			{System.out.print(i); }									//1
			System.out.println();
		}
		
		
		
		
		
	}

}
