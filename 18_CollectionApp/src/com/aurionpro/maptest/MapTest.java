package com.aurionpro.maptest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
//	Map is collection of the unique Entry.
//	key value pair of entry is given in the Map.
//	Where all the key are unique and value can be repeated.
//	each entry in Map is represented as Map.Entry interface.
//	to return the set of all the entries map.entrySet()
	public static void main(String[] args) {
		//one key can be null in hashmap
		System.out.println("\nHashMap ");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "chiarag");
		map.put(4, "Shirish");
		map.put(7, "Vinayak");
		
		System.out.println(map);
		
		System.out.println("\nLinkedHashMap");
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		
		map1.put(5, "chiarag");
		map1.put(4, "Shirish");
		map1.put(7, "Vinayak");
		
		System.out.println(map1);
		
		//No key should be null in treemap
		System.out.println("\nTreehMap");
		TreeMap<Integer, String> map2 = new TreeMap<Integer, String>();
		
		map2.put(5, "chiarag");
		map2.put(4, "Shirish");
		map2.put(7, "Vinayak");
		
		System.out.println(map2);
		
		System.out.println("\nIndividual Entry");
		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry<Integer, String> entry:entries) {
			System.out.println(entry.getKey() + "-" +entry.getValue());
		}
		
		
	}

}
