package com.uttara.exception;

public class Animal {
}

class Pig extends Animal {
}

class TestAnimal {
	public static void m1() {
		System.out.println("In m1()");
		m2();

	}

	public static void m2() {
		System.out.println("In m2()");
		Animal a = new Animal();
		m3(a);
		Pig p = new Pig();
		m3(p);
	}

	public static void m3(Animal a) {
		System.out.println("in m3()");
		if(a instanceof Pig)
		{
			System.out.println(a instanceof Pig);
			Pig p = (Pig) a;
		}
	}

	public static void main(String[] args) {
		try {
			m1();
		}
		catch(Throwable e) {
			System.out.println("Throwable Exception : "+e.getMessage());
			e.printStackTrace();
		}
	}

}
