package com.uttara.exception;

public class MyException extends Exception {
	// what should be coded in this class?
	public MyException() {
	}

	public MyException(String msg)  {
		super(msg); // why do we do this?
	}
}

class TestException {
	public static void main(String[] args) {
		try {
			System.out.println("going to use throws");
			Exception e = new Exception();
			if (1 == 1)
				throw new MyException("This is my exception");
			System.out.println("after throwing...");

		} catch (RuntimeException t) {
			System.out.println("catching throw : " + t.getMessage());
			t.printStackTrace();
		} catch (MyException e) {
			System.out.println("custom Exception : " + e.getMessage());
			e.printStackTrace();
		}

	}

}
