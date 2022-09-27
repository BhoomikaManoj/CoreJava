package com.uttara.collections.lab1;

public class Person {

	String name;
	int height;
	
	public Person(String name,int height)
	{
		this.name = name;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Person)
		{
			Person p = (Person) obj;
			if(this.name.equals(p.name) && this.height == p.height)
				return true;
			else
				return false;
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}
	
}
class TestPerson{
	
	
	public static void main(String[] args)
	{
		Person p1 = new Person("Bhoomi",20);
		Person p2 = new Person("Bhoomi",20);
		System.out.println("identity check = "+(p1 == p2));
		System.out.println("equality = "+(p1.equals(p2)));
		System.out.println(p1);
		System.out.println(p2);
	}
}