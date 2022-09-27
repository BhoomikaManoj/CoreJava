package com.uttara.interfaces;

public class Y extends X {
	
	int c = 15;
	static int d = 50;
	{
		System.out.println("instance initializer 1 c = "+c);
		c = 25;
	}
	{
		System.out.println("instance initializer 2 c = "+c);
		c = 35;
	}
	public Y(int y)
	{
		super(y);
		System.out.println("in constructor of Y c = "+c);
		c = y;
	}
}

class TestY {

	public static void main(String[] args) {
		
		X x = new X(20);
		System.out.println("A = "+x.a);
		System.out.println("B = "+X.b);


		Y y = new Y(99);
		System.out.println("C = "+y.c);
		System.out.println("C = "+Y.d);

	}

}
