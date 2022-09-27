
package com.uttara.collections.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountryAndCapital{

	private LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
	private TreeMap<String, String> treeMap = new TreeMap<String, String>();
	private HashMap<String, String> hmap = new HashMap<String, String>();

	public void addCoutryAndCapital(String country, String capital) {
		linkedHashMap.put(country, capital);
		treeMap.put(country, capital);
		hmap.put(country, capital);
	}

	public void getCountryAndCapital() {
		System.out.println("Country and Capitals : ");
		for (String name : treeMap.keySet()) {
			String key = name;
			String value = treeMap.get(name);
			// System.out.println(((Object)value).getClass().getSimpleName()); //check
			// datatype of variable
			System.out.println(key + " " + value);
		}
		System.out.println("");
	}

	public boolean search(String country) {
		boolean flag = false;
		for (String map : treeMap.keySet()) {
			if (map.contains(country)) {
				flag = true;
				break;
			} else
				flag = false;
		}
		if (flag)
			return true;
		else
			return false;
	}

	public String[] sortedCountry() {
		if (treeMap.size() == 0)
			return null;

		String[] detail = new String[treeMap.size()];
		Set<String> set = treeMap.keySet();
		String value = "";
		int count = 0;
		for (String s : set) {
			detail[count] = s + " " + treeMap.get(s);
			count++;

		}

		return detail;
	}

	private static HashMap sortValues(HashMap map) {
		List list = new LinkedList(map.entrySet());
		
		// Custom Comparator
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});
		// copying the sorted list in HashMap to preserve the iteration order
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}
	
	public void sortCapitals()
	{
		Map<String, String> map = sortValues(hmap); 
	      System.out.println("Sorting based on capitals:");
	      Set set2 = map.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	           Map.Entry me2 = (Map.Entry)iterator2.next();
	           System.out.print(me2.getKey() + ": ");
	           System.out.println(me2.getValue());
	      }
	}
}
