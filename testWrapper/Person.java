package com.uis.testWrapper;

public class Person {

	private String name;
	private int age;
	static int count;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.trim().equals("") || name.length() < 30 )
			this.name = name;
		else 
			System.out.println("Enter your name and name of character lessthan 30");
			
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0 && age > 100)
			System.out.println("enter your age correctly");
		else
			this.age = age;
	}

	public Person() {
		//System.out.println("No-argument constructor");
		count++;
	}
	
	public Person(String name)
	{
		this.name = name;
		count++;
	}
	
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
		count++;
	}
}

class TestPorson {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(30);
		p.setName("abc");
		Person p1 = new Person("gunda");
		Person p2 = new Person("xyz",100);
		System.out.println(p1.getName()+","+p2.getName()+", "+p2.getAge());
		System.out.println("Total Number of Objects created = "+Person.count);
		for(int i=0;i<100;i++)
		{
			Person p4 = new Person();
			
		}
		System.out.println("Total Number of Objects created = "+Person.count);
	}

}
