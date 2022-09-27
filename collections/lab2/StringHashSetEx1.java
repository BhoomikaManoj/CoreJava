package com.uttara.collections.lab2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class StringHashSetEx1 {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "def";
		String str3 = "abc";
		
		System.out.println("str1 == str2 : "+ (str1 == str2));
		System.out.println("str1.equals(str2) : "+ str1.equals(str3));
		System.out.println("Hashcode value for str1 : "+str1.hashCode());
		System.out.println("Hashcode value for str1 : "+str2.hashCode());
		System.out.println("Hashcode value for str1 : "+str3.hashCode());
		

		Collection<String> s = new HashSet<String>();
		
		s.add("shimoga");
		s.add("Bhadravathi");
		s.add("changiri");
		
		String str11 = new String("shimoga");
		s.add(str1);
		s.add("Bhadravathi");
		
		System.out.println(s);
		
		System.out.println("Using Hashcode : "+s.hashCode());
		
		Collection<String> s2 = new HashSet<String>();
		
		s2.add("shimoga");
		s2.add("Bhadravathi");
//		s2.add("changiri");
		
		System.out.println(s2);
		
		System.out.println("Using Hashcode : "+s2.hashCode());
		
		Collection<String> name = new TreeSet<String>();
		
		name.add("ramanna");
		name.add("ramanuja");
		name.add("rameshwara");
		name.add("shwara");
		name.add("someshwaraa");
		name.add("marirama");
		
		Iterator<String> it = name.iterator();
		while(it.hasNext())
		{
			String str = it.next();
			if(str.contains("rama"))
				System.out.println(str);
		}
	}

}
