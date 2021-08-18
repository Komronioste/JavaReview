package com.neotech.review02;

public class DoWhileDemo {

	public static void main(String[] args) {


		
		int age =1;
		
		while (age<=10)
		{System.out.println("Happy Birthday. You are " + age + " years old!");
		
		age++;
		}
		
		
		System.out.println("Now you are too big, no more birthdays!");  // this will run after the loop is completely done.
		
		
		
		System.out.println();
		
		boolean happy = false;
		
		while (happy) 
		{
		System.out.println("bye-while");   // this will not print since condition is false
		}
	
	
	do {
		System.out.println("bye-do while");  //will print, because it prints before checking the condition.
	} while (happy);
	
	

	
	for (int bday = 1; bday<=20; bday++)
	{
		
		
		if (bday==13) {continue;}   // will skip 13
		System.out.println("Happy Birthday" + bday);
	}
	
	
	
	
	}

	
}
