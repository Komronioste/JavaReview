package com.neotech.Review08.Abstract;

public class World {

	public static void main(String[] args) {
		
		
		Human h1 = new Albanian("Flori"); //upcasting
		
		h1.talk();
		h1.sleep();
	//	h1.albanianDance();  since its Human object, it cannot use this method. Need to downcast to use this method
		Albanian a1 = (Albanian)h1; //Down-casting
		a1.albanianDance(); // now since it's downcasted, we can use methods of Albanian
		
		
		Human h2 = new Turkish("Ivonne");
		
		h2.talk();
		h2.sleep();
		
		//cannot cast Albanian into Turkish or vice-versa
		
	}

}
