package com.uttara.collections.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class StudentComparators  {

	String name;
	int id;
	int age;

	public StudentComparators(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return (name + id + age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (Objects.equals(name, s.name) && id == s.id && this.age == s.age)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
}

class TestStudentComparator {
	public static void main(String[] args) {

		StudentComparators s1 = new StudentComparators("Bhoomi", 05, 25);
		StudentComparators s2 = new StudentComparators("Manu", 10, 29);
		StudentComparators s3 = new StudentComparators("Earth", 04, 24);
		StudentComparators s4 = new StudentComparators("Anamika", 01, 30);
		StudentComparators s5 = new StudentComparators("Bhoomi", 05, 25);

		System.out.println("\n Sort Student name TreeSet based on String length() using Comparator ");
		StudentNameComparator sc = new StudentNameComparator();
		Set ts = new TreeSet(sc);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);

		// it display unique string length()
		Iterator it = ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("\n Sort Student name [list] based on String length() using Comparator ");
		List l = new ArrayList();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		
//		System.out.println("\n Sorting based on natural order ");
//		Collections.sort(l);
//		System.out.println(l);
//		System.out.println("\n Sorting based on String Length using comparator ");
		StudentNameComparator sc1 = new StudentNameComparator();
		Collections.sort(l,sc1);
//		
//		for (int i = 0; i < l.size();i++) 	      
//	          System.out.println(l.get(i));
		
		Iterator it1 = ts.iterator();
		while(it1.hasNext())
			System.out.println(it1.next());

		
		System.out.println("\n Sort Student [TreeSet] based on ages in descending order using Comparator ");
		StudentAgeDescendingComparator sa = new StudentAgeDescendingComparator();
		Set ts1 = new TreeSet(sa);
		ts1.add(s1);
		ts1.add(s2);
		ts1.add(s3);
		ts1.add(s4);
		ts1.add(s5);
		
		Iterator it2 = ts1.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
		
		System.out.println("\n Sort Student [list] based on String length() using Comparator ");
		StudentAgeDescendingComparator sa1 = new StudentAgeDescendingComparator();
		List la = new ArrayList();
		la.add(s1);
		la.add(s2);
		la.add(s3);
		la.add(s4);
		la.add(s5);
		
		Collections.sort(la, sa1);
		Iterator it3 = ts1.iterator();
		while(it3.hasNext())
			System.out.println(it3.next());
	}

}
