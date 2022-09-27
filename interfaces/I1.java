package com.uttara.interfaces;

//A class implementation of a method takes precedence over a method. 
//So, if the class already has the same method as an Interface, 
//then the default method from the implemented Interface does not take effect.
//However, if two interfaces implement the same name method, then there is a conflict.

public interface I1 {
	public void m1();
}

interface I2
{
	public int m11();
	public void m2();
}

abstract class C1 implements I1, I2
{
	public void m1()
	{
		System.out.println("Interface I1, method m1()");
	}
	
	@Override
	public int m11() 
	{
		System.out.println("Interface I2, method m11() ");
		return 0;
	}
	public void m2()
	{
		System.out.println("Interface I2, method m2");
		
	}
}

abstract class A11 implements I2
{
	public void m1()
	{
		System.out.println("Interface I2, method m1()");
	}
}

class C2 extends A11
{
	@Override
	public int m11() {
		System.out.println("override method m11(), interface I2");
		return 0;
	}
	
	@Override
	public void m2() {
		System.out.println("override menthod m2, interface I2");
		
	}
}

class TestA11
{
	public static void main(String[] args) {
		C2 c = new C2();
		c.m1();
		c.m11();
		c.m2();
	}
}