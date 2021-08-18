package com.neotech.review03;

public class Array2DIntro3 {

	public static void main(String[] args) {
		
		
		int[][] nums =
				{
				{8},
				{9,5,2},
				{6,4}
				};
		

		
		for ( int row = 0; row < nums.length; row++)
		{
			for (int col = 0; col < nums[row].length; col++)		// we need to specify that [ ].length has a counter, which is row
			{
				System.out.print(nums[row][col]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		for (int[] array : nums )
		{
			for ( int number : array)
			{
				System.out.print(number+ " ");
			}
			System.out.println();
		}
		
	}

}
