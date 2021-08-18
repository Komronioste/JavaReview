package com.neotech.review04;

public class Methods {

	void sayWelcome() 
	{
		for (int i = 0; i <3; i++)
		{
			System.out.print("Welcome ");  //will print welcome 3 times when method is called
		}
		System.out.println();
	}
	
	void sayWelcomeWithNumber(int n)
	{
		for (int i = 0; i < n; i++) 
		{// will print welcome as many times as the parameter
			System.out.print("Welcome ");
		}
		System.out.println();
	}
	
	void sayGreeting(String greeting)
	{
		for (int i = 0; i < 3; i++)
		{
			System.out.print(greeting );
		}
		System.out.println();
	}
	
	void greet(String g, int h)
	{
		for (int i = 0; i < h; i++)
		{
			System.out.print(g );
		}
		
	}
	
	public static void main(String[] args) {
		
		Methods m = new Methods();
		m.sayWelcome();
		m.sayWelcomeWithNumber(10);
		m.sayGreeting("Hola ");
		m.greet("Privet ", 5);
	}
}
