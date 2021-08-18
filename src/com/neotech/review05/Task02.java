package com.neotech.review05;

public class Task02 {
	
	public static void main(String[] args) {
		
		
	int[] array = {5,2,3,1,9,6};
	
		Task02 a = new Task02();
		
		int result = a.arraySum(array);
		
		
		System.out.println(result);
		
		double average = a.arrayAve(array);
		System.out.println("Average of the array is " + average);
		
		
	}
	
	 int arraySum (int[] arr)
	{
		 int sum = 0;
		 
		for (int i = 0; i < arr.length; i++)
		{
		sum += arr[i];	
		}
		return sum;
	}
	 
	 double arrayAve (int[] arr)
			 {
		 double sum = 0;
		 
		 for ( int i = 0; i < arr.length; i++)
		 {
			sum += arr[i]; 
		 }
		 return sum/arr.length;
			 }
	
	
	}
