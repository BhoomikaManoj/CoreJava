
package com.uttara.CollectionsProblems;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("India", "New Delhi");
		map.put("Earth", "planet");
		map.put("moon", "Satellite");
		
		System.out.println("get key value: "+map.get("Earth"));
		System.out.println("using value get keys"+map.values());
		System.out.println("Remove Element :"+map.remove("moon"));
		System.out.println("using value get keys"+map.values());
		
		System.out.println("Entry Set: It display to get set view: \n"+map.entrySet());
		
		System.out.println("Add map to set");
		Set<Entry<String, String>> s = map.entrySet();
		
		for(Entry e : s)
		{
			System.out.println("key : " +e.getKey()+"Value : "+e.getValue());
		}
		
		System.out.println("Enter Serach key");
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.nextLine();
		System.out.println("search ouput in keys = "+map.containsKey(str)+" "+(map.containsKey(str)?map.get(str):null));
		
		System.out.println("enter petname to search");
		str = sc1.nextLine();
		
		System.out.println("searching in petnames = "+map.containsValue(str));
		
		System.out.println("Give input of part name to search");
		str = sc1.nextLine();
		
		Set<Entry<String,String>> en = map.entrySet();
		for(Entry<String,String> e : en)
		{
			String name = e.getKey();
			String pn = e.getValue();
		
			if(name.contains(str))
				System.out.println("Match found "+name + " "+pn);
		}
		
		Set<String> names = map.keySet();
		Collection<String> petNames = map.values();
		

	}

}
