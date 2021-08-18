package com.neotech.Review08.Interfaces;

public class FruitDemo {

	public static void main(String[] args) {


		
		Apple a = new Apple("Yellow");

		a.wash();
		a.peel();
		
		Coconut c = new Coconut("Brown");
		
		c.crack();
	
		Fruit f = new Apple("Red"); //upcasting
		
		if (f instanceof Apple) {
			Apple apple = (Apple) f;
			apple.wash();
			apple.peel();
		}
		else if (f instanceof Coconut) {
				Coconut coco = (Coconut) f;
		}
		
		Orange o = new Orange("Orange");
		o.peel();
		
		Peelable p1 = new Apple("Green");
		Peelable p2 = new Orange("Orange");
		// We can call only peel() method
		p1.peel();
		
		
		
	}

}
