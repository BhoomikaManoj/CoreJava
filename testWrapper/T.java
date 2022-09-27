package com.uis.testWrapper;

public class T {
	static int val = 10;
	int p =40;
	
	public static void test()
	{
		System.out.println("val = "+val);
		T t1 = new T();
		System.out.println("P ="+t1.p); // cannot access non-static instance variable to static method without creating object
	}
}

class TestT {
	public static void main(String[] args) {
		
		System.out.println(T.val);
		T t = new T();
		System.out.println(t.val);
		t.test();
	}
}
