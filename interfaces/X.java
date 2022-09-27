package com.uttara.interfaces;

public class X {

	int a = 10;
	static int b = 15;
	{
		System.out.println("instance initializer 1 a = "+a);
		a = 20;
	}
	{
		System.out.println("instance initializer 2 a = "+a);
		a = 30;
	}
	public X(int x)
	{
		a = x;
		System.out.println("in constructor of X a = "+a);
	}
}
