package com.neotech.review03;

public class Array2DIntro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] nums = {
				{6,3,7},
				{2,4,9},
				{1,5,0},
				{8,6,2,}
		};
		
		for ( int [] row : nums)
		{
			for (int element: row)
			{
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
	}

}
