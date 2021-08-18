package com.neotech.review04;

public class StringManipulations {

	public static void main(String[] args) {
	
		
		String str = "Pershendetje";
		
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str); //The original string has not changed
		
		boolean equal = str.equals("pershendetje");
		System.out.println(equal);
		System.out.println(str.equalsIgnoreCase("pershendetje"));
		
		System.out.println("-------------------------");
		
		System.out.println(str.contains("sh"));
		
		System.out.println(str.contains("SH".toLowerCase()));
		
		boolean starts = str.startsWith("p");
		System.out.println(starts);
		str.startsWith("Per");
		
		boolean ends = str.endsWith("Pershendetje");
		System.out.println(ends);
		
		System.out.println("-------------------------");
		
		String str2 = "Hello" + " " + "World";
		System.out.println(str2);
		
		String str3 = "Hello".concat(" ").concat("World!").toLowerCase(); //will print everything in lower case.
		System.out.println(str3);
		
		String str5 = "     Hello World     ";
		System.out.println(str5.trim().length());
		
		String str6 = "Hi there";
		char letter = str6.charAt(5);
		System.out.println(letter);
		
		System.out.println(str6.indexOf('h'));
		System.out.println(str6.indexOf("e", 6));  // Overloaded methods = methods with the same name
		

	}

}
