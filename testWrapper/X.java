package com.uis.testWrapper;

public class X {
	public void test(long number)
	{
		System.out.println("long Datatype number is "+number);
	}
	public void test(double number)
	{
		System.out.println("double number is "+number);
	}
	public void test(float number)
	{
		System.out.println("float number is "+number);
	}
}
class TestX{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();
		x.test(5);
		x.test(5l);
		x.test(5.5f);
		x.test(5.55);

	}

}
