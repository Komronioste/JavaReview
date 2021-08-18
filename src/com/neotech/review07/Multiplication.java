package com.neotech.review07;

public class Multiplication {

	
	
public static int multiply(int[] numbers) {
	
	int product = 1;
	
	for (int a : numbers)
		
		product = product * a;
	
	return product;
		
	}

public static void multiply2(int[] numbers) {
	
	int product = 1;
	
	for (int a : numbers)
		
		product = product * a;
	
	System.out.println(product);
		
	}

	
	
	
	
	public static void main(String[] args) {


		int[] array = {2,5,4,3};
		
		
		System.out.println(multiply(array));
		
		multiply2(array);

	}
	public static void main(int[] argss)
	{
		System.out.println("Hello");
	}

}
