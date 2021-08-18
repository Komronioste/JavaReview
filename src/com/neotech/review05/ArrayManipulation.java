package com.neotech.review05;

public class ArrayManipulation {

	public static void main(String[] args) {
		
		
		int[] array = {5,2,7,1,9,6};
		
		ArrayManipulation manip = new ArrayManipulation();
	int result = manip.largest(array);
		
		System.out.println("Initia values of the array");
		
		for (int i:array)
		{
			System.out.print(i + " ");
		}
		
		System.out.println("\nThe largest element in the array is: " + result);

	}
	
	int largest(int[] arr)
	{
		int largest = arr[0];
		for (int el :arr) {
			if (el>largest)
			{
				largest=el;
			}
				
		}
		return largest;
	}

}
