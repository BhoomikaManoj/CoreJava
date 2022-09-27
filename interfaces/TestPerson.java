package com.uttara.interfaces;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person("Earth", 25);
		System.out.println("Name = " + p.name + ",Age = " + p.age);

		Person p1 = new Person("Bhoomi", 27);
		System.out.println("Name = " + p1.name + ",Age = " + p1.age);

	}

}
