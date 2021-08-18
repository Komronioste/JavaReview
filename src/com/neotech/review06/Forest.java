package com.neotech.review06;

public class Forest {

public static void main(String[] args) {
		
		Wolf wolf = new Wolf("Wolfito", 4);
		
		wolf.sleep();
		wolf.displayInfo();
		
		Fox fox = new Fox("Foxito", 4, "Orange");
		
		fox.displayInfo();
		fox.sleep();
		
		Bear bear = new Bear("Buritto", 2);
		
		bear.sleep();
		bear.displayInfo();
		bear.roar();
		
		
		
	}

}
