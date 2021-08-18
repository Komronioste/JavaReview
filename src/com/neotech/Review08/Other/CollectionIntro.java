package com.neotech.Review08.Other;

import java.util.ArrayList;

public class CollectionIntro {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		boolean isEmp = numbers.isEmpty();
		System.out.println(isEmp);
		
		numbers.add(new Integer (7));
		numbers.add(5);
		numbers.add(8);
		numbers.add(1, 10); // adding at index 1

		isEmp = numbers.isEmpty();
		System.out.println(isEmp);
		
		System.out.println("Size is: " + numbers.size());
		
		System.out.println("How can I iterate the ArrayList?----------------------");
		System.out.println("First way, Normal for loop -----------------");
		
		for (int i = 0; i < numbers.size(); i++)
		{
			Integer num = numbers.get(i);
			System.out.println(num);
		}
		
		System.out.println("Second Way, enhanced for loop -----------------------------");
		
		for (Integer element : numbers)
			System.out.println(element);
		
		System.out.println(numbers);
	}

}
