package com.neotech.review02;

public class Hotel {

	public static void main(String[] args) {
		// Hotel has 4 floors
		// every floor has 6 rooms
		//floor 1 is : 1.1, 1.2, 1.3, 1.4, 1.5, 1.6
		//Print all the room numbers
		
		for ( int floor = 1; floor<=4; floor++)
		{
			System.out.println("Floor>> " + floor);
			
			
		for (int room =1; room <=6; room++)	  //system will print floor one then all the rooms there, then floor 2 and all rooms there...
			
		{
			System.out.print(floor + "." + room + " ");
		}
			System.out.println();  // need this to go to next line after one full iteration of outer loop.
		}
		
		
		
		
	}

}
