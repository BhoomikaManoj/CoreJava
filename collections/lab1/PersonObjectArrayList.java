package com.uttara.collections.lab1;

import java.util.ArrayList;
import java.util.Collection;

public class PersonObjectArrayList {
	
	String name;
	int age;
	
	public PersonObjectArrayList(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonObjectArrayList [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		PersonObjectArrayList p1 = new PersonObjectArrayList("Bhoomi",25);
		PersonObjectArrayList p2 = new PersonObjectArrayList("Bhanu",35);
		PersonObjectArrayList p3 = new PersonObjectArrayList("Bhoomika",23);
		PersonObjectArrayList p4 = new PersonObjectArrayList("Earth",20);
		PersonObjectArrayList p5 = new PersonObjectArrayList("Dhathri",45);
		
		Collection<Object> coll1 = new ArrayList<Object>();
		coll1.add(p1);
		coll1.add(p2);
		coll1.add(p3);
		coll1.add(p4);
		coll1.add(p5);
		
		PersonObjectArrayList p11 = new PersonObjectArrayList("Bhoomi",25);
		PersonObjectArrayList p22 = new PersonObjectArrayList("Bhoomi",35);
		
		
		
	}

}
