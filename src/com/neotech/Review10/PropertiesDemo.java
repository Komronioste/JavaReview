package com.neotech.Review10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {


		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		String filePath = projectPath + "\\extra\\demo.properties";
		System.out.println(filePath);
		
		FileInputStream fileIS = new FileInputStream(filePath);
		Properties proper = new Properties();
		proper.load(fileIS);
		
		System.out.println(proper);
		
		//1st way to retrieve values
		Object lastName = proper.get("LastName");    // .get will retrieve an Object
		System.out.println(lastName);
		
		//2nd way to retrieve
		String firstName = proper.getProperty("FirstName");  //.getProperty will retrieve String or Object or int or double
		System.out.println(firstName);
		
		String age = proper.getProperty("Age");
		System.out.println(age);
		
		//Add more key->value pairs
		proper.setProperty("StudentNumber", "N123");
		System.out.println(proper);
		
		//Or I can re-assign value
		proper.setProperty("Age", "25");
		
		//Lets save to a new file
		String newPath = projectPath + "\\extra\\NewFile.txt";
		FileOutputStream fileOS = new FileOutputStream(newPath);
		System.out.println(newPath);
		proper.store(fileOS, "Comment Space");
		
	}

}
