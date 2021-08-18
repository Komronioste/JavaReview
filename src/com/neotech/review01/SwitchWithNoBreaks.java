package com.neotech.review01;

public class SwitchWithNoBreaks {

	
	public static void main(String[] args) {
		
		int num = 5;
		
		switch (num)
		{
		
		case 3:
			System.out.println("3");
			
		case 4: 
			System.out.println("4");
			
		case 5: 
			System.out.println("5");
			
		case 6:
			System.out.println("6");
			
		case 7:
			System.out.println("7");     // switch will go automatically go to 5, since there are no breaks it will print everything until a break
										// everything will be on new lines, since it is println
		}
		
		
		
		
		
		
		
	}
}
