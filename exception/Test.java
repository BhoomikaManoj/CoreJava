package com.uttara.exception;

public class Test {
	public int m1() {
		int x = 10;
		try {
			System.out.println("in m1() x=" + x);
			return ++x;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("in catch of m1() " + e.getMessage());
			return ++x;
			
		} finally {
			System.out.println("in finally() of m1() x = " + x);
			return ++x;
		}
	}
}

class TestFinally
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		System.out.println(t.m1());

	}

}
