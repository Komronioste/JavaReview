package com.neotech.Review10;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Person {

	String name;
	int age, salary;
	
	Person(String name, int age, int salary)
	{
		this.name = name;
		this.age = age;
		this.salary=salary;
	}
	
	void displayInfo() {
		System.out.println("Name: " + name + " age: " + age + " salary: " + salary);
	}
	
	public String toString() {
		return name;
	}
	
	
	public static void main(String[] args) {
		
		Map<Integer, Person> map = new LinkedHashMap<>();
		
		Person p1 = new Person("Enes", 30, 90000);
		
		map.put(2, p1);
		map.put(3, new Person("Flori", 40, 98000));
		map.put(1,  new Person("Shodmon", 28, 100000));

		System.out.println(map);
		
		Set<Entry<Integer,Person>> set = map.entrySet();
		
		for (Entry<Integer,Person> entry : set)
		{
			Integer i = entry.getKey();
			Person p = entry.getValue();
			p.displayInfo();
			System.out.println(p.toString());
		}
	}

}
