package com.neotech.review04;

public class Baby {
	
	
	String name;
	int weight;
	char gender;
	String hairColor;
	
	void talk() 
	{
		System.out.println("Baby " + name + " is talking");
	}
	
	void cry()
	{
		System.out.println("Baby " + name + " is scrying");
	}
	
	void eat()
	{
		System.out.println("Baby " + name + " is eating");
	}

	void displayInfo()
	{
		System.out.println(name + " " + gender + " who weighs " + weight + " has " + hairColor + " hair color" );
	}
	
	void talking (String word, int times)
	{
		for (int i = 0; i < times; i++)
		{
			System.out.print(word + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		
		//Declaring and assigning a value
		
		Baby baby1 = new Baby();
		baby1.name = "James";
		baby1.weight = 6;
		baby1.hairColor = "brown";
		
		System.out.println("The name of baby1 is " + baby1.name);
		System.out.println("Hair color is " + baby1.hairColor);  // if not declared, will print null for hairColor.
		System.out.println(baby1.gender = 'M');   // can declare value of object inside sysout.
		System.out.println("Hair color is " + baby1.hairColor);
		
		System.out.println("---------------------------------------");
		
		Baby baby2;  //can create object in two steps v
		baby2 = new Baby();
		
		baby2.name = "Aisha";
		baby2.weight = 6;
		baby2.gender = 'F';
		baby2.hairColor = "black";
		
		System.out.println("the hair color of baby2 is " + baby2.hairColor);
	
		System.out.println("----------------------------------------");
		
		baby1.talk();
		baby2.cry();
		baby2.talk();
		baby1.displayInfo();
		baby1.talking("Hola", 5);
		baby2.talking("gugu", 5); // will print gugu 5 times thanx to our method's for loop.
		
	}

}
