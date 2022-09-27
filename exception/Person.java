package com.uttara.exception;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.trim().equals(""))
			throw new IllegalArgumentException("Enter your name. name is not null");
		else
			this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0 || age > 100)
			throw new IllegalArgumentException("Is this person not born or is he already dead?");
		else
			this.age = age;
	}
}
class TestPerson{
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("  abcd  ");
		p1.setAge(30);
		System.out.println("Name = "+ p1.getName() +",Age  = "+p1.getAge());
		p1.setName(null);
		p1.setAge(-10);
	}

}
