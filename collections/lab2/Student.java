package com.uttara.collections.lab2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
	
	String name;
	int id;
	int age;
	public Student(String name, int id, int age) {
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
		if (obj instanceof Student)
		{
			Student s = (Student) obj;
			if(Objects.equals(name, s.name) && id == s.id && this.age == s.age)
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
	
	public int compareTo(Student s)
	{
		if(this.age == s.age)
			return 0;
		else if(this.age > s.age)
			return 1;
		else
			return -1;
	}
	
}

class TestStudent
{
	public static void main(String[] args) {
	
		Student s1 = new Student("Bhoomi", 05, 25);
		Student s2 = new Student("Manu",10,29);
		Student s3 = new Student("Earth",04,24);
		Student s4 = new Student("Anamika",01,30);
		Student s5 = new Student("Bhoomi", 05, 25);
		
		System.out.println("Array List elements are ");
		Collection<Student> al = new ArrayList<Student>(); 
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		for(Student s : al)
			System.out.println(s);
		
		System.out.println("\n Hash Set Elements are ");
		Collection<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		Iterator<Student> it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("\n Linked Hash Set Elements are ");
		Collection<Student> lh = new LinkedHashSet<Student>();
		lh.add(s1);
		lh.add(s2);
		lh.add(s3);
		lh.add(s4);
		lh.add(s5);
		
		for(Student s : lh)
			System.out.println(s);
		
		System.out.println("\n TreeSet Elements are ");
		Collection<Student> ts = new TreeSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
		for(Student s : ts)
			System.out.println(s);
		
	}

}
