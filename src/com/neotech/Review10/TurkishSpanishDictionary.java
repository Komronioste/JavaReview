package com.neotech.Review10;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TurkishSpanishDictionary {

	public static void main(String[] args) {


		Map<String, String> dictionary = new TreeMap<>();
		dictionary.put("ev", "casa");
		dictionary.put("kedi", "gato");
		dictionary.put("esek", "burro");
		dictionary.put("bayrak", "bandera");
		
		System.out.println("map ->" + dictionary);
		
		Set<String> turkishWords = dictionary.keySet();
		System.out.println("keys-> " + turkishWords);
		
		Collection<String> spanishWords = dictionary.values();
		System.out.println("values ->" + spanishWords);
		
		Set<Entry<String,String>> entries = dictionary.entrySet();
		System.out.println("entries -> " + entries);
		
		System.out.println();
		
		for (Entry<String,String> pair : entries) {
			
		
			String k = pair.getKey();
			String v = pair.getValue();
			System.out.println(k + " - > " + v);
			
		}
		
	}

}
