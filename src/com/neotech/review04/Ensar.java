package com.neotech.review04;

public class Ensar {

	
	//A method with no parameters and no return type
	void addTwoNumbers()
	{
		int result = 3+4;
	}
	
	//A method with two parameters and NO return type
	void addTwoNumbersThatIGive(int num1, int num2)
	{
		int result = num1 + num2;
	}
	
	
	//A method with no parameters and WITH return type
	int addTwoNumbersAndGiveMeTheResult()
	{
		int result = 3+5;
		return result;
	}
	
	//A method with two parameters and With return type
	int addWithReturn(int a, int b)
	{
		int result = a + b;
		return result;
	}
					
	
	public static void main(String[] args) {
		
		Ensar a = new Ensar();
		a.addTwoNumbers();
		a.addTwoNumbersThatIGive(7, 10);
		int var1 = a.addTwoNumbersAndGiveMeTheResult();
		System.out.println(var1);
		int var2 = a.addWithReturn(12, 15);
		System.out.println(var2);
	}
}
