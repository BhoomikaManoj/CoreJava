package com.uttara.interfaces;

public class TestA {

	public static void main(String[] args) {
				A obj = new A(10);
				System.out.println("P = "+ obj.p);
				System.out.println("R = "+A.R); // we can call constant variable using object or using class.constant
	}

}
