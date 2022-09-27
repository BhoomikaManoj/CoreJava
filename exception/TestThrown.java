package com.uttara.exception;

public class TestThrown {

	public static void main(String[] args) {
		
		try {
			System.out.println("going to use throws");
			Exception e = new Exception();
			if (1 == 1)
				throw new IllegalArgumentException("throwing Exception");
			System.out.println("after throwing...");

		} catch (RuntimeException t) {
			System.out.println("catching throw : "+t.getMessage());
			t.printStackTrace();
		}
	}

}
